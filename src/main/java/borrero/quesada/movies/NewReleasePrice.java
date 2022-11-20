package borrero.quesada.movies;

public class NewReleasePrice extends Price{
    @Override
    int getPrice() {
        return Movie.NEW_RELEASE;
    }
}
