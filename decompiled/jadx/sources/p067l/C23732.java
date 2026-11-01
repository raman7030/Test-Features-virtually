package p067l;

/* JADX INFO: renamed from: l.᩹ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC4X */
/* JADX INFO: loaded from: classes2.dex */
public class C23732 extends AbstractC14602 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC11771
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ۧ */
    public final int mo23939(Object obj) {
        return 0;
    }

    public Object clone() {
        return C21721.f68408;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC11771) && ((InterfaceC11771) obj).size() == 0;
    }

    private Object readResolve() {
        return C21721.f68408;
    }
}
