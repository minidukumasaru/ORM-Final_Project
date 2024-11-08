package lk.ijse.Dao;

import lk.ijse.Dao.Custom.Impl.CourseDaoImpl;
import lk.ijse.Dao.Custom.Impl.StudentDaoImpl;
import lk.ijse.Dao.Custom.Impl.UserDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;
    private DaoFactory() {}

    public static DaoFactory getDaoFactory() {
        return daoFactory == null ? daoFactory = new DaoFactory() : daoFactory;
    }
    public enum DaoType{
        USER,COURSE,STUDENT
    }
    public SuperDao getDaoType(DaoType daoType){
        switch (daoType){
            case USER:
                return new UserDaoImpl();
            case COURSE:
                return new CourseDaoImpl();
            case STUDENT:
                return new StudentDaoImpl();
            default:
                return null;
        }
    }
}
