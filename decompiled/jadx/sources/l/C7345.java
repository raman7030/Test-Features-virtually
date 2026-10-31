package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public class C7345 extends AbstractC21872 {

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final C13694 f22564;

    public C7345(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f22564 = new C13694(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29905, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        m49259(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        m49258(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        m49255(typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C7345(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.checkBoxPreferenceStyle));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        m19709(c21167.m48107(android.R.id.checkbox));
        m49257(c21167.m48107(android.R.id.summary));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2791(View view) {
        super.mo2791(view);
        if (((AccessibilityManager) m6886().getSystemService("accessibility")).isEnabled()) {
            m19709(view.findViewById(android.R.id.checkbox));
            m49257(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m19709(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f70046);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f22564);
        }
    }
}
