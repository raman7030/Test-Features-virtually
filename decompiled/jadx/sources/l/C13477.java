package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K1CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13477 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f40237;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f40238;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f40240;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f40241;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f40242;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40243;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f40244;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10075 f40245;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f40246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f40247;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f40248;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f40249;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f40250;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40252;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f40253;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f40254;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f40255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f40256;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f40257;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final float[][] f40236 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final float[][] f40235 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40251 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f40239 = new float[2];

    public C13477(Context context, C10075 c10075, XmlResourceParser xmlResourceParser) {
        this.f40254 = 0;
        this.f40249 = 0;
        this.f40240 = 0;
        this.f40241 = -1;
        this.f40244 = -1;
        this.f40243 = -1;
        this.f40237 = 0.5f;
        this.f40255 = 0.5f;
        this.f40242 = 0.0f;
        this.f40238 = 1.0f;
        this.f40246 = 4.0f;
        this.f40256 = 1.2f;
        this.f40250 = true;
        this.f40247 = 1.0f;
        this.f40252 = 0;
        this.f40253 = 10.0f;
        this.f40245 = c10075;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69977);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.f40241 = typedArrayObtainStyledAttributes.getResourceId(index, this.f40241);
            } else if (index == 10) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f40254);
                this.f40254 = i2;
                float[] fArr = f40236[i2];
                this.f40255 = fArr[0];
                this.f40237 = fArr[1];
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f40249);
                this.f40249 = i3;
                float[] fArr2 = f40235[i3];
                this.f40242 = fArr2[0];
                this.f40238 = fArr2[1];
            } else if (index == 5) {
                this.f40246 = typedArrayObtainStyledAttributes.getFloat(index, this.f40246);
            } else if (index == 4) {
                this.f40256 = typedArrayObtainStyledAttributes.getFloat(index, this.f40256);
            } else if (index == 6) {
                this.f40250 = typedArrayObtainStyledAttributes.getBoolean(index, this.f40250);
            } else if (index == 1) {
                this.f40247 = typedArrayObtainStyledAttributes.getFloat(index, this.f40247);
            } else if (index == 2) {
                this.f40253 = typedArrayObtainStyledAttributes.getFloat(index, this.f40253);
            } else if (index == 11) {
                this.f40244 = typedArrayObtainStyledAttributes.getResourceId(index, this.f40244);
            } else if (index == 8) {
                this.f40240 = typedArrayObtainStyledAttributes.getInt(index, this.f40240);
            } else if (index == 7) {
                this.f40252 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f40243 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32502(boolean z) {
        float[][] fArr = f40236;
        float[][] fArr2 = f40235;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f40254];
        this.f40255 = fArr3[0];
        this.f40237 = fArr3[1];
        float[] fArr4 = fArr2[this.f40249];
        this.f40242 = fArr4[0];
        this.f40238 = fArr4[1];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32507(float f, float f2) {
        this.f40248 = f;
        this.f40257 = f2;
        this.f40251 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32501(MotionEvent motionEvent, InterfaceC19953 interfaceC19953) {
        int i;
        C10075 c10075;
        char c;
        float f;
        C4430 c4430 = (C4430) interfaceC19953;
        VelocityTracker velocityTracker = c4430.f14164;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f40248 = motionEvent.getRawX();
            this.f40257 = motionEvent.getRawY();
            this.f40251 = false;
            return;
        }
        float[] fArr = this.f40239;
        C10075 c10076 = this.f40245;
        if (action == 1) {
            this.f40251 = false;
            VelocityTracker velocityTracker2 = c4430.f14164;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = c4430.f14164;
            float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
            VelocityTracker velocityTracker4 = c4430.f14164;
            float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
            float f2 = c10076.f30343;
            int i2 = this.f40241;
            if (i2 != -1) {
                c10076.m25314(i2, f2, this.f40255, this.f40237, fArr);
            } else {
                float fMin = Math.min(c10076.getWidth(), c10076.getHeight());
                fArr[1] = this.f40238 * fMin;
                fArr[0] = fMin * this.f40242;
            }
            float f3 = this.f40242 != 0.0f ? xVelocity / fArr[0] : yVelocity / fArr[1];
            float f4 = !Float.isNaN(f3) ? (f3 / 3.0f) + f2 : f2;
            if (f4 == 0.0f || f4 == 1.0f || (i = this.f40240) == 3) {
                if (0.0f >= f4 || 1.0f <= f4) {
                    c10076.m25317(EnumC12191.FINISHED);
                    return;
                }
                return;
            }
            c10076.m25311(((double) f4) < 0.5d ? 0.0f : 1.0f, f3, i);
            if (0.0f >= f2 || 1.0f <= f2) {
                c10076.m25317(EnumC12191.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f40257;
        float rawX = motionEvent.getRawX() - this.f40248;
        if (Math.abs((this.f40238 * rawY) + (this.f40242 * rawX)) > this.f40253 || this.f40251) {
            float f5 = c10076.f30343;
            if (!this.f40251) {
                this.f40251 = true;
                c10076.m25321(f5);
            }
            int i3 = this.f40241;
            if (i3 != -1) {
                c = 1;
                c10075 = c10076;
                this.f40245.m25314(i3, f5, this.f40255, this.f40237, fArr);
            } else {
                c10075 = c10076;
                c = 1;
                float fMin2 = Math.min(c10075.getWidth(), c10075.getHeight());
                fArr[1] = this.f40238 * fMin2;
                fArr[0] = fMin2 * this.f40242;
            }
            if (Math.abs(((this.f40238 * fArr[c]) + (this.f40242 * fArr[0])) * this.f40247) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[c] = 0.01f;
            }
            if (this.f40242 != 0.0f) {
                f = rawX / fArr[0];
            } else {
                f = rawY / fArr[c];
            }
            float fMax = Math.max(Math.min(f5 + f, 1.0f), 0.0f);
            if (fMax != c10075.f30343) {
                c10075.m25321(fMax);
                VelocityTracker velocityTracker5 = c4430.f14164;
                if (velocityTracker5 != null) {
                    velocityTracker5.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker6 = c4430.f14164;
                float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                VelocityTracker velocityTracker7 = c4430.f14164;
                c10075.f30341 = this.f40242 != 0.0f ? xVelocity2 / fArr[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / fArr[c];
            } else {
                c10075.f30341 = 0.0f;
            }
            this.f40248 = motionEvent.getRawX();
            this.f40257 = motionEvent.getRawY();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32511(float f, float f2) {
        this.f40248 = f;
        this.f40257 = f2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32512(float f, float f2) {
        this.f40251 = false;
        C10075 c10075 = this.f40245;
        float f3 = c10075.f30343;
        c10075.m25314(this.f40241, f3, this.f40255, this.f40237, this.f40239);
        float f4 = this.f40242;
        float[] fArr = this.f40239;
        float f5 = f4 != 0.0f ? (f * f4) / fArr[0] : (f2 * this.f40238) / fArr[1];
        if (!Float.isNaN(f5)) {
            f3 += f5 / 3.0f;
        }
        if (f3 != 0.0f) {
            boolean z = f3 != 1.0f;
            int i = this.f40240;
            if (z && (i != 3)) {
                this.f40245.m25311(((double) f3) >= 0.5d ? 1.0f : 0.0f, f5, i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32506() {
        View viewFindViewById;
        int i = this.f40241;
        if (i != -1) {
            C10075 c10075 = this.f40245;
            viewFindViewById = c10075.findViewById(i);
            if (viewFindViewById == null) {
                C0050.m931(c10075.getContext(), this.f40241);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C0095) {
            C0095 c0095 = (C0095) viewFindViewById;
            c0095.setOnTouchListener(new ViewOnTouchListenerC11362());
            c0095.m1066(new C22650());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m32503() {
        return this.f40256;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m32508() {
        return this.f40246;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m32513() {
        return this.f40250;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF m32505(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f40244;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32510() {
        return this.f40244;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RectF m32500(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f40243;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m32498(float f, float f2) {
        return (f2 * this.f40238) + (f * this.f40242);
    }

    public final String toString() {
        return this.f40242 + " , " + this.f40238;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32499() {
        return this.f40252;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m32504(float f, float f2) {
        C10075 c10075 = this.f40245;
        c10075.m25314(this.f40241, c10075.f30343, this.f40255, this.f40237, this.f40239);
        float f3 = this.f40242;
        float[] fArr = this.f40239;
        if (f3 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f2 * this.f40238) / fArr[1];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32509(float f, float f2) {
        float f3;
        C10075 c10075 = this.f40245;
        float f4 = c10075.f30343;
        if (!this.f40251) {
            this.f40251 = true;
            c10075.m25321(f4);
        }
        float f5 = this.f40255;
        float f6 = this.f40237;
        C10075 c10076 = this.f40245;
        int i = this.f40241;
        float[] fArr = this.f40239;
        c10076.m25314(i, f4, f5, f6, fArr);
        if (Math.abs((this.f40238 * fArr[1]) + (this.f40242 * fArr[0])) < 0.01d) {
            fArr[0] = 0.01f;
            fArr[1] = 0.01f;
        }
        float f7 = this.f40242;
        if (f7 != 0.0f) {
            f3 = (f * f7) / fArr[0];
        } else {
            f3 = (f2 * this.f40238) / fArr[1];
        }
        float fMax = Math.max(Math.min(f4 + f3, 1.0f), 0.0f);
        if (fMax != c10075.f30343) {
            c10075.m25321(fMax);
        }
    }
}
