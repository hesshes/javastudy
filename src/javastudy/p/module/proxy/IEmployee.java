package javastudy.p.module.proxy;

public interface IEmployee {
    String getName();

    RESPONSIBILITY getGrade();

    String getInfo(IEmployee viewer);
}
