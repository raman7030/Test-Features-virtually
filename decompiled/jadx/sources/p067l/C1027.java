package p067l;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘۚ */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1027 extends AbstractC1090 {

    /* JADX INFO: renamed from: ۢ */
    public Method f14578;

    /* JADX INFO: renamed from: ܺ */
    public Method f14581;

    /* JADX INFO: renamed from: ᩷ */
    public float f14585;

    /* JADX INFO: renamed from: ᩻ */
    public Method f14588;

    /* JADX INFO: renamed from: ܳ */
    public String f14579 = null;

    /* JADX INFO: renamed from: ᩸ */
    public int f14586 = -1;

    /* JADX INFO: renamed from: ᩴ */
    public String f14583 = null;

    /* JADX INFO: renamed from: ᩵ */
    public String f14584 = null;

    /* JADX INFO: renamed from: ܶ */
    public int f14580 = -1;

    /* JADX INFO: renamed from: ֨ */
    public int f14571 = -1;

    /* JADX INFO: renamed from: ۠ */
    public View f14576 = null;

    /* JADX INFO: renamed from: ᩹ */
    public float f14587 = 0.1f;

    /* JADX INFO: renamed from: ۜ */
    public boolean f14575 = true;

    /* JADX INFO: renamed from: ۡ */
    public boolean f14577 = true;

    /* JADX INFO: renamed from: ۖ */
    public boolean f14572 = true;

    /* JADX INFO: renamed from: ۘ */
    public float f14573 = Float.NaN;

    /* JADX INFO: renamed from: ֡ */
    public boolean f14570 = false;

    /* JADX INFO: renamed from: ܿ */
    public RectF f14582 = new RectF();

    /* JADX INFO: renamed from: ۚ */
    public RectF f14574 = new RectF();

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13281(HashMap map) {
        throw null;
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13282(HashSet hashSet) {
    }

    public C1027() {
        this.f18544 = new HashMap();
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13280(Context context, AttributeSet attributeSet) {
        C0957.m9642(this, context.obtainStyledAttributes(attributeSet, C1925.f72687));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13267(RectF rectF, View view, boolean z) {
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
    /* JADX INFO: renamed from: ֫ */
    public final void m13279(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f14571 != -1) {
            if (this.f14576 == null) {
                this.f14576 = ((ViewGroup) view.getParent()).findViewById(this.f14571);
            }
            View view2 = this.f14576;
            boolean z6 = this.f14570;
            RectF rectF = this.f14582;
            m13267(rectF, view2, z6);
            boolean z7 = this.f14570;
            RectF rectF2 = this.f14574;
            m13267(rectF2, view, z7);
            if (rectF.intersect(rectF2)) {
                if (this.f14575) {
                    this.f14575 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f14572) {
                    this.f14572 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f14577 = true;
            } else {
                if (this.f14575) {
                    z = false;
                } else {
                    this.f14575 = true;
                    z = true;
                }
                if (this.f14577) {
                    this.f14577 = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f14572 = true;
                z3 = false;
            }
        } else {
            if (this.f14575) {
                float f6 = this.f14573;
                if ((this.f14585 - f6) * (f - f6) < 0.0f) {
                    this.f14575 = false;
                    z = true;
                }
                if (this.f14577) {
                    f4 = this.f14573;
                    f5 = f - f4;
                    if ((this.f14585 - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f14577 = false;
                        z2 = true;
                    }
                    if (this.f14572) {
                        f2 = this.f14573;
                        f3 = f - f2;
                        if ((this.f14585 - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f14572 = false;
                        }
                        z3 = z4;
                    } else {
                        if (Math.abs(f - this.f14573) > this.f14587) {
                            this.f14572 = true;
                        }
                        z3 = false;
                    }
                    z5 = z2;
                } else if (Math.abs(f - this.f14573) > this.f14587) {
                    this.f14577 = true;
                }
                z2 = false;
                if (this.f14572) {
                    f2 = this.f14573;
                    f3 = f - f2;
                    if ((this.f14585 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f14573) > this.f14587) {
                        this.f14572 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f14573) > this.f14587) {
                this.f14575 = true;
            }
            z = false;
            if (this.f14577) {
                f4 = this.f14573;
                f5 = f - f4;
                if ((this.f14585 - f4) * f5 >= 0.0f) {
                }
                if (this.f14572) {
                    f2 = this.f14573;
                    f3 = f - f2;
                    if ((this.f14585 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f14573) > this.f14587) {
                        this.f14572 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f14573) > this.f14587) {
                this.f14577 = true;
            }
            z2 = false;
            if (this.f14572) {
                f2 = this.f14573;
                f3 = f - f2;
                if ((this.f14585 - f2) * f3 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                z3 = z4;
            } else {
                if (Math.abs(f - this.f14573) > this.f14587) {
                    this.f14572 = true;
                }
                z3 = false;
            }
            z5 = z2;
        }
        this.f14585 = f;
        if (z5 || z || z3) {
            ((C1342) view.getParent()).m27331(f, z3, this.f14580);
        }
        if (this.f14586 != -1) {
            view = ((C1342) view.getParent()).findViewById(this.f14586);
        }
        if (z5 && this.f14583 != null) {
            if (this.f14578 == null) {
                try {
                    this.f14578 = view.getClass().getMethod(this.f14583, null);
                } catch (NoSuchMethodException unused) {
                    view.getClass();
                    C0845.m3343(view);
                }
            }
            try {
                this.f14578.invoke(view, null);
            } catch (Exception unused2) {
                view.getClass();
                C0845.m3343(view);
            }
        }
        if (z3 && this.f14584 != null) {
            if (this.f14581 == null) {
                try {
                    this.f14581 = view.getClass().getMethod(this.f14584, null);
                } catch (NoSuchMethodException unused3) {
                    view.getClass();
                    C0845.m3343(view);
                }
            }
            try {
                this.f14581.invoke(view, null);
            } catch (Exception unused4) {
                view.getClass();
                C0845.m3343(view);
            }
        }
        if (!z || this.f14579 == null) {
            return;
        }
        if (this.f14588 == null) {
            try {
                this.f14588 = view.getClass().getMethod(this.f14579, null);
            } catch (NoSuchMethodException unused5) {
                view.getClass();
                C0845.m3343(view);
            }
        }
        try {
            this.f14588.invoke(view, null);
        } catch (Exception unused6) {
            view.getClass();
            C0845.m3343(view);
        }
    }
}
