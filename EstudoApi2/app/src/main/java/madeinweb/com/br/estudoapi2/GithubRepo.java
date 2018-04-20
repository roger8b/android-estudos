package madeinweb.com.br.estudoapi2;

public class GithubRepo {

    String name;
    String owner;
    String url;

    @Override
    public String toString() {
        return (name + " " + url);
    }

}
