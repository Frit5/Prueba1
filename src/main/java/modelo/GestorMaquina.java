package modelo;

import java.util.LinkedList;

public class GestorMaquina {

    private static LinkedList<Maquina> maquinas;

    public GestorMaquina() {
        maquinas = new LinkedList<Maquina>();
    }

    public void RegistrarMaquinas(Maquina maquina) {
        maquinas.add(maquina);
    }

    public static LinkedList<Maquina> getMaquinabyParametro(int parametro, String valor) {

        LinkedList<Maquina> resultado = new LinkedList<Maquina>();
        

        for (Maquina maq : maquinas) {
            switch (parametro) {

                case 1:
                    if (maq.getCodigo().equals(valor)) {
                        resultado.add(maq);
                        break;
                   }
                    
                case 2:
                    if(maq.getNombre().equals(valor)){
                        resultado.add(maq);
                        break;
                    }
                    
                case 3:
                    if(maq.getMarca().equals(valor)){
                        resultado.add(maq);
                        break;
                    }
                    
                case 4:
                    if(maq.getProveedor().equals(valor)){
                        resultado.add(maq);
                        break;
                    }
                    
                case 5:
                    if(maq.getFechaAdquisicion().equals(valor)){
                        resultado.add(maq);
                        break;
                    }

            }

        }
        return null;

    }

}
