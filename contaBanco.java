

class contaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private int saldoConta;
    private boolean statusConta;
    // contrutor
    public contaBanco(String tipoC, String nameD, int saldoC){
        this.numConta = digitosConta();
        this.tipoConta = tipoC;
        this.donoConta = nameD;
        this.saldoConta = saldoC;
        this.statusConta = true;
    }
    public int digitosConta(){
        int num = (int)(1000*Math.random());
        return num;
    }

    
}
