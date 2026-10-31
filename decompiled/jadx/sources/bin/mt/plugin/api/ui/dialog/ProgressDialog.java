package bin.mt.plugin.api.ui.dialog;

import android.text.TextUtils;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginTextView;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginTextViewBuilder;
import bin.mt.plugin.api.util.ThreadUtil;
import bin.mt.plugin.api.util.UIUpdater;
import bin.mt.plugin.api.util.UIUpdaterGroup;
import l.C11003;
import l.C2184;
import l.C23786;
import l.C2949;
import l.C4236;
import l.RunnableC22375;

/* JADX INFO: loaded from: classes.dex */
public class ProgressDialog extends BaseCancelableDialog {
    public final PluginDialog dialog;
    public final UIUpdater messageUpdater;
    public final PluginTextView messageView;
    public final PluginProgressBar progressBar;
    public final UIUpdater progressUpdater;
    public final UIUpdater secondaryProgressUpdater;
    public final UIUpdater titleUpdater;

    public ProgressDialog(PluginUI pluginUI) {
        super(pluginUI);
        PluginView pluginViewBuild = ((PluginProgressBarBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginRootLayoutBuilder) ((PluginRootLayoutBuilder) pluginUI.buildVerticalLayout().paddingHorizontal(pluginUI.dialogPaddingHorizontal())).paddingBottom(pluginUI.dialogPaddingVertical())).addTextView("message").textSize(16.0f)).singleLine()).ellipsize(TextUtils.TruncateAt.END)).marginTopDp(8.0f)).gone()).addProgressBar("progressBar").marginTopDp(12.0f)).build();
        PluginDialog pluginDialogCreate = pluginUI.buildDialog().setView(pluginViewBuild).setCancelable(false).create();
        this.dialog = pluginDialogCreate;
        this.messageView = (PluginTextView) pluginViewBuild.requireViewById("message");
        PluginProgressBar pluginProgressBar = (PluginProgressBar) pluginViewBuild.requireViewById("progressBar");
        this.progressBar = pluginProgressBar;
        UIUpdaterGroup uIUpdaterGroup = new UIUpdaterGroup();
        C11003.requireNonNull(pluginDialogCreate);
        this.titleUpdater = uIUpdaterGroup.registerUpdater(new C23786(5, pluginDialogCreate));
        this.messageUpdater = uIUpdaterGroup.registerUpdater(new C2949(5, this));
        C11003.requireNonNull(pluginProgressBar);
        this.progressUpdater = uIUpdaterGroup.registerUpdater(new C2184(6, pluginProgressBar));
        this.secondaryProgressUpdater = uIUpdaterGroup.registerUpdater(new C4236(7, pluginProgressBar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.messageView.getVisibility() == 0) {
                this.messageView.setGone();
                this.progressBar.setMarginTopDp(12.0f);
            }
        } else if (this.messageView.getVisibility() == 8) {
            this.messageView.setVisible();
            this.progressBar.setMarginTop(6);
        }
        this.messageView.setText(charSequence);
    }

    public ProgressDialog setTitle(CharSequence charSequence) {
        this.titleUpdater.submitUpdate(charSequence);
        return this;
    }

    public ProgressDialog setMessage(CharSequence charSequence) {
        this.messageUpdater.submitUpdate(charSequence);
        return this;
    }

    public ProgressDialog setProgress(int i) {
        this.progressUpdater.submitUpdate(Integer.valueOf(i));
        return this;
    }

    public ProgressDialog setSecondaryProgress(int i) {
        this.secondaryProgressUpdater.submitUpdate(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxProgress$1(int i) {
        this.progressBar.setMaxProgress(i);
    }

    public ProgressDialog setMaxProgress(final int i) {
        ThreadUtil.runOnUiThread(new Runnable() { // from class: bin.mt.plugin.api.ui.dialog.ProgressDialog$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$setMaxProgress$1(i);
            }
        });
        return this;
    }

    public ProgressDialog setIndeterminate() {
        setIndeterminate(true);
        return this;
    }

    public ProgressDialog setIndeterminate(final boolean z) {
        if (this.progressBar.isIndeterminate() != z) {
            ThreadUtil.runOnUiThread(new Runnable() { // from class: bin.mt.plugin.api.ui.dialog.ProgressDialog$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setIndeterminate$2(z);
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIndeterminate$2(boolean z) {
        this.progressBar.setIndeterminate(z);
    }

    public PluginTextView getMessageView() {
        return this.messageView;
    }

    public PluginProgressBar getProgressBar() {
        return this.progressBar;
    }

    @Override // bin.mt.plugin.api.ui.dialog.BaseCancelableDialog
    public PluginDialog getDialog() {
        return this.dialog;
    }

    public ProgressDialog show() {
        ThreadUtil.assertInUIThread();
        this.dialog.show();
        return this;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    @Override // bin.mt.plugin.api.ui.dialog.BaseCancelableDialog
    public void dismiss() {
        ThreadUtil.runOnUiThread(new RunnableC22375(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$3() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
    }
}
