package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18185 extends C22229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final Comparator f54280;

    public C18185(C19527 c19527) {
        super(c19527);
        this.f54280 = c19527.comparator();
    }

    @Override // p067l.C22229
    /* JADX INFO: renamed from: ֫ */
    public final C8817 mo31633(int i) {
        return new C12822(this.f54280);
    }
}
