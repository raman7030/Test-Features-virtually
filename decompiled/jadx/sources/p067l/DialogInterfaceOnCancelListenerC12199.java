package p067l;

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
public class DialogInterfaceOnCancelListenerC12199 extends ComponentCallbacksC11117 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
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
    public InterfaceC3326 mObserver;
    public DialogInterface.OnCancelListener mOnCancelListener;
    public DialogInterface.OnDismissListener mOnDismissListener;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    public void onCancel(DialogInterface dialogInterface) {
    }

    public DialogInterfaceOnCancelListenerC12199() {
        this.mDismissRunnable = new RunnableC21587(this);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC6834(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC5493(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C14880(this);
        this.mDialogCreated = false;
    }

    public DialogInterfaceOnCancelListenerC12199(int i) {
        super(i);
        this.mDismissRunnable = new RunnableC21587(this);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC6834(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC5493(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C14880(this);
        this.mDialogCreated = false;
    }

    public void setStyle(int i, int i2) {
        if (AbstractC7291.m16763(2)) {
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

    public void show(AbstractC7291 abstractC7291, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC7291.getClass();
        C19575 c19575 = new C19575(abstractC7291);
        c19575.f54982 = true;
        c19575.mo41921(0, this, str, 1);
        c19575.m44483(false);
    }

    public int show(AbstractC18413 abstractC18413, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC18413.mo41921(0, this, str, 1);
        this.mViewDestroyed = false;
        int iM44483 = ((C19575) abstractC18413).m44483(false);
        this.mBackStackId = iM44483;
        return iM44483;
    }

    public void showNow(AbstractC7291 abstractC7291, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC7291.getClass();
        C19575 c19575 = new C19575(abstractC7291);
        c19575.f54982 = true;
        c19575.mo41921(0, this, str, 1);
        c19575.mo41933();
    }

    public void dismiss() {
        m28171(false, false, false);
    }

    public void dismissNow() {
        m28171(false, false, true);
    }

    public void dismissAllowingStateLoss() {
        m28171(true, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28171(boolean z, boolean z2, boolean z3) {
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
                getParentFragmentManager().m16828(this.mBackStackId);
            } else {
                getParentFragmentManager().m16812(this.mBackStackId, z);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC7291 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        C19575 c19575 = new C19575(parentFragmentManager);
        c19575.f54982 = true;
        c19575.mo41931(this);
        if (z3) {
            c19575.mo41933();
        } else if (!z) {
            c19575.m44483(false);
        } else {
            c19575.m44483(true);
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

    @Override // p067l.ComponentCallbacksC11117
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m4063(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().m4068(this.mObserver);
    }

    @Override // p067l.ComponentCallbacksC11117
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

    @Override // p067l.ComponentCallbacksC11117
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // p067l.ComponentCallbacksC11117
    public AbstractC17150 createFragmentContainer() {
        return new C14210(this, super.createFragmentContainer());
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

    @Override // p067l.ComponentCallbacksC11117
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (AbstractC7291.m16763(2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
        } else {
            m28170(bundle);
            if (AbstractC7291.m16763(2)) {
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
        if (AbstractC7291.m16763(3)) {
            toString();
        }
        return new DialogC1183(requireContext(), getTheme());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC7291.m16763(3)) {
            toString();
        }
        m28171(true, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28170(Bundle bundle) {
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

    @Override // p067l.ComponentCallbacksC11117
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // p067l.ComponentCallbacksC11117
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            C8215.m18998(decorView, this);
            decorView.setTag(bin.p000mt.plus.R.id.MT_Protector, this);
            C5755.m12836(decorView, this);
        }
    }

    @Override // p067l.ComponentCallbacksC11117
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

    @Override // p067l.ComponentCallbacksC11117
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p067l.ComponentCallbacksC11117
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
