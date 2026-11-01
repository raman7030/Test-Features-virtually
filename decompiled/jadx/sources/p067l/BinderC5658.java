package p067l;

import android.os.Bundle;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۗ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5658 extends IShizukuApplication.Stub {
    @Override // moe.shizuku.server.IShizukuApplication
    public final void showPermissionConfirmation(int i, int i2, String str, int i3) {
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void bindApplication(Bundle bundle) {
        C24433.f77349 = bundle.getInt("shizuku:attach-reply-uid", -1);
        C24433.f77350 = bundle.getInt("shizuku:attach-reply-version", -1);
        bundle.getInt("shizuku:attach-reply-patch-version", -1);
        bundle.getString("shizuku:attach-reply-secontext");
        C24433.f77348 = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
        bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
        C24433.m53924();
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void dispatchRequestPermissionResult(int i, Bundle bundle) {
        C24433.m53907(i, bundle.getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1);
    }
}
