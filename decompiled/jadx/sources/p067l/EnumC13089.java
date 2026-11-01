package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۧ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13089 {
    DIAMOND("diamond", EnumC12477.f34965),
    LAMBDA("lambda", EnumC12477.f34975),
    METHOD(AbstractC0213e.f995s, EnumC12477.f34964),
    LOCAL("local", EnumC12477.f34971);


    /* JADX INFO: renamed from: ᩸ */
    public final EnumC12477 f36795;

    /* JADX INFO: renamed from: ᩹ */
    public final String f36796;

    EnumC13089(String str, EnumC12477 enumC12477) {
        this.f36796 = str;
        this.f36795 = enumC12477;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumSet m29953(String str, EnumC17840 enumC17840) {
        if (str == null) {
            return EnumSet.noneOf(EnumC13089.class);
        }
        C4848 c4848M10282 = C4848.m10282((Object[]) str.split(","));
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC13089.class);
        if (c4848M10282.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC13089.class);
        }
        for (EnumC13089 enumC13089 : values()) {
            if (c4848M10282.contains("-" + enumC13089.f36796) || !enumC13089.f36795.m28726(enumC17840)) {
                enumSetNoneOf.remove(enumC13089);
            } else if (c4848M10282.contains(enumC13089.f36796)) {
                enumSetNoneOf.add(enumC13089);
            }
        }
        return enumSetNoneOf;
    }
}
