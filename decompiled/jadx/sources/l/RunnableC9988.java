package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9988 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f30105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2932 f30106;

    public RunnableC9988(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687, C2932 c2932, String str) {
        this.f30105 = abstractDialogInterfaceOnClickListenerC22687;
        this.f30106 = c2932;
        this.f30104 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f30105;
        if (abstractDialogInterfaceOnClickListenerC22687.f73305 == null) {
            AbstractDialogInterfaceOnClickListenerC22687.m50701(abstractDialogInterfaceOnClickListenerC22687);
        }
        TextView textView = abstractDialogInterfaceOnClickListenerC22687.f73306;
        C2932 c2932 = this.f30106;
        textView.setText(c2932.f9329);
        TextView textView2 = abstractDialogInterfaceOnClickListenerC22687.f73307;
        String str = c2932.f9328;
        String strConcat = str.contains("\n") ? str.concat("\n->") : str.concat(" ->");
        String str2 = this.f30104;
        textView2.setText(C16014.m37867(strConcat, str2.contains("\n") ? "\n" : " ") + str2);
        abstractDialogInterfaceOnClickListenerC22687.f73305.m1449();
    }
}
