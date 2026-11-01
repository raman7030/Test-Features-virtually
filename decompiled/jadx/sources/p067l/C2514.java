package p067l;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2514 {

    /* JADX INFO: renamed from: ֫ */
    public int f4079;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f4080;

    /* JADX INFO: renamed from: ۢ */
    public boolean f4081;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f4082;

    /* JADX INFO: renamed from: ܳ */
    public final String f4083;

    /* JADX INFO: renamed from: ܽ */
    public boolean f4084;

    /* JADX INFO: renamed from: ᩳ */
    public C12455 f4086;

    /* JADX INFO: renamed from: ᩻ */
    public final int f4088;

    /* JADX INFO: renamed from: ᩷ */
    public final LinkedHashMap f4087 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܿ */
    public final LinkedHashSet f4085 = new LinkedHashSet();

    public C2514(String str, int i, int i2, boolean z) {
        this.f4083 = str;
        this.f4088 = i;
        this.f4080 = z;
        this.f4079 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2514 m3660(int i, String str) {
        return new C2514(str, i, -1, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2514 m3659(int i, int i2, String str) {
        C2514 c2514 = new C2514(str, i, i2, false);
        c2514.f4086 = C12455.m28674(i2);
        return c2514;
    }
}
