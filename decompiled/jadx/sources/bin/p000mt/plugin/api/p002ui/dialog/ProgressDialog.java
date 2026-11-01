package bin.p000mt.plugin.api.p002ui.dialog;

import android.text.TextUtils;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginTextView;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginTextViewBuilder;
import bin.p000mt.plugin.api.util.ThreadUtil;
import bin.p000mt.plugin.api.util.UIUpdater;
import bin.p000mt.plugin.api.util.UIUpdaterGroup;
import p067l.C12826;
import p067l.C24975;
import p067l.C4444;
import p067l.C5171;
import p067l.C6395;
import p067l.RunnableC23634;

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
        C12826.requireNonNull(pluginDialogCreate);
        this.titleUpdater = uIUpdaterGroup.registerUpdater(new C24975(5, pluginDialogCreate));
        this.messageUpdater = uIUpdaterGroup.registerUpdater(new C5171(5, this));
        C12826.requireNonNull(pluginProgressBar);
        this.progressUpdater = uIUpdaterGroup.registerUpdater(new C4444(6, pluginProgressBar));
        this.secondaryProgressUpdater = uIUpdaterGroup.registerUpdater(new C6395(7, pluginProgressBar));
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

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
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

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
    public void dismiss() {
        ThreadUtil.runOnUiThread(new RunnableC23634(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$3() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
    }
}
