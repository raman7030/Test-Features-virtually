package p067l;

import android.view.View;
import com.tencent.connect.auth.DialogC0602a;

/* JADX INFO: renamed from: l.᩹۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23425 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogC0602a f74627;

    public ViewOnClickListenerC23425(DialogC0602a dialogC0602a) {
        this.f74627 = dialogC0602a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogC0602a dialogC0602a = this.f74627;
        dialogC0602a.dismiss();
        if (dialogC0602a.f2069 || dialogC0602a.f2082 == null) {
            return;
        }
        dialogC0602a.f2082.mo5756();
    }
}
