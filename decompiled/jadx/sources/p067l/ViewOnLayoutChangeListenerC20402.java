package p067l;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ᩴ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC20402 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f63060;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f63061;

    public /* synthetic */ ViewOnLayoutChangeListenerC20402(int i, Object obj) {
        this.f63060 = i;
        this.f63061 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f63060) {
            case 0:
                ViewOnClickListenerC20541.m46381((ViewOnClickListenerC20541) this.f63061);
                break;
            default:
                ((CarouselLayoutManager) this.f63061).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
