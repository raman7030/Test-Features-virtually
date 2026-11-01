package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4349 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ AbstractC5375 f9730;

    /* JADX INFO: renamed from: ۜ */
    public C24164 f9731;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f9732;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f9733;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ RunnableC22455 f9735;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C13067 f9736;

    /* JADX INFO: renamed from: ܳ */
    public boolean f9734 = false;

    /* JADX INFO: renamed from: ᩻ */
    public AtomicReference f9737 = new AtomicReference();

    public C4349(C13067 c13067, AbstractC5375 abstractC5375, boolean z, boolean z2, RunnableC22455 runnableC22455) {
        this.f9736 = c13067;
        this.f9730 = abstractC5375;
        this.f9733 = z;
        this.f9732 = z2;
        this.f9735 = runnableC22455;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f9736.f36735.m41282());
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f9731 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        C13067 c13067 = this.f9736;
        final int iM13057 = c13067.f36733.m13057();
        InterfaceC18588 interfaceC18588 = new InterfaceC18588() { // from class: l.ܰۜ᩻
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                C4349 c4349 = this.f43824;
                return c4349.f9731.m53444() || c4349.f9737.get() != null;
            }
        };
        final AbstractC5375 abstractC5375 = this.f9730;
        C22061 c22061 = new C22061(abstractC5375, interfaceC18588);
        c22061.m49651(this.f9733);
        c22061.m49653(this.f9732);
        c22061.m49650(c13067.f36734, new InterfaceC24742() { // from class: l.۟ۜ᩻
            @Override // p067l.InterfaceC24742
            /* JADX INFO: renamed from: ֫ */
            public final void mo16881(C8649 c8649, int i, int i2) {
                AbstractC5375 abstractC5376 = abstractC5375;
                int i3 = iM13057;
                C4349 c4349 = this.f25341;
                C24164 c24164 = c4349.f9731;
                String str = c8649.f23221;
                String str2 = c8649.f23220;
                c24164.m53431(str);
                c4349.f9731.m53430(i, i2);
                try {
                    abstractC5376.mo11738(i3, str2);
                    c4349.f9734 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC19370 interfaceC19370 : c4349.f9736.f36734) {
                            if (interfaceC19370.getPath().equals(str2)) {
                                AbstractC18707 abstractC18707 = (AbstractC18707) interfaceC19370;
                                C18028 c18028Mo26440 = abstractC18707.mo26440();
                                if (c18028Mo26440 != null) {
                                    abstractC18707.mo31924(c18028Mo26440.m41060(i3));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c4349.f9737;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f9731.m53444()) {
            return;
        }
        AtomicReference atomicReference = this.f9737;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f9731.m53444() || !this.f9734) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f9736.f36735.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f9734) {
            this.f9735.run();
        }
        this.f9731.m53442();
    }
}
