package p067l;

import java.util.Arrays;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۙᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes2.dex */
public final class C6953 {

    /* JADX INFO: renamed from: ֫ */
    public final C23717 f18082;

    /* JADX INFO: renamed from: ۧ */
    public final EnumSet f18083;

    /* JADX INFO: renamed from: ܽ */
    public final EnumSet f18084;

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f18081 = new C6468();

    /* JADX INFO: renamed from: ܿ */
    public static final ConcurrentMapC12768 f18080 = new ConcurrentMapC12768(20);

    /* JADX INFO: renamed from: ֫ */
    public static C6953 m15930(C5127 c5127) {
        C6953 c6953 = (C6953) c5127.m10905(f18081);
        return c6953 == null ? new C6953(c5127) : c6953;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6953 m15933(AbstractC7783 abstractC7783) {
        C6953 c6953M52734 = this.f18082.m52734(this, abstractC7783.m18001());
        if (abstractC7783.mo3351()) {
            if (c6953M52734 == this) {
                c6953M52734 = new C6953(this);
            }
            EnumSet enumSet = c6953M52734.f18084;
            EnumC21706 enumC21706 = EnumC21706.DEPRECATION;
            enumSet.remove(enumC21706);
            c6953M52734.f18083.add(enumC21706);
        }
        return c6953M52734;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6953 m15934(EnumC21706... enumC21706Arr) {
        C6953 c6953 = new C6953(this);
        c6953.f18084.removeAll(Arrays.asList(enumC21706Arr));
        c6953.f18083.addAll(Arrays.asList(enumC21706Arr));
        return c6953;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    public C6953(C5127 c5127) {
        C13565 c13565M30871 = C13565.m30871(c5127);
        if (c13565M30871.m30880(EnumC2483.f3964)) {
            this.f18084 = EnumSet.allOf(EnumC21706.class);
        } else {
            EnumC2483 enumC2483 = EnumC2483.f3953;
            if (c13565M30871.m30877(enumC2483, ProviderConfigurationPermission.ALL_STR)) {
                this.f18084 = EnumSet.allOf(EnumC21706.class);
            } else if (c13565M30871.m30877(enumC2483, "none")) {
                this.f18084 = EnumSet.noneOf(EnumC21706.class);
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC21706.class);
                this.f18084 = enumSetNoneOf;
                EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
                if (enumC17840M40515.compareTo(EnumC17840.JDK9) >= 0) {
                    enumSetNoneOf.add(EnumC21706.DEP_ANN);
                }
                if (EnumC12477.f34946.m28726(enumC17840M40515)) {
                    enumSetNoneOf.add(EnumC21706.STRICTFP);
                }
                enumSetNoneOf.add(EnumC21706.REQUIRES_TRANSITIVE_AUTOMATIC);
                enumSetNoneOf.add(EnumC21706.OPENS);
                enumSetNoneOf.add(EnumC21706.MODULE);
                enumSetNoneOf.add(EnumC21706.REMOVAL);
                if (!c13565M30871.m30880(EnumC2483.f3986)) {
                    enumSetNoneOf.add(EnumC21706.PREVIEW);
                }
                enumSetNoneOf.add(EnumC21706.SYNCHRONIZATION);
            }
        }
        for (EnumC21706 enumC21706 : EnumC21706.values()) {
            EnumC2483 enumC2484 = EnumC2483.f3953;
            if (c13565M30871.m30877(enumC2484, enumC21706.f68387)) {
                this.f18084.add(enumC21706);
            } else {
                if (c13565M30871.m30877(enumC2484, "-" + enumC21706.f68387)) {
                    this.f18084.remove(enumC21706);
                }
            }
        }
        this.f18083 = EnumSet.noneOf(EnumC21706.class);
        c5127.m10908(f18081, this);
        this.f18082 = new C23717(c5127);
    }

    public C6953(C6953 c6953) {
        this.f18082 = c6953.f18082;
        this.f18084 = c6953.f18084.clone();
        this.f18083 = c6953.f18083.clone();
    }

    public final String toString() {
        return "Lint:[values" + this.f18084 + " suppressedValues" + this.f18083 + "]";
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15935(EnumC21706 enumC21706) {
        return this.f18084.contains(enumC21706);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m15936(EnumC21706 enumC21706) {
        return this.f18083.contains(enumC21706);
    }
}
