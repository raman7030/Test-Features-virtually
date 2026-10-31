package l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.ܿ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17588 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f53756;

    public C17588(Rect rect) {
        this.f53756 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f53756;
    }
}
