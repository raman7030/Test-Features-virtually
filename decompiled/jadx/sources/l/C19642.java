package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.᩵ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8404 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19642 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63384 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f63385 = new ConcurrentMapC10942(64);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m45150(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC18936.class);
        for (EnumC18936 enumC18936 : EnumC18936.values()) {
            if ((enumC18936.f59725 & j) != 0) {
                enumSetNoneOf.add(enumC18936);
                j &= ~enumC18936.f59725;
            }
        }
        C12171.m29642(j == 0);
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Set m45151(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentMapC10942 concurrentMapC10942 = f63385;
        Set set = (Set) concurrentMapC10942.get(lValueOf);
        if (set != null) {
            return set;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC2113.class);
        if (0 != (1 & j)) {
            enumSetNoneOf.add(EnumC2113.f7050);
        }
        if (0 != (4 & j)) {
            enumSetNoneOf.add(EnumC2113.f7052);
        }
        if (0 != (2 & j)) {
            enumSetNoneOf.add(EnumC2113.f7055);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j)) {
            enumSetNoneOf.add(EnumC2113.f7060);
        }
        if (0 != (8 & j)) {
            enumSetNoneOf.add(EnumC2113.f7061);
        }
        if (0 != (SkeinEngine.UbiTweak.T1_FIRST & j)) {
            enumSetNoneOf.add(EnumC2113.f7054);
        }
        if (0 != (Long.MIN_VALUE & j)) {
            enumSetNoneOf.add(EnumC2113.f7056);
        }
        if (0 != (16 & j)) {
            enumSetNoneOf.add(EnumC2113.f7049);
        }
        if (0 != (128 & j)) {
            enumSetNoneOf.add(EnumC2113.f7047);
        }
        if (0 != (64 & j)) {
            enumSetNoneOf.add(EnumC2113.f7053);
        }
        if (0 != (32 & j)) {
            enumSetNoneOf.add(EnumC2113.f7051);
        }
        if (0 != (256 & j)) {
            enumSetNoneOf.add(EnumC2113.f7048);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & j)) {
            enumSetNoneOf.add(EnumC2113.f7057);
        }
        if (0 != (8796093022208L & j)) {
            enumSetNoneOf.add(EnumC2113.f7058);
        }
        Set setUnmodifiableSet = C20195.unmodifiableSet(enumSetNoneOf);
        concurrentMapC10942.put(Long.valueOf(j), setUnmodifiableSet);
        return setUnmodifiableSet;
    }
}
