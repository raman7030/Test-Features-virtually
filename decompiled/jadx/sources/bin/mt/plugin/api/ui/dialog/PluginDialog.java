package bin.mt.plugin.api.ui.dialog;

import android.view.KeyEvent;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginDialog {
    public static final int BUTTON_NEGATIVE = -2;
    public static final int BUTTON_NEUTRAL = -3;
    public static final int BUTTON_POSITIVE = -1;

    public interface Builder {
        PluginDialog create();

        Builder setCancelable(boolean z);

        Builder setItems(CharSequence[] charSequenceArr, OnClickListener onClickListener);

        Builder setMessage(CharSequence charSequence);

        Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener);

        Builder setNegativeButton(CharSequence charSequence, OnClickListener onClickListener);

        Builder setNeutralButton(CharSequence charSequence, OnClickListener onClickListener);

        Builder setOnCancelListener(OnCancelListener onCancelListener);

        Builder setOnDismissListener(OnDismissListener onDismissListener);

        Builder setOnKeyListener(OnKeyListener onKeyListener);

        Builder setOnShowListener(OnShowListener onShowListener);

        Builder setPositiveButton(CharSequence charSequence, OnClickListener onClickListener);

        Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener);

        Builder setTitle(CharSequence charSequence);

        Builder setView(PluginView pluginView);

        PluginDialog show();
    }

    public interface OnCancelListener {
        void onCancel(PluginDialog pluginDialog);
    }

    public interface OnClickListener {
        void onClick(PluginDialog pluginDialog, int i);
    }

    public interface OnDismissListener {
        void onDismiss(PluginDialog pluginDialog);
    }

    public interface OnKeyListener {
        boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent);
    }

    public interface OnMultiChoiceClickListener {
        void onClick(PluginDialog pluginDialog, int i, boolean z);
    }

    public interface OnShowListener {
        void onShow(PluginDialog pluginDialog);
    }

    void cancel();

    void dismiss();

    PluginButton getNegativeButton();

    PluginButton getNeutralButton();

    PluginUI getPluginUI();

    PluginButton getPositiveButton();

    boolean isShowing();

    void setCancelable(boolean z);

    void setMessage(CharSequence charSequence);

    void setNegativeButton(CharSequence charSequence, OnClickListener onClickListener);

    void setNeutralButton(CharSequence charSequence, OnClickListener onClickListener);

    void setOnCancelListener(OnCancelListener onCancelListener);

    void setOnDismissListener(OnDismissListener onDismissListener);

    void setOnKeyListener(OnKeyListener onKeyListener);

    void setOnShowListener(OnShowListener onShowListener);

    void setPositiveButton(CharSequence charSequence, OnClickListener onClickListener);

    void setTitle(CharSequence charSequence);

    void setView(PluginView pluginView);

    void show();
}
