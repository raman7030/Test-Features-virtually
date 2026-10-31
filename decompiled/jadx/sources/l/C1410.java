package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1410 extends AbstractC21872 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public String f5075;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public String f5076;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final C5644 f5077;

    public C1410(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5077 = new C5644(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29901, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m49259(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m49258(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f5075 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo6922();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f5076 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo6922();
        m49255(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1410(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C1410(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1410(Context context) {
        this(context, null);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        m4900(c21167.m48107(R.id.MT_Protector));
        m49257(c21167.m48107(android.R.id.summary));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2791(View view) {
        super.mo2791(view);
        if (((AccessibilityManager) m6886().getSystemService("accessibility")).isEnabled()) {
            m4900(view.findViewById(R.id.MT_Protector));
            m49257(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m4900(View view) {
        boolean z = view instanceof C2978;
        if (z) {
            ((C2978) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f70046);
        }
        if (z) {
            C2978 c2978 = (C2978) view;
            c2978.setTextOn(this.f5075);
            c2978.setTextOff(this.f5076);
            c2978.setOnCheckedChangeListener(this.f5077);
        }
    }
}
