package p067l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.ܿ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes4.dex */
public final class C19084 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Rect f56950;

    public C19084(Rect rect) {
        this.f56950 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f56950;
    }
}
