package p067l;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes.dex */
public final class C25119 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C11709 f80370;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f80371;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ArrayList f80372;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ArrayList f80373;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Object f80374;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C25119(C11709 c11709, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f80370 = c11709;
        this.f80371 = obj;
        this.f80372 = arrayList;
        this.f80374 = obj2;
        this.f80373 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C11709 c11709 = this.f80370;
        Object obj = this.f80371;
        if (obj != null) {
            c11709.m26915(obj, this.f80372, (ArrayList) null);
        }
        Object obj2 = this.f80374;
        if (obj2 != null) {
            c11709.m26915(obj2, this.f80373, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
