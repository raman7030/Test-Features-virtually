package l;

/* JADX INFO: renamed from: l.᩹᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XEW */
/* JADX INFO: loaded from: classes2.dex */
public class C22499 extends AbstractC10051 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // l.InterfaceC9893
    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC10051, l.InterfaceC9893
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public Object clone() {
        return C20383.f65780;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC9893) && ((InterfaceC9893) obj).size() == 0;
    }

    private Object readResolve() {
        return C20383.f65780;
    }
}
