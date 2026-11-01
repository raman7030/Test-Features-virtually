package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import bin.p000mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.֡ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceC2564 implements DialogInterface, InterfaceC24784 {

    /* JADX INFO: renamed from: ᩶ */
    public static final Field f4229;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f4230 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC1814 f4231;

    static {
        try {
            Field declaredField = DialogC1250.class.getDeclaredField("mKeyDispatcher");
            declaredField.setAccessible(true);
            f4229 = declaredField;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public DialogInterfaceC2564(DialogInterfaceC1814 dialogInterfaceC1814) {
        this.f4231 = dialogInterfaceC1814;
        try {
            Field field = f4229;
            final InterfaceC1238 interfaceC1238 = (InterfaceC1238) field.get(dialogInterfaceC1814);
            if (interfaceC1238 != null) {
                field.set(dialogInterfaceC1814, new InterfaceC1238() { // from class: l.ᩴۚۢ
                    @Override // p067l.InterfaceC1238
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo6208(KeyEvent keyEvent) {
                        try {
                            return interfaceC1238.mo6208(keyEvent);
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m3846(int i) {
        return this.f4231.findViewById(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final Window m3858() {
        return this.f4231.getWindow();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Context m3845() {
        return this.f4231.getContext();
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        try {
            this.f4231.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.content.DialogInterface
    public final void dismiss() {
        try {
            this.f4231.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m3862() {
        Window window;
        DialogInterfaceC1814 dialogInterfaceC1814 = this.f4231;
        try {
            dialogInterfaceC1814.show();
            if (!m3844(dialogInterfaceC1814.findViewById(R.id.MT_Protector)) || (window = dialogInterfaceC1814.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(16);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m3844(View view) {
        if (view != null && view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m3844(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Button m3860() {
        return this.f4231.m47329(-1);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Button m3859() {
        return this.f4231.m47329(-2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Button m3861() {
        return this.f4231.m47329(-3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3849(DialogInterface.OnDismissListener onDismissListener) {
        this.f4231.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3848(DialogInterface.OnCancelListener onCancelListener) {
        this.f4231.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3850(DialogInterface.OnKeyListener onKeyListener) {
        this.f4231.setOnKeyListener(onKeyListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3851(DialogInterface.OnShowListener onShowListener) {
        this.f4231.setOnShowListener(onShowListener);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m3855() {
        return this.f4231.isShowing();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3852(ViewGroup viewGroup) {
        this.f4231.m47332(viewGroup);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3853(CharSequence charSequence) {
        this.f4231.m47333(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3857(CharSequence charSequence) {
        this.f4231.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3854(boolean z) {
        this.f4231.setCancelable(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3847(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4231.m47331(i, charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C0974 m3856() {
        return this.f4231.m47330();
    }

    @Override // p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        return this.f4231.getLifecycle();
    }
}
