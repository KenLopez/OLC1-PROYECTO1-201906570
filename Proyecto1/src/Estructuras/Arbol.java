/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author khlop
 */
public class Arbol {
    private NodoArbol raiz;
    private String nombre;
    private ArrayList<Follow> follows;
    private ArrayList<Estado> estados;
    private ArrayList<String> terminales;
    private ArrayList<Estado> estadosAFN;
    
    public Arbol(String nombre, NodoArbol raiz){
        this.nombre = nombre;
        this.raiz = raiz;
        follows = new ArrayList<Follow>();
        estados = new ArrayList<Estado>();
        terminales = new ArrayList<String>();
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String followToHTML(){
        String html;
        html="<TABLE cellspacing=\"0\">\n"+
             "<TR>\n" +
"                <TD colspan=\"2\">Hoja</TD>\n" +
"                <TD>Siguientes</TD>\n" +
"            </TR>\n";
        for (int i=0; i<follows.size();i++){
            html+="<TR>\n";
            if(follows.get(i).getHoja().equals(" ")){
                html+="                <TD>\" \"</TD>\n";
            }else{
                html+="                <TD>"+follows.get(i).getHoja()+"</TD>\n";
            }
                html+="                <TD>     "+(i+1)+"     </TD>\n" +
"                <TD>"+follows.get(i).getFollow().toString()+"</TD>\n" +
"            </TR>\n";
        }
        html+="</TABLE>";
        return html;
    }
    
    public String transicionToHTML(){
        for(Follow follow:follows){
            if(!follow.getHoja().equals("#") && !exists(terminales,follow.getHoja())){
                terminales.add(follow.getHoja());
            }
        }
        String html;
        html="<TABLE cellspacing=\"0\">\n"+
             "<TR>\n" +
"                <TD rowspan=\"2\">Estado</TD>\n" +
"                <TD colspan=\""+terminales.size()+"\">Terminales</TD>\n" +
"            </TR>\n"+
             "<TR>\n";
        for(String terminal:terminales){
            if(terminal.equals(" ")){
                html+="<TD>\" \"</TD>\n";
            }else{
                html+="<TD>"+terminal+"</TD>\n";
            }
            
        }
        html+="</TR>\n";
        for(Estado estado:estados){
            html+="<TR>\n"
                    + "<TD>"+estado.getNombre()+estado.getContent().toString();
            if(estado.getContent().contains(follows.size())){
                html+="{ACEPTACION}";
            }
            html+="</TD>\n";
            for(int i=0; i <terminales.size();i++){
                html+="<TD>"+estado.getDestino(terminales.get(i))+"</TD>\n";
            }
            html+="</TR>";
        }
        html+="</TABLE>";
        return html;
    }
    
    public void graficar(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=Mrecord]");
            pw.println("concentrate=true");
            pw.println(raiz.getArbolTag());
            pw.println("}");
        }catch (Exception e){
            System.out.println("No se pudo generar el archivo...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void tablaSig(){
        this.getHojas(raiz);
        this.getFollow(raiz);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\SIGUIENTES_201906570\\SIG-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("a[shape=none label=<");
            pw.println(followToHTML());
            pw.println(">];");
            pw.println("}");
        }catch (Exception e){
            System.out.println("No se pudo generar la tabla de siguientes...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\SIGUIENTES_201906570\\SIG-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\SIGUIENTES_201906570\\SIG-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public void transiciones(){
        int counter = 0;
        estados.add(new Estado("S"+counter, raiz.getFirst()));
        counter++;
        int i = 0;
        while(i<estados.size()){
            for(int hoja:estados.get(i).getContent()){
                if(!estadoExists(follows.get(hoja-1).getFollow()) && follows.get(hoja-1).getFollow().size()>0){
                    estados.add(new Estado("S"+counter, follows.get(hoja-1).getFollow()));
                    counter++;
                }
                if(hoja!=follows.size()){
                    estados.get(i).getTransiciones().add(new Transicion(estados.get(i).getNombre(),follows.get(hoja-1).getHoja(), getDestino(follows.get(hoja-1).getFollow())));
                }
            }
            i++;
        }
    }
    
    public String getDestino(ArrayList<Integer> lista){
        for(Estado estado:estados){
            if(estado.getContent().equals(lista)){
                return estado.getNombre();
            }
        }
        return null;
    }
    
    public boolean estadoExists(ArrayList<Integer> lista){
        for(Estado estado:estados){
            if(estado.getContent().equals(lista)){
                return true;
            }
        }
        return false;
    }
    
    public void tablaTransiciones(){
        this.transiciones();
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\TRANSICIONES_201906570\\TRAN-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("a[shape=none label=<");
            pw.println(transicionToHTML());
            pw.println(">];");
            pw.println("}");
        }catch (Exception e){
            System.out.println("No se pudo generar la tabla de transiciones...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\TRANSICIONES_201906570\\TRAN-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\TRANSICIONES_201906570\\TRAN-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public boolean exists(ArrayList<String> lista, String dato){
        for(String elemento:lista){
            if(elemento.equals(dato)){
                return true;
            }
        }
        return false;
    }
    
    public void generarAFD(){
        String nodos="";
        String links="";
        String shape;
        String especial;
        ArrayList<String> group = new ArrayList<String>();
        int counter=0;
        links+="Inicio->"+estados.get(0).getNombre()+";\n";
        for(Estado estado:estados){
            if(estado.getContent().contains(follows.size())){
                shape="doublecircle";
            }else{
                shape="circle";
            }
            group.clear();
            for(Transicion transicion:estado.getTransiciones()){
                if(transicion.getTerminal().equals("\\n") || transicion.getTerminal().equals(""
                    + "\\\'")|| transicion.getTerminal().equals("\\\"") || transicion.getTerminal().equals("\\\\")){
                    especial="\\";
                }else if(transicion.getTerminal().equals(" ")){
                    especial="\\\" \\\"";
                }else{
                    especial="";
                }
                if(transicion.getDestino().equals(estado.getNombre())){
                    group.add(transicion.getTerminal());
                }else if(!transicion.getTerminal().equals("#")){
                    links+=estado.getNombre()+"->"+transicion.getDestino()+"[label=\""+especial+transicion.getTerminal()+"\"];\n";
                }
            }
            if(group.size()>1){
                String grupo="<";
                for(String item:group){
                    grupo+=item+"<br/>";
                }
                grupo+=">";
                nodos+="T"+counter+"[shape=none label="+grupo+"];\n";
                links+=estado.getNombre()+"->"+"T"+counter+"[dir=none];\n";
                links+="T"+counter+"->"+estado.getNombre()+";\n";
                links+= "{rank=same; "+"T"+counter+", "+estado.getNombre()+"}\n";
                counter++;
            }else if(group.size()==1){
                links+=estado.getNombre()+"->"+estado.getNombre()+"[label=\""+group.get(0)+"\"];\n";
            }
            nodos+=estado.getNombre()+"[shape="+shape+" label=\""+estado.getNombre()+"\"];\n";
        }
        nodos+="Inicio[shape=none label=\" \"]\n";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\AFD_201906570\\AFD-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=LR");
            pw.println(nodos);
            pw.println(links);
            pw.println("}");
        }catch (Exception e){
            System.out.println("No se pudo generar el AFD...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\AFD_201906570\\AFD-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\AFD_201906570\\AFD-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void generarAFN(){
        AFN afn = getAFN(this.raiz.getLs(), 0);
        String dot = "digraph G{\nnode[shape=circle];\n"+afn.getAceptacion()+
                "[shape=doublecircle];\n"+"rankdir=LR;\n"+
                "inicio[shape=none label=\"\"];\ninicio->"+afn.getInicio()+";";
        for(Transicion transicion:afn.getTransiciones()){
            dot+=transicion.getOrigen()+"->"+transicion.getDestino()+"[label="
                    + "\""+transicion.getTerminal()+"\"];\n";
        }
        dot+="}";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\AFND_201906570\\AFND-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println(dot);
        }catch (Exception e){
            System.out.println("No se pudo generar el AFND...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\AFND_201906570\\AFND-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\AFND_201906570\\AFND-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public AFN getAFN(NodoArbol raiz, int contador){
        ArrayList<Transicion> trans = new ArrayList<Transicion>();
        AFN izq, der;
        String fin="";
        String inicio = "S"+contador;
        if(raiz.isHoja()){
            String data="";
            if(raiz.getDato().equals(" ")){
                data = "\\\" \\\"";
            }else if(raiz.getDato().equals("\\n") || raiz.getDato().equals("\\'")){
                data="\\"+raiz.getDato();
            }else{
                data = raiz.getDato();
            }
            trans.add(new Transicion(inicio, data, "S"+(contador+1)));
            return new AFN(inicio, "S"+(contador+1), trans);
        }
        switch(raiz.getDato()){
            case "|":
                izq =getAFN(raiz.getLs(), contador+1);
                trans.add(new Transicion(inicio, "ε", izq.getInicio()));
                trans.addAll(izq.getTransiciones());
                der = getAFN(raiz.getRs(), izq.getFinal()+1);
                trans.add(new Transicion(inicio, "ε", der.getInicio()));
                trans.addAll(der.getTransiciones());
                fin = "S"+(der.getFinal()+1);
                trans.add(new Transicion(izq.getAceptacion(), "ε", fin));
                trans.add(new Transicion(der.getAceptacion(), "ε", fin));
                break;
            case ".":
                izq =getAFN(raiz.getLs(), contador);
                trans.addAll(izq.getTransiciones());
                der = getAFN(raiz.getRs(), izq.getFinal());
                trans.addAll(der.getTransiciones());
                fin = "S"+(der.getFinal());
                break;
            case "+":
                izq =getAFN(raiz.getLs(), contador+1);
                trans.add(new Transicion(inicio, "ε", izq.getInicio()));
                trans.addAll(izq.getTransiciones());
                trans.add(new Transicion(izq.getAceptacion(), "ε", izq.getInicio()));
                fin = "S"+(izq.getFinal()+1);
                trans.add(new Transicion(izq.getAceptacion(), "ε", fin));
                break;
            case "*":
                izq =getAFN(raiz.getLs(), contador+1);
                trans.add(new Transicion(inicio, "ε", izq.getInicio()));
                trans.addAll(izq.getTransiciones());
                trans.add(new Transicion(izq.getAceptacion(), "ε", izq.getInicio()));
                fin = "S"+(izq.getFinal()+1);
                trans.add(new Transicion(izq.getAceptacion(), "ε", fin));
                trans.add(new Transicion(inicio, "ε", fin));
                break;
            case "?":
                izq =getAFN(raiz.getLs(), contador+1);
                trans.add(new Transicion(inicio, "ε", izq.getInicio()));
                trans.addAll(izq.getTransiciones());
                fin = "S"+(izq.getFinal()+1);
                trans.add(new Transicion(izq.getAceptacion(), "ε", fin));
                trans.add(new Transicion(inicio, "ε", fin));
                break;
        }
        return new AFN(inicio, fin, trans);
    }
    
    public void getHojas(NodoArbol nodo){
        if(nodo.isHoja()){
            this.follows.add(new Follow(nodo.getDato()));
        }else{
            this.getHojas(nodo.getLs());
            if(nodo.getRs()!=null){
                this.getHojas(nodo.getRs());
            }
        }
    }
    
    public void getFollow(NodoArbol nodo){
        if(!nodo.isHoja()){
            getFollow(nodo.getLs());
            if(nodo.getRs()!=null){
                this.getFollow(nodo.getRs());
            }
            if(nodo.getDato().equals(".")){
                for(int i=0; i<nodo.getLs().getLast().size();i++){
                    for(int j=0;j<nodo.getRs().getFirst().size();j++){
                        follows.get(nodo.getLs().getLast().get(i)-1).getFollow().add(nodo.getRs().getFirst().get(j));
                    }
                }
            }else if(nodo.getDato().equals("+") || nodo.getDato().equals("*")){
                for(int i=0; i<nodo.getLs().getLast().size();i++){
                    for(int j=0;j<nodo.getLs().getFirst().size();j++){
                        follows.get(nodo.getLs().getLast().get(i)-1).getFollow().add(nodo.getLs().getFirst().get(j));
                    }
                }
            }
        }
    }
}
