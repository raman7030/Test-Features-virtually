package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2571 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0985 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8566 f3684;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f3685;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22357 f3686;

    public C0985(C22357 c22357, InterfaceC8566 interfaceC8566) {
        InterfaceC19150 interfaceC19150Mo3570;
        this.f3686 = c22357;
        this.f3684 = interfaceC8566;
        HashSet hashSet = new HashSet();
        for (InterfaceC18444 interfaceC18444 : interfaceC8566.mo2696()) {
            if (interfaceC18444.getName().equals("<clinit>") && (interfaceC19150Mo3570 = interfaceC18444.mo3570()) != null) {
                for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                    switch (C5219.f16347[interfaceC22677.mo3975().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            InterfaceC18877 interfaceC18877 = (InterfaceC18877) ((InterfaceC1073) interfaceC22677).getReference();
                            try {
                                interfaceC18877.mo10018();
                                if (interfaceC18877.mo8192().equals(interfaceC8566.getType())) {
                                    hashSet.add(C14354.m34250(interfaceC18877));
                                }
                            } catch (C1237 unused) {
                            }
                            break;
                    }
                }
            }
        }
        this.f3685 = hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3450(C3438 c3438) throws IOException {
        int i;
        c3438.getClass();
        c3438.write(".class ", 0, 7);
        InterfaceC8566 interfaceC8566 = this.f3684;
        for (EnumC15657 enumC15657 : EnumC15657.m36860(interfaceC8566.mo2700())) {
            c3438.write(enumC15657.toString());
            c3438.write(32);
        }
        boolean z = interfaceC8566 instanceof C7980;
        if (z) {
            ((C7980) interfaceC8566).m21295(c3438);
        } else {
            c3438.write(interfaceC8566.getType());
        }
        int i2 = 10;
        c3438.write(10);
        if (z) {
            C7980 c7980 = (C7980) interfaceC8566;
            int iM21303 = c7980.m21303();
            if (iM21303 != -1) {
                c3438.write(".super ", 0, 7);
                c7980.f24648.m31386(c3438, iM21303);
                c3438.write(10);
            }
        } else {
            String strMo2695 = interfaceC8566.mo2695();
            if (strMo2695 != null) {
                c3438.write(".super ", 0, 7);
                c3438.write(strMo2695, 0, strMo2695.length());
                c3438.write(10);
            }
        }
        C22357 c22357 = this.f3686;
        if (c22357.f72440) {
            if (z) {
                C7980 c7981 = (C7980) interfaceC8566;
                int iM21298 = c7981.m21298();
                if (iM21298 != -1) {
                    c3438.write(".source \"", 0, 9);
                    c7981.f24648.m31406(iM21298, c3438, true);
                    c3438.write("\"\n", 0, 2);
                }
            } else {
                String strMo2694 = interfaceC8566.mo2694();
                if (strMo2694 != null) {
                    c3438.write(".source \"", 0, 9);
                    C14020.m33624(c3438, strMo2694);
                    c3438.write("\"\n", 0, 2);
                }
            }
        }
        if (z) {
            C7980 c7982 = (C7980) interfaceC8566;
            int[] iArrM21297 = c7982.m21297();
            if (iArrM21297 != null) {
                c3438.write(10);
                c3438.write("# interfaces\n", 0, 13);
                C12918 c12918 = c7982.f24648;
                for (int i3 : iArrM21297) {
                    c3438.write(".implements ", 0, 12);
                    c12918.m31386(c3438, i3);
                    c3438.write(10);
                }
            }
        } else {
            List<String> listMo2699 = interfaceC8566.mo2699();
            if (listMo2699.size() != 0) {
                c3438.write(10);
                c3438.write("# interfaces\n", 0, 13);
                for (String str : listMo2699) {
                    c3438.write(".implements ", 0, 12);
                    c3438.write(str);
                    c3438.write(10);
                }
            }
        }
        Set annotations = interfaceC8566.getAnnotations();
        if (annotations.size() != 0) {
            c3438.write("\n\n", 0, 2);
            c3438.write("# annotations\n", 0, 14);
            C18625.m43182(c3438, annotations);
        }
        Iterable<InterfaceC3627> iterableM21301 = z ? ((C7980) interfaceC8566).m21301(false) : interfaceC8566.mo2697();
        boolean z2 = c22357.f72443;
        if (z2) {
            iterableM21301 = Arrays.asList((InterfaceC3627[]) C8882.m22953(iterableM21301, InterfaceC3627.class));
            Iterator it = iterableM21301.iterator();
            int i4 = 0;
            i = -1;
            while (it.hasNext()) {
                InterfaceC10410 interfaceC10410Mo11109 = ((InterfaceC3627) it.next()).mo11109();
                if (interfaceC10410Mo11109 != null && !C6385.m17701(interfaceC10410Mo11109)) {
                    i = i4;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = false;
        int i5 = 0;
        for (InterfaceC3627 interfaceC3627 : iterableM21301) {
            if (!z3) {
                c3438.write("\n\n", 0, 2);
                c3438.write("# static fields", 0, 15);
                z3 = true;
            }
            c3438.write(i2);
            HashSet hashSet = this.f3685;
            C13684.m32931(c22357, c3438, interfaceC3627, (!z2 || i5 <= i) ? interfaceC3627.mo11109() : null, !hashSet.isEmpty() && hashSet.remove(C14354.m34250(interfaceC3627)));
            i5++;
            i2 = 10;
        }
        boolean z4 = false;
        for (InterfaceC3627 interfaceC3628 : z ? ((C7980) interfaceC8566).m21302(false) : interfaceC8566.mo2698()) {
            if (!z4) {
                c3438.write("\n\n", 0, 2);
                c3438.write("# instance fields", 0, 17);
                z4 = true;
            }
            c3438.write(10);
            C13684.m32931(c22357, c3438, interfaceC3628, interfaceC3628.mo11109(), false);
        }
        boolean z5 = false;
        for (InterfaceC18444 interfaceC18444 : z ? ((C7980) interfaceC8566).m21300(false) : interfaceC8566.mo2696()) {
            if (!z5) {
                c3438.write("\n\n", 0, 2);
                c3438.write("# direct methods", 0, 16);
                z5 = true;
            }
            c3438.write(10);
            InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
            if (interfaceC19150Mo3570 == null || !interfaceC19150Mo3570.mo3817().iterator().hasNext()) {
                C1190.m4011(c3438, interfaceC18444, c22357);
            } else {
                C1190 c1190 = new C1190(c22357, interfaceC18444, interfaceC19150Mo3570);
                c1190.m4015(c3438);
                c1190.m4018();
            }
        }
        boolean z6 = false;
        for (InterfaceC18444 interfaceC18445 : z ? ((C7980) interfaceC8566).m21299(false) : interfaceC8566.mo2701()) {
            if (!z6) {
                c3438.write("\n\n", 0, 2);
                c3438.write("# virtual methods", 0, 17);
                z6 = true;
            }
            c3438.write(10);
            InterfaceC19150 interfaceC19150Mo3571 = interfaceC18445.mo3570();
            if (interfaceC19150Mo3571 == null || !interfaceC19150Mo3571.mo3817().iterator().hasNext()) {
                C1190.m4011(c3438, interfaceC18445, c22357);
            } else {
                C1190 c1191 = new C1190(c22357, interfaceC18445, interfaceC19150Mo3571);
                c1191.m4015(c3438);
                c1191.m4018();
            }
        }
    }
}
