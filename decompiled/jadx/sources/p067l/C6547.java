package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C6547 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f16899 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final C8200 f16900;

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f16898 = new C6468();

    /* JADX INFO: renamed from: ܽ */
    public static final C23311 f16897 = new C23311(EnumC21300.f67053, 0, 0, null);

    public C6547(C5127 c5127) {
        c5127.m10908(f16898, this);
        this.f16900 = C8200.m18988(c5127);
        for (EnumC21300 enumC21300 : EnumC21300.values()) {
            String str = enumC21300.f67120;
            if (str != null) {
                this.f16900.f21738.m32717(str);
                this.f16899.put(enumC21300.f67120, enumC21300);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21300 m14989(AbstractC12224 abstractC12224) {
        EnumC21300 enumC21300 = (EnumC21300) this.f16899.get(abstractC12224.toString());
        return enumC21300 != null ? enumC21300 : EnumC21300.f67050;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21300 m14988(String str) {
        EnumC21300 enumC21300 = (EnumC21300) this.f16899.get(str);
        return enumC21300 != null ? enumC21300 : EnumC21300.f67050;
    }
}
