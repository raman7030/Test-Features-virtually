package p067l;

import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8242 extends C5275 {
    /* JADX WARN: Type inference failed for: r10v0, types: [l.᩻ܽۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m19022(C14121 c14121, final C13196 c13196, final String str, final String str2, final int i, final InterfaceC6616 interfaceC6616) {
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf == -1) {
            C7050.m16212(new Runnable() { // from class: l.᩺ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C3263 c3263 = new C3263("", C20865.m47154("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC6616 interfaceC6617 = interfaceC6616;
                    interfaceC6617.mo5691(c3263);
                    interfaceC6617.mo5693();
                }
            });
            return;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        final char[] charArray = strSubstring.toCharArray();
        final int length = charArray.length;
        final char[] charArray2 = strSubstring2.toCharArray();
        final int length2 = charArray2.length;
        final C12266 c12266 = new C12266();
        final ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        final String strM19014 = m19014(c13196, str, str2, concurrentMapC12768);
        m19025(c14121, (InterfaceC21369) new C4890(new InterfaceC9969() { // from class: l.᩻ܽۢ
            @Override // p067l.InterfaceC9969
            public final List accept(Object obj) {
                return C8242.m19017(c12266, charArray, length, charArray2, length2, i, c13196, str2, concurrentMapC12768, strM19014, (InterfaceC15206) obj);
            }
        }, c14121, str, str2), interfaceC6616, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ ArrayList m19017(C12266 c12266, char[] cArr, int i, char[] cArr2, int i2, int i3, C13196 c13196, String str, ConcurrentMapC12768 concurrentMapC12768, String str2, InterfaceC15206 interfaceC15206) {
        try {
            C23948 c23948 = c12266.get();
            if (!interfaceC15206.mo33759(c23948)) {
                return null;
            }
            C13220 c13220M53043 = c23948.m53043();
            ArrayList<Object[]> arrayListM12405 = C5600.m12405(c13220M53043.getValue(), c13220M53043.length(), cArr, i, cArr2, i2);
            if (arrayListM12405.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object[] objArr : arrayListM12405) {
                int[] iArr = (int[]) objArr[0];
                String str3 = (String) objArr[1];
                if (i3 != 0) {
                    int i4 = iArr[0];
                    int iLastIndexOf = TextUtils.lastIndexOf(c13220M53043, '\n', i4);
                    if (iLastIndexOf == -1) {
                        iLastIndexOf = 0;
                    }
                    String strTrim = c13220M53043.m30225(iLastIndexOf, i4).trim();
                    if (i3 == 1) {
                        if (strTrim.startsWith("iput") || strTrim.startsWith("sput")) {
                        }
                    } else if (i3 != 2 || strTrim.startsWith("iget") || strTrim.startsWith("sget")) {
                    }
                }
                if (m19014(c13196, str3, str, concurrentMapC12768).equals(str2)) {
                    C20699 c20699 = new C20699(0);
                    int i5 = iArr[0];
                    c20699.f63914 = i5;
                    int i6 = iArr[1];
                    c20699.f63915 = i6;
                    c20699.m46762(i5, i6, c13220M53043);
                    arrayList.add(c20699);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m19014(C13196 c13196, String str, String str2, ConcurrentMapC12768 concurrentMapC12768) {
        String str3;
        C23924 c23924M30201;
        String str4 = (String) concurrentMapC12768.get(str);
        if (str4 != null) {
            return str4;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(str);
        loop0: while (true) {
            if (linkedList.isEmpty() && linkedList2.isEmpty()) {
                str3 = str;
                break;
            }
            str3 = (String) (linkedList.isEmpty() ? linkedList2.removeFirst() : linkedList.removeFirst());
            if (str3 != null && hashSet.add(str3) && (c23924M30201 = c13196.m30201(str3)) != null) {
                for (String str5 : c23924M30201.f75930) {
                    if (str5.equals(str2)) {
                        break loop0;
                    }
                }
                for (String str6 : c23924M30201.f75926) {
                    if (str6.equals(str2)) {
                        break loop0;
                    }
                }
                String str7 = c23924M30201.f75929;
                if (str7 != null && !hashSet.contains(str7)) {
                    linkedList.add(str7);
                }
                Collections.addAll(linkedList2, c23924M30201.f75928);
            }
        }
        concurrentMapC12768.put(str, str3);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ܰۧۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m19021(C14121 c14121, String str, InterfaceC6616 interfaceC6616) {
        final char[] charArray = str.toCharArray();
        final int length = charArray.length;
        final C12266 c12266 = new C12266();
        m19025(c14121, (InterfaceC21369) new C6231(new InterfaceC9969() { // from class: l.ܰۧۢ
            @Override // p067l.InterfaceC9969
            public final List accept(Object obj) {
                int iM12404;
                C12266 c12267 = c12266;
                char[] cArr = charArray;
                int i = length;
                InterfaceC15206 interfaceC15206 = (InterfaceC15206) obj;
                try {
                    C23948 c23948 = c12267.get();
                    if (!interfaceC15206.mo33759(c23948)) {
                        return null;
                    }
                    C13220 c13220M53043 = c23948.m53043();
                    char[] value = c13220M53043.getValue();
                    int length2 = c13220M53043.length();
                    int i2 = C5600.f13569;
                    ArrayList<int[]> arrayList = new ArrayList();
                    int i3 = 0;
                    while (arrayList.size() < 500 && (iM12404 = C5600.m12404(length2, i, i3, value, cArr)) != -1) {
                        int i4 = iM12404 + i;
                        arrayList.add(new int[]{iM12404, i4});
                        i3 = i4;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int[] iArr : arrayList) {
                        C20699 c20699 = new C20699(0);
                        int i5 = iArr[0];
                        c20699.f63914 = i5;
                        int i6 = iArr[1];
                        c20699.f63915 = i6;
                        c20699.m46762(i5, i6, c13220M53043);
                        arrayList2.add(c20699);
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c14121, str), interfaceC6616, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19024(C14121 c14121, final C13196 c13196, final String str, final String str2, boolean z, final InterfaceC6616 interfaceC6616) {
        InterfaceC9969 interfaceC9969;
        String str3;
        C13929 c13929Matcher = C13259.m30304("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c13929Matcher.matches()) {
            C7050.m16212(new Runnable() { // from class: l.ۢܽۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C3263 c3263 = new C3263("", C20865.m47154("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC6616 interfaceC6617 = interfaceC6616;
                    interfaceC6617.mo5691(c3263);
                    interfaceC6617.mo5693();
                }
            });
            return;
        }
        boolean z2 = true;
        String strGroup = c13929Matcher.group(1);
        C12826.requireNonNull(strGroup);
        String strGroup2 = c13929Matcher.group(2);
        C12826.requireNonNull(strGroup2);
        String strGroup3 = c13929Matcher.group(3);
        C12826.requireNonNull(strGroup3);
        C23924 c23924M30201 = c13196.m30201(str);
        if (!z && c23924M30201 != null) {
            String[] strArr = c23924M30201.f75925;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str3 = null;
                    break;
                }
                str3 = strArr[i];
                if (str3.equals(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (str3 == null) {
                for (String str4 : c23924M30201.f75931) {
                    if (str4.equals(str2)) {
                        z2 = false;
                        str3 = str4;
                        break;
                    }
                }
            }
            if (str3 == null && !strGroup.equals("<init>") && !strGroup.equals("<clinit>")) {
                z2 = false;
            }
        }
        final char[] charArray = ("->" + strGroup + MotionUtils.EASING_TYPE_FORMAT_START).toCharArray();
        final char[] charArray2 = strGroup2.toCharArray();
        final char[] charArray3 = strGroup3.toCharArray();
        final C12266 c12266 = new C12266();
        if (z2) {
            final char[] charArray4 = str.toCharArray();
            interfaceC9969 = new InterfaceC9969() { // from class: l.ۡܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C12266 c12267 = c12266;
                    char[] cArr = charArray4;
                    char[] cArr2 = charArray;
                    char[] cArr3 = charArray2;
                    char[] cArr4 = charArray3;
                    InterfaceC15206 interfaceC15206 = (InterfaceC15206) obj;
                    try {
                        C23948 c23948 = c12267.get();
                        if (!interfaceC15206.mo33759(c23948)) {
                            return null;
                        }
                        C13220 c13220M53043 = c23948.m53043();
                        ArrayList<int[]> arrayListM12407 = C5600.m12407(c13220M53043.getValue(), c13220M53043.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, cArr4, cArr4.length);
                        if (arrayListM12407.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM12407) {
                            C20699 c20699 = new C20699(0);
                            int i2 = iArr[0];
                            c20699.f63914 = i2;
                            int i3 = iArr[1];
                            c20699.f63915 = i3;
                            c20699.m46762(i2, i3, c13220M53043);
                            arrayList.add(c20699);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        } else {
            final C1782 c1782M19019 = m19019(c13196, c23924M30201, str2);
            c1782M19019.add(str);
            final ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
            interfaceC9969 = new InterfaceC9969() { // from class: l.ܺܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C12266 c12267 = c12266;
                    char[] cArr = charArray;
                    char[] cArr2 = charArray2;
                    char[] cArr3 = charArray3;
                    C13196 c13197 = c13196;
                    C1782 c1782 = c1782M19019;
                    ConcurrentMapC12768 concurrentMapC12769 = concurrentMapC12768;
                    InterfaceC15206 interfaceC15206 = (InterfaceC15206) obj;
                    try {
                        C23948 c23948 = c12267.get();
                        if (!interfaceC15206.mo33759(c23948)) {
                            return null;
                        }
                        C13220 c13220M53043 = c23948.m53043();
                        ArrayList<int[]> arrayListM12406 = C5600.m12406(c13220M53043.getValue(), c13220M53043.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, c13197, c1782, concurrentMapC12769);
                        if (arrayListM12406.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM12406) {
                            C20699 c20699 = new C20699(0);
                            int i2 = iArr[0];
                            c20699.f63914 = i2;
                            int i3 = iArr[1];
                            c20699.f63915 = i3;
                            c20699.m46762(i2, i3, c13220M53043);
                            arrayList.add(c20699);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        m19025(c14121, (InterfaceC21369) new C20313(interfaceC9969, c14121, str, str2), interfaceC6616, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19031(C14121 c14121, String str, InterfaceC6616 interfaceC6616) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(str);
        InterfaceC10509[] interfaceC10509Arr = (InterfaceC10509[]) C7480.stream(c14121.m32110()).map(new C24721(4)).filter(new C8628(2)).toArray(new C15661(2));
        while (true) {
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC10509 interfaceC10509 : interfaceC10509Arr) {
                    boolean zContains = hashSet.contains(interfaceC10509.mo5034());
                    if (!zContains) {
                        Iterator it = interfaceC10509.mo5038().iterator();
                        while (it.hasNext()) {
                            if (hashSet.contains((String) it.next())) {
                                zContains = true;
                                break;
                            }
                        }
                    }
                    if (zContains) {
                        String type = interfaceC10509.getType();
                        if (hashSet2.add(type)) {
                            arrayList.add(type);
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
            } else {
                m19025(c14121, (InterfaceC21369) new C20984(new C13303(hashSet2), c14121, str), interfaceC6616, false);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.᩷ܽۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m19023(C14121 c14121, final C13196 c13196, String str, String str2, InterfaceC6616 interfaceC6616) {
        C13929 c13929Matcher = C13259.m30304("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c13929Matcher.matches()) {
            C7050.m16212(new RunnableC9035(interfaceC6616, str, str2));
            return;
        }
        String strGroup = c13929Matcher.group(1);
        C12826.requireNonNull(strGroup);
        String strM13905 = C6112.m13905(strGroup);
        String strGroup2 = c13929Matcher.group(2);
        C12826.requireNonNull(strGroup2);
        String strM13906 = C6112.m13905(strGroup2);
        String strGroup3 = c13929Matcher.group(3);
        C12826.requireNonNull(strGroup3);
        String str3 = strM13905 + "\\s*\\(\\s*" + strM13906 + "\\s*\\)\\s*" + C6112.m13905(strGroup3);
        final C1782 c1782M19019 = m19019(c13196, c13196.m30201(str), str2);
        c1782M19019.add(str);
        final C16673 c16673M11399 = C5275.m11399(str3, true, true);
        final ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        m19025(c14121, (InterfaceC21369) new C2877(new InterfaceC9969() { // from class: l.᩷ܽۢ
            @Override // p067l.InterfaceC9969
            public final List accept(Object obj) {
                C13196 c13197 = c13196;
                C1782 c1782 = c1782M19019;
                ConcurrentMapC12768 concurrentMapC12769 = concurrentMapC12768;
                C16673 c16673 = c16673M11399;
                try {
                    C9952 c9952Mo33762 = ((InterfaceC15206) obj).mo33762();
                    if (c9952Mo33762 == null || !C8242.m19029(c13197, c1782, c9952Mo33762.getType(), concurrentMapC12769)) {
                        return null;
                    }
                    for (InterfaceC19897 interfaceC19897 : c9952Mo33762.getMethods()) {
                        int iMo5854 = interfaceC19897.mo5854();
                        if (!EnumC17248.PRIVATE.m39032(iMo5854) && !EnumC17248.STATIC.m39032(iMo5854)) {
                            String strM36382 = C16010.m36382((InterfaceC7568) interfaceC19897, true);
                            C13929 c13929 = c16673.get();
                            c13929.m56473reset((CharSequence) strM36382);
                            if (c13929.matches()) {
                                C20699 c20699 = new C20699(3);
                                c20699.f63914 = 0;
                                c20699.f63915 = interfaceC19897.getName().length();
                                c20699.f63911 = interfaceC19897.getName();
                                c20699.f63913 = interfaceC19897.mo5855();
                                StringBuilder sb = new StringBuilder();
                                Iterator it = interfaceC19897.mo5852().iterator();
                                while (it.hasNext()) {
                                    sb.append((CharSequence) it.next());
                                }
                                c20699.f63909 = sb.toString();
                                c20699.m46769(interfaceC19897, c20699.f63914, c20699.f63915);
                                return Collections.singletonList(c20699);
                            }
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c14121, str, str2), interfaceC6616, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1782 m19019(C13196 c13196, C23924 c23924, String str) {
        C23924 c23924M30201;
        C1782 c1782 = new C1782();
        if (c23924 != null) {
            String str2 = c23924.f75927;
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(str2);
            while (!linkedList.isEmpty()) {
                String str3 = (String) linkedList.removeFirst();
                if (str3 != null && hashSet.add(str3) && (c23924M30201 = c13196.m30201(str3)) != null) {
                    if (!str3.equals(str2)) {
                        for (String str4 : c23924M30201.f75931) {
                            if (str4.equals(str)) {
                                c1782.add(c23924M30201.f75927);
                                break;
                            }
                        }
                    }
                    linkedList.add(c23924M30201.f75929);
                    Collections.addAll(linkedList, c23924M30201.f75928);
                }
            }
        }
        return c1782;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19029(C13196 c13196, C1782 c1782, String str, ConcurrentMapC12768 concurrentMapC12768) {
        Boolean boolValueOf = (Boolean) concurrentMapC12768.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(m19028(c13196, c1782, str, new HashSet()));
            concurrentMapC12768.put(str, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19028(C13196 c13196, C1782 c1782, String str, HashSet hashSet) {
        if (c1782.contains(str)) {
            return true;
        }
        hashSet.add(str);
        C23924 c23924M30201 = c13196.m30201(str);
        if (c23924M30201 != null) {
            String str2 = c23924M30201.f75929;
            if (str2 != null && !hashSet.contains(str2) && m19028(c13196, c1782, str2, hashSet)) {
                return true;
            }
            for (String str3 : c23924M30201.f75928) {
                if (!hashSet.contains(str3) && m19028(c13196, c1782, str3, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19020(C14121 c14121, String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC6616 interfaceC6616, Predicate predicate) {
        m19025(c14121, (InterfaceC21369) new C5560(i, str, z3, z2, z4, c14121, j, str2, z, predicate), interfaceC6616, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19025(final C14121 c14121, final InterfaceC21369 interfaceC21369, final InterfaceC6616 interfaceC6616, boolean z) {
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: l.ۜܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC21369 interfaceC213610 = interfaceC21369;
                InterfaceC9969 interfaceC9969Mo4629 = interfaceC213610.mo4629();
                final InterfaceC6616 interfaceC6617 = interfaceC6616;
                if (interfaceC9969Mo4629 == null) {
                    C7050.m16212(new RunnableC20435(5, interfaceC6617));
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                interfaceC213610.mo4630(concurrentLinkedQueue);
                interfaceC6617.mo5694(0);
                C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                c20689.m46753(new C4407(interfaceC6617));
                C10748 c10748M24760 = C10748.m24760();
                final ArrayList arrayList2 = arrayList;
                RunnableC14947 runnableC14947 = new RunnableC14947(concurrentLinkedQueue, interfaceC6617, c20689, interfaceC9969Mo4629, arrayList2, c10748M24760);
                C14121 c14122 = c14121;
                c14122.m32112();
                C5275.m11400(C19110.f57020, runnableC14947);
                c14122.m32122();
                C7050.m16212(new Runnable() { // from class: l.۟ۧۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6616 interfaceC6618 = interfaceC6617;
                        if (interfaceC6618.mo5692()) {
                            C22682.m50801();
                        }
                        interfaceC6618.mo5691(interfaceC213610.mo4628(arrayList2));
                        interfaceC6618.mo5693();
                    }
                });
            }
        };
        if (z) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static ArrayList m19032(InterfaceC10509 interfaceC10509, C13929 c13929, boolean z) {
        C13929 c139210 = c13929;
        if (interfaceC10509 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo5033 = interfaceC10509.mo5033();
        if (strMo5033 != null) {
            c139210.m56473reset((CharSequence) strMo5033);
            if (!z ? C7974.m18465(c13929) : c13929.matches()) {
                C20699 c20699 = new C20699(1);
                String strM35742 = C15693.m35742(strMo5033);
                int iM11396 = C5275.m11396(c13929.start(), 0, 0, strMo5033);
                c20699.m46763(iM11396 + 9, C5275.m11396(c13929.end(), c13929.start(), iM11396, strMo5033) + 9, C6988.m16053(".source \"", strM35742, "\""));
                arrayList.add(c20699);
            }
        }
        Iterator it = interfaceC10509.getAnnotations().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = 0;
            for (InterfaceC11180 interfaceC11180 : ((InterfaceC21909) it.next()).getElements()) {
                if (m19027(interfaceC11180.getValue(), c139210, z)) {
                    C20699 c206910 = new C20699(2);
                    c206910.m46767(interfaceC11180, c139210);
                    c206910.f63914 = i;
                    c206910.f63915 = i2;
                    arrayList.add(c206910);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC5815 interfaceC5815 : interfaceC10509.getFields()) {
            Iterator it2 = interfaceC5815.getAnnotations().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = 0;
                for (InterfaceC11180 interfaceC11181 : ((InterfaceC21909) it2.next()).getElements()) {
                    if (m19027(interfaceC11181.getValue(), c139210, z)) {
                        C20699 c206911 = new C20699(8);
                        c206911.f63911 = interfaceC5815.getName();
                        c206911.f63913 = interfaceC5815.getType();
                        c206911.m46767(interfaceC11181, c139210);
                        c206911.f63914 = i3;
                        c206911.f63915 = i4;
                        arrayList.add(c206911);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC12262 interfaceC12262Mo13085 = interfaceC5815.mo13085();
            if (interfaceC12262Mo13085 != null && m19027(interfaceC12262Mo13085, c139210, z)) {
                C20699 c206912 = new C20699(9);
                c206912.f63911 = interfaceC5815.getName();
                c206912.f63913 = interfaceC5815.getType();
                c206912.m46765(interfaceC5815, c139210);
                arrayList.add(c206912);
            }
        }
        for (InterfaceC19897 interfaceC19897 : interfaceC10509.getMethods()) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = interfaceC19897.mo5852().iterator();
            while (it3.hasNext()) {
                sb.append((CharSequence) it3.next());
            }
            String string = sb.toString();
            Iterator it4 = interfaceC19897.getParameters().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Iterator it5 = ((InterfaceC2461) it4.next()).getAnnotations().iterator();
                while (it5.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC11180 interfaceC11182 : ((InterfaceC21909) it5.next()).getElements()) {
                        if (m19027(interfaceC11182.getValue(), c139210, z)) {
                            C20699 c206913 = new C20699(4);
                            c206913.f63911 = interfaceC19897.getName();
                            c206913.f63913 = interfaceC19897.mo5855();
                            c206913.f63909 = string;
                            c206913.m46767(interfaceC11182, c139210);
                            c206913.f63914 = i5;
                            c206913.f63915 = i6;
                            arrayList.add(c206913);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            Iterator it6 = interfaceC19897.getAnnotations().iterator();
            while (it6.hasNext()) {
                int i7 = 0;
                for (InterfaceC11180 interfaceC11183 : ((InterfaceC21909) it6.next()).getElements()) {
                    if (m19027(interfaceC11183.getValue(), c139210, z)) {
                        C20699 c206914 = new C20699(4);
                        c206914.f63911 = interfaceC19897.getName();
                        c206914.f63913 = interfaceC19897.mo5855();
                        c206914.f63909 = string;
                        c206914.m46767(interfaceC11183, c139210);
                        c206914.f63914 = i5;
                        c206914.f63915 = i7;
                        arrayList.add(c206914);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
            if (interfaceC20568Mo5857 != null) {
                int i8 = 0;
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    if (interfaceC23920.mo6217() != EnumC3167.f5839) {
                        EnumC5850 enumC5850 = interfaceC23920.mo6217().f6090;
                        if ((enumC5850 == EnumC5850.Format21c || enumC5850 == EnumC5850.Format31c) && interfaceC23920.mo6217().f6092 == 0) {
                            String string2 = ((InterfaceC16954) ((InterfaceC12777) interfaceC23920).getReference()).getString();
                            c139210.m56473reset((CharSequence) string2);
                            if (!z ? C7974.m18465(c13929) : c13929.matches()) {
                                C20699 c206915 = new C20699(5);
                                try {
                                    int iMo6075 = interfaceC19897.mo5857().mo6075();
                                    InterfaceC20276 interfaceC20276 = C18693.f55824;
                                    int iM42656 = C18693.m42656(interfaceC19897.mo5852(), EnumC17248.STATIC.m39032(interfaceC19897.mo5854()));
                                    C13220 c13220 = new C13220();
                                    C5636 c5636 = new C5636(new C23948(c13220));
                                    c13220.m30230(interfaceC23920.mo6217().f6089);
                                    c13220.append(' ');
                                    int iMo4189 = ((InterfaceC4059) interfaceC23920).mo4189();
                                    int i9 = iMo6075 - iM42656;
                                    if (iMo4189 >= i9) {
                                        c5636.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                        c5636.m12534(iMo4189 - i9);
                                    } else {
                                        c5636.write(118);
                                        c5636.m12534(iMo4189);
                                    }
                                    c13220.m30230(", \"");
                                    String strM35743 = C15693.m35742(string2);
                                    int iM11397 = C5275.m11396(c13929.start(), 0, 0, string2);
                                    c206915.m46763(c13220.length() + iM11397, c13220.length() + C5275.m11396(c13929.end(), c13929.start(), iM11397, string2), ((Object) c13220) + strM35743 + "\"");
                                } catch (IOException unused) {
                                }
                                c206915.f63911 = interfaceC19897.getName();
                                c206915.f63913 = interfaceC19897.mo5855();
                                c206915.f63909 = string;
                                c206915.f63914 = i8;
                                arrayList.add(c206915);
                            }
                        }
                        i8++;
                        c139210 = c13929;
                    }
                }
            }
            c139210 = c13929;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19027(InterfaceC12262 interfaceC12262, C13929 c13929, boolean z) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 23) {
            c13929.m56473reset((CharSequence) ((InterfaceC19007) interfaceC12262).getValue());
            if (z) {
                return c13929.matches();
            }
            return C7974.m18465(c13929);
        }
        if (iMo4670 == 28) {
            Iterator it = ((InterfaceC21650) interfaceC12262).getValue().iterator();
            while (it.hasNext()) {
                if (m19027((InterfaceC12262) it.next(), c13929, z)) {
                    return true;
                }
            }
            return false;
        }
        if (iMo4670 != 29) {
            return false;
        }
        Iterator it2 = ((InterfaceC23661) interfaceC12262).getElements().iterator();
        while (it2.hasNext()) {
            if (m19027(((InterfaceC11180) it2.next()).getValue(), c13929, z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19026(C6215 c6215, C13929 c13929, boolean z, boolean z2, boolean z3) {
        if (z2) {
            c13929.m56473reset(c6215.m14070());
            if (z) {
                if (c13929.matches()) {
                    return true;
                }
            } else if (C7974.m18465(c13929)) {
                return true;
            }
            c13929.m56473reset(c6215.m14073());
            if (z) {
                if (c13929.matches()) {
                    return true;
                }
            } else if (C7974.m18465(c13929)) {
                return true;
            }
        }
        if (z3) {
            c13929.m56473reset(c6215.m14072());
            if (z) {
                if (c13929.matches()) {
                    return true;
                }
            } else if (C7974.m18465(c13929)) {
                return true;
            }
        }
        c13929.m56473reset(c6215.m14074());
        return z ? c13929.matches() : C7974.m18465(c13929);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m19030(InterfaceC10509 interfaceC10509, C13929 c13929, boolean z) {
        boolean z2;
        String strM40053;
        boolean z3;
        int iStart;
        int iEnd;
        int i;
        if (interfaceC10509 != null) {
            InterfaceC16809 interfaceC16809ListIterator = new C23261(c13929.pattern().pattern().toCharArray()).listIterator(0);
            while (true) {
                if (!interfaceC16809ListIterator.hasNext()) {
                    z2 = false;
                    strM40053 = null;
                    break;
                }
                if (interfaceC16809ListIterator.mo9752() == '\\' && interfaceC16809ListIterator.hasNext() && interfaceC16809ListIterator.mo9752() == '.') {
                    String type = interfaceC10509.getType();
                    strM40053 = C17588.m40053(type.substring(1, type.length() - 1).replace('/', '.'), ".");
                    z2 = true;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC19897 interfaceC19897 : interfaceC10509.getMethods()) {
                if (z2) {
                    StringBuilder sbM17248 = C7470.m17248(strM40053);
                    sbM17248.append(interfaceC19897.getName());
                    c13929.m56473reset((CharSequence) sbM17248.toString());
                    if (!z ? !C7974.m18465(c13929) || c13929.end() <= strM40053.length() : !c13929.matches()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    iEnd = c13929.end() - strM40053.length();
                    i = 0;
                } else {
                    c13929.m56473reset((CharSequence) interfaceC19897.getName());
                    if (z) {
                        if (c13929.matches()) {
                            iStart = c13929.start();
                            iEnd = c13929.end();
                            i = iStart;
                            z3 = true;
                        } else {
                            i = 0;
                            iEnd = 0;
                        }
                    } else if (C7974.m18465(c13929)) {
                        iStart = c13929.start();
                        iEnd = c13929.end();
                        i = iStart;
                        z3 = true;
                    } else {
                        i = 0;
                        iEnd = 0;
                    }
                }
                if (z3) {
                    C20699 c20699 = new C20699(3);
                    c20699.f63914 = i;
                    c20699.f63915 = iEnd;
                    c20699.f63911 = interfaceC19897.getName();
                    c20699.f63913 = interfaceC19897.mo5855();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC19897.mo5852().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    c20699.f63909 = sb.toString();
                    c20699.m46769(interfaceC19897, i, iEnd);
                    arrayList.add(c20699);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m19016(InterfaceC10509 interfaceC10509, C13929 c13929, boolean z) {
        int iStart;
        int iEnd;
        if (interfaceC10509 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5815 interfaceC5815 : interfaceC10509.getFields()) {
            c13929.m56473reset((CharSequence) interfaceC5815.getName());
            boolean z2 = true;
            if (!z) {
                if (C7974.m18465(c13929)) {
                    iStart = c13929.start();
                    iEnd = c13929.end();
                } else {
                    z2 = false;
                    iStart = 0;
                    iEnd = 0;
                }
            } else if (c13929.matches()) {
                iStart = c13929.start();
                iEnd = c13929.end();
            } else {
                z2 = false;
                iStart = 0;
                iEnd = 0;
            }
            if (z2) {
                C20699 c20699 = new C20699(7);
                c20699.f63914 = iStart;
                c20699.f63915 = iEnd;
                c20699.f63911 = interfaceC5815.getName();
                c20699.f63913 = interfaceC5815.getType();
                C13220 c13220 = new C13220();
                c13220.m30230(".field ");
                for (EnumC17248 enumC17248 : EnumC17248.m39030(interfaceC5815.mo13086())) {
                    c13220.m30230(enumC17248.toString());
                    c13220.append(' ');
                }
                int length = c13220.length() + iStart;
                int length2 = c13220.length() + iEnd;
                c13220.m30230(interfaceC5815.getName());
                c13220.append(':');
                c13220.m30230(interfaceC5815.getType());
                InterfaceC12262 interfaceC12262Mo13085 = interfaceC5815.mo13085();
                if (interfaceC12262Mo13085 != null) {
                    c13220.m30230(" = ");
                    try {
                        AbstractC13363.m30508(new C5636(new C23948(c13220)), interfaceC12262Mo13085);
                    } catch (IOException unused) {
                    }
                }
                c20699.m46763(length, length2, c13220.toString());
                arrayList.add(c20699);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m19015(InterfaceC10509 interfaceC10509, long j) {
        Iterator it;
        Iterator it2;
        InterfaceC10765 interfaceC10765;
        Iterator it3;
        String string;
        InterfaceC12262 interfaceC12262M19018;
        if (interfaceC10509 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = interfaceC10509.getAnnotations().iterator();
        int i = 0;
        while (it4.hasNext()) {
            int i2 = 0;
            for (InterfaceC11180 interfaceC11180 : ((InterfaceC21909) it4.next()).getElements()) {
                InterfaceC12262 interfaceC12262M19019 = m19018(interfaceC11180.getValue(), j);
                if (interfaceC12262M19019 != null) {
                    C20699 c20699 = new C20699(2);
                    c20699.f63914 = i;
                    c20699.f63915 = i2;
                    c20699.m46766(interfaceC11180, interfaceC12262M19019);
                    arrayList.add(c20699);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC5815 interfaceC5815 : interfaceC10509.getFields()) {
            Iterator it5 = interfaceC5815.getAnnotations().iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                int i4 = 0;
                for (InterfaceC11180 interfaceC11181 : ((InterfaceC21909) it5.next()).getElements()) {
                    InterfaceC12262 interfaceC12262M190110 = m19018(interfaceC11181.getValue(), j);
                    if (interfaceC12262M190110 != null) {
                        C20699 c206910 = new C20699(8);
                        c206910.f63911 = interfaceC5815.getName();
                        c206910.f63913 = interfaceC5815.getType();
                        c206910.m46766(interfaceC11181, interfaceC12262M190110);
                        c206910.f63914 = i3;
                        c206910.f63915 = i4;
                        arrayList.add(c206910);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC12262 interfaceC12262Mo13085 = interfaceC5815.mo13085();
            if (interfaceC12262Mo13085 != null && (interfaceC12262M19018 = m19018(interfaceC12262Mo13085, j)) != null) {
                C20699 c206911 = new C20699(9);
                c206911.f63911 = interfaceC5815.getName();
                c206911.f63913 = interfaceC5815.getType();
                c206911.m46764(interfaceC5815, interfaceC12262M19018);
                arrayList.add(c206911);
            }
        }
        Iterator it6 = interfaceC10509.getMethods().iterator();
        while (it6.hasNext()) {
            InterfaceC19897 interfaceC19897 = (InterfaceC19897) it6.next();
            StringBuilder sb = new StringBuilder();
            Iterator it7 = interfaceC19897.mo5852().iterator();
            while (it7.hasNext()) {
                sb.append((CharSequence) it7.next());
            }
            String string2 = sb.toString();
            Iterator it8 = interfaceC19897.getParameters().iterator();
            int i5 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((InterfaceC2461) it8.next()).getAnnotations().iterator();
                while (it9.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC11180 interfaceC11182 : ((InterfaceC21909) it9.next()).getElements()) {
                        InterfaceC12262 interfaceC12262M190111 = m19018(interfaceC11182.getValue(), j);
                        if (interfaceC12262M190111 != null) {
                            C20699 c206912 = new C20699(4);
                            c206912.f63911 = interfaceC19897.getName();
                            c206912.f63913 = interfaceC19897.mo5855();
                            c206912.f63909 = string2;
                            c206912.m46766(interfaceC11182, interfaceC12262M190111);
                            c206912.f63914 = i5;
                            c206912.f63915 = i6;
                            arrayList.add(c206912);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            char c = 0;
            Iterator it10 = interfaceC19897.getAnnotations().iterator();
            while (it10.hasNext()) {
                int i7 = 0;
                for (InterfaceC11180 interfaceC11183 : ((InterfaceC21909) it10.next()).getElements()) {
                    InterfaceC12262 interfaceC12262M190112 = m19018(interfaceC11183.getValue(), j);
                    if (interfaceC12262M190112 != null) {
                        C20699 c206913 = new C20699(4);
                        c206913.f63911 = interfaceC19897.getName();
                        c206913.f63913 = interfaceC19897.mo5855();
                        c206913.f63909 = string2;
                        c206913.m46766(interfaceC11183, interfaceC12262M190112);
                        c206913.f63914 = i5;
                        c206913.f63915 = i7;
                        arrayList.add(c206913);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
            if (interfaceC20568Mo5857 != null) {
                int i8 = 0;
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    if (interfaceC23920.mo6217() != EnumC3167.f5839) {
                        if (!(interfaceC23920 instanceof InterfaceC9168) && !(interfaceC23920 instanceof C13897)) {
                            int[] iArr = C14277.f40672;
                            int i9 = 1;
                            int i10 = 6;
                            switch (iArr[interfaceC23920.mo6217().f6090.ordinal()]) {
                                case 9:
                                    InterfaceC10765 interfaceC10766 = (InterfaceC10765) interfaceC23920;
                                    Iterator it11 = interfaceC10766.mo21003().iterator();
                                    int i11 = 0;
                                    while (it11.hasNext()) {
                                        Number number = (Number) it11.next();
                                        if (number.longValue() == j) {
                                            C20699 c206914 = new C20699(i10);
                                            int iMo21004 = interfaceC10766.mo21004();
                                            String str = iMo21004 != i9 ? iMo21004 != 2 ? "" : C0655am.f2274aB : C0655am.f2281aI;
                                            try {
                                                C13220 c13220 = new C13220();
                                                it2 = it6;
                                                try {
                                                    C5636 c5636 = new C5636(new C23948(c13220));
                                                    interfaceC10765 = interfaceC10766;
                                                    it3 = it11;
                                                    try {
                                                        C6852.m15693(c5636, number.longValue());
                                                        c5636.write(str, 0, str.length());
                                                        string = c13220.toString();
                                                    } catch (IOException e) {
                                                        e = e;
                                                        string = e.toString();
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    interfaceC10765 = interfaceC10766;
                                                    it3 = it11;
                                                    string = e.toString();
                                                    c206914.m46763(17, string.length() + 17, C6988.m16053(".array-data {... ", string, " ...}"));
                                                    c206914.f63911 = interfaceC19897.getName();
                                                    c206914.f63913 = interfaceC19897.mo5855();
                                                    c206914.f63909 = string2;
                                                    c206914.f63914 = i8;
                                                    c206914.f63915 = i11;
                                                    arrayList.add(c206914);
                                                    i11++;
                                                    i9 = 1;
                                                    i10 = 6;
                                                    interfaceC10766 = interfaceC10765;
                                                    it11 = it3;
                                                    it6 = it2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                it2 = it6;
                                            }
                                            c206914.m46763(17, string.length() + 17, C6988.m16053(".array-data {... ", string, " ...}"));
                                            c206914.f63911 = interfaceC19897.getName();
                                            c206914.f63913 = interfaceC19897.mo5855();
                                            c206914.f63909 = string2;
                                            c206914.f63914 = i8;
                                            c206914.f63915 = i11;
                                            arrayList.add(c206914);
                                        } else {
                                            it2 = it6;
                                            interfaceC10765 = interfaceC10766;
                                            it3 = it11;
                                        }
                                        i11++;
                                        i9 = 1;
                                        i10 = 6;
                                        interfaceC10766 = interfaceC10765;
                                        it11 = it3;
                                        it6 = it2;
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 10:
                                    int i12 = 0;
                                    for (InterfaceC19482 interfaceC19482 : ((InterfaceC18811) interfaceC23920).mo10139()) {
                                        if (interfaceC19482.getKey() == j) {
                                            C20699 c206915 = new C20699(6);
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Integer.valueOf(interfaceC19482.getKey());
                                            c206915.m46763(20, 28, String.format(".packed-switch {... %08x ...}", objArr));
                                            c206915.f63911 = interfaceC19897.getName();
                                            c206915.f63913 = interfaceC19897.mo5855();
                                            c206915.f63909 = string2;
                                            c206915.f63914 = i8;
                                            c206915.f63915 = i12;
                                            arrayList.add(c206915);
                                            it = it6;
                                        } else {
                                            i12++;
                                        }
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 11:
                                    int i13 = 0;
                                    for (InterfaceC19482 interfaceC19483 : ((InterfaceC18811) interfaceC23920).mo10139()) {
                                        if (interfaceC19483.getKey() == j) {
                                            C20699 c206916 = new C20699(6);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c] = Integer.valueOf(interfaceC19483.getKey());
                                            c206916.m46763(20, 28, String.format(".sparse-switch {... %08x ...}", objArr2));
                                            c206916.f63911 = interfaceC19897.getName();
                                            c206916.f63913 = interfaceC19897.mo5855();
                                            c206916.f63909 = string2;
                                            c206916.f63914 = i8;
                                            c206916.f63915 = i13;
                                            arrayList.add(c206916);
                                            it = it6;
                                        } else {
                                            i13++;
                                        }
                                        break;
                                    }
                                    it = it6;
                                    break;
                                default:
                                    it = it6;
                                    switch (iArr[interfaceC23920.mo6217().f6090.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (((InterfaceC11436) interfaceC23920).mo7162() == j) {
                                                C20699 c206917 = new C20699(5);
                                                try {
                                                    int iMo6075 = interfaceC19897.mo5857().mo6075();
                                                    InterfaceC20276 interfaceC20276 = C18693.f55824;
                                                    int iM42656 = C18693.m42656(interfaceC19897.mo5852(), EnumC17248.STATIC.m39032(interfaceC19897.mo5854()));
                                                    System.out.println(interfaceC19897 + " " + iMo6075 + " " + iM42656);
                                                    C13220 c13221 = new C13220();
                                                    C5636 c5637 = new C5636(new C23948(c13221));
                                                    c13221.m30230(interfaceC23920.mo6217().f6089);
                                                    switch (C9583.f26375[interfaceC23920.mo6217().f6090.ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            c13221.append(' ');
                                                            int iMo4189 = ((InterfaceC4059) interfaceC23920).mo4189();
                                                            int i14 = iMo6075 - iM42656;
                                                            if (iMo4189 >= i14) {
                                                                c5637.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c5637.m12534(iMo4189 - i14);
                                                            } else {
                                                                c5637.write(118);
                                                                c5637.m12534(iMo4189);
                                                            }
                                                            c13221.m30230(", ");
                                                            int length = c13221.length();
                                                            C6852.m15693(c5637, ((InterfaceC11436) interfaceC23920).mo7162());
                                                            c206917.m46763(length, c13221.length(), c13221.toString());
                                                            break;
                                                        case 7:
                                                        case 8:
                                                            c13221.append(' ');
                                                            int iMo41810 = ((InterfaceC4059) interfaceC23920).mo4189();
                                                            int i15 = iMo6075 - iM42656;
                                                            if (iMo41810 >= i15) {
                                                                c5637.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c5637.m12534(iMo41810 - i15);
                                                            } else {
                                                                c5637.write(118);
                                                                c5637.m12534(iMo41810);
                                                            }
                                                            c13221.m30230(", ");
                                                            int iMo9978 = ((InterfaceC24846) interfaceC23920).mo9978();
                                                            if (iMo9978 >= i15) {
                                                                c5637.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c5637.m12534(iMo9978 - i15);
                                                            } else {
                                                                c5637.write(118);
                                                                c5637.m12534(iMo9978);
                                                            }
                                                            c13221.m30230(", ");
                                                            int length2 = c13221.length();
                                                            C6852.m15693(c5637, ((InterfaceC11436) interfaceC23920).mo7162());
                                                            c206917.m46763(length2, c13221.length(), c13221.toString());
                                                            break;
                                                    }
                                                } catch (IOException unused) {
                                                }
                                                c206917.f63911 = interfaceC19897.getName();
                                                c206917.f63913 = interfaceC19897.mo5855();
                                                c206917.f63909 = string2;
                                                c206917.f63914 = i8;
                                                arrayList.add(c206917);
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            it = it6;
                        }
                        i8++;
                        c = 0;
                        it6 = it;
                    }
                }
            }
            it6 = it6;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12262 m19018(InterfaceC12262 interfaceC12262, long j) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 != 0) {
            if (iMo4670 != 6) {
                if (iMo4670 != 2) {
                    if (iMo4670 != 3) {
                        if (iMo4670 != 4) {
                            if (iMo4670 == 28) {
                                Iterator it = ((InterfaceC21650) interfaceC12262).getValue().iterator();
                                while (it.hasNext()) {
                                    InterfaceC12262 interfaceC12262M19018 = m19018((InterfaceC12262) it.next(), j);
                                    if (interfaceC12262M19018 != null) {
                                        return interfaceC12262M19018;
                                    }
                                }
                                return null;
                            }
                            if (iMo4670 != 29) {
                                return null;
                            }
                            Iterator it2 = ((InterfaceC23661) interfaceC12262).getElements().iterator();
                            while (it2.hasNext()) {
                                InterfaceC12262 interfaceC12262M19019 = m19018(((InterfaceC11180) it2.next()).getValue(), j);
                                if (interfaceC12262M19019 != null) {
                                    return interfaceC12262M19019;
                                }
                            }
                            return null;
                        }
                        if (((InterfaceC15613) interfaceC12262).getValue() != j) {
                            return null;
                        }
                    } else if (((InterfaceC14943) interfaceC12262).getValue() != j) {
                        return null;
                    }
                } else if (((InterfaceC19678) interfaceC12262).getValue() != j) {
                    return null;
                }
            } else if (((InterfaceC9579) interfaceC12262).getValue() != j) {
                return null;
            }
        } else if (((InterfaceC5556) interfaceC12262).getValue() != j) {
            return null;
        }
        return interfaceC12262;
    }
}
