package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3284 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ AbstractC5375 f6393;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ long f6394;

    /* JADX INFO: renamed from: ۜ */
    public C24164 f6395;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f6396;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f6397;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ RunnableC22455 f6399;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C9990 f6400;

    /* JADX INFO: renamed from: ܳ */
    public boolean f6398 = false;

    /* JADX INFO: renamed from: ᩻ */
    public AtomicReference f6401 = new AtomicReference();

    public C3284(C9990 c9990, AbstractC5375 abstractC5375, boolean z, boolean z2, long j, RunnableC22455 runnableC22455) {
        this.f6400 = c9990;
        this.f6393 = abstractC5375;
        this.f6397 = z;
        this.f6396 = z2;
        this.f6394 = j;
        this.f6399 = runnableC22455;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f6400.f27673.m41282());
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f6395 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        InterfaceC18588 interfaceC18588 = new InterfaceC18588() { // from class: l.֡ۜ᩻
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                C3284 c3284 = this.f4318;
                return c3284.f6395.m53444() || c3284.f6401.get() != null;
            }
        };
        final AbstractC5375 abstractC5375 = this.f6393;
        C22061 c22061 = new C22061(abstractC5375, interfaceC18588);
        c22061.m49651(this.f6397);
        c22061.m49653(this.f6396);
        List list = this.f6400.f27671;
        final long j = this.f6394;
        c22061.m49650(list, new InterfaceC24742() { // from class: l.ۚۜ᩻
            @Override // p067l.InterfaceC24742
            /* JADX INFO: renamed from: ֫ */
            public final void mo16881(C8649 c8649, int i, int i2) {
                AbstractC5375 abstractC5376 = abstractC5375;
                long j2 = j;
                C3284 c3284 = this.f19131;
                C24164 c24164 = c3284.f6395;
                String str = c8649.f23221;
                String str2 = c8649.f23220;
                c24164.m53431(str);
                c3284.f6395.m53430(i, i2);
                try {
                    abstractC5376.mo11744(j2, str2);
                    c3284.f6398 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC19370 interfaceC19370 : c3284.f6400.f27671) {
                            if (interfaceC19370.getPath().equals(str2)) {
                                interfaceC19370.setTime(j2);
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c3284.f6401;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f6395.m53444()) {
            return;
        }
        AtomicReference atomicReference = this.f6401;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f6395.m53444() || !this.f6398) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f6400.f27673.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f6398) {
            this.f6399.run();
        }
        this.f6395.m53442();
    }
}
