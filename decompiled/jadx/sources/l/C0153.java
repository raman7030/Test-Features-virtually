package l;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes2.dex */
public final class C0153 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1304;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f1305;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f1306;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f1307;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f1308;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1309;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10612 f1311;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f1313;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f1312 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f1310 = new LinkedHashSet();

    public C0153(String str, int i, int i2, boolean z) {
        this.f1308 = str;
        this.f1313 = i;
        this.f1305 = z;
        this.f1304 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0153 m1252(int i, String str) {
        return new C0153(str, i, -1, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0153 m1251(int i, int i2, String str) {
        C0153 c0153 = new C0153(str, i, i2, false);
        c0153.f1311 = C10612.m26634(i2);
        return c0153;
    }
}
