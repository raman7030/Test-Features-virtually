package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18197 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19539 f54329;

    public RunnableC18197(C19539 c19539) {
        this.f54329 = c19539;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f54329.f59489;
        textView.setText(textView.getText());
    }
}
