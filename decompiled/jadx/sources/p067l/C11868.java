package p067l;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11868 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7212 f33073;

    /* JADX INFO: renamed from: ۧ */
    public final int f33074;

    /* JADX INFO: renamed from: ܳ */
    public final int f33075;

    /* JADX INFO: renamed from: ܽ */
    public final String f33076;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractServiceC16599 f33077;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f33078 = new HashMap();

    public C11868(AbstractServiceC16599 abstractServiceC16599, String str, int i, int i2, C3188 c3188) {
        this.f33077 = abstractServiceC16599;
        this.f33076 = str;
        this.f33074 = i;
        this.f33075 = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C23306.m51910(i, i2, str);
        }
        this.f33073 = c3188;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f33077.f48756.post(new RunnableC13879(this));
    }
}
