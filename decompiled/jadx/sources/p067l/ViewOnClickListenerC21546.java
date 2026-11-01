package p067l;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.᩶۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21546 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f67954;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67955;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f67956;

    public /* synthetic */ ViewOnClickListenerC21546(int i, Object obj, Object obj2) {
        this.f67955 = i;
        this.f67956 = obj;
        this.f67954 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.f67955;
        Object obj = this.f67954;
        Object obj2 = this.f67956;
        switch (i) {
            case 0:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj;
                if (((C10748) obj2).m24761()) {
                    ActivityC12554.m28933((Context) abstractActivityC5549, C25165.m55228(), true);
                }
                break;
            default:
                ClipboardManager clipboardManager = (ClipboardManager) obj2;
                C15845 c15845 = (C15845) obj;
                int i2 = ViewOnClickListenerC20541.f63467;
                if (clipboardManager.hasPrimaryClip()) {
                    CharSequence text = clipboardManager.getText();
                    if (text == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    c15845.m33336((CharSequence) string);
                    c15845.m33328();
                }
                break;
        }
    }
}
