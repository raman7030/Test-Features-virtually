package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20172 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final TextView f62429;

    public RunnableC20172(TextView textView) {
        this.f62429 = textView;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45651() {
        TextView textView = this.f62429;
        textView.removeCallbacks(this);
        textView.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f62429;
        textView.setText(textView.getText());
    }
}
