package l;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* JADX INFO: renamed from: l.ۜۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20946 = 0;

    static {
        if (C15871.m37616()) {
            return;
        }
        UMConfigure.setEncryptEnabled(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18356() {
        if (C15871.m37616()) {
            return;
        }
        MobclickAgent.onProfileSignIn(C23196.m51459().toLowerCase());
    }
}
