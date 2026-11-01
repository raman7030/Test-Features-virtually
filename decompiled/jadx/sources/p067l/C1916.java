package p067l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩸ܶ */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1916 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1951 f72189;

    public C1916(C1951 c1951) {
        this.f72189 = c1951;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1951 c1951 = this.f72189;
        outline.setRoundRect(0, 0, c1951.getWidth(), c1951.getHeight(), c1951.f75154);
    }
}
