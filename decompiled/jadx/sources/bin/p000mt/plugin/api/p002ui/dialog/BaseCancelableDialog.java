package bin.p000mt.plugin.api.p002ui.dialog;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.util.Consumer;
import p067l.C1514;
import p067l.C24284;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCancelableDialog {
    public boolean cancelable;
    public boolean canceled;
    public boolean needSetKeyListener = true;
    public Consumer onCancelListener = new C1514();
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
            getDialog().setOnKeyListener(new C24284(this));
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
