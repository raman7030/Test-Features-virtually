package p067l;

import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩶ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21437 {
    NONE,
    CLASS,
    UNSET;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21437 m48563(String str) {
        if (str == null) {
            return UNSET;
        }
        if (str.equals("none")) {
            return NONE;
        }
        if (str.equals(Name.LABEL)) {
            return CLASS;
        }
        return UNSET;
    }
}
