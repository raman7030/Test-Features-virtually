package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7804 extends AbstractC4110 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f24112;

    public C7804(C5896 c5896) {
        super(c5896.m16530(256), c5896.m16530(256));
        this.f24112 = new ArrayList();
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ۠ */
    public final int mo2311() {
        return this.f24112.size();
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2866 mo2310(int i) {
        return (C1663) this.f24112.get(i);
    }
}
