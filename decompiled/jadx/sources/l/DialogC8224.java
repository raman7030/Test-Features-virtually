package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34P4 */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC8224 extends DialogC6876 implements InterfaceC8308 {
    public AbstractC13246 mDelegate;
    public final InterfaceC7979 mKeyDispatcher;

    @Override // l.InterfaceC8308
    public void onSupportActionModeFinished(AbstractC3557 abstractC3557) {
    }

    @Override // l.InterfaceC8308
    public void onSupportActionModeStarted(AbstractC3557 abstractC3557) {
    }

    @Override // l.InterfaceC8308
    public AbstractC3557 onWindowStartingSupportActionMode(InterfaceC4968 interfaceC4968) {
        return null;
    }

    public DialogC8224(Context context) {
        this(context, 0);
    }

    public DialogC8224(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new InterfaceC7979() { // from class: l.֨ܳ
            @Override // l.InterfaceC7979
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean mo3966(KeyEvent keyEvent) {
                return this.f4215.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC13246 delegate = getDelegate();
        delegate.mo15464(getThemeResId(context, i));
        delegate.mo15468();
    }

    public DialogC8224(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new InterfaceC7979() { // from class: l.֨ܳ
            @Override // l.InterfaceC7979
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean mo3966(KeyEvent keyEvent) {
                return this.f4215.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo15472();
        super.onCreate(bundle);
        getDelegate().mo15468();
    }

    public AbstractC10446 getSupportActionBar() {
        return getDelegate().mo15458();
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void setContentView(int i) {
        m21775();
        getDelegate().mo15462(i);
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void setContentView(View view) {
        m21775();
        getDelegate().mo15437(view);
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m21775();
        getDelegate().mo15455(view, layoutParams);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21775() {
        C6152.m17066(getWindow().getDecorView(), this);
        C3563.m10856(getWindow().getDecorView(), this);
        C18207.m42423(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return getDelegate().mo15432(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo15439(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo15439(getContext().getString(i));
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo15438(view, layoutParams);
    }

    @Override // l.DialogC6876, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo15446();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo15452();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo15457(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo15449();
    }

    public AbstractC13246 getDelegate() {
        if (this.mDelegate == null) {
            int i = AbstractC13246.f39656;
            this.mDelegate = new LayoutInflaterFactory2C5402(this, this);
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
        return C15033.m35558(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
