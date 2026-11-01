package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 865M */
/* JADX INFO: loaded from: classes4.dex */
public final class C14033 extends AbstractC22751 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f39579;

    public C14033(int i, InterfaceC6486 interfaceC6486) {
        super(i, -3);
        this.f39579 = interfaceC6486.mo11944();
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.getClass();
        c5636.write(".source", 0, 7);
        String str = this.f39579;
        if (str == null) {
            return true;
        }
        c5636.write(" \"", 0, 2);
        C15693.m35744(c5636, str);
        c5636.write(34);
        return true;
    }
}
