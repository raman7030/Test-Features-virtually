package p067l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܶܶ */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1601 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1951 f50064;

    public C1601(C1951 c1951) {
        this.f50064 = c1951;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1951 c1951 = this.f50064;
        int width = c1951.getWidth();
        int height = c1951.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c1951.f75153) / 2.0f);
    }
}
