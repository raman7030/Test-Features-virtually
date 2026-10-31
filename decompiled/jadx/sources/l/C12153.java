package l;

import android.os.Build;

/* JADX INFO: renamed from: l.۫ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12153 extends AbstractC9098 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f36259 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14472 f36260;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29571(int... iArr) {
        this.f36259 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29570(C14472 c14472) {
        this.f36260 = c14472;
    }

    @Override // l.AbstractC9098
    /* JADX INFO: renamed from: ֫ */
    public final void mo18872(InterfaceC17564 interfaceC17564) {
        if (Build.VERSION.SDK_INT >= 34) {
            C2981.m9108(interfaceC17564.mo21994(), C2981.m9107(C12858.m31294(C2981.m9106(), null, 0, null, Boolean.FALSE), this.f36259, this.f36260));
        } else {
            C2981.m9108(interfaceC17564.mo21994(), C2981.m9107(C2981.m9106(), this.f36259, this.f36260));
        }
    }
}
