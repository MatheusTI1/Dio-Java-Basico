public class Formatador_Cep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(" o cep não corresponde as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
