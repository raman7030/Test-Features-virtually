package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11485 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f34293;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18090 f34294;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f34295 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f34296;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f34297;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f34298;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f34299;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f34300;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f34301;

    public C11485(C10738 c10738, C16560 c16560, List list, Runnable runnable) {
        this.f34297 = c10738;
        this.f34293 = c16560;
        this.f34299 = list;
        this.f34296 = runnable;
        this.f34301 = c10738.f51870.m36526(C4303.m12893(c10738.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22022 c22022 = new C22022(this.f34293.m39056());
        c22022.m49558(R.string.MT_Protector);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f34298 = c22022;
        if (this.f34299.size() == 1) {
            this.f34298.m49545();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        AbstractC15440 abstractC15440 = this.f34301;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        C10738 c10738 = this.f34297;
        C18090 c18090M42168 = C18090.m42168(C16999.m39866(c10738.m26937(), new String[0]), c10738.m26940());
        this.f34294 = c18090M42168;
        c18090M42168.m42192(c10738.m26938());
        List<C10211> list = this.f34299;
        int i = 0;
        for (C10211 c10211 : list) {
            if (this.f34298.m51053()) {
                return;
            }
            i++;
            this.f34298.m49553(0);
            this.f34298.m49552(i, list.size());
            this.f34298.m49556(c10211.m25626());
            String strM25626 = c10211.m25626();
            String strM25625 = c10211.m25625();
            boolean zM25621 = c10211.m25621();
            C3545 entry = c10738.f32357.getEntry(strM25625.substring(1) + strM25626);
            if (entry == null) {
                entry = zM25621 ? c10738.f32357.getEntry(strM25626) : null;
            }
            if (entry == null) {
                c10211.m25619();
            } else {
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(c10211.m25628());
                C22523.m50502(c10738.m26937(), this.f34294, entry, abstractC15440M36526, true, new C5840(this, entry));
                c10211.m25620(abstractC15440M36526);
                this.f34295.add(new C5977(abstractC15440M36526, c10211.m25626(), entry.getName()));
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f34298.m51053()) {
            this.f34301.mo23552();
        } else {
            this.f34300 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f34293.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f34301.mo23552();
        if (exc instanceof C3979) {
            C18090 c18090 = this.f34294;
            if (c18090 != null) {
                c18090.m42192((String) null);
            }
            this.f34297.f32357.m44389(null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C18090 c18090 = this.f34294;
        C10738 c10738 = this.f34297;
        if (c18090 != null) {
            c10738.f32357.m44389(this.f34294.m42208());
            C0349.m1793(this.f34294);
        }
        this.f34298.m51051();
        C15528.m36596();
        if (this.f34300) {
            c10738.m39735(this.f34295);
            try {
                this.f34296.run();
            } catch (Throwable th) {
                this.f34293.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
