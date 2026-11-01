package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9063 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ List f24583;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C18107 f24584;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f24585 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C11075 f24586;

    /* JADX INFO: renamed from: ۢ */
    public C12377 f24587;

    /* JADX INFO: renamed from: ܳ */
    public C23298 f24588;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ Runnable f24589;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f24590;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f24591;

    public C9063(C11075 c11075, C18107 c18107, List list, Runnable runnable) {
        this.f24586 = c11075;
        this.f24584 = c18107;
        this.f24583 = list;
        this.f24589 = runnable;
        this.f24591 = c11075.f55050.m38684(C6458.m14757(c11075.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C23298 c23298 = new C23298(this.f24584.m41282());
        c23298.m51894(R.string.MT_Protector);
        c23298.m51892("...");
        c23298.mo51878((Runnable) null);
        c23298.m51884();
        this.f24588 = c23298;
        if (this.f24583.size() == 1) {
            this.f24588.m51881();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        AbstractC17043 abstractC17043 = this.f24591;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        C11075 c11075 = this.f24586;
        this.f24587 = C12377.m28481(C18524.m42109(c11075.m25519(), new String[0]));
        List<C12073> list = this.f24583;
        int i = 0;
        for (C12073 c12073 : list) {
            if (this.f24588.m53444()) {
                return;
            }
            i++;
            this.f24588.m51889(0);
            this.f24588.m51888(i, list.size());
            this.f24588.m51892(c12073.m27648());
            String strM27648 = c12073.m27648();
            String strM27647 = c12073.m27647();
            boolean zM27643 = c12073.m27643();
            C3659 entry = c11075.f30666.getEntry(strM27647.substring(1) + strM27648);
            if (entry == null) {
                entry = zM27643 ? c11075.f30666.getEntry(strM27648) : null;
            }
            if (entry == null) {
                c12073.m27641();
            } else {
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(c12073.m27650());
                C14247.m32744(this.f24587, entry, abstractC17043M38684, new C25156(this));
                c12073.m27642(abstractC17043M38684);
                this.f24585.add(new C8049(abstractC17043M38684, c12073.m27648(), entry.m6979()));
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f24588.m53444()) {
            this.f24591.mo25503();
        } else {
            this.f24590 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f24584.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f24591.mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C12377 c12377 = this.f24587;
        if (c12377 != null) {
            C2700.m4192(c12377);
        }
        this.f24588.m53442();
        C17127.m38756();
        if (this.f24590) {
            this.f24586.m41976(this.f24585);
            try {
                this.f24589.run();
            } catch (Throwable th) {
                this.f24584.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
