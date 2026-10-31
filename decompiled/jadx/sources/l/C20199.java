package l;

import android.view.Window;

/* JADX INFO: renamed from: l.᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes5.dex */
public class C20199 extends C22315 {
    @Override // l.C13142
    /* JADX INFO: renamed from: ۧ */
    public final void mo10012(boolean z) {
        if (z) {
            Window window = this.f72333;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m50056(8192);
            return;
        }
        m50055(8192);
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10010() {
        return (this.f72333.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
