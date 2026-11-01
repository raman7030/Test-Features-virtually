package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ܳ */
/* JADX INFO: compiled from: 34P4 */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC1250 extends DialogC1183 implements InterfaceC1254 {
    public AbstractC1499 mDelegate;
    public final InterfaceC1238 mKeyDispatcher;

    @Override // p067l.InterfaceC1254
    public void onSupportActionModeFinished(AbstractC1018 abstractC1018) {
    }

    @Override // p067l.InterfaceC1254
    public void onSupportActionModeStarted(AbstractC1018 abstractC1018) {
    }

    @Override // p067l.InterfaceC1254
    public AbstractC1018 onWindowStartingSupportActionMode(InterfaceC1088 interfaceC1088) {
        return null;
    }

    public DialogC1250(Context context) {
        this(context, 0);
    }

    public DialogC1250(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new InterfaceC1238() { // from class: l.֨ܳ
            @Override // p067l.InterfaceC1238
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo6208(KeyEvent keyEvent) {
                return this.f6984.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC1499 delegate = getDelegate();
        delegate.mo17375(getThemeResId(context, i));
        delegate.mo17379();
    }

    public DialogC1250(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new InterfaceC1238() { // from class: l.֨ܳ
            @Override // p067l.InterfaceC1238
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo6208(KeyEvent keyEvent) {
                return this.f6984.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo17383();
        super.onCreate(bundle);
        getDelegate().mo17379();
    }

    public AbstractC1360 getSupportActionBar() {
        return getDelegate().mo17369();
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void setContentView(int i) {
        m23744();
        getDelegate().mo17373(i);
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void setContentView(View view) {
        m23744();
        getDelegate().mo17348(view);
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23744();
        getDelegate().mo17366(view, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23744() {
        C8215.m18998(getWindow().getDecorView(), this);
        C5755.m12836(getWindow().getDecorView(), this);
        C1745.m44684(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return getDelegate().mo17343(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo17350(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo17350(getContext().getString(i));
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo17349(view, layoutParams);
    }

    @Override // p067l.DialogC1183, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo17357();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo17363();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo17368(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo17360();
    }

    public AbstractC1499 getDelegate() {
        if (this.mDelegate == null) {
            int i = AbstractC1499.f42720;
            this.mDelegate = new LayoutInflaterFactory2C1110(this, this);
        }
        return this.mDelegate;
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1588.m37715(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
