package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9786 extends AbstractC6275 {

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f27029;

    public C9786(C7972 c7972) {
        super(c7972.m18456(256), c7972.m18456(256));
        this.f27029 = new ArrayList();
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ۠ */
    public final int mo4679() {
        return this.f27029.size();
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC5093 mo4678(int i) {
        return (C3949) this.f27029.get(i);
    }
}
