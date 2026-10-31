package l;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.Features;
import net.sf.sevenzipjbinding.SevenZip;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۡ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T731 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9218 implements SevenZip.ExtractMemoryUsageProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9218 f27907 = new C9218();

    @Override // net.sf.sevenzipjbinding.SevenZip.ExtractMemoryUsageProvider
    public final long getExtractMemoryUsage() {
        boolean zIs64Bit;
        long j;
        ActivityManager activityManager = (ActivityManager) C4925.f15522.getSystemService("activity");
        if (activityManager == null) {
            return 268435456L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        if (Build.VERSION.SDK_INT >= 23) {
            zIs64Bit = Process.is64Bit();
        } else {
            String abi = Features.getABI();
            zIs64Bit = "arm64-v8a".equals(abi) || "x86_64".equals(abi);
        }
        long j2 = memoryInfo.totalMem;
        long j3 = memoryInfo.availMem;
        long j4 = memoryInfo.threshold;
        boolean z = memoryInfo.lowMemory;
        long jMax = Math.max(0L, j2);
        long jMax2 = Math.max(0L, j3);
        long jMax3 = Math.max(0L, j4);
        long j5 = zIsLowRamDevice ? 268435456L : 134217728L;
        long j6 = jMax2 > jMax3 ? jMax2 - jMax3 : 0L;
        long j7 = j6 > j5 ? j6 - j5 : 0L;
        long jMin = Math.min(j7, Math.min(jMax / 8, 1073741824L));
        long j8 = C13132.FOREVER_NS;
        if (j7 <= C13132.FOREVER_NS - jMin) {
            j8 = j7 + jMin;
        }
        if (zIsLowRamDevice) {
            j = 536870912;
        } else if (jMax <= Blake2xsDigest.MAX_NUMBER_BLOCKS) {
            j = 805306368;
        } else {
            j = jMax <= 6442450944L ? 1342177280L : 2415919104L;
        }
        long jMin2 = Math.min(j8, Math.min(j, zIs64Bit ? 2415919104L : 805306368L));
        if (z) {
            jMin2 = Math.min(jMin2, 268435456L);
        }
        return (jMin2 / 1048576) * 1048576;
    }
}
