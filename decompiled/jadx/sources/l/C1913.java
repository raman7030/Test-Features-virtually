package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C1913 extends C20964 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m6273(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C11233.m27803(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6270(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m6274(Object... objArr) {
        if (objArr.length > 0) {
            List listAsList = Arrays.asList(objArr);
            C11233.m27803(listAsList, "asList(...)");
            return listAsList;
        }
        return C8969.f27244;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6271(List list) {
        C11233.m27805(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6276(ArrayList arrayList, InterfaceC16233 interfaceC16233) {
        int iM6271;
        C11233.m27805(arrayList, "<this>");
        int iM6272 = m6271((List) arrayList);
        int i = 0;
        if (iM6272 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC16233.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM6272) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM6271 = m6271((List) arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM6271);
            if (iM6271 == i) {
                return;
            } else {
                iM6271--;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m6272(Collection collection, String str, String str2, String str3, InterfaceC16233 interfaceC16233, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC16233 = null;
        }
        C11233.m27805(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        C20964.m47783(collection, sb, str, str4, str5, "...", interfaceC16233);
        return sb.toString();
    }
}
