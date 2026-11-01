package p067l;

import android.os.StatFs;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7398 {

    /* JADX INFO: renamed from: ֫ */
    public final StatFs[] f19366;

    public C7398(String... strArr) throws Exception {
        this.f19366 = new StatFs[strArr.length];
        Future<?> futureSubmit = C4081.f8987.submit(new RunnableC11834(5, this, strArr));
        try {
            futureSubmit.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17121(C7398 c7398, String[] strArr) {
        int i = 0;
        while (true) {
            StatFs[] statFsArr = c7398.f19366;
            if (i >= statFsArr.length) {
                return;
            }
            statFsArr[i] = new StatFs(strArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m17123() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f19366) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return blockSizeLong;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m17122() {
        long blockSizeLong = 0;
        for (StatFs statFs : this.f19366) {
            blockSizeLong += statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return blockSizeLong;
    }
}
