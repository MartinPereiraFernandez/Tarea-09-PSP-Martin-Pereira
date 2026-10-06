
public class Descarga extends Thread {
    private String archivo;
    private int tiempoBloque;
    private long tiempoTotal;

    public Descarga(String archivo){
        this.archivo=archivo;
        this.tiempoBloque = 100 + (int)(Math.random()*401);
    }


    public void run(){
        long inicio=System.currentTimeMillis();//Se anota el momento de inicio para despues tener el tiempo total en ms.
        for (int i = 1;i<=10;i++) {
            try {
                Thread.sleep(tiempoBloque);
            } catch (InterruptedException e) {
                System.out.println("Erro co tempo");
            }
            tiempoTotal = System.currentTimeMillis()-inicio;
            System.out.println("[" + archivo + "] " + (i * 10) + "%");//i*10 para poder sacar el porcentaje.
            if (i == 10){
                System.out.println("Completada en "+tiempoTotal+" ms.");
            }
        }
    }

    public String getNombre(){
        return archivo;
    }

    public long getTiempoTotal(){
        return tiempoTotal;
    }
}
