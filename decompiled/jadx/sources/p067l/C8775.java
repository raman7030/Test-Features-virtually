package p067l;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* JADX INFO: renamed from: l.ۜۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8775 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f23820 = 0;

    static {
        if (C17452.m39788()) {
            return;
        }
        UMConfigure.setEncryptEnabled(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20304() {
        if (C17452.m39788()) {
            return;
        }
        MobclickAgent.onProfileSignIn(C24414.m53855().toLowerCase());
    }
}
