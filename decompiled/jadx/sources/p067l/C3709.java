package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3709 extends AbstractC23156 {

    /* JADX INFO: renamed from: ֫ۧ */
    public String f7846;

    /* JADX INFO: renamed from: ۟֫ */
    public String f7847;

    /* JADX INFO: renamed from: ܰ֫ */
    public final C7733 f7848;

    public C3709(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7848 = new C7733(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32858, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m51611(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m51610(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f7846 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo9048();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f7847 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo9048();
        m51607(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3709(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C3709(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C3709(Context context) {
        this(context, null);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        m7139(c22486.m50437(R.id.MT_Protector));
        m51609(c22486.m50437(android.R.id.summary));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5136(View view) {
        super.mo5136(view);
        if (((AccessibilityManager) m9012().getSystemService("accessibility")).isEnabled()) {
            m7139(view.findViewById(R.id.MT_Protector));
            m51609(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ */
    private void m7139(View view) {
        boolean z = view instanceof C0990;
        if (z) {
            ((C0990) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72756);
        }
        if (z) {
            C0990 c0990 = (C0990) view;
            c0990.setTextOn(this.f7846);
            c0990.setTextOff(this.f7847);
            c0990.setOnCheckedChangeListener(this.f7848);
        }
    }
}
