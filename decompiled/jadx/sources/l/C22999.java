package l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.᩺۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22999 implements InterfaceC23206 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f74048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC6772 f74049;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f74050;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f74051;

    public C22999(RunnableC6772 runnableC6772, DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, EditText editText) {
        this.f74049 = runnableC6772;
        this.f74051 = dialogInterfaceC0206;
        this.f74050 = abstractActivityC3346;
        this.f74048 = editText;
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public final void mo8486(String str) {
        this.f74049.run();
        if (this.f74051.m1442()) {
            AbstractActivityC3346 abstractActivityC3346 = this.f74050;
            if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                return;
            }
            if (str.length() > 1 && str.endsWith("/")) {
                str = C15472.m36561(1, 0, str);
            }
            EditText editText = this.f74048;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }

    @Override // l.InterfaceC23206
    public final void onCanceled() {
        this.f74049.run();
    }
}
