package l;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.᩶۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20178 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65307;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65308;

    public /* synthetic */ ViewOnClickListenerC20178(int i, Object obj, Object obj2) {
        this.f65307 = i;
        this.f65308 = obj;
        this.f65306 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.f65307;
        Object obj = this.f65306;
        Object obj2 = this.f65308;
        switch (i) {
            case 0:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj;
                if (((C8817) obj2).m22791()) {
                    ActivityC10717.m26893((Context) abstractActivityC3346, C23986.m52822(), true);
                }
                break;
            default:
                ClipboardManager clipboardManager = (ClipboardManager) obj2;
                C14180 c14180 = (C14180) obj;
                int i2 = ViewOnClickListenerC19121.f60235;
                if (clipboardManager.hasPrimaryClip()) {
                    CharSequence text = clipboardManager.getText();
                    if (text == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    c14180.m31250((CharSequence) string);
                    c14180.m31242();
                }
                break;
        }
    }
}
