package borrero.quesada.movies;

public class RegularPrice extends Price{
    @Override
    int getPrice() {
        return Movie.REGULAR;
    }
}
