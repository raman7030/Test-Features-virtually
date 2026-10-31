package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11079 extends C2095 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public String f33262;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f33263;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f33264;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public Drawable f33265;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public String f33266;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public String f33267;

    public AbstractC11079(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29908, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f33264 = string;
        if (string == null) {
            this.f33264 = m6909();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f33262 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f33265 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f33266 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f33267 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f33263 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC11079(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC11079(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public AbstractC11079(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m27491() {
        return this.f33264;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final String m27489() {
        return this.f33262;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m27488() {
        return this.f33265;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final String m27487() {
        return this.f33266;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final String m27486() {
        return this.f33267;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m27490() {
        return this.f33263;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۛ */
    public void mo6908() {
        m6935().m41270(this);
    }
}
