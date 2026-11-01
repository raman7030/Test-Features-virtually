package p067l;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۗۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5907 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5419 extends AbstractC25101 {

    /* JADX INFO: renamed from: ֫ */
    public final C24865 f12905 = new C24865();

    /* JADX INFO: renamed from: ֫ */
    public static C5419 m11894(C5088 c5088) {
        C5419 c5419 = new C5419();
        c5088.m10814(c5419);
        return c5419;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11899(AbstractC14136 abstractC14136) {
        this.f12905.m54621(abstractC14136);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11898(C6326 c6326) {
        C24865 c24865 = this.f12905;
        if (!c24865.f79432) {
            c24865.f79432 = true;
            if (c24865.f79431 == null) {
                c24865.f79431 = Executors.newCachedThreadPool();
            }
            c6326.m14471(new C11455(c24865));
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11897(InterfaceC3643 interfaceC3643) {
        interfaceC3643.mo6909(C10603.class, new C6760());
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11896(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC20843.m47076(textView);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11895(TextView textView) {
        AbstractC20843.m47075(textView);
    }
}
