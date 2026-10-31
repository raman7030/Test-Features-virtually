package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4X8 */
/* JADX INFO: loaded from: classes4.dex */
public class C17939 extends ImageView {
    public final C22193 mBackgroundTintHelper;
    public boolean mHasLevel;
    public final C16527 mImageHelper;

    public C17939(Context context) {
        this(context, null);
    }

    public C17939(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17939(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        this.mHasLevel = false;
        C12855.m31289(getContext(), this);
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C16527 c16527 = new C16527(this);
        this.mImageHelper = c16527;
        c16527.m38899(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38895(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null && drawable != null && !this.mHasLevel) {
            c16527.m38898(drawable);
        }
        super.setImageDrawable(drawable);
        C16527 c16528 = this.mImageHelper;
        if (c16528 != null) {
            c16528.m38900();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m38894();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38900();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38900();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49841(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49840();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49838(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49842();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38896(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            return c16527.m38901();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38897(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            return c16527.m38903();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49835();
        }
        C16527 c16527 = this.mImageHelper;
        if (c16527 != null) {
            c16527.m38900();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m38902() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }
}
