package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85W1 */
/* JADX INFO: loaded from: classes4.dex */
public class C18291 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View f56868;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f56869;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f56870;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f56871;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f56872;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3060 f56873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56874 = 8388611;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final PopupWindow.OnDismissListener f56875 = new C16879(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f56876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC11236 f56877;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f56878;

    public C18291(Context context, C3060 c3060, View view, boolean z, int i, int i2) {
        this.f56872 = context;
        this.f56873 = c3060;
        this.f56868 = view;
        this.f56869 = z;
        this.f56871 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42632(PopupWindow.OnDismissListener onDismissListener) {
        this.f56878 = onDismissListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42631(View view) {
        this.f56868 = view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42634(boolean z) {
        this.f56876 = z;
        AbstractC11236 abstractC11236 = this.f56877;
        if (abstractC11236 != null) {
            abstractC11236.mo8536(z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42630(int i) {
        this.f56874 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42636() {
        return this.f56874;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m42637() {
        if (!m42635(0, 0)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11236 m42638() {
        AbstractC11236 viewOnKeyListenerC2769;
        if (this.f56877 == null) {
            Context context = this.f56872;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.MT_Protector)) {
                viewOnKeyListenerC2769 = new ViewOnKeyListenerC5177(context, this.f56868, this.f56871, this.f56869);
            } else {
                viewOnKeyListenerC2769 = new ViewOnKeyListenerC2769(this.f56872, this.f56873, this.f56868, this.f56871, this.f56869);
            }
            viewOnKeyListenerC2769.mo8535(this.f56873);
            viewOnKeyListenerC2769.mo8534(this.f56875);
            viewOnKeyListenerC2769.mo8533(this.f56868);
            viewOnKeyListenerC2769.setCallback(this.f56870);
            viewOnKeyListenerC2769.mo8536(this.f56876);
            viewOnKeyListenerC2769.mo8532(this.f56874);
            this.f56877 = viewOnKeyListenerC2769;
        }
        return this.f56877;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m42640() {
        if (m42639()) {
            return true;
        }
        if (this.f56868 == null) {
            return false;
        }
        m42628(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42635(int i, int i2) {
        if (m42639()) {
            return true;
        }
        if (this.f56868 == null) {
            return false;
        }
        m42628(i, i2, true, true);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42628(int i, int i2, boolean z, boolean z2) {
        AbstractC11236 abstractC11236M42638 = m42638();
        abstractC11236M42638.mo8538(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f56874, this.f56868.getLayoutDirection()) & 7) == 5) {
                i -= this.f56868.getWidth();
            }
            abstractC11236M42638.mo8537(i);
            abstractC11236M42638.mo8539(i2);
            int i3 = (int) ((this.f56872.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC11236M42638.m27809(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC11236M42638.show();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42629() {
        if (m42639()) {
            this.f56877.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo5782() {
        this.f56877 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f56878;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m42639() {
        AbstractC11236 abstractC11236 = this.f56877;
        return abstractC11236 != null && abstractC11236.isShowing();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42633(InterfaceC17585 interfaceC17585) {
        this.f56870 = interfaceC17585;
        AbstractC11236 abstractC11236 = this.f56877;
        if (abstractC11236 != null) {
            abstractC11236.setCallback(interfaceC17585);
        }
    }
}
