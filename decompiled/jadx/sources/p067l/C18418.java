package p067l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.C0795b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18418 extends C19839 {

    /* JADX INFO: renamed from: ֡ */
    public final C14080 f55005;

    /* JADX INFO: renamed from: ֨ */
    public C24387 f55006;

    /* JADX INFO: renamed from: ۖ */
    public final C23623 f55008;

    /* JADX INFO: renamed from: ۘ */
    public boolean f55009;

    /* JADX INFO: renamed from: ۜ */
    public boolean f55011;

    /* JADX INFO: renamed from: ۠ */
    public EnumC12720 f55012;

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC13035 f55013;

    /* JADX INFO: renamed from: ۧ */
    public C16852 f55015;

    /* JADX INFO: renamed from: ܳ */
    public boolean f55016;

    /* JADX INFO: renamed from: ܶ */
    public C8374 f55017;

    /* JADX INFO: renamed from: ܺ */
    public boolean f55018;

    /* JADX INFO: renamed from: ܿ */
    public boolean f55020;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55021;

    /* JADX INFO: renamed from: ᩴ */
    public final C8200 f55022;

    /* JADX INFO: renamed from: ᩵ */
    public final C13565 f55023;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f55024;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f55025;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f55026;

    /* JADX INFO: renamed from: ᩹ */
    public static final C6468 f55004 = new C6468();

    /* JADX INFO: renamed from: ᩶ */
    public static final String[] f55003 = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};

    /* JADX INFO: renamed from: ۢ */
    public C4848 f55014 = C4848.m10283();

    /* JADX INFO: renamed from: ܽ */
    public C16525 f55019 = new C16525(65520);

    /* JADX INFO: renamed from: ۚ */
    public C16525 f55010 = new C16525(131056);

    /* JADX INFO: renamed from: ֫ */
    public C14001 f55007 = new C14001(this);

    public C18418(C5127 c5127) {
        c5127.m10908(f55004, this);
        this.f55008 = C23623.m52439(c5127);
        this.f55022 = C8200.m18988(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f55023 = c13565M30871;
        this.f55006 = C24387.m53737(c5127);
        this.f55012 = EnumC12720.m29246(c5127);
        EnumC17840.m40515(c5127);
        this.f55017 = C8374.m19396(c5127);
        this.f55015 = C16852.m38215(c5127);
        this.f55013 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f55005 = C15065.m34431(c5127).f43039;
        this.f55025 = c13565M30871.m30880(EnumC2483.f3917);
        this.f55018 = c13565M30871.m30880(EnumC2483.f3967);
        this.f55021 = c13565M30871.m30879("debug.stackmap");
        EnumC2483 enumC2483 = EnumC2483.f3978;
        this.f55024 = c13565M30871.m30884(enumC2483) || c13565M30871.m30877(enumC2483, "source");
        String strM30872 = c13565M30871.m30872("debug.dumpmodifiers");
        if (strM30872 != null) {
            this.f55020 = strM30872.indexOf(99) != -1;
            this.f55016 = strM30872.indexOf(IShizukuService.Stub.TRANSACTION_attachUserService) != -1;
            this.f55026 = strM30872.indexOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) != -1;
            this.f55011 = strM30872.indexOf(109) != -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18418 m41935(C5127 c5127) {
        C18418 c18418 = (C18418) c5127.m10905(f55004);
        return c18418 == null ? new C18418(c5127) : c18418;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m41941(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j & 4095;
        int i = 0;
        while (j2 != 0) {
            if ((1 & j2) != 0) {
                sb.append(" ");
                sb.append(f55003[i]);
            }
            j2 >>= 1;
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41950(int i, int i2) {
        byte[] bArr = this.f55019.f48563;
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41956(AbstractC12224 abstractC12224) {
        int iM33698 = C14750.m33698(this.f55005.f39897, abstractC12224);
        C16525 c16525 = this.f55019;
        c16525.m37503(iM33698);
        c16525.m37504(0);
        return c16525.f48564;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41949(int i) {
        C16525 c16525 = this.f55019;
        int i2 = c16525.f48564 - i;
        byte[] bArr = c16525.f48563;
        bArr[i - 4] = (byte) ((i2 >> 24) & 255);
        bArr[i - 3] = (byte) ((i2 >> 16) & 255);
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41942() {
        C16525 c16525 = this.f55019;
        c16525.m37503(0);
        return c16525.f48564;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41955(long j) {
        if ((j & 131072) == 0) {
            return 0;
        }
        m41949(m41956(this.f55022.f21658));
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41947(AbstractC7783 abstractC7783, boolean z) {
        int iM41955 = !z ? m41955(abstractC7783.mo18003()) : 0;
        long jMo18003 = abstractC7783.mo18003();
        if ((2147487744L & jMo18003) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && (jMo18003 & 536870912) == 0) {
            AbstractC6462 abstractC6462 = abstractC7783.f20406;
            C8374 c8374 = this.f55017;
            boolean zM19490 = c8374.m19490(abstractC6462, abstractC7783.mo18010(c8374));
            C14080 c14080 = this.f55005;
            if (zM19490) {
                C5363 c5363 = c14080.f39896;
                c5363.getClass();
                for (C4848 c4848Mo14794 = abstractC7783.f20406.mo14794(); c4848Mo14794.m10293(); c4848Mo14794 = c4848Mo14794.f11035) {
                    if (((AbstractC6462) c4848Mo14794.f11034).m14777(EnumC11353.TYPEVAR)) {
                        int iM41956 = m41956(this.f55022.f21685);
                        this.f55019.m37503(c14080.m31955(abstractC7783));
                        m41949(iM41956);
                        iM41955++;
                        break;
                    }
                }
            } else {
                int iM41957 = m41956(this.f55022.f21685);
                this.f55019.m37503(c14080.m31955(abstractC7783));
                m41949(iM41957);
                iM41955++;
                break;
            }
        }
        return iM41955 + m41944(abstractC7783.mo17987()) + m41945(abstractC7783.mo18000(), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41936(C4848 c4848, EnumC24645 enumC24645) {
        int iM10289 = c4848.m10289();
        C16525 c16525 = this.f55019;
        c16525.m37500(iM10289);
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C13818 c13818 = (C13818) it.next();
            C20271 c20271 = new C20271();
            for (C17939 c17939 : c13818.mo17987()) {
                C8374 c8374 = this.f55017;
                c8374.getClass();
                if (c8374.m19468(c17939.f29256.f16705) == enumC24645) {
                    c20271.m45777(c17939);
                }
            }
            c16525.m37503(c20271.m45780());
            Iterator it2 = c20271.iterator();
            while (it2.hasNext()) {
                m41954((C17939) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41944(C4848 c4848) {
        int i = 0;
        if (c4848.isEmpty()) {
            return 0;
        }
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C17939 c17939 = (C17939) it.next();
            int[] iArr = C14671.f41879;
            C8374 c8374 = this.f55017;
            c8374.getClass();
            int i2 = iArr[c8374.m19468(c17939.f29256.f16705).ordinal()];
            if (i2 == 2) {
                c20272.m45777(c17939);
            } else if (i2 == 3) {
                c20271.m45777(c17939);
            }
        }
        int iM45780 = c20271.m45780();
        C16525 c16525 = this.f55019;
        C8200 c8200 = this.f55022;
        if (iM45780 != 0) {
            int iM41956 = m41956(c8200.f21763);
            c16525.m37503(c20271.m45780());
            Iterator it2 = c20271.iterator();
            while (it2.hasNext()) {
                m41954((C17939) it2.next());
            }
            m41949(iM41956);
            i = 1;
        }
        if (c20272.m45780() == 0) {
            return i;
        }
        int iM41957 = m41956(c8200.f21732);
        c16525.m37503(c20272.m45780());
        Iterator it3 = c20272.iterator();
        while (it3.hasNext()) {
            m41954((C17939) it3.next());
        }
        m41949(iM41957);
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41945(C4848 c4848, boolean z) {
        int i = 0;
        if (c4848.isEmpty()) {
            return 0;
        }
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C8552 c8552 = (C8552) it.next();
            if (c8552.m40799() && !c8552.m40801()) {
                this.f55008.m52447(EnumC22953.ERROR).println("ClassWriter: Position UNKNOWN in type annotation: " + c8552);
            } else if (c8552.f53587.f33002.m26202() == z) {
                C11827 c11827 = c8552.f53587;
                if (!c11827.f33002.m26202() || c11827.f33012) {
                    int[] iArr = C14671.f41879;
                    C8374 c8374 = this.f55017;
                    c8374.getClass();
                    int i2 = iArr[c8374.m19468(c8552.f29256.f16705).ordinal()];
                    if (i2 == 2) {
                        c20272.m45777(c8552);
                    } else if (i2 == 3) {
                        c20271.m45777(c8552);
                    }
                }
            }
        }
        int iM45780 = c20271.m45780();
        C16525 c16525 = this.f55019;
        C8200 c8200 = this.f55022;
        if (iM45780 != 0) {
            int iM41956 = m41956(c8200.f21748);
            c16525.m37503(c20271.m45780());
            Iterator it2 = c20271.iterator();
            while (it2.hasNext()) {
                m41953((C8552) it2.next());
            }
            m41949(iM41956);
            i = 1;
        }
        if (c20272.m45780() == 0) {
            return i;
        }
        int iM41957 = m41956(c8200.f21712);
        c16525.m37503(c20272.m45780());
        Iterator it3 = c20272.iterator();
        while (it3.hasNext()) {
            m41953((C8552) it3.next());
        }
        m41949(iM41957);
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41954(C17939 c17939) {
        AbstractC6462 abstractC6462 = c17939.f29256;
        C14080 c14080 = this.f55005;
        int iM31953 = c14080.m31953(abstractC6462);
        C16525 c16525 = this.f55019;
        c16525.m37503(iM31953);
        C4848<C24293> c4848 = c17939.f53589;
        c16525.m37503(c4848.m10289());
        for (C24293 c24293 : c4848) {
            c16525.m37503(C14750.m33698(c14080.f39897, ((C5771) c24293.f76952).f20408));
            ((AbstractC10564) c24293.f76953).mo7611(this.f55007);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41953(C8552 c8552) {
        C11827 c11827 = c8552.f53587;
        EnumC11275 enumC11275 = c11827.f33002;
        int i = c11827.f33005;
        int i2 = c11827.f33003;
        int iM26203 = enumC11275.m26203();
        C16525 c16525 = this.f55019;
        c16525.m37500(iM26203);
        switch (C14671.f41881[c11827.f33002.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c16525.m37503(c11827.f33013);
                break;
            case 5:
            case 6:
                c16525.m37503(c11827.f33004.length);
                int i3 = 0;
                while (true) {
                    int[] iArr = c11827.f33004;
                    if (i3 < iArr.length) {
                        c16525.m37503(iArr[i3]);
                        c16525.m37503(c11827.f33014[i3]);
                        c16525.m37503(c11827.f33008[i3]);
                        i3++;
                    }
                    break;
                }
                break;
            case 7:
                c16525.m37503(c11827.m27121());
                break;
            case 8:
            case 21:
            case 22:
                break;
            case 9:
            case 10:
                c16525.m37500(i);
                break;
            case 11:
            case 12:
                c16525.m37500(i);
                c16525.m37500(c11827.f33001);
                break;
            case 13:
                c16525.m37503(i2);
                break;
            case 14:
                c16525.m37503(i2);
                break;
            case 15:
                c16525.m37500(i);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                c16525.m37503(c11827.f33013);
                c16525.m37500(i2);
                break;
            case 23:
                throw new AssertionError("jvm.ClassWriter: UNKNOWN target type should never occur!");
            default:
                throw new AssertionError("jvm.ClassWriter: Unknown target type for position: " + c11827);
        }
        c16525.m37500(c11827.f33011.m10289());
        C4848<C14508> c4848 = c11827.f33011;
        C20271 c20271 = new C20271();
        for (C14508 c14508 : c4848) {
            c20271.m45777(Integer.valueOf(c14508.f41422.f39105));
            c20271.m45777(Integer.valueOf(c14508.f41421));
        }
        Iterator it = c20271.m45783().iterator();
        while (it.hasNext()) {
            c16525.m37500((byte) ((Integer) it.next()).intValue());
        }
        m41954((C17939) c8552);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41938(final C18418 c18418, C15828 c15828, Set set) {
        C16525 c16525 = c18418.f55019;
        C14080 c14080 = c18418.f55005;
        c14080.getClass();
        c16525.m37503(c14080.m31949(c15828.f20406));
        c16525.m37503(set.size());
        C21230.forEach(set, new Consumer() { // from class: l.ۗۜ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C18418 c18419 = this.f12430;
                C16525 c16526 = c18419.f55019;
                C14080 c14081 = c18419.f55005;
                c14081.getClass();
                c16526.m37503(c14081.m31949(((C15828) obj).f20406));
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41957() {
        int iM31949;
        int iM41956 = m41956(this.f55022.f21642);
        C14080 c14080 = this.f55005;
        int size = c14080.f39893.size();
        C16525 c16525 = this.f55019;
        c16525.m37503(size);
        for (C15828 c15828 : c14080.f39893) {
            c15828.m35945(this.f55017);
            char cM41943 = (char) m41943(c15828.f20409);
            if ((cM41943 & 512) != 0) {
                cM41943 = (char) (cM41943 | 1024);
            }
            char c = (char) (cM41943 & (-2049));
            if (this.f55026) {
                PrintWriter printWriterM52447 = this.f55008.m52447(EnumC22953.ERROR);
                printWriterM52447.println("INNERCLASS  " + ((Object) c15828.f20408));
                printWriterM52447.println("---" + m41941((long) c));
            }
            c14080.getClass();
            c16525.m37503(c14080.m31949(c15828.f20406));
            int iM33698 = 0;
            if (c15828.f20407.f20405 != EnumC3600.f7354 || c15828.f20408.isEmpty()) {
                iM31949 = 0;
            } else {
                C15828 c15829 = (C15828) c15828.f20407;
                c14080.getClass();
                iM31949 = c14080.m31949(c15829.f20406);
            }
            c16525.m37503(iM31949);
            if (!c15828.f20408.isEmpty()) {
                iM33698 = C14750.m33698(c14080.f39897, c15828.f20408);
            }
            c16525.m37503(iM33698);
            c16525.m37503(c);
        }
        m41949(iM41956);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41937(AbstractC7783 abstractC7783, C20271 c20271) {
        if (abstractC7783.f20405 != EnumC3600.f7354) {
            return;
        }
        C15828 c15828 = (C15828) abstractC7783;
        if (c15828.f20407.f20405 != EnumC3600.f7351) {
            c20271.m45777(c15828);
        }
        c15828.mo18020();
        if (c15828.f45850 != null) {
            AbstractC15689 abstractC15689Mo17983 = abstractC7783.mo17983();
            abstractC15689Mo17983.getClass();
            Iterator it = abstractC15689Mo17983.mo22455((Predicate) null, EnumC3620.RECURSIVE).iterator();
            while (it.hasNext()) {
                m41937((AbstractC7783) it.next(), c20271);
            }
        }
        C4848 c4848 = c15828.f45857;
        if (c4848 != null) {
            Iterator it2 = c4848.iterator();
            while (it2.hasNext()) {
                m41937((AbstractC7783) it2.next(), c20271);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41952(AbstractC6462 abstractC6462) {
        boolean z = this.f55021;
        C16525 c16525 = this.f55019;
        if (abstractC6462 == null) {
            if (z) {
                System.out.print(C0795b.f3347f);
            }
            c16525.m37500(0);
            return;
        }
        switch (C14671.f41883[abstractC6462.mo5577().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                if (z) {
                    System.out.print(ClassTransform.INTEGER);
                }
                c16525.m37500(1);
                return;
            case 5:
                if (z) {
                    System.out.print(ClassTransform.LONG);
                }
                c16525.m37500(4);
                return;
            case 6:
                if (z) {
                    System.out.print(ClassTransform.FLOAT);
                }
                c16525.m37500(2);
                return;
            case 7:
                if (z) {
                    System.out.print(ClassTransform.DOUBLE);
                }
                c16525.m37500(3);
                return;
            case 9:
                if (z) {
                    System.out.print("null");
                }
                c16525.m37500(5);
                return;
            case 10:
            case 11:
            case 12:
                C8374 c8374 = this.f55017;
                if (z) {
                    System.out.print("object(" + c8374.m19459(abstractC6462).f16705 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c16525.m37500(7);
                c16525.m37503(this.f55005.m31949(c8374.m19459(abstractC6462)));
                return;
            case 13:
                if (z) {
                    System.out.print("uninit_this");
                }
                c16525.m37500(6);
                return;
            case 14:
                int i = ((C18083) abstractC6462).f53992;
                c16525.m37500(8);
                if (z) {
                    System.out.print("uninit_object@" + i);
                }
                c16525.m37503(i);
                return;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41951(OutputStream outputStream, C15828 c15828) throws IOException {
        int i;
        int iM31949;
        C15828 c15829;
        int i2;
        int i3;
        EnumC12720 enumC12720;
        int i4;
        int i5;
        int i6;
        C5771 c5771;
        C14750 c14750;
        C23623 c23623;
        C8200 c8200;
        int i7;
        C8374 c8374;
        C8374 c8375;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        C5771 c5772;
        int i10;
        int i11;
        C5771 c5773;
        EnumC21102 enumC21102;
        C8200 c8201;
        C5771 c5774;
        String str;
        C16852 c16852;
        C13134 c13134;
        int i12;
        int i13;
        C23623 c23624;
        String str2;
        int i14;
        c15828.mo18020();
        C1446.m31704((c15828.f20409 & 16777216) == 0);
        C16525 c16525 = this.f55019;
        c16525.f48564 = 0;
        C16525 c16526 = this.f55010;
        c16526.f48564 = 0;
        AbstractC6462 abstractC6462 = c15828.f20406;
        C8374 c8376 = this.f55017;
        AbstractC6462 abstractC6462M19502 = c8376.m19502(abstractC6462);
        C4848 c4848M19450 = c8376.m19450(c15828.f20406);
        C4848 c4848Mo14802 = c15828.f20406.mo14802();
        EnumC3600 enumC3600 = c15828.f20407.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7340;
        if (enumC3600 == enumC3601) {
            i = 32768;
        } else {
            c15828.mo18020();
            int iM41943 = m41943(c15828.f20409 & (-8796093022209L));
            if ((iM41943 & 4) != 0) {
                iM41943 |= 1;
            }
            int i15 = iM41943 & 30225;
            i = (iM41943 & 512) == 0 ? i15 | 32 : i15;
        }
        boolean z3 = this.f55020;
        String str3 = "---";
        C23623 c23625 = this.f55008;
        if (z3) {
            PrintWriter printWriterM52447 = c23625.m52447(EnumC22953.ERROR);
            printWriterM52447.println();
            printWriterM52447.println("CLASSFILE  " + ((Object) c15828.f45855));
            printWriterM52447.println("---" + m41941((long) i));
        }
        c16525.m37503(i);
        AbstractC7783 abstractC7783 = c15828.f20407;
        EnumC3600 enumC3602 = abstractC7783.f20405;
        C8200 c8202 = this.f55022;
        C14080 c14080 = this.f55005;
        if (enumC3602 == enumC3601) {
            C15828 c158210 = new C15828(0L, c8202.f21701, ((C2417) abstractC7783).f3694);
            c14080.getClass();
            c16525.m37503(c14080.m31949(c158210.f20406));
        } else {
            c14080.getClass();
            c16525.m37503(c14080.m31949(c15828.f20406));
        }
        if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
            C15828 c158211 = (C15828) abstractC6462M19502.f16705;
            c14080.getClass();
            iM31949 = c14080.m31949(c158211.f20406);
        } else {
            iM31949 = 0;
        }
        c16525.m37503(iM31949);
        c16525.m37503(c4848M19450.m10289());
        for (C4848 c4848 = c4848M19450; c4848.m10293(); c4848 = c4848.f11035) {
            C15828 c158212 = (C15828) ((AbstractC6462) c4848.f11034).f16705;
            c14080.getClass();
            c16525.m37503(c14080.m31949(c158212.f20406));
        }
        c15828.mo18020();
        int i16 = 0;
        int i17 = 0;
        for (AbstractC7783 abstractC7784 : c15828.f45850.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            int i18 = C14671.f41880[abstractC7784.f20405.ordinal()];
            C4848 c4849 = c4848M19450;
            if (i18 == 1) {
                i16++;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    C1446.m31698();
                    throw null;
                }
                c14080.m31952((C15828) abstractC7784);
            } else if ((abstractC7784.mo18003() & 137438953472L) == 0) {
                i17++;
            }
            c4848M19450 = c4849;
        }
        C4848 c48410 = c4848M19450;
        C4848 c48411 = c15828.f45857;
        if (c48411 != null) {
            Iterator it = c48411.iterator();
            while (it.hasNext()) {
                c14080.m31952((C15828) it.next());
            }
        }
        c16525.m37503(i16);
        c15828.mo18020();
        AbstractC15689 abstractC15689 = c15828.f45850;
        C4848 c4848M10283 = C4848.m10283();
        for (AbstractC7783 abstractC7785 : abstractC15689.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7785.f20405 == EnumC3600.f7339) {
                c4848M10283 = c4848M10283.m10290((C13818) abstractC7785);
            }
        }
        while (c4848M10283.m10293()) {
            C13818 c13818 = (C13818) c4848M10283.f11034;
            c16525.m37503(m41943(c13818.f20409));
            if (this.f55016) {
                c23624 = c23625;
                PrintWriter printWriterM52448 = c23624.m52447(EnumC22953.ERROR);
                printWriterM52448.println("FIELD  " + ((Object) c13818.f20408));
                str2 = str3;
                printWriterM52448.println(str2 + m41941(c13818.f20409));
            } else {
                c23624 = c23625;
                str2 = str3;
            }
            c16525.m37503(C14750.m33698(c14080.f39897, c13818.f20408));
            c16525.m37503(c14080.m31950((AbstractC7783) c13818));
            int iM41942 = m41942();
            if (c13818.m31487() != null) {
                int iM41956 = m41956(c8202.f21650);
                c16525.m37503(c14080.m31948(c13818.m31487()));
                m41949(iM41956);
                i14 = 1;
            } else {
                i14 = 0;
            }
            m41950(iM41942, i14 + m41947((AbstractC7783) c13818, false) + m41946(c13818));
            c4848M10283 = c4848M10283.f11035;
            c16526 = c16526;
            abstractC6462M19502 = abstractC6462M19502;
            c23625 = c23624;
            str3 = str2;
        }
        C23623 c23626 = c23625;
        String str4 = str3;
        C16525 c16527 = c16526;
        AbstractC6462 abstractC6463 = abstractC6462M19502;
        c16525.m37503(i17);
        c15828.mo18020();
        AbstractC15689 abstractC156810 = c15828.f45850;
        C4848 c4848M10284 = C4848.m10283();
        for (AbstractC7783 abstractC7786 : abstractC156810.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7786.f20405 == EnumC3600.f7343 && (abstractC7786.mo18003() & 137438953472L) == 0) {
                c4848M10284 = c4848M10284.m10290((C5771) abstractC7786);
            }
        }
        while (true) {
            boolean zM10293 = c4848M10284.m10293();
            boolean z4 = this.f55018;
            EnumC12720 enumC12721 = this.f55012;
            if (!zM10293) {
                C8200 c8203 = c8202;
                C5771 c5771Mo12940 = null;
                int iM41944 = m41942();
                boolean z5 = (c4848Mo14802.m10289() == 0 && abstractC6463.mo14798().m10289() == 0) ? false : true;
                for (C4848 c48412 = c48410; !z5 && c48412.m10293(); c48412 = c48412.f11035) {
                    z5 = ((AbstractC6462) c48412.f11034).mo14798().m10289() != 0;
                }
                if (z5) {
                    int iM41957 = m41956(c8203.f21685);
                    c15829 = c15828;
                    c16525.m37503(c14080.m31955(c15829));
                    m41949(iM41957);
                    i2 = 1;
                } else {
                    c15829 = c15828;
                    i2 = 0;
                }
                if (c15829.f45858 != null && this.f55024) {
                    int iM41958 = m41956(c8203.f21720);
                    InterfaceC19740 interfaceC19740 = c15829.f45858;
                    int i19 = AbstractC14215.f40494;
                    String schemeSpecificPart = interfaceC19740.toUri().getSchemeSpecificPart();
                    c16525.m37503(C14750.m33698(c14080.f39897, c8203.f21738.m32717(schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1))));
                    m41949(iM41958);
                    i2++;
                }
                if (z4) {
                    AbstractC12224 abstractC12224 = c8203.f21651;
                    AbstractC14235 abstractC14235 = c8203.f21738;
                    int iM41959 = m41956(abstractC12224);
                    try {
                        c16525.m37503(C14750.m33698(c14080.f39897, abstractC14235.m32717(Long.toString(c15829.f45858.mo22779()))));
                        m41949(iM41959);
                        int iM419510 = m41956(c8203.f21719);
                        c16525.m37503(C14750.m33698(c14080.f39897, abstractC14235.m32717(Long.toString(System.currentTimeMillis()))));
                        m41949(iM419510);
                        i2 += 2;
                    } catch (SecurityException e) {
                        throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
                    }
                }
                c15828.mo18020();
                int iM41945 = m41944(c15828.mo17987()) + i2 + m41955(c15829.f20409) + m41945(c15828.mo18000(), false);
                AbstractC12224 abstractC12225 = c8203.f21735;
                EnumC3600 enumC3603 = c15829.f20407.f20405;
                EnumC3600 enumC3604 = EnumC3600.f7343;
                if (enumC3603 == enumC3604 || c15829.f20408 == c8203.f21725) {
                    int iM419511 = m41956(abstractC12225);
                    C15828 c15828M17990 = c15829.f20407.m17990();
                    AbstractC7783 abstractC7787 = c15829.f20407;
                    if (abstractC7787.f20406 != null && abstractC7787.f20405 == enumC3604) {
                        c5771Mo12940 = ((C5771) abstractC7787).mo12940();
                    }
                    c14080.getClass();
                    c16525.m37503(c14080.m31949(c15828M17990.f20406));
                    c16525.m37503(c5771Mo12940 == null ? 0 : c14080.m31954(c5771Mo12940));
                    m41949(iM419511);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int iM41955 = iM41945 + i3;
                AbstractC7783 abstractC7788 = c15829.f20407;
                if (abstractC7788.f20405 == EnumC3600.f7340) {
                    C2417 c2417 = (C2417) abstractC7788;
                    int iM419512 = m41956(c8203.f21702);
                    C14750 c14751 = c14080.f39897;
                    c16525.m37503(C14750.m33698(c14751, c2417));
                    c16525.m37503(EnumC19853.m45101(c2417.f3692));
                    AbstractC12224 abstractC12226 = c2417.f3688;
                    c16525.m37503(abstractC12226 != null ? C14750.m33698(c14751, abstractC12226) : 0);
                    C20271<C11648> c20271 = new C20271();
                    for (C11648 c11648 : c2417.f3705) {
                        if (!c11648.f32493.contains(EnumC10977.EXTRA)) {
                            c20271.m45777(c11648);
                        }
                    }
                    c16525.m37503(c20271.size());
                    for (C11648 c11649 : c20271) {
                        c16525.m37503(C14750.m33698(c14751, c11649.f32494));
                        c16525.m37503(EnumC10977.m25331(c11649.f32493));
                        AbstractC12224 abstractC12227 = c11649.f32494.f3688;
                        c16525.m37503(abstractC12227 != null ? C14750.m33698(c14751, abstractC12227) : 0);
                    }
                    C4848<C19023> c48413 = c2417.f3697;
                    c16525.m37503(c48413.m10289());
                    for (C19023 c19023 : c48413) {
                        C9794 c9794 = c19023.f56714;
                        C4848 c48414 = c19023.f56713;
                        c16525.m37503(C14750.m33698(c14751, c9794));
                        c16525.m37503(EnumC16340.m37139(c19023.f56712));
                        if (c48414 == null) {
                            c16525.m37503(0);
                        } else {
                            c16525.m37503(c48414.m10289());
                            Iterator it2 = c48414.iterator();
                            while (it2.hasNext()) {
                                c16525.m37503(C14750.m33698(c14751, (C2417) it2.next()));
                            }
                        }
                    }
                    C4848<C25058> c48415 = c2417.f3695;
                    c16525.m37503(c48415.m10289());
                    for (C25058 c25058 : c48415) {
                        C9794 c9795 = c25058.f79951;
                        C4848 c48416 = c25058.f79950;
                        c16525.m37503(C14750.m33698(c14751, c9795));
                        c16525.m37503(EnumC8965.m20703(c25058.f79949));
                        if (c48416 == null) {
                            c16525.m37503(0);
                        } else {
                            c16525.m37503(c48416.m10289());
                            Iterator it3 = c48416.iterator();
                            while (it3.hasNext()) {
                                c16525.m37503(C14750.m33698(c14751, (C2417) it3.next()));
                            }
                        }
                    }
                    C4848 c48417 = c2417.f3693;
                    c16525.m37503(c48417.m10289());
                    Iterator it4 = c48417.iterator();
                    while (it4.hasNext()) {
                        c16525.m37503(c14080.m31949(((C17681) it4.next()).f52813.f20406));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C22377 c22377 : c2417.f3701) {
                        ((Set) C15525.computeIfAbsent(linkedHashMap, c22377.f70596, new C20298(4))).addAll(c22377.f70595);
                    }
                    c16525.m37503(linkedHashMap.size());
                    C15525.forEach(linkedHashMap, new BiConsumer() { // from class: l.ۙۜ۠
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            C18418.m41938(this.f17085, (C15828) obj, (Set) obj2);
                        }

                        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return C19355.$default$andThen(this, biConsumer);
                        }
                    });
                    m41949(iM419512);
                    iM41955 = iM41955 + 1 + m41955(c15829.f20407.mo18003() & (-131073));
                }
                int iM41946 = iM41955 + m41946((AbstractC7783) c15829);
                c16527.m37504(-889275714);
                C24387 c24387 = this.f55006;
                if (c24387.m53743() && c24387.m53744(c15829.f45858)) {
                    c16527.m37503(65535);
                    enumC12720 = enumC12721;
                } else {
                    enumC12720 = enumC12721;
                    c16527.m37503(enumC12720.f35735);
                }
                c16527.m37503(enumC12720.f35734);
                if (c15829.f20407.f20405 != EnumC3600.f7340 && enumC12720.m29254()) {
                    C20271 c20272 = new C20271();
                    m41937(c15829, c20272);
                    LinkedHashSet<C15828> linkedHashSet = new LinkedHashSet(c20272);
                    if (c15829.f20407.f20405 != EnumC3600.f7351 || linkedHashSet.isEmpty()) {
                        i5 = 0;
                    } else {
                        int iM419513 = m41956(c8203.f21699);
                        c16525.m37503(linkedHashSet.size());
                        for (C15828 c158213 : linkedHashSet) {
                            c14080.getClass();
                            c16525.m37503(c14080.m31949(c158213.f20406));
                        }
                        m41949(iM419513);
                        i5 = 1;
                    }
                    int i20 = iM41946 + i5;
                    if (c15829.f20407.f20405 != EnumC3600.f7351) {
                        int iM419514 = m41956(c8203.f21670);
                        C15828 c15828Mo3350 = c15828.mo3350();
                        c14080.getClass();
                        c16525.m37503(c14080.m31949(c15828Mo3350.f20406));
                        m41949(iM419514);
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    iM41946 = i20 + i6;
                }
                if (c15828.m35942()) {
                    int iM419515 = m41956(c8203.f21724);
                    c15828.mo17983();
                    c16525.m37503(c15828.m35943().m10289());
                    for (AbstractC7783 abstractC7789 : c15828.m35943()) {
                        c16525.m37503(C14750.m33698(c14080.f39897, abstractC7789.f20408));
                        c16525.m37503(c14080.m31950(abstractC7789));
                        m41950(m41942(), m41947(abstractC7789, true));
                    }
                    i4 = 1;
                    m41949(iM419515);
                    iM41946++;
                } else {
                    i4 = 1;
                }
                if (enumC12720.m29257()) {
                    if (c15829.f45853.m10293()) {
                        int iM419516 = m41956(c8203.f21677);
                        c16525.m37503(c15829.f45853.m10289());
                        Iterator it5 = c15829.f45853.iterator();
                        while (it5.hasNext()) {
                            C15828 c158214 = (C15828) ((AbstractC7783) it5.next());
                            c14080.getClass();
                            c16525.m37503(c14080.m31949(c158214.f20406));
                        }
                        m41949(iM419516);
                    } else {
                        i4 = 0;
                    }
                    iM41946 += i4;
                }
                LinkedHashMap linkedHashMap2 = c14080.f39892;
                C14750 c14752 = c14080.f39897;
                LinkedHashSet linkedHashSet2 = c14080.f39893;
                if (!linkedHashMap2.isEmpty()) {
                    int iM419517 = m41956(c8203.f21727);
                    c16525.m37503(c14080.f39892.size());
                    for (C20787 c20787 : c14080.f39892.keySet()) {
                        c16525.m37503(c14080.m31951(c20787.f65340));
                        InterfaceC10057[] interfaceC10057Arr = c20787.f65343;
                        c16525.m37503(interfaceC10057Arr.length);
                        for (InterfaceC10057 interfaceC10057 : interfaceC10057Arr) {
                            c16525.m37503(c14080.m31951(interfaceC10057));
                        }
                    }
                    m41949(iM419517);
                    iM41946++;
                }
                if (!linkedHashSet2.isEmpty()) {
                    m41957();
                    iM41946++;
                }
                m41950(iM41944, iM41946);
                outputStream.write(c16527.f48563, 0, c16527.f48564);
                if (c14752.f42047 != null) {
                    throw new C13055(c14752.f42047);
                }
                int i21 = c14752.f42044;
                if (i21 > 65535) {
                    throw new C11990();
                }
                outputStream.write(i21 >> 8);
                outputStream.write(i21);
                C16525 c16528 = c14752.f42049;
                outputStream.write(c16528.f48563, 0, c16528.f48564);
                linkedHashSet2.clear();
                c14080.f39892.clear();
                c14752.m33699();
                outputStream.write(c16525.f48563, 0, c16525.f48564);
                return;
            }
            C5771 c5775 = (C5771) c4848M10284.f11034;
            c16525.m37503(m41943(c5775.f20409));
            if (this.f55011) {
                PrintWriter printWriterM52449 = c23626.m52447(EnumC22953.ERROR);
                printWriterM52449.println("METHOD  " + ((Object) c5775.f20408));
                printWriterM52449.println(str4 + m41941(c5775.f20409));
            }
            AbstractC12224 abstractC12228 = c5775.f20408;
            C14750 c14753 = c14080.f39897;
            c16525.m37503(C14750.m33698(c14753, abstractC12228));
            c16525.m37503(c14080.m31950((AbstractC7783) c5775));
            int iM41947 = m41942();
            if (c5775.f14173 != null) {
                int iM419518 = m41956(c8202.f21684);
                C3666 c3666 = c5775.f14173;
                int i22 = c3666.f7741;
                EnumC21102 enumC21103 = c3666.f7738;
                C5771 c5776 = c3666.f7734;
                c16525.m37503(i22);
                c16525.m37503(c3666.f7733);
                c16525.m37504(c3666.f7759);
                c16525.m37501(0, c3666.f7759, c3666.f7757);
                c16525.m37503(c3666.f7749.m45780());
                C4848 c4848M45783 = c3666.f7749.m45783();
                while (c4848M45783.m10293()) {
                    int i23 = 0;
                    while (true) {
                        char[] cArr = (char[]) c4848M45783.f11034;
                        i13 = iM419518;
                        if (i23 < cArr.length) {
                            c16525.m37503(cArr[i23]);
                            i23++;
                            iM419518 = i13;
                        }
                    }
                    c4848M45783 = c4848M45783.f11035;
                    iM419518 = i13;
                }
                int i24 = iM419518;
                int iM41948 = m41942();
                if (c3666.f7739.m10293()) {
                    int iM419519 = m41956(c8202.f21715);
                    c16525.m37503(c3666.f7739.m10289());
                    C4848 c4848M10294 = c3666.f7739.m10294();
                    while (c4848M10294.m10293()) {
                        int i25 = 0;
                        C5771 c5777 = c5775;
                        while (true) {
                            char[] cArr2 = (char[]) c4848M10294.f11034;
                            i12 = iM41948;
                            if (i25 < cArr2.length) {
                                c16525.m37503(cArr2[i25]);
                                i25++;
                                iM41948 = i12;
                            }
                        }
                        c4848M10294 = c4848M10294.f11035;
                        c5775 = c5777;
                        iM41948 = i12;
                    }
                    c5772 = c5775;
                    i10 = iM41948;
                    m41949(iM419519);
                    i11 = 1;
                } else {
                    c5772 = c5775;
                    i10 = iM41948;
                    i11 = 0;
                }
                if (z4 && (c13134 = c3666.f7758) != null) {
                    int iM419520 = m41956(c8202.f21688);
                    m41950(m41942(), c13134.m30039(c16525, c3666.f7760, c23626));
                    m41949(iM419520);
                    i11++;
                }
                if (!c3666.f7736 || c3666.f7744 <= 0) {
                    c5773 = c5776;
                    enumC21102 = enumC21103;
                    c23623 = c23626;
                    c8201 = c8202;
                } else {
                    int iM419521 = m41956(c8202.f21751);
                    int size = c3666.f7744;
                    for (int i26 = 0; i26 < c3666.f7744; i26++) {
                        size += c3666.f7753[i26].f53004.size() - 1;
                    }
                    c16525.m37503(size);
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = c3666.f7744;
                        c16852 = this.f55015;
                        if (i27 >= i29) {
                            break;
                        }
                        C17747 c17747 = c3666.f7753[i27];
                        C23623 c23627 = c23626;
                        List list = c17747.f53004;
                        EnumC21102 enumC21104 = enumC21103;
                        C13818 c13819 = c17747.f53006;
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = it6;
                            C11043 c11043 = (C11043) it6.next();
                            C5771 c5778 = c5776;
                            char c = c11043.f30588;
                            C8200 c8204 = c8202;
                            C1446.m31704(c >= 0 && c <= c3666.f7759);
                            c16525.m37503(c);
                            char c2 = c11043.f30587;
                            C1446.m31704(c2 > 0 && c + c2 <= c3666.f7759);
                            c16525.m37503(c11043.f30587);
                            c16525.m37503(C14750.m33698(c14753, c13819.f20408));
                            c16525.m37503(c14080.m31950((AbstractC7783) c13819));
                            c16525.m37503(c17747.f53005);
                            AbstractC6462 abstractC6464 = c13819.f20406;
                            if (!c8376.m19490(abstractC6464, c8376.m19459(abstractC6464))) {
                                c16852.getClass();
                                if (C16852.m38253(abstractC6464)) {
                                    i28++;
                                }
                            }
                            c5776 = c5778;
                            it6 = it7;
                            c8202 = c8204;
                        }
                        i27++;
                        c23626 = c23627;
                        enumC21103 = enumC21104;
                    }
                    c5773 = c5776;
                    enumC21102 = enumC21103;
                    c23623 = c23626;
                    c8201 = c8202;
                    m41949(iM419521);
                    int i30 = i11 + 1;
                    if (i28 > 0) {
                        C8200 c8205 = c8201;
                        int iM419522 = m41956(c8205.f21755);
                        c16525.m37503(i28);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < c3666.f7744) {
                            C17747 c17748 = c3666.f7753[i31];
                            C13818 c138110 = c17748.f53006;
                            AbstractC6462 abstractC6465 = c138110.f20406;
                            C8200 c8206 = c8205;
                            if (!c8376.m19490(abstractC6465, c8376.m19459(abstractC6465))) {
                                c16852.getClass();
                                if (C16852.m38253(abstractC6465)) {
                                    for (Iterator it8 = c17748.f53004.iterator(); it8.hasNext(); it8 = it8) {
                                        C11043 c11044 = (C11043) it8.next();
                                        c16525.m37503(c11044.f30588);
                                        c16525.m37503(c11044.f30587);
                                        c16525.m37503(C14750.m33698(c14753, c138110.f20408));
                                        c16525.m37503(c14080.m31955(c138110));
                                        c16525.m37503(c17748.f53005);
                                        i32++;
                                    }
                                }
                            }
                            i31++;
                            c8205 = c8206;
                        }
                        c8201 = c8205;
                        C1446.m31704(i32 == i28);
                        m41949(iM419522);
                        i11 += 2;
                    } else {
                        i11 = i30;
                    }
                }
                if (c3666.f7751 > 0) {
                    boolean z6 = this.f55021;
                    if (z6) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Stack map for ");
                        c5774 = c5773;
                        sb.append(c5774);
                        printStream.println(sb.toString());
                    } else {
                        c5774 = c5773;
                    }
                    EnumC21102 enumC21105 = enumC21102;
                    c8200 = c8201;
                    int iM419523 = m41956(enumC21105.mo14508(c8200));
                    int i33 = c3666.f7751;
                    if (z6) {
                        System.out.println(" nframes = " + i33);
                    }
                    c16525.m37503(i33);
                    int i34 = C14671.f41882[enumC21105.ordinal()];
                    String str5 = ":";
                    String str6 = EnumC2483.f3919;
                    if (i34 == 1) {
                        c14750 = c14753;
                        int i35 = 0;
                        while (i35 < i33) {
                            if (z6) {
                                System.out.print(str6 + i35 + str5);
                            }
                            C2995 c2995 = c3666.f7752[i35];
                            if (z6) {
                                System.out.print(" pc=" + c2995.f5327);
                            }
                            c16525.m37503(c2995.f5327);
                            int iM7029 = 0;
                            int i36 = 0;
                            while (true) {
                                AbstractC6462[] abstractC6462Arr = c2995.f5326;
                                str = str6;
                                if (iM7029 >= abstractC6462Arr.length) {
                                    break;
                                }
                                i36++;
                                iM7029 += C3666.m7029(abstractC6462Arr[iM7029]);
                                str6 = str;
                            }
                            if (z6) {
                                System.out.print(" nlocals=" + i36);
                            }
                            c16525.m37503(i36);
                            int iM70210 = 0;
                            while (iM70210 < c2995.f5326.length) {
                                if (z6) {
                                    System.out.print(" local[" + iM70210 + "]=");
                                }
                                m41952(c2995.f5326[iM70210]);
                                iM70210 += C3666.m7029(c2995.f5326[iM70210]);
                                c3666 = c3666;
                            }
                            C3666 c3667 = c3666;
                            int iM70211 = 0;
                            int i37 = 0;
                            while (true) {
                                AbstractC6462[] abstractC6462Arr2 = c2995.f5328;
                                if (iM70211 >= abstractC6462Arr2.length) {
                                    break;
                                }
                                i37++;
                                iM70211 += C3666.m7029(abstractC6462Arr2[iM70211]);
                            }
                            if (z6) {
                                System.out.print(" nstack=" + i37);
                            }
                            c16525.m37503(i37);
                            for (int iM70212 = 0; iM70212 < c2995.f5328.length; iM70212 += C3666.m7029(c2995.f5328[iM70212])) {
                                if (z6) {
                                    System.out.print(" stack[" + iM70212 + "]=");
                                }
                                m41952(c2995.f5328[iM70212]);
                            }
                            if (z6) {
                                System.out.println();
                            }
                            i35++;
                            i33 = i33;
                            str5 = str5;
                            str6 = str;
                            c3666 = c3667;
                        }
                    } else {
                        if (i34 != 2) {
                            throw new AssertionError("Unexpected stackmap format value");
                        }
                        C1446.m31706(c3666.f7752);
                        int i38 = 0;
                        while (i38 < i33) {
                            if (z6) {
                                System.out.print(EnumC2483.f3919 + i38 + ":");
                            }
                            c3666.f7748[i38].mo8938(this);
                            if (z6) {
                                System.out.println();
                            }
                            i38++;
                            c14753 = c14753;
                        }
                        c14750 = c14753;
                    }
                    m41949(iM419523);
                    i11++;
                } else {
                    c14750 = c14753;
                    c5774 = c5773;
                    c8200 = c8201;
                }
                m41950(i10, i11 + m41945(c5774.mo18000(), true));
                c5771 = c5772;
                c5771.f14173 = null;
                m41949(i24);
                i7 = 1;
            } else {
                c5771 = c5775;
                c14750 = c14753;
                c23623 = c23626;
                c8200 = c8202;
                i7 = 0;
            }
            C4848 c4848Mo14794 = c5771.mo18010(c8376).mo14794();
            if (c4848Mo14794.m10293()) {
                int iM419524 = m41956(c8200.f21638);
                c16525.m37503(c4848Mo14794.m10289());
                while (c4848Mo14794.m10293()) {
                    c16525.m37503(c14080.m31949((AbstractC6462) c4848Mo14794.f11034));
                    c4848Mo14794 = c4848Mo14794.f11035;
                }
                m41949(iM419524);
                i7++;
            }
            if (c5771.f14175 != null) {
                int iM419525 = m41956(c8200.f21723);
                c5771.f14175.mo7611(this.f55007);
                m41949(iM419525);
                i7++;
            }
            if (!enumC12721.m29252() || ((!this.f55023.m30880(EnumC2483.f3966) && (!c5771.m17994() || (c5771.f20409 & 2305843009213693952L) == 0)) || (c5771.f20409 & 562949953421312L) == 562949953421312L)) {
                c8374 = c8376;
            } else {
                int iM10289 = c5771.m18015(c8376).mo14809().f35030.m10289();
                if (c5771.f14172 == null || iM10289 == 0) {
                    c8374 = c8376;
                    i9 = 0;
                } else {
                    int iM419526 = m41956(c8200.f21705);
                    c16525.m37500(iM10289);
                    for (C13818 c138111 : c5771.f14174) {
                        int i39 = (36880 & ((int) c138111.f20409)) | (((int) c5771.f20409) & 4096);
                        c16525.m37503(C14750.m33698(c14750, c138111.f20408));
                        c16525.m37503(i39);
                    }
                    C14750 c14754 = c14750;
                    for (C13818 c138112 : c5771.f14172) {
                        int i40 = (36880 & ((int) c138112.f20409)) | (((int) c5771.f20409) & 4096);
                        c16525.m37503(C14750.m33698(c14754, c138112.f20408));
                        c16525.m37503(i40);
                    }
                    int i41 = 36880;
                    for (C13818 c138113 : c5771.f14171) {
                        int i42 = (((int) c5771.f20409) & 4096) | (((int) c138113.f20409) & i41);
                        c16525.m37503(C14750.m33698(c14754, c138113.f20408));
                        c16525.m37503(i42);
                        c8376 = c8376;
                        i41 = 36880;
                    }
                    c8374 = c8376;
                    m41949(iM419526);
                    i9 = 1;
                }
                i7 += i9;
            }
            int iM41949 = i7 + m41947((AbstractC7783) c5771, false);
            if ((c5771.f20409 & 562949953421312L) == 562949953421312L) {
                c8375 = c8374;
            } else {
                C4848 c48418 = c5771.f14172;
                if (c48418 != null) {
                    Iterator it9 = c48418.iterator();
                    z = false;
                    z2 = false;
                    while (it9.hasNext()) {
                        Iterator it10 = ((C13818) it9.next()).mo17987().iterator();
                        while (it10.hasNext()) {
                            C8374 c8377 = c8374;
                            int i43 = C14671.f41879[c8377.m19468(((C17939) it10.next()).f29256.f16705).ordinal()];
                            if (i43 == 2) {
                                z2 = true;
                            } else if (i43 == 3) {
                                z = true;
                            }
                            c8374 = c8377;
                        }
                    }
                    c8375 = c8374;
                } else {
                    c8375 = c8374;
                    z = false;
                    z2 = false;
                }
                if (z) {
                    int iM419527 = m41956(c8200.f21674);
                    m41936(c48418, EnumC24645.RUNTIME);
                    m41949(iM419527);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (z2) {
                    int iM419528 = m41956(c8200.f21728);
                    m41936(c48418, EnumC24645.CLASS);
                    m41949(iM419528);
                    i8++;
                }
                iM41949 += i8;
            }
            m41950(iM41947, iM41949 + m41946(c5771));
            c8376 = c8375;
            str4 = str4;
            c4848Mo14802 = c4848Mo14802;
            c23626 = c23623;
            c8202 = c8200;
            c4848M10284 = c4848M10284.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 m41948(C15828 c15828) throws IOException {
        InterfaceC4317 interfaceC4317Mo4112;
        C23623 c23623 = this.f55008;
        EnumC3600 enumC3600 = c15828.f20407.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7340;
        String string = (enumC3600 == enumC3601 ? c15828.f20408 : c15828.f45859).toString();
        boolean z = this.f55009;
        InterfaceC13035 interfaceC13035 = this.f55013;
        if (z) {
            AbstractC7783 abstractC7783 = c15828.f20407;
            interfaceC4317Mo4112 = interfaceC13035.mo4112(EnumC22423.CLASS_OUTPUT, (abstractC7783.f20405 == enumC3601 ? (C2417) abstractC7783 : c15828.m18008().f27063).f20408.toString());
        } else {
            interfaceC4317Mo4112 = EnumC22423.CLASS_OUTPUT;
        }
        InterfaceC19740 interfaceC19740Mo4106 = interfaceC13035.mo4106(interfaceC4317Mo4112, string, EnumC18398.CLASS, c15828.f45858);
        OutputStream outputStreamMo22778 = interfaceC19740Mo4106.mo22778();
        try {
            try {
                m41951(outputStreamMo22778, c15828);
                if (this.f55025) {
                    c23623.m52463("wrote.file", interfaceC19740Mo4106.getName());
                }
                outputStreamMo22778.close();
                return interfaceC19740Mo4106;
            } catch (C17761 e) {
                AbstractC6462 abstractC6462M40339 = e.m40339();
                C13370 c13370 = C13665.f38450;
                c23623.m9355(C8300.m19122(c15828, new C13370("compiler", "illegal.signature", c15828, abstractC6462M40339)));
                if (outputStreamMo22778 == null) {
                    return interfaceC19740Mo4106;
                }
                outputStreamMo22778.close();
                interfaceC19740Mo4106.delete();
                return null;
            }
        } catch (Throwable th) {
            if (outputStreamMo22778 != null) {
                outputStreamMo22778.close();
                interfaceC19740Mo4106.delete();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41946(AbstractC7783 abstractC7783) {
        Iterator it = this.f55014.iterator();
        int iApplyAsInt = 0;
        while (it.hasNext()) {
            iApplyAsInt += ((ToIntFunction) it.next()).applyAsInt(abstractC7783);
        }
        return iApplyAsInt;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41943(long j) {
        int i = (int) j;
        if (this.f55012.m29255()) {
            i &= -2049;
        }
        if ((2147483648L & j) != 0) {
            i |= 64;
        }
        if ((17179869184L & j) != 0) {
            i |= 128;
        }
        return (j & 8796093022208L) != 0 ? i & (-1025) : i;
    }
}
