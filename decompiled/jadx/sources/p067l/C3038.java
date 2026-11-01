package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes3.dex */
public class C3038 extends AbstractC23156 {

    /* JADX INFO: renamed from: ֫ۧ */
    public String f5447;

    /* JADX INFO: renamed from: ۟֫ */
    public String f5448;

    /* JADX INFO: renamed from: ܰ֫ */
    public final C21145 f5449;

    public C3038(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f5449 = new C21145(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32857, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m51611(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m51610(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f5447 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo9048();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f5448 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo9048();
        m51607(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3038(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.switchPreferenceStyle));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        m5135(c22486.m50437(android.R.id.switch_widget));
        m51609(c22486.m50437(android.R.id.summary));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5136(View view) {
        super.mo5136(view);
        if (((AccessibilityManager) m9012().getSystemService("accessibility")).isEnabled()) {
            m5135(view.findViewById(android.R.id.switch_widget));
            m51609(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ */
    private void m5135(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72756);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f5447);
            r4.setTextOff(this.f5448);
            r4.setOnCheckedChangeListener(this.f5449);
        }
    }
}
