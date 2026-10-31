package l;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ᩴ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC18974 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59833;

    public /* synthetic */ ViewOnLayoutChangeListenerC18974(int i, Object obj) {
        this.f59832 = i;
        this.f59833 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f59832) {
            case 0:
                ViewOnClickListenerC19121.m44087((ViewOnClickListenerC19121) this.f59833);
                break;
            default:
                ((CarouselLayoutManager) this.f59833).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
