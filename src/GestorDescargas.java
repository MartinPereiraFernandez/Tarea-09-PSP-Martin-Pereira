public class GestorDescargas {
    public static void main(String args[]) {
        String[] archivos={"cuarzos.png","meditacion.mp4","mantras.mp3","horoscopo.pdf"};
        long inicio=System.currentTimeMillis();

        Descarga descarga0 = new Descarga(archivos[0]);
        descarga0.setName(descarga0.getNombre());

        Descarga descarga1 = new Descarga(archivos[1]);
        descarga1.setName(descarga1.getNombre());

        Descarga descarga2 = new Descarga(archivos[2]);
        descarga2.setName(descarga2.getNombre());

        Descarga descarga3 = new Descarga(archivos[3]);
        descarga3.setName(descarga3.getNombre());

        try {
            descarga0.start();
            descarga0.join();
            descarga1.start();
            descarga1.join();
            descarga2.start();
            descarga2.join();
            descarga3.start();
            descarga3.join();
        } catch (InterruptedException e){
            System.out.println("Erro coas descargas");
        }
        long tiempoReal = System.currentTimeMillis()-inicio;
        System.out.println("Todas las descargas han terminado");
        System.out.println("Tiempo real: "+tiempoReal+" ms");
        System.out.println("Si se hubiesen descargado una detras de otra: "+(descarga0.getTiempoTotal()+descarga1.getTiempoTotal()+ descarga2.getTiempoTotal()+ descarga3.getTiempoTotal())+" ms");
    }
}
