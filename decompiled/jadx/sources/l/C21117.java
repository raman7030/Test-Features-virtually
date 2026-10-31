package l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.᩷᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes4.dex */
public final class C21117 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f68111;

    public C21117(Rect rect) {
        this.f68111 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f68111;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
