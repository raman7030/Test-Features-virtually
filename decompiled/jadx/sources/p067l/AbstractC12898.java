package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12898 extends C4360 {

    /* JADX INFO: renamed from: ۛ֫ */
    public String f36263;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f36264;

    /* JADX INFO: renamed from: ۨ֫ */
    public CharSequence f36265;

    /* JADX INFO: renamed from: ۫֫ */
    public Drawable f36266;

    /* JADX INFO: renamed from: ܰ֫ */
    public String f36267;

    /* JADX INFO: renamed from: ᩺֫ */
    public String f36268;

    public AbstractC12898(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32865, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f36265 = string;
        if (string == null) {
            this.f36265 = m9035();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f36263 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f36266 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f36267 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f36268 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f36264 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC12898(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC12898(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public AbstractC12898(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final CharSequence m29553() {
        return this.f36265;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final String m29551() {
        return this.f36263;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final Drawable m29550() {
        return this.f36266;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final String m29549() {
        return this.f36267;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final String m29548() {
        return this.f36268;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m29552() {
        return this.f36264;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۛ */
    public void mo9034() {
        m9061().m43516(this);
    }
}
