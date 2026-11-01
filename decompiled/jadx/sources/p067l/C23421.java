package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4KR */
/* JADX INFO: loaded from: classes.dex */
public final class C23421 extends AbstractC22751 {

    /* JADX INFO: renamed from: ۙ */
    public final C16909 f74619;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC16543 f74620;

    public C23421(int i, C16909 c16909, InterfaceC16543 interfaceC16543) {
        super(i, -1);
        this.f74620 = interfaceC16543;
        this.f74619 = c16909;
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.getClass();
        c5636.write(".end local ", 0, 11);
        InterfaceC16543 interfaceC16543 = this.f74620;
        this.f74619.m38481(c5636, interfaceC16543.mo25235());
        String name = interfaceC16543.getName();
        String type = interfaceC16543.getType();
        String signature = interfaceC16543.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c5636.write("  # ", 0, 4);
        C5316.m11507(c5636, name, type, signature);
        return true;
    }
}
