package l;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes4.dex */
public final class C14765 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f45084;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f45085;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C14765(View view, ArrayList arrayList) {
        this.f45085 = view;
        this.f45084 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f45085.setVisibility(8);
        ArrayList arrayList = this.f45084;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
