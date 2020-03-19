class ProcesorNou extends Procesor{
    private int nr;
    public ProcesorNou(int nr){this.nr=nr;}

    @Override public int proceseaza(ArrayList<Document> documente) {
        System.out.print("Acest procesor este doar demonstrativ si nu face nimic");
        return nr;
    }
}