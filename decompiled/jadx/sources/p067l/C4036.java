package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes2.dex */
public class C4036 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public Object f8849;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC7257 f8850;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f8854 = false;

    /* JADX INFO: renamed from: ۗ */
    public C4036 f8848 = null;

    /* JADX INFO: renamed from: ۬ */
    public C4036 f8852 = null;

    /* JADX INFO: renamed from: ۫ */
    public C3626 f8851 = null;

    /* JADX INFO: renamed from: ᩹ */
    public C7650 f8855 = null;

    /* JADX INFO: renamed from: ᩶ */
    public C10471 f8853 = null;

    public C4036(AbstractC7257 abstractC7257, Object obj) {
        this.f8850 = abstractC7257;
        this.f8849 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m8087(AbstractC7257 abstractC7257, Object obj) {
        C4036 c4036 = new C4036(abstractC7257, obj);
        c4036.f8848 = this;
        c4036.f8852 = this.f8852;
        c4036.f8851 = this.f8851;
        c4036.f8855 = this.f8855;
        c4036.f8853 = this.f8853;
        return c4036;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Env[");
        sb.append(this.f8849);
        if (this.f8852 != null) {
            sb.append(",outer=");
            sb.append(this.f8852);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C9458 c9458 = new C9458();
        c9458.f25803 = this;
        return c9458;
    }
}
