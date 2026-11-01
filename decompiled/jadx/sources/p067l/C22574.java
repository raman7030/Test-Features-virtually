package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22574 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ List f71267;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C18107 f71268;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f71269 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C23244 f71270;

    /* JADX INFO: renamed from: ۢ */
    public boolean f71271;

    /* JADX INFO: renamed from: ܳ */
    public C23298 f71272;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ Runnable f71273;

    /* JADX INFO: renamed from: ᩷ */
    public C23914 f71274;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f71275;

    public C22574(C23244 c23244, C18107 c18107, List list, Runnable runnable) {
        this.f71270 = c23244;
        this.f71268 = c18107;
        this.f71267 = list;
        this.f71273 = runnable;
        this.f71275 = c23244.f55050.m38684(C6458.m14757(c23244.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C23244 c23244 = this.f71270;
        C23914 c23914 = c23244.f73069.m16433() ? new C23914() : null;
        this.f71274 = c23914;
        RunnableC9832 runnableC9832 = c23914 != null ? new RunnableC9832(c23914) : null;
        C23298 c23298 = new C23298(this.f71268.m41282());
        c23298.m51894(c23244.f73069.m16433() ? R.string.MT_Protector : R.string.MT_Protector);
        c23298.m51892("...");
        c23298.m51879((Runnable) runnableC9832);
        c23298.m51884();
        this.f71272 = c23298;
        if (this.f71267.size() == 1) {
            this.f71272.m51881();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        InterfaceC2455 interfaceC2455M16434;
        List<C12073> list = this.f71267;
        AbstractC17043 abstractC17043 = this.f71275;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        C23914 c23914 = this.f71274;
        C23244 c23244 = this.f71270;
        if (c23914 == null) {
            interfaceC2455M16434 = c23244.f73069.m16434((C23914) null);
        } else {
            interfaceC2455M16434 = c23244.f73069.m16434(this.f71274);
        }
        try {
            int i = c23244.f73069.m16433() ? R.string.MT_Protector : R.string.MT_Protector;
            int i2 = 0;
            for (C12073 c12073 : list) {
                if (!this.f71272.m53444()) {
                    this.f71272.m51894(i);
                    this.f71272.m51889(0);
                    i2++;
                    this.f71272.m51888(i2, list.size());
                    this.f71272.m51892(c12073.m27648());
                    String strM27648 = c12073.m27648();
                    String strM27647 = c12073.m27647();
                    boolean zM27643 = c12073.m27643();
                    C15314 entry = interfaceC2455M16434.getEntry(strM27647.substring(1) + strM27648);
                    if (entry == null) {
                        entry = zM27643 ? interfaceC2455M16434.getEntry(strM27648) : null;
                    }
                    if (entry == null) {
                        c12073.m27641();
                    } else {
                        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(c12073.m27650());
                        C24618 c24618M38671 = abstractC17043M38684.m38671("rw");
                        try {
                            interfaceC2455M16434.mo3447(entry, c24618M38671, new C16537(this, entry));
                            c24618M38671.close();
                            if (this.f71272.m53444()) {
                                abstractC17043M38684.mo29990();
                            } else {
                                c12073.m27642(abstractC17043M38684);
                                this.f71269.add(new C8049(abstractC17043M38684, c12073.m27648(), entry.m34854()));
                            }
                        } catch (Throwable th) {
                            try {
                                c24618M38671.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } else {
                    interfaceC2455M16434.close();
                    return;
                }
            }
            interfaceC2455M16434.close();
        } catch (Throwable th3) {
            try {
                interfaceC2455M16434.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f71272.m53444()) {
            this.f71275.mo25503();
        } else {
            this.f71271 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f71275.mo25503();
        if (this.f71272.m53444()) {
            return;
        }
        this.f71268.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f71272.m53442();
        C17127.m38756();
        if (this.f71271) {
            this.f71270.m41976(this.f71269);
            try {
                this.f71273.run();
            } catch (Throwable th) {
                this.f71268.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
