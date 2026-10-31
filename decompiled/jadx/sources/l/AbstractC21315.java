package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21315 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC2614 f68703;

    public AbstractC21315() {
        this.f68703 = AbstractC2614.m8252();
    }

    public AbstractC21315(Iterable iterable) {
        this.f68703 = AbstractC2614.m8253(iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.f68703.mo8254(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21315 m48349(int i) {
        Iterable iterable = (Iterable) this.f68703.mo8254(this);
        iterable.getClass();
        C4025.m12109("limit is negative", i >= 0);
        return m48348(new C9588(iterable, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21315 m48350(InterfaceC16724 interfaceC16724) {
        return m48348(C8882.m22949((Iterable) this.f68703.mo8254(this), interfaceC16724));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC21315 m48348(Iterable iterable) {
        if (iterable instanceof AbstractC21315) {
            return (AbstractC21315) iterable;
        }
        return new C5086(iterable, iterable);
    }
}
