package p067l;

/* JADX INFO: renamed from: l.᩹᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XEW */
/* JADX INFO: loaded from: classes2.dex */
public class C23752 extends AbstractC11921 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // p067l.InterfaceC11771
    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p067l.AbstractC11921, p067l.InterfaceC11771
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public Object clone() {
        return C21741.f68456;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC11771) && ((InterfaceC11771) obj).size() == 0;
    }

    private Object readResolve() {
        return C21741.f68456;
    }
}
