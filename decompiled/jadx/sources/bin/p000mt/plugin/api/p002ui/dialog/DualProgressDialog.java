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
import p067l.C24868;
import p067l.C24975;
import p067l.C4444;
import p067l.RunnableC20435;
import p067l.RunnableC3911;

/* JADX INFO: loaded from: classes.dex */
public class DualProgressDialog extends BaseCancelableDialog {
    public final PluginDialog dialog;
    public final UIUpdater messageUpdater;
    public final PluginTextView messageView;
    public final PluginProgressBar subProgressBar;
    public final UIUpdater subProgressUpdater;
    public final UIUpdater titleUpdater;
    public final PluginProgressBar totalProgressBar;
    public final UIUpdater totalProgressUpdater;

    public DualProgressDialog(PluginUI pluginUI) {
        super(pluginUI);
        PluginView pluginViewBuild = ((PluginProgressBarBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginProgressBarBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginRootLayoutBuilder) ((PluginRootLayoutBuilder) pluginUI.buildVerticalLayout().paddingHorizontal(pluginUI.dialogPaddingHorizontal())).paddingBottom(pluginUI.dialogPaddingVertical())).addTextView("message").singleLine()).ellipsize(TextUtils.TruncateAt.END)).marginTopDp(8.0f)).gone()).addProgressBar("subProgressBar").marginTopDp(12.0f)).addTextView().text("{dual_progress_dialog_total}")).marginTopDp(6.0f)).addProgressBar("totalProgressBar").marginTopDp(6.0f)).build();
        PluginDialog pluginDialogCreate = pluginUI.buildDialog().setView(pluginViewBuild).setCancelable(false).create();
        this.dialog = pluginDialogCreate;
        this.messageView = (PluginTextView) pluginViewBuild.requireViewById("message");
        PluginProgressBar pluginProgressBar = (PluginProgressBar) pluginViewBuild.requireViewById("subProgressBar");
        this.subProgressBar = pluginProgressBar;
        PluginProgressBar pluginProgressBar2 = (PluginProgressBar) pluginViewBuild.requireViewById("totalProgressBar");
        this.totalProgressBar = pluginProgressBar2;
        UIUpdaterGroup uIUpdaterGroup = new UIUpdaterGroup();
        C12826.requireNonNull(pluginDialogCreate);
        this.titleUpdater = uIUpdaterGroup.registerUpdater(new C24975(5, pluginDialogCreate));
        this.messageUpdater = uIUpdaterGroup.registerUpdater(new C24868(this));
        C12826.requireNonNull(pluginProgressBar);
        this.subProgressUpdater = uIUpdaterGroup.registerUpdater(new C4444(6, pluginProgressBar));
        C12826.requireNonNull(pluginProgressBar2);
        this.totalProgressUpdater = uIUpdaterGroup.registerUpdater(new C4444(6, pluginProgressBar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.messageView.getVisibility() == 0) {
                this.messageView.setGone();
                this.subProgressBar.setMarginTopDp(12.0f);
            }
        } else if (this.messageView.getVisibility() == 8) {
            this.messageView.setVisible();
            this.subProgressBar.setMarginTop(6);
        }
        this.messageView.setText(charSequence);
    }

    public DualProgressDialog setTitle(CharSequence charSequence) {
        this.titleUpdater.submitUpdate(charSequence);
        return this;
    }

    public DualProgressDialog setMessage(CharSequence charSequence) {
        this.messageUpdater.submitUpdate(charSequence);
        return this;
    }

    public DualProgressDialog setSubProgress(int i) {
        this.subProgressUpdater.submitUpdate(Integer.valueOf(i));
        return this;
    }

    public DualProgressDialog setTotalProgress(int i) {
        this.totalProgressUpdater.submitUpdate(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxSubProgress$1(int i) {
        this.subProgressBar.setMaxProgress(i);
    }

    public DualProgressDialog setMaxSubProgress(int i) {
        ThreadUtil.runOnUiThread(new RunnableC3911(i, 1, this));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxTotalProgress$2(int i) {
        this.totalProgressBar.setMaxProgress(i);
    }

    public DualProgressDialog setMaxTotalProgress(final int i) {
        ThreadUtil.runOnUiThread(new Runnable() { // from class: bin.mt.plugin.api.ui.dialog.DualProgressDialog$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$setMaxTotalProgress$2(i);
            }
        });
        return this;
    }

    public PluginTextView getMessageView() {
        return this.messageView;
    }

    public PluginProgressBar getSubProgressBar() {
        return this.subProgressBar;
    }

    public PluginProgressBar getTotalProgressBar() {
        return this.totalProgressBar;
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
    public PluginDialog getDialog() {
        return this.dialog;
    }

    public DualProgressDialog show() {
        ThreadUtil.assertInUIThread();
        this.dialog.show();
        return this;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
    public void dismiss() {
        ThreadUtil.runOnUiThread(new RunnableC20435(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$3() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
    }
}
