package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩸ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22993 {
    SUCCESS("success"),
    FAILURE("failure"),
    APPLICABLE("applicable"),
    INAPPLICABLE("inapplicable"),
    DEFERRED_INST("deferred-inference"),
    PREDEF("predef"),
    OBJECT_INIT("object-init"),
    INTERNAL(UMModuleRegister.INNER);


    /* JADX INFO: renamed from: ᩸ */
    public final String f72318;

    EnumC22993(String str) {
        this.f72318 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumSet m51339(C13565 c13565) {
        String strM30872 = c13565.m30872("debug.verboseResolution");
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC22993.class);
        if (strM30872 == null) {
            return enumSetNoneOf;
        }
        if (strM30872.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC22993.class);
        }
        List listAsList = Arrays.asList(strM30872.split(","));
        for (EnumC22993 enumC22993 : values()) {
            if (listAsList.contains(enumC22993.f72318)) {
                enumSetNoneOf.add(enumC22993);
            } else {
                if (listAsList.contains("-" + enumC22993.f72318)) {
                    enumSetNoneOf.remove(enumC22993);
                }
            }
        }
        return enumSetNoneOf;
    }
}
