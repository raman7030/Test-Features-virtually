package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܿ */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceC1814 extends DialogC1250 implements DialogInterface {

    /* JADX INFO: renamed from: ᩸ */
    public final C1044 f65905;

    public DialogInterfaceC1814(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m47328(contextThemeWrapper, i));
        this.f65905 = new C1044(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47328(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C0974 m47330() {
        return this.f65905.f15784;
    }

    @Override // p067l.DialogC1250, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f65905.m14178(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47333(CharSequence charSequence) {
        this.f65905.m14175(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47332(ViewGroup viewGroup) {
        this.f65905.m14177(viewGroup);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47331(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f65905.m14171(i, charSequence, onClickListener, null);
    }

    @Override // p067l.DialogC1250, p067l.DialogC1183, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f65905.m14169();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C2458 c2458 = this.f65905.f15782;
        if (c2458 == null || !c2458.m3467(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C2458 c2458 = this.f65905.f15782;
        if (c2458 == null || !c2458.m3467(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Button m47329(int i) {
        C1044 c1044 = this.f65905;
        if (i == -3) {
            return c1044.f15799;
        }
        if (i == -2) {
            return c1044.f15792;
        }
        if (i != -1) {
            c1044.getClass();
            return null;
        }
        return c1044.f15767;
    }
}
