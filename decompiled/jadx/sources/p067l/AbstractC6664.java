package p067l;

/* JADX INFO: renamed from: l.ۙ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6664 {

    /* JADX INFO: renamed from: ֫ */
    public Object[] f17190;

    /* JADX INFO: renamed from: ۧ */
    public String f17191;

    /* JADX INFO: renamed from: ܽ */
    public String f17192;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC14710 f17193;

    public AbstractC6664(EnumC14710 enumC14710, String str, String str2, Object[] objArr) {
        this.f17193 = enumC14710;
        this.f17192 = str;
        this.f17191 = str2;
        this.f17190 = objArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m15176() {
        return this.f17192 + "." + this.f17193.f41944 + "." + this.f17191;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6664 m15175(EnumC14710 enumC14710, String str, String str2, Object... objArr) {
        int iOrdinal = enumC14710.ordinal();
        if (iOrdinal == 0) {
            return new C13370(str, str2, objArr);
        }
        if (iOrdinal == 1) {
            return new C15380(str, str2, objArr);
        }
        if (iOrdinal == 2) {
            return new C12895(str, str2, objArr);
        }
        if (iOrdinal == 3) {
            return new C14040(str, str2, objArr);
        }
        C1446.m31702("Wrong diagnostic type: " + enumC14710);
        throw null;
    }
}
