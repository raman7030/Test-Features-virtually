package l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G696 */
/* JADX INFO: loaded from: classes3.dex */
public class C9687 extends C0513 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f29292;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C8981 f29293;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20976 f29294;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24632(int i) {
        this.f29292 = i;
        this.f29293.f27290.setColor(i);
    }

    public C9687(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29292 = C21943.f70274;
        m24631();
    }

    public C9687(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29292 = C21943.f70274;
        m24631();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24633(InterfaceC20976 interfaceC20976) {
        this.f29294 = interfaceC20976;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24634(boolean z) {
        this.f29293.m23213(z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24631() {
        if (isInEditMode()) {
            return;
        }
        C8981 c8981 = (C8981) LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f29293 = c8981;
        c8981.f27290.setColor(this.f29292);
        float fApplyDimension = TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.f29293.m23214((int) fApplyDimension);
        super.m2221(fApplyDimension);
        final C8981 c8982 = this.f29293;
        post(new Runnable() { // from class: l.ۘܺۡ
            @Override // java.lang.Runnable
            public final void run() {
                this.f12814.f2149.addView(c8982);
            }
        });
        super.m2222(new C23797(this));
        super.m2223(new C6864(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24629(C9687 c9687) {
        c9687.f29293.f27291 = false;
        InterfaceC20976 interfaceC20976 = c9687.f29294;
        if (interfaceC20976 != null) {
            interfaceC20976.mo8983(c9687);
        }
        super.m2224();
    }
}
