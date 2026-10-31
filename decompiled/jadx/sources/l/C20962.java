package l;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20962 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f67733;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f67734;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f67735;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f67736;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f67737;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f67738;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21434 f67739;

    public C20962(C22372 c22372, ActivityC16315 activityC16315, String str, AbstractC15440 abstractC15440) {
        this.f67738 = c22372;
        this.f67735 = activityC16315;
        this.f67737 = str;
        this.f67734 = abstractC15440;
        this.f67733 = C9170.m23579(c22372.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f67736 = this.f67738.f72517.m30436().mo26562();
        m20270(this.f67735, this.f67733);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f67736;
        try {
            C21434 c21434M30606 = C12450.m30606(c7744);
            this.f67739 = c21434M30606;
            c21434M30606.m48549("<--id-c5skl23kjndf-->", this.f67737);
            this.f67734.m36510(this.f67739.mo14987());
            c7744.close();
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f67733.m23581()) {
            long jMo23117 = this.f67734.mo23117();
            C22372 c22372 = this.f67738;
            c22372.f72490 = jMo23117;
            c22372.startActivity(new Intent(c22372.getContext(), (Class<?>) ActivityC11745.class));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        String message;
        if (this.f67733.m23581()) {
            this.f67735.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C14682) || (message = ((C14682) exc).getMessage()) == null) {
                return;
            }
            Matcher matcher = Pattern.compile("at line (\\d+) column (\\d+)").matcher(message);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C11003.requireNonNull(strGroup);
                this.f67738.f72517.m30372(Integer.parseInt(strGroup) - 1);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f67736;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
