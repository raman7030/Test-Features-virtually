package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21260 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f68584;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f68585;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f68586 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21965 f68587;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f68588;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f68589;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f68590;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22670 f68591;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f68592;

    public C21260(C21965 c21965, C16560 c16560, List list, Runnable runnable) {
        this.f68587 = c21965;
        this.f68585 = c16560;
        this.f68584 = list;
        this.f68590 = runnable;
        this.f68592 = c21965.f51870.m36526(C4303.m12893(c21965.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C21965 c21965 = this.f68587;
        C22670 c22670 = c21965.f70358.m14529() ? new C22670() : null;
        this.f68591 = c22670;
        RunnableC7853 runnableC7853 = c22670 != null ? new RunnableC7853(c22670) : null;
        C22022 c22022 = new C22022(this.f68585.m39056());
        c22022.m49558(c21965.f70358.m14529() ? R.string.MT_Protector : R.string.MT_Protector);
        c22022.m49556("...");
        c22022.m49543((Runnable) runnableC7853);
        c22022.m49548();
        this.f68589 = c22022;
        if (this.f68584.size() == 1) {
            this.f68589.m49545();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        InterfaceC0091 interfaceC0091M14530;
        List<C10211> list = this.f68584;
        AbstractC15440 abstractC15440 = this.f68592;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        C22670 c22670 = this.f68591;
        C21965 c21965 = this.f68587;
        if (c22670 == null) {
            interfaceC0091M14530 = c21965.f70358.m14530((C22670) null);
        } else {
            interfaceC0091M14530 = c21965.f70358.m14530(this.f68591);
        }
        try {
            int i = c21965.f70358.m14529() ? R.string.MT_Protector : R.string.MT_Protector;
            int i2 = 0;
            for (C10211 c10211 : list) {
                if (!this.f68589.m51053()) {
                    this.f68589.m49558(i);
                    this.f68589.m49553(0);
                    i2++;
                    this.f68589.m49552(i2, list.size());
                    this.f68589.m49556(c10211.m25626());
                    String strM25626 = c10211.m25626();
                    String strM25625 = c10211.m25625();
                    boolean zM25621 = c10211.m25621();
                    C13621 entry = interfaceC0091M14530.getEntry(strM25625.substring(1) + strM25626);
                    if (entry == null) {
                        entry = zM25621 ? interfaceC0091M14530.getEntry(strM25626) : null;
                    }
                    if (entry == null) {
                        c10211.m25619();
                    } else {
                        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(c10211.m25628());
                        C23411 c23411M36513 = abstractC15440M36526.m36513("rw");
                        try {
                            interfaceC0091M14530.mo1051(entry, c23411M36513, new C14908(this, entry));
                            c23411M36513.close();
                            if (this.f68589.m51053()) {
                                abstractC15440M36526.mo27929();
                            } else {
                                c10211.m25620(abstractC15440M36526);
                                this.f68586.add(new C5977(abstractC15440M36526, c10211.m25626(), entry.m32740()));
                            }
                        } catch (Throwable th) {
                            try {
                                c23411M36513.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } else {
                    interfaceC0091M14530.close();
                    return;
                }
            }
            interfaceC0091M14530.close();
        } catch (Throwable th3) {
            try {
                interfaceC0091M14530.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f68589.m51053()) {
            this.f68592.mo23552();
        } else {
            this.f68588 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f68592.mo23552();
        if (this.f68589.m51053()) {
            return;
        }
        this.f68585.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f68589.m51051();
        C15528.m36596();
        if (this.f68588) {
            this.f68587.m39735(this.f68586);
            try {
                this.f68590.run();
            } catch (Throwable th) {
                this.f68585.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
