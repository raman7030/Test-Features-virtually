package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4397 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f14083 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6136 f14084;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f14082 = new C4314();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C22036 f14081 = new C22036(EnumC19920.f64415, 0, 0, null);

    public C4397(C2903 c2903) {
        c2903.m8841(f14082, this);
        this.f14084 = C6136.m17057(c2903);
        for (EnumC19920 enumC19920 : EnumC19920.values()) {
            String str = enumC19920.f64482;
            if (str != null) {
                this.f14084.f18880.m30652(str);
                this.f14083.put(enumC19920.f64482, enumC19920);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC19920 m13125(AbstractC10370 abstractC10370) {
        EnumC19920 enumC19920 = (EnumC19920) this.f14083.get(abstractC10370.toString());
        return enumC19920 != null ? enumC19920 : EnumC19920.f64412;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC19920 m13124(String str) {
        EnumC19920 enumC19920 = (EnumC19920) this.f14083.get(str);
        return enumC19920 != null ? enumC19920 : EnumC19920.f64412;
    }
}
