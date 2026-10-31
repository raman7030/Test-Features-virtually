package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4513 extends AbstractC21447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0225 f14345 = new C0225(200);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14346;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4513 m13277(int i, InterfaceC21267 interfaceC21267) {
        C4513 c4513 = (C4513) f14345.m1479();
        if (c4513 != null) {
            c4513.f25384 = i;
            c4513.f14346 = interfaceC21267.getLineNumber();
        } else {
            c4513 = new C4513(i, -2);
            c4513.f14346 = interfaceC21267.getLineNumber();
        }
        if (interfaceC21267 instanceof C5199) {
            ((C5199) interfaceC21267).m14973();
        }
        return c4513;
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ܿ */
    public final void mo12088() {
        f14345.m1477(this);
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.getClass();
        c3438.write(".line ", 0, 6);
        c3438.m10513(this.f14346);
        return true;
    }
}
