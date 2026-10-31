package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14525 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparator f44513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object[] f44514;

    public C14525(Comparator comparator, Object[] objArr) {
        this.f44513 = comparator;
        this.f44514 = objArr;
    }

    public Object readResolve() {
        C17348 c17348 = new C17348(this.f44513);
        c17348.m40671(this.f44514);
        return c17348.mo30595();
    }
}
