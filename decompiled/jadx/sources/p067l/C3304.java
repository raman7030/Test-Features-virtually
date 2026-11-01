package p067l;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2571 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3304 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10509 f6459;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f6460;

    /* JADX INFO: renamed from: ܽ */
    public final C23616 f6461;

    public C3304(C23616 c23616, InterfaceC10509 interfaceC10509) {
        InterfaceC20568 interfaceC20568Mo5857;
        this.f6461 = c23616;
        this.f6459 = interfaceC10509;
        HashSet hashSet = new HashSet();
        for (InterfaceC19897 interfaceC19897 : interfaceC10509.mo5035()) {
            if (interfaceC19897.getName().equals("<clinit>") && (interfaceC20568Mo5857 = interfaceC19897.mo5857()) != null) {
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    switch (C7328.f19187[interfaceC23920.mo6217().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            InterfaceC20309 interfaceC20309 = (InterfaceC20309) ((InterfaceC3388) interfaceC23920).getReference();
                            try {
                                interfaceC20309.mo12051();
                                if (interfaceC20309.mo10231().equals(interfaceC10509.getType())) {
                                    hashSet.add(C16010.m36383(interfaceC20309));
                                }
                            } catch (C3544 unused) {
                            }
                            break;
                    }
                }
            }
        }
        this.f6460 = hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5753(C5636 c5636) throws IOException {
        int i;
        c5636.getClass();
        c5636.write(".class ", 0, 7);
        InterfaceC10509 interfaceC10509 = this.f6459;
        for (EnumC17248 enumC17248 : EnumC17248.m39026(interfaceC10509.mo5039())) {
            c5636.write(enumC17248.toString());
            c5636.write(32);
        }
        boolean z = interfaceC10509 instanceof C9952;
        if (z) {
            ((C9952) interfaceC10509).m23261(c5636);
        } else {
            c5636.write(interfaceC10509.getType());
        }
        int i2 = 10;
        c5636.write(10);
        if (z) {
            C9952 c9952 = (C9952) interfaceC10509;
            int iM23269 = c9952.m23269();
            if (iM23269 != -1) {
                c5636.write(".super ", 0, 7);
                c9952.f27561.m33472(c5636, iM23269);
                c5636.write(10);
            }
        } else {
            String strMo5034 = interfaceC10509.mo5034();
            if (strMo5034 != null) {
                c5636.write(".super ", 0, 7);
                c5636.write(strMo5034, 0, strMo5034.length());
                c5636.write(10);
            }
        }
        C23616 c23616 = this.f6461;
        if (c23616.f75166) {
            if (z) {
                C9952 c9953 = (C9952) interfaceC10509;
                int iM23264 = c9953.m23264();
                if (iM23264 != -1) {
                    c5636.write(".source \"", 0, 9);
                    c9953.f27561.m33492(iM23264, c5636, true);
                    c5636.write("\"\n", 0, 2);
                }
            } else {
                String strMo5033 = interfaceC10509.mo5033();
                if (strMo5033 != null) {
                    c5636.write(".source \"", 0, 9);
                    C15693.m35744(c5636, strMo5033);
                    c5636.write("\"\n", 0, 2);
                }
            }
        }
        if (z) {
            C9952 c9954 = (C9952) interfaceC10509;
            int[] iArrM23263 = c9954.m23263();
            if (iArrM23263 != null) {
                c5636.write(10);
                c5636.write("# interfaces\n", 0, 13);
                C14645 c14645 = c9954.f27561;
                for (int i3 : iArrM23263) {
                    c5636.write(".implements ", 0, 12);
                    c14645.m33472(c5636, i3);
                    c5636.write(10);
                }
            }
        } else {
            List<String> listMo5038 = interfaceC10509.mo5038();
            if (listMo5038.size() != 0) {
                c5636.write(10);
                c5636.write("# interfaces\n", 0, 13);
                for (String str : listMo5038) {
                    c5636.write(".implements ", 0, 12);
                    c5636.write(str);
                    c5636.write(10);
                }
            }
        }
        Set annotations = interfaceC10509.getAnnotations();
        if (annotations.size() != 0) {
            c5636.write("\n\n", 0, 2);
            c5636.write("# annotations\n", 0, 14);
            C20069.m45448(c5636, annotations);
        }
        Iterable<InterfaceC5815> iterableM23267 = z ? ((C9952) interfaceC10509).m23267(false) : interfaceC10509.mo5036();
        boolean z2 = c23616.f75169;
        if (z2) {
            iterableM23267 = Arrays.asList((InterfaceC5815[]) C10810.m24924(iterableM23267, InterfaceC5815.class));
            Iterator it = iterableM23267.iterator();
            int i4 = 0;
            i = -1;
            while (it.hasNext()) {
                InterfaceC12262 interfaceC12262Mo13085 = ((InterfaceC5815) it.next()).mo13085();
                if (interfaceC12262Mo13085 != null && !C8437.m19648(interfaceC12262Mo13085)) {
                    i = i4;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = false;
        int i5 = 0;
        for (InterfaceC5815 interfaceC5815 : iterableM23267) {
            if (!z3) {
                c5636.write("\n\n", 0, 2);
                c5636.write("# static fields", 0, 15);
                z3 = true;
            }
            c5636.write(i2);
            HashSet hashSet = this.f6460;
            C15373.m35046(c23616, c5636, interfaceC5815, (!z2 || i5 <= i) ? interfaceC5815.mo13085() : null, !hashSet.isEmpty() && hashSet.remove(C16010.m36383(interfaceC5815)));
            i5++;
            i2 = 10;
        }
        boolean z4 = false;
        for (InterfaceC5815 interfaceC5816 : z ? ((C9952) interfaceC10509).m23268(false) : interfaceC10509.mo5037()) {
            if (!z4) {
                c5636.write("\n\n", 0, 2);
                c5636.write("# instance fields", 0, 17);
                z4 = true;
            }
            c5636.write(10);
            C15373.m35046(c23616, c5636, interfaceC5816, interfaceC5816.mo13085(), false);
        }
        boolean z5 = false;
        for (InterfaceC19897 interfaceC19897 : z ? ((C9952) interfaceC10509).m23266(false) : interfaceC10509.mo5035()) {
            if (!z5) {
                c5636.write("\n\n", 0, 2);
                c5636.write("# direct methods", 0, 16);
                z5 = true;
            }
            c5636.write(10);
            InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
            if (interfaceC20568Mo5857 == null || !interfaceC20568Mo5857.mo6074().iterator().hasNext()) {
                C3499.m6253(c5636, interfaceC19897, c23616);
            } else {
                C3499 c3499 = new C3499(c23616, interfaceC19897, interfaceC20568Mo5857);
                c3499.m6257(c5636);
                c3499.m6260();
            }
        }
        boolean z6 = false;
        for (InterfaceC19897 interfaceC19898 : z ? ((C9952) interfaceC10509).m23265(false) : interfaceC10509.mo5040()) {
            if (!z6) {
                c5636.write("\n\n", 0, 2);
                c5636.write("# virtual methods", 0, 17);
                z6 = true;
            }
            c5636.write(10);
            InterfaceC20568 interfaceC20568Mo5858 = interfaceC19898.mo5857();
            if (interfaceC20568Mo5858 == null || !interfaceC20568Mo5858.mo6074().iterator().hasNext()) {
                C3499.m6253(c5636, interfaceC19898, c23616);
            } else {
                C3499 c34910 = new C3499(c23616, interfaceC19898, interfaceC20568Mo5858);
                c34910.m6257(c5636);
                c34910.m6260();
            }
        }
    }
}
