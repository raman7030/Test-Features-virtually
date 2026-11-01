package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBEY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4913 {
    /* JADX INFO: renamed from: ֫ */
    public static C5762 m10434(C25029 c25029, C23708 c23708, C17652 c17652, C11619 c11619, C3948 c3948) {
        try {
            return m10436(c25029, c23708, c17652, c11619, c3948);
        } catch (RuntimeException e) {
            throw C10101.m23569("...while processing " + c23708.m52731(), e);
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
    /* JADX INFO: renamed from: ۧ */
    public static C5762 m10436(C25029 c25029, C23708 c23708, C17652 c17652, C11619 c11619, C3948 c3948) {
        String str;
        String str2;
        C22724 c22724;
        C8642 c8642;
        C9983 c9983;
        String str3;
        String str4;
        C14794 c14794;
        InterfaceC12548 interfaceC12548M33772;
        C18700 c18700;
        C24143 c24143M25218;
        C14794 c14795;
        InterfaceC12548 interfaceC12548M33773;
        C4222 c4222;
        C15464 c15464;
        C15425 c15425M35151;
        C14735 c14735M25292;
        int iM35476;
        C6254 c6254 = c25029.f79914;
        c17652.getClass();
        c6254.m14194();
        C5762 c5762 = new C5762(c23708.m52719(), c23708.m52717() & (-33), c23708.m52726(), c23708.m52721(), c23708.m52722());
        C24143 c24143M25219 = C10948.m25219(c23708, c17652);
        if (c24143M25219.size() != 0) {
            c5762.m12863(c24143M25219, c3948);
        }
        C8642 c8642M7856 = c3948.m7856();
        C22724 c22724M7857 = c3948.m7857();
        C9983 c9983M7852 = c3948.m7852();
        C23197 c23197M7854 = c3948.m7854();
        C14260 c14260M52719 = c23708.m52719();
        C4242 c4242M52725 = c23708.m52725();
        int size = c4242M52725.size();
        int i = 0;
        while (true) {
            str = " ";
            str2 = "...while processing ";
            if (i >= size) {
                break;
            }
            InterfaceC12309 interfaceC12309M56517get = c4242M52725.m56517get(i);
            C4242 c4242 = c4242M52725;
            try {
                int i2 = size;
                C10908 c10908 = new C10908(c14260M52719, interfaceC12309M56517get.mo12301());
                int iMo12306 = interfaceC12309M56517get.mo12306();
                if ((iMo12306 & 8) != 0) {
                    AbstractC8225 abstractC8225Mo22406 = interfaceC12309M56517get.mo22406();
                    C18029 c18029 = new C18029(c10908, iMo12306);
                    if (abstractC8225Mo22406 != null) {
                        abstractC8225Mo22406 = m10435(abstractC8225Mo22406, c10908.getType());
                    }
                    c5762.m12859(c18029, abstractC8225Mo22406);
                } else {
                    c5762.m12858(new C18029(c10908, iMo12306));
                }
                C24143 c24143M252110 = C10948.m25218(interfaceC12309M56517get.getAttributes());
                if (c24143M252110.size() != 0) {
                    c5762.m12857(c10908, c24143M252110, c3948);
                }
                c3948.m7856().m20056(c10908);
                i++;
                c4242M52725 = c4242;
                size = i2;
                c14260M52719 = c14260M52719;
                c23197M7854 = c23197M7854;
            } catch (RuntimeException e) {
                throw C10101.m23569("...while processing " + interfaceC12309M56517get.getName().mo4819() + " " + interfaceC12309M56517get.mo12310().mo4819(), e);
            }
        }
        C23197 c23197 = c23197M7854;
        C14260 c14260M527110 = c23708.m52719();
        C19665 c19665M52723 = c23708.m52723();
        int size2 = c19665M52723.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = size2;
            InterfaceC13650 interfaceC13650M56518get = c19665M52723.m56518get(i3);
            C9983 c9984 = c9983M7852;
            try {
                C23648 c23648 = new C23648(c14260M527110, interfaceC13650M56518get.mo12301());
                C8642 c8643 = c8642M7856;
                int iMo12307 = interfaceC13650M56518get.mo12306();
                boolean z = (iMo12307 & 8) != 0;
                boolean z2 = (iMo12307 & 2) != 0;
                boolean z3 = (iMo12307 & 256) != 0;
                boolean z4 = (iMo12307 & 1024) != 0;
                boolean z5 = c23648.m38522().m48853() || c23648.m38522().m48852();
                Object objM13981 = null;
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
                                    c14735M25292 = C10968.m25292(new C5563(interfaceC13650M56518get, c23708, c17652.f52726), c19665M52723, c11619);
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    if (c17652.f52728) {
                                        throw e;
                                    }
                                    C9009 c9009 = new C9009(c23708.m52717());
                                    c9009.mo20837(196653, c23708.m52717(), c23708.m52719().m32771().m22286(), null, "java/lang/Object", null);
                                    AbstractC17054 abstractC17054Mo20834 = c9009.mo20834(interfaceC13650M56518get.mo12306(), interfaceC13650M56518get.getName().getString(), interfaceC13650M56518get.mo12310().getString(), (String) null, (String[]) null);
                                    abstractC17054Mo20834.mo29023(187, "java/lang/RuntimeException");
                                    abstractC17054Mo20834.mo30323(89);
                                    abstractC17054Mo20834.mo29016("Couldn't be decompiled.");
                                    abstractC17054Mo20834.mo14009(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                    abstractC17054Mo20834.mo30323(191);
                                    abstractC17054Mo20834.mo30338(2, 2);
                                    C23708 c23709 = new C23708(c23708.m52731(), false, c9009.m20845());
                                    c23709.m52720();
                                    c23709.m52730();
                                    c14735M25292 = C10968.m25292(new C5563(c23709.m52723().m56518get(0), c23709, c17652.f52726), c19665M52723, c11619);
                                    e = e;
                                    throw C10101.m23569(str4 + interfaceC13650M56518get.getName().mo4819() + str3 + interfaceC13650M56518get.mo12310().mo4819(), e);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                str4 = str2;
                                if (c17652.f52728) {
                                    throw e;
                                }
                                C9009 c90010 = new C9009(c23708.m52717());
                                c90010.mo20837(196653, c23708.m52717(), c23708.m52719().m32771().m22286(), null, "java/lang/Object", null);
                                AbstractC17054 abstractC17054Mo20835 = c90010.mo20834(interfaceC13650M56518get.mo12306(), interfaceC13650M56518get.getName().getString(), interfaceC13650M56518get.mo12310().getString(), (String) null, (String[]) null);
                                abstractC17054Mo20835.mo29023(187, "java/lang/RuntimeException");
                                abstractC17054Mo20835.mo30323(89);
                                abstractC17054Mo20835.mo29016("Couldn't be decompiled.");
                                abstractC17054Mo20835.mo14009(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                abstractC17054Mo20835.mo30323(191);
                                abstractC17054Mo20835.mo30338(2, 2);
                                C23708 c237010 = new C23708(c23708.m52731(), false, c90010.m20845());
                                c237010.m52720();
                                c237010.m52730();
                                c14735M25292 = C10968.m25292(new C5563(c237010.m52723().m56518get(0), c237010, c17652.f52726), c19665M52723, c11619);
                                iM35476 = c23648.m41621(z).m53653().m35476();
                                StringBuilder sb = new StringBuilder();
                                sb.append(c14260M527110.m32771().m22277());
                                sb.append(".");
                                sb.append(interfaceC13650M56518get.getName().getString());
                                if (c17652.f52727) {
                                    c25029.f79914.getClass();
                                    c14735M25292 = C7854.m18147(c14735M25292, iM35476, c17652.f52726);
                                }
                                objM13981 = C6174.m13981(c14735M25292, c17652.f52726 ? C20772.m46916(c14735M25292) : null, iM35476, c11619);
                                C21677 c21677 = objM13981;
                                if ((iMo12307 & 32) != 0) {
                                    iMo12307 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                    if (!z3) {
                                        iMo12307 &= -33;
                                    }
                                }
                                if (z5) {
                                    iMo12307 |= 65536;
                                }
                                c14794 = (C14794) interfaceC13650M56518get.getAttributes().m35585("Exceptions");
                                if (c14794 == null) {
                                    interfaceC12548M33772 = C15600.f44675;
                                } else {
                                    interfaceC12548M33772 = c14794.m33772();
                                }
                                c18700 = new C18700(c23648, iMo12307, c21677, interfaceC12548M33772);
                                if (!c23648.m38522().m48853()) {
                                    c5762.m12860(c18700);
                                } else {
                                    c5762.m12860(c18700);
                                }
                                c24143M25218 = C10948.m25218(interfaceC13650M56518get.getAttributes());
                                c14795 = (C14794) interfaceC13650M56518get.getAttributes().m35585("Exceptions");
                                if (c14795 == null) {
                                    interfaceC12548M33773 = C15600.f44675;
                                } else {
                                    interfaceC12548M33773 = c14795.m33772();
                                }
                                if (interfaceC12548M33773.size() != 0) {
                                    c24143M25218 = C24143.m53385(c24143M25218, C3750.m7245(interfaceC12548M33773));
                                }
                                if (c24143M25218.size() != 0) {
                                    c5762.m12862(c23648, c24143M25218, c3948);
                                }
                                C15660 attributes = interfaceC13650M56518get.getAttributes();
                                c4222 = (C4222) attributes.m35585("RuntimeVisibleParameterAnnotations");
                                c15464 = (C15464) attributes.m35585("RuntimeInvisibleParameterAnnotations");
                                if (c4222 == null) {
                                    if (c15464 == null) {
                                        c15425M35151 = C15425.f44095;
                                    } else {
                                        c15425M35151 = c15464.m50149();
                                    }
                                } else if (c15464 == null) {
                                    c15425M35151 = c4222.m50149();
                                } else {
                                    c15425M35151 = C15425.m35151(c4222.m50149(), c15464.m50149());
                                }
                                if (c15425M35151.size() != 0) {
                                    c5762.m12861(c23648, c15425M35151, c3948);
                                }
                                c3948.m7857().m50876(c23648);
                                i3++;
                                size2 = i4;
                                c9983M7852 = c9984;
                                c8642M7856 = c8643;
                                c22724M7857 = c22724M7857;
                                str = str3;
                                str2 = str4;
                                e = e;
                                throw C10101.m23569(str4 + interfaceC13650M56518get.getName().mo4819() + str3 + interfaceC13650M56518get.mo12310().mo4819(), e);
                            }
                            iM35476 = c23648.m41621(z).m53653().m35476();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c14260M527110.m32771().m22277());
                            sb2.append(".");
                            sb2.append(interfaceC13650M56518get.getName().getString());
                            if (c17652.f52727) {
                                c25029.f79914.getClass();
                                c14735M25292 = C7854.m18147(c14735M25292, iM35476, c17652.f52726);
                            }
                            objM13981 = C6174.m13981(c14735M25292, c17652.f52726 ? C20772.m46916(c14735M25292) : null, iM35476, c11619);
                        } catch (RuntimeException e4) {
                            e = e4;
                            throw C10101.m23569(str4 + interfaceC13650M56518get.getName().mo4819() + str3 + interfaceC13650M56518get.mo12310().mo4819(), e);
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                        str3 = str;
                    }
                }
                C21677 c21678 = objM13981;
                if ((iMo12307 & 32) != 0) {
                    iMo12307 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    if (!z3) {
                        iMo12307 &= -33;
                    }
                }
                if (z5) {
                    iMo12307 |= 65536;
                }
                c14794 = (C14794) interfaceC13650M56518get.getAttributes().m35585("Exceptions");
                if (c14794 == null) {
                    interfaceC12548M33772 = C15600.f44675;
                } else {
                    interfaceC12548M33772 = c14794.m33772();
                }
                c18700 = new C18700(c23648, iMo12307, c21678, interfaceC12548M33772);
                if (!c23648.m38522().m48853() || c23648.m38522().m48852() || z || z2) {
                    c5762.m12860(c18700);
                } else {
                    c5762.m12866(c18700);
                }
                c24143M25218 = C10948.m25218(interfaceC13650M56518get.getAttributes());
                c14795 = (C14794) interfaceC13650M56518get.getAttributes().m35585("Exceptions");
                if (c14795 == null) {
                    interfaceC12548M33773 = C15600.f44675;
                } else {
                    interfaceC12548M33773 = c14795.m33772();
                }
                if (interfaceC12548M33773.size() != 0) {
                    c24143M25218 = C24143.m53385(c24143M25218, C3750.m7245(interfaceC12548M33773));
                }
                if (c24143M25218.size() != 0) {
                    c5762.m12862(c23648, c24143M25218, c3948);
                }
                C15660 attributes2 = interfaceC13650M56518get.getAttributes();
                c4222 = (C4222) attributes2.m35585("RuntimeVisibleParameterAnnotations");
                c15464 = (C15464) attributes2.m35585("RuntimeInvisibleParameterAnnotations");
                if (c4222 == null) {
                    if (c15464 == null) {
                        c15425M35151 = C15425.f44095;
                    } else {
                        c15425M35151 = c15464.m50149();
                    }
                } else if (c15464 == null) {
                    c15425M35151 = c4222.m50149();
                } else {
                    c15425M35151 = C15425.m35151(c4222.m50149(), c15464.m50149());
                }
                if (c15425M35151.size() != 0) {
                    c5762.m12861(c23648, c15425M35151, c3948);
                }
                c3948.m7857().m50876(c23648);
                i3++;
                size2 = i4;
                c9983M7852 = c9984;
                c8642M7856 = c8643;
                c22724M7857 = c22724M7857;
                str = str3;
                str2 = str4;
            } catch (RuntimeException e6) {
                e = e6;
                str3 = str;
                str4 = str2;
            }
        }
        C8642 c8644 = c8642M7856;
        C22724 c22725 = c22724M7857;
        C9983 c9985 = c9983M7852;
        C12249 c12249M52728 = c23708.m52728();
        int size3 = c12249M52728.size();
        int i5 = 0;
        while (i5 < size3) {
            AbstractC15405 abstractC15405M28254 = c12249M52728.m28254(i5);
            if (abstractC15405M28254 instanceof C23648) {
                c22724 = c22725;
                c22724.m50876((AbstractC18283) abstractC15405M28254);
            } else {
                c22724 = c22725;
                if (abstractC15405M28254 instanceof C6214) {
                    c22724.m50876(((C6214) abstractC15405M28254).m14065());
                } else {
                    if (abstractC15405M28254 instanceof C10908) {
                        c8642 = c8644;
                        c8642.m20056((C10908) abstractC15405M28254);
                    } else {
                        c8642 = c8644;
                        if (abstractC15405M28254 instanceof C11579) {
                            c8642.m20056(((C11579) abstractC15405M28254).m26649());
                        } else if (abstractC15405M28254 instanceof C22978) {
                            c9983 = c9985;
                            c9983.m23291((C22978) abstractC15405M28254);
                        } else {
                            c9983 = c9985;
                            if (abstractC15405M28254 instanceof C20296) {
                                C20296 c20296 = (C20296) abstractC15405M28254;
                                C20316 c20316M56523get = c23708.m52727().m56523get(c20296.m45837());
                                C22978 c22978M45864 = c20316M56523get.m45864();
                                C21637 c21637M45833 = c20296.m45833();
                                C6234 c6234M45863 = c20316M56523get.m45863();
                                if (c22978M45864 == null) {
                                    throw new NullPointerException("bootstrapMethodHandle == null");
                                }
                                if (c21637M45833 == null) {
                                    throw new NullPointerException("nat == null");
                                }
                                C4202 c4202 = new C4202(c6234M45863.size() + 3);
                                c4202.mo14144(0, (AbstractC15405) c22978M45864);
                                c4202.mo14144(1, (AbstractC15405) c21637M45833.getName());
                                c4202.mo14144(2, (AbstractC15405) new C6884(C24318.m53648(c21637M45833.m48854().getString())));
                                for (int i6 = 0; i6 < c6234M45863.size(); i6++) {
                                    c4202.mo14144(i6 + 3, c6234M45863.m56519get(i6));
                                }
                                c4202.mo22326();
                                C16271 c16271 = new C16271(c4202);
                                c20296.m45831(c23708.m52719());
                                c20296.m45832(c16271);
                                Iterator it = c20296.m45834().iterator();
                                while (it.hasNext()) {
                                    c23197.m51679((C24989) it.next());
                                }
                            }
                        }
                    }
                    c9983 = c9985;
                }
                i5++;
                c22725 = c22724;
                c8644 = c8642;
                c9985 = c9983;
                c23197 = c23197;
            }
            c9983 = c9985;
            c8642 = c8644;
            i5++;
            c22725 = c22724;
            c8644 = c8642;
            c9985 = c9983;
            c23197 = c23197;
        }
        return c5762;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8225 m10435(AbstractC8225 abstractC8225, C9566 c9566) {
        if (abstractC8225.getType().equals(c9566)) {
            return abstractC8225;
        }
        int iMo7484 = c9566.mo7484();
        if (iMo7484 == 1) {
            return C19625.m44526(((C4873) abstractC8225).mo4598());
        }
        if (iMo7484 == 2) {
            return C18954.m43081(((C4873) abstractC8225).mo4598());
        }
        if (iMo7484 == 3) {
            return C8896.m20501(((C4873) abstractC8225).mo4598());
        }
        if (iMo7484 == 8) {
            return C5543.m12238(((C4873) abstractC8225).mo4598());
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC8225 + " to " + c9566);
    }
}
