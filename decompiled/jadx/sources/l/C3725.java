package l;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3725 extends AbstractC4990 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Method f11771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Method f11774;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f11778;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Method f11781;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f11772 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11779 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f11776 = null;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f11777 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11773 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f11764 = -1;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public View f11769 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f11780 = 0.1f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f11768 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f11770 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11765 = true;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f11766 = Float.NaN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f11763 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RectF f11775 = new RectF();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public RectF f11767 = new RectF();

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11329(HashMap map) {
        throw null;
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11330(HashSet hashSet) {
    }

    public C3725() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C2314.m7572(this, context.obtainStyledAttributes(attributeSet, C21840.f69978));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11315(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11327(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f11764 != -1) {
            if (this.f11769 == null) {
                this.f11769 = ((ViewGroup) view.getParent()).findViewById(this.f11764);
            }
            View view2 = this.f11769;
            boolean z6 = this.f11763;
            RectF rectF = this.f11775;
            m11315(rectF, view2, z6);
            boolean z7 = this.f11763;
            RectF rectF2 = this.f11767;
            m11315(rectF2, view, z7);
            if (rectF.intersect(rectF2)) {
                if (this.f11768) {
                    this.f11768 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f11765) {
                    this.f11765 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f11770 = true;
            } else {
                if (this.f11768) {
                    z = false;
                } else {
                    this.f11768 = true;
                    z = true;
                }
                if (this.f11770) {
                    this.f11770 = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f11765 = true;
                z3 = false;
            }
        } else {
            if (this.f11768) {
                float f6 = this.f11766;
                if ((this.f11778 - f6) * (f - f6) < 0.0f) {
                    this.f11768 = false;
                    z = true;
                }
                if (this.f11770) {
                    f4 = this.f11766;
                    f5 = f - f4;
                    if ((this.f11778 - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f11770 = false;
                        z2 = true;
                    }
                    if (this.f11765) {
                        f2 = this.f11766;
                        f3 = f - f2;
                        if ((this.f11778 - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f11765 = false;
                        }
                        z3 = z4;
                    } else {
                        if (Math.abs(f - this.f11766) > this.f11780) {
                            this.f11765 = true;
                        }
                        z3 = false;
                    }
                    z5 = z2;
                } else if (Math.abs(f - this.f11766) > this.f11780) {
                    this.f11770 = true;
                }
                z2 = false;
                if (this.f11765) {
                    f2 = this.f11766;
                    f3 = f - f2;
                    if ((this.f11778 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f11766) > this.f11780) {
                        this.f11765 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f11766) > this.f11780) {
                this.f11768 = true;
            }
            z = false;
            if (this.f11770) {
                f4 = this.f11766;
                f5 = f - f4;
                if ((this.f11778 - f4) * f5 >= 0.0f) {
                }
                if (this.f11765) {
                    f2 = this.f11766;
                    f3 = f - f2;
                    if ((this.f11778 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f11766) > this.f11780) {
                        this.f11765 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f11766) > this.f11780) {
                this.f11770 = true;
            }
            z2 = false;
            if (this.f11765) {
                f2 = this.f11766;
                f3 = f - f2;
                if ((this.f11778 - f2) * f3 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                z3 = z4;
            } else {
                if (Math.abs(f - this.f11766) > this.f11780) {
                    this.f11765 = true;
                }
                z3 = false;
            }
            z5 = z2;
        }
        this.f11778 = f;
        if (z5 || z || z3) {
            ((C10075) view.getParent()).m25312(f, z3, this.f11773);
        }
        if (this.f11779 != -1) {
            view = ((C10075) view.getParent()).findViewById(this.f11779);
        }
        if (z5 && this.f11776 != null) {
            if (this.f11771 == null) {
                try {
                    this.f11771 = view.getClass().getMethod(this.f11776, null);
                } catch (NoSuchMethodException unused) {
                    view.getClass();
                    C0050.m933(view);
                }
            }
            try {
                this.f11771.invoke(view, null);
            } catch (Exception unused2) {
                view.getClass();
                C0050.m933(view);
            }
        }
        if (z3 && this.f11777 != null) {
            if (this.f11774 == null) {
                try {
                    this.f11774 = view.getClass().getMethod(this.f11777, null);
                } catch (NoSuchMethodException unused3) {
                    view.getClass();
                    C0050.m933(view);
                }
            }
            try {
                this.f11774.invoke(view, null);
            } catch (Exception unused4) {
                view.getClass();
                C0050.m933(view);
            }
        }
        if (!z || this.f11772 == null) {
            return;
        }
        if (this.f11781 == null) {
            try {
                this.f11781 = view.getClass().getMethod(this.f11772, null);
            } catch (NoSuchMethodException unused5) {
                view.getClass();
                C0050.m933(view);
            }
        }
        try {
            this.f11781.invoke(view, null);
        } catch (Exception unused6) {
            view.getClass();
            C0050.m933(view);
        }
    }
}
