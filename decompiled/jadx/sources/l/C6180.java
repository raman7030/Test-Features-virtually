package l;

import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
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
public final class C6180 extends C3058 {
    /* JADX WARN: Type inference failed for: r10v0, types: [l.᩻ܽۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17090(C12366 c12366, final C11393 c11393, final String str, final String str2, final int i, final InterfaceC4469 interfaceC4469) {
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf == -1) {
            C4925.m14315(new Runnable() { // from class: l.᩺ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C0941 c0941 = new C0941("", C19462.m44858("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC4469 interfaceC44610 = interfaceC4469;
                    interfaceC44610.mo3372(c0941);
                    interfaceC44610.mo3374();
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
        final C10414 c10414 = new C10414();
        final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        final String strM17082 = m17082(c11393, str, str2, concurrentMapC10942);
        m17093(c12366, (InterfaceC19992) new C2653(new InterfaceC7997() { // from class: l.᩻ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                return C6180.m17085(c10414, charArray, length, charArray2, length2, i, c11393, str2, concurrentMapC10942, strM17082, (InterfaceC13508) obj);
            }
        }, c12366, str, str2), interfaceC4469, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ArrayList m17085(C10414 c10414, char[] cArr, int i, char[] cArr2, int i2, int i3, C11393 c11393, String str, ConcurrentMapC10942 concurrentMapC10942, String str2, InterfaceC13508 interfaceC13508) {
        try {
            C22706 c22706 = c10414.get();
            if (!interfaceC13508.mo31671(c22706)) {
                return null;
            }
            C11418 c11418M50717 = c22706.m50717();
            ArrayList<Object[]> arrayListM10366 = C3400.m10366(c11418M50717.getValue(), c11418M50717.length(), cArr, i, cArr2, i2);
            if (arrayListM10366.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object[] objArr : arrayListM10366) {
                int[] iArr = (int[]) objArr[0];
                String str3 = (String) objArr[1];
                if (i3 != 0) {
                    int i4 = iArr[0];
                    int iLastIndexOf = TextUtils.lastIndexOf(c11418M50717, '\n', i4);
                    if (iLastIndexOf == -1) {
                        iLastIndexOf = 0;
                    }
                    String strTrim = c11418M50717.m28181(iLastIndexOf, i4).trim();
                    if (i3 == 1) {
                        if (strTrim.startsWith("iput") || strTrim.startsWith("sput")) {
                        }
                    } else if (i3 != 2 || strTrim.startsWith("iget") || strTrim.startsWith("sget")) {
                    }
                }
                if (m17082(c11393, str3, str, concurrentMapC10942).equals(str2)) {
                    C19287 c19287 = new C19287(0);
                    int i5 = iArr[0];
                    c19287.f60684 = i5;
                    int i6 = iArr[1];
                    c19287.f60685 = i6;
                    c19287.m44468(i5, i6, c11418M50717);
                    arrayList.add(c19287);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17082(C11393 c11393, String str, String str2, ConcurrentMapC10942 concurrentMapC10942) {
        String str3;
        C22681 c22681M28157;
        String str4 = (String) concurrentMapC10942.get(str);
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
            if (str3 != null && hashSet.add(str3) && (c22681M28157 = c11393.m28157(str3)) != null) {
                for (String str5 : c22681M28157.f73205) {
                    if (str5.equals(str2)) {
                        break loop0;
                    }
                }
                for (String str6 : c22681M28157.f73201) {
                    if (str6.equals(str2)) {
                        break loop0;
                    }
                }
                String str7 = c22681M28157.f73204;
                if (str7 != null && !hashSet.contains(str7)) {
                    linkedList.add(str7);
                }
                Collections.addAll(linkedList2, c22681M28157.f73203);
            }
        }
        concurrentMapC10942.put(str, str3);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ܰۧۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17089(C12366 c12366, String str, InterfaceC4469 interfaceC4469) {
        final char[] charArray = str.toCharArray();
        final int length = charArray.length;
        final C10414 c10414 = new C10414();
        m17093(c12366, (InterfaceC19992) new C4064(new InterfaceC7997() { // from class: l.ܰۧۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                int iM10365;
                C10414 c10415 = c10414;
                char[] cArr = charArray;
                int i = length;
                InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                try {
                    C22706 c22706 = c10415.get();
                    if (!interfaceC13508.mo31671(c22706)) {
                        return null;
                    }
                    C11418 c11418M50717 = c22706.m50717();
                    char[] value = c11418M50717.getValue();
                    int length2 = c11418M50717.length();
                    int i2 = C3400.f10762;
                    ArrayList<int[]> arrayList = new ArrayList();
                    int i3 = 0;
                    while (arrayList.size() < 500 && (iM10365 = C3400.m10365(length2, i, i3, value, cArr)) != -1) {
                        int i4 = iM10365 + i;
                        arrayList.add(new int[]{iM10365, i4});
                        i3 = i4;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int[] iArr : arrayList) {
                        C19287 c19287 = new C19287(0);
                        int i5 = iArr[0];
                        c19287.f60684 = i5;
                        int i6 = iArr[1];
                        c19287.f60685 = i6;
                        c19287.m44468(i5, i6, c11418M50717);
                        arrayList2.add(c19287);
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c12366, str), interfaceC4469, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17092(C12366 c12366, final C11393 c11393, final String str, final String str2, boolean z, final InterfaceC4469 interfaceC4469) {
        InterfaceC7997 interfaceC7997;
        String str3;
        C12164 c12164Matcher = C11459.m28260("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c12164Matcher.matches()) {
            C4925.m14315(new Runnable() { // from class: l.ۢܽۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C0941 c0941 = new C0941("", C19462.m44858("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC4469 interfaceC44610 = interfaceC4469;
                    interfaceC44610.mo3372(c0941);
                    interfaceC44610.mo3374();
                }
            });
            return;
        }
        boolean z2 = true;
        String strGroup = c12164Matcher.group(1);
        C11003.requireNonNull(strGroup);
        String strGroup2 = c12164Matcher.group(2);
        C11003.requireNonNull(strGroup2);
        String strGroup3 = c12164Matcher.group(3);
        C11003.requireNonNull(strGroup3);
        C22681 c22681M28157 = c11393.m28157(str);
        if (!z && c22681M28157 != null) {
            String[] strArr = c22681M28157.f73200;
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
                for (String str4 : c22681M28157.f73206) {
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
        final C10414 c10414 = new C10414();
        if (z2) {
            final char[] charArray4 = str.toCharArray();
            interfaceC7997 = new InterfaceC7997() { // from class: l.ۡܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c10415 = c10414;
                    char[] cArr = charArray4;
                    char[] cArr2 = charArray;
                    char[] cArr3 = charArray2;
                    char[] cArr4 = charArray3;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c10415.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 c11418M50717 = c22706.m50717();
                        ArrayList<int[]> arrayListM10368 = C3400.m10368(c11418M50717.getValue(), c11418M50717.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, cArr4, cArr4.length);
                        if (arrayListM10368.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM10368) {
                            C19287 c19287 = new C19287(0);
                            int i2 = iArr[0];
                            c19287.f60684 = i2;
                            int i3 = iArr[1];
                            c19287.f60685 = i3;
                            c19287.m44468(i2, i3, c11418M50717);
                            arrayList.add(c19287);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        } else {
            final C18955 c18955M17087 = m17087(c11393, c22681M28157, str2);
            c18955M17087.add(str);
            final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
            interfaceC7997 = new InterfaceC7997() { // from class: l.ܺܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c10415 = c10414;
                    char[] cArr = charArray;
                    char[] cArr2 = charArray2;
                    char[] cArr3 = charArray3;
                    C11393 c11394 = c11393;
                    C18955 c18955 = c18955M17087;
                    ConcurrentMapC10942 concurrentMapC10943 = concurrentMapC10942;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c10415.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 c11418M50717 = c22706.m50717();
                        ArrayList<int[]> arrayListM10367 = C3400.m10367(c11418M50717.getValue(), c11418M50717.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, c11394, c18955, concurrentMapC10943);
                        if (arrayListM10367.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM10367) {
                            C19287 c19287 = new C19287(0);
                            int i2 = iArr[0];
                            c19287.f60684 = i2;
                            int i3 = iArr[1];
                            c19287.f60685 = i3;
                            c19287.m44468(i2, i3, c11418M50717);
                            arrayList.add(c19287);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        m17093(c12366, (InterfaceC19992) new C18881(interfaceC7997, c12366, str, str2), interfaceC4469, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17099(C12366 c12366, String str, InterfaceC4469 interfaceC4469) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(str);
        InterfaceC8566[] interfaceC8566Arr = (InterfaceC8566[]) C5378.stream(c12366.m30049()).map(new C23519(4)).filter(new C6586(2)).toArray(new C13986(2));
        while (true) {
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC8566 interfaceC8566 : interfaceC8566Arr) {
                    boolean zContains = hashSet.contains(interfaceC8566.mo2695());
                    if (!zContains) {
                        Iterator it = interfaceC8566.mo2699().iterator();
                        while (it.hasNext()) {
                            if (hashSet.contains((String) it.next())) {
                                zContains = true;
                                break;
                            }
                        }
                    }
                    if (zContains) {
                        String type = interfaceC8566.getType();
                        if (hashSet2.add(type)) {
                            arrayList.add(type);
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
            } else {
                m17093(c12366, (InterfaceC19992) new C19587(new C11505(hashSet2), c12366, str), interfaceC4469, false);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.᩷ܽۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17091(C12366 c12366, final C11393 c11393, String str, String str2, InterfaceC4469 interfaceC4469) {
        C12164 c12164Matcher = C11459.m28260("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c12164Matcher.matches()) {
            C4925.m14315(new RunnableC7014(interfaceC4469, str, str2));
            return;
        }
        String strGroup = c12164Matcher.group(1);
        C11003.requireNonNull(strGroup);
        String strM11985 = C3939.m11985(strGroup);
        String strGroup2 = c12164Matcher.group(2);
        C11003.requireNonNull(strGroup2);
        String strM11986 = C3939.m11985(strGroup2);
        String strGroup3 = c12164Matcher.group(3);
        C11003.requireNonNull(strGroup3);
        String str3 = strM11985 + "\\s*\\(\\s*" + strM11986 + "\\s*\\)\\s*" + C3939.m11985(strGroup3);
        final C18955 c18955M17087 = m17087(c11393, c11393.m28157(str), str2);
        c18955M17087.add(str);
        final C15051 c15051M9357 = C3058.m9357(str3, true, true);
        final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        m17093(c12366, (InterfaceC19992) new C0535(new InterfaceC7997() { // from class: l.᩷ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                C11393 c11394 = c11393;
                C18955 c18955 = c18955M17087;
                ConcurrentMapC10942 concurrentMapC10943 = concurrentMapC10942;
                C15051 c15051 = c15051M9357;
                try {
                    C7980 c7980Mo31674 = ((InterfaceC13508) obj).mo31674();
                    if (c7980Mo31674 == null || !C6180.m17097(c11394, c18955, c7980Mo31674.getType(), concurrentMapC10943)) {
                        return null;
                    }
                    for (InterfaceC18444 interfaceC18444 : c7980Mo31674.getMethods()) {
                        int iMo3567 = interfaceC18444.mo3567();
                        if (!EnumC15657.PRIVATE.m36866(iMo3567) && !EnumC15657.STATIC.m36866(iMo3567)) {
                            String strM34249 = C14354.m34249((InterfaceC5471) interfaceC18444, true);
                            C12164 c12164 = c15051.get();
                            c12164.m29615reset((CharSequence) strM34249);
                            if (c12164.matches()) {
                                C19287 c19287 = new C19287(3);
                                c19287.f60684 = 0;
                                c19287.f60685 = interfaceC18444.getName().length();
                                c19287.f60681 = interfaceC18444.getName();
                                c19287.f60683 = interfaceC18444.mo3568();
                                StringBuilder sb = new StringBuilder();
                                Iterator it = interfaceC18444.mo3565().iterator();
                                while (it.hasNext()) {
                                    sb.append((CharSequence) it.next());
                                }
                                c19287.f60679 = sb.toString();
                                c19287.m44475(interfaceC18444, c19287.f60684, c19287.f60685);
                                return Collections.singletonList(c19287);
                            }
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c12366, str, str2), interfaceC4469, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18955 m17087(C11393 c11393, C22681 c22681, String str) {
        C22681 c22681M28157;
        C18955 c18955 = new C18955();
        if (c22681 != null) {
            String str2 = c22681.f73202;
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(str2);
            while (!linkedList.isEmpty()) {
                String str3 = (String) linkedList.removeFirst();
                if (str3 != null && hashSet.add(str3) && (c22681M28157 = c11393.m28157(str3)) != null) {
                    if (!str3.equals(str2)) {
                        for (String str4 : c22681M28157.f73206) {
                            if (str4.equals(str)) {
                                c18955.add(c22681M28157.f73202);
                                break;
                            }
                        }
                    }
                    linkedList.add(c22681M28157.f73204);
                    Collections.addAll(linkedList, c22681M28157.f73203);
                }
            }
        }
        return c18955;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17097(C11393 c11393, C18955 c18955, String str, ConcurrentMapC10942 concurrentMapC10942) {
        Boolean boolValueOf = (Boolean) concurrentMapC10942.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(m17096(c11393, c18955, str, new HashSet()));
            concurrentMapC10942.put(str, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17096(C11393 c11393, C18955 c18955, String str, HashSet hashSet) {
        if (c18955.contains(str)) {
            return true;
        }
        hashSet.add(str);
        C22681 c22681M28157 = c11393.m28157(str);
        if (c22681M28157 != null) {
            String str2 = c22681M28157.f73204;
            if (str2 != null && !hashSet.contains(str2) && m17096(c11393, c18955, str2, hashSet)) {
                return true;
            }
            for (String str3 : c22681M28157.f73203) {
                if (!hashSet.contains(str3) && m17096(c11393, c18955, str3, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17088(C12366 c12366, String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC4469 interfaceC4469, Predicate predicate) {
        m17093(c12366, (InterfaceC19992) new C3358(i, str, z3, z2, z4, c12366, j, str2, z, predicate), interfaceC4469, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17093(final C12366 c12366, final InterfaceC19992 interfaceC19992, final InterfaceC4469 interfaceC4469, boolean z) {
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: l.ۜܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC19992 interfaceC19993 = interfaceC19992;
                InterfaceC7997 interfaceC7997Mo2262 = interfaceC19993.mo2262();
                final InterfaceC4469 interfaceC44610 = interfaceC4469;
                if (interfaceC7997Mo2262 == null) {
                    C4925.m14315(new RunnableC19009(5, interfaceC44610));
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                interfaceC19993.mo2263(concurrentLinkedQueue);
                interfaceC44610.mo3375(0);
                C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C2144(interfaceC44610));
                C8817 c8817M22790 = C8817.m22790();
                final ArrayList arrayList2 = arrayList;
                RunnableC13235 runnableC13235 = new RunnableC13235(concurrentLinkedQueue, interfaceC44610, c19277, interfaceC7997Mo2262, arrayList2, c8817M22790);
                C12366 c12367 = c12366;
                c12367.m30051();
                C3058.m9358(C17615.f53826, runnableC13235);
                c12367.m30061();
                C4925.m14315(new Runnable() { // from class: l.۟ۧۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4469 interfaceC44611 = interfaceC44610;
                        if (interfaceC44611.mo3373()) {
                            C21374.m48465();
                        }
                        interfaceC44611.mo3372(interfaceC19993.mo2261(arrayList2));
                        interfaceC44611.mo3374();
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17100(InterfaceC8566 interfaceC8566, C12164 c12164, boolean z) {
        C12164 c12165 = c12164;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo2694 = interfaceC8566.mo2694();
        if (strMo2694 != null) {
            c12165.m29615reset((CharSequence) strMo2694);
            if (!z ? C5898.m16539(c12164) : c12164.matches()) {
                C19287 c19287 = new C19287(1);
                String strM33622 = C14020.m33622(strMo2694);
                int iM9354 = C3058.m9354(c12164.start(), 0, 0, strMo2694);
                c19287.m44469(iM9354 + 9, C3058.m9354(c12164.end(), c12164.start(), iM9354, strMo2694) + 9, C4860.m14172(".source \"", strM33622, "\""));
                arrayList.add(c19287);
            }
        }
        Iterator it = interfaceC8566.getAnnotations().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = 0;
            for (InterfaceC9272 interfaceC9272 : ((InterfaceC20561) it.next()).getElements()) {
                if (m17095(interfaceC9272.getValue(), c12165, z)) {
                    C19287 c19288 = new C19287(2);
                    c19288.m44473(interfaceC9272, c12165);
                    c19288.f60684 = i;
                    c19288.f60685 = i2;
                    arrayList.add(c19288);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            Iterator it2 = interfaceC3627.getAnnotations().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = 0;
                for (InterfaceC9272 interfaceC9273 : ((InterfaceC20561) it2.next()).getElements()) {
                    if (m17095(interfaceC9273.getValue(), c12165, z)) {
                        C19287 c19289 = new C19287(8);
                        c19289.f60681 = interfaceC3627.getName();
                        c19289.f60683 = interfaceC3627.getType();
                        c19289.m44473(interfaceC9273, c12165);
                        c19289.f60684 = i3;
                        c19289.f60685 = i4;
                        arrayList.add(c19289);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10410 interfaceC10410Mo11109 = interfaceC3627.mo11109();
            if (interfaceC10410Mo11109 != null && m17095(interfaceC10410Mo11109, c12165, z)) {
                C19287 c192810 = new C19287(9);
                c192810.f60681 = interfaceC3627.getName();
                c192810.f60683 = interfaceC3627.getType();
                c192810.m44471(interfaceC3627, c12165);
                arrayList.add(c192810);
            }
        }
        for (InterfaceC18444 interfaceC18444 : interfaceC8566.getMethods()) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = interfaceC18444.mo3565().iterator();
            while (it3.hasNext()) {
                sb.append((CharSequence) it3.next());
            }
            String string = sb.toString();
            Iterator it4 = interfaceC18444.getParameters().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Iterator it5 = ((InterfaceC0098) it4.next()).getAnnotations().iterator();
                while (it5.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC9272 interfaceC9274 : ((InterfaceC20561) it5.next()).getElements()) {
                        if (m17095(interfaceC9274.getValue(), c12165, z)) {
                            C19287 c192811 = new C19287(4);
                            c192811.f60681 = interfaceC18444.getName();
                            c192811.f60683 = interfaceC18444.mo3568();
                            c192811.f60679 = string;
                            c192811.m44473(interfaceC9274, c12165);
                            c192811.f60684 = i5;
                            c192811.f60685 = i6;
                            arrayList.add(c192811);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            Iterator it6 = interfaceC18444.getAnnotations().iterator();
            while (it6.hasNext()) {
                int i7 = 0;
                for (InterfaceC9272 interfaceC9275 : ((InterfaceC20561) it6.next()).getElements()) {
                    if (m17095(interfaceC9275.getValue(), c12165, z)) {
                        C19287 c192812 = new C19287(4);
                        c192812.f60681 = interfaceC18444.getName();
                        c192812.f60683 = interfaceC18444.mo3568();
                        c192812.f60679 = string;
                        c192812.m44473(interfaceC9275, c12165);
                        c192812.f60684 = i5;
                        c192812.f60685 = i7;
                        arrayList.add(c192812);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
            if (interfaceC19150Mo3570 != null) {
                int i8 = 0;
                for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                    if (interfaceC22677.mo3975() != EnumC0841.f3065) {
                        EnumC3664 enumC3664 = interfaceC22677.mo3975().f3316;
                        if ((enumC3664 == EnumC3664.Format21c || enumC3664 == EnumC3664.Format31c) && interfaceC22677.mo3975().f3318 == 0) {
                            String string2 = ((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString();
                            c12165.m29615reset((CharSequence) string2);
                            if (!z ? C5898.m16539(c12164) : c12164.matches()) {
                                C19287 c192813 = new C19287(5);
                                try {
                                    int iMo3818 = interfaceC18444.mo3570().mo3818();
                                    InterfaceC18842 interfaceC18842 = C17177.f52643;
                                    int iM40411 = C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567()));
                                    C11418 c11418 = new C11418();
                                    C3438 c3438 = new C3438(new C22706(c11418));
                                    c11418.m28186(interfaceC22677.mo3975().f3315);
                                    c11418.append(' ');
                                    int iMo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                                    int i9 = iMo3818 - iM40411;
                                    if (iMo1790 >= i9) {
                                        c3438.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                        c3438.m10510(iMo1790 - i9);
                                    } else {
                                        c3438.write(118);
                                        c3438.m10510(iMo1790);
                                    }
                                    c11418.m28186(", \"");
                                    String strM33623 = C14020.m33622(string2);
                                    int iM9355 = C3058.m9354(c12164.start(), 0, 0, string2);
                                    c192813.m44469(c11418.length() + iM9355, c11418.length() + C3058.m9354(c12164.end(), c12164.start(), iM9355, string2), ((Object) c11418) + strM33623 + "\"");
                                } catch (IOException unused) {
                                }
                                c192813.f60681 = interfaceC18444.getName();
                                c192813.f60683 = interfaceC18444.mo3568();
                                c192813.f60679 = string;
                                c192813.f60684 = i8;
                                arrayList.add(c192813);
                            }
                        }
                        i8++;
                        c12165 = c12164;
                    }
                }
            }
            c12165 = c12164;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17095(InterfaceC10410 interfaceC10410, C12164 c12164, boolean z) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 23) {
            c12164.m29615reset((CharSequence) ((InterfaceC17507) interfaceC10410).getValue());
            if (z) {
                return c12164.matches();
            }
            return C5898.m16539(c12164);
        }
        if (iMo2302 == 28) {
            Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
            while (it.hasNext()) {
                if (m17095((InterfaceC10410) it.next(), c12164, z)) {
                    return true;
                }
            }
            return false;
        }
        if (iMo2302 != 29) {
            return false;
        }
        Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
        while (it2.hasNext()) {
            if (m17095(((InterfaceC9272) it2.next()).getValue(), c12164, z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17094(C4047 c4047, C12164 c12164, boolean z, boolean z2, boolean z3) {
        if (z2) {
            c12164.m29615reset(c4047.m12149());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
            c12164.m29615reset(c4047.m12152());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
        }
        if (z3) {
            c12164.m29615reset(c4047.m12151());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
        }
        c12164.m29615reset(c4047.m12153());
        return z ? c12164.matches() : C5898.m16539(c12164);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17098(InterfaceC8566 interfaceC8566, C12164 c12164, boolean z) {
        boolean z2;
        String strM37867;
        boolean z3;
        int iStart;
        int iEnd;
        int i;
        if (interfaceC8566 != null) {
            InterfaceC15194 interfaceC15194ListIterator = new C21983(c12164.pattern().pattern().toCharArray()).listIterator(0);
            while (true) {
                if (!interfaceC15194ListIterator.hasNext()) {
                    z2 = false;
                    strM37867 = null;
                    break;
                }
                if (interfaceC15194ListIterator.mo7691() == '\\' && interfaceC15194ListIterator.hasNext() && interfaceC15194ListIterator.mo7691() == '.') {
                    String type = interfaceC8566.getType();
                    strM37867 = C16014.m37867(type.substring(1, type.length() - 1).replace('/', '.'), ".");
                    z2 = true;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC18444 interfaceC18444 : interfaceC8566.getMethods()) {
                if (z2) {
                    StringBuilder sbM15339 = C5368.m15339(strM37867);
                    sbM15339.append(interfaceC18444.getName());
                    c12164.m29615reset((CharSequence) sbM15339.toString());
                    if (!z ? !C5898.m16539(c12164) || c12164.end() <= strM37867.length() : !c12164.matches()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    iEnd = c12164.end() - strM37867.length();
                    i = 0;
                } else {
                    c12164.m29615reset((CharSequence) interfaceC18444.getName());
                    if (z) {
                        if (c12164.matches()) {
                            iStart = c12164.start();
                            iEnd = c12164.end();
                            i = iStart;
                            z3 = true;
                        } else {
                            i = 0;
                            iEnd = 0;
                        }
                    } else if (C5898.m16539(c12164)) {
                        iStart = c12164.start();
                        iEnd = c12164.end();
                        i = iStart;
                        z3 = true;
                    } else {
                        i = 0;
                        iEnd = 0;
                    }
                }
                if (z3) {
                    C19287 c19287 = new C19287(3);
                    c19287.f60684 = i;
                    c19287.f60685 = iEnd;
                    c19287.f60681 = interfaceC18444.getName();
                    c19287.f60683 = interfaceC18444.mo3568();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC18444.mo3565().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    c19287.f60679 = sb.toString();
                    c19287.m44475(interfaceC18444, i, iEnd);
                    arrayList.add(c19287);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17084(InterfaceC8566 interfaceC8566, C12164 c12164, boolean z) {
        int iStart;
        int iEnd;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            c12164.m29615reset((CharSequence) interfaceC3627.getName());
            boolean z2 = true;
            if (!z) {
                if (C5898.m16539(c12164)) {
                    iStart = c12164.start();
                    iEnd = c12164.end();
                } else {
                    z2 = false;
                    iStart = 0;
                    iEnd = 0;
                }
            } else if (c12164.matches()) {
                iStart = c12164.start();
                iEnd = c12164.end();
            } else {
                z2 = false;
                iStart = 0;
                iEnd = 0;
            }
            if (z2) {
                C19287 c19287 = new C19287(7);
                c19287.f60684 = iStart;
                c19287.f60685 = iEnd;
                c19287.f60681 = interfaceC3627.getName();
                c19287.f60683 = interfaceC3627.getType();
                C11418 c11418 = new C11418();
                c11418.m28186(".field ");
                for (EnumC15657 enumC15657 : EnumC15657.m36864(interfaceC3627.mo11110())) {
                    c11418.m28186(enumC15657.toString());
                    c11418.append(' ');
                }
                int length = c11418.length() + iStart;
                int length2 = c11418.length() + iEnd;
                c11418.m28186(interfaceC3627.getName());
                c11418.append(':');
                c11418.m28186(interfaceC3627.getType());
                InterfaceC10410 interfaceC10410Mo11109 = interfaceC3627.mo11109();
                if (interfaceC10410Mo11109 != null) {
                    c11418.m28186(" = ");
                    try {
                        AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410Mo11109);
                    } catch (IOException unused) {
                    }
                }
                c19287.m44469(length, length2, c11418.toString());
                arrayList.add(c19287);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17083(InterfaceC8566 interfaceC8566, long j) {
        Iterator it;
        Iterator it2;
        InterfaceC8835 interfaceC8835;
        Iterator it3;
        String string;
        InterfaceC10410 interfaceC10410M17086;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = interfaceC8566.getAnnotations().iterator();
        int i = 0;
        while (it4.hasNext()) {
            int i2 = 0;
            for (InterfaceC9272 interfaceC9272 : ((InterfaceC20561) it4.next()).getElements()) {
                InterfaceC10410 interfaceC10410M17087 = m17086(interfaceC9272.getValue(), j);
                if (interfaceC10410M17087 != null) {
                    C19287 c19287 = new C19287(2);
                    c19287.f60684 = i;
                    c19287.f60685 = i2;
                    c19287.m44472(interfaceC9272, interfaceC10410M17087);
                    arrayList.add(c19287);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            Iterator it5 = interfaceC3627.getAnnotations().iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                int i4 = 0;
                for (InterfaceC9272 interfaceC9273 : ((InterfaceC20561) it5.next()).getElements()) {
                    InterfaceC10410 interfaceC10410M17088 = m17086(interfaceC9273.getValue(), j);
                    if (interfaceC10410M17088 != null) {
                        C19287 c19288 = new C19287(8);
                        c19288.f60681 = interfaceC3627.getName();
                        c19288.f60683 = interfaceC3627.getType();
                        c19288.m44472(interfaceC9273, interfaceC10410M17088);
                        c19288.f60684 = i3;
                        c19288.f60685 = i4;
                        arrayList.add(c19288);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10410 interfaceC10410Mo11109 = interfaceC3627.mo11109();
            if (interfaceC10410Mo11109 != null && (interfaceC10410M17086 = m17086(interfaceC10410Mo11109, j)) != null) {
                C19287 c19289 = new C19287(9);
                c19289.f60681 = interfaceC3627.getName();
                c19289.f60683 = interfaceC3627.getType();
                c19289.m44470(interfaceC3627, interfaceC10410M17086);
                arrayList.add(c19289);
            }
        }
        Iterator it6 = interfaceC8566.getMethods().iterator();
        while (it6.hasNext()) {
            InterfaceC18444 interfaceC18444 = (InterfaceC18444) it6.next();
            StringBuilder sb = new StringBuilder();
            Iterator it7 = interfaceC18444.mo3565().iterator();
            while (it7.hasNext()) {
                sb.append((CharSequence) it7.next());
            }
            String string2 = sb.toString();
            Iterator it8 = interfaceC18444.getParameters().iterator();
            int i5 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((InterfaceC0098) it8.next()).getAnnotations().iterator();
                while (it9.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC9272 interfaceC9274 : ((InterfaceC20561) it9.next()).getElements()) {
                        InterfaceC10410 interfaceC10410M17089 = m17086(interfaceC9274.getValue(), j);
                        if (interfaceC10410M17089 != null) {
                            C19287 c192810 = new C19287(4);
                            c192810.f60681 = interfaceC18444.getName();
                            c192810.f60683 = interfaceC18444.mo3568();
                            c192810.f60679 = string2;
                            c192810.m44472(interfaceC9274, interfaceC10410M17089);
                            c192810.f60684 = i5;
                            c192810.f60685 = i6;
                            arrayList.add(c192810);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            char c = 0;
            Iterator it10 = interfaceC18444.getAnnotations().iterator();
            while (it10.hasNext()) {
                int i7 = 0;
                for (InterfaceC9272 interfaceC9275 : ((InterfaceC20561) it10.next()).getElements()) {
                    InterfaceC10410 interfaceC10410M170810 = m17086(interfaceC9275.getValue(), j);
                    if (interfaceC10410M170810 != null) {
                        C19287 c192811 = new C19287(4);
                        c192811.f60681 = interfaceC18444.getName();
                        c192811.f60683 = interfaceC18444.mo3568();
                        c192811.f60679 = string2;
                        c192811.m44472(interfaceC9275, interfaceC10410M170810);
                        c192811.f60684 = i5;
                        c192811.f60685 = i7;
                        arrayList.add(c192811);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
            if (interfaceC19150Mo3570 != null) {
                int i8 = 0;
                for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                    if (interfaceC22677.mo3975() != EnumC0841.f3065) {
                        if (!(interfaceC22677 instanceof InterfaceC7155) && !(interfaceC22677 instanceof C12131)) {
                            int[] iArr = C12530.f37648;
                            int i9 = 1;
                            int i10 = 6;
                            switch (iArr[interfaceC22677.mo3975().f3316.ordinal()]) {
                                case 9:
                                    InterfaceC8835 interfaceC8836 = (InterfaceC8835) interfaceC22677;
                                    Iterator it11 = interfaceC8836.mo19045().iterator();
                                    int i11 = 0;
                                    while (it11.hasNext()) {
                                        Number number = (Number) it11.next();
                                        if (number.longValue() == j) {
                                            C19287 c192812 = new C19287(i10);
                                            int iMo19046 = interfaceC8836.mo19046();
                                            String str = iMo19046 != i9 ? iMo19046 != 2 ? "" : am.aB : am.aI;
                                            try {
                                                C11418 c11418 = new C11418();
                                                it2 = it6;
                                                try {
                                                    C3438 c3438 = new C3438(new C22706(c11418));
                                                    interfaceC8835 = interfaceC8836;
                                                    it3 = it11;
                                                    try {
                                                        C4718.m13817(c3438, number.longValue());
                                                        c3438.write(str, 0, str.length());
                                                        string = c11418.toString();
                                                    } catch (IOException e) {
                                                        e = e;
                                                        string = e.toString();
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    interfaceC8835 = interfaceC8836;
                                                    it3 = it11;
                                                    string = e.toString();
                                                    c192812.m44469(17, string.length() + 17, C4860.m14172(".array-data {... ", string, " ...}"));
                                                    c192812.f60681 = interfaceC18444.getName();
                                                    c192812.f60683 = interfaceC18444.mo3568();
                                                    c192812.f60679 = string2;
                                                    c192812.f60684 = i8;
                                                    c192812.f60685 = i11;
                                                    arrayList.add(c192812);
                                                    i11++;
                                                    i9 = 1;
                                                    i10 = 6;
                                                    interfaceC8836 = interfaceC8835;
                                                    it11 = it3;
                                                    it6 = it2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                it2 = it6;
                                            }
                                            c192812.m44469(17, string.length() + 17, C4860.m14172(".array-data {... ", string, " ...}"));
                                            c192812.f60681 = interfaceC18444.getName();
                                            c192812.f60683 = interfaceC18444.mo3568();
                                            c192812.f60679 = string2;
                                            c192812.f60684 = i8;
                                            c192812.f60685 = i11;
                                            arrayList.add(c192812);
                                        } else {
                                            it2 = it6;
                                            interfaceC8835 = interfaceC8836;
                                            it3 = it11;
                                        }
                                        i11++;
                                        i9 = 1;
                                        i10 = 6;
                                        interfaceC8836 = interfaceC8835;
                                        it11 = it3;
                                        it6 = it2;
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 10:
                                    int i12 = 0;
                                    for (InterfaceC18007 interfaceC18007 : ((InterfaceC17301) interfaceC22677).mo8107()) {
                                        if (interfaceC18007.getKey() == j) {
                                            C19287 c192813 = new C19287(6);
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Integer.valueOf(interfaceC18007.getKey());
                                            c192813.m44469(20, 28, String.format(".packed-switch {... %08x ...}", objArr));
                                            c192813.f60681 = interfaceC18444.getName();
                                            c192813.f60683 = interfaceC18444.mo3568();
                                            c192813.f60679 = string2;
                                            c192813.f60684 = i8;
                                            c192813.f60685 = i12;
                                            arrayList.add(c192813);
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
                                    for (InterfaceC18007 interfaceC18008 : ((InterfaceC17301) interfaceC22677).mo8107()) {
                                        if (interfaceC18008.getKey() == j) {
                                            C19287 c192814 = new C19287(6);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c] = Integer.valueOf(interfaceC18008.getKey());
                                            c192814.m44469(20, 28, String.format(".sparse-switch {... %08x ...}", objArr2));
                                            c192814.f60681 = interfaceC18444.getName();
                                            c192814.f60683 = interfaceC18444.mo3568();
                                            c192814.f60679 = string2;
                                            c192814.f60684 = i8;
                                            c192814.f60685 = i13;
                                            arrayList.add(c192814);
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
                                    switch (iArr[interfaceC22677.mo3975().f3316.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (((InterfaceC9541) interfaceC22677).mo4920() == j) {
                                                C19287 c192815 = new C19287(5);
                                                try {
                                                    int iMo3818 = interfaceC18444.mo3570().mo3818();
                                                    InterfaceC18842 interfaceC18842 = C17177.f52643;
                                                    int iM40411 = C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567()));
                                                    System.out.println(interfaceC18444 + " " + iMo3818 + " " + iM40411);
                                                    C11418 c11419 = new C11418();
                                                    C3438 c3439 = new C3438(new C22706(c11419));
                                                    c11419.m28186(interfaceC22677.mo3975().f3315);
                                                    switch (C7591.f23464[interfaceC22677.mo3975().f3316.ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            c11419.append(' ');
                                                            int iMo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                                                            int i14 = iMo3818 - iM40411;
                                                            if (iMo1790 >= i14) {
                                                                c3439.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c3439.m10510(iMo1790 - i14);
                                                            } else {
                                                                c3439.write(118);
                                                                c3439.m10510(iMo1790);
                                                            }
                                                            c11419.m28186(", ");
                                                            int length = c11419.length();
                                                            C4718.m13817(c3439, ((InterfaceC9541) interfaceC22677).mo4920());
                                                            c192815.m44469(length, c11419.length(), c11419.toString());
                                                            break;
                                                        case 7:
                                                        case 8:
                                                            c11419.append(' ');
                                                            int iMo1791 = ((InterfaceC1779) interfaceC22677).mo1790();
                                                            int i15 = iMo3818 - iM40411;
                                                            if (iMo1791 >= i15) {
                                                                c3439.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c3439.m10510(iMo1791 - i15);
                                                            } else {
                                                                c3439.write(118);
                                                                c3439.m10510(iMo1791);
                                                            }
                                                            c11419.m28186(", ");
                                                            int iMo7930 = ((InterfaceC23651) interfaceC22677).mo7930();
                                                            if (iMo7930 >= i15) {
                                                                c3439.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c3439.m10510(iMo7930 - i15);
                                                            } else {
                                                                c3439.write(118);
                                                                c3439.m10510(iMo7930);
                                                            }
                                                            c11419.m28186(", ");
                                                            int length2 = c11419.length();
                                                            C4718.m13817(c3439, ((InterfaceC9541) interfaceC22677).mo4920());
                                                            c192815.m44469(length2, c11419.length(), c11419.toString());
                                                            break;
                                                    }
                                                } catch (IOException unused) {
                                                }
                                                c192815.f60681 = interfaceC18444.getName();
                                                c192815.f60683 = interfaceC18444.mo3568();
                                                c192815.f60679 = string2;
                                                c192815.f60684 = i8;
                                                arrayList.add(c192815);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10410 m17086(InterfaceC10410 interfaceC10410, long j) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 != 0) {
            if (iMo2302 != 6) {
                if (iMo2302 != 2) {
                    if (iMo2302 != 3) {
                        if (iMo2302 != 4) {
                            if (iMo2302 == 28) {
                                Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
                                while (it.hasNext()) {
                                    InterfaceC10410 interfaceC10410M17086 = m17086((InterfaceC10410) it.next(), j);
                                    if (interfaceC10410M17086 != null) {
                                        return interfaceC10410M17086;
                                    }
                                }
                                return null;
                            }
                            if (iMo2302 != 29) {
                                return null;
                            }
                            Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
                            while (it2.hasNext()) {
                                InterfaceC10410 interfaceC10410M17087 = m17086(((InterfaceC9272) it2.next()).getValue(), j);
                                if (interfaceC10410M17087 != null) {
                                    return interfaceC10410M17087;
                                }
                            }
                            return null;
                        }
                        if (((InterfaceC13936) interfaceC10410).getValue() != j) {
                            return null;
                        }
                    } else if (((InterfaceC13231) interfaceC10410).getValue() != j) {
                        return null;
                    }
                } else if (((InterfaceC18213) interfaceC10410).getValue() != j) {
                    return null;
                }
            } else if (((InterfaceC7587) interfaceC10410).getValue() != j) {
                return null;
            }
        } else if (((InterfaceC3354) interfaceC10410).getValue() != j) {
            return null;
        }
        return interfaceC10410;
    }
}
