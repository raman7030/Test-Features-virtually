package l;

/* JADX INFO: renamed from: l.۫۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1C7F */
/* JADX INFO: loaded from: classes4.dex */
public class C12258 extends AbstractC18087 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13247(char c) {
        return false;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ۧ */
    public final Object mo13249(char c) {
        return null;
    }

    @Override // l.AbstractC18087, l.InterfaceC12963
    /* JADX INFO: renamed from: ܽ */
    public final Object mo25484() {
        return null;
    }

    public Object clone() {
        return C5908.f18135;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC9893) && ((InterfaceC9893) obj).size() == 0;
    }

    private Object readResolve() {
        return C5908.f18135;
    }
}
