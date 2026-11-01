package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17975 implements InterfaceC15963 {

    /* JADX INFO: renamed from: ֫ */
    public final C19988 f53689;

    /* JADX INFO: renamed from: ۧ */
    public final C7247 f53690;

    public C17975(C7247 c7247, C19988 c19988) {
        this.f53690 = c7247;
        this.f53689 = c19988;
    }

    @Override // p067l.InterfaceC15963
    public final Iterator iterator() {
        return new C12612(this);
    }
}
