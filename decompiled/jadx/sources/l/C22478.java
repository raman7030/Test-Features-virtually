package l;

/* JADX INFO: renamed from: l.᩹ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC4X */
/* JADX INFO: loaded from: classes2.dex */
public class C22478 extends AbstractC12872 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC12872, l.InterfaceC9893
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ۧ */
    public final int mo21968(Object obj) {
        return 0;
    }

    public Object clone() {
        return C20362.f65732;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC9893) && ((InterfaceC9893) obj).size() == 0;
    }

    private Object readResolve() {
        return C20362.f65732;
    }
}
