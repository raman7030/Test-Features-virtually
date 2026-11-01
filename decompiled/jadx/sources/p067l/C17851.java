package p067l;

/* JADX INFO: renamed from: l.ܽ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB7X */
/* JADX INFO: loaded from: classes4.dex */
public final class C17851 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC3770 f53252;

    /* JADX INFO: renamed from: ۧ */
    public EnumC12488 f53253;

    /* JADX INFO: renamed from: ᩳ */
    public static final C17851 f53251 = new C17851(EnumC3770.none, null);

    /* JADX INFO: renamed from: ܽ */
    public static final C17851 f53250 = new C17851(EnumC3770.xMidYMid, EnumC12488.meet);

    static {
        EnumC3770 enumC3770 = EnumC3770.none;
        EnumC3770 enumC3771 = EnumC3770.none;
        EnumC3770 enumC3772 = EnumC3770.none;
        EnumC3770 enumC3773 = EnumC3770.none;
        EnumC12488 enumC12488 = EnumC12488.meet;
    }

    public C17851(EnumC3770 enumC3770, EnumC12488 enumC12488) {
        this.f53252 = enumC3770;
        this.f53253 = enumC12488;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC3770 m40525() {
        return this.f53252;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC12488 m40526() {
        return this.f53253;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17851.class != obj.getClass()) {
            return false;
        }
        C17851 c17851 = (C17851) obj;
        return this.f53252 == c17851.f53252 && this.f53253 == c17851.f53253;
    }

    public final String toString() {
        return this.f53252 + " " + this.f53253;
    }
}
