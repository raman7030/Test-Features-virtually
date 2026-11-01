package p067l;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.umeng.analytics.pro.C0698cb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes.dex */
public final class C17932 {

    /* JADX INFO: renamed from: ۫֫۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82256;

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f53559;

    /* JADX INFO: renamed from: ֫ */
    public long f53560;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashSet f53561;

    /* JADX INFO: renamed from: ܳ */
    public int f53562;

    /* JADX INFO: renamed from: ܽ */
    public int f53563;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f53564;

    /* JADX INFO: renamed from: ᩳ */
    public int f53565;

    /* JADX INFO: renamed from: ֫ */
    public native void m40787();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:359:0x064d A[PHI: r28
      0x064d: PHI (r28v8 java.util.Iterator) = (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v10 java.util.Iterator) binds: [B:353:0x0631, B:355:0x0637, B:357:0x063f, B:350:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x082d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C17932(String str, int i) {
        String str2;
        ArrayList arrayList;
        int i2;
        byte b;
        String str3;
        LinkedHashSet linkedHashSet;
        HashMap map;
        C17932 c17932;
        String str4;
        String str5;
        String str6;
        C9255 c9255;
        Iterator it;
        String strM40785;
        C9255 c9256;
        Iterator it2;
        String strM40786;
        C9255 c9257;
        C9255 c9258;
        C9255 c9259;
        String str7;
        String str8;
        byte b2;
        String strSubstring;
        int i3;
        this.f53562 = -1;
        C3851 c3851 = new C3851(this);
        try {
            AbstractC6767 abstractC6767ListIterator = AbstractC22507.m50467(str).mo50469().listIterator(0);
            int i4 = i;
            boolean z = false;
            while (true) {
                String str9 = ".end";
                String str10 = "return";
                String str11 = "if-nez";
                String str12 = "if-ltz";
                String str13 = "if-lez";
                String str14 = "if-gtz";
                String str15 = "if-gez";
                String str16 = "if-eqz";
                String str17 = "return-wide";
                String str18 = ".end sparse-switch";
                if (!abstractC6767ListIterator.hasNext()) {
                    Object obj = "if-gtz";
                    String str19 = ".end packed-switch";
                    c3851.m7564();
                    ArrayList<C9255> arrayList2 = c3851.f8290;
                    String str20 = "goto";
                    C17932 c17933 = this;
                    c17933.f53564 = arrayList2;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    c17933.f53561 = linkedHashSet2;
                    String str21 = ":";
                    HashMap map2 = new HashMap();
                    for (C9255 c92510 : arrayList2) {
                        String str22 = str19;
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        for (Iterator it3 = c92510.f25120.iterator(); it3.hasNext(); it3 = it3) {
                            map2.put((String) it3.next(), c92510);
                        }
                        linkedHashSet2 = linkedHashSet3;
                        str19 = str22;
                    }
                    String str23 = str19;
                    LinkedHashSet linkedHashSet4 = linkedHashSet2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    C9255 c92511 = null;
                    while (i5 < size) {
                        HashMap map3 = map2;
                        C9255 c92512 = (C9255) arrayList2.get(i5);
                        List list = c92512.f25116;
                        String str24 = ((C13279) C9179.m21131(1, list)).f37283;
                        int iIndexOf = str24.indexOf(32);
                        ArrayList arrayList3 = arrayList2;
                        String strSubstring2 = iIndexOf == -1 ? str24 : str24.substring(0, iIndexOf);
                        strSubstring2.getClass();
                        switch (strSubstring2.hashCode()) {
                            case -1532365807:
                                if (strSubstring2.equals("return-void")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1532341936:
                                if (strSubstring2.equals("return-wide")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193266018:
                                if (strSubstring2.equals("if-eqz")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193264468:
                                if (strSubstring2.equals("if-gez")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193264003:
                                if (strSubstring2.equals(obj)) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193259663:
                                if (strSubstring2.equals(str13)) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193259198:
                                if (strSubstring2.equals(str12)) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193257741:
                                if (strSubstring2.equals(str11)) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -934396624:
                                if (strSubstring2.equals(str10)) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1470957:
                                if (strSubstring2.equals(str9)) {
                                    b = 9;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 3178851:
                                if (strSubstring2.equals(str20)) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054876:
                                if (strSubstring2.equals("if-eq")) {
                                    b = 11;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054926:
                                if (strSubstring2.equals("if-ge")) {
                                    b = 12;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054941:
                                if (strSubstring2.equals("if-gt")) {
                                    b = C0698cb.f2569k;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring2.equals("if-le")) {
                                    b = C0698cb.f2570l;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055096:
                                if (strSubstring2.equals("if-lt")) {
                                    b = 15;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055143:
                                if (strSubstring2.equals("if-ne")) {
                                    b = 16;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 110339814:
                                if (strSubstring2.equals("throw")) {
                                    b = 17;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 211916369:
                                if (strSubstring2.equals("goto/16")) {
                                    b = 18;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 211916427:
                                if (strSubstring2.equals("goto/32")) {
                                    b = 19;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 302833181:
                                if (strSubstring2.equals("throw-verification-error")) {
                                    b = 20;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 357866108:
                                if (strSubstring2.equals("return-object")) {
                                    b = 21;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 489643561:
                                if (strSubstring2.equals("packed-switch")) {
                                    b = 22;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 750443003:
                                if (strSubstring2.equals("return-void-barrier")) {
                                    b = 23;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1677267841:
                                if (strSubstring2.equals("sparse-switch")) {
                                    b = 24;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2018064103:
                                if (strSubstring2.equals("return-void-no-barrier")) {
                                    b = 25;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 8:
                            case 17:
                            case 20:
                            case 21:
                            case 23:
                            case 25:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c17932 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                if (c92511 == null) {
                                    c9255 = new C9255(c17932, arrayList2.size(), new ArrayList(0));
                                    arrayList2.add(c9255);
                                } else {
                                    c9255 = c92511;
                                }
                                linkedHashSet.add(new C7914(c17932, c92512, c9255, 5));
                                c92511 = c9255;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c17932 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i6 = i5 + 1;
                                C9255 c92513 = i6 < size ? (C9255) arrayList2.get(i6) : null;
                                if (c92513 != null) {
                                    linkedHashSet.add(new C7914(c17932, c92512, c92513, 0));
                                }
                                C9255 c92514 = (C9255) map.get(m40785(str24));
                                if (c92514 != null) {
                                    linkedHashSet.add(new C7914(c17932, c92512, c92514, 1));
                                }
                                break;
                            case 9:
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                arrayList2 = arrayList3;
                                c17932 = this;
                                obj = obj;
                                str4 = str12;
                                String str25 = str23;
                                str9 = str9;
                                map = map3;
                                str11 = str11;
                                if (str24.startsWith(str25)) {
                                    Iterator it4 = list.iterator();
                                    boolean z2 = true;
                                    while (it4.hasNext()) {
                                        String str26 = str25;
                                        String str27 = ((C13279) it4.next()).f37283;
                                        if (z2) {
                                            it2 = it4;
                                            if (str27.startsWith(".packed-switch ")) {
                                                z2 = false;
                                            }
                                        } else {
                                            it2 = it4;
                                            String str28 = str21;
                                            if (!str27.startsWith(str28) || (strM40786 = m40785(str27)) == null || (c9257 = (C9255) map.get(strM40786)) == null) {
                                                str21 = str28;
                                            } else {
                                                str21 = str28;
                                                linkedHashSet.add(new C7914(c17932, c92512, c9257, 2));
                                            }
                                        }
                                        it4 = it2;
                                        str25 = str26;
                                        str13 = str13;
                                    }
                                    str5 = str25;
                                    str3 = str13;
                                    str6 = str21;
                                } else {
                                    str5 = str25;
                                    str3 = str13;
                                    String str29 = str21;
                                    String str30 = str18;
                                    if (str24.startsWith(str30)) {
                                        Iterator it5 = list.iterator();
                                        boolean z3 = true;
                                        while (it5.hasNext()) {
                                            String str31 = str30;
                                            String str32 = ((C13279) it5.next()).f37283;
                                            if (z3) {
                                                it = it5;
                                                if (str32.startsWith(".sparse-switch")) {
                                                    z3 = false;
                                                }
                                            } else {
                                                it = it5;
                                                if (str32.contains("->") && (strM40785 = m40785(str32)) != null && (c9256 = (C9255) map.get(strM40785)) != null) {
                                                    linkedHashSet.add(new C7914(c17932, c92512, c9256, 2));
                                                }
                                            }
                                            it5 = it;
                                            str30 = str31;
                                            str29 = str29;
                                        }
                                        str18 = str30;
                                        str6 = str29;
                                    } else {
                                        str18 = str30;
                                        str6 = str29;
                                        int i7 = i5 + 1;
                                        C9255 c92515 = i7 < size ? (C9255) arrayList2.get(i7) : null;
                                        if (c92515 != null) {
                                            linkedHashSet.add(new C7914(c17932, c92512, c92515, 0));
                                        }
                                    }
                                }
                                break;
                            case 10:
                            case 18:
                            case 19:
                                str9 = str9;
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c17932 = this;
                                obj = obj;
                                str4 = str12;
                                str11 = str11;
                                C9255 c92516 = (C9255) map.get(m40785(str24));
                                if (c92516 != null) {
                                    linkedHashSet.add(new C7914(c17932, c92512, c92516, 4));
                                }
                                str3 = str13;
                                str5 = str23;
                                str6 = str21;
                                break;
                            case 22:
                            case 24:
                                int i8 = i5 + 1;
                                if (i8 < size) {
                                    arrayList2 = arrayList3;
                                    c9258 = (C9255) arrayList2.get(i8);
                                } else {
                                    arrayList2 = arrayList3;
                                    c9258 = null;
                                }
                                if (c9258 != null) {
                                    c17932 = this;
                                    c9259 = c92512;
                                    C7914 c7914 = new C7914(c17932, c9259, c9258, 0);
                                    linkedHashSet = linkedHashSet4;
                                    linkedHashSet.add(c7914);
                                } else {
                                    linkedHashSet = linkedHashSet4;
                                    c17932 = this;
                                    c9259 = c92512;
                                }
                                map = map3;
                                C9255 c92517 = (C9255) map.get(m40785(str24));
                                if (c92517 != null) {
                                    str4 = str12;
                                    linkedHashSet.add(new C7914(c17932, c9259, c92517, 1));
                                } else {
                                    str4 = str12;
                                }
                                str3 = str13;
                                str5 = str23;
                                str6 = str21;
                                break;
                            default:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c17932 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i9 = i5 + 1;
                                C9255 c92518 = i9 < size ? (C9255) arrayList2.get(i9) : null;
                                if (c92518 != null) {
                                    linkedHashSet.add(new C7914(c17932, c92512, c92518, 0));
                                }
                                break;
                        }
                        i5++;
                        map2 = map;
                        str12 = str4;
                        str21 = str6;
                        str11 = str11;
                        str23 = str5;
                        str9 = str9;
                        obj = obj;
                        str13 = str3;
                        linkedHashSet4 = linkedHashSet;
                        c17933 = c17932;
                        str10 = str10;
                    }
                    C17932 c17934 = c17933;
                    LinkedHashSet<C7914> linkedHashSet5 = c17934.f53561;
                    ArrayList arrayList4 = c17934.f53564;
                    int size2 = arrayList4.size();
                    C12569[] c12569Arr = new C12569[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        c12569Arr[i10] = new C12569((C9255) arrayList4.get(i10));
                    }
                    for (C7914 c7915 : linkedHashSet5) {
                        c12569Arr[c7915.f20743.f25111].f35319.add(c7915);
                        c12569Arr[c7915.f20739.f25111].f35318.add(c7915);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size2) {
                        C12569 c12569 = c12569Arr[i11];
                        boolean z4 = c12569.f35317;
                        ArrayList arrayList6 = c12569.f35319;
                        ArrayList arrayList7 = c12569.f35318;
                        C9255 c92519 = c12569.f35316;
                        if (z4) {
                            str2 = str20;
                            arrayList = arrayList4;
                            i2 = size2;
                        } else {
                            List list2 = c92519.f25116;
                            if (!list2.isEmpty() && c92519.f25120.isEmpty() && list2.size() <= 3 && ((C13279) list2.get(0)).f37283.startsWith(str20) && arrayList7.size() == 1 && arrayList6.size() == 1) {
                                C7914 c7916 = (C7914) arrayList7.get(0);
                                C7914 c7917 = (C7914) arrayList6.get(0);
                                if (c7916.f20741 == 0 && c7917.f20741 == 0) {
                                    C9255 c92520 = c7916.f20743;
                                    C9255 c92521 = c7917.f20739;
                                    C13279 c13279M21304 = c92520.m21304();
                                    ArrayList arrayList8 = c92520.f25119;
                                    str2 = str20;
                                    List list3 = c92520.f25116;
                                    i2 = size2;
                                    C13279 c13279 = (C13279) list2.get(0);
                                    int i12 = c13279M21304.f37284;
                                    arrayList = arrayList4;
                                    int i13 = i12 + 2;
                                    int i14 = c13279.f37284;
                                    if (i13 == i14) {
                                        list3.add(new C13279(i12 + 1, ""));
                                        arrayList8.add(null);
                                    } else if (i13 != i14) {
                                    }
                                    c12569Arr[c92520.f25111].f35317 = true;
                                    c12569Arr[c92521.f25111].f35317 = true;
                                    list3.addAll(list2);
                                    arrayList8.addAll(c92519.f25119);
                                    linkedHashSet5.remove(c7916);
                                    linkedHashSet5.remove(c7917);
                                    linkedHashSet5.add(new C7914(c17934, c92520, c92521, 0));
                                    arrayList5.add(c92519);
                                } else {
                                    str2 = str20;
                                    arrayList = arrayList4;
                                    i2 = size2;
                                }
                            } else {
                                str2 = str20;
                                arrayList = arrayList4;
                                i2 = size2;
                            }
                        }
                        i11++;
                        size2 = i2;
                        str20 = str2;
                        arrayList4 = arrayList;
                    }
                    ArrayList arrayList9 = arrayList4;
                    if (!arrayList5.isEmpty()) {
                        arrayList9.removeAll(arrayList5);
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            ((C9255) arrayList9.get(i15)).f25111 = i15;
                        }
                        ArrayList arrayList10 = new ArrayList(linkedHashSet5);
                        linkedHashSet5.clear();
                        linkedHashSet5.addAll(arrayList10);
                    }
                    ArrayList<C13949> arrayList11 = c3851.f8292;
                    ArrayList<C9255> arrayList12 = c17934.f53564;
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    HashMap map4 = new HashMap();
                    for (C9255 c92522 : arrayList12) {
                        Iterator it6 = c92522.f25120.iterator();
                        while (it6.hasNext()) {
                            map4.put((String) it6.next(), c92522);
                        }
                    }
                    for (C13949 c13949 : arrayList11) {
                        C9255 c92523 = (C9255) map4.get(c13949.f39345);
                        C9255 c92524 = (C9255) map4.get(c13949.f39344);
                        C9255 c92525 = (C9255) map4.get(c13949.f39342);
                        if (c92523 != null && c92524 != null && c92525 != null) {
                            c92525.m21303(c13949.f39343);
                            for (int i16 = c92523.f25111; i16 < c92524.f25111; i16++) {
                                c17934.f53561.add(new C7914(c17934, (C9255) arrayList12.get(i16), c92525, 3));
                            }
                        }
                    }
                    return;
                }
                int i17 = i4 + 1;
                String strTrim = ((String) abstractC6767ListIterator.next()).trim();
                AbstractC6767 abstractC6767 = abstractC6767ListIterator;
                if (strTrim.startsWith(".registers ") || strTrim.startsWith(".locals ") || strTrim.startsWith(".param ") || strTrim.startsWith(".annotation ")) {
                    c3851.m7564();
                } else {
                    if (strTrim.startsWith(".end param") || strTrim.startsWith(".end annotation")) {
                        c3851.f8291.clear();
                    } else {
                        if (strTrim.startsWith(":") && z) {
                            ArrayList arrayList13 = new ArrayList();
                            while (true) {
                                if (c3851.f8291.isEmpty()) {
                                    str15 = str15;
                                    str7 = str16;
                                    str8 = str17;
                                } else {
                                    str8 = str17;
                                    C13279 c132710 = (C13279) C20013.m45383(c3851.f8291, 1);
                                    str7 = str16;
                                    int iIndexOf2 = c132710.f37283.indexOf(32);
                                    if (iIndexOf2 == -1) {
                                        strSubstring = c132710.f37283;
                                        i3 = 0;
                                    } else {
                                        strSubstring = c132710.f37283.substring(0, iIndexOf2);
                                        i3 = 0;
                                    }
                                    if (!strSubstring.matches("[a-z0-9\\-/]+")) {
                                        arrayList13.add(i3, c132710);
                                        C19925.m45229(c3851.f8291, 1);
                                        str17 = str8;
                                        str16 = str7;
                                        str15 = str15;
                                    }
                                }
                            }
                            c3851.m7564();
                            c3851.f8291 = arrayList13;
                            z = false;
                        } else {
                            str15 = "if-gez";
                            str7 = "if-eqz";
                            str8 = "return-wide";
                        }
                        if (strTrim.startsWith(".catch ") || strTrim.startsWith(".catchall ")) {
                            Matcher matcher = f53559.matcher(strTrim);
                            C13949 c139410 = matcher.find() ? new C13949(new C13279(i4, strTrim), matcher.group(1), matcher.group(2), matcher.group(3)) : null;
                            if (c139410 != null) {
                                c3851.f8292.add(c139410);
                            }
                        } else {
                            z = z;
                            str14 = "if-gtz";
                        }
                        c3851.f8291.add(new C13279(i4, strTrim));
                        int iIndexOf3 = strTrim.indexOf(32);
                        String strSubstring3 = iIndexOf3 == -1 ? strTrim : strTrim.substring(0, iIndexOf3);
                        z = strSubstring3.matches("[a-z0-9\\-/]+") ? true : z;
                        switch (strSubstring3.hashCode()) {
                            case -1532365807:
                                if (strSubstring3.equals("return-void")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1532341936:
                                if (strSubstring3.equals(str8)) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193266018:
                                if (strSubstring3.equals(str7)) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193264468:
                                if (strSubstring3.equals(str15)) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193264003:
                                if (strSubstring3.equals(str14)) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193259663:
                                if (strSubstring3.equals("if-lez")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193259198:
                                if (strSubstring3.equals("if-ltz")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193257741:
                                if (strSubstring3.equals("if-nez")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -934396624:
                                if (strSubstring3.equals("return")) {
                                    b2 = 8;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1470957:
                                if (strSubstring3.equals(".end")) {
                                    b2 = 9;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 3178851:
                                if (strSubstring3.equals("goto")) {
                                    b2 = 10;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054876:
                                if (strSubstring3.equals("if-eq")) {
                                    b2 = 11;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054926:
                                if (strSubstring3.equals("if-ge")) {
                                    b2 = 12;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054941:
                                if (strSubstring3.equals("if-gt")) {
                                    b2 = C0698cb.f2569k;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring3.equals("if-le")) {
                                    b2 = C0698cb.f2570l;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055096:
                                if (strSubstring3.equals("if-lt")) {
                                    b2 = 15;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055143:
                                if (strSubstring3.equals("if-ne")) {
                                    b2 = 16;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 110339814:
                                if (strSubstring3.equals("throw")) {
                                    b2 = 17;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 211916369:
                                if (strSubstring3.equals("goto/16")) {
                                    b2 = 18;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 211916427:
                                if (strSubstring3.equals("goto/32")) {
                                    b2 = 19;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 302833181:
                                if (strSubstring3.equals("throw-verification-error")) {
                                    b2 = 20;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 357866108:
                                if (strSubstring3.equals("return-object")) {
                                    b2 = 21;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 489643561:
                                if (strSubstring3.equals("packed-switch")) {
                                    b2 = 22;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 750443003:
                                if (strSubstring3.equals("return-void-barrier")) {
                                    b2 = 23;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1677267841:
                                if (strSubstring3.equals("sparse-switch")) {
                                    b2 = 24;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2018064103:
                                if (strSubstring3.equals("return-void-no-barrier")) {
                                    b2 = 25;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                c3851.m7564();
                                break;
                            case 9:
                                if (strTrim.startsWith(".end packed-switch") || strTrim.startsWith(str18)) {
                                    c3851.m7564();
                                }
                                break;
                            default:
                                continue;
                        }
                        z = false;
                    }
                    i4 = i17;
                    abstractC6767ListIterator = abstractC6767;
                }
                z = false;
                i4 = i17;
                abstractC6767ListIterator = abstractC6767;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40788() {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C11938.f33228 * 18.0f);
        Iterator it = this.f53564.iterator();
        while (it.hasNext()) {
            ((C9255) it.next()).m21301(paint);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40785(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return null;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        int iIndexOf3 = str.indexOf(35, i);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        if (iIndexOf3 == -1) {
            iIndexOf3 = str.length();
        }
        return str.substring(iIndexOf, Math.min(iIndexOf2, iIndexOf3));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9255 m40786(PointF pointF) {
        for (C9255 c9255 : this.f53564) {
            float fM21306 = c9255.m21306();
            float fM21308 = c9255.m21308() + fM21306;
            float fM21311 = c9255.m21311();
            float fM21298 = c9255.m21298() + fM21311;
            float f = pointF.x;
            if (fM21306 <= f && f <= fM21308) {
                float f2 = pointF.y;
                if (fM21311 <= f2 && f2 <= fM21298) {
                    return c9255;
                }
            }
        }
        return null;
    }

    static {
        ApplicationC14266.m56479(122);
        f82256 = new short[]{6452, 11161, -3135, 10745, -17128, -17105, -17105, -17102, -17105};
        f53559 = Pattern.compile("\\{\\s*(:[a-zA-Z0-9_$]+)\\s*\\.\\.\\s*(:[a-zA-Z0-9_$]+)\\s*\\}\\s*(:[a-zA-Z0-9_$]+)");
    }

    public C17932(C14677 c14677) {
        this.f53562 = -1;
        if (c14677.readInt() != 1986488099) {
            throw new RuntimeException();
        }
        this.f53565 = c14677.readInt();
        this.f53563 = c14677.readInt();
        this.f53562 = c14677.readInt();
        int i = c14677.readInt();
        this.f53564 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f53564.add(new C9255(this, c14677));
        }
        int i3 = c14677.readInt();
        this.f53561 = new LinkedHashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f53561.add(new C7914(this, c14677));
        }
    }
}
