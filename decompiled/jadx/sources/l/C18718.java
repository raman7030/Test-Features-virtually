package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18718 implements InterfaceC23483 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f59176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException f59177;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6723 f59178;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8134 f59179;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10957 f59180;

    public /* synthetic */ C18718(C8134 c8134, C10957 c10957, C6723 c6723, IOException iOException, boolean z) {
        this.f59179 = c8134;
        this.f59180 = c10957;
        this.f59178 = c6723;
        this.f59177 = iOException;
        this.f59176 = z;
    }

    @Override // l.InterfaceC23483
    public final void accept(Object obj) {
        InterfaceC15188 interfaceC15188 = (InterfaceC15188) obj;
        C8134 c8134 = this.f59179;
        interfaceC15188.mo21134(c8134.f25107, c8134.f25106, this.f59180, this.f59178, this.f59177, this.f59176);
    }
}
