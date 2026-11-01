package p067l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܰ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15184 {
    SOURCE("source"),
    CLASS(Name.LABEL),
    REDUNDANT("redundant");


    /* JADX INFO: renamed from: ᩸ */
    public final String f43342;

    EnumC15184(String str) {
        this.f43342 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumSet m34621(String[] strArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC15184.class);
        List listAsList = Arrays.asList(strArr);
        if (listAsList.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC15184.class);
        }
        for (EnumC15184 enumC15184 : values()) {
            if (listAsList.contains(enumC15184.f43342)) {
                enumSetNoneOf.add(enumC15184);
            } else {
                if (listAsList.contains("-" + enumC15184.f43342)) {
                    enumSetNoneOf.remove(enumC15184);
                }
            }
        }
        return enumSetNoneOf;
    }
}
