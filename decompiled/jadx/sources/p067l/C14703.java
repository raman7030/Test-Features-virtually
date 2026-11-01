package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14703 extends AbstractC22751 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC21239 f41929;

    /* JADX INFO: renamed from: ᩶ */
    public final C16909 f41930;

    public C14703(int i, C16909 c16909, InterfaceC21239 interfaceC21239) {
        super(i, -1);
        this.f41929 = interfaceC21239;
        this.f41930 = c16909;
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.getClass();
        c5636.write(".restart local ", 0, 15);
        InterfaceC21239 interfaceC21239 = this.f41929;
        this.f41930.m38481(c5636, interfaceC21239.mo14222());
        String name = interfaceC21239.getName();
        String type = interfaceC21239.getType();
        String signature = interfaceC21239.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c5636.write("  # ", 0, 4);
        C5316.m11507(c5636, name, type, signature);
        return true;
    }
}
