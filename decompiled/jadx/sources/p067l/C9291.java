package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9291 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C18107 f25250;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f25251 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ Runnable f25252;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C4084 f25253;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f25254;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ List f25255;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f25256;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f25257;

    public C9291(C4084 c4084, C18107 c18107, List list, Runnable runnable) {
        this.f25253 = c4084;
        this.f25250 = c18107;
        this.f25255 = list;
        this.f25252 = runnable;
        this.f25257 = c4084.f55050.m38684(C6458.m14757(c4084.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f25250.m41282());
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f25254 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        AbstractC17043 abstractC17043 = this.f25257;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        C12073 c12073 = null;
        for (C12073 c12074 : this.f25255) {
            if (c12073 == null && (c12074.m27646() instanceof C13985)) {
                c12073 = c12074;
            } else {
                c12074.m27641();
            }
        }
        if (c12073 == null) {
            return;
        }
        this.f25254.m53436(0);
        this.f25254.m53431(c12073.m27648());
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(c12073.m27650());
        C13315 c13315 = this.f25253.f9002;
        this.f25250.m41282();
        C20810 c20810Mo30393 = c13315.mo30393(c12073.m27646());
        try {
            c20810Mo30393.m46980().m46755(this.f25254.m53434());
            abstractC17043M38684.m38652(c20810Mo30393, 0L, new InterfaceC7717() { // from class: l.ܰۛܳ
                @Override // p067l.InterfaceC7717
                /* JADX INFO: renamed from: ᩷֫ */
                public final /* synthetic */ void mo4048() {
                    throw null;
                }

                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f43730.f25254.m53444();
                }
            });
            c20810Mo30393.close();
            if (this.f25254.m53444()) {
                return;
            }
            c12073.m27642(abstractC17043M38684);
            this.f25251.add(new C8049(abstractC17043M38684, c12073.m27648(), c12073.m27648()));
        } catch (Throwable th) {
            try {
                c20810Mo30393.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f25254.m53444()) {
            this.f25257.mo25503();
        } else {
            this.f25256 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (!this.f25254.m53444()) {
            this.f25250.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        }
        this.f25257.mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f25254.m53442();
        C17127.m38756();
        if (this.f25256) {
            this.f25253.m41976(this.f25251);
            try {
                this.f25252.run();
            } catch (Throwable th) {
                this.f25250.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
