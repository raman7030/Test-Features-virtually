package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes.dex */
public final class C23018 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13845 f74092;

    public C23018(C13845 c13845) {
        this.f74092 = c13845;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f74092.f41285.f6276);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        C13845 c13845 = this.f74092;
        interfaceC13049Edit.putString("dex_backup_name", c13845.m31260()).apply();
        C1832 c1832 = c13845.f41285;
        c1832.f6275.m46434(c13845.m31260());
        c1832.f6273 = c1832.f6275.m46433();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C13845 c13845 = this.f74092;
        c13845.m31262();
        C1832 c1832 = c13845.f41285;
        c1832.f6277.notifyDataSetChanged();
        c1832.f6274.m1449();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f74092.f41285.f6276.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
