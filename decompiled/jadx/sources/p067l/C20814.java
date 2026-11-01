package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8WA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20814 {
    /* JADX INFO: renamed from: ֫ */
    public static void m47019(boolean z, List list, InterfaceC24235 interfaceC24235) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2812 interfaceC2812 = (InterfaceC2812) it.next();
            int iMo17389 = interfaceC2812.mo17389(z);
            int iMo17394 = interfaceC2812.mo17394(z);
            if (iMo17389 != iMo17394 || iMo17389 != interfaceC24235.length()) {
                int iLastIndexOf = interfaceC24235.lastIndexOf('\n', 0, iMo17389) + 1;
                if (iLastIndexOf != iMo17389) {
                    interfaceC2812.mo17392(iLastIndexOf, z);
                    m47020(z, interfaceC2812, iMo17389 - iLastIndexOf);
                }
                if (interfaceC2812.mo4446(z) != interfaceC2812.mo4450(z)) {
                    int iIndexOf = interfaceC24235.indexOf('\n', iMo17394 - 1, interfaceC24235.length());
                    iLastIndexOf = iIndexOf == -1 ? interfaceC24235.length() : iIndexOf + 1;
                }
                if (iMo17394 != iLastIndexOf) {
                    interfaceC2812.mo17399(iLastIndexOf, z);
                }
            }
        }
        Iterator it2 = list.iterator();
        InterfaceC2812 interfaceC2813 = null;
        while (it2.hasNext()) {
            InterfaceC2812 interfaceC2814 = (InterfaceC2812) it2.next();
            if (interfaceC2813 != null && interfaceC2813.mo17394(z) >= interfaceC2814.mo17389(z)) {
                int i = 0;
                while (i < 2) {
                    boolean z2 = i == 0;
                    int iMo173810 = interfaceC2813.mo17389(z2);
                    int iMo173811 = interfaceC2814.mo17389(z2);
                    if (iMo173810 < iMo173811) {
                        interfaceC2814.mo17392(iMo173810, z2);
                        m47020(z2, interfaceC2814, iMo173811 - iMo173810);
                    }
                    int iMo17395 = interfaceC2813.mo17394(z2);
                    int iMo17396 = interfaceC2814.mo17394(z2);
                    if (iMo17395 < iMo17396) {
                        interfaceC2813.mo17399(iMo17396, z2);
                    }
                    int iMo4450 = interfaceC2813.mo4450(z2);
                    int iMo4451 = interfaceC2814.mo4450(z2);
                    if (iMo4450 < iMo4451) {
                        interfaceC2813.mo4441(iMo4451, z2);
                    }
                    i++;
                }
                List listMo4447 = interfaceC2813.mo4447();
                List listMo4448 = interfaceC2814.mo4447();
                if (listMo4448 != null) {
                    if (listMo4447 == null) {
                        listMo4447 = new ArrayList();
                    }
                    listMo4447.addAll(listMo4448);
                }
                interfaceC2813.mo4442(listMo4447);
                it2.remove();
            } else {
                interfaceC2813 = interfaceC2814;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47020(boolean z, InterfaceC2812 interfaceC2812, int i) {
        List<InterfaceC20248> listMo4447 = interfaceC2812.mo4447();
        if (listMo4447 != null) {
            for (InterfaceC20248 interfaceC20248 : listMo4447) {
                if (z) {
                    interfaceC20248.mo17397(interfaceC20248.mo17398() + i);
                    interfaceC20248.mo17395(interfaceC20248.mo17388() + i);
                } else {
                    interfaceC20248.mo17393(interfaceC20248.mo17396() + i);
                    interfaceC20248.mo17391(interfaceC20248.mo17400() + i);
                }
            }
        }
    }
}
