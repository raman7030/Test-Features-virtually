package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBEY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2677 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3570 m8388(C23843 c23843, C22453 c22453, C16081 c16081, C9733 c9733, C1662 c1662) {
        try {
            return m8390(c23843, c22453, c16081, c9733, c1662);
        } catch (RuntimeException e) {
            throw C8136.m21601("...while processing " + c22453.m50390(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02d0 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02dd A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02eb A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0304 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0306 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0309 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0310 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0315 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0327 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x018a A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0251 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0260 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0278 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x027d A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0281 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0290 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0293 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3570 m8390(C23843 c23843, C22453 c22453, C16081 c16081, C9733 c9733, C1662 c1662) {
        String str;
        String str2;
        C21418 c21418;
        C6601 c6601;
        C8012 c8012;
        String str3;
        String str4;
        C13074 c13074;
        InterfaceC10711 interfaceC10711M31684;
        C17184 c17184;
        C22911 c22911M23274;
        C13074 c13075;
        InterfaceC10711 interfaceC10711M31685;
        C1950 c1950;
        C13779 c13779;
        C13738 c13738M33037;
        C13012 c13012M23347;
        int iM33357;
        C4088 c4088 = c23843.f77164;
        c16081.getClass();
        c4088.m12289();
        C3570 c3570 = new C3570(c22453.m50378(), c22453.m50376() & (-33), c22453.m50385(), c22453.m50380(), c22453.m50381());
        C22911 c22911M23275 = C9027.m23275(c22453, c16081);
        if (c22911M23275.size() != 0) {
            c3570.m10883(c22911M23275, c1662);
        }
        C6601 c6601M5626 = c1662.m5626();
        C21418 c21418M5627 = c1662.m5627();
        C8012 c8012M5622 = c1662.m5622();
        C21915 c21915M5624 = c1662.m5624();
        C12512 c12512M50378 = c22453.m50378();
        C1971 c1971M50384 = c22453.m50384();
        int size = c1971M50384.size();
        int i = 0;
        while (true) {
            str = " ";
            str2 = "...while processing ";
            if (i >= size) {
                break;
            }
            InterfaceC10459 interfaceC10459M40997get = c1971M50384.m40997get(i);
            C1971 c1971 = c1971M50384;
            try {
                int i2 = size;
                C8985 c8985 = new C8985(c12512M50378, interfaceC10459M40997get.mo10264());
                int iMo10269 = interfaceC10459M40997get.mo10269();
                if ((iMo10269 & 8) != 0) {
                    AbstractC6162 abstractC6162Mo20427 = interfaceC10459M40997get.mo20427();
                    C16478 c16478 = new C16478(c8985, iMo10269);
                    if (abstractC6162Mo20427 != null) {
                        abstractC6162Mo20427 = m8389(abstractC6162Mo20427, c8985.getType());
                    }
                    c3570.m10879(c16478, abstractC6162Mo20427);
                } else {
                    c3570.m10878(new C16478(c8985, iMo10269));
                }
                C22911 c22911M23276 = C9027.m23274(interfaceC10459M40997get.getAttributes());
                if (c22911M23276.size() != 0) {
                    c3570.m10877(c8985, c22911M23276, c1662);
                }
                c1662.m5626().m18104(c8985);
                i++;
                c1971M50384 = c1971;
                size = i2;
                c12512M50378 = c12512M50378;
                c21915M5624 = c21915M5624;
            } catch (RuntimeException e) {
                throw C8136.m21601("...while processing " + interfaceC10459M40997get.getName().mo2463() + " " + interfaceC10459M40997get.mo10273().mo2463(), e);
            }
        }
        C21915 c21915 = c21915M5624;
        C12512 c12512M50379 = c22453.m50378();
        C18199 c18199M50382 = c22453.m50382();
        int size2 = c18199M50382.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = size2;
            InterfaceC11870 interfaceC11870M40998get = c18199M50382.m40998get(i3);
            C8012 c8013 = c8012M5622;
            try {
                C22390 c22390 = new C22390(c12512M50379, interfaceC11870M40998get.mo10264());
                C6601 c6602 = c6601M5626;
                int iMo102610 = interfaceC11870M40998get.mo10269();
                boolean z = (iMo102610 & 8) != 0;
                boolean z2 = (iMo102610 & 2) != 0;
                boolean z3 = (iMo102610 & 256) != 0;
                boolean z4 = (iMo102610 & 1024) != 0;
                boolean z5 = c22390.m36364().m46531() || c22390.m36364().m46530();
                Object objM12061 = null;
                if (z3 || z4) {
                    i3 = i3;
                    str3 = str;
                    str4 = str2;
                } else {
                    try {
                        str3 = str;
                        try {
                            try {
                                str4 = str2;
                                try {
                                    c13012M23347 = C9048.m23347(new C3361(interfaceC11870M40998get, c22453, c16081.f49563), c18199M50382, c9733);
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    if (c16081.f49565) {
                                        throw e;
                                    }
                                    C6987 c6987 = new C6987(c22453.m50376());
                                    c6987.mo18883(196653, c22453.m50376(), c22453.m50378().m30696().m20309(), null, "java/lang/Object", null);
                                    AbstractC15452 abstractC15452Mo18880 = c6987.mo18880(interfaceC11870M40998get.mo10269(), interfaceC11870M40998get.getName().getString(), interfaceC11870M40998get.mo10273().getString(), (String) null, (String[]) null);
                                    abstractC15452Mo18880.mo26978(187, "java/lang/RuntimeException");
                                    abstractC15452Mo18880.mo28279(89);
                                    abstractC15452Mo18880.mo26971("Couldn't be decompiled.");
                                    abstractC15452Mo18880.mo12089(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                    abstractC15452Mo18880.mo28279(191);
                                    abstractC15452Mo18880.mo28294(2, 2);
                                    C22453 c22454 = new C22453(c22453.m50390(), false, c6987.m18891());
                                    c22454.m50379();
                                    c22454.m50389();
                                    c13012M23347 = C9048.m23347(new C3361(c22454.m50382().m40998get(0), c22454, c16081.f49563), c18199M50382, c9733);
                                    e = e;
                                    throw C8136.m21601(str4 + interfaceC11870M40998get.getName().mo2463() + str3 + interfaceC11870M40998get.mo10273().mo2463(), e);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                str4 = str2;
                                if (c16081.f49565) {
                                    throw e;
                                }
                                C6987 c6988 = new C6987(c22453.m50376());
                                c6988.mo18883(196653, c22453.m50376(), c22453.m50378().m30696().m20309(), null, "java/lang/Object", null);
                                AbstractC15452 abstractC15452Mo18881 = c6988.mo18880(interfaceC11870M40998get.mo10269(), interfaceC11870M40998get.getName().getString(), interfaceC11870M40998get.mo10273().getString(), (String) null, (String[]) null);
                                abstractC15452Mo18881.mo26978(187, "java/lang/RuntimeException");
                                abstractC15452Mo18881.mo28279(89);
                                abstractC15452Mo18881.mo26971("Couldn't be decompiled.");
                                abstractC15452Mo18881.mo12089(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                abstractC15452Mo18881.mo28279(191);
                                abstractC15452Mo18881.mo28294(2, 2);
                                C22453 c22455 = new C22453(c22453.m50390(), false, c6988.m18891());
                                c22455.m50379();
                                c22455.m50389();
                                c13012M23347 = C9048.m23347(new C3361(c22455.m50382().m40998get(0), c22455, c16081.f49563), c18199M50382, c9733);
                                iM33357 = c22390.m39385(z).m51259().m33357();
                                StringBuilder sb = new StringBuilder();
                                sb.append(c12512M50379.m30696().m20300());
                                sb.append(".");
                                sb.append(interfaceC11870M40998get.getName().getString());
                                if (c16081.f49564) {
                                    c23843.f77164.getClass();
                                    c13012M23347 = C5772.m16228(c13012M23347, iM33357, c16081.f49563);
                                }
                                objM12061 = C4004.m12061(c13012M23347, c16081.f49563 ? C19364.m44622(c13012M23347) : null, iM33357, c9733);
                                C20316 c20316 = objM12061;
                                if ((iMo102610 & 32) != 0) {
                                    iMo102610 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                    if (!z3) {
                                        iMo102610 &= -33;
                                    }
                                }
                                if (z5) {
                                    iMo102610 |= 65536;
                                }
                                c13074 = (C13074) interfaceC11870M40998get.getAttributes().m33465("Exceptions");
                                if (c13074 == null) {
                                    interfaceC10711M31684 = C13922.f41594;
                                } else {
                                    interfaceC10711M31684 = c13074.m31684();
                                }
                                c17184 = new C17184(c22390, iMo102610, c20316, interfaceC10711M31684);
                                if (!c22390.m36364().m46531()) {
                                    c3570.m10880(c17184);
                                } else {
                                    c3570.m10880(c17184);
                                }
                                c22911M23274 = C9027.m23274(interfaceC11870M40998get.getAttributes());
                                c13075 = (C13074) interfaceC11870M40998get.getAttributes().m33465("Exceptions");
                                if (c13075 == null) {
                                    interfaceC10711M31685 = C13922.f41594;
                                } else {
                                    interfaceC10711M31685 = c13075.m31684();
                                }
                                if (interfaceC10711M31685.size() != 0) {
                                    c22911M23274 = C22911.m50994(c22911M23274, C1453.m5002(interfaceC10711M31685));
                                }
                                if (c22911M23274.size() != 0) {
                                    c3570.m10882(c22390, c22911M23274, c1662);
                                }
                                C13985 attributes = interfaceC11870M40998get.getAttributes();
                                c1950 = (C1950) attributes.m33465("RuntimeVisibleParameterAnnotations");
                                c13779 = (C13779) attributes.m33465("RuntimeInvisibleParameterAnnotations");
                                if (c1950 == null) {
                                    if (c13779 == null) {
                                        c13738M33037 = C13738.f41017;
                                    } else {
                                        c13738M33037 = c13779.m47819();
                                    }
                                } else if (c13779 == null) {
                                    c13738M33037 = c1950.m47819();
                                } else {
                                    c13738M33037 = C13738.m33037(c1950.m47819(), c13779.m47819());
                                }
                                if (c13738M33037.size() != 0) {
                                    c3570.m10881(c22390, c13738M33037, c1662);
                                }
                                c1662.m5627().m48540(c22390);
                                i3++;
                                size2 = i4;
                                c8012M5622 = c8013;
                                c6601M5626 = c6602;
                                c21418M5627 = c21418M5627;
                                str = str3;
                                str2 = str4;
                                e = e;
                                throw C8136.m21601(str4 + interfaceC11870M40998get.getName().mo2463() + str3 + interfaceC11870M40998get.mo10273().mo2463(), e);
                            }
                            iM33357 = c22390.m39385(z).m51259().m33357();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c12512M50379.m30696().m20300());
                            sb2.append(".");
                            sb2.append(interfaceC11870M40998get.getName().getString());
                            if (c16081.f49564) {
                                c23843.f77164.getClass();
                                c13012M23347 = C5772.m16228(c13012M23347, iM33357, c16081.f49563);
                            }
                            objM12061 = C4004.m12061(c13012M23347, c16081.f49563 ? C19364.m44622(c13012M23347) : null, iM33357, c9733);
                        } catch (RuntimeException e4) {
                            e = e4;
                            throw C8136.m21601(str4 + interfaceC11870M40998get.getName().mo2463() + str3 + interfaceC11870M40998get.mo10273().mo2463(), e);
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                        str3 = str;
                    }
                }
                C20316 c20317 = objM12061;
                if ((iMo102610 & 32) != 0) {
                    iMo102610 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    if (!z3) {
                        iMo102610 &= -33;
                    }
                }
                if (z5) {
                    iMo102610 |= 65536;
                }
                c13074 = (C13074) interfaceC11870M40998get.getAttributes().m33465("Exceptions");
                if (c13074 == null) {
                    interfaceC10711M31684 = C13922.f41594;
                } else {
                    interfaceC10711M31684 = c13074.m31684();
                }
                c17184 = new C17184(c22390, iMo102610, c20317, interfaceC10711M31684);
                if (!c22390.m36364().m46531() || c22390.m36364().m46530() || z || z2) {
                    c3570.m10880(c17184);
                } else {
                    c3570.m10886(c17184);
                }
                c22911M23274 = C9027.m23274(interfaceC11870M40998get.getAttributes());
                c13075 = (C13074) interfaceC11870M40998get.getAttributes().m33465("Exceptions");
                if (c13075 == null) {
                    interfaceC10711M31685 = C13922.f41594;
                } else {
                    interfaceC10711M31685 = c13075.m31684();
                }
                if (interfaceC10711M31685.size() != 0) {
                    c22911M23274 = C22911.m50994(c22911M23274, C1453.m5002(interfaceC10711M31685));
                }
                if (c22911M23274.size() != 0) {
                    c3570.m10882(c22390, c22911M23274, c1662);
                }
                C13985 attributes2 = interfaceC11870M40998get.getAttributes();
                c1950 = (C1950) attributes2.m33465("RuntimeVisibleParameterAnnotations");
                c13779 = (C13779) attributes2.m33465("RuntimeInvisibleParameterAnnotations");
                if (c1950 == null) {
                    if (c13779 == null) {
                        c13738M33037 = C13738.f41017;
                    } else {
                        c13738M33037 = c13779.m47819();
                    }
                } else if (c13779 == null) {
                    c13738M33037 = c1950.m47819();
                } else {
                    c13738M33037 = C13738.m33037(c1950.m47819(), c13779.m47819());
                }
                if (c13738M33037.size() != 0) {
                    c3570.m10881(c22390, c13738M33037, c1662);
                }
                c1662.m5627().m48540(c22390);
                i3++;
                size2 = i4;
                c8012M5622 = c8013;
                c6601M5626 = c6602;
                c21418M5627 = c21418M5627;
                str = str3;
                str2 = str4;
            } catch (RuntimeException e6) {
                e = e6;
                str3 = str;
                str4 = str2;
            }
        }
        C6601 c6603 = c6601M5626;
        C21418 c21419 = c21418M5627;
        C8012 c8014 = c8012M5622;
        C10396 c10396M50387 = c22453.m50387();
        int size3 = c10396M50387.size();
        int i5 = 0;
        while (i5 < size3) {
            AbstractC13717 abstractC13717M26225 = c10396M50387.m26225(i5);
            if (abstractC13717M26225 instanceof C22390) {
                c21418 = c21419;
                c21418.m48540((AbstractC16745) abstractC13717M26225);
            } else {
                c21418 = c21419;
                if (abstractC13717M26225 instanceof C4046) {
                    c21418.m48540(((C4046) abstractC13717M26225).m12144());
                } else {
                    if (abstractC13717M26225 instanceof C8985) {
                        c6601 = c6603;
                        c6601.m18104((C8985) abstractC13717M26225);
                    } else {
                        c6601 = c6603;
                        if (abstractC13717M26225 instanceof C9691) {
                            c6601.m18104(((C9691) abstractC13717M26225).m24635());
                        } else if (abstractC13717M26225 instanceof C21685) {
                            c8012 = c8014;
                            c8012.m21325((C21685) abstractC13717M26225);
                        } else {
                            c8012 = c8014;
                            if (abstractC13717M26225 instanceof C18863) {
                                C18863 c18863 = (C18863) abstractC13717M26225;
                                C18884 c18884M41003get = c22453.m50386().m41003get(c18863.m43571());
                                C21685 c21685M43598 = c18884M41003get.m43598();
                                C20274 c20274M43567 = c18863.m43567();
                                C4067 c4067M43597 = c18884M41003get.m43597();
                                if (c21685M43598 == null) {
                                    throw new NullPointerException("bootstrapMethodHandle == null");
                                }
                                if (c20274M43567 == null) {
                                    throw new NullPointerException("nat == null");
                                }
                                C1929 c1929 = new C1929(c4067M43597.size() + 3);
                                c1929.mo12223(0, (AbstractC13717) c21685M43598);
                                c1929.mo12223(1, (AbstractC13717) c20274M43567.getName());
                                c1929.mo12223(2, (AbstractC13717) new C4751(C23095.m51254(c20274M43567.m46532().getString())));
                                for (int i6 = 0; i6 < c4067M43597.size(); i6++) {
                                    c1929.mo12223(i6 + 3, c4067M43597.m40999get(i6));
                                }
                                c1929.mo20349();
                                C14628 c14628 = new C14628(c1929);
                                c18863.m43565(c22453.m50378());
                                c18863.m43566(c14628);
                                Iterator it = c18863.m43568().iterator();
                                while (it.hasNext()) {
                                    c21915.m49326((C23801) it.next());
                                }
                            }
                        }
                    }
                    c8012 = c8014;
                }
                i5++;
                c21419 = c21418;
                c6603 = c6601;
                c8014 = c8012;
                c21915 = c21915;
            }
            c8012 = c8014;
            c6601 = c6603;
            i5++;
            c21419 = c21418;
            c6603 = c6601;
            c8014 = c8012;
            c21915 = c21915;
        }
        return c3570;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6162 m8389(AbstractC6162 abstractC6162, C7573 c7573) {
        if (abstractC6162.getType().equals(c7573)) {
            return abstractC6162;
        }
        int iMo5255 = c7573.mo5255();
        if (iMo5255 == 1) {
            return C18157.m42265(((C2635) abstractC6162).mo2231());
        }
        if (iMo5255 == 2) {
            return C17451.m40823(((C2635) abstractC6162).mo2231());
        }
        if (iMo5255 == 3) {
            return C6868.m18552(((C2635) abstractC6162).mo2231());
        }
        if (iMo5255 == 8) {
            return C3340.m10202(((C2635) abstractC6162).mo2231());
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC6162 + " to " + c7573);
    }
}
