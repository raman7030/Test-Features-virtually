package p067l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ۚ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MF */
/* JADX INFO: loaded from: classes2.dex */
public final class C7653 {

    /* JADX INFO: renamed from: ֫ */
    public int f20035;

    /* JADX INFO: renamed from: ۖ */
    public Layout.Alignment f20036;

    /* JADX INFO: renamed from: ۘ */
    public String f20037;

    /* JADX INFO: renamed from: ۚ */
    public Layout.Alignment f20038;

    /* JADX INFO: renamed from: ۜ */
    public boolean f20039;

    /* JADX INFO: renamed from: ۠ */
    public C11006 f20040;

    /* JADX INFO: renamed from: ۢ */
    public String f20042;

    /* JADX INFO: renamed from: ܳ */
    public float f20044;

    /* JADX INFO: renamed from: ܽ */
    public String f20047;

    /* JADX INFO: renamed from: ܿ */
    public String f20048;

    /* JADX INFO: renamed from: ᩳ */
    public int f20049;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f20052;

    /* JADX INFO: renamed from: ܺ */
    public int f20046 = -1;

    /* JADX INFO: renamed from: ܶ */
    public int f20045 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f20043 = -1;

    /* JADX INFO: renamed from: ۡ */
    public int f20041 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public int f20053 = -1;

    /* JADX INFO: renamed from: ᩵ */
    public int f20051 = -1;

    /* JADX INFO: renamed from: ᩴ */
    public int f20050 = -1;

    /* JADX INFO: renamed from: ֨ */
    public int f20034 = -1;

    /* JADX INFO: renamed from: ֡ */
    public float f20033 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۖ */
    public final int m17646() {
        int i = this.f20043;
        if (i == -1 && this.f20041 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f20041 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m17637() {
        return this.f20046 == 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17664(boolean z) {
        this.f20046 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m17650() {
        return this.f20045 == 1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17667(boolean z) {
        this.f20045 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17645(boolean z) {
        this.f20043 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17658(boolean z) {
        this.f20041 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m17668() {
        return this.f20048;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17657(String str) {
        this.f20048 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m17661() {
        if (!this.f20052) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.f20049;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17655(int i) {
        this.f20049 = i;
        this.f20052 = true;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m17648() {
        return this.f20052;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17638() {
        if (!this.f20039) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.f20035;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17640(int i) {
        this.f20035 = i;
        this.f20039 = true;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m17636() {
        return this.f20039;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17654(float f) {
        this.f20033 = f;
    }

    /* JADX INFO: renamed from: ܺ */
    public final float m17660() {
        return this.f20033;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17643(C7653 c7653) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c7653 != null) {
            if (!this.f20052 && c7653.f20052) {
                m17655(c7653.f20049);
            }
            if (this.f20043 == -1) {
                this.f20043 = c7653.f20043;
            }
            if (this.f20041 == -1) {
                this.f20041 = c7653.f20041;
            }
            if (this.f20048 == null && (str = c7653.f20048) != null) {
                this.f20048 = str;
            }
            if (this.f20046 == -1) {
                this.f20046 = c7653.f20046;
            }
            if (this.f20045 == -1) {
                this.f20045 = c7653.f20045;
            }
            if (this.f20050 == -1) {
                this.f20050 = c7653.f20050;
            }
            if (this.f20038 == null && (alignment2 = c7653.f20038) != null) {
                this.f20038 = alignment2;
            }
            if (this.f20036 == null && (alignment = c7653.f20036) != null) {
                this.f20036 = alignment;
            }
            if (this.f20034 == -1) {
                this.f20034 = c7653.f20034;
            }
            if (this.f20053 == -1) {
                this.f20053 = c7653.f20053;
                this.f20044 = c7653.f20044;
            }
            if (this.f20040 == null) {
                this.f20040 = c7653.f20040;
            }
            if (this.f20033 == Float.MAX_VALUE) {
                this.f20033 = c7653.f20033;
            }
            if (this.f20037 == null) {
                this.f20037 = c7653.f20037;
            }
            if (this.f20047 == null) {
                this.f20047 = c7653.f20047;
            }
            if (!this.f20039 && c7653.f20039) {
                m17640(c7653.f20035);
            }
            if (this.f20051 != -1 || (i = c7653.f20051) == -1) {
                return;
            }
            this.f20051 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17663(String str) {
        this.f20042 = str;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m17675() {
        return this.f20042;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17666(int i) {
        this.f20051 = i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m17651() {
        return this.f20051;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17669(int i) {
        this.f20050 = i;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m17652() {
        return this.f20050;
    }

    /* JADX INFO: renamed from: ۘ */
    public final Layout.Alignment m17647() {
        return this.f20038;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17656(Layout.Alignment alignment) {
        this.f20038 = alignment;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Layout.Alignment m17649() {
        return this.f20036;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17641(Layout.Alignment alignment) {
        this.f20036 = alignment;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m17672() {
        return this.f20034 == 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17671(boolean z) {
        this.f20034 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C11006 m17673() {
        return this.f20040;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17644(C11006 c11006) {
        this.f20040 = c11006;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17639(float f) {
        this.f20044 = f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17662(int i) {
        this.f20053 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m17659() {
        return this.f20053;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m17665() {
        return this.f20044;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17670(String str) {
        this.f20037 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m17674() {
        return this.f20037;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17642(String str) {
        this.f20047 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m17653() {
        return this.f20047;
    }
}
