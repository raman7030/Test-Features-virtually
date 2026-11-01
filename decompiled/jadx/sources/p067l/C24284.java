package p067l;

import android.view.KeyEvent;
import bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩺ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S7OD */
/* JADX INFO: loaded from: classes.dex */
public class C24284 implements PluginDialog.OnKeyListener {

    /* JADX INFO: renamed from: ֫ */
    public long f76921 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ BaseCancelableDialog f76922;

    public C24284(BaseCancelableDialog baseCancelableDialog) {
        this.f76922 = baseCancelableDialog;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.OnKeyListener
    public boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent) {
        if (!this.f76922.cancelable || keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (!this.f76922.canceled) {
            if (System.currentTimeMillis() - this.f76921 < 2000) {
                this.f76922.canceled = true;
                if (this.f76922.onCancelListener != null) {
                    this.f76922.onCancelListener.mo56319accept(this.f76922);
                }
            } else {
                this.f76922.pluginUI.showToast("{press_again_to_cancel}");
                this.f76921 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
