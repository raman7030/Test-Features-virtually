package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes3.dex */
public final class C4389 extends AbstractC16798 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f14073;

    public C4389(C2978 c2978) {
        this.f14073 = new WeakReference(c2978);
    }

    @Override // l.AbstractC16798
    /* JADX INFO: renamed from: ۧ */
    public final void mo2295() {
        C2978 c2978 = (C2978) this.f14073.get();
        if (c2978 != null) {
            c2978.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // l.AbstractC16798
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13121() {
        C2978 c2978 = (C2978) this.f14073.get();
        if (c2978 != null) {
            c2978.onEmojiCompatInitializedForSwitchText();
        }
    }
}
