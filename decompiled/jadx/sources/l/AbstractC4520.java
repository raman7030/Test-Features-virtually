package l;

/* JADX INFO: renamed from: l.ۙ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4520 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] f14363;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f14364;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f14365;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC12986 f14366;

    public AbstractC4520(EnumC12986 enumC12986, String str, String str2, Object[] objArr) {
        this.f14366 = enumC12986;
        this.f14365 = str;
        this.f14364 = str2;
        this.f14363 = objArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m13293() {
        return this.f14365 + "." + this.f14366.f38898 + "." + this.f14364;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4520 m13292(EnumC12986 enumC12986, String str, String str2, Object... objArr) {
        int iOrdinal = enumC12986.ordinal();
        if (iOrdinal == 0) {
            return new C11576(str, str2, objArr);
        }
        if (iOrdinal == 1) {
            return new C13691(str, str2, objArr);
        }
        if (iOrdinal == 2) {
            return new C11076(str, str2, objArr);
        }
        if (iOrdinal == 3) {
            return new C12281(str, str2, objArr);
        }
        C12171.m29640("Wrong diagnostic type: " + enumC12986);
        throw null;
    }
}
