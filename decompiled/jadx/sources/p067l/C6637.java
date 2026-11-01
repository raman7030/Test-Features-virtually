package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6637 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ AbstractC5375 f17117;

    /* JADX INFO: renamed from: ۜ */
    public C24164 f17118;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f17119;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f17120;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ RunnableC22455 f17122;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C5296 f17123;

    /* JADX INFO: renamed from: ܳ */
    public boolean f17121 = false;

    /* JADX INFO: renamed from: ᩻ */
    public AtomicReference f17124 = new AtomicReference();

    public C6637(C5296 c5296, AbstractC5375 abstractC5375, boolean z, boolean z2, RunnableC22455 runnableC22455) {
        this.f17123 = c5296;
        this.f17117 = abstractC5375;
        this.f17120 = z;
        this.f17119 = z2;
        this.f17122 = runnableC22455;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f17123.f12457.m41282());
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f17118 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        C5296 c5296 = this.f17123;
        final int iM18483 = c5296.f12455.m18483();
        final int iM18479 = c5296.f12455.m18479();
        final String strM18485 = c5296.f12455.m18485();
        final String strM18481 = c5296.f12455.m18481();
        C22061 c22061 = new C22061(this.f17117, new InterfaceC18588() { // from class: l.᩹ۜ᩻
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                C6637 c6637 = this.f74547;
                return c6637.f17118.m53444() || c6637.f17124.get() != null;
            }
        });
        c22061.m49651(this.f17120);
        c22061.m49653(this.f17119);
        List list = c5296.f12456;
        final AbstractC5375 abstractC5375 = this.f17117;
        c22061.m49650(list, new InterfaceC24742() { // from class: l.᩶ۜ᩻
            @Override // p067l.InterfaceC24742
            /* JADX INFO: renamed from: ֫ */
            public final void mo16881(C8649 c8649, int i, int i2) {
                AbstractC5375 abstractC5376 = abstractC5375;
                int i3 = iM18483;
                int i4 = iM18479;
                String str = strM18485;
                String str2 = strM18481;
                C6637 c6637 = this.f67469;
                C24164 c24164 = c6637.f17118;
                String str3 = c8649.f23221;
                String str4 = c8649.f23220;
                c24164.m53431(str3);
                c6637.f17118.m53430(i, i2);
                try {
                    abstractC5376.mo11727(i3, i4, str4);
                    c6637.f17121 = true;
                    if (str3.indexOf(47) == -1) {
                        for (InterfaceC19370 interfaceC19370 : c6637.f17123.f12456) {
                            if (interfaceC19370.getPath().equals(str4)) {
                                AbstractC18707 abstractC18707 = (AbstractC18707) interfaceC19370;
                                C18028 c18028Mo26440 = abstractC18707.mo26440();
                                if (c18028Mo26440 != null) {
                                    abstractC18707.mo31924(c18028Mo26440.m41062(str, str2));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c6637.f17124;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str3 + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f17118.m53444()) {
            return;
        }
        AtomicReference atomicReference = this.f17124;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f17118.m53444() || !this.f17121) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f17123.f12457.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f17121) {
            this.f17122.run();
        }
        this.f17118.m53442();
    }
}
