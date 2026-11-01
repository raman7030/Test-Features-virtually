package p067l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩷ */
/* JADX INFO: compiled from: 85W1 */
/* JADX INFO: loaded from: classes4.dex */
public class C1749 {

    /* JADX INFO: renamed from: ֫ */
    public View f60086;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f60087;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC1714 f60088;

    /* JADX INFO: renamed from: ۢ */
    public final int f60089;

    /* JADX INFO: renamed from: ۧ */
    public final Context f60090;

    /* JADX INFO: renamed from: ܳ */
    public final C0994 f60091;

    /* JADX INFO: renamed from: ܽ */
    public int f60092 = 8388611;

    /* JADX INFO: renamed from: ܿ */
    public final PopupWindow.OnDismissListener f60093 = new C1679(this);

    /* JADX INFO: renamed from: ᩳ */
    public boolean f60094;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC1399 f60095;

    /* JADX INFO: renamed from: ᩻ */
    public PopupWindow.OnDismissListener f60096;

    public C1749(Context context, C0994 c0994, View view, boolean z, int i, int i2) {
        this.f60090 = context;
        this.f60091 = c0994;
        this.f60086 = view;
        this.f60087 = z;
        this.f60089 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44892(PopupWindow.OnDismissListener onDismissListener) {
        this.f60096 = onDismissListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44891(View view) {
        this.f60086 = view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44894(boolean z) {
        this.f60094 = z;
        AbstractC1399 abstractC1399 = this.f60095;
        if (abstractC1399 != null) {
            abstractC1399.mo10599(z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44890(int i) {
        this.f60092 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44896() {
        return this.f60092;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m44897() {
        if (!m44895(0, 0)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC1399 m44898() {
        AbstractC1399 viewOnKeyListenerC0979;
        if (this.f60095 == null) {
            Context context = this.f60090;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.MT_Protector)) {
                viewOnKeyListenerC0979 = new ViewOnKeyListenerC1099(context, this.f60086, this.f60089, this.f60087);
            } else {
                viewOnKeyListenerC0979 = new ViewOnKeyListenerC0979(this.f60090, this.f60091, this.f60086, this.f60089, this.f60087);
            }
            viewOnKeyListenerC0979.mo10598(this.f60091);
            viewOnKeyListenerC0979.mo10597(this.f60093);
            viewOnKeyListenerC0979.mo10596(this.f60086);
            viewOnKeyListenerC0979.setCallback(this.f60088);
            viewOnKeyListenerC0979.mo10599(this.f60094);
            viewOnKeyListenerC0979.mo10595(this.f60092);
            this.f60095 = viewOnKeyListenerC0979;
        }
        return this.f60095;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m44900() {
        if (m44899()) {
            return true;
        }
        if (this.f60086 == null) {
            return false;
        }
        m44888(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44895(int i, int i2) {
        if (m44899()) {
            return true;
        }
        if (this.f60086 == null) {
            return false;
        }
        m44888(i, i2, true, true);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44888(int i, int i2, boolean z, boolean z2) {
        AbstractC1399 abstractC1399M44898 = m44898();
        abstractC1399M44898.mo10601(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f60092, this.f60086.getLayoutDirection()) & 7) == 5) {
                i -= this.f60086.getWidth();
            }
            abstractC1399M44898.mo10600(i);
            abstractC1399M44898.mo10602(i2);
            int i3 = (int) ((this.f60090.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1399M44898.m29871(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC1399M44898.show();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44889() {
        if (m44899()) {
            this.f60095.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo7992() {
        this.f60095 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f60096;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44899() {
        AbstractC1399 abstractC1399 = this.f60095;
        return abstractC1399 != null && abstractC1399.isShowing();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44893(InterfaceC1714 interfaceC1714) {
        this.f60088 = interfaceC1714;
        AbstractC1399 abstractC1399 = this.f60095;
        if (abstractC1399 != null) {
            abstractC1399.setCallback(interfaceC1714);
        }
    }
}
