package p067l;

import android.text.TextUtils;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11006 {

    /* JADX INFO: renamed from: ֫ */
    public final int f30482;

    /* JADX INFO: renamed from: ۧ */
    public final int f30483;

    /* JADX INFO: renamed from: ܽ */
    public final int f30484;

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f30477 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ᩻ */
    public static final AbstractC8146 f30481 = AbstractC8146.m18916of((Object) "auto", (Object) "none");

    /* JADX INFO: renamed from: ܿ */
    public static final AbstractC8146 f30479 = AbstractC8146.m18918("dot", "sesame", "circle");

    /* JADX INFO: renamed from: ᩳ */
    public static final AbstractC8146 f30480 = AbstractC8146.m18916of((Object) "filled", (Object) "open");

    /* JADX INFO: renamed from: ܳ */
    public static final AbstractC8146 f30478 = AbstractC8146.m18918("after", "before", "outside");

    public C11006(int i, int i2, int i3) {
        this.f30483 = i;
        this.f30482 = i2;
        this.f30484 = i3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX INFO: renamed from: ֫ */
    public static C11006 m25392(String str) {
        int i;
        AbstractC9963 abstractC9963M37746;
        int i2;
        AbstractC9963 abstractC9963M37747;
        AbstractC9963 abstractC9963M37748;
        String str2;
        int iHashCode;
        String str3;
        int iHashCode2;
        String str4;
        int iHashCode3;
        if (str == null) {
            return null;
        }
        String strM37957 = C16726.m37957(str.trim());
        if (strM37957.isEmpty()) {
            return null;
        }
        AbstractC8146 abstractC8146M18922 = AbstractC8146.m18922(TextUtils.split(strM37957, f30477));
        String str5 = (String) C6786.m15484(C16667.m37746((Set) f30478, abstractC8146M18922).iterator(), "outside");
        int iHashCode4 = str5.hashCode();
        int i3 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str5.equals("after")) {
                    i = 2;
                }
            } else if (str5.equals("outside")) {
                i = -2;
            }
            abstractC9963M37746 = C16667.m37746((Set) f30481, abstractC8146M18922);
            i2 = -1;
            if (!abstractC9963M37746.isEmpty()) {
                str4 = (String) abstractC9963M37746.iterator().next();
                iHashCode3 = str4.hashCode();
                if (iHashCode3 != 3005871) {
                    str4.equals("auto");
                } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                    i2 = 0;
                }
                return new C11006(i2, 0, i);
            }
            abstractC9963M37747 = C16667.m37746((Set) f30480, abstractC8146M18922);
            abstractC9963M37748 = C16667.m37746((Set) f30479, abstractC8146M18922);
            if (!abstractC9963M37747.isEmpty() && abstractC9963M37748.isEmpty()) {
                return new C11006(-1, 0, i);
            }
            str2 = (String) C6786.m15484(abstractC9963M37747.iterator(), "filled");
            iHashCode = str2.hashCode();
            if (iHashCode != -1274499742) {
                int i4 = (iHashCode != 3417674 && str2.equals("open")) ? 2 : 1;
                str3 = (String) C6786.m15484(abstractC9963M37748.iterator(), "circle");
                iHashCode2 = str3.hashCode();
                if (iHashCode2 != -1360216880) {
                    str3.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str3.equals("dot")) {
                        i3 = 2;
                    }
                } else if (str3.equals("sesame")) {
                    i3 = 3;
                }
                return new C11006(i3, i4, i);
            }
            str2.equals("filled");
            str3 = (String) C6786.m15484(abstractC9963M37748.iterator(), "circle");
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i3 = 2;
                }
            } else if (str3.equals("sesame")) {
                i3 = 3;
            }
            return new C11006(i3, i4, i);
        }
        str5.equals("before");
        i = 1;
        abstractC9963M37746 = C16667.m37746((Set) f30481, abstractC8146M18922);
        i2 = -1;
        if (!abstractC9963M37746.isEmpty()) {
            str4 = (String) abstractC9963M37746.iterator().next();
            iHashCode3 = str4.hashCode();
            if (iHashCode3 != 3005871) {
                str4.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new C11006(i2, 0, i);
        }
        abstractC9963M37747 = C16667.m37746((Set) f30480, abstractC8146M18922);
        abstractC9963M37748 = C16667.m37746((Set) f30479, abstractC8146M18922);
        if (!abstractC9963M37747.isEmpty()) {
        }
        str2 = (String) C6786.m15484(abstractC9963M37747.iterator(), "filled");
        iHashCode = str2.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode != 3417674) {
            }
            str3 = (String) C6786.m15484(abstractC9963M37748.iterator(), "circle");
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i3 = 2;
                }
            } else if (str3.equals("sesame")) {
                i3 = 3;
            }
            return new C11006(i3, i4, i);
        }
        str2.equals("filled");
        str3 = (String) C6786.m15484(abstractC9963M37748.iterator(), "circle");
        iHashCode2 = str3.hashCode();
        if (iHashCode2 != -1360216880) {
            str3.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i3 = 2;
            }
        } else if (str3.equals("sesame")) {
            i3 = 3;
        }
        return new C11006(i3, i4, i);
    }
}
