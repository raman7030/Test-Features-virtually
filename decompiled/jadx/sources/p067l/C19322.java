package p067l;

import android.util.Pair;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0698cb;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX INFO: renamed from: l.ᩳۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19322 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f57686 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f57688 = {0, 0, 0, 1};

    /* JADX INFO: renamed from: ۧ */
    public static final String[] f57687 = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f57689 = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: ֫ */
    public static String m44015(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        Object[] objArr = {f57687[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = C5792.f14228;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:161:0x026e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public static Pair m44013(String str, String[] strArr, C22378 c22378) {
        int i;
        Integer numValueOf;
        if (strArr.length < 4) {
            C6988.m16054("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        Matcher matcher = f57689.matcher(strArr[1]);
        if (!matcher.matches()) {
            C6988.m16054("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        String strGroup = matcher.group(1);
        byte b = 6;
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (c22378 == null || c22378.f70603 != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                C6988.m16054("Unknown HEVC profile string: ", strGroup);
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (!str2.equals("H30")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 70914:
                    if (!str2.equals("H60")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 70917:
                    if (!str2.equals("H63")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 71007:
                    if (!str2.equals("H90")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 71010:
                    if (!str2.equals("H93")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 74665:
                    if (!str2.equals("L30")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                        b = -1;
                    }
                    break;
                case 74761:
                    if (!str2.equals("L63")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 74851:
                    if (!str2.equals("L90")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 74854:
                    if (!str2.equals("L93")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 2193639:
                    if (!str2.equals("H120")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 2193642:
                    if (!str2.equals("H123")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 2193732:
                    if (!str2.equals("H150")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case 2193735:
                    if (!str2.equals("H153")) {
                        b = -1;
                    } else {
                        b = C0698cb.f2569k;
                    }
                    break;
                case 2193738:
                    if (!str2.equals("H156")) {
                        b = -1;
                    } else {
                        b = C0698cb.f2570l;
                    }
                    break;
                case 2193825:
                    if (!str2.equals("H180")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 2193828:
                    if (!str2.equals("H183")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 2193831:
                    if (!str2.equals("H186")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 2312803:
                    if (!str2.equals("L120")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 2312806:
                    if (!str2.equals("L123")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 2312896:
                    if (!str2.equals("L150")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 2312899:
                    if (!str2.equals("L153")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 2312902:
                    if (!str2.equals("L156")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 2312989:
                    if (!str2.equals("L180")) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 2312992:
                    if (!str2.equals("L183")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 2312995:
                    if (!str2.equals("L186")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    numValueOf = 2;
                    break;
                case 1:
                    numValueOf = 8;
                    break;
                case 2:
                    numValueOf = 32;
                    break;
                case 3:
                    numValueOf = 128;
                    break;
                case 4:
                    numValueOf = 512;
                    break;
                case 5:
                    numValueOf = 1;
                    break;
                case 6:
                    numValueOf = 4;
                    break;
                case 7:
                    numValueOf = 16;
                    break;
                case 8:
                    numValueOf = 64;
                    break;
                case 9:
                    numValueOf = 256;
                    break;
                case 10:
                    numValueOf = 2048;
                    break;
                case 11:
                    numValueOf = 8192;
                    break;
                case 12:
                    numValueOf = 32768;
                    break;
                case 13:
                    numValueOf = Integer.valueOf(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
                    break;
                case 14:
                    numValueOf = 524288;
                    break;
                case 15:
                    numValueOf = 2097152;
                    break;
                case 16:
                    numValueOf = 8388608;
                    break;
                case 17:
                    numValueOf = 33554432;
                    break;
                case 18:
                    numValueOf = 1024;
                    break;
                case 19:
                    numValueOf = 4096;
                    break;
                case 20:
                    numValueOf = 16384;
                    break;
                case 21:
                    numValueOf = 65536;
                    break;
                case 22:
                    numValueOf = 262144;
                    break;
                case 23:
                    numValueOf = 1048576;
                    break;
                case 24:
                    numValueOf = 4194304;
                    break;
                case 25:
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i), numValueOf);
        }
        C6988.m16054("Unknown HEVC level string: ", str2);
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m44016(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f57688, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01df  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:132:0x0203  */
    /* JADX WARN: Code duplicated, block: B:133:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x020c  */
    /* JADX WARN: Code duplicated, block: B:137:0x020e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0215  */
    /* JADX WARN: Code duplicated, block: B:141:0x0217  */
    /* JADX WARN: Code duplicated, block: B:144:0x021c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0223  */
    /* JADX WARN: Code duplicated, block: B:146:0x0228  */
    /* JADX WARN: Code duplicated, block: B:147:0x022a  */
    /* JADX WARN: Code duplicated, block: B:148:0x022d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0230  */
    /* JADX WARN: Code duplicated, block: B:150:0x0233  */
    /* JADX WARN: Code duplicated, block: B:151:0x0236  */
    /* JADX WARN: Code duplicated, block: B:152:0x0239  */
    /* JADX WARN: Code duplicated, block: B:153:0x023c  */
    /* JADX WARN: Code duplicated, block: B:154:0x023f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0242  */
    /* JADX WARN: Code duplicated, block: B:156:0x0244  */
    /* JADX WARN: Code duplicated, block: B:158:0x0247  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:307:0x0413 A[PHI: r3
      0x0413: PHI (r3v30 int) = (r3v29 int), (r3v34 int), (r3v35 int), (r3v36 int), (r3v37 int) binds: [B:288:0x03e3, B:291:0x03e9, B:293:0x03ed, B:295:0x03f1, B:297:0x03f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:338:0x0473  */
    /* JADX WARN: Code duplicated, block: B:502:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX INFO: renamed from: ֫ */
    public static Pair m44014(C10307 c10307) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer num;
        byte b2;
        Integer num2;
        String str;
        Integer num3 = 1;
        String str2 = c10307.f28533;
        C22378 c22378 = c10307.f28551;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        if ("video/dolby-vision".equals(c10307.f28528)) {
            if (strArrSplit.length < 3) {
                C6988.m16054("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            Matcher matcher = f57689.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                C6988.m16054("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup.hashCode()) {
                    case 1536:
                        num = 32;
                        b2 = !strGroup.equals(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT) ? (byte) -1 : (byte) 0;
                        break;
                    case 1537:
                        if (!strGroup.equals("01")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 1;
                        }
                        break;
                    case 1538:
                        if (!strGroup.equals("02")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 2;
                        }
                        break;
                    case 1539:
                        if (!strGroup.equals("03")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 3;
                        }
                        break;
                    case 1540:
                        if (!strGroup.equals("04")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 4;
                        }
                        break;
                    case 1541:
                        if (!strGroup.equals("05")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 5;
                        }
                        break;
                    case 1542:
                        if (!strGroup.equals("06")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 6;
                        }
                        break;
                    case 1543:
                        if (!strGroup.equals("07")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 7;
                        }
                        break;
                    case 1544:
                        if (!strGroup.equals("08")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 8;
                        }
                        break;
                    case 1545:
                        if (!strGroup.equals("09")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 9;
                        }
                        break;
                    case 1567:
                        if (!strGroup.equals("10")) {
                            num = 32;
                        } else {
                            num = 32;
                            b2 = 10;
                        }
                        break;
                    default:
                        num = 32;
                        break;
                }
                switch (b2) {
                    case 0:
                        num2 = num3;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = num;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case 8:
                        num2 = 256;
                        break;
                    case 9:
                        num2 = 512;
                        break;
                    case 10:
                        num2 = 1024;
                        break;
                }
                if (num2 == null) {
                    C6988.m16054("Unknown Dolby Vision profile string: ", strGroup);
                    return null;
                }
                str = strArrSplit[2];
                if (str == null) {
                    switch (str) {
                        case "01":
                            break;
                        case "02":
                            num3 = 2;
                            break;
                        case "03":
                            num3 = 4;
                            break;
                        case "04":
                            num3 = 8;
                            break;
                        case "05":
                            num3 = 16;
                            break;
                        case "06":
                            num3 = num;
                            break;
                        case "07":
                            num3 = 64;
                            break;
                        case "08":
                            num3 = 128;
                            break;
                        case "09":
                            num3 = 256;
                            break;
                        case "10":
                            num3 = 512;
                            break;
                        case "11":
                            num3 = 1024;
                            break;
                        case "12":
                            num3 = 2048;
                            break;
                        case "13":
                            num3 = 4096;
                            break;
                        default:
                            num3 = null;
                            break;
                    }
                } else {
                    num3 = null;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                C6988.m16054("Unknown Dolby Vision level string: ", str);
                return null;
            }
            num = 32;
            num2 = null;
            if (num2 == null) {
                C6988.m16054("Unknown Dolby Vision profile string: ", strGroup);
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str) {
                    case 1537:
                        if (str.equals("01")) {
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                        }
                        break;
                    case 1570:
                        if (str.equals(SRP6StandardGroups.rfc5054_8192_g)) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 2192
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p067l.C19322.m44014(l.۠ᩴ֫):android.util.Pair");
            }
        }
