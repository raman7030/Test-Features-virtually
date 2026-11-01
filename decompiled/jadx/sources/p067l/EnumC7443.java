package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۚۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC7443 {
    SIZE_64KB(4),
    SIZE_256KB(5),
    SIZE_1MB(6),
    SIZE_4MB(7);


    /* JADX INFO: renamed from: ᩸ */
    public final int f19492;

    EnumC7443(int i) {
        this.f19492 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC7443 m17191(int i) {
        if (i == 4) {
            return SIZE_64KB;
        }
        if (i == 5) {
            return SIZE_256KB;
        }
        if (i == 6) {
            return SIZE_1MB;
        }
        if (i == 7) {
            return SIZE_4MB;
        }
        Locale locale = Locale.ROOT;
        throw new IllegalArgumentException(C19768.m44906(i, "Block size must be 4-7. Cannot use value of [", "]"));
    }

    /* JADX INFO: renamed from: ֫ */
    public int m17193() {
        return this.f19492;
    }
}
