package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: l.ۤܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public class DialogInterfaceOnCancelListenerC10344 extends ComponentCallbacksC9205 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final String SAVED_BACK_STACK_ID = "android:backStackId";
    public static final String SAVED_CANCELABLE = "android:cancelable";
    public static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    public static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    public static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    public static final String SAVED_STYLE = "android:style";
    public static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    public int mBackStackId;
    public boolean mCancelable;
    public boolean mCreatingDialog;
    public Dialog mDialog;
    public boolean mDialogCreated;
    public Runnable mDismissRunnable;
    public boolean mDismissed;
    public Handler mHandler;
    public InterfaceC1008 mObserver;
    public DialogInterface.OnCancelListener mOnCancelListener;
    public DialogInterface.OnDismissListener mOnDismissListener;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    public void onCancel(DialogInterface dialogInterface) {
    }

    public DialogInterfaceOnCancelListenerC10344() {
        this.mDismissRunnable = new RunnableC20222(this);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC4699(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC3288(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C13165(this);
        this.mDialogCreated = false;
    }

    public DialogInterfaceOnCancelListenerC10344(int i) {
        super(i);
        this.mDismissRunnable = new RunnableC20222(this);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC4699(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC3288(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C13165(this);
        this.mDialogCreated = false;
    }

    public void setStyle(int i, int i2) {
        if (AbstractC5180.m14853(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void show(AbstractC5180 abstractC5180, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC5180.getClass();
        C18105 c18105 = new C18105(abstractC5180);
        c18105.f51801 = true;
        c18105.mo39680(0, this, str, 1);
        c18105.m42224(false);
    }

    public int show(AbstractC16882 abstractC16882, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC16882.mo39680(0, this, str, 1);
        this.mViewDestroyed = false;
        int iM42224 = ((C18105) abstractC16882).m42224(false);
        this.mBackStackId = iM42224;
        return iM42224;
    }

    public void showNow(AbstractC5180 abstractC5180, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC5180.getClass();
        C18105 c18105 = new C18105(abstractC5180);
        c18105.f51801 = true;
        c18105.mo39680(0, this, str, 1);
        c18105.mo39692();
    }

    public void dismiss() {
        m26144(false, false, false);
    }

    public void dismissNow() {
        m26144(false, false, true);
    }

    public void dismissAllowingStateLoss() {
        m26144(true, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26144(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().m14918(this.mBackStackId);
            } else {
                getParentFragmentManager().m14902(this.mBackStackId, z);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC5180 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        C18105 c18105 = new C18105(parentFragmentManager);
        c18105.f51801 = true;
        c18105.mo39690(this);
        if (z3) {
            c18105.mo39692();
        } else if (!z) {
            c18105.m42224(false);
        } else {
            c18105.m42224(true);
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public int getTheme() {
        return this.mTheme;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @Override // l.ComponentCallbacksC9205
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m1665(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // l.ComponentCallbacksC9205
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().m1670(this.mObserver);
    }

    @Override // l.ComponentCallbacksC9205
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // l.ComponentCallbacksC9205
    public AbstractC15553 createFragmentContainer() {
        return new C12460(this, super.createFragmentContainer());
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // l.ComponentCallbacksC9205
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (AbstractC5180.m14853(2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
        } else {
            m26143(bundle);
            if (AbstractC5180.m14853(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (AbstractC5180.m14853(3)) {
            toString();
        }
        return new DialogC6876(requireContext(), getTheme());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC5180.m14853(3)) {
            toString();
        }
        m26144(true, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26143(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // l.ComponentCallbacksC9205
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // l.ComponentCallbacksC9205
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            C6152.m17066(decorView, this);
            decorView.setTag(bin.mt.plus.R.id.MT_Protector, this);
            C3563.m10856(decorView, this);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }
}
