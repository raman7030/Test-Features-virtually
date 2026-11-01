package p067l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16173 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparator f47619;

    /* JADX INFO: renamed from: ᩹ */
    public final Object[] f47620;

    public C16173(Comparator comparator, Object[] objArr) {
        this.f47619 = comparator;
        this.f47620 = objArr;
    }

    public Object readResolve() {
        C18856 c18856 = new C18856(this.f47619);
        c18856.m42923(this.f47620);
        return c18856.mo32660();
    }
}
