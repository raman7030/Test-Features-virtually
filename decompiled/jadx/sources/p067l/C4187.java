package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C4187 extends C22293 {
    /* JADX INFO: renamed from: ֫ */
    public static List m8475(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C13045.m29865(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8472(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m8476(Object... objArr) {
        if (objArr.length > 0) {
            List listAsList = Arrays.asList(objArr);
            C13045.m29865(listAsList, "asList(...)");
            return listAsList;
        }
        return C10893.f30179;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8473(List list) {
        C13045.m29867(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8478(ArrayList arrayList, InterfaceC17797 interfaceC17797) {
        int iM8473;
        C13045.m29867(arrayList, "<this>");
        int iM8474 = m8473((List) arrayList);
        int i = 0;
        if (iM8474 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC17797.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM8474) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM8473 = m8473((List) arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM8473);
            if (iM8473 == i) {
                return;
            } else {
                iM8473--;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m8474(Collection collection, String str, String str2, String str3, InterfaceC17797 interfaceC17797, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC17797 = null;
        }
        C13045.m29867(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        C22293.m50113(collection, sb, str, str4, str5, "...", interfaceC17797);
        return sb.toString();
    }
}
