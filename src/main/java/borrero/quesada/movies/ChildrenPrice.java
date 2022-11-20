package borrero.quesada.movies;

public class ChildrenPrice extends Price{
    @Override
    int getPrice() {
        return Movie.CHILDREN;
    }
}
