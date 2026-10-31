package l;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۗۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5907 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3210 extends AbstractC23919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23671 f10098 = new C23671();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3210 m9847(C2861 c2861) {
        C3210 c3210 = new C3210();
        c2861.m8747(c3210);
        return c3210;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9852(AbstractC12382 abstractC12382) {
        this.f10098.m52218(abstractC12382);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9851(C4164 c4164) {
        C23671 c23671 = this.f10098;
        if (!c23671.f76682) {
            c23671.f76682 = true;
            if (c23671.f76681 == null) {
                c23671.f76681 = Executors.newCachedThreadPool();
            }
            c4164.m12597(new C9561(c23671));
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9850(InterfaceC1341 interfaceC1341) {
        interfaceC1341.mo4677(C8665.class, new C4621());
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9849(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC19439.m44781(textView);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9848(TextView textView) {
        AbstractC19439.m44780(textView);
    }
}
