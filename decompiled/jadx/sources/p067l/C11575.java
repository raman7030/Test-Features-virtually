package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G696 */
/* JADX INFO: loaded from: classes3.dex */
public class C11575 extends C2856 {

    /* JADX INFO: renamed from: ܳ֫ */
    public int f32242;

    /* JADX INFO: renamed from: ܿ֫ */
    public C10904 f32243;

    /* JADX INFO: renamed from: ᩻֫ */
    public InterfaceC22304 f32244;

    /* JADX INFO: renamed from: ֫ */
    public final void m26646(int i) {
        this.f32242 = i;
        this.f32243.f30225.setColor(i);
    }

    public C11575(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32242 = C23223.f72985;
        m26645();
    }

    public C11575(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32242 = C23223.f72985;
        m26645();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26647(InterfaceC22304 interfaceC22304) {
        this.f32244 = interfaceC22304;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26648(boolean z) {
        this.f32243.m25157(z);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m26645() {
        if (isInEditMode()) {
            return;
        }
        C10904 c10904 = (C10904) LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f32243 = c10904;
        c10904.f30225.setColor(this.f32242);
        float fApplyDimension = TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.f32243.m25158((int) fApplyDimension);
        super.m4588(fApplyDimension);
        final C10904 c10905 = this.f32243;
        post(new Runnable() { // from class: l.ۘܺۡ
            @Override // java.lang.Runnable
            public final void run() {
                this.f15629.f4922.addView(c10905);
            }
        });
        super.m4589(new C24985(this));
        super.m4590(new C8892(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26643(C11575 c11575) {
        c11575.f32243.f30226 = false;
        InterfaceC22304 interfaceC22304 = c11575.f32244;
        if (interfaceC22304 != null) {
            interfaceC22304.mo11051(c11575);
        }
        super.m4591();
    }
}
