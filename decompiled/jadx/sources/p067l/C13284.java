package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13284 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C18107 f37290;

    /* JADX INFO: renamed from: ۘ */
    public C19561 f37291;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f37292 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ Runnable f37293;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C12574 f37294;

    /* JADX INFO: renamed from: ܳ */
    public C23298 f37295;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ List f37296;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f37297;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f37298;

    public C13284(C12574 c12574, C18107 c18107, List list, Runnable runnable) {
        this.f37294 = c12574;
        this.f37290 = c18107;
        this.f37296 = list;
        this.f37293 = runnable;
        this.f37298 = c12574.f55050.m38684(C6458.m14757(c12574.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C23298 c23298 = new C23298(this.f37290.m41282());
        c23298.m51894(R.string.MT_Protector);
        c23298.m51892("...");
        c23298.mo51878((Runnable) null);
        c23298.m51884();
        this.f37295 = c23298;
        if (this.f37296.size() == 1) {
            this.f37295.m51881();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        AbstractC17043 abstractC17043 = this.f37298;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        C12574 c12574 = this.f37294;
        C19561 c19561M44427 = C19561.m44427(C18524.m42109(c12574.m28981(), new String[0]), c12574.m28984());
        this.f37291 = c19561M44427;
        c19561M44427.m44451(c12574.m28982());
        List<C12073> list = this.f37296;
        int i = 0;
        for (C12073 c12073 : list) {
            if (this.f37295.m53444()) {
                return;
            }
            i++;
            this.f37295.m51889(0);
            this.f37295.m51888(i, list.size());
            this.f37295.m51892(c12073.m27648());
            String strM27648 = c12073.m27648();
            String strM27647 = c12073.m27647();
            boolean zM27643 = c12073.m27643();
            C5738 entry = c12574.f35332.getEntry(strM27647.substring(1) + strM27648);
            if (entry == null) {
                entry = zM27643 ? c12574.f35332.getEntry(strM27648) : null;
            }
            if (entry == null) {
                c12073.m27641();
            } else {
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(c12073.m27650());
                C23775.m52844(c12574.m28981(), this.f37291, entry, abstractC17043M38684, true, new C7919(this, entry));
                c12073.m27642(abstractC17043M38684);
                this.f37292.add(new C8049(abstractC17043M38684, c12073.m27648(), entry.getName()));
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f37295.m53444()) {
            this.f37298.mo25503();
        } else {
            this.f37297 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f37290.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f37298.mo25503();
        if (exc instanceof C6150) {
            C19561 c19561 = this.f37291;
            if (c19561 != null) {
                c19561.m44451((String) null);
            }
            this.f37294.f35332.m46683(null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C19561 c19561 = this.f37291;
        C12574 c12574 = this.f37294;
        if (c19561 != null) {
            c12574.f35332.m46683(this.f37291.m44467());
            C2700.m4192(this.f37291);
        }
        this.f37295.m53442();
        C17127.m38756();
        if (this.f37297) {
            c12574.m41976(this.f37292);
            try {
                this.f37293.run();
            } catch (Throwable th) {
                this.f37290.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
