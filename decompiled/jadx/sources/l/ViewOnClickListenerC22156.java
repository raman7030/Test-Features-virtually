package l;

import android.view.View;
import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.᩹۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22156 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f71905;

    public ViewOnClickListenerC22156(a aVar) {
        this.f71905 = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f71905;
        aVar.dismiss();
        if (aVar.f872 || aVar.f885 == null) {
            return;
        }
        aVar.f885.mo3453();
    }
}
