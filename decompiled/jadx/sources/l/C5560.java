package l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ۚ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5560 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f17195;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f17196;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f17197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f17198;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f17199;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9088 f17200;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f17202;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f17204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f17207;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f17208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17209;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17212;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17206 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f17205 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17203 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f17201 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f17213 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f17211 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f17210 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17194 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f17193 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m15731() {
        int i = this.f17203;
        if (i == -1 && this.f17201 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f17201 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m15722() {
        return this.f17206 == 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15749(boolean z) {
        this.f17206 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m15735() {
        return this.f17205 == 1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15752(boolean z) {
        this.f17205 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15730(boolean z) {
        this.f17203 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15743(boolean z) {
        this.f17201 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m15753() {
        return this.f17208;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15742(String str) {
        this.f17208 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m15746() {
        if (!this.f17212) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.f17209;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15740(int i) {
        this.f17209 = i;
        this.f17212 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m15733() {
        return this.f17212;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15723() {
        if (!this.f17199) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.f17195;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15725(int i) {
        this.f17195 = i;
        this.f17199 = true;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m15721() {
        return this.f17199;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15739(float f) {
        this.f17193 = f;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m15745() {
        return this.f17193;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15728(C5560 c5560) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c5560 != null) {
            if (!this.f17212 && c5560.f17212) {
                m15740(c5560.f17209);
            }
            if (this.f17203 == -1) {
                this.f17203 = c5560.f17203;
            }
            if (this.f17201 == -1) {
                this.f17201 = c5560.f17201;
            }
            if (this.f17208 == null && (str = c5560.f17208) != null) {
                this.f17208 = str;
            }
            if (this.f17206 == -1) {
                this.f17206 = c5560.f17206;
            }
            if (this.f17205 == -1) {
                this.f17205 = c5560.f17205;
            }
            if (this.f17210 == -1) {
                this.f17210 = c5560.f17210;
            }
            if (this.f17198 == null && (alignment2 = c5560.f17198) != null) {
                this.f17198 = alignment2;
            }
            if (this.f17196 == null && (alignment = c5560.f17196) != null) {
                this.f17196 = alignment;
            }
            if (this.f17194 == -1) {
                this.f17194 = c5560.f17194;
            }
            if (this.f17213 == -1) {
                this.f17213 = c5560.f17213;
                this.f17204 = c5560.f17204;
            }
            if (this.f17200 == null) {
                this.f17200 = c5560.f17200;
            }
            if (this.f17193 == Float.MAX_VALUE) {
                this.f17193 = c5560.f17193;
            }
            if (this.f17197 == null) {
                this.f17197 = c5560.f17197;
            }
            if (this.f17207 == null) {
                this.f17207 = c5560.f17207;
            }
            if (!this.f17199 && c5560.f17199) {
                m15725(c5560.f17195);
            }
            if (this.f17211 != -1 || (i = c5560.f17211) == -1) {
                return;
            }
            this.f17211 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15748(String str) {
        this.f17202 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m15760() {
        return this.f17202;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15751(int i) {
        this.f17211 = i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m15736() {
        return this.f17211;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15754(int i) {
        this.f17210 = i;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m15737() {
        return this.f17210;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m15732() {
        return this.f17198;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15741(Layout.Alignment alignment) {
        this.f17198 = alignment;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m15734() {
        return this.f17196;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15726(Layout.Alignment alignment) {
        this.f17196 = alignment;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m15757() {
        return this.f17194 == 1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15756(boolean z) {
        this.f17194 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9088 m15758() {
        return this.f17200;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15729(C9088 c9088) {
        this.f17200 = c9088;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15724(float f) {
        this.f17204 = f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15747(int i) {
        this.f17213 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m15744() {
        return this.f17213;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m15750() {
        return this.f17204;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15755(String str) {
        this.f17197 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15759() {
        return this.f17197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15727(String str) {
        this.f17207 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m15738() {
        return this.f17207;
    }
}
