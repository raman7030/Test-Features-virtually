package l;

import android.os.StatFs;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5292 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StatFs[] f16529;

    public C5292(String... strArr) throws Exception {
        this.f16529 = new StatFs[strArr.length];
        Future<?> futureSubmit = C1802.f6208.submit(new RunnableC9960(5, this, strArr));
        try {
            futureSubmit.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15218(C5292 c5292, String[] strArr) {
        int i = 0;
        while (true) {
            StatFs[] statFsArr = c5292.f16529;
            if (i >= statFsArr.length) {
                return;
            }
            statFsArr[i] = new StatFs(strArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m15220() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f16529) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return blockSizeLong;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m15219() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f16529) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return blockSizeLong;
    }
}
