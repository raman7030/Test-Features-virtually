package bin.p000mt.plugin.api.p002ui.dialog;

import android.text.TextUtils;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginTextView;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.builder.PluginLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginTextViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.util.ThreadUtil;
import bin.p000mt.plugin.api.util.UIUpdater;
import bin.p000mt.plugin.api.util.UIUpdaterGroup;
import p067l.C12826;
import p067l.C16503;
import p067l.C21764;
import p067l.C23132;
import p067l.RunnableC10813;
import p067l.RunnableC9532;

/* JADX INFO: loaded from: classes.dex */
public class LoadingDialog extends BaseCancelableDialog {
    public boolean delayShow;
    public final PluginDialog dialog;
    public final UIUpdater messageUpdater;
    public final PluginTextView messageView;
    public final UIUpdater secondaryMessageUpdater;
    public final PluginTextView secondaryMessageView;

    public LoadingDialog(PluginUI pluginUI) {
        super(pluginUI);
        PluginView pluginViewBuild = ((PluginLinearLayoutBuilder) ((PluginLinearLayoutBuilder) ((PluginLinearLayoutBuilder) ((PluginRootLayoutBuilder) pluginUI.buildHorizontalLayout().gravity(16).paddingDp(15.0f)).addProgressBar().style(PluginProgressBar.Style.CIRCULAR).addVerticalLayout().widthMatchParent()).marginLeftDp(15.0f)).children(new C16503(4, pluginUI))).build();
        this.dialog = pluginUI.buildDialog().setView(pluginViewBuild).setCancelable(false).create();
        PluginTextView pluginTextView = (PluginTextView) pluginViewBuild.requireViewById("message");
        this.messageView = pluginTextView;
        this.secondaryMessageView = (PluginTextView) pluginViewBuild.requireViewById("secondaryMessage");
        UIUpdaterGroup uIUpdaterGroup = new UIUpdaterGroup();
        C12826.requireNonNull(pluginTextView);
        this.messageUpdater = uIUpdaterGroup.registerUpdater(new C21764(pluginTextView));
        this.secondaryMessageUpdater = uIUpdaterGroup.registerUpdater(new C23132(this));
    }

    public static /* synthetic */ void lambda$new$0(PluginUI pluginUI, PluginUIBuilder pluginUIBuilder) {
        PluginTextViewBuilder pluginTextViewBuilder = (PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) pluginUIBuilder.addTextView("message").text("{loading}")).textColor(pluginUI.colorTextStateList())).textSize(18.0f)).singleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) ((PluginTextViewBuilder) pluginTextViewBuilder.ellipsize(truncateAt)).addTextView("secondaryMessage").textColor(pluginUI.colorTextSecondaryStateList())).textSize(14.0f)).singleLine()).ellipsize(truncateAt)).gone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(CharSequence charSequence) {
        this.secondaryMessageView.setVisibility(charSequence == null ? 8 : 0);
        this.secondaryMessageView.setText(charSequence);
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
    public PluginDialog getDialog() {
        return this.dialog;
    }

    public LoadingDialog setMessage(CharSequence charSequence) {
        this.messageUpdater.submitUpdate(charSequence);
        return this;
    }

    public LoadingDialog setSecondaryMessage(CharSequence charSequence) {
        this.secondaryMessageUpdater.submitUpdate(charSequence);
        return this;
    }

    public LoadingDialog show() {
        ThreadUtil.assertInUIThread();
        this.dialog.show();
        this.delayShow = false;
        return this;
    }

    public LoadingDialog showDelay() {
        return showDelay(200L);
    }

    public LoadingDialog showDelay(long j) {
        ThreadUtil.assertInUIThread();
        this.delayShow = true;
        ThreadUtil.postDelayed(new RunnableC9532(this), j);
        return this;
    }

    public PluginTextView getMessageView() {
        return this.messageView;
    }

    public PluginTextView getSecondaryMessageView() {
        return this.secondaryMessageView;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog
    public void dismiss() {
        this.delayShow = false;
        ThreadUtil.runOnUiThread(new RunnableC10813(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$2() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
    }
}
