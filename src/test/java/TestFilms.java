import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmManager;
import ru.netology.domain.Films;

public class TestFilms {

    @Test
    public void ShouldTestFilmsAdd() {
        FilmManager manager = new FilmManager(5);
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestFilmsEmpty() {
        FilmManager manager = new FilmManager(5);
        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastMoreMax() {
        FilmManager manager = new FilmManager();
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");
        Films sixth = new Films("Шрек Навсегда");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{sixth, fifth, fourth, third, second};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParam() {
        FilmManager manager = new FilmManager(6);
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");
        Films sixth = new Films("Шрек Навсегда");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParamFilmsLeight() {
        FilmManager manager = new FilmManager();
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

}
