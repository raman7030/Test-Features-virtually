package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8WA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19408 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44725(boolean z, List list, InterfaceC23008 interfaceC23008) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            int iMo15478 = interfaceC0467.mo15478(z);
            int iMo15483 = interfaceC0467.mo15483(z);
            if (iMo15478 != iMo15483 || iMo15478 != interfaceC23008.length()) {
                int iLastIndexOf = interfaceC23008.lastIndexOf('\n', 0, iMo15478) + 1;
                if (iLastIndexOf != iMo15478) {
                    interfaceC0467.mo15481(iLastIndexOf, z);
                    m44726(z, interfaceC0467, iMo15478 - iLastIndexOf);
                }
                if (interfaceC0467.mo2066(z) != interfaceC0467.mo2070(z)) {
                    int iIndexOf = interfaceC23008.indexOf('\n', iMo15483 - 1, interfaceC23008.length());
                    iLastIndexOf = iIndexOf == -1 ? interfaceC23008.length() : iIndexOf + 1;
                }
                if (iMo15483 != iLastIndexOf) {
                    interfaceC0467.mo15488(iLastIndexOf, z);
                }
            }
        }
        Iterator it2 = list.iterator();
        InterfaceC0467 interfaceC0468 = null;
        while (it2.hasNext()) {
            InterfaceC0467 interfaceC0469 = (InterfaceC0467) it2.next();
            if (interfaceC0468 != null && interfaceC0468.mo15483(z) >= interfaceC0469.mo15478(z)) {
                int i = 0;
                while (i < 2) {
                    boolean z2 = i == 0;
                    int iMo15479 = interfaceC0468.mo15478(z2);
                    int iMo154710 = interfaceC0469.mo15478(z2);
                    if (iMo15479 < iMo154710) {
                        interfaceC0469.mo15481(iMo15479, z2);
                        m44726(z2, interfaceC0469, iMo154710 - iMo15479);
                    }
                    int iMo15484 = interfaceC0468.mo15483(z2);
                    int iMo15485 = interfaceC0469.mo15483(z2);
                    if (iMo15484 < iMo15485) {
                        interfaceC0468.mo15488(iMo15485, z2);
                    }
                    int iMo2070 = interfaceC0468.mo2070(z2);
                    int iMo2071 = interfaceC0469.mo2070(z2);
                    if (iMo2070 < iMo2071) {
                        interfaceC0468.mo2061(iMo2071, z2);
                    }
                    i++;
                }
                List listMo2067 = interfaceC0468.mo2067();
                List listMo2068 = interfaceC0469.mo2067();
                if (listMo2068 != null) {
                    if (listMo2067 == null) {
                        listMo2067 = new ArrayList();
                    }
                    listMo2067.addAll(listMo2068);
                }
                interfaceC0468.mo2062(listMo2067);
                it2.remove();
            } else {
                interfaceC0468 = interfaceC0469;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44726(boolean z, InterfaceC0467 interfaceC0467, int i) {
        List<InterfaceC18813> listMo2067 = interfaceC0467.mo2067();
        if (listMo2067 != null) {
            for (InterfaceC18813 interfaceC18813 : listMo2067) {
                if (z) {
                    interfaceC18813.mo15486(interfaceC18813.mo15487() + i);
                    interfaceC18813.mo15484(interfaceC18813.mo15477() + i);
                } else {
                    interfaceC18813.mo15482(interfaceC18813.mo15485() + i);
                    interfaceC18813.mo15480(interfaceC18813.mo15489() + i);
                }
            }
        }
    }
}
