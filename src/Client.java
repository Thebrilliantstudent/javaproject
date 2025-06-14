public class Client {
    int id ;
    String name ;
    String ville;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Client(String name, int id, String ville) {

        this.id = id;
        this.name = name;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Client c1;
        c1 = new Client("Mohammed",1,"Rabat");
        System.out.println(c1);
    }
}
