package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23342 implements InterfaceC11797 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f73435;

    public /* synthetic */ C23342(int i) {
        this.f73435 = i;
    }

    @Override // p067l.InterfaceC11797
    public final AbstractC3947 create() {
        switch (this.f73435) {
            case 0:
                return new C13788("zip");
            default:
                C6851 c6851 = new C6851(R.string.MT_Protector, R.drawable.MT_Protector);
                c6851.m7834();
                return c6851;
        }
    }
}
