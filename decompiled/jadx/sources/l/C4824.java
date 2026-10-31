package l;

import java.util.Arrays;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۙᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes2.dex */
public final class C4824 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22463 f15249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumSet f15250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumSet f15251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f15248 = new C4314();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f15247 = new ConcurrentMapC10942(20);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4824 m14050(C2903 c2903) {
        C4824 c4824 = (C4824) c2903.m8838(f15248);
        return c4824 == null ? new C4824(c2903) : c4824;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m14053(AbstractC5698 abstractC5698) {
        C4824 c4824M50393 = this.f15249.m50393(this, abstractC5698.m16082());
        if (abstractC5698.mo956()) {
            if (c4824M50393 == this) {
                c4824M50393 = new C4824(this);
            }
            EnumSet enumSet = c4824M50393.f15251;
            EnumC20347 enumC20347 = EnumC20347.DEPRECATION;
            enumSet.remove(enumC20347);
            c4824M50393.f15250.add(enumC20347);
        }
        return c4824M50393;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m14054(EnumC20347... enumC20347Arr) {
        C4824 c4824 = new C4824(this);
        c4824.f15251.removeAll(Arrays.asList(enumC20347Arr));
        c4824.f15250.addAll(Arrays.asList(enumC20347Arr));
        return c4824;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    public C4824(C2903 c2903) {
        C11781 c11781M28823 = C11781.m28823(c2903);
        if (c11781M28823.m28832(EnumC0121.f1188)) {
            this.f15251 = EnumSet.allOf(EnumC20347.class);
        } else {
            EnumC0121 enumC0121 = EnumC0121.f1177;
            if (c11781M28823.m28829(enumC0121, ProviderConfigurationPermission.ALL_STR)) {
                this.f15251 = EnumSet.allOf(EnumC20347.class);
            } else if (c11781M28823.m28829(enumC0121, "none")) {
                this.f15251 = EnumSet.noneOf(EnumC20347.class);
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC20347.class);
                this.f15251 = enumSetNoneOf;
                EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
                if (enumC16280M38301.compareTo(EnumC16280.JDK9) >= 0) {
                    enumSetNoneOf.add(EnumC20347.DEP_ANN);
                }
                if (EnumC10637.f31975.m26686(enumC16280M38301)) {
                    enumSetNoneOf.add(EnumC20347.STRICTFP);
                }
                enumSetNoneOf.add(EnumC20347.REQUIRES_TRANSITIVE_AUTOMATIC);
                enumSetNoneOf.add(EnumC20347.OPENS);
                enumSetNoneOf.add(EnumC20347.MODULE);
                enumSetNoneOf.add(EnumC20347.REMOVAL);
                if (!c11781M28823.m28832(EnumC0121.f1210)) {
                    enumSetNoneOf.add(EnumC20347.PREVIEW);
                }
                enumSetNoneOf.add(EnumC20347.SYNCHRONIZATION);
            }
        }
        for (EnumC20347 enumC20347 : EnumC20347.values()) {
            EnumC0121 enumC0122 = EnumC0121.f1177;
            if (c11781M28823.m28829(enumC0122, enumC20347.f65711)) {
                this.f15251.add(enumC20347);
            } else {
                if (c11781M28823.m28829(enumC0122, "-" + enumC20347.f65711)) {
                    this.f15251.remove(enumC20347);
                }
            }
        }
        this.f15250 = EnumSet.noneOf(EnumC20347.class);
        c2903.m8841(f15248, this);
        this.f15249 = new C22463(c2903);
    }

    public C4824(C4824 c4824) {
        this.f15249 = c4824.f15249;
        this.f15251 = c4824.f15251.clone();
        this.f15250 = c4824.f15250.clone();
    }

    public final String toString() {
        return "Lint:[values" + this.f15251 + " suppressedValues" + this.f15250 + "]";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14055(EnumC20347 enumC20347) {
        return this.f15251.contains(enumC20347);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14056(EnumC20347 enumC20347) {
        return this.f15250.contains(enumC20347);
    }
}
