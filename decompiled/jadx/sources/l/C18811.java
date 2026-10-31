package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩴܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18811 implements InterfaceC14513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8227 f59360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f59361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f59362;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f59363;

    public C18811(View view, ViewGroup viewGroup, C8227 c8227, C4888 c4888) {
        this.f59363 = view;
        this.f59361 = viewGroup;
        this.f59360 = c8227;
        this.f59362 = c4888;
    }

    @Override // l.InterfaceC14513
    /* JADX INFO: renamed from: ֫ */
    public final void mo24234() {
        View view = this.f59363;
        view.clearAnimation();
        this.f59361.endViewTransition(view);
        this.f59360.m36287();
        if (AbstractC5180.m14853(2)) {
            C11003.toString(this.f59362);
        }
    }
}
