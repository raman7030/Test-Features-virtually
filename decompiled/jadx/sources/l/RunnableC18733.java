package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18733 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f59206;

    public RunnableC18733(TextView textView) {
        this.f59206 = textView;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43384() {
        TextView textView = this.f59206;
        textView.removeCallbacks(this);
        textView.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f59206;
        textView.setText(textView.getText());
    }
}
