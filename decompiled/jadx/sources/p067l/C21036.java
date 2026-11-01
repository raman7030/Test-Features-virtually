package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.᩵ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8404 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21036 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f66007 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final ConcurrentMapC12768 f66008 = new ConcurrentMapC12768(64);

    /* JADX INFO: renamed from: ֫ */
    public static EnumSet m47446(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC20365.class);
        for (EnumC20365 enumC20365 : EnumC20365.values()) {
            if ((enumC20365.f62956 & j) != 0) {
                enumSetNoneOf.add(enumC20365);
                j &= ~enumC20365.f62956;
            }
        }
        C1446.m31704(j == 0);
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Set m47447(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentMapC12768 concurrentMapC12768 = f66008;
        Set set = (Set) concurrentMapC12768.get(lValueOf);
        if (set != null) {
            return set;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC4377.class);
        if (0 != (1 & j)) {
            enumSetNoneOf.add(EnumC4377.f9835);
        }
        if (0 != (4 & j)) {
            enumSetNoneOf.add(EnumC4377.f9837);
        }
        if (0 != (2 & j)) {
            enumSetNoneOf.add(EnumC4377.f9840);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j)) {
            enumSetNoneOf.add(EnumC4377.f9845);
        }
        if (0 != (8 & j)) {
            enumSetNoneOf.add(EnumC4377.f9846);
        }
        if (0 != (SkeinEngine.UbiTweak.T1_FIRST & j)) {
            enumSetNoneOf.add(EnumC4377.f9839);
        }
        if (0 != (Long.MIN_VALUE & j)) {
            enumSetNoneOf.add(EnumC4377.f9841);
        }
        if (0 != (16 & j)) {
            enumSetNoneOf.add(EnumC4377.f9834);
        }
        if (0 != (128 & j)) {
            enumSetNoneOf.add(EnumC4377.f9832);
        }
        if (0 != (64 & j)) {
            enumSetNoneOf.add(EnumC4377.f9838);
        }
        if (0 != (32 & j)) {
            enumSetNoneOf.add(EnumC4377.f9836);
        }
        if (0 != (256 & j)) {
            enumSetNoneOf.add(EnumC4377.f9833);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & j)) {
            enumSetNoneOf.add(EnumC4377.f9842);
        }
        if (0 != (8796093022208L & j)) {
            enumSetNoneOf.add(EnumC4377.f9843);
        }
        Set setUnmodifiableSet = C21562.unmodifiableSet(enumSetNoneOf);
        concurrentMapC12768.put(Long.valueOf(j), setUnmodifiableSet);
        return setUnmodifiableSet;
    }
}
