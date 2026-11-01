package p067l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܽ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18060 extends AbstractC16951 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19402 f53919;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18060(C19402 c19402) {
        super("DotsWidth");
        this.f53919 = c19402;
    }

    @Override // p067l.AbstractC16951
    public final float getValue(Object obj) {
        C13045.m29867((View) obj, "object");
        ImageView imageView = this.f53919.f57944;
        C13045.m29861((Object) imageView);
        return imageView.getLayoutParams().width;
    }

    @Override // p067l.AbstractC16951
    public final void setValue(Object obj, float f) {
        C13045.m29867((View) obj, "object");
        C19402 c19402 = this.f53919;
        ImageView imageView = c19402.f57944;
        C13045.m29861((Object) imageView);
        imageView.getLayoutParams().width = (int) f;
        ImageView imageView2 = c19402.f57944;
        C13045.m29861((Object) imageView2);
        imageView2.requestLayout();
    }
}
