package l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.ܺܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15987 implements InterfaceC14513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Animator f49332;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f49333;

    public C15987(Animator animator, C4888 c4888) {
        this.f49332 = animator;
        this.f49333 = c4888;
    }

    @Override // l.InterfaceC14513
    /* JADX INFO: renamed from: ֫ */
    public final void mo24234() {
        this.f49332.end();
        if (AbstractC5180.m14853(2)) {
            C11003.toString(this.f49333);
        }
    }
}
