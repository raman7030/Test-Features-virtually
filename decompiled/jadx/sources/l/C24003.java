package l;

import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YF */
/* JADX INFO: loaded from: classes.dex */
public final class C24003 extends AbstractC23919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14956 f77798;

    public C24003(C14956 c14956) {
        this.f77798 = c14956;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C24003 m52841(C14956 c14956) {
        return new C24003(c14956);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo15840(InterfaceC0635 interfaceC0635) {
        ((C21349) interfaceC0635.mo2584()).m48383();
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9849(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        MovementMethod movementMethod = textView.getMovementMethod();
        C14956 c14956 = this.f77798;
        if (movementMethod != c14956) {
            textView.setMovementMethod(c14956);
        }
    }
}
