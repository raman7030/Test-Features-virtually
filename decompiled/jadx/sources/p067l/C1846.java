package p067l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩶ܶ */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C1846 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1496 f68097;

    public C1846(C1496 c1496) {
        this.f68097 = c1496;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1496 c1496 = this.f68097;
        int width = c1496.getWidth();
        int height = c1496.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c1496.f42474) / 2.0f);
    }
}
