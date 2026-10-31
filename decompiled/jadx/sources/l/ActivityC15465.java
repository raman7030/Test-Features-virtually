package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ܶ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J942 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15465 extends AbstractActivityC0649 {
    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "RemoteManageActivity";
    }

    @Override // l.AbstractActivityC0649
    /* JADX INFO: renamed from: ۨ */
    public final void mo2662() {
        Intent intent = getIntent();
        if (intent.hasExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL")) {
            C21584.m48757(this, intent.getIntExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0));
        } else {
            int i = C21584.f69318;
            C21584.m48757(this, ApplicationC20075.f65010.getInt("remote_manager_last_protocol", 0) == 1 ? 1 : 0);
        }
    }
}
