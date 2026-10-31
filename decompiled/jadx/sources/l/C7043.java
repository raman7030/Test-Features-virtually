package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7043 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f21702;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f21703;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f21704 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f21705;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10531 f21706;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f21707;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f21708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f21709;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f21710;

    public C7043(C9160 c9160, C16560 c16560, List list, Runnable runnable) {
        this.f21705 = c9160;
        this.f21703 = c16560;
        this.f21702 = list;
        this.f21708 = runnable;
        this.f21710 = c9160.f51870.m36526(C4303.m12893(c9160.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22022 c22022 = new C22022(this.f21703.m39056());
        c22022.m49558(R.string.MT_Protector);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f21707 = c22022;
        if (this.f21702.size() == 1) {
            this.f21707.m49545();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        AbstractC15440 abstractC15440 = this.f21710;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        C9160 c9160 = this.f21705;
        this.f21706 = C10531.m26448(C16999.m39866(c9160.m23568(), new String[0]));
        List<C10211> list = this.f21702;
        int i = 0;
        for (C10211 c10211 : list) {
            if (this.f21707.m51053()) {
                return;
            }
            i++;
            this.f21707.m49553(0);
            this.f21707.m49552(i, list.size());
            this.f21707.m49556(c10211.m25626());
            String strM25626 = c10211.m25626();
            String strM25625 = c10211.m25625();
            boolean zM25621 = c10211.m25621();
            C1358 entry = c9160.f27726.getEntry(strM25625.substring(1) + strM25626);
            if (entry == null) {
                entry = zM25621 ? c9160.f27726.getEntry(strM25626) : null;
            }
            if (entry == null) {
                c10211.m25619();
            } else {
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(c10211.m25628());
                C12498.m30669(this.f21706, entry, abstractC15440M36526, new C23976(this));
                c10211.m25620(abstractC15440M36526);
                this.f21704.add(new C5977(abstractC15440M36526, c10211.m25626(), entry.m4741()));
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f21707.m51053()) {
            this.f21710.mo23552();
        } else {
            this.f21709 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f21703.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f21710.mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C10531 c10531 = this.f21706;
        if (c10531 != null) {
            C0349.m1793(c10531);
        }
        this.f21707.m51051();
        C15528.m36596();
        if (this.f21709) {
            this.f21705.m39735(this.f21704);
            try {
                this.f21708.run();
            } catch (Throwable th) {
                this.f21703.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
