package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes.dex */
public final class C21784 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69779;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f69780;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f69781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f69782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f69783;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f69784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC20373 f69785;

    public C21784(EnumC20373 enumC20373, Map map, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f69785 = enumC20373;
        this.f69781 = map;
        this.f69779 = str;
        this.f69782 = str2;
        this.f69784 = z;
        this.f69783 = z2;
        this.f69780 = z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21784 m49116(LinkedHashMap linkedHashMap, boolean z) {
        return new C21784(EnumC20373.ADD, C20195.unmodifiableMap(new LinkedHashMap(linkedHashMap)), "", "", z, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21784 m49115(String str, boolean z) {
        return new C21784(EnumC20373.DELETE, Collections.EMPTY_MAP, str, "", false, z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21784 m49114(String str, String str2, boolean z) {
        return new C21784(EnumC20373.RENAME, Collections.EMPTY_MAP, str, str2, false, false, z);
    }
}
