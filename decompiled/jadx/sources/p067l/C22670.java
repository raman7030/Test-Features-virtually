package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes5.dex */
public final class C22670 implements InterfaceC15963 {

    /* JADX INFO: renamed from: ֫ */
    public final C15292 f71503;

    /* JADX INFO: renamed from: ۧ */
    public final String f71504;

    public C22670(String str, C15292 c15292) {
        this.f71504 = str;
        this.f71503 = c15292;
    }

    @Override // p067l.InterfaceC15963
    public final Iterator iterator() {
        return new C16633(this);
    }
}
