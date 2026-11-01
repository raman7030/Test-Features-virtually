package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22626 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC4853 f71394;

    public AbstractC22626() {
        this.f71394 = AbstractC4853.m10296();
    }

    public AbstractC22626(Iterable iterable) {
        this.f71394 = AbstractC4853.m10297(iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.f71394.mo10298(this)).iterator();
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

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22626 m50684(int i) {
        Iterable iterable = (Iterable) this.f71394.mo10298(this);
        iterable.getClass();
        C6194.m14029("limit is negative", i >= 0);
        return m50683(new C11481(iterable, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22626 m50685(InterfaceC18263 interfaceC18263) {
        return m50683(C10810.m24920((Iterable) this.f71394.mo10298(this), interfaceC18263));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC22626 m50683(Iterable iterable) {
        if (iterable instanceof AbstractC22626) {
            return (AbstractC22626) iterable;
        }
        return new C7202(iterable, iterable);
    }
}
