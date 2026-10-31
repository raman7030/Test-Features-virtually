package l;

import android.view.KeyEvent;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩺ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S7OD */
/* JADX INFO: loaded from: classes.dex */
public class C23059 implements PluginDialog.OnKeyListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f74176 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseCancelableDialog f74177;

    public C23059(BaseCancelableDialog baseCancelableDialog) {
        this.f74177 = baseCancelableDialog;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.OnKeyListener
    public boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent) {
        if (!this.f74177.cancelable || keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (!this.f74177.canceled) {
            if (System.currentTimeMillis() - this.f74176 < 2000) {
                this.f74177.canceled = true;
                if (this.f74177.onCancelListener != null) {
                    this.f74177.onCancelListener.mo12762accept(this.f74177);
                }
            } else {
                this.f74177.pluginUI.showToast("{press_again_to_cancel}");
                this.f74176 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
