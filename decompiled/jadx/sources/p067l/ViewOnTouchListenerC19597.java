package p067l;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ᩳܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC19597 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AssistActivity f59621;

    public ViewOnTouchListenerC19597(AssistActivity assistActivity) {
        this.f59621 = assistActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AssistActivity assistActivity = this.f59621;
        C11060.m25470(assistActivity.f2089, "-->finish by touch");
        assistActivity.finish();
        return false;
    }
}
