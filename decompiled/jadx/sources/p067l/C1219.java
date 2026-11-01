package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟ܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1219 implements InterfaceC1430 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f26404;

    public C1219(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f26404 = layoutInflaterFactory2C1110;
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final Context mo22329() {
        return this.f26404.m17370();
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ܽ */
    public final Drawable mo22333() {
        C1970 c1970M53128 = C1970.m53128(this.f26404.m17370(), (AttributeSet) null, new int[]{R.attr.MT_Protector});
        Drawable drawableM53148 = c1970M53128.m53148(0);
        c1970M53128.m53146();
        return drawableM53148;
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22332() {
        AbstractC1360 abstractC1360Mo17369 = this.f26404.mo17369();
        return (abstractC1360Mo17369 == null || (abstractC1360Mo17369.mo28328() & 4) == 0) ? false : true;
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final void mo22331(Drawable drawable, int i) {
        AbstractC1360 abstractC1360Mo17369 = this.f26404.mo17369();
        if (abstractC1360Mo17369 != null) {
            abstractC1360Mo17369.mo28318(drawable);
            abstractC1360Mo17369.mo28317(i);
        }
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final void mo22330(int i) {
        AbstractC1360 abstractC1360Mo17369 = this.f26404.mo17369();
        if (abstractC1360Mo17369 != null) {
            abstractC1360Mo17369.mo28317(0);
        }
    }
}
