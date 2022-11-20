package borrero.quesada.movies;

class MovieBuilder {

    private String title;
    private int priceCode;

    MovieBuilder() {
        title = "movieName";
    }

    MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    Movie build() {
        return new Movie(title, priceCode);
    }

    public MovieBuilder regular(){
        this.priceCode = Movie.REGULAR;
        return this;
    }

    public MovieBuilder children(){
        this.priceCode = Movie.CHILDREN;
        return this;
    }

    public MovieBuilder newRelease(){
        this.priceCode = Movie.NEW_RELEASE;
        return this;
    }

}