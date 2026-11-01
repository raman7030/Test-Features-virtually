package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩳۡ */
/* JADX INFO: compiled from: A4X8 */
/* JADX INFO: loaded from: classes4.dex */
public class C1732 extends ImageView {
    public final C1943 mBackgroundTintHelper;
    public boolean mHasLevel;
    public final C1662 mImageHelper;

    public C1732(Context context) {
        this(context, null);
    }

    public C1732(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        this.mHasLevel = false;
        C1480.m33375(getContext(), this);
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C1662 c1662 = new C1662(this);
        this.mImageHelper = c1662;
        c1662.m41125(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41121(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null && drawable != null && !this.mHasLevel) {
            c1662.m41124(drawable);
        }
        super.setImageDrawable(drawable);
        C1662 c1663 = this.mImageHelper;
        if (c1663 != null) {
            c1663.m41126();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m41120();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41126();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41126();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52168(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52167();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52165(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52169();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41122(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            return c1662.m41127();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41123(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            return c1662.m41129();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52162();
        }
        C1662 c1662 = this.mImageHelper;
        if (c1662 != null) {
            c1662.m41126();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m41128() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }
}
