package javastudy.d.module;

//06
public class LayHolderSingleTon {

    private LayHolderSingleTon() {
    }

    // static ���� Ŭ������ �̿�
    // Holder�� �����, Ŭ������ �޸𸮿� �ε���� �ʰ� getInstance �޼��尡 ȣ��Ǿ�� �ε��
    private static class LayHolderSingleToneHolder {
        private static final LayHolderSingleTon INSTANCE = new LayHolderSingleTon();
    }

    public static LayHolderSingleTon getInstance() {
        return LayHolderSingleToneHolder.INSTANCE;
    }
}

/*
 * [Bill Pugh Solution (LazyHolder)]
 * 
 * ����Ǵ� �ΰ��� ����� �ϳ� ��Ƽ������ ȯ�濡�� �����ϰ� Lazy Loading(���߿� ��ü ����) �� ������ �Ϻ��� �̱��� ��� Ŭ����
 * �ȿ� ���� Ŭ����(holder)�� �ξ� JVM�� Ŭ���� �δ� ��Ŀ����� Ŭ������ �ε�Ǵ� ������ �̿��� ��� (������ ��������)
 * static �޼ҵ忡���� static ������� ȣ���� �� �ֱ� ������ ���� Ŭ������ static���� �����̹ۿ��� ���� Ŭ������ ġ������
 * �������� �޸� ���� ������ �ذ��ϱ� ���Ͽ� ���� Ŭ������ static���� ���� �ٸ� Ŭ���̾�Ʈ�� ���Ƿ� �̱����� �ı��� �� �ִٴ� ������
 * ���� (Reflection API, ����ȭ/������ȭ�� ����)
 * 
 * �켱 ����Ŭ������ static���� �����Ͽ��� ������, �̱��� Ŭ������ �ʱ�ȭ�Ǿ SingleInstanceHolder ���� Ŭ������
 * �޸𸮿� �ε���� ���� ��� ��⿡�� getInstance() �޼��带 ȣ���� ��, SingleInstanceHolder ���� Ŭ������
 * static ����� ������ �����ϰ� �Ǵµ�, �̶� ���� Ŭ������ �ѹ��� �ʱ�ȭ�Ǹ鼭 �̱��� ��ü�� ���ʷ� ���� �� �����ϰ� �ȴ�.
 * ���������� final �� ���������μ� �ٽ� ���� �Ҵ���� �ʵ��� �����Ѵ�.
 * 
 * ���� ���� �ڵ� �帧 ���Ͽ� ���� ���� ���� ����� ���̶��, JVM�� Class Loader�� Ŭ���� �ε� �� �ʱ�ȭ ������ ���� ��
 * �𸣴� ���̴�. �ڹ� �ڵ带 �����ϸ� Ŭ������ ��� ������� �ε�ǰ� �ʱ�ȭ �Ǵ���, �׸��� ���� Ŭ������ ���µ� �� ���� static
 * Ű���带 ���� ���� Ŭ�������� �ϴ���, �� ������ ���ؼ� ���� �˰� �ʹٸ� ���� �����õ��� �����ϱ� �ٶ���.
 * 
 * ��ó: https://inpa.tistory.com/entry/GOF- �̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */