package l;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes.dex */
public final class C23938 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9828 f77618;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77619;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f77620;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f77621;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77622;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C23938(C9828 c9828, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f77618 = c9828;
        this.f77619 = obj;
        this.f77620 = arrayList;
        this.f77622 = obj2;
        this.f77621 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C9828 c9828 = this.f77618;
        Object obj = this.f77619;
        if (obj != null) {
            c9828.m24900(obj, this.f77620, (ArrayList) null);
        }
        Object obj2 = this.f77622;
        if (obj2 != null) {
            c9828.m24900(obj2, this.f77621, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
