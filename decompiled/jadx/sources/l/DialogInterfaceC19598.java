package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceC19598 extends DialogC8224 implements DialogInterface {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4075 f63287;

    public DialogInterfaceC19598(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m45033(contextThemeWrapper, i));
        this.f63287 = new C4075(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45033(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2664 m45035() {
        return this.f63287.f12969;
    }

    @Override // l.DialogC8224, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f63287.m12273(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45038(CharSequence charSequence) {
        this.f63287.m12270(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45037(ViewGroup viewGroup) {
        this.f63287.m12272(viewGroup);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45036(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f63287.m12266(i, charSequence, onClickListener, null);
    }

    @Override // l.DialogC8224, l.DialogC6876, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63287.m12264();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0095 c0095 = this.f63287.f12967;
        if (c0095 == null || !c0095.m1071(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C0095 c0095 = this.f63287.f12967;
        if (c0095 == null || !c0095.m1071(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Button m45034(int i) {
        C4075 c4075 = this.f63287;
        if (i == -3) {
            return c4075.f12984;
        }
        if (i == -2) {
            return c4075.f12977;
        }
        if (i != -1) {
            c4075.getClass();
            return null;
        }
        return c4075.f12952;
    }
}
