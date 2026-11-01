package p067l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes.dex */
public final class C23072 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72487;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f72488;

    /* JADX INFO: renamed from: ܳ */
    public final Map f72489;

    /* JADX INFO: renamed from: ܽ */
    public final String f72490;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f72491;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f72492;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC21731 f72493;

    public C23072(EnumC21731 enumC21731, Map map, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f72493 = enumC21731;
        this.f72489 = map;
        this.f72487 = str;
        this.f72490 = str2;
        this.f72492 = z;
        this.f72491 = z2;
        this.f72488 = z3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23072 m51466(LinkedHashMap linkedHashMap, boolean z) {
        return new C23072(EnumC21731.ADD, C21562.unmodifiableMap(new LinkedHashMap(linkedHashMap)), "", "", z, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23072 m51465(String str, boolean z) {
        return new C23072(EnumC21731.DELETE, Collections.EMPTY_MAP, str, "", false, z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23072 m51464(String str, String str2, boolean z) {
        return new C23072(EnumC21731.RENAME, Collections.EMPTY_MAP, str, str2, false, false, z);
    }
}
