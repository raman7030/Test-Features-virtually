package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.File;

/* JADX INFO: renamed from: l.ۡ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11065 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Runnable f30634;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C5030 f30635;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f30636;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f30637;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f30638;

    public C11065(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, C5030 c5030, Runnable runnable) {
        this.f30638 = abstractActivityC5549;
        this.f30637 = abstractC17043;
        this.f30635 = c5030;
        this.f30634 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f30638);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53429(R.string.MT_Protector);
        c24164.mo51883();
        this.f30636 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("term/bin");
        abstractC17043M38684.mo25503();
        abstractC17043M38684.m38666();
        C19561 c19561 = new C19561(this.f30637);
        try {
            String strM14588 = C6371.m14588(c19561);
            C20689 c20689 = new C20689(c19561.m44466());
            C24164 c24164 = this.f30636;
            C12826.requireNonNull(c24164);
            c20689.m46753(new C24793(c24164));
            for (C5738 c5738 : c19561.m44469()) {
                c20689.m46754(1);
                if (!c5738.isDirectory()) {
                    String name = c5738.getName();
                    if (name.startsWith(strM14588)) {
                        String strSubstring = name.substring(strM14588.length());
                        if (strSubstring.contains("/")) {
                            continue;
                        } else {
                            System.out.println("Extract: bin/" + strSubstring);
                            AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684(strSubstring);
                            abstractC17043M38685.m38651(c19561.m44448(c5738));
                            if (!new File(abstractC17043M38685.mo25495()).setExecutable(true, false)) {
                                throw new Exception("Set Executable Failed: " + abstractC17043M38685.mo25495());
                            }
                        }
                    }
                }
            }
            C6371.m14585(c19561, null);
            c19561.close();
            AbstractC17043 abstractC17043M38686 = C17853.f53284.m38684("term/version");
            C11996 c11996 = new C11996();
            C5030 c5030 = this.f30635;
            c11996.writeInt(c5030.f11535);
            c11996.m27459(c5030.f11534);
            abstractC17043M38686.mo25503();
            abstractC17043M38686.m38654(c11996);
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ServiceC24495.m53994();
        C4359.m9007();
        this.f30634.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f30638.m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f30634.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f30636.m53442();
    }
}
