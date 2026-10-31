package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩸ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21701 {
    SUCCESS("success"),
    FAILURE("failure"),
    APPLICABLE("applicable"),
    INAPPLICABLE("inapplicable"),
    DEFERRED_INST("deferred-inference"),
    PREDEF("predef"),
    OBJECT_INIT("object-init"),
    INTERNAL(UMModuleRegister.INNER);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f69613;

    EnumC21701(String str) {
        this.f69613 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m48990(C11781 c11781) {
        String strM28824 = c11781.m28824("debug.verboseResolution");
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC21701.class);
        if (strM28824 == null) {
            return enumSetNoneOf;
        }
        if (strM28824.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC21701.class);
        }
        List listAsList = Arrays.asList(strM28824.split(","));
        for (EnumC21701 enumC21701 : values()) {
            if (listAsList.contains(enumC21701.f69613)) {
                enumSetNoneOf.add(enumC21701);
            } else {
                if (listAsList.contains("-" + enumC21701.f69613)) {
                    enumSetNoneOf.remove(enumC21701);
                }
            }
        }
        return enumSetNoneOf;
    }
}
