package borrero.quesada.movies;

class MovieBuilder {

    private String title;
    private Price price;

    MovieBuilder() {
        title = "movieName";
    }

    MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    Movie build() {
        return new Movie(title, price);
    }

    public MovieBuilder regular(){
        this.price = new RegularPrice();
        return this;
    }

    public MovieBuilder children(){
        this.price = new ChildrenPrice();
        return this;
    }

    public MovieBuilder newRelease(){
        this.price = new NewReleasePrice();
        return this;
    }

}