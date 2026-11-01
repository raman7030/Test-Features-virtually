package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ֨ */
/* JADX INFO: compiled from: K1CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1511 {

    /* JADX INFO: renamed from: ֡ */
    public float f43307;

    /* JADX INFO: renamed from: ֨ */
    public float f43308;

    /* JADX INFO: renamed from: ۖ */
    public int f43310;

    /* JADX INFO: renamed from: ۘ */
    public int f43311;

    /* JADX INFO: renamed from: ۚ */
    public float f43312;

    /* JADX INFO: renamed from: ۜ */
    public int f43313;

    /* JADX INFO: renamed from: ۠ */
    public int f43314;

    /* JADX INFO: renamed from: ۡ */
    public final C1342 f43315;

    /* JADX INFO: renamed from: ۢ */
    public float f43316;

    /* JADX INFO: renamed from: ۧ */
    public float f43317;

    /* JADX INFO: renamed from: ܳ */
    public float f43318;

    /* JADX INFO: renamed from: ܶ */
    public int f43319;

    /* JADX INFO: renamed from: ܺ */
    public boolean f43320;

    /* JADX INFO: renamed from: ܿ */
    public int f43322;

    /* JADX INFO: renamed from: ᩳ */
    public float f43323;

    /* JADX INFO: renamed from: ᩴ */
    public int f43324;

    /* JADX INFO: renamed from: ᩵ */
    public float f43325;

    /* JADX INFO: renamed from: ᩷ */
    public float f43326;

    /* JADX INFO: renamed from: ᩻ */
    public float f43327;

    /* JADX INFO: renamed from: ᩹ */
    public static final float[][] f43306 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: ᩸ */
    public static final float[][] f43305 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: ܽ */
    public boolean f43321 = false;

    /* JADX INFO: renamed from: ֫ */
    public float[] f43309 = new float[2];

    public C1511(Context context, C1342 c1342, XmlResourceParser xmlResourceParser) {
        this.f43324 = 0;
        this.f43319 = 0;
        this.f43310 = 0;
        this.f43311 = -1;
        this.f43314 = -1;
        this.f43313 = -1;
        this.f43307 = 0.5f;
        this.f43325 = 0.5f;
        this.f43312 = 0.0f;
        this.f43308 = 1.0f;
        this.f43316 = 4.0f;
        this.f43326 = 1.2f;
        this.f43320 = true;
        this.f43317 = 1.0f;
        this.f43322 = 0;
        this.f43323 = 10.0f;
        this.f43315 = c1342;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72686);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.f43311 = typedArrayObtainStyledAttributes.getResourceId(index, this.f43311);
            } else if (index == 10) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f43324);
                this.f43324 = i2;
                float[] fArr = f43306[i2];
                this.f43325 = fArr[0];
                this.f43307 = fArr[1];
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f43319);
                this.f43319 = i3;
                float[] fArr2 = f43305[i3];
                this.f43312 = fArr2[0];
                this.f43308 = fArr2[1];
            } else if (index == 5) {
                this.f43316 = typedArrayObtainStyledAttributes.getFloat(index, this.f43316);
            } else if (index == 4) {
                this.f43326 = typedArrayObtainStyledAttributes.getFloat(index, this.f43326);
            } else if (index == 6) {
                this.f43320 = typedArrayObtainStyledAttributes.getBoolean(index, this.f43320);
            } else if (index == 1) {
                this.f43317 = typedArrayObtainStyledAttributes.getFloat(index, this.f43317);
            } else if (index == 2) {
                this.f43323 = typedArrayObtainStyledAttributes.getFloat(index, this.f43323);
            } else if (index == 11) {
                this.f43314 = typedArrayObtainStyledAttributes.getResourceId(index, this.f43314);
            } else if (index == 8) {
                this.f43310 = typedArrayObtainStyledAttributes.getInt(index, this.f43310);
            } else if (index == 7) {
                this.f43322 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f43313 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34604(boolean z) {
        float[][] fArr = f43306;
        float[][] fArr2 = f43305;
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
        float[] fArr3 = fArr[this.f43324];
        this.f43325 = fArr3[0];
        this.f43307 = fArr3[1];
        float[] fArr4 = fArr2[this.f43319];
        this.f43312 = fArr4[0];
        this.f43308 = fArr4[1];
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34609(float f, float f2) {
        this.f43318 = f;
        this.f43327 = f2;
        this.f43321 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34603(MotionEvent motionEvent, InterfaceC1832 interfaceC1832) {
        int i;
        C1342 c1342;
        char c;
        float f;
        C1062 c1062 = (C1062) interfaceC1832;
        VelocityTracker velocityTracker = c1062.f16989;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f43318 = motionEvent.getRawX();
            this.f43327 = motionEvent.getRawY();
            this.f43321 = false;
            return;
        }
        float[] fArr = this.f43309;
        C1342 c1343 = this.f43315;
        if (action == 1) {
            this.f43321 = false;
            VelocityTracker velocityTracker2 = c1062.f16989;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = c1062.f16989;
            float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
            VelocityTracker velocityTracker4 = c1062.f16989;
            float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
            float f2 = c1343.f33304;
            int i2 = this.f43311;
            if (i2 != -1) {
                c1343.m27333(i2, f2, this.f43325, this.f43307, fArr);
            } else {
                float fMin = Math.min(c1343.getWidth(), c1343.getHeight());
                fArr[1] = this.f43308 * fMin;
                fArr[0] = fMin * this.f43312;
            }
            float f3 = this.f43312 != 0.0f ? xVelocity / fArr[0] : yVelocity / fArr[1];
            float f4 = !Float.isNaN(f3) ? (f3 / 3.0f) + f2 : f2;
            if (f4 == 0.0f || f4 == 1.0f || (i = this.f43310) == 3) {
                if (0.0f >= f4 || 1.0f <= f4) {
                    c1343.m27336(EnumC1447.FINISHED);
                    return;
                }
                return;
            }
            c1343.m27330(((double) f4) < 0.5d ? 0.0f : 1.0f, f3, i);
            if (0.0f >= f2 || 1.0f <= f2) {
                c1343.m27336(EnumC1447.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f43327;
        float rawX = motionEvent.getRawX() - this.f43318;
        if (Math.abs((this.f43308 * rawY) + (this.f43312 * rawX)) > this.f43323 || this.f43321) {
            float f5 = c1343.f33304;
            if (!this.f43321) {
                this.f43321 = true;
                c1343.m27340(f5);
            }
            int i3 = this.f43311;
            if (i3 != -1) {
                c = 1;
                c1342 = c1343;
                this.f43315.m27333(i3, f5, this.f43325, this.f43307, fArr);
            } else {
                c1342 = c1343;
                c = 1;
                float fMin2 = Math.min(c1342.getWidth(), c1342.getHeight());
                fArr[1] = this.f43308 * fMin2;
                fArr[0] = fMin2 * this.f43312;
            }
            if (Math.abs(((this.f43308 * fArr[c]) + (this.f43312 * fArr[0])) * this.f43317) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[c] = 0.01f;
            }
            if (this.f43312 != 0.0f) {
                f = rawX / fArr[0];
            } else {
                f = rawY / fArr[c];
            }
            float fMax = Math.max(Math.min(f5 + f, 1.0f), 0.0f);
            if (fMax != c1342.f33304) {
                c1342.m27340(fMax);
                VelocityTracker velocityTracker5 = c1062.f16989;
                if (velocityTracker5 != null) {
                    velocityTracker5.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker6 = c1062.f16989;
                float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                VelocityTracker velocityTracker7 = c1062.f16989;
                c1342.f33302 = this.f43312 != 0.0f ? xVelocity2 / fArr[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / fArr[c];
            } else {
                c1342.f33302 = 0.0f;
            }
            this.f43318 = motionEvent.getRawX();
            this.f43327 = motionEvent.getRawY();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m34613(float f, float f2) {
        this.f43318 = f;
        this.f43327 = f2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34614(float f, float f2) {
        this.f43321 = false;
        C1342 c1342 = this.f43315;
        float f3 = c1342.f33304;
        c1342.m27333(this.f43311, f3, this.f43325, this.f43307, this.f43309);
        float f4 = this.f43312;
        float[] fArr = this.f43309;
        float f5 = f4 != 0.0f ? (f * f4) / fArr[0] : (f2 * this.f43308) / fArr[1];
        if (!Float.isNaN(f5)) {
            f3 += f5 / 3.0f;
        }
        if (f3 != 0.0f) {
            boolean z = f3 != 1.0f;
            int i = this.f43310;
            if (z && (i != 3)) {
                this.f43315.m27330(((double) f3) >= 0.5d ? 1.0f : 0.0f, f5, i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34608() {
        View viewFindViewById;
        int i = this.f43311;
        if (i != -1) {
            C1342 c1342 = this.f43315;
            viewFindViewById = c1342.findViewById(i);
            if (viewFindViewById == null) {
                C0845.m3341(c1342.getContext(), this.f43311);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C2458) {
            C2458 c2458 = (C2458) viewFindViewById;
            c2458.setOnTouchListener(new ViewOnTouchListenerC1406());
            c2458.m3462(new C1966());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m34605() {
        return this.f43326;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m34610() {
        return this.f43316;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m34615() {
        return this.f43320;
    }

    /* JADX INFO: renamed from: ۧ */
    public final RectF m34607(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f43314;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m34612() {
        return this.f43314;
    }

    /* JADX INFO: renamed from: ֫ */
    public final RectF m34602(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f43313;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m34600(float f, float f2) {
        return (f2 * this.f43308) + (f * this.f43312);
    }

    public final String toString() {
        return this.f43312 + " , " + this.f43308;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34601() {
        return this.f43322;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m34606(float f, float f2) {
        C1342 c1342 = this.f43315;
        c1342.m27333(this.f43311, c1342.f33304, this.f43325, this.f43307, this.f43309);
        float f3 = this.f43312;
        float[] fArr = this.f43309;
        if (f3 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f2 * this.f43308) / fArr[1];
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34611(float f, float f2) {
        float f3;
        C1342 c1342 = this.f43315;
        float f4 = c1342.f33304;
        if (!this.f43321) {
            this.f43321 = true;
            c1342.m27340(f4);
        }
        float f5 = this.f43325;
        float f6 = this.f43307;
        C1342 c1343 = this.f43315;
        int i = this.f43311;
        float[] fArr = this.f43309;
        c1343.m27333(i, f4, f5, f6, fArr);
        if (Math.abs((this.f43308 * fArr[1]) + (this.f43312 * fArr[0])) < 0.01d) {
            fArr[0] = 0.01f;
            fArr[1] = 0.01f;
        }
        float f7 = this.f43312;
        if (f7 != 0.0f) {
            f3 = (f * f7) / fArr[0];
        } else {
            f3 = (f2 * this.f43308) / fArr[1];
        }
        float fMax = Math.max(Math.min(f4 + f3, 1.0f), 0.0f);
        if (fMax != c1342.f33304) {
            c1342.m27340(fMax);
        }
    }
}
