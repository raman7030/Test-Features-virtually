package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16655 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18067 f51147;

    public RunnableC16655(C18067 c18067) {
        this.f51147 = c18067;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f51147.f56284;
        textView.setText(textView.getText());
    }
}
