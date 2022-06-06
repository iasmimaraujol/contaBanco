

class contaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private int saldoConta;
    private boolean statusConta;
    //! contrutor
    public contaBanco(String tipoC, String nameD, int saldoC){
        this.numConta = digitosConta();
        this.tipoConta = tipoC;
        this.donoConta = nameD;
        this.saldoConta = saldoC;
        this.statusConta = true;
    }
    //função para criar n. conta de forma randomica 
    public int digitosConta(){
        int num = (int)(1000*Math.random());
        return num;
    }
   
    //!acessores
 
    //!metodos
    //funçoes padrão de banco: abrir e fechar conta
    public void abrirConta(){
        if(this.statusConta == true){
            System.out.println("Usuario " + this.donoConta + " já possui uma conta neste banco!");
        }else{
            System.out.println("Usuario pode abrir conta neste banco");
        }
    }
    public void fecharConta(){
        if(this.saldoConta == 0){
            System.out.println("conta sendo deletada ...");
            this.statusConta = false;
            this.donoConta = "";
            this.numConta = 0;
            this.tipoConta = "";
            System.out.println("Conta deletada com sucesso");
        }
        if(this.saldoConta > 0){
            System.out.println("conta não pode se deletada, pois tem: " + this.saldoConta + "R$");
        }
        if(this.saldoConta == 0){
            System.out.println("conta não pode se deletada, pois tem um debito: " + this.saldoConta + "R$");
        }
    }
    
    //funções padrão de deposito e saque
    public void depositoConta(int valor){
        this.saldoConta += valor;
    }
    public void saqueConta(int valor){
        this.saldoConta -= valor;
    }

}
