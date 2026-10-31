package l;

import com.alipay.sdk.m.t.e;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۧ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11280 {
    DIAMOND("diamond", EnumC10637.f31994),
    LAMBDA("lambda", EnumC10637.f32004),
    METHOD(e.s, EnumC10637.f31993),
    LOCAL("local", EnumC10637.f32000);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC10637 f33796;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f33797;

    EnumC11280(String str, EnumC10637 enumC10637) {
        this.f33797 = str;
        this.f33796 = enumC10637;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m27892(String str, EnumC16280 enumC16280) {
        if (str == null) {
            return EnumSet.noneOf(EnumC11280.class);
        }
        C2609 c2609M8238 = C2609.m8238((Object[]) str.split(","));
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC11280.class);
        if (c2609M8238.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC11280.class);
        }
        for (EnumC11280 enumC11280 : values()) {
            if (c2609M8238.contains("-" + enumC11280.f33797) || !enumC11280.f33796.m26686(enumC16280)) {
                enumSetNoneOf.remove(enumC11280);
            } else if (c2609M8238.contains(enumC11280.f33797)) {
                enumSetNoneOf.add(enumC11280);
            }
        }
        return enumSetNoneOf;
    }
}
