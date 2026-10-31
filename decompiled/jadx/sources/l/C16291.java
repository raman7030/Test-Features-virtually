package l;

/* JADX INFO: renamed from: l.ܽ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB7X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16291 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC1475 f50085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC10648 f50086;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C16291 f50084 = new C16291(EnumC1475.none, null);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16291 f50083 = new C16291(EnumC1475.xMidYMid, EnumC10648.meet);

    static {
        EnumC1475 enumC1475 = EnumC1475.none;
        EnumC1475 enumC1476 = EnumC1475.none;
        EnumC1475 enumC1477 = EnumC1475.none;
        EnumC1475 enumC1478 = EnumC1475.none;
        EnumC10648 enumC10648 = EnumC10648.meet;
    }

    public C16291(EnumC1475 enumC1475, EnumC10648 enumC10648) {
        this.f50085 = enumC1475;
        this.f50086 = enumC10648;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC1475 m38310() {
        return this.f50085;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC10648 m38311() {
        return this.f50086;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16291.class != obj.getClass()) {
            return false;
        }
        C16291 c16291 = (C16291) obj;
        return this.f50085 == c16291.f50085 && this.f50086 == c16291.f50086;
    }

    public final String toString() {
        return this.f50085 + " " + this.f50086;
    }
}
