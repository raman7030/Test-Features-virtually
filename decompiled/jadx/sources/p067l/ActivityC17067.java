package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ܶ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J942 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17067 extends AbstractActivityC2986 {
    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "RemoteManageActivity";
    }

    @Override // p067l.AbstractActivityC2986
    /* JADX INFO: renamed from: ۨ */
    public final void mo5002() {
        Intent intent = getIntent();
        if (intent.hasExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL")) {
            C22882.m51103(this, intent.getIntExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0));
        } else {
            int i = C22882.f72019;
            C22882.m51103(this, ApplicationC21448.f67650.getInt("remote_manager_last_protocol", 0) == 1 ? 1 : 0);
        }
    }
}
