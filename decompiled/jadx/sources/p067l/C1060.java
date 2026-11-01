package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙۘ */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes3.dex */
public final class C1060 extends AbstractC18333 {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f16889;

    public C1060(C0990 c0990) {
        this.f16889 = new WeakReference(c0990);
    }

    @Override // p067l.AbstractC18333
    /* JADX INFO: renamed from: ۧ */
    public final void mo4663() {
        C0990 c0990 = (C0990) this.f16889.get();
        if (c0990 != null) {
            c0990.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // p067l.AbstractC18333
    /* JADX INFO: renamed from: ֫ */
    public final void mo14985() {
        C0990 c0990 = (C0990) this.f16889.get();
        if (c0990 != null) {
            c0990.onEmojiCompatInitializedForSwitchText();
        }
    }
}
