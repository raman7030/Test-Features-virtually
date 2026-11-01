package p067l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15419 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC8044 f44086;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f44087;

    /* JADX INFO: renamed from: ܽ */
    public final String f44088;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC8890 f44089;

    public C15419(String str, EnumC8890 enumC8890, EnumC8044 enumC8044, boolean z) {
        C12826.requireNonNull(str, MotionUtils.EASING_TYPE_PATH);
        this.f44088 = str;
        C12826.requireNonNull(enumC8890, "targetType");
        this.f44089 = enumC8890;
        C12826.requireNonNull(enumC8044, C0655am.f2262Q);
        this.f44086 = enumC8044;
        this.f44087 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35148() {
        return this.f44088.equals("/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35147(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Root rule is required");
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            C15419 c15419 = (C15419) list.get(i);
            if (!hashSet.add(c15419.f44088)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
            if (c15419.m35148() != (i == list.size() - 1) || (c15419.m35148() && c15419.f44089 != EnumC8890.DIRECTORY)) {
                throw new IllegalArgumentException("Root directory rule must be last");
            }
            i++;
        }
    }
}
