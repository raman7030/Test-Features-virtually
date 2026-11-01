package p067l;

import android.view.Window;

/* JADX INFO: renamed from: l.᩶ܰ */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes5.dex */
public class C1844 extends C1949 {
    @Override // p067l.C1494
    /* JADX INFO: renamed from: ۧ */
    public final void mo12045(boolean z) {
        if (z) {
            Window window = this.f75059;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m52387(8192);
            return;
        }
        m52386(8192);
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12043() {
        return (this.f75059.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
