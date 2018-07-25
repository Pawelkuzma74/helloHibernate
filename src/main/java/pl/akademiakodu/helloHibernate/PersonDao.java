package pl.akademiakodu.helloHibernate;


public interface PersonDao<T,U> {
    T findById(U u);
}
