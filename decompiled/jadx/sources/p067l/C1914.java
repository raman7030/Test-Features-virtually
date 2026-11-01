package p067l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩸ܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1914 {

    /* JADX INFO: renamed from: ۧ */
    public static final C1914 f72089;

    /* JADX INFO: renamed from: ֫ */
    public final C0899 f72090;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f72089 = C1109.f19574;
        } else {
            f72089 = C0899.f6932;
        }
    }

    public C1914(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f72090 = new C1109(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f72090 = new C0864(this, windowInsets);
        } else if (i >= 28) {
            this.f72090 = new C1809(this, windowInsets);
        } else {
            this.f72090 = new C1774(this, windowInsets);
        }
    }

    public C1914() {
        this.f72090 = new C0899(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1914 m51162(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1914 c1914 = new C1914(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c1914.m51168(C1717.m43586(view));
            c1914.m51166(view.getRootView());
        }
        return c1914;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final int m51172() {
        return this.f72090.mo6178().f36103;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۢ */
    public final int m51174() {
        return this.f72090.mo6178().f36105;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    public final int m51182() {
        return this.f72090.mo6178().f36104;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩻ */
    public final int m51183() {
        return this.f72090.mo6178().f36102;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۡ */
    public final boolean m51173() {
        return !this.f72090.mo6178().equals(C1388.f36101);
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m51178() {
        return this.f72090.mo6180();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public final C1914 m51179() {
        return this.f72090.mo6184();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final C1914 m51176() {
        return this.f72090.mo6182();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C1098 m51181() {
        return this.f72090.mo6186();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final C1914 m51164() {
        return this.f72090.mo6174();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܿ */
    public final C1388 m51180() {
        return this.f72090.mo6183();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܳ */
    public final C1388 m51177() {
        return this.f72090.mo4377();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1914 m51165(int i, int i2, int i3, int i4) {
        return this.f72090.mo4373(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1388 m51163(int i) {
        return this.f72090.mo6173(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1388 m51175(int i) {
        return this.f72090.mo6181(i);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m51170() {
        return this.f72090.mo6185(8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1914) {
            return C12826.equals(this.f72090, ((C1914) obj).f72090);
        }
        return false;
    }

    public final int hashCode() {
        C0899 c0899 = this.f72090;
        if (c0899 == null) {
            return 0;
        }
        return c0899.hashCode();
    }

    /* JADX INFO: renamed from: ۘ */
    public final WindowInsets m51171() {
        C0899 c0899 = this.f72090;
        if (c0899 instanceof C1039) {
            return ((C1039) c0899).f15416;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1388 m51161(C1388 c1388, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c1388.f36103 - i);
        int iMax2 = Math.max(0, c1388.f36105 - i2);
        int iMax3 = Math.max(0, c1388.f36104 - i3);
        int iMax4 = Math.max(0, c1388.f36102 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c1388 : C1388.m29403(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51169(C1388[] c1388Arr) {
        this.f72090.mo6177(c1388Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51167(C1388 c1388) {
        this.f72090.mo4374(c1388);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51168(C1914 c1914) {
        this.f72090.mo6176(c1914);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51166(View view) {
        this.f72090.mo6175(view);
    }
}
