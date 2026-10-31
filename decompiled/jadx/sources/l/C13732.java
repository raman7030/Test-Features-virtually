package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13732 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5972 f41007;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f41008;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f41009;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC6862 f41010;

    public C13732(String str, EnumC6862 enumC6862, EnumC5972 enumC5972, boolean z) {
        C11003.requireNonNull(str, MotionUtils.EASING_TYPE_PATH);
        this.f41009 = str;
        C11003.requireNonNull(enumC6862, "targetType");
        this.f41010 = enumC6862;
        C11003.requireNonNull(enumC5972, am.Q);
        this.f41007 = enumC5972;
        this.f41008 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33034() {
        return this.f41009.equals("/");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33033(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Root rule is required");
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            C13732 c13732 = (C13732) list.get(i);
            if (!hashSet.add(c13732.f41009)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
            if (c13732.m33034() != (i == list.size() - 1) || (c13732.m33034() && c13732.f41010 != EnumC6862.DIRECTORY)) {
                throw new IllegalArgumentException("Root directory rule must be last");
            }
            i++;
        }
    }
}
