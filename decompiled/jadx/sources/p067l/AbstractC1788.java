package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ᩴ᩻ */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1788 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֡ */
    public int f63322;

    /* JADX INFO: renamed from: ֨ */
    public SparseArray f63323;

    /* JADX INFO: renamed from: ֫ */
    public boolean f63324;

    /* JADX INFO: renamed from: ۖ */
    public int f63325;

    /* JADX INFO: renamed from: ۗ */
    public int f63326;

    /* JADX INFO: renamed from: ۘ */
    public Rect f63327;

    /* JADX INFO: renamed from: ۙ */
    public boolean f63328;

    /* JADX INFO: renamed from: ۚ */
    public boolean f63329;

    /* JADX INFO: renamed from: ۛ */
    public Resources f63330;

    /* JADX INFO: renamed from: ۜ */
    public boolean f63331;

    /* JADX INFO: renamed from: ۠ */
    public Drawable[] f63332;

    /* JADX INFO: renamed from: ۡ */
    public int f63333;

    /* JADX INFO: renamed from: ۢ */
    public ColorFilter f63334;

    /* JADX INFO: renamed from: ۤ */
    public final C1263 f63335;

    /* JADX INFO: renamed from: ۧ */
    public boolean f63336;

    /* JADX INFO: renamed from: ۨ */
    public ColorStateList f63337;

    /* JADX INFO: renamed from: ۫ */
    public int f63338;

    /* JADX INFO: renamed from: ۬ */
    public int f63339;

    /* JADX INFO: renamed from: ܰ */
    public boolean f63340;

    /* JADX INFO: renamed from: ܳ */
    public boolean f63341;

    /* JADX INFO: renamed from: ܶ */
    public int f63342;

    /* JADX INFO: renamed from: ܺ */
    public int f63343;

    /* JADX INFO: renamed from: ܽ */
    public int f63344;

    /* JADX INFO: renamed from: ܿ */
    public boolean f63345;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f63346;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f63347;

    /* JADX INFO: renamed from: ᩵ */
    public int f63348;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f63349;

    /* JADX INFO: renamed from: ᩷ */
    public int f63350;

    /* JADX INFO: renamed from: ᩸ */
    public int f63351;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f63352;

    /* JADX INFO: renamed from: ᩺ */
    public PorterDuff.Mode f63353;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f63354;

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo7192();

    public AbstractC1788(C0913 c0913, C1263 c1263, Resources resources) {
        Resources resources2;
        this.f63340 = false;
        this.f63347 = false;
        this.f63329 = true;
        this.f63342 = 0;
        this.f63351 = 0;
        this.f63335 = c1263;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = c0913 != null ? c0913.f63330 : null;
        }
        this.f63330 = resources2;
        int i = c0913 != null ? c0913.f63322 : 0;
        int i2 = C1823.f66528;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? DHParameters.DEFAULT_MINIMUM_LENGTH : i;
        this.f63322 = i;
        if (c0913 != null) {
            this.f63344 = c0913.f63344;
            this.f63350 = c0913.f63350;
            this.f63345 = true;
            this.f63336 = true;
            this.f63340 = c0913.f63340;
            this.f63347 = c0913.f63347;
            this.f63329 = c0913.f63329;
            this.f63326 = c0913.f63326;
            this.f63342 = c0913.f63342;
            this.f63351 = c0913.f63351;
            this.f63324 = c0913.f63324;
            this.f63334 = c0913.f63334;
            this.f63352 = c0913.f63352;
            this.f63337 = c0913.f63337;
            this.f63353 = c0913.f63353;
            this.f63349 = c0913.f63349;
            this.f63328 = c0913.f63328;
            if (c0913.f63322 == i) {
                if (c0913.f63354) {
                    this.f63327 = c0913.f63327 != null ? new Rect(c0913.f63327) : null;
                    this.f63354 = true;
                }
                if (c0913.f63346) {
                    this.f63348 = c0913.f63348;
                    this.f63333 = c0913.f63333;
                    this.f63325 = c0913.f63325;
                    this.f63343 = c0913.f63343;
                    this.f63346 = true;
                }
            }
            if (c0913.f63341) {
                this.f63338 = c0913.f63338;
                this.f63341 = true;
            }
            if (c0913.f63331) {
                this.f63331 = true;
            }
            Drawable[] drawableArr = c0913.f63332;
            this.f63332 = new Drawable[drawableArr.length];
            this.f63339 = c0913.f63339;
            SparseArray sparseArray = c0913.f63323;
            if (sparseArray != null) {
                this.f63323 = sparseArray.clone();
            } else {
                this.f63323 = new SparseArray(this.f63339);
            }
            int i3 = this.f63339;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f63323.put(i4, constantState);
                    } else {
                        this.f63332[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.f63332 = new Drawable[10];
        this.f63339 = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f63344 | this.f63350;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46266(Drawable drawable) {
        int i = this.f63339;
        if (i >= this.f63332.length) {
            int i2 = i + 10;
            C0913 c0913 = (C0913) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c0913.f63332;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c0913.f63332 = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(c0913.f7918, 0, iArr, 0, i);
            c0913.f7918 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f63335);
        this.f63332[i] = drawable;
        this.f63339++;
        this.f63350 = drawable.getChangingConfigurations() | this.f63350;
        this.f63341 = false;
        this.f63331 = false;
        this.f63327 = null;
        this.f63354 = false;
        this.f63346 = false;
        this.f63345 = false;
        return i;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m46265() {
        SparseArray sparseArray = this.f63323;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f63323.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f63323.valueAt(i);
                Drawable[] drawableArr = this.f63332;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f63330);
                if (Build.VERSION.SDK_INT >= 23) {
                    C1248.m23650(drawableNewDrawable, this.f63326);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f63335);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f63323 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Drawable m46267(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f63332[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f63323;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f63323.valueAt(iIndexOfKey)).newDrawable(this.f63330);
        if (Build.VERSION.SDK_INT >= 23) {
            C1248.m23650(drawableNewDrawable, this.f63326);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f63335);
        this.f63332[i] = drawableMutate;
        this.f63323.removeAt(iIndexOfKey);
        if (this.f63323.size() == 0) {
            this.f63323 = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46268(Resources.Theme theme) {
        if (theme != null) {
            m46265();
            int i = this.f63339;
            Drawable[] drawableArr = this.f63332;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C1248.m23649(drawable)) {
                    C1248.m23646(drawableArr[i2], theme);
                    this.f63350 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                this.f63330 = resources;
                int i3 = C1823.f66528;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                }
                int i5 = this.f63322;
                this.f63322 = i4;
                if (i5 != i4) {
                    this.f63346 = false;
                    this.f63354 = false;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f63339;
        Drawable[] drawableArr = this.f63332;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (C1248.m23649(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f63323.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Rect m46271() {
        Rect rect = null;
        if (this.f63340) {
            return null;
        }
        Rect rect2 = this.f63327;
        if (rect2 != null || this.f63354) {
            return rect2;
        }
        m46265();
        Rect rect3 = new Rect();
        int i = this.f63339;
        Drawable[] drawableArr = this.f63332;
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
        this.f63354 = true;
        this.f63327 = rect;
        return rect;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46270() {
        this.f63346 = true;
        m46265();
        int i = this.f63339;
        Drawable[] drawableArr = this.f63332;
        this.f63333 = -1;
        this.f63348 = -1;
        this.f63343 = 0;
        this.f63325 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f63348) {
                this.f63348 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f63333) {
                this.f63333 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f63325) {
                this.f63325 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f63343) {
                this.f63343 = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m46272() {
        if (this.f63341) {
            return this.f63338;
        }
        m46265();
        int i = this.f63339;
        Drawable[] drawableArr = this.f63332;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f63338 = opacity;
        this.f63341 = true;
        return opacity;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46269() {
        if (this.f63345) {
            return this.f63336;
        }
        m46265();
        this.f63345 = true;
        int i = this.f63339;
        Drawable[] drawableArr = this.f63332;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f63336 = false;
                return false;
            }
        }
        this.f63336 = true;
        return true;
    }
}
