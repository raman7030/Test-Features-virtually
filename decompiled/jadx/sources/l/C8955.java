package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۡܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54J3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15452 f27203;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5427 f27204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5637 f27205;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23082(AbstractC19686 abstractC19686, C18127 c18127) {
        m23080(abstractC19686.f63597, c18127);
        int[] iArr = C9661.f29259;
        EnumC1340 enumC1340 = abstractC19686.f25745;
        int i = iArr[enumC1340.ordinal()];
        if (i == 2) {
            C14102 c14102 = (C14102) abstractC19686;
            c18127.mo26972(m23077(c14102.f42579), 178, c14102.f42580, c14102.f42578);
            return;
        }
        if (i == 3) {
            C14102 c14103 = (C14102) abstractC19686;
            c18127.mo26972(m23077(c14103.f42579), 180, c14103.f42580, c14103.f42578);
            return;
        }
        switch (i) {
            case 21:
                String str = ((C16156) abstractC19686).f49779;
                char cCharAt = str.charAt(0);
                if (cCharAt != 'F') {
                    if (cCharAt != 'L') {
                        if (cCharAt != 'S') {
                            if (cCharAt != 'I') {
                                if (cCharAt != 'J') {
                                    if (cCharAt != 'Z') {
                                        if (cCharAt != '[') {
                                            switch (cCharAt) {
                                                case 'B':
                                                    c18127.mo28290(188, 8);
                                                    break;
                                                case 'C':
                                                    c18127.mo28290(188, 5);
                                                    break;
                                                case 'D':
                                                    c18127.mo28290(188, 7);
                                                    break;
                                            }
                                        }
                                    } else {
                                        c18127.mo28290(188, 4);
                                        break;
                                    }
                                } else {
                                    c18127.mo28290(188, 11);
                                    break;
                                }
                            } else {
                                c18127.mo28290(188, 10);
                                break;
                            }
                        } else {
                            c18127.mo28290(188, 9);
                            break;
                        }
                    }
                    c18127.mo26978(189, C11926.m29091(str).m29103());
                } else {
                    c18127.mo28290(188, 6);
                }
                break;
            case 22:
            case 23:
                c18127.mo26978(enumC1340 == EnumC1340.CHECK_CAST ? 192 : 193, m23077(((C16156) abstractC19686).f49779));
                break;
            case 24:
                C6342 c6342 = (C6342) abstractC19686;
                String str2 = abstractC19686.f63597.f25746;
                String str3 = c6342.f19648;
                if (!str2.equals(str3)) {
                    char cCharAt2 = str2.charAt(0);
                    if (cCharAt2 != 'F') {
                        if (cCharAt2 != 'S' && cCharAt2 != 'Z' && cCharAt2 != 'I') {
                            if (cCharAt2 == 'J') {
                                char cCharAt3 = str3.charAt(0);
                                if (cCharAt3 == 'D') {
                                    c18127.mo28279(138);
                                    break;
                                } else if (cCharAt3 == 'F') {
                                    c18127.mo28279(137);
                                    break;
                                } else if (cCharAt3 == 'I') {
                                    c18127.mo28279(136);
                                    break;
                                }
                            } else {
                                switch (cCharAt2) {
                                    case 'D':
                                        char cCharAt4 = str3.charAt(0);
                                        if (cCharAt4 == 'F') {
                                            c18127.mo28279(144);
                                            break;
                                        } else if (cCharAt4 == 'I') {
                                            c18127.mo28279(142);
                                            break;
                                        } else if (cCharAt4 == 'J') {
                                            c18127.mo28279(143);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        char cCharAt5 = str3.charAt(0);
                        if (cCharAt5 != 'F') {
                            if (cCharAt5 != 'J') {
                                if (cCharAt5 != 'S') {
                                    switch (cCharAt5) {
                                        case 'B':
                                            c18127.mo28279(145);
                                            break;
                                        case 'C':
                                            c18127.mo28279(146);
                                            break;
                                        case 'D':
                                            c18127.mo28279(135);
                                            break;
                                    }
                                } else {
                                    c18127.mo28279(147);
                                    break;
                                }
                            } else {
                                c18127.mo28279(133);
                                break;
                            }
                        } else {
                            c18127.mo28279(134);
                            break;
                        }
                    } else {
                        char cCharAt6 = str3.charAt(0);
                        if (cCharAt6 == 'D') {
                            c18127.mo28279(141);
                            break;
                        } else if (cCharAt6 == 'I') {
                            c18127.mo28279(139);
                            break;
                        } else if (cCharAt6 == 'J') {
                            c18127.mo28279(140);
                            break;
                        }
                    }
                }
                break;
            case 25:
                c18127.mo28279(190);
                break;
            case 26:
                c18127.mo28279(m23076(116, abstractC19686.f25746));
                break;
            case 27:
                if (abstractC19686.f63597.f25746.equals("I")) {
                    c18127.mo26971((Object) (-1));
                    c18127.mo28279(m23076(130, abstractC19686.f25746));
                } else if (abstractC19686.f63597.f25746.equals("J")) {
                    c18127.mo26971((Object) (-1L));
                    c18127.mo28279(m23076(130, abstractC19686.f25746));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23087(C5427 c5427) {
        this.f27204 = c5427;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23088(C5637 c5637) {
        this.f27205 = c5637;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23089(AbstractC15452 abstractC15452) {
        this.f27203 = abstractC15452;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0316  */
    /* JADX WARN: Code duplicated, block: B:125:0x0329 A[LOOP:5: B:124:0x0327->B:125:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c9 A[LOOP:7: B:152:0x03c7->B:153:0x03c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0549  */
    /* JADX WARN: Code duplicated, block: B:212:0x054e  */
    /* JADX WARN: Code duplicated, block: B:213:0x055a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0562  */
    /* JADX WARN: Code duplicated, block: B:217:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0571  */
    /* JADX WARN: Code duplicated, block: B:303:0x0585 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23086() {
        char cCharAt;
        int i;
        int iIntValue;
        String strSubstring;
        int iM23076;
        int i2;
        boolean z;
        byte[] bArrM23085;
        int i3;
        int iM23077;
        int i4;
        byte[] bArrArray;
        for (AbstractC1591 abstractC1591 : this.f27205.f17411) {
            if (abstractC1591.f5638 == EnumC7690.LABEL) {
                ((C13334) abstractC1591).f39895 = new C1342();
            }
        }
        C5637 c5637 = this.f27205;
        C18127 c18127 = new C18127(this.f27203);
        int i5 = 0;
        Iterator it = c5637.f17415.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C18274) it.next()).f56817);
        }
        new HashMap();
        for (AbstractC1591 abstractC1592 : c5637.f17411) {
            switch (C9661.f29260[abstractC1592.f5638.ordinal()]) {
                case 1:
                    C13334 c13334 = (C13334) abstractC1592;
                    C1342 c1342 = c13334.f39895;
                    c18127.mo28284(c1342);
                    int i6 = c13334.f39896;
                    if (i6 >= 0) {
                        c18127.mo28292(i6, c1342);
                    }
                    break;
                case 2:
                    AbstractC14039 abstractC14039 = (AbstractC14039) abstractC1592;
                    AbstractC8396 abstractC8396 = abstractC14039.f42444;
                    AbstractC8396 abstractC8397 = abstractC14039.f42445;
                    int i7 = C9661.f29259[abstractC8396.f25745.ordinal()];
                    if (i7 == 1) {
                        int i8 = ((C18274) abstractC8396).f56817;
                        if (abstractC8397.f25745 != EnumC1340.LOCAL || i8 != ((C18274) abstractC8397).f56817) {
                            if (abstractC8396.f25746.charAt(0) != 'I') {
                                m23080(abstractC8397, c18127);
                                if (i8 >= 0) {
                                    c18127.mo28295(m23076(54, abstractC8396.f25746), i8);
                                } else if (abstractC8396.f25746.equals("V")) {
                                    cCharAt = abstractC8396.f25746.charAt(0);
                                    if (cCharAt == 'D' && cCharAt != 'J') {
                                        c18127.mo28279(87);
                                    } else {
                                        c18127.mo28279(88);
                                    }
                                }
                            } else {
                                EnumC1340 enumC1340 = abstractC8397.f25745;
                                if (enumC1340 == EnumC1340.ADD) {
                                    if (m23084(abstractC8397.mo2581(), i8) && abstractC8397.mo2583().f25745 == EnumC1340.CONSTANT) {
                                        int iIntValue2 = ((Integer) ((C11987) abstractC8397.mo2583()).f35889).intValue();
                                        if (iIntValue2 < -32768 || iIntValue2 > 32767) {
                                            m23080(abstractC8397, c18127);
                                            if (i8 >= 0) {
                                                c18127.mo28295(m23076(54, abstractC8396.f25746), i8);
                                            } else if (abstractC8396.f25746.equals("V")) {
                                                cCharAt = abstractC8396.f25746.charAt(0);
                                                if (cCharAt == 'D') {
                                                    c18127.mo28279(88);
                                                } else {
                                                    c18127.mo28279(88);
                                                }
                                            }
                                        } else {
                                            c18127.mo28280(i8, iIntValue2);
                                        }
                                    } else if (!m23084(abstractC8397.mo2583(), i8) || abstractC8397.mo2581().f25745 != EnumC1340.CONSTANT || (iIntValue = ((Integer) ((C11987) abstractC8397.mo2581()).f35889).intValue()) < -32768 || iIntValue > 32767) {
                                        m23080(abstractC8397, c18127);
                                        if (i8 >= 0) {
                                            c18127.mo28295(m23076(54, abstractC8396.f25746), i8);
                                        } else if (abstractC8396.f25746.equals("V")) {
                                            cCharAt = abstractC8396.f25746.charAt(0);
                                            if (cCharAt == 'D') {
                                                c18127.mo28279(88);
                                            } else {
                                                c18127.mo28279(88);
                                            }
                                        }
                                    } else {
                                        c18127.mo28280(i8, iIntValue);
                                    }
                                } else if (enumC1340 == EnumC1340.SUB && m23084(abstractC8397.mo2581(), i8) && abstractC8397.mo2583().f25745 == EnumC1340.CONSTANT && (i = -((Integer) ((C11987) abstractC8397.mo2583()).f35889).intValue()) >= -32768 && i <= 32767) {
                                    c18127.mo28280(i8, i);
                                } else {
                                    m23080(abstractC8397, c18127);
                                    if (i8 >= 0) {
                                        c18127.mo28295(m23076(54, abstractC8396.f25746), i8);
                                    } else if (abstractC8396.f25746.equals("V")) {
                                        cCharAt = abstractC8396.f25746.charAt(0);
                                        if (cCharAt == 'D') {
                                            c18127.mo28279(88);
                                        } else {
                                            c18127.mo28279(88);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i7 == 2) {
                        C9808 c9808 = (C9808) abstractC8396;
                        String str = c9808.f29646;
                        m23080(abstractC8397, c18127);
                        m23079(abstractC8397.f25746, str, c18127);
                        c18127.mo26972(m23077(c9808.f29647), 179, c9808.f29645, str);
                    } else if (i7 == 3) {
                        C14102 c14102 = (C14102) abstractC8396;
                        String str2 = c14102.f42578;
                        m23080(c14102.f63597, c18127);
                        m23080(abstractC8397, c18127);
                        m23079(abstractC8397.f25746, str2, c18127);
                        c18127.mo26972(m23077(c14102.f42579), 181, c14102.f42580, str2);
                    } else if (i7 == 4) {
                        C12692 c12692 = (C12692) abstractC8396;
                        m23080(c12692.f2428, c18127);
                        m23080(c12692.f2429, c18127);
                        m23080(abstractC8397, c18127);
                        String str3 = c12692.f2428.f25746;
                        String str4 = c12692.f25746;
                        if (str3.charAt(0) == '[') {
                            String strSubstring2 = str3.substring(1);
                            m23079(abstractC8397.f25746, strSubstring2, c18127);
                            c18127.mo28279(m23076(79, strSubstring2));
                        } else {
                            c18127.mo28279(m23076(79, str4));
                        }
                    }
                    break;
                case 3:
                    AbstractC14039 abstractC140310 = (AbstractC14039) abstractC1592;
                    if (abstractC140310.f42445.f25745 == EnumC1340.EXCEPTION_REF) {
                        int i9 = ((C18274) abstractC140310.f42444).f56817;
                        if (i9 >= 0) {
                            c18127.mo28295(58, i9);
                        } else {
                            c18127.mo28279(87);
                        }
                    }
                    break;
                case 4:
                    AbstractC14039 abstractC140311 = (AbstractC14039) abstractC1592;
                    AbstractC8396 abstractC8398 = abstractC140311.f42445;
                    if (abstractC8398.f25745 == EnumC1340.CONSTANT) {
                        Object obj = ((C11987) abstractC8398).f35889;
                        int length = Array.getLength(obj);
                        String str5 = abstractC140311.f42444.f25746;
                        strSubstring = str5.charAt(i5) == '[' ? str5.substring(1) : "I";
                        try {
                            if (this.f27204 == null || !"BSIJ".contains(strSubstring)) {
                                i3 = 79;
                                iM23077 = m23076(i3, strSubstring);
                                m23080(abstractC140311.f42444, c18127);
                                while (i4 < length) {
                                    c18127.mo28279(89);
                                    c18127.mo26971(Integer.valueOf(i4));
                                    c18127.mo26971(Array.get(obj, i4));
                                    c18127.mo28279(iM23077);
                                }
                                c18127.mo28279(87);
                            } else {
                                if (obj instanceof byte[]) {
                                    bArrArray = (byte[]) obj;
                                } else if (obj instanceof short[]) {
                                    short[] sArr = (short[]) obj;
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sArr.length * 2);
                                    byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate.asShortBuffer().put(sArr);
                                    bArrArray = byteBufferAllocate.array();
                                } else if (obj instanceof int[]) {
                                    int[] iArr = (int[]) obj;
                                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iArr.length * 4);
                                    byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate2.asIntBuffer().put(iArr);
                                    bArrArray = byteBufferAllocate2.array();
                                } else if (obj instanceof long[]) {
                                    long[] jArr = (long[]) obj;
                                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(jArr.length * 8);
                                    byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate3.asLongBuffer().put(jArr);
                                    bArrArray = byteBufferAllocate3.array();
                                } else {
                                    bArrArray = null;
                                }
                                if (bArrArray != null && bArrArray.length > 500) {
                                    m23080(abstractC140311.f42444, c18127);
                                    c18127.mo26971((Object) 0);
                                    m23081(c18127, bArrArray, strSubstring);
                                    c18127.mo26971((Object) 0);
                                    c18127.mo26971(Integer.valueOf(length));
                                    try {
                                        c18127.mo12089(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused) {
                                        i3 = 79;
                                        iM23077 = m23076(i3, strSubstring);
                                        m23080(abstractC140311.f42444, c18127);
                                        for (i4 = 0; i4 < length; i4++) {
                                            c18127.mo28279(89);
                                            c18127.mo26971(Integer.valueOf(i4));
                                            c18127.mo26971(Array.get(obj, i4));
                                            c18127.mo28279(iM23077);
                                        }
                                        c18127.mo28279(87);
                                    }
                                } else {
                                    i3 = 79;
                                }
                                iM23077 = m23076(i3, strSubstring);
                                m23080(abstractC140311.f42444, c18127);
                                while (i4 < length) {
                                    c18127.mo28279(89);
                                    c18127.mo26971(Integer.valueOf(i4));
                                    c18127.mo26971(Array.get(obj, i4));
                                    c18127.mo28279(iM23077);
                                }
                                c18127.mo28279(87);
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    } else {
                        C7753 c7753 = (C7753) abstractC8398;
                        int length2 = c7753.f17269.length;
                        String str6 = abstractC140311.f42444.f25746;
                        strSubstring = str6.charAt(0) == '[' ? str6.substring(1) : "I";
                        try {
                            if (this.f27204 == null || !"BSIJ".contains(strSubstring)) {
                                iM23076 = m23076(79, strSubstring);
                                m23080(abstractC140311.f42444, c18127);
                                while (i2 < length2) {
                                    c18127.mo28279(89);
                                    c18127.mo26971(Integer.valueOf(i2));
                                    m23080(c7753.f17269[i2], c18127);
                                    c18127.mo28279(iM23076);
                                }
                                c18127.mo28279(87);
                            } else {
                                AbstractC8396[] abstractC8396Arr = c7753.f17269;
                                int length3 = abstractC8396Arr.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length3) {
                                        z = true;
                                    } else if (abstractC8396Arr[i10].f25745 != EnumC1340.CONSTANT) {
                                        z = false;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (z && (bArrM23085 = m23085(c7753.f17269, strSubstring)) != null && bArrM23085.length > 500) {
                                    m23080(abstractC140311.f42444, c18127);
                                    c18127.mo26971((Object) 0);
                                    m23081(c18127, bArrM23085, strSubstring);
                                    c18127.mo26971((Object) 0);
                                    c18127.mo26971(Integer.valueOf(length2));
                                    try {
                                        c18127.mo12089(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused3) {
                                        iM23076 = m23076(79, strSubstring);
                                        m23080(abstractC140311.f42444, c18127);
                                        for (i2 = 0; i2 < length2; i2++) {
                                            c18127.mo28279(89);
                                            c18127.mo26971(Integer.valueOf(i2));
                                            m23080(c7753.f17269[i2], c18127);
                                            c18127.mo28279(iM23076);
                                        }
                                        c18127.mo28279(87);
                                    }
                                    break;
                                }
                                iM23076 = m23076(79, strSubstring);
                                m23080(abstractC140311.f42444, c18127);
                                while (i2 < length2) {
                                    c18127.mo28279(89);
                                    c18127.mo26971(Integer.valueOf(i2));
                                    m23080(c7753.f17269[i2], c18127);
                                    c18127.mo28279(iM23076);
                                }
                                c18127.mo28279(87);
                            }
                            break;
                        } catch (Exception unused4) {
                        }
                    }
                    break;
                case 5:
                    c18127.mo28282(167, ((C20391) abstractC1592).f65790.f39895);
                    break;
                case 6:
                    C4868 c4868 = (C4868) abstractC1592;
                    C1342 c1343 = c4868.f15390.f39895;
                    AbstractC8396 abstractC8399 = c4868.f74596;
                    AbstractC8396 abstractC8396Mo2581 = abstractC8399.mo2581();
                    EnumC1340 enumC1341 = abstractC8399.f25745;
                    AbstractC8396 abstractC8396Mo2583 = abstractC8399.mo2583();
                    char cCharAt2 = abstractC8396Mo2581.f25746.charAt(i5);
                    if (cCharAt2 != 'L' && cCharAt2 != '[') {
                        if (!m23083(abstractC8396Mo2581) && !m23083(abstractC8396Mo2583)) {
                            m23080(abstractC8396Mo2581, c18127);
                            m23080(abstractC8396Mo2583, c18127);
                            switch (C9661.f29259[enumC1341.ordinal()]) {
                                case 6:
                                    c18127.mo28282(DHParameters.DEFAULT_MINIMUM_LENGTH, c1343);
                                    break;
                                case 7:
                                    c18127.mo28282(159, c1343);
                                    break;
                                case 8:
                                    c18127.mo28282(162, c1343);
                                    break;
                                case 9:
                                    c18127.mo28282(163, c1343);
                                    break;
                                case 10:
                                    c18127.mo28282(164, c1343);
                                    break;
                                case 11:
                                    c18127.mo28282(161, c1343);
                                    break;
                            }
                        } else {
                            if (m23083(abstractC8396Mo2583)) {
                                m23080(abstractC8396Mo2581, c18127);
                            } else {
                                m23080(abstractC8396Mo2583, c18127);
                            }
                            switch (C9661.f29259[enumC1341.ordinal()]) {
                                case 6:
                                    c18127.mo28282(EnumC17734.f54268, c1343);
                                    break;
                                case 7:
                                    c18127.mo28282(153, c1343);
                                    break;
                                case 8:
                                    c18127.mo28282(156, c1343);
                                    break;
                                case 9:
                                    c18127.mo28282(157, c1343);
                                    break;
                                case 10:
                                    c18127.mo28282(158, c1343);
                                    break;
                                case 11:
                                    c18127.mo28282(155, c1343);
                                    break;
                            }
                        }
                    } else {
                        if (m23083(abstractC8396Mo2581) || m23083(abstractC8396Mo2583)) {
                            if (m23083(abstractC8396Mo2583)) {
                                m23080(abstractC8396Mo2581, c18127);
                            } else {
                                m23080(abstractC8396Mo2583, c18127);
                            }
                            c18127.mo28282(enumC1341 == EnumC1340.EQ ? 198 : 199, c1343);
                        } else {
                            m23080(abstractC8396Mo2581, c18127);
                            m23080(abstractC8396Mo2583, c18127);
                            c18127.mo28282(enumC1341 == EnumC1340.EQ ? 165 : 166, c1343);
                        }
                        break;
                    }
                    break;
                case 7:
                    m23080(((C23463) abstractC1592).f74596, c18127);
                    c18127.mo28279(194);
                    break;
                case 8:
                    m23080(((C23463) abstractC1592).f74596, c18127);
                    c18127.mo28279(195);
                    break;
                case 9:
                    break;
                case 10:
                    AbstractC8396 abstractC83910 = ((C23463) abstractC1592).f74596;
                    m23080(abstractC83910, c18127);
                    m23079(abstractC83910.f25746, c5637.f17419, c18127);
                    c18127.mo28279(m23076(172, abstractC83910.f25746));
                    break;
                case 11:
                    c18127.mo28279(177);
                    break;
                case 12:
                    C12629 c12629 = (C12629) abstractC1592;
                    m23080(c12629.f74596, c18127);
                    int length4 = c12629.f72830.length;
                    C1342[] c1342Arr = new C1342[length4];
                    for (int i11 = 0; i11 < length4; i11++) {
                        c1342Arr[i11] = c12629.f72830[i11].f39895;
                    }
                    c18127.mo28285(c12629.f72831.f39895, c12629.f38054, c1342Arr);
                    break;
                case 13:
                    C17113 c17113 = (C17113) abstractC1592;
                    m23080(c17113.f74596, c18127);
                    int length5 = c17113.f72830.length;
                    C1342[] c1342Arr2 = new C1342[length5];
                    for (int i12 = 0; i12 < length5; i12++) {
                        c1342Arr2[i12] = c17113.f72830[i12].f39895;
                    }
                    int i13 = c17113.f52445;
                    c18127.mo28281(i13, (length5 + i13) - 1, c17113.f72831.f39895, c1342Arr2);
                    break;
                case 14:
                    m23080(((C23463) abstractC1592).f74596, c18127);
                    c18127.mo28279(191);
                    break;
                case 15:
                    AbstractC8396 abstractC8396Mo5442 = abstractC1592.mo5442();
                    m23080(abstractC8396Mo5442, c18127);
                    String str7 = abstractC8396Mo5442.f25746;
                    if (abstractC8396Mo5442.f25745 == EnumC1340.INVOKE_NEW) {
                        c18127.mo28279(87);
                    } else if (!"V".equals(str7)) {
                        char cCharAt3 = str7.charAt(i5);
                        if (cCharAt3 == 'D' || cCharAt3 == 'J') {
                            c18127.mo28279(88);
                        } else {
                            c18127.mo28279(87);
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("not support st: " + abstractC1592.f5638);
            }
            i5 = 0;
        }
        C5637 c5638 = this.f27205;
        AbstractC15452 abstractC15452 = this.f27203;
        for (C4931 c4931 : c5638.f17418) {
            AbstractC1591 abstractC1591M5439 = c4931.f15561;
            while (true) {
                abstractC1591M5439 = abstractC1591M5439.m5439();
                if (abstractC1591M5439 == null || abstractC1591M5439 == c4931.f15559) {
                    break;
                }
                if (abstractC1591M5439.f5638 != EnumC7690.LABEL) {
                    int i14 = 0;
                    while (true) {
                        C13334[] c13334Arr = c4931.f15560;
                        if (i14 < c13334Arr.length) {
                            String str8 = c4931.f15562[i14];
                            abstractC15452.mo26975(c4931.f15561.f39895, c4931.f15559.f39895, c13334Arr[i14].f39895, str8 == null ? null : C11926.m29091(str8).m29103());
                            i14++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23077(String str) {
        return C11926.m29091(str).m29103();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23081(C18127 c18127, byte[] bArr, String str) {
        String strM23078 = m23078(bArr);
        if (strM23078.length() > 65535) {
            c18127.mo26978(187, "java/lang/StringBuilder");
            c18127.mo28279(89);
            c18127.mo12089(183, "java/lang/StringBuilder", "<init>", "()V", false);
            for (int i = 0; i < strM23078.length(); i += 65500) {
                c18127.mo26971(strM23078.substring(i, Math.min(65500, strM23078.length() - i) + i));
                c18127.mo12089(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            }
            c18127.mo12089(182, "java/lang/StringBuilder", AnnotationHandler.STRING, "()Ljava/lang/String;", false);
        } else {
            c18127.mo26971(strM23078);
        }
        String strM23077 = m23077(this.f27204.f16920);
        C5427 c5427 = this.f27204;
        if (c5427.f16921 == null) {
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            c5427.f16921 = "$d2j$hex$" + m23078(bArr2);
        }
        c18127.mo12089(184, strM23077, C23202.m51498(new StringBuilder(), c5427.f16921, "$decode_", str), C20094.m46315("(Ljava/lang/String;)[", str), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23084(AbstractC8396 abstractC8396, int i) {
        return abstractC8396.f25745 == EnumC1340.LOCAL && ((C18274) abstractC8396).f56817 == i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23079(String str, String str2, C18127 c18127) {
        char cCharAt = str2.charAt(0);
        if (cCharAt == 'B') {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 == 'C' || cCharAt2 == 'I' || cCharAt2 == 'S') {
                c18127.mo28279(145);
                return;
            }
            return;
        }
        if (cCharAt == 'C') {
            if (str.charAt(0) != 'I') {
                return;
            }
            c18127.mo28279(146);
        } else {
            if (cCharAt != 'S') {
                return;
            }
            char cCharAt3 = str.charAt(0);
            if (cCharAt3 == 'C' || cCharAt3 == 'I') {
                c18127.mo28279(147);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23083(AbstractC8396 abstractC8396) {
        if (abstractC8396.f25745 != EnumC1340.CONSTANT) {
            return false;
        }
        Object obj = ((C11987) abstractC8396).f35889;
        Integer num = 0;
        return num.equals(obj) || C11987.f35888.equals(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23076(int i, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    return C11926.f35649.m29098(i);
                }
                C11926 c11926 = C11926.f35647;
                if (cCharAt == 'I') {
                    return c11926.m29098(i);
                }
                if (cCharAt == 'J') {
                    return C11926.f35646.m29098(i);
                }
                if (cCharAt == 'Z') {
                    return C11926.f35650.m29098(i);
                }
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case 'B':
                            return C11926.f35648.m29098(i);
                        case 'C':
                            return C11926.f35652.m29098(i);
                        case 'D':
                            return C11926.f35645.m29098(i);
                        default:
                            return c11926.m29098(i);
                    }
                }
            }
            return C11926.m29091("La;").m29098(i);
        }
        return C11926.f35651.m29098(i);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0307  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23080(AbstractC8396 abstractC8396, C18127 c18127) {
        int iIntValue;
        int i;
        int i2;
        byte[] bArrM23085;
        int i3 = C9661.f29258[abstractC8396.f25747.ordinal()];
        char c = 1;
        if (i3 == 1) {
            int i4 = C9661.f29259[abstractC8396.f25745.ordinal()];
            if (i4 == 1) {
                c18127.mo28295(m23076(21, abstractC8396.f25746), ((C18274) abstractC8396).f56817);
                return;
            }
            if (i4 == 2) {
                C9808 c9808 = (C9808) abstractC8396;
                c18127.mo26972(m23077(c9808.f29647), 178, c9808.f29645, c9808.f29646);
                return;
            }
            if (i4 != 5) {
                if (i4 != 12) {
                    return;
                }
                c18127.mo26978(187, m23077(((C17568) abstractC8396).f53685));
                return;
            }
            C11987 c11987 = (C11987) abstractC8396;
            if (c11987.f35889.equals(C11987.f35888)) {
                c18127.mo28279(1);
                return;
            }
            Object obj = c11987.f35889;
            if ((obj instanceof C22860) || (obj instanceof C1899) || (obj instanceof C11072)) {
                c18127.mo26971(C1193.m4024(obj));
                return;
            } else {
                c18127.mo26971(obj);
                return;
            }
        }
        if (i3 == 2) {
            m23082((AbstractC19686) abstractC8396, c18127);
            return;
        }
        int i5 = 0;
        if (i3 == 3) {
            AbstractC0634 abstractC0634 = (AbstractC0634) abstractC8396;
            String str = abstractC0634.f2429.f25746;
            m23080(abstractC0634.f2428, c18127);
            EnumC1340 enumC1340 = abstractC0634.f25745;
            EnumC1340 enumC1341 = EnumC1340.ADD;
            if (enumC1340 == enumC1341 || enumC1340 == EnumC1340.SUB) {
                AbstractC8396 abstractC8397 = abstractC0634.f2429;
                if (abstractC8397.f25745 == EnumC1340.CONSTANT) {
                    C11987 c11988 = (C11987) abstractC8397;
                    char cCharAt = c11988.f25746.charAt(0);
                    if (cCharAt == 'B') {
                        iIntValue = ((Integer) c11988.f35889).intValue();
                        if (iIntValue < 0) {
                            c18127.mo26971(Integer.valueOf(-iIntValue));
                            c18127.mo28279(m23076(enumC1340 == enumC1341 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'D') {
                        double dDoubleValue = ((Double) c11988.f35889).doubleValue();
                        if (dDoubleValue < 0.0d) {
                            c18127.mo26971(Double.valueOf(-dDoubleValue));
                            c18127.mo28279(m23076(enumC1340 == enumC1341 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'F') {
                        float fFloatValue = ((Float) c11988.f35889).floatValue();
                        if (fFloatValue < 0.0f) {
                            c18127.mo26971(Float.valueOf(-fFloatValue));
                            c18127.mo28279(m23076(enumC1340 == enumC1341 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'S' || cCharAt == 'I') {
                        iIntValue = ((Integer) c11988.f35889).intValue();
                        if (iIntValue < 0) {
                            c18127.mo26971(Integer.valueOf(-iIntValue));
                            c18127.mo28279(m23076(enumC1340 == enumC1341 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'J') {
                        long jLongValue = ((Long) c11988.f35889).longValue();
                        if (jLongValue < 0) {
                            c18127.mo26971(Long.valueOf(-jLongValue));
                            c18127.mo28279(m23076(enumC1340 == enumC1341 ? 100 : 96, str));
                            return;
                        }
                    }
                }
            }
            m23080(abstractC0634.f2429, c18127);
            String str2 = abstractC0634.f2428.f25746;
            int i6 = C9661.f29259[enumC1340.ordinal()];
            if (i6 == 4) {
                String str3 = abstractC0634.f25746;
                if (str2.charAt(0) == '[') {
                    c18127.mo28279(m23076(46, str2.substring(1)));
                    return;
                } else {
                    c18127.mo28279(m23076(46, str3));
                    return;
                }
            }
            switch (i6) {
                case 28:
                    c18127.mo28279(m23076(96, str));
                    return;
                case 29:
                    c18127.mo28279(m23076(100, str));
                    return;
                case 30:
                case 31:
                case 32:
                case 33:
                    c18127.mo28279(m23076(108, str));
                    return;
                case 34:
                    c18127.mo28279(m23076(IShizukuService.Stub.TRANSACTION_isHidden, str));
                    return;
                case 35:
                    c18127.mo28279(m23076(UMErrorCode.E_UM_BE_DEFLATE_FAILED, str));
                    return;
                case 36:
                    c18127.mo28279(m23076(126, str));
                    return;
                case 37:
                    c18127.mo28279(m23076(128, str));
                    return;
                case 38:
                    c18127.mo28279(m23076(130, str));
                    return;
                case 39:
                    c18127.mo28279(m23076(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, str2));
                    return;
                case 40:
                    c18127.mo28279(m23076(122, str2));
                    return;
                case 41:
                    c18127.mo28279(m23076(124, str2));
                    return;
                case 42:
                    c18127.mo28279(148);
                    return;
                case 43:
                    c18127.mo28279(150);
                    return;
                case 44:
                    c18127.mo28279(152);
                    return;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c18127.mo28279(149);
                    return;
                case 46:
                    c18127.mo28279(151);
                    return;
                default:
                    return;
            }
        }
        if (i3 != 4) {
            return;
        }
        AbstractC5574 abstractC5574 = (AbstractC5574) abstractC8396;
        EnumC1340 enumC1342 = abstractC5574.f25745;
        Object[] objArrCopyOf = null;
        String strSubstring = null;
        if (enumC1342 == EnumC1340.FILLED_ARRAY) {
            C7753 c7753 = (C7753) abstractC5574;
            String str4 = c7753.f25746;
            int iM23076 = 79;
            if (str4.charAt(0) == '[') {
                strSubstring = str4.substring(1);
                iM23076 = m23076(79, strSubstring);
            }
            try {
                if (this.f27204 != null && strSubstring != null && "BSIJ".contains(strSubstring)) {
                    for (AbstractC8396 abstractC8398 : c7753.f17269) {
                        if (abstractC8398.f25745 != EnumC1340.CONSTANT) {
                            c = 0;
                            break;
                        }
                    }
                    if (c != 0 && (bArrM23085 = m23085(c7753.f17269, strSubstring)) != null && bArrM23085.length > 500) {
                        m23081(c18127, bArrM23085, strSubstring);
                        return;
                    }
                }
                while (true) {
                    AbstractC8396[] abstractC8396Arr = c7753.f17269;
                    if (i5 >= abstractC8396Arr.length) {
                        return;
                    }
                    if (abstractC8396Arr[i5] != null) {
                        c18127.mo28279(89);
                        c18127.mo26971(Integer.valueOf(i5));
                        m23080(c7753.f17269[i5], c18127);
                        String str5 = c7753.f17269[i5].f25746;
                        if (strSubstring != null) {
                            m23079(str5, strSubstring, c18127);
                        }
                        c18127.mo28279(iM23076);
                    }
                    i5++;
                }
            } catch (Exception unused) {
            }
            m23082((AbstractC19686) new C16156(EnumC1340.NEW_ARRAY, C23275.m51589(c7753.f17269.length), c7753.f23980), c18127);
        } else {
            switch (C9661.f29259[enumC1342.ordinal()]) {
                case 13:
                case 14:
                case 16:
                case 17:
                    break;
                case 15:
                    c18127.mo26978(187, m23077(((C11219) abstractC5574).f33657.m19702()));
                    c18127.mo28279(89);
                    break;
                case 18:
                    for (AbstractC8396 abstractC8399 : abstractC5574.f17269) {
                        m23080(abstractC8399, c18127);
                    }
                    C14745 c14745 = (C14745) abstractC5574;
                    StringBuilder sb = new StringBuilder();
                    while (i5 < c14745.f45025) {
                        sb.append('[');
                        i5++;
                    }
                    sb.append(c14745.f45026);
                    c18127.mo26970(abstractC5574.f17269.length, sb.toString());
                    return;
                case 19:
                    C2046 c2046 = (C2046) abstractC5574;
                    C10161 c10161 = c2046.f6843;
                    String[] strArrM27468 = c10161.m25525().m27468();
                    AbstractC8396[] abstractC8396Arr2 = c2046.f17269;
                    if (strArrM27468.length == abstractC8396Arr2.length) {
                        for (int i7 = 0; i7 < abstractC8396Arr2.length; i7++) {
                            AbstractC8396 abstractC83910 = abstractC8396Arr2[i7];
                            m23080(abstractC83910, c18127);
                            m23079(abstractC83910.f25746, strArrM27468[i7], c18127);
                        }
                    } else if (strArrM27468.length + 1 == abstractC8396Arr2.length) {
                        m23080(abstractC8396Arr2[0], c18127);
                        for (int i8 = 1; i8 < abstractC8396Arr2.length; i8++) {
                            AbstractC8396 abstractC83911 = abstractC8396Arr2[i8];
                            m23080(abstractC83911, c18127);
                            m23079(abstractC83911.f25746, strArrM27468[i8 - 1], c18127);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    String strM25524 = c10161.m25524();
                    String strM27467 = c10161.m25525().m27467();
                    C0636 c0636M4029 = C1193.m4029(c10161.m25522());
                    Object[] objArrM25523 = c10161.m25523();
                    if (objArrM25523 != null) {
                        objArrCopyOf = Arrays.copyOf(objArrM25523, objArrM25523.length);
                        while (i5 < objArrCopyOf.length) {
                            objArrCopyOf[i5] = C1193.m4024(objArrCopyOf[i5]);
                            i5++;
                        }
                    }
                    c18127.mo26974(strM25524, strM27467, c0636M4029, objArrCopyOf);
                    return;
                case 20:
                    C16862 c16862 = (C16862) abstractC5574;
                    C11072 c11072 = c16862.f51741;
                    C7338 c7338 = c16862.f51742;
                    String[] strArrM27469 = c11072.m27468();
                    AbstractC8396[] abstractC8396Arr3 = c16862.f17269;
                    m23080(abstractC8396Arr3[0], c18127);
                    for (int i9 = 1; i9 < abstractC8396Arr3.length; i9++) {
                        AbstractC8396 abstractC83912 = abstractC8396Arr3[i9];
                        m23080(abstractC83912, c18127);
                        m23079(abstractC83912.f25746, strArrM27469[i9 - 1], c18127);
                    }
                    c18127.mo12089(182, m23077(c7338.m19702()), c7338.m19700(), c11072.m27467(), false);
                    return;
                default:
                    return;
            }
            C11219 c11219 = (C11219) abstractC5574;
            C7338 c7339 = c11219.f33657;
            if (enumC1342 == EnumC1340.INVOKE_STATIC || enumC1342 == EnumC1340.INVOKE_NEW) {
                i = 0;
            } else {
                m23080(abstractC5574.f17269[0], c18127);
                i = 1;
            }
            int i10 = 0;
            while (true) {
                AbstractC8396[] abstractC8396Arr4 = abstractC5574.f17269;
                if (i >= abstractC8396Arr4.length) {
                    switch (C9661.f29259[enumC1342.ordinal()]) {
                        case 13:
                            i2 = 182;
                            break;
                        case 14:
                            i2 = 185;
                            break;
                        case 15:
                        case 16:
                            i2 = 183;
                            break;
                        case 17:
                            i2 = 184;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    C11072 c11072M19703 = c7339.m19703();
                    if (c11219.f25745 == EnumC1340.INVOKE_NEW) {
                        c11072M19703 = new C11072("V", c11072M19703.m27468());
                    }
                    c18127.mo12089(i2, m23077(c7339.m19702()), c7339.m19700(), c11072M19703.m27467(), i2 == 185);
                    return;
                }
                AbstractC8396 abstractC83913 = abstractC8396Arr4[i];
                m23080(abstractC83913, c18127);
                m23079(abstractC83913.f25746, c7339.m19704()[i10], c18127);
                i++;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23078(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m23085(AbstractC8396[] abstractC8396Arr, String str) {
        str.getClass();
        int i = 0;
        switch (str) {
            case "B":
                byte[] bArr = new byte[abstractC8396Arr.length];
                int length = abstractC8396Arr.length;
                while (i < length) {
                    bArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).byteValue();
                    i++;
                }
                return bArr;
            case "I":
                int length2 = abstractC8396Arr.length;
                int[] iArr = new int[length2];
                int length3 = abstractC8396Arr.length;
                while (i < length3) {
                    iArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).intValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 * 4);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.asIntBuffer().put(iArr);
                return byteBufferAllocate.array();
            case "J":
                int length4 = abstractC8396Arr.length;
                long[] jArr = new long[length4];
                int length5 = abstractC8396Arr.length;
                while (i < length5) {
                    jArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).longValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length4 * 8);
                byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate2.asLongBuffer().put(jArr);
                return byteBufferAllocate2.array();
            case "S":
                int length6 = abstractC8396Arr.length;
                short[] sArr = new short[length6];
                int length7 = abstractC8396Arr.length;
                while (i < length7) {
                    sArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).shortValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(length6 * 2);
                byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate3.asShortBuffer().put(sArr);
                return byteBufferAllocate3.array();
            default:
                return null;
        }
    }
}
