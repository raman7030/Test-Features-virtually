package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܰ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13485 {
    SOURCE("source"),
    CLASS(Name.LABEL),
    REDUNDANT("redundant");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f40272;

    EnumC13485(String str) {
        this.f40272 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m32519(String[] strArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC13485.class);
        List listAsList = Arrays.asList(strArr);
        if (listAsList.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC13485.class);
        }
        for (EnumC13485 enumC13485 : values()) {
            if (listAsList.contains(enumC13485.f40272)) {
                enumSetNoneOf.add(enumC13485);
            } else {
                if (listAsList.contains("-" + enumC13485.f40272)) {
                    enumSetNoneOf.remove(enumC13485);
                }
            }
        }
        return enumSetNoneOf;
    }
}
