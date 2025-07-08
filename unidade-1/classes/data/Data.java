package classes.data;

class Data {
    private int dia;
    private int mes;
    private int ano;

    private boolean dataEhValida() {
        return (dia >  0 && dia <=31 && mes > 0 && mes <= 12 && ano >= 0);
    }

    public void inicializaData(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;

        if (!this.dataEhValida()) {
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    }

    public void getData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
}
