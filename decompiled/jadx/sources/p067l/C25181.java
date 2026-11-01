package p067l;

import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YF */
/* JADX INFO: loaded from: classes.dex */
public final class C25181 extends AbstractC25101 {

    /* JADX INFO: renamed from: ֫ */
    public final C16582 f80550;

    public C25181(C16582 c16582) {
        this.f80550 = c16582;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25181 m55247(C16582 c16582) {
        return new C25181(c16582);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo17755(InterfaceC2972 interfaceC2972) {
        ((C22658) interfaceC2972.mo4924()).m50718();
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11896(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        MovementMethod movementMethod = textView.getMovementMethod();
        C16582 c16582 = this.f80550;
        if (movementMethod != c16582) {
            textView.setMovementMethod(c16582);
        }
    }
}
