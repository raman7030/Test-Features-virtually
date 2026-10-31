package l;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.umeng.analytics.pro.cb;
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
public final class C16376 {

    /* JADX INFO: renamed from: ۫֫۠, reason: not valid java name and contains not printable characters */
    private static final short[] f50387;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f50388;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f50389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f50390;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50393;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f50394;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m38570();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:359:0x064d A[PHI: r28
      0x064d: PHI (r28v8 java.util.Iterator) = (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v10 java.util.Iterator) binds: [B:353:0x0631, B:355:0x0637, B:357:0x063f, B:350:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x082d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C16376(String str, int i) {
        String str2;
        ArrayList arrayList;
        int i2;
        byte b;
        String str3;
        LinkedHashSet linkedHashSet;
        HashMap map;
        C16376 c16376;
        String str4;
        String str5;
        String str6;
        C7246 c7246;
        Iterator it;
        String strM38568;
        C7246 c7247;
        Iterator it2;
        String strM38569;
        C7246 c7248;
        C7246 c7249;
        C7246 c72410;
        String str7;
        String str8;
        byte b2;
        String strSubstring;
        int i3;
        this.f50391 = -1;
        C1560 c1560 = new C1560(this);
        try {
            AbstractC4628 abstractC4628ListIterator = AbstractC21189.m48137(str).mo48139().listIterator(0);
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
                if (!abstractC4628ListIterator.hasNext()) {
                    Object obj = "if-gtz";
                    String str19 = ".end packed-switch";
                    c1560.m5335();
                    ArrayList<C7246> arrayList2 = c1560.f5510;
                    String str20 = "goto";
                    C16376 c16377 = this;
                    c16377.f50393 = arrayList2;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    c16377.f50390 = linkedHashSet2;
                    String str21 = ":";
                    HashMap map2 = new HashMap();
                    for (C7246 c72411 : arrayList2) {
                        String str22 = str19;
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        for (Iterator it3 = c72411.f22238.iterator(); it3.hasNext(); it3 = it3) {
                            map2.put((String) it3.next(), c72411);
                        }
                        linkedHashSet2 = linkedHashSet3;
                        str19 = str22;
                    }
                    String str23 = str19;
                    LinkedHashSet linkedHashSet4 = linkedHashSet2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    C7246 c72412 = null;
                    while (i5 < size) {
                        HashMap map3 = map2;
                        C7246 c72413 = (C7246) arrayList2.get(i5);
                        List list = c72413.f22234;
                        String str24 = ((C11480) C7166.m19188(1, list)).f34287;
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
                                    b = cb.k;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring2.equals("if-le")) {
                                    b = cb.f77931l;
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
                                c16376 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                if (c72412 == null) {
                                    c7246 = new C7246(c16376, arrayList2.size(), new ArrayList(0));
                                    arrayList2.add(c7246);
                                } else {
                                    c7246 = c72412;
                                }
                                linkedHashSet.add(new C5835(c16376, c72413, c7246, 5));
                                c72412 = c7246;
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
                                c16376 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i6 = i5 + 1;
                                C7246 c72414 = i6 < size ? (C7246) arrayList2.get(i6) : null;
                                if (c72414 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72413, c72414, 0));
                                }
                                C7246 c72415 = (C7246) map.get(m38568(str24));
                                if (c72415 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72413, c72415, 1));
                                }
                                break;
                            case 9:
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                arrayList2 = arrayList3;
                                c16376 = this;
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
                                        String str27 = ((C11480) it4.next()).f34287;
                                        if (z2) {
                                            it2 = it4;
                                            if (str27.startsWith(".packed-switch ")) {
                                                z2 = false;
                                            }
                                        } else {
                                            it2 = it4;
                                            String str28 = str21;
                                            if (!str27.startsWith(str28) || (strM38569 = m38568(str27)) == null || (c7248 = (C7246) map.get(strM38569)) == null) {
                                                str21 = str28;
                                            } else {
                                                str21 = str28;
                                                linkedHashSet.add(new C5835(c16376, c72413, c7248, 2));
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
                                            String str32 = ((C11480) it5.next()).f34287;
                                            if (z3) {
                                                it = it5;
                                                if (str32.startsWith(".sparse-switch")) {
                                                    z3 = false;
                                                }
                                            } else {
                                                it = it5;
                                                if (str32.contains("->") && (strM38568 = m38568(str32)) != null && (c7247 = (C7246) map.get(strM38568)) != null) {
                                                    linkedHashSet.add(new C5835(c16376, c72413, c7247, 2));
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
                                        C7246 c72416 = i7 < size ? (C7246) arrayList2.get(i7) : null;
                                        if (c72416 != null) {
                                            linkedHashSet.add(new C5835(c16376, c72413, c72416, 0));
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
                                c16376 = this;
                                obj = obj;
                                str4 = str12;
                                str11 = str11;
                                C7246 c72417 = (C7246) map.get(m38568(str24));
                                if (c72417 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72413, c72417, 4));
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
                                    c7249 = (C7246) arrayList2.get(i8);
                                } else {
                                    arrayList2 = arrayList3;
                                    c7249 = null;
                                }
                                if (c7249 != null) {
                                    c16376 = this;
                                    c72410 = c72413;
                                    C5835 c5835 = new C5835(c16376, c72410, c7249, 0);
                                    linkedHashSet = linkedHashSet4;
                                    linkedHashSet.add(c5835);
                                } else {
                                    linkedHashSet = linkedHashSet4;
                                    c16376 = this;
                                    c72410 = c72413;
                                }
                                map = map3;
                                C7246 c72418 = (C7246) map.get(m38568(str24));
                                if (c72418 != null) {
                                    str4 = str12;
                                    linkedHashSet.add(new C5835(c16376, c72410, c72418, 1));
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
                                c16376 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i9 = i5 + 1;
                                C7246 c72419 = i9 < size ? (C7246) arrayList2.get(i9) : null;
                                if (c72419 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72413, c72419, 0));
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
                        c16377 = c16376;
                        str10 = str10;
                    }
                    C16376 c16378 = c16377;
                    LinkedHashSet<C5835> linkedHashSet5 = c16378.f50390;
                    ArrayList arrayList4 = c16378.f50393;
                    int size2 = arrayList4.size();
                    C10733[] c10733Arr = new C10733[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        c10733Arr[i10] = new C10733((C7246) arrayList4.get(i10));
                    }
                    for (C5835 c5836 : linkedHashSet5) {
                        c10733Arr[c5836.f17891.f22229].f32346.add(c5836);
                        c10733Arr[c5836.f17887.f22229].f32345.add(c5836);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size2) {
                        C10733 c10733 = c10733Arr[i11];
                        boolean z4 = c10733.f32344;
                        ArrayList arrayList6 = c10733.f32346;
                        ArrayList arrayList7 = c10733.f32345;
                        C7246 c72420 = c10733.f32343;
                        if (z4) {
                            str2 = str20;
                            arrayList = arrayList4;
                            i2 = size2;
                        } else {
                            List list2 = c72420.f22234;
                            if (!list2.isEmpty() && c72420.f22238.isEmpty() && list2.size() <= 3 && ((C11480) list2.get(0)).f34287.startsWith(str20) && arrayList7.size() == 1 && arrayList6.size() == 1) {
                                C5835 c5837 = (C5835) arrayList7.get(0);
                                C5835 c5838 = (C5835) arrayList6.get(0);
                                if (c5837.f17889 == 0 && c5838.f17889 == 0) {
                                    C7246 c72421 = c5837.f17891;
                                    C7246 c72422 = c5838.f17887;
                                    C11480 c11480M19355 = c72421.m19355();
                                    ArrayList arrayList8 = c72421.f22237;
                                    str2 = str20;
                                    List list3 = c72421.f22234;
                                    i2 = size2;
                                    C11480 c11480 = (C11480) list2.get(0);
                                    int i12 = c11480M19355.f34288;
                                    arrayList = arrayList4;
                                    int i13 = i12 + 2;
                                    int i14 = c11480.f34288;
                                    if (i13 == i14) {
                                        list3.add(new C11480(i12 + 1, ""));
                                        arrayList8.add(null);
                                    } else if (i13 != i14) {
                                    }
                                    c10733Arr[c72421.f22229].f32344 = true;
                                    c10733Arr[c72422.f22229].f32344 = true;
                                    list3.addAll(list2);
                                    arrayList8.addAll(c72420.f22237);
                                    linkedHashSet5.remove(c5837);
                                    linkedHashSet5.remove(c5838);
                                    linkedHashSet5.add(new C5835(c16378, c72421, c72422, 0));
                                    arrayList5.add(c72420);
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
                            ((C7246) arrayList9.get(i15)).f22229 = i15;
                        }
                        ArrayList arrayList10 = new ArrayList(linkedHashSet5);
                        linkedHashSet5.clear();
                        linkedHashSet5.addAll(arrayList10);
                    }
                    ArrayList<C12185> arrayList11 = c1560.f5512;
                    ArrayList<C7246> arrayList12 = c16378.f50393;
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    HashMap map4 = new HashMap();
                    for (C7246 c72423 : arrayList12) {
                        Iterator it6 = c72423.f22238.iterator();
                        while (it6.hasNext()) {
                            map4.put((String) it6.next(), c72423);
                        }
                    }
                    for (C12185 c12185 : arrayList11) {
                        C7246 c72424 = (C7246) map4.get(c12185.f36334);
                        C7246 c72425 = (C7246) map4.get(c12185.f36333);
                        C7246 c72426 = (C7246) map4.get(c12185.f36331);
                        if (c72424 != null && c72425 != null && c72426 != null) {
                            c72426.m19354(c12185.f36332);
                            for (int i16 = c72424.f22229; i16 < c72425.f22229; i16++) {
                                c16378.f50390.add(new C5835(c16378, (C7246) arrayList12.get(i16), c72426, 3));
                            }
                        }
                    }
                    return;
                }
                int i17 = i4 + 1;
                String strTrim = ((String) abstractC4628ListIterator.next()).trim();
                AbstractC4628 abstractC4628 = abstractC4628ListIterator;
                if (strTrim.startsWith(".registers ") || strTrim.startsWith(".locals ") || strTrim.startsWith(".param ") || strTrim.startsWith(".annotation ")) {
                    c1560.m5335();
                } else {
                    if (strTrim.startsWith(".end param") || strTrim.startsWith(".end annotation")) {
                        c1560.f5511.clear();
                    } else {
                        if (strTrim.startsWith(":") && z) {
                            ArrayList arrayList13 = new ArrayList();
                            while (true) {
                                if (c1560.f5511.isEmpty()) {
                                    str15 = str15;
                                    str7 = str16;
                                    str8 = str17;
                                } else {
                                    str8 = str17;
                                    C11480 c11481 = (C11480) C18566.m43105(c1560.f5511, 1);
                                    str7 = str16;
                                    int iIndexOf2 = c11481.f34287.indexOf(32);
                                    if (iIndexOf2 == -1) {
                                        strSubstring = c11481.f34287;
                                        i3 = 0;
                                    } else {
                                        strSubstring = c11481.f34287.substring(0, iIndexOf2);
                                        i3 = 0;
                                    }
                                    if (!strSubstring.matches("[a-z0-9\\-/]+")) {
                                        arrayList13.add(i3, c11481);
                                        C18473.m42953(c1560.f5511, 1);
                                        str17 = str8;
                                        str16 = str7;
                                        str15 = str15;
                                    }
                                }
                            }
                            c1560.m5335();
                            c1560.f5511 = arrayList13;
                            z = false;
                        } else {
                            str15 = "if-gez";
                            str7 = "if-eqz";
                            str8 = "return-wide";
                        }
                        if (strTrim.startsWith(".catch ") || strTrim.startsWith(".catchall ")) {
                            Matcher matcher = f50388.matcher(strTrim);
                            C12185 c12186 = matcher.find() ? new C12185(new C11480(i4, strTrim), matcher.group(1), matcher.group(2), matcher.group(3)) : null;
                            if (c12186 != null) {
                                c1560.f5512.add(c12186);
                            }
                        } else {
                            z = z;
                            str14 = "if-gtz";
                        }
                        c1560.f5511.add(new C11480(i4, strTrim));
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
                                    b2 = cb.k;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring3.equals("if-le")) {
                                    b2 = cb.f77931l;
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
                                c1560.m5335();
                                break;
                            case 9:
                                if (strTrim.startsWith(".end packed-switch") || strTrim.startsWith(str18)) {
                                    c1560.m5335();
                                }
                                break;
                            default:
                                continue;
                        }
                        z = false;
                    }
                    i4 = i17;
                    abstractC4628ListIterator = abstractC4628;
                }
                z = false;
                i4 = i17;
                abstractC4628ListIterator = abstractC4628;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38571() {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C10069.f30270 * 18.0f);
        Iterator it = this.f50393.iterator();
        while (it.hasNext()) {
            ((C7246) it.next()).m19352(paint);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38568(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7246 m38569(PointF pointF) {
        for (C7246 c7246 : this.f50393) {
            float fM19357 = c7246.m19357();
            float fM19359 = c7246.m19359() + fM19357;
            float fM19362 = c7246.m19362();
            float fM19349 = c7246.m19349() + fM19362;
            float f = pointF.x;
            if (fM19357 <= f && f <= fM19359) {
                float f2 = pointF.y;
                if (fM19362 <= f2 && f2 <= fM19349) {
                    return c7246;
                }
            }
        }
        return null;
    }

    static {
        ApplicationC12518.m30701(122);
        f50387 = new short[]{6452, 11161, -3135, 10745, -17128, -17105, -17105, -17102, -17105};
        f50388 = Pattern.compile("\\{\\s*(:[a-zA-Z0-9_$]+)\\s*\\.\\.\\s*(:[a-zA-Z0-9_$]+)\\s*\\}\\s*(:[a-zA-Z0-9_$]+)");
    }

    public C16376(C12951 c12951) {
        this.f50391 = -1;
        if (c12951.readInt() != 1986488099) {
            throw new RuntimeException();
        }
        this.f50394 = c12951.readInt();
        this.f50392 = c12951.readInt();
        this.f50391 = c12951.readInt();
        int i = c12951.readInt();
        this.f50393 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f50393.add(new C7246(this, c12951));
        }
        int i3 = c12951.readInt();
        this.f50390 = new LinkedHashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f50390.add(new C5835(this, c12951));
        }
    }
}
