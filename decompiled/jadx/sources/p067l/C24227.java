package p067l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.᩺۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24227 implements InterfaceC24424 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ EditText f76787;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ RunnableC8805 f76788;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f76789;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ DialogInterfaceC2564 f76790;

    public C24227(RunnableC8805 runnableC8805, DialogInterfaceC2564 dialogInterfaceC2564, AbstractActivityC5549 abstractActivityC5549, EditText editText) {
        this.f76788 = runnableC8805;
        this.f76790 = dialogInterfaceC2564;
        this.f76789 = abstractActivityC5549;
        this.f76787 = editText;
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public final void mo10533(String str) {
        this.f76788.run();
        if (this.f76790.m3855()) {
            AbstractActivityC5549 abstractActivityC5549 = this.f76789;
            if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
                return;
            }
            if (str.length() > 1 && str.endsWith("/")) {
                str = C17073.m38720(1, 0, str);
            }
            EditText editText = this.f76787;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }

    @Override // p067l.InterfaceC24424
    public final void onCanceled() {
        this.f76788.run();
    }
}
