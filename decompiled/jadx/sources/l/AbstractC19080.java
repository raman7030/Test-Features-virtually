package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19080 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60088;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public SparseArray f60089;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60090;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f60091;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60092;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Rect f60093;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f60094;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f60095;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Resources f60096;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f60097;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Drawable[] f60098;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f60099;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ColorFilter f60100;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8496 f60101;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60102;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ColorStateList f60103;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f60104;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60105;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60106;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60107;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f60108;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f60109;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f60111;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f60112;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f60113;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f60114;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60115;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60116;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f60118;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f60119;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f60120;

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo4949();

    public AbstractC19080(C1440 c1440, C8496 c8496, Resources resources) {
        Resources resources2;
        this.f60106 = false;
        this.f60113 = false;
        this.f60095 = true;
        this.f60108 = 0;
        this.f60117 = 0;
        this.f60101 = c8496;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = c1440 != null ? c1440.f60096 : null;
        }
        this.f60096 = resources2;
        int i = c1440 != null ? c1440.f60088 : 0;
        int i2 = C19786.f63891;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? DHParameters.DEFAULT_MINIMUM_LENGTH : i;
        this.f60088 = i;
        if (c1440 != null) {
            this.f60110 = c1440.f60110;
            this.f60116 = c1440.f60116;
            this.f60111 = true;
            this.f60102 = true;
            this.f60106 = c1440.f60106;
            this.f60113 = c1440.f60113;
            this.f60095 = c1440.f60095;
            this.f60092 = c1440.f60092;
            this.f60108 = c1440.f60108;
            this.f60117 = c1440.f60117;
            this.f60090 = c1440.f60090;
            this.f60100 = c1440.f60100;
            this.f60118 = c1440.f60118;
            this.f60103 = c1440.f60103;
            this.f60119 = c1440.f60119;
            this.f60115 = c1440.f60115;
            this.f60094 = c1440.f60094;
            if (c1440.f60088 == i) {
                if (c1440.f60120) {
                    this.f60093 = c1440.f60093 != null ? new Rect(c1440.f60093) : null;
                    this.f60120 = true;
                }
                if (c1440.f60112) {
                    this.f60114 = c1440.f60114;
                    this.f60099 = c1440.f60099;
                    this.f60091 = c1440.f60091;
                    this.f60109 = c1440.f60109;
                    this.f60112 = true;
                }
            }
            if (c1440.f60107) {
                this.f60104 = c1440.f60104;
                this.f60107 = true;
            }
            if (c1440.f60097) {
                this.f60097 = true;
            }
            Drawable[] drawableArr = c1440.f60098;
            this.f60098 = new Drawable[drawableArr.length];
            this.f60105 = c1440.f60105;
            SparseArray sparseArray = c1440.f60089;
            if (sparseArray != null) {
                this.f60089 = sparseArray.clone();
            } else {
                this.f60089 = new SparseArray(this.f60105);
            }
            int i3 = this.f60105;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f60089.put(i4, constantState);
                    } else {
                        this.f60098[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.f60098 = new Drawable[10];
        this.f60105 = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f60110 | this.f60116;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43972(Drawable drawable) {
        int i = this.f60105;
        if (i >= this.f60098.length) {
            int i2 = i + 10;
            C1440 c1440 = (C1440) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c1440.f60098;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c1440.f60098 = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(c1440.f5145, 0, iArr, 0, i);
            c1440.f5145 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f60101);
        this.f60098[i] = drawable;
        this.f60105++;
        this.f60116 = drawable.getChangingConfigurations() | this.f60116;
        this.f60107 = false;
        this.f60097 = false;
        this.f60093 = null;
        this.f60120 = false;
        this.f60112 = false;
        this.f60111 = false;
        return i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m43971() {
        SparseArray sparseArray = this.f60089;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f60089.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f60089.valueAt(i);
                Drawable[] drawableArr = this.f60098;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f60096);
                if (Build.VERSION.SDK_INT >= 23) {
                    C8184.m21681(drawableNewDrawable, this.f60092);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f60101);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f60089 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m43973(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f60098[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f60089;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f60089.valueAt(iIndexOfKey)).newDrawable(this.f60096);
        if (Build.VERSION.SDK_INT >= 23) {
            C8184.m21681(drawableNewDrawable, this.f60092);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f60101);
        this.f60098[i] = drawableMutate;
        this.f60089.removeAt(iIndexOfKey);
        if (this.f60089.size() == 0) {
            this.f60089 = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43974(Resources.Theme theme) {
        if (theme != null) {
            m43971();
            int i = this.f60105;
            Drawable[] drawableArr = this.f60098;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C8184.m21680(drawable)) {
                    C8184.m21677(drawableArr[i2], theme);
                    this.f60116 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                this.f60096 = resources;
                int i3 = C19786.f63891;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                }
                int i5 = this.f60088;
                this.f60088 = i4;
                if (i5 != i4) {
                    this.f60112 = false;
                    this.f60120 = false;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f60105;
        Drawable[] drawableArr = this.f60098;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (C8184.m21680(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f60089.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect m43977() {
        Rect rect = null;
        if (this.f60106) {
            return null;
        }
        Rect rect2 = this.f60093;
        if (rect2 != null || this.f60120) {
            return rect2;
        }
        m43971();
        Rect rect3 = new Rect();
        int i = this.f60105;
        Drawable[] drawableArr = this.f60098;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getPadding(rect3)) {
                if (rect == null) {
                    rect = new Rect(0, 0, 0, 0);
                }
                int i3 = rect3.left;
                if (i3 > rect.left) {
                    rect.left = i3;
                }
                int i4 = rect3.top;
                if (i4 > rect.top) {
                    rect.top = i4;
                }
                int i5 = rect3.right;
                if (i5 > rect.right) {
                    rect.right = i5;
                }
                int i6 = rect3.bottom;
                if (i6 > rect.bottom) {
                    rect.bottom = i6;
                }
            }
        }
        this.f60120 = true;
        this.f60093 = rect;
        return rect;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43976() {
        this.f60112 = true;
        m43971();
        int i = this.f60105;
        Drawable[] drawableArr = this.f60098;
        this.f60099 = -1;
        this.f60114 = -1;
        this.f60109 = 0;
        this.f60091 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f60114) {
                this.f60114 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f60099) {
                this.f60099 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f60091) {
                this.f60091 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f60109) {
                this.f60109 = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m43978() {
        if (this.f60107) {
            return this.f60104;
        }
        m43971();
        int i = this.f60105;
        Drawable[] drawableArr = this.f60098;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f60104 = opacity;
        this.f60107 = true;
        return opacity;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43975() {
        if (this.f60111) {
            return this.f60102;
        }
        m43971();
        this.f60111 = true;
        int i = this.f60105;
        Drawable[] drawableArr = this.f60098;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f60102 = false;
                return false;
            }
        }
        this.f60102 = true;
        return true;
    }
}
