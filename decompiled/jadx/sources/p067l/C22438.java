package p067l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.᩷᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes4.dex */
public final class C22438 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Rect f70793;

    public C22438(Rect rect) {
        this.f70793 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f70793;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
