package l;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9996 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5097 f30113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30115;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f30116;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC14974 f30117;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f30118 = new HashMap();

    public C9996(AbstractServiceC14974 abstractServiceC14974, String str, int i, int i2, C0863 c0863) {
        this.f30117 = abstractServiceC14974;
        this.f30116 = str;
        this.f30114 = i;
        this.f30115 = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C22031.m49574(i, i2, str);
        }
        this.f30113 = c0863;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f30117.f45643.post(new RunnableC12112(this));
    }
}
