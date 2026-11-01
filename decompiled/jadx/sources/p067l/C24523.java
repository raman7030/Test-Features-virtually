package p067l;

import android.animation.Animator;
import com.google.android.material.animation.AnimatableView;

/* JADX INFO: renamed from: l.᩺᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C24523 implements InterfaceC14501, InterfaceC4595, AnimatableView.Listener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f77675;

    public /* synthetic */ C24523(Object obj) {
        this.f77675 = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f77675).start();
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C14287) this.f77675).mo13474(i);
    }

    @Override // p067l.InterfaceC13831
    /* JADX INFO: renamed from: ֫ */
    public void mo10534(AbstractC17043 abstractC17043) {
        ((C20765) this.f77675).m50871(abstractC17043);
    }
}
