package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20158 implements InterfaceC24686 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ boolean f62400;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ IOException f62401;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C8758 f62402;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10099 f62403;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12782 f62404;

    public /* synthetic */ C20158(C10099 c10099, C12782 c12782, C8758 c8758, IOException iOException, boolean z) {
        this.f62403 = c10099;
        this.f62404 = c12782;
        this.f62402 = c8758;
        this.f62401 = iOException;
        this.f62400 = z;
    }

    @Override // p067l.InterfaceC24686
    public final void accept(Object obj) {
        InterfaceC16803 interfaceC16803 = (InterfaceC16803) obj;
        C10099 c10099 = this.f62403;
        interfaceC16803.mo23099(c10099.f28020, c10099.f28019, this.f62404, this.f62402, this.f62401, this.f62400);
    }
}
