package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9286 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28127;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f28128;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28129 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28130;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8580 f28131;

    public C9286(C8580 c8580, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f28131 = c8580;
        this.f28130 = z;
        this.f28127 = z2;
        this.f28128 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f28131.f26212.m39056(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C11293 c11293M31569;
        C8580 c8580 = this.f28131;
        int iM1106 = c8580.f26210.m1106();
        int iM1104 = c8580.f26210.m1104();
        Iterator it = c8580.f26211.iterator();
        while (it.hasNext()) {
            C9555 c9555 = (C9555) ((InterfaceC17889) it.next());
            this.f23322.m31861(c9555.getName());
            if (c9555.m24436()) {
                throw new IOException("Unable to chown '" + c9555.getPath() + "': Unsupported operation");
            }
            String path = c9555.getPath();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(path, new String[0]);
            if ((abstractC15440M39866 instanceof C12993) && (c11293M31569 = ((C12993) abstractC15440M39866).m31569()) != null) {
                path = c11293M31569.mo23554();
            }
            C20402.m46725(path, iM1106, iM1104, this.f28130, this.f28127);
            c9555.m24429(c9555.mo24428().m38835(iM1106, iM1104));
            this.f28129 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f28128.run();
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f28129) {
            this.f28128.run();
        }
        this.f28131.f26212.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
