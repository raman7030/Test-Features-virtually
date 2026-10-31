package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import bin.mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.֡ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceC0206 implements DialogInterface, InterfaceC23586 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Field f1450;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1451 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19598 f1452;

    static {
        try {
            Field declaredField = DialogC8224.class.getDeclaredField("mKeyDispatcher");
            declaredField.setAccessible(true);
            f1450 = declaredField;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public DialogInterfaceC0206(DialogInterfaceC19598 dialogInterfaceC19598) {
        this.f1452 = dialogInterfaceC19598;
        try {
            Field field = f1450;
            final InterfaceC7979 interfaceC7979 = (InterfaceC7979) field.get(dialogInterfaceC19598);
            if (interfaceC7979 != null) {
                field.set(dialogInterfaceC19598, new InterfaceC7979() { // from class: l.ᩴۚۢ
                    @Override // l.InterfaceC7979
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo3966(KeyEvent keyEvent) {
                        try {
                            return interfaceC7979.mo3966(keyEvent);
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m1433(int i) {
        return this.f1452.findViewById(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Window m1445() {
        return this.f1452.getWindow();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context m1432() {
        return this.f1452.getContext();
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        try {
            this.f1452.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.content.DialogInterface
    public final void dismiss() {
        try {
            this.f1452.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1449() {
        Window window;
        DialogInterfaceC19598 dialogInterfaceC19598 = this.f1452;
        try {
            dialogInterfaceC19598.show();
            if (!m1431(dialogInterfaceC19598.findViewById(R.id.MT_Protector)) || (window = dialogInterfaceC19598.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(16);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1431(View view) {
        if (view != null && view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m1431(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Button m1447() {
        return this.f1452.m45034(-1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Button m1446() {
        return this.f1452.m45034(-2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Button m1448() {
        return this.f1452.m45034(-3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1436(DialogInterface.OnDismissListener onDismissListener) {
        this.f1452.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1435(DialogInterface.OnCancelListener onCancelListener) {
        this.f1452.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1437(DialogInterface.OnKeyListener onKeyListener) {
        this.f1452.setOnKeyListener(onKeyListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1438(DialogInterface.OnShowListener onShowListener) {
        this.f1452.setOnShowListener(onShowListener);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m1442() {
        return this.f1452.isShowing();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1439(ViewGroup viewGroup) {
        this.f1452.m45037(viewGroup);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1440(CharSequence charSequence) {
        this.f1452.m45038(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1444(CharSequence charSequence) {
        this.f1452.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1441(boolean z) {
        this.f1452.setCancelable(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1434(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f1452.m45036(i, charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2664 m1443() {
        return this.f1452.m45035();
    }

    @Override // l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        return this.f1452.getLifecycle();
    }
}
