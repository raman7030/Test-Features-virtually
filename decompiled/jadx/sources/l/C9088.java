package l;

import android.text.TextUtils;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9088 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f27545;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f27546;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f27547;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f27540 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f27544 = AbstractC6079.of((Object) "auto", (Object) "none");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f27542 = AbstractC6079.m16987("dot", "sesame", "circle");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f27543 = AbstractC6079.of((Object) "filled", (Object) "open");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f27541 = AbstractC6079.m16987("after", "before", "outside");

    public C9088(int i, int i2, int i3) {
        this.f27546 = i;
        this.f27545 = i2;
        this.f27547 = i3;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9088 m23445(String str) {
        int i;
        AbstractC7991 abstractC7991M35588;
        int i2;
        AbstractC7991 abstractC7991M35589;
        AbstractC7991 abstractC7991M355810;
        String str2;
        int iHashCode;
        String str3;
        int iHashCode2;
        String str4;
        int iHashCode3;
        if (str == null) {
            return null;
        }
        String strM35799 = C15107.m35799(str.trim());
        if (strM35799.isEmpty()) {
            return null;
        }
        AbstractC6079 abstractC6079M16991 = AbstractC6079.m16991(TextUtils.split(strM35799, f27540));
        String str5 = (String) C4648.m13609(C15045.m35588((Set) f27541, abstractC6079M16991).iterator(), "outside");
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
            abstractC7991M35588 = C15045.m35588((Set) f27544, abstractC6079M16991);
            i2 = -1;
            if (!abstractC7991M35588.isEmpty()) {
                str4 = (String) abstractC7991M35588.iterator().next();
                iHashCode3 = str4.hashCode();
                if (iHashCode3 != 3005871) {
                    str4.equals("auto");
                } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                    i2 = 0;
                }
                return new C9088(i2, 0, i);
            }
            abstractC7991M35589 = C15045.m35588((Set) f27543, abstractC6079M16991);
            abstractC7991M355810 = C15045.m35588((Set) f27542, abstractC6079M16991);
            if (!abstractC7991M35589.isEmpty() && abstractC7991M355810.isEmpty()) {
                return new C9088(-1, 0, i);
            }
            str2 = (String) C4648.m13609(abstractC7991M35589.iterator(), "filled");
            iHashCode = str2.hashCode();
            if (iHashCode != -1274499742) {
                int i4 = (iHashCode != 3417674 && str2.equals("open")) ? 2 : 1;
                str3 = (String) C4648.m13609(abstractC7991M355810.iterator(), "circle");
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
                return new C9088(i3, i4, i);
            }
            str2.equals("filled");
            str3 = (String) C4648.m13609(abstractC7991M355810.iterator(), "circle");
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
            return new C9088(i3, i4, i);
        }
        str5.equals("before");
        i = 1;
        abstractC7991M35588 = C15045.m35588((Set) f27544, abstractC6079M16991);
        i2 = -1;
        if (!abstractC7991M35588.isEmpty()) {
            str4 = (String) abstractC7991M35588.iterator().next();
            iHashCode3 = str4.hashCode();
            if (iHashCode3 != 3005871) {
                str4.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new C9088(i2, 0, i);
        }
        abstractC7991M35589 = C15045.m35588((Set) f27543, abstractC6079M16991);
        abstractC7991M355810 = C15045.m35588((Set) f27542, abstractC6079M16991);
        if (!abstractC7991M35589.isEmpty()) {
        }
        str2 = (String) C4648.m13609(abstractC7991M35589.iterator(), "filled");
        iHashCode = str2.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode != 3417674) {
            }
            str3 = (String) C4648.m13609(abstractC7991M355810.iterator(), "circle");
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
            return new C9088(i3, i4, i);
        }
        str2.equals("filled");
        str3 = (String) C4648.m13609(abstractC7991M355810.iterator(), "circle");
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
        return new C9088(i3, i4, i);
    }
}
