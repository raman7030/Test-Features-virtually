package bin.mt.plugin.api.ui.dialog;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.util.Consumer;
import l.C13540;
import l.C23059;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCancelableDialog {
    public boolean cancelable;
    public boolean canceled;
    public boolean needSetKeyListener = true;
    public Consumer onCancelListener = new C13540();
    public final PluginUI pluginUI;

    public abstract void dismiss();

    public abstract PluginDialog getDialog();

    public BaseCancelableDialog(PluginUI pluginUI) {
        this.pluginUI = pluginUI;
    }

    public BaseCancelableDialog setCancelable() {
        return setCancelable(true);
    }

    public BaseCancelableDialog setCancelable(boolean z) {
        this.cancelable = z;
        if (z && this.needSetKeyListener) {
            this.needSetKeyListener = false;
            getDialog().setOnKeyListener(new C23059(this));
        }
        return this;
    }

    public BaseCancelableDialog setOnCancelListener(Consumer consumer) {
        this.onCancelListener = consumer;
        return this;
    }

    public boolean isCanceled() {
        return this.canceled;
    }
}
