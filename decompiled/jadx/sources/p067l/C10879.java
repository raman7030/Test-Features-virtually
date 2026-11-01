package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C10879 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17054 f30137;

    /* JADX INFO: renamed from: ۧ */
    public C7526 f30138;

    /* JADX INFO: renamed from: ܽ */
    public C7726 f30139;

    /* JADX INFO: renamed from: ֫ */
    private void m25056(AbstractC21078 abstractC21078, C19596 c19596) {
        m25054(abstractC21078.f66218, c19596);
        int[] iArr = C11550.f32208;
        EnumC3642 enumC3642 = abstractC21078.f28658;
        int i = iArr[enumC3642.ordinal()];
        if (i == 2) {
            C15771 c15771 = (C15771) abstractC21078;
            c19596.mo29017(m25051(c15771.f45665), 178, c15771.f45666, c15771.f45664);
            return;
        }
        if (i == 3) {
            C15771 c15772 = (C15771) abstractC21078;
            c19596.mo29017(m25051(c15772.f45665), 180, c15772.f45666, c15772.f45664);
            return;
        }
        switch (i) {
            case 21:
                String str = ((C17723) abstractC21078).f52945;
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
                                                    c19596.mo30334(188, 8);
                                                    break;
                                                case 'C':
                                                    c19596.mo30334(188, 5);
                                                    break;
                                                case 'D':
                                                    c19596.mo30334(188, 7);
                                                    break;
                                            }
                                        }
                                    } else {
                                        c19596.mo30334(188, 4);
                                        break;
                                    }
                                } else {
                                    c19596.mo30334(188, 11);
                                    break;
                                }
                            } else {
                                c19596.mo30334(188, 10);
                                break;
                            }
                        } else {
                            c19596.mo30334(188, 9);
                            break;
                        }
                    }
                    c19596.mo29023(189, C13703.m31144(str).m31156());
                } else {
                    c19596.mo30334(188, 6);
                }
                break;
            case 22:
            case 23:
                c19596.mo29023(enumC3642 == EnumC3642.CHECK_CAST ? 192 : 193, m25051(((C17723) abstractC21078).f52945));
                break;
            case 24:
                C8396 c8396 = (C8396) abstractC21078;
                String str2 = abstractC21078.f66218.f28659;
                String str3 = c8396.f22520;
                if (!str2.equals(str3)) {
                    char cCharAt2 = str2.charAt(0);
                    if (cCharAt2 != 'F') {
                        if (cCharAt2 != 'S' && cCharAt2 != 'Z' && cCharAt2 != 'I') {
                            if (cCharAt2 == 'J') {
                                char cCharAt3 = str3.charAt(0);
                                if (cCharAt3 == 'D') {
                                    c19596.mo30323(138);
                                    break;
                                } else if (cCharAt3 == 'F') {
                                    c19596.mo30323(137);
                                    break;
                                } else if (cCharAt3 == 'I') {
                                    c19596.mo30323(136);
                                    break;
                                }
                            } else {
                                switch (cCharAt2) {
                                    case 'D':
                                        char cCharAt4 = str3.charAt(0);
                                        if (cCharAt4 == 'F') {
                                            c19596.mo30323(144);
                                            break;
                                        } else if (cCharAt4 == 'I') {
                                            c19596.mo30323(142);
                                            break;
                                        } else if (cCharAt4 == 'J') {
                                            c19596.mo30323(143);
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
                                            c19596.mo30323(145);
                                            break;
                                        case 'C':
                                            c19596.mo30323(146);
                                            break;
                                        case 'D':
                                            c19596.mo30323(135);
                                            break;
                                    }
                                } else {
                                    c19596.mo30323(147);
                                    break;
                                }
                            } else {
                                c19596.mo30323(133);
                                break;
                            }
                        } else {
                            c19596.mo30323(134);
                            break;
                        }
                    } else {
                        char cCharAt6 = str3.charAt(0);
                        if (cCharAt6 == 'D') {
                            c19596.mo30323(141);
                            break;
                        } else if (cCharAt6 == 'I') {
                            c19596.mo30323(139);
                            break;
                        } else if (cCharAt6 == 'J') {
                            c19596.mo30323(140);
                            break;
                        }
                    }
                }
                break;
            case 25:
                c19596.mo30323(190);
                break;
            case 26:
                c19596.mo30323(m25050(116, abstractC21078.f28659));
                break;
            case 27:
                if (abstractC21078.f66218.f28659.equals("I")) {
                    c19596.mo29016((Object) (-1));
                    c19596.mo30323(m25050(130, abstractC21078.f28659));
                } else if (abstractC21078.f66218.f28659.equals("J")) {
                    c19596.mo29016((Object) (-1L));
                    c19596.mo30323(m25050(130, abstractC21078.f28659));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25061(C7526 c7526) {
        this.f30138 = c7526;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25062(C7726 c7726) {
        this.f30139 = c7726;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25063(AbstractC17054 abstractC17054) {
        this.f30137 = abstractC17054;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m25060() {
        char cCharAt;
        int i;
        int iIntValue;
        String strSubstring;
        int iM25050;
        int i2;
        boolean z;
        byte[] bArrM25059;
        int i3;
        int iM25051;
        int i4;
        byte[] bArrArray;
        for (AbstractC3880 abstractC3880 : this.f30139.f20257) {
            if (abstractC3880.f8417 == EnumC9677.LABEL) {
                ((C15041) abstractC3880).f42961 = new C3644();
            }
        }
        C7726 c7726 = this.f30139;
        C19596 c19596 = new C19596(this.f30137);
        int i5 = 0;
        Iterator it = c7726.f20261.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C19736) it.next()).f60034);
        }
        new HashMap();
        for (AbstractC3880 abstractC3881 : c7726.f20257) {
            switch (C11550.f32209[abstractC3881.f8417.ordinal()]) {
                case 1:
                    C15041 c15041 = (C15041) abstractC3881;
                    C3644 c3644 = c15041.f42961;
                    c19596.mo30328(c3644);
                    int i6 = c15041.f42962;
                    if (i6 >= 0) {
                        c19596.mo30336(i6, c3644);
                    }
                    break;
                case 2:
                    AbstractC15711 abstractC15711 = (AbstractC15711) abstractC3881;
                    AbstractC10348 abstractC10348 = abstractC15711.f45527;
                    AbstractC10348 abstractC10349 = abstractC15711.f45528;
                    int i7 = C11550.f32208[abstractC10348.f28658.ordinal()];
                    if (i7 == 1) {
                        int i8 = ((C19736) abstractC10348).f60034;
                        if (abstractC10349.f28658 != EnumC3642.LOCAL || i8 != ((C19736) abstractC10349).f60034) {
                            if (abstractC10348.f28659.charAt(0) != 'I') {
                                m25054(abstractC10349, c19596);
                                if (i8 >= 0) {
                                    c19596.mo30339(m25050(54, abstractC10348.f28659), i8);
                                } else if (abstractC10348.f28659.equals("V")) {
                                    cCharAt = abstractC10348.f28659.charAt(0);
                                    if (cCharAt == 'D' && cCharAt != 'J') {
                                        c19596.mo30323(87);
                                    } else {
                                        c19596.mo30323(88);
                                    }
                                }
                            } else {
                                EnumC3642 enumC3642 = abstractC10349.f28658;
                                if (enumC3642 == EnumC3642.ADD) {
                                    if (m25058(abstractC10349.mo4921(), i8) && abstractC10349.mo4923().f28658 == EnumC3642.CONSTANT) {
                                        int iIntValue2 = ((Integer) ((C13761) abstractC10349.mo4923()).f38899).intValue();
                                        if (iIntValue2 < -32768 || iIntValue2 > 32767) {
                                            m25054(abstractC10349, c19596);
                                            if (i8 >= 0) {
                                                c19596.mo30339(m25050(54, abstractC10348.f28659), i8);
                                            } else if (abstractC10348.f28659.equals("V")) {
                                                cCharAt = abstractC10348.f28659.charAt(0);
                                                if (cCharAt == 'D') {
                                                    c19596.mo30323(88);
                                                } else {
                                                    c19596.mo30323(88);
                                                }
                                            }
                                        } else {
                                            c19596.mo30324(i8, iIntValue2);
                                        }
                                    } else if (!m25058(abstractC10349.mo4923(), i8) || abstractC10349.mo4921().f28658 != EnumC3642.CONSTANT || (iIntValue = ((Integer) ((C13761) abstractC10349.mo4921()).f38899).intValue()) < -32768 || iIntValue > 32767) {
                                        m25054(abstractC10349, c19596);
                                        if (i8 >= 0) {
                                            c19596.mo30339(m25050(54, abstractC10348.f28659), i8);
                                        } else if (abstractC10348.f28659.equals("V")) {
                                            cCharAt = abstractC10348.f28659.charAt(0);
                                            if (cCharAt == 'D') {
                                                c19596.mo30323(88);
                                            } else {
                                                c19596.mo30323(88);
                                            }
                                        }
                                    } else {
                                        c19596.mo30324(i8, iIntValue);
                                    }
                                } else if (enumC3642 == EnumC3642.SUB && m25058(abstractC10349.mo4921(), i8) && abstractC10349.mo4923().f28658 == EnumC3642.CONSTANT && (i = -((Integer) ((C13761) abstractC10349.mo4923()).f38899).intValue()) >= -32768 && i <= 32767) {
                                    c19596.mo30324(i8, i);
                                } else {
                                    m25054(abstractC10349, c19596);
                                    if (i8 >= 0) {
                                        c19596.mo30339(m25050(54, abstractC10348.f28659), i8);
                                    } else if (abstractC10348.f28659.equals("V")) {
                                        cCharAt = abstractC10348.f28659.charAt(0);
                                        if (cCharAt == 'D') {
                                            c19596.mo30323(88);
                                        } else {
                                            c19596.mo30323(88);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i7 == 2) {
                        C11690 c11690 = (C11690) abstractC10348;
                        String str = c11690.f32597;
                        m25054(abstractC10349, c19596);
                        m25053(abstractC10349.f28659, str, c19596);
                        c19596.mo29017(m25051(c11690.f32598), 179, c11690.f32596, str);
                    } else if (i7 == 3) {
                        C15771 c15771 = (C15771) abstractC10348;
                        String str2 = c15771.f45664;
                        m25054(c15771.f66218, c19596);
                        m25054(abstractC10349, c19596);
                        m25053(abstractC10349.f28659, str2, c19596);
                        c19596.mo29017(m25051(c15771.f45665), 181, c15771.f45666, str2);
                    } else if (i7 == 4) {
                        C14431 c14431 = (C14431) abstractC10348;
                        m25054(c14431.f5200, c19596);
                        m25054(c14431.f5201, c19596);
                        m25054(abstractC10349, c19596);
                        String str3 = c14431.f5200.f28659;
                        String str4 = c14431.f28659;
                        if (str3.charAt(0) == '[') {
                            String strSubstring2 = str3.substring(1);
                            m25053(abstractC10349.f28659, strSubstring2, c19596);
                            c19596.mo30323(m25050(79, strSubstring2));
                        } else {
                            c19596.mo30323(m25050(79, str4));
                        }
                    }
                    break;
                case 3:
                    AbstractC15711 abstractC15712 = (AbstractC15711) abstractC3881;
                    if (abstractC15712.f45528.f28658 == EnumC3642.EXCEPTION_REF) {
                        int i9 = ((C19736) abstractC15712.f45527).f60034;
                        if (i9 >= 0) {
                            c19596.mo30339(58, i9);
                        } else {
                            c19596.mo30323(87);
                        }
                    }
                    break;
                case 4:
                    AbstractC15711 abstractC15713 = (AbstractC15711) abstractC3881;
                    AbstractC10348 abstractC103410 = abstractC15713.f45528;
                    if (abstractC103410.f28658 == EnumC3642.CONSTANT) {
                        Object obj = ((C13761) abstractC103410).f38899;
                        int length = Array.getLength(obj);
                        String str5 = abstractC15713.f45527.f28659;
                        strSubstring = str5.charAt(i5) == '[' ? str5.substring(1) : "I";
                        try {
                            if (this.f30138 == null || !"BSIJ".contains(strSubstring)) {
                                i3 = 79;
                                iM25051 = m25050(i3, strSubstring);
                                m25054(abstractC15713.f45527, c19596);
                                while (i4 < length) {
                                    c19596.mo30323(89);
                                    c19596.mo29016(Integer.valueOf(i4));
                                    c19596.mo29016(Array.get(obj, i4));
                                    c19596.mo30323(iM25051);
                                }
                                c19596.mo30323(87);
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
                                    m25054(abstractC15713.f45527, c19596);
                                    c19596.mo29016((Object) 0);
                                    m25055(c19596, bArrArray, strSubstring);
                                    c19596.mo29016((Object) 0);
                                    c19596.mo29016(Integer.valueOf(length));
                                    try {
                                        c19596.mo14009(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused) {
                                        i3 = 79;
                                        iM25051 = m25050(i3, strSubstring);
                                        m25054(abstractC15713.f45527, c19596);
                                        for (i4 = 0; i4 < length; i4++) {
                                            c19596.mo30323(89);
                                            c19596.mo29016(Integer.valueOf(i4));
                                            c19596.mo29016(Array.get(obj, i4));
                                            c19596.mo30323(iM25051);
                                        }
                                        c19596.mo30323(87);
                                    }
                                } else {
                                    i3 = 79;
                                }
                                iM25051 = m25050(i3, strSubstring);
                                m25054(abstractC15713.f45527, c19596);
                                while (i4 < length) {
                                    c19596.mo30323(89);
                                    c19596.mo29016(Integer.valueOf(i4));
                                    c19596.mo29016(Array.get(obj, i4));
                                    c19596.mo30323(iM25051);
                                }
                                c19596.mo30323(87);
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    } else {
                        C9737 c9737 = (C9737) abstractC103410;
                        int length2 = c9737.f20109.length;
                        String str6 = abstractC15713.f45527.f28659;
                        strSubstring = str6.charAt(0) == '[' ? str6.substring(1) : "I";
                        try {
                            if (this.f30138 == null || !"BSIJ".contains(strSubstring)) {
                                iM25050 = m25050(79, strSubstring);
                                m25054(abstractC15713.f45527, c19596);
                                while (i2 < length2) {
                                    c19596.mo30323(89);
                                    c19596.mo29016(Integer.valueOf(i2));
                                    m25054(c9737.f20109[i2], c19596);
                                    c19596.mo30323(iM25050);
                                }
                                c19596.mo30323(87);
                            } else {
                                AbstractC10348[] abstractC10348Arr = c9737.f20109;
                                int length3 = abstractC10348Arr.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length3) {
                                        z = true;
                                    } else if (abstractC10348Arr[i10].f28658 != EnumC3642.CONSTANT) {
                                        z = false;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (z && (bArrM25059 = m25059(c9737.f20109, strSubstring)) != null && bArrM25059.length > 500) {
                                    m25054(abstractC15713.f45527, c19596);
                                    c19596.mo29016((Object) 0);
                                    m25055(c19596, bArrM25059, strSubstring);
                                    c19596.mo29016((Object) 0);
                                    c19596.mo29016(Integer.valueOf(length2));
                                    try {
                                        c19596.mo14009(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused3) {
                                        iM25050 = m25050(79, strSubstring);
                                        m25054(abstractC15713.f45527, c19596);
                                        for (i2 = 0; i2 < length2; i2++) {
                                            c19596.mo30323(89);
                                            c19596.mo29016(Integer.valueOf(i2));
                                            m25054(c9737.f20109[i2], c19596);
                                            c19596.mo30323(iM25050);
                                        }
                                        c19596.mo30323(87);
                                    }
                                    break;
                                }
                                iM25050 = m25050(79, strSubstring);
                                m25054(abstractC15713.f45527, c19596);
                                while (i2 < length2) {
                                    c19596.mo30323(89);
                                    c19596.mo29016(Integer.valueOf(i2));
                                    m25054(c9737.f20109[i2], c19596);
                                    c19596.mo30323(iM25050);
                                }
                                c19596.mo30323(87);
                            }
                            break;
                        } catch (Exception unused4) {
                        }
                    }
                    break;
                case 5:
                    c19596.mo30326(167, ((C21748) abstractC3881).f68466.f42961);
                    break;
                case 6:
                    C6995 c6995 = (C6995) abstractC3881;
                    C3644 c3645 = c6995.f18221.f42961;
                    AbstractC10348 abstractC103411 = c6995.f77339;
                    AbstractC10348 abstractC10348Mo4921 = abstractC103411.mo4921();
                    EnumC3642 enumC3643 = abstractC103411.f28658;
                    AbstractC10348 abstractC10348Mo4923 = abstractC103411.mo4923();
                    char cCharAt2 = abstractC10348Mo4921.f28659.charAt(i5);
                    if (cCharAt2 != 'L' && cCharAt2 != '[') {
                        if (!m25057(abstractC10348Mo4921) && !m25057(abstractC10348Mo4923)) {
                            m25054(abstractC10348Mo4921, c19596);
                            m25054(abstractC10348Mo4923, c19596);
                            switch (C11550.f32208[enumC3643.ordinal()]) {
                                case 6:
                                    c19596.mo30326(DHParameters.DEFAULT_MINIMUM_LENGTH, c3645);
                                    break;
                                case 7:
                                    c19596.mo30326(159, c3645);
                                    break;
                                case 8:
                                    c19596.mo30326(162, c3645);
                                    break;
                                case 9:
                                    c19596.mo30326(163, c3645);
                                    break;
                                case 10:
                                    c19596.mo30326(164, c3645);
                                    break;
                                case 11:
                                    c19596.mo30326(161, c3645);
                                    break;
                            }
                        } else {
                            if (m25057(abstractC10348Mo4923)) {
                                m25054(abstractC10348Mo4921, c19596);
                            } else {
                                m25054(abstractC10348Mo4923, c19596);
                            }
                            switch (C11550.f32208[enumC3643.ordinal()]) {
                                case 6:
                                    c19596.mo30326(EnumC19222.f57460, c3645);
                                    break;
                                case 7:
                                    c19596.mo30326(153, c3645);
                                    break;
                                case 8:
                                    c19596.mo30326(156, c3645);
                                    break;
                                case 9:
                                    c19596.mo30326(157, c3645);
                                    break;
                                case 10:
                                    c19596.mo30326(158, c3645);
                                    break;
                                case 11:
                                    c19596.mo30326(155, c3645);
                                    break;
                            }
                        }
                    } else {
                        if (m25057(abstractC10348Mo4921) || m25057(abstractC10348Mo4923)) {
                            if (m25057(abstractC10348Mo4923)) {
                                m25054(abstractC10348Mo4921, c19596);
                            } else {
                                m25054(abstractC10348Mo4923, c19596);
                            }
                            c19596.mo30326(enumC3643 == EnumC3642.EQ ? 198 : 199, c3645);
                        } else {
                            m25054(abstractC10348Mo4921, c19596);
                            m25054(abstractC10348Mo4923, c19596);
                            c19596.mo30326(enumC3643 == EnumC3642.EQ ? 165 : 166, c3645);
                        }
                        break;
                    }
                    break;
                case 7:
                    m25054(((C24667) abstractC3881).f77339, c19596);
                    c19596.mo30323(194);
                    break;
                case 8:
                    m25054(((C24667) abstractC3881).f77339, c19596);
                    c19596.mo30323(195);
                    break;
                case 9:
                    break;
                case 10:
                    AbstractC10348 abstractC103412 = ((C24667) abstractC3881).f77339;
                    m25054(abstractC103412, c19596);
                    m25053(abstractC103412.f28659, c7726.f20265, c19596);
                    c19596.mo30323(m25050(172, abstractC103412.f28659));
                    break;
                case 11:
                    c19596.mo30323(177);
                    break;
                case 12:
                    C14371 c14371 = (C14371) abstractC3881;
                    m25054(c14371.f77339, c19596);
                    int length4 = c14371.f75556.length;
                    C3644[] c3644Arr = new C3644[length4];
                    for (int i11 = 0; i11 < length4; i11++) {
                        c3644Arr[i11] = c14371.f75556[i11].f42961;
                    }
                    c19596.mo30329(c14371.f75557.f42961, c14371.f41080, c3644Arr);
                    break;
                case 13:
                    C18632 c18632 = (C18632) abstractC3881;
                    m25054(c18632.f77339, c19596);
                    int length5 = c18632.f75556.length;
                    C3644[] c3644Arr2 = new C3644[length5];
                    for (int i12 = 0; i12 < length5; i12++) {
                        c3644Arr2[i12] = c18632.f75556[i12].f42961;
                    }
                    int i13 = c18632.f55627;
                    c19596.mo30325(i13, (length5 + i13) - 1, c18632.f75557.f42961, c3644Arr2);
                    break;
                case 14:
                    m25054(((C24667) abstractC3881).f77339, c19596);
                    c19596.mo30323(191);
                    break;
                case 15:
                    AbstractC10348 abstractC10348Mo7672 = abstractC3881.mo7672();
                    m25054(abstractC10348Mo7672, c19596);
                    String str7 = abstractC10348Mo7672.f28659;
                    if (abstractC10348Mo7672.f28658 == EnumC3642.INVOKE_NEW) {
                        c19596.mo30323(87);
                    } else if (!"V".equals(str7)) {
                        char cCharAt3 = str7.charAt(i5);
                        if (cCharAt3 == 'D' || cCharAt3 == 'J') {
                            c19596.mo30323(88);
                        } else {
                            c19596.mo30323(87);
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("not support st: " + abstractC3881.f8417);
            }
            i5 = 0;
        }
        C7726 c7727 = this.f30139;
        AbstractC17054 abstractC17054 = this.f30137;
        for (C7055 c7055 : c7727.f20264) {
            AbstractC3880 abstractC3880M7669 = c7055.f18393;
            while (true) {
                abstractC3880M7669 = abstractC3880M7669.m7669();
                if (abstractC3880M7669 == null || abstractC3880M7669 == c7055.f18391) {
                    break;
                }
                if (abstractC3880M7669.f8417 != EnumC9677.LABEL) {
                    int i14 = 0;
                    while (true) {
                        C15041[] c15041Arr = c7055.f18392;
                        if (i14 < c15041Arr.length) {
                            String str8 = c7055.f18394[i14];
                            abstractC17054.mo29020(c7055.f18393.f42961, c7055.f18391.f42961, c15041Arr[i14].f42961, str8 == null ? null : C13703.m31144(str8).m31156());
                            i14++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25051(String str) {
        return C13703.m31144(str).m31156();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25055(C19596 c19596, byte[] bArr, String str) {
        String strM25052 = m25052(bArr);
        if (strM25052.length() > 65535) {
            c19596.mo29023(187, "java/lang/StringBuilder");
            c19596.mo30323(89);
            c19596.mo14009(183, "java/lang/StringBuilder", "<init>", "()V", false);
            for (int i = 0; i < strM25052.length(); i += 65500) {
                c19596.mo29016(strM25052.substring(i, Math.min(65500, strM25052.length() - i) + i));
                c19596.mo14009(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            }
            c19596.mo14009(182, "java/lang/StringBuilder", AnnotationHandler.STRING, "()Ljava/lang/String;", false);
        } else {
            c19596.mo29016(strM25052);
        }
        String strM25051 = m25051(this.f30138.f19761);
        C7526 c7526 = this.f30138;
        if (c7526.f19762 == null) {
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            c7526.f19762 = "$d2j$hex$" + m25052(bArr2);
        }
        c19596.mo14009(184, strM25051, C24420.m53894(new StringBuilder(), c7526.f19762, "$decode_", str), C21466.m48631("(Ljava/lang/String;)[", str), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25058(AbstractC10348 abstractC10348, int i) {
        return abstractC10348.f28658 == EnumC3642.LOCAL && ((C19736) abstractC10348).f60034 == i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25053(String str, String str2, C19596 c19596) {
        char cCharAt = str2.charAt(0);
        if (cCharAt == 'B') {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 == 'C' || cCharAt2 == 'I' || cCharAt2 == 'S') {
                c19596.mo30323(145);
                return;
            }
            return;
        }
        if (cCharAt == 'C') {
            if (str.charAt(0) != 'I') {
                return;
            }
            c19596.mo30323(146);
        } else {
            if (cCharAt != 'S') {
                return;
            }
            char cCharAt3 = str.charAt(0);
            if (cCharAt3 == 'C' || cCharAt3 == 'I') {
                c19596.mo30323(147);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25057(AbstractC10348 abstractC10348) {
        if (abstractC10348.f28658 != EnumC3642.CONSTANT) {
            return false;
        }
        Object obj = ((C13761) abstractC10348).f38899;
        Integer num = 0;
        return num.equals(obj) || C13761.f38898.equals(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25050(int i, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    return C13703.f38658.m31151(i);
                }
                C13703 c13703 = C13703.f38656;
                if (cCharAt == 'I') {
                    return c13703.m31151(i);
                }
                if (cCharAt == 'J') {
                    return C13703.f38655.m31151(i);
                }
                if (cCharAt == 'Z') {
                    return C13703.f38659.m31151(i);
                }
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case 'B':
                            return C13703.f38657.m31151(i);
                        case 'C':
                            return C13703.f38661.m31151(i);
                        case 'D':
                            return C13703.f38654.m31151(i);
                        default:
                            return c13703.m31151(i);
                    }
                }
            }
            return C13703.m31144("La;").m31151(i);
        }
        return C13703.f38660.m31151(i);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0307  */
    /* JADX INFO: renamed from: ֫ */
    private void m25054(AbstractC10348 abstractC10348, C19596 c19596) {
        int iIntValue;
        int i;
        int i2;
        byte[] bArrM25059;
        int i3 = C11550.f32207[abstractC10348.f28660.ordinal()];
        char c = 1;
        if (i3 == 1) {
            int i4 = C11550.f32208[abstractC10348.f28658.ordinal()];
            if (i4 == 1) {
                c19596.mo30339(m25050(21, abstractC10348.f28659), ((C19736) abstractC10348).f60034);
                return;
            }
            if (i4 == 2) {
                C11690 c11690 = (C11690) abstractC10348;
                c19596.mo29017(m25051(c11690.f32598), 178, c11690.f32596, c11690.f32597);
                return;
            }
            if (i4 != 5) {
                if (i4 != 12) {
                    return;
                }
                c19596.mo29023(187, m25051(((C19065) abstractC10348).f56875));
                return;
            }
            C13761 c13761 = (C13761) abstractC10348;
            if (c13761.f38899.equals(C13761.f38898)) {
                c19596.mo30323(1);
                return;
            }
            Object obj = c13761.f38899;
            if ((obj instanceof C24094) || (obj instanceof C4173) || (obj instanceof C12891)) {
                c19596.mo29016(C3502.m6266(obj));
                return;
            } else {
                c19596.mo29016(obj);
                return;
            }
        }
        if (i3 == 2) {
            m25056((AbstractC21078) abstractC10348, c19596);
            return;
        }
        int i5 = 0;
        if (i3 == 3) {
            AbstractC2971 abstractC2971 = (AbstractC2971) abstractC10348;
            String str = abstractC2971.f5201.f28659;
            m25054(abstractC2971.f5200, c19596);
            EnumC3642 enumC3642 = abstractC2971.f28658;
            EnumC3642 enumC3643 = EnumC3642.ADD;
            if (enumC3642 == enumC3643 || enumC3642 == EnumC3642.SUB) {
                AbstractC10348 abstractC10349 = abstractC2971.f5201;
                if (abstractC10349.f28658 == EnumC3642.CONSTANT) {
                    C13761 c13762 = (C13761) abstractC10349;
                    char cCharAt = c13762.f28659.charAt(0);
                    if (cCharAt == 'B') {
                        iIntValue = ((Integer) c13762.f38899).intValue();
                        if (iIntValue < 0) {
                            c19596.mo29016(Integer.valueOf(-iIntValue));
                            c19596.mo30323(m25050(enumC3642 == enumC3643 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'D') {
                        double dDoubleValue = ((Double) c13762.f38899).doubleValue();
                        if (dDoubleValue < 0.0d) {
                            c19596.mo29016(Double.valueOf(-dDoubleValue));
                            c19596.mo30323(m25050(enumC3642 == enumC3643 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'F') {
                        float fFloatValue = ((Float) c13762.f38899).floatValue();
                        if (fFloatValue < 0.0f) {
                            c19596.mo29016(Float.valueOf(-fFloatValue));
                            c19596.mo30323(m25050(enumC3642 == enumC3643 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'S' || cCharAt == 'I') {
                        iIntValue = ((Integer) c13762.f38899).intValue();
                        if (iIntValue < 0) {
                            c19596.mo29016(Integer.valueOf(-iIntValue));
                            c19596.mo30323(m25050(enumC3642 == enumC3643 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'J') {
                        long jLongValue = ((Long) c13762.f38899).longValue();
                        if (jLongValue < 0) {
                            c19596.mo29016(Long.valueOf(-jLongValue));
                            c19596.mo30323(m25050(enumC3642 == enumC3643 ? 100 : 96, str));
                            return;
                        }
                    }
                }
            }
            m25054(abstractC2971.f5201, c19596);
            String str2 = abstractC2971.f5200.f28659;
            int i6 = C11550.f32208[enumC3642.ordinal()];
            if (i6 == 4) {
                String str3 = abstractC2971.f28659;
                if (str2.charAt(0) == '[') {
                    c19596.mo30323(m25050(46, str2.substring(1)));
                    return;
                } else {
                    c19596.mo30323(m25050(46, str3));
                    return;
                }
            }
            switch (i6) {
                case 28:
                    c19596.mo30323(m25050(96, str));
                    return;
                case 29:
                    c19596.mo30323(m25050(100, str));
                    return;
                case 30:
                case 31:
                case 32:
                case 33:
                    c19596.mo30323(m25050(108, str));
                    return;
                case 34:
                    c19596.mo30323(m25050(IShizukuService.Stub.TRANSACTION_isHidden, str));
                    return;
                case 35:
                    c19596.mo30323(m25050(UMErrorCode.E_UM_BE_DEFLATE_FAILED, str));
                    return;
                case 36:
                    c19596.mo30323(m25050(126, str));
                    return;
                case 37:
                    c19596.mo30323(m25050(128, str));
                    return;
                case 38:
                    c19596.mo30323(m25050(130, str));
                    return;
                case 39:
                    c19596.mo30323(m25050(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, str2));
                    return;
                case 40:
                    c19596.mo30323(m25050(122, str2));
                    return;
                case 41:
                    c19596.mo30323(m25050(124, str2));
                    return;
                case 42:
                    c19596.mo30323(148);
                    return;
                case 43:
                    c19596.mo30323(150);
                    return;
                case 44:
                    c19596.mo30323(152);
                    return;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c19596.mo30323(149);
                    return;
                case 46:
                    c19596.mo30323(151);
                    return;
                default:
                    return;
            }
        }
        if (i3 != 4) {
            return;
        }
        AbstractC7666 abstractC7666 = (AbstractC7666) abstractC10348;
        EnumC3642 enumC3644 = abstractC7666.f28658;
        Object[] objArrCopyOf = null;
        String strSubstring = null;
        if (enumC3644 == EnumC3642.FILLED_ARRAY) {
            C9737 c9737 = (C9737) abstractC7666;
            String str4 = c9737.f28659;
            int iM25050 = 79;
            if (str4.charAt(0) == '[') {
                strSubstring = str4.substring(1);
                iM25050 = m25050(79, strSubstring);
            }
            try {
                if (this.f30138 != null && strSubstring != null && "BSIJ".contains(strSubstring)) {
                    for (AbstractC10348 abstractC103410 : c9737.f20109) {
                        if (abstractC103410.f28658 != EnumC3642.CONSTANT) {
                            c = 0;
                            break;
                        }
                    }
                    if (c != 0 && (bArrM25059 = m25059(c9737.f20109, strSubstring)) != null && bArrM25059.length > 500) {
                        m25055(c19596, bArrM25059, strSubstring);
                        return;
                    }
                }
                while (true) {
                    AbstractC10348[] abstractC10348Arr = c9737.f20109;
                    if (i5 >= abstractC10348Arr.length) {
                        return;
                    }
                    if (abstractC10348Arr[i5] != null) {
                        c19596.mo30323(89);
                        c19596.mo29016(Integer.valueOf(i5));
                        m25054(c9737.f20109[i5], c19596);
                        String str5 = c9737.f20109[i5].f28659;
                        if (strSubstring != null) {
                            m25053(str5, strSubstring, c19596);
                        }
                        c19596.mo30323(iM25050);
                    }
                    i5++;
                }
            } catch (Exception unused) {
            }
            m25056((AbstractC21078) new C17723(EnumC3642.NEW_ARRAY, C24489.m53985(c9737.f20109.length), c9737.f26894), c19596);
        } else {
            switch (C11550.f32208[enumC3644.ordinal()]) {
                case 13:
                case 14:
                case 16:
                case 17:
                    break;
                case 15:
                    c19596.mo29023(187, m25051(((C13031) abstractC7666).f36656.m21675()));
                    c19596.mo30323(89);
                    break;
                case 18:
                    for (AbstractC10348 abstractC103411 : abstractC7666.f20109) {
                        m25054(abstractC103411, c19596);
                    }
                    C16382 c16382 = (C16382) abstractC7666;
                    StringBuilder sb = new StringBuilder();
                    while (i5 < c16382.f48138) {
                        sb.append('[');
                        i5++;
                    }
                    sb.append(c16382.f48139);
                    c19596.mo29015(abstractC7666.f20109.length, sb.toString());
                    return;
                case 19:
                    C4313 c4313 = (C4313) abstractC7666;
                    C12025 c12025 = c4313.f9626;
                    String[] strArrM29530 = c12025.m27544().m29530();
                    AbstractC10348[] abstractC10348Arr2 = c4313.f20109;
                    if (strArrM29530.length == abstractC10348Arr2.length) {
                        for (int i7 = 0; i7 < abstractC10348Arr2.length; i7++) {
                            AbstractC10348 abstractC103412 = abstractC10348Arr2[i7];
                            m25054(abstractC103412, c19596);
                            m25053(abstractC103412.f28659, strArrM29530[i7], c19596);
                        }
                    } else if (strArrM29530.length + 1 == abstractC10348Arr2.length) {
                        m25054(abstractC10348Arr2[0], c19596);
                        for (int i8 = 1; i8 < abstractC10348Arr2.length; i8++) {
                            AbstractC10348 abstractC103413 = abstractC10348Arr2[i8];
                            m25054(abstractC103413, c19596);
                            m25053(abstractC103413.f28659, strArrM29530[i8 - 1], c19596);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    String strM27543 = c12025.m27543();
                    String strM29529 = c12025.m27544().m29529();
                    C2973 c2973M6271 = C3502.m6271(c12025.m27541());
                    Object[] objArrM27542 = c12025.m27542();
                    if (objArrM27542 != null) {
                        objArrCopyOf = Arrays.copyOf(objArrM27542, objArrM27542.length);
                        while (i5 < objArrCopyOf.length) {
                            objArrCopyOf[i5] = C3502.m6266(objArrCopyOf[i5]);
                            i5++;
                        }
                    }
                    c19596.mo29019(strM27543, strM29529, c2973M6271, objArrCopyOf);
                    return;
                case 20:
                    C18394 c18394 = (C18394) abstractC7666;
                    C12891 c12891 = c18394.f54921;
                    C9342 c9342 = c18394.f54922;
                    String[] strArrM29531 = c12891.m29530();
                    AbstractC10348[] abstractC10348Arr3 = c18394.f20109;
                    m25054(abstractC10348Arr3[0], c19596);
                    for (int i9 = 1; i9 < abstractC10348Arr3.length; i9++) {
                        AbstractC10348 abstractC103414 = abstractC10348Arr3[i9];
                        m25054(abstractC103414, c19596);
                        m25053(abstractC103414.f28659, strArrM29531[i9 - 1], c19596);
                    }
                    c19596.mo14009(182, m25051(c9342.m21675()), c9342.m21673(), c12891.m29529(), false);
                    return;
                default:
                    return;
            }
            C13031 c13031 = (C13031) abstractC7666;
            C9342 c9343 = c13031.f36656;
            if (enumC3644 == EnumC3642.INVOKE_STATIC || enumC3644 == EnumC3642.INVOKE_NEW) {
                i = 0;
            } else {
                m25054(abstractC7666.f20109[0], c19596);
                i = 1;
            }
            int i10 = 0;
            while (true) {
                AbstractC10348[] abstractC10348Arr4 = abstractC7666.f20109;
                if (i >= abstractC10348Arr4.length) {
                    switch (C11550.f32208[enumC3644.ordinal()]) {
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
                    C12891 c12891M21676 = c9343.m21676();
                    if (c13031.f28658 == EnumC3642.INVOKE_NEW) {
                        c12891M21676 = new C12891("V", c12891M21676.m29530());
                    }
                    c19596.mo14009(i2, m25051(c9343.m21675()), c9343.m21673(), c12891M21676.m29529(), i2 == 185);
                    return;
                }
                AbstractC10348 abstractC103415 = abstractC10348Arr4[i];
                m25054(abstractC103415, c19596);
                m25053(abstractC103415.f28659, c9343.m21677()[i10], c19596);
                i++;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25052(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m25059(AbstractC10348[] abstractC10348Arr, String str) {
        str.getClass();
        int i = 0;
        switch (str) {
            case "B":
                byte[] bArr = new byte[abstractC10348Arr.length];
                int length = abstractC10348Arr.length;
                while (i < length) {
                    bArr[i] = ((Number) ((C13761) abstractC10348Arr[i]).f38899).byteValue();
                    i++;
                }
                return bArr;
            case "I":
                int length2 = abstractC10348Arr.length;
                int[] iArr = new int[length2];
                int length3 = abstractC10348Arr.length;
                while (i < length3) {
                    iArr[i] = ((Number) ((C13761) abstractC10348Arr[i]).f38899).intValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 * 4);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.asIntBuffer().put(iArr);
                return byteBufferAllocate.array();
            case "J":
                int length4 = abstractC10348Arr.length;
                long[] jArr = new long[length4];
                int length5 = abstractC10348Arr.length;
                while (i < length5) {
                    jArr[i] = ((Number) ((C13761) abstractC10348Arr[i]).f38899).longValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length4 * 8);
                byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate2.asLongBuffer().put(jArr);
                return byteBufferAllocate2.array();
            case "S":
                int length6 = abstractC10348Arr.length;
                short[] sArr = new short[length6];
                int length7 = abstractC10348Arr.length;
                while (i < length7) {
                    sArr[i] = ((Number) ((C13761) abstractC10348Arr[i]).f38899).shortValue();
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
