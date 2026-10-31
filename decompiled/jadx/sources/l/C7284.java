package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7284 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f22359;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f22360 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f22361;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1805 f22362;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f22363;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f22364;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22365;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f22366;

    public C7284(C1805 c1805, C16560 c16560, List list, Runnable runnable) {
        this.f22362 = c1805;
        this.f22359 = c16560;
        this.f22364 = list;
        this.f22361 = runnable;
        this.f22366 = c1805.f51870.m36526(C4303.m12893(c1805.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f22359.m39056());
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f22363 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        AbstractC15440 abstractC15440 = this.f22366;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        C10211 c10211 = null;
        for (C10211 c10212 : this.f22364) {
            if (c10211 == null && (c10212.m25624() instanceof C12223)) {
                c10211 = c10212;
            } else {
                c10212.m25619();
            }
        }
        if (c10211 == null) {
            return;
        }
        this.f22363.m51045(0);
        this.f22363.m51040(c10211.m25626());
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(c10211.m25628());
        C11518 c11518 = this.f22362.f6223;
        this.f22359.m39056();
        C19404 c19404Mo28347 = c11518.mo28347(c10211.m25624());
        try {
            c19404Mo28347.m44686().m44461(this.f22363.m51043());
            abstractC15440M36526.m36494(c19404Mo28347, 0L, new InterfaceC5627() { // from class: l.ܰۛܳ
                @Override // l.InterfaceC5627
                /* JADX INFO: renamed from: ᩷֫ */
                public final /* synthetic */ void mo1648() {
                    throw null;
                }

                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f40650.f22363.m51053();
                }
            });
            c19404Mo28347.close();
            if (this.f22363.m51053()) {
                return;
            }
            c10211.m25620(abstractC15440M36526);
            this.f22360.add(new C5977(abstractC15440M36526, c10211.m25626(), c10211.m25626()));
        } catch (Throwable th) {
            try {
                c19404Mo28347.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f22363.m51053()) {
            this.f22366.mo23552();
        } else {
            this.f22365 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!this.f22363.m51053()) {
            this.f22359.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        this.f22366.mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f22363.m51051();
        C15528.m36596();
        if (this.f22365) {
            this.f22362.m39735(this.f22360);
            try {
                this.f22361.run();
            } catch (Throwable th) {
                this.f22359.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
