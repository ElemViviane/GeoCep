public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf, int ddd){
    @Override
    public String toString() {
        return  "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Bairro: " + bairro + "\n" +
                "Localidade: " + localidade + "\n" +
                "UF: " + uf + "\n" +
                "DDD: " + ddd;
    }
}
