package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11861 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f33063;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC23930 f33064;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C5155 f33065;

    public RunnableC11861(AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930, C5155 c5155, String str) {
        this.f33064 = abstractDialogInterfaceOnClickListenerC23930;
        this.f33065 = c5155;
        this.f33063 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930 = this.f33064;
        if (abstractDialogInterfaceOnClickListenerC23930.f76030 == null) {
            AbstractDialogInterfaceOnClickListenerC23930.m53027(abstractDialogInterfaceOnClickListenerC23930);
        }
        TextView textView = abstractDialogInterfaceOnClickListenerC23930.f76031;
        C5155 c5155 = this.f33065;
        textView.setText(c5155.f12128);
        TextView textView2 = abstractDialogInterfaceOnClickListenerC23930.f76032;
        String str = c5155.f12127;
        String strConcat = str.contains("\n") ? str.concat("\n->") : str.concat(" ->");
        String str2 = this.f33063;
        textView2.setText(C17588.m40053(strConcat, str2.contains("\n") ? "\n" : " ") + str2);
        abstractDialogInterfaceOnClickListenerC23930.f76030.m3862();
    }
}
