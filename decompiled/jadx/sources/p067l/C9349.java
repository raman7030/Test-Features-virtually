package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public class C9349 extends AbstractC23156 {

    /* JADX INFO: renamed from: ܰ֫ */
    public final C15383 f25477;

    public C9349(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f25477 = new C15383(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32862, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        m51611(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        m51610(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        m51607(typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C9349(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.checkBoxPreferenceStyle));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        m21682(c22486.m50437(android.R.id.checkbox));
        m51609(c22486.m50437(android.R.id.summary));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5136(View view) {
        super.mo5136(view);
        if (((AccessibilityManager) m9012().getSystemService("accessibility")).isEnabled()) {
            m21682(view.findViewById(android.R.id.checkbox));
            m51609(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ */
    private void m21682(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72756);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f25477);
        }
    }
}
