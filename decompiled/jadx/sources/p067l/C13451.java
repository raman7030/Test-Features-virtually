package p067l;

import android.os.Bundle;
import android.os.Parcel;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13451 {
    /* JADX INFO: renamed from: ֫ */
    public static void m30592(ArrayList arrayList, AbstractC17043 abstractC17043, C8086 c8086, C10145 c10145) {
        boolean zMo25094 = abstractC17043.mo25094();
        try {
            m30594(arrayList, abstractC17043, c8086, c10145);
        } catch (Throwable th) {
            if (!zMo25094) {
                abstractC17043.mo25503();
            } else {
                abstractC17043.m38684("dex").mo25503();
            }
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0316  */
    /* JADX WARN: Code duplicated, block: B:157:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01e9 A[EDGE_INSN: B:162:0x01e9->B:57:0x01e9 BREAK  A[LOOP:3: B:54:0x01d1->B:56:0x01e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[Catch: Exception -> 0x0253, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6 A[Catch: Exception -> 0x0253, LOOP:3: B:54:0x01d1->B:56:0x01e6, LOOP_END, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01a4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.۬ۛ֡] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [l.۬ۛ֡] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: ۧ */
    public static void m30594(ArrayList arrayList, AbstractC17043 abstractC17043, C8086 c8086, C10145 c10145) throws IOException {
        AbstractC17043 abstractC17044;
        int i;
        HashMap map;
        boolean z;
        ?? M33467;
        IOException iOException;
        boolean[] zArr;
        ?? r13;
        ?? r14;
        ?? r8;
        String str;
        ?? r9;
        int i2;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("dex");
        abstractC17043M38684.mo25503();
        abstractC17043M38684.m38666();
        AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684("config");
        abstractC17043M38685.m38666();
        Bundle bundle = new Bundle();
        AbstractC17043 abstractC17043M38686 = abstractC17043M38684.m38684(AbstractC0213e.f989m);
        abstractC17043M38686.m38666();
        final HashMap map2 = new HashMap();
        Collator collator = Collator.getInstance(Locale.ENGLISH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17045 = (AbstractC17043) it.next();
            map2.put(abstractC17045, new C12169(collator, abstractC17045.getName(), false));
        }
        Collections.sort(arrayList, C10162.comparing(new Function() { // from class: l.ۤۧۢ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (C12169) map2.get((AbstractC17043) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }));
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        Iterator it2 = arrayList.iterator();
        HashMap map5 = map4;
        boolean z2 = false;
        HashMap map6 = map3;
        HashSet hashSet3 = hashSet2;
        HashSet hashSet4 = hashSet;
        while (it2.hasNext()) {
            ?? r15 = (AbstractC17043) it2.next();
            HashSet hashSet5 = new HashSet(hashSet4);
            HashSet hashSet6 = new HashSet(hashSet3);
            HashMap map7 = new HashMap(map6);
            HashSet hashSet7 = hashSet4;
            HashMap map8 = new HashMap(map5);
            HashSet hashSet8 = hashSet3;
            try {
                byte[] bArrM38664 = r15.m38664();
                String name = r15.getName();
                String strM9926 = C4686.m9926(C4686.m9924(name));
                map = map5;
                try {
                    if (!name.endsWith(".dex")) {
                        map8.put(strM9926, name);
                    }
                    abstractC17043M38686.m38684(strM9926).m38660(bArrM38664);
                    abstractC17043M38684.m38684("smali/" + strM9926).m38666();
                    C11996 c11996 = new C11996();
                    M33467 = C14645.m33467(bArrM38664);
                    if (M33467.m33484() != 0) {
                        abstractC17043M38684 = abstractC17043M38684;
                        try {
                            bundle.putBoolean("opt_has_api_mod", true);
                        } catch (Exception e) {
                            e = e;
                            abstractC17043M38685 = abstractC17043M38685;
                            bundle = bundle;
                            r13 = r15;
                            map6 = map6;
                            r14 = r13;
                            it2 = it2;
                            z = z2;
                            M33467 = r14;
                            iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                            if (!z) {
                            }
                            ActivityC18686 activityC18686 = (ActivityC18686) c10145.f28091;
                            int i3 = ActivityC18686.f55776;
                            zArr = new boolean[]{false};
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            C7050.m16212(new RunnableC19880(1, iOException, activityC18686, zArr, countDownLatch));
                            try {
                                countDownLatch.await();
                                if (!zArr[0]) {
                                    throw new C14662();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC17043M38684 = abstractC17043M38684;
                                bundle = bundle;
                                abstractC17043M38685 = abstractC17043M38685;
                                it2 = it2;
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else {
                        abstractC17043M38684 = abstractC17043M38684;
                    }
                    M33467.m33473(strM9926);
                    int iM33494 = M33467.m33494();
                    int i4 = 0;
                    while (i4 < iM33494) {
                        int i5 = iM33494;
                        int iM33469 = M33467.m33469(i4);
                        bundle = bundle;
                        try {
                            int iM33483 = M33467.m33483(i4);
                            abstractC17043M38685 = abstractC17043M38685;
                            try {
                                String strM33497 = M33467.m33497(iM33469);
                                ?? r25 = M33467;
                                map6 = map6;
                                try {
                                    String strSubstring = strM33497.substring(1, strM33497.length() - 1);
                                    if (hashSet5.add(strSubstring)) {
                                        try {
                                            int iLastIndexOf = strSubstring.lastIndexOf(47);
                                            int i6 = iLastIndexOf + 1;
                                            String strSubstring2 = strSubstring.substring(i6);
                                            it2 = it2;
                                            z = z2;
                                            if (iLastIndexOf <= 130) {
                                                try {
                                                    if (m30593(strSubstring)) {
                                                        r9 = r15;
                                                        if (strSubstring2.length() > 100) {
                                                            strSubstring2 = strSubstring2.substring(0, 60) + "_" + Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L);
                                                        }
                                                        if (hashSet6.contains(strSubstring2)) {
                                                            i2 = 1;
                                                            while (true) {
                                                                if (hashSet6.contains(strSubstring2 + i2)) {
                                                                    break;
                                                                } else {
                                                                    i2++;
                                                                }
                                                            }
                                                            strSubstring2 = strSubstring2 + i2;
                                                        }
                                                        hashSet6.add(strSubstring2);
                                                        str = "# TOO_LONG_NAME/" + strSubstring2;
                                                        map7.put(strSubstring, str);
                                                        strSubstring = str;
                                                        r8 = r9;
                                                    } else if (strSubstring2.length() > 100) {
                                                        String strSubstring3 = strSubstring.substring(0, i6);
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(strSubstring2.substring(0, 50));
                                                        sb.append("_too_long_");
                                                        M33467 = r15;
                                                        try {
                                                            sb.append(Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L));
                                                            str = strSubstring3 + sb.toString();
                                                            map7.put(strSubstring, str);
                                                            r9 = M33467;
                                                            strSubstring = str;
                                                            r8 = r9;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                                                            if (!z) {
                                                            }
                                                            ActivityC18686 activityC18687 = (ActivityC18686) c10145.f28091;
                                                            int i7 = ActivityC18686.f55776;
                                                            zArr = new boolean[]{false};
                                                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                                            C7050.m16212(new RunnableC19880(1, iOException, activityC18687, zArr, countDownLatch2));
                                                            countDownLatch2.await();
                                                            if (!zArr[0]) {
                                                                throw new C14662();
                                                            }
                                                            hashSet4 = hashSet7;
                                                            hashSet3 = hashSet8;
                                                            map5 = map;
                                                            map6 = map6;
                                                            z2 = z;
                                                            abstractC17043M38684 = abstractC17043M38684;
                                                            bundle = bundle;
                                                            abstractC17043M38685 = abstractC17043M38685;
                                                            it2 = it2;
                                                        }
                                                    } else {
                                                        r8 = r15;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    M33467 = r15;
                                                    iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                                                    if (!z) {
                                                    }
                                                    ActivityC18686 activityC18688 = (ActivityC18686) c10145.f28091;
                                                    int i8 = ActivityC18686.f55776;
                                                    zArr = new boolean[]{false};
                                                    CountDownLatch countDownLatch3 = new CountDownLatch(1);
                                                    C7050.m16212(new RunnableC19880(1, iOException, activityC18688, zArr, countDownLatch3));
                                                    countDownLatch3.await();
                                                    if (!zArr[0]) {
                                                        throw new C14662();
                                                    }
                                                    hashSet4 = hashSet7;
                                                    hashSet3 = hashSet8;
                                                    map5 = map;
                                                    map6 = map6;
                                                    z2 = z;
                                                    abstractC17043M38684 = abstractC17043M38684;
                                                    bundle = bundle;
                                                    abstractC17043M38685 = abstractC17043M38685;
                                                    it2 = it2;
                                                }
                                            } else {
                                                r9 = r15;
                                                if (strSubstring2.length() > 100) {
                                                    strSubstring2 = strSubstring2.substring(0, 60) + "_" + Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L);
                                                }
                                                if (hashSet6.contains(strSubstring2)) {
                                                    i2 = 1;
                                                    while (true) {
                                                        if (hashSet6.contains(strSubstring2 + i2)) {
                                                            break;
                                                            break;
                                                        }
                                                        i2++;
                                                    }
                                                    strSubstring2 = strSubstring2 + i2;
                                                }
                                                hashSet6.add(strSubstring2);
                                                str = "# TOO_LONG_NAME/" + strSubstring2;
                                                map7.put(strSubstring, str);
                                                strSubstring = str;
                                                r8 = r9;
                                            }
                                            c11996.m27443((CharSequence) strSubstring);
                                            if (iM33483 != 0) {
                                                c11996.writeInt(Integer.MIN_VALUE | iM33469);
                                                c11996.writeInt(iM33483);
                                            } else {
                                                c11996.writeInt(iM33469);
                                            }
                                            M33467 = r8;
                                        } catch (Exception e5) {
                                            e = e5;
                                            it2 = it2;
                                            z = z2;
                                        }
                                    } else {
                                        it2 = it2;
                                        z = z2;
                                        M33467 = r15;
                                        c8086.m18755(name, strSubstring.replace('/', '.'));
                                    }
                                    try {
                                        i4++;
                                        r15 = M33467;
                                        iM33494 = i5;
                                        bundle = bundle;
                                        abstractC17043M38685 = abstractC17043M38685;
                                        hashSet5 = hashSet5;
                                        M33467 = r25;
                                        map6 = map6;
                                        it2 = it2;
                                        z2 = z;
                                    } catch (Exception e6) {
                                        e = e6;
                                        iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                                        if (!z) {
                                        }
                                        ActivityC18686 activityC18689 = (ActivityC18686) c10145.f28091;
                                        int i9 = ActivityC18686.f55776;
                                        zArr = new boolean[]{false};
                                        CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                        C7050.m16212(new RunnableC19880(1, iOException, activityC18689, zArr, countDownLatch4));
                                        countDownLatch4.await();
                                        if (!zArr[0]) {
                                            throw new C14662();
                                        }
                                        hashSet4 = hashSet7;
                                        hashSet3 = hashSet8;
                                        map5 = map;
                                        map6 = map6;
                                        z2 = z;
                                        abstractC17043M38684 = abstractC17043M38684;
                                        bundle = bundle;
                                        abstractC17043M38685 = abstractC17043M38685;
                                        it2 = it2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r14 = r15;
                                    it2 = it2;
                                    z = z2;
                                    M33467 = r14;
                                    iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                                    if (!z) {
                                    }
                                    ActivityC18686 activityC186810 = (ActivityC18686) c10145.f28091;
                                    int i10 = ActivityC18686.f55776;
                                    zArr = new boolean[]{false};
                                    CountDownLatch countDownLatch5 = new CountDownLatch(1);
                                    C7050.m16212(new RunnableC19880(1, iOException, activityC186810, zArr, countDownLatch5));
                                    countDownLatch5.await();
                                    if (!zArr[0]) {
                                        throw new C14662();
                                    }
                                    hashSet4 = hashSet7;
                                    hashSet3 = hashSet8;
                                    map5 = map;
                                    map6 = map6;
                                    z2 = z;
                                    abstractC17043M38684 = abstractC17043M38684;
                                    bundle = bundle;
                                    abstractC17043M38685 = abstractC17043M38685;
                                    it2 = it2;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                r13 = r15;
                                map6 = map6;
                                r14 = r13;
                                it2 = it2;
                                z = z2;
                                M33467 = r14;
                                iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                                if (!z) {
                                }
                                ActivityC18686 activityC186811 = (ActivityC18686) c10145.f28091;
                                int i11 = ActivityC18686.f55776;
                                zArr = new boolean[]{false};
                                CountDownLatch countDownLatch6 = new CountDownLatch(1);
                                C7050.m16212(new RunnableC19880(1, iOException, activityC186811, zArr, countDownLatch6));
                                countDownLatch6.await();
                                if (!zArr[0]) {
                                    throw new C14662();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC17043M38684 = abstractC17043M38684;
                                bundle = bundle;
                                abstractC17043M38685 = abstractC17043M38685;
                                it2 = it2;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            abstractC17043M38685 = abstractC17043M38685;
                            r13 = r15;
                        }
                    }
                    HashSet hashSet9 = hashSet5;
                    abstractC17043M38685 = abstractC17043M38685;
                    bundle = bundle;
                    it2 = it2;
                    abstractC17043M38686.m38684(strM9926 + "_list").m38654(c11996);
                    hashSet3 = hashSet6;
                    map6 = map7;
                    map5 = map8;
                    hashSet4 = hashSet9;
                    z2 = true;
                } catch (Exception e10) {
                    e = e10;
                    z = z2;
                    M33467 = r15;
                    iOException = new IOException(C7050.m16203(R.string.MT_Protector, M33467.getName(), e.getMessage()), e);
                    if (!z || it2.hasNext()) {
                        ActivityC18686 activityC186812 = (ActivityC18686) c10145.f28091;
                        int i12 = ActivityC18686.f55776;
                        zArr = new boolean[]{false};
                        CountDownLatch countDownLatch7 = new CountDownLatch(1);
                        C7050.m16212(new RunnableC19880(1, iOException, activityC186812, zArr, countDownLatch7));
                        countDownLatch7.await();
                        if (!zArr[0]) {
                            throw new C14662();
                        }
                        hashSet4 = hashSet7;
                        hashSet3 = hashSet8;
                        map5 = map;
                        map6 = map6;
                        z2 = z;
                        abstractC17043M38684 = abstractC17043M38684;
                        bundle = bundle;
                        abstractC17043M38685 = abstractC17043M38685;
                        it2 = it2;
                    } else {
                        throw iOException;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                map = map5;
            }
            abstractC17043M38684 = abstractC17043M38684;
            bundle = bundle;
            abstractC17043M38685 = abstractC17043M38685;
            it2 = it2;
        }
        AbstractC17043 abstractC17046 = abstractC17043M38685;
        Bundle bundle2 = bundle;
        HashMap map9 = map6;
        HashMap map10 = map5;
        if (map9.isEmpty()) {
            abstractC17044 = abstractC17046;
        } else {
            C11996 c11997 = new C11996();
            for (Map.Entry entry : map9.entrySet()) {
                c11997.m27443((CharSequence) entry.getKey());
                c11997.m27443((CharSequence) entry.getValue());
            }
            abstractC17044 = abstractC17046;
            abstractC17044.m38684("map").m38654(c11997);
        }
        if (!map10.isEmpty()) {
            C11996 c11998 = new C11996();
            for (Map.Entry entry2 : map10.entrySet()) {
                c11998.m27443((CharSequence) entry2.getKey());
                c11998.m27443((CharSequence) entry2.getValue());
            }
            abstractC17044.m38684("dex_name_map").m38654(c11998);
        }
        if (bundle2.isEmpty()) {
            i = 0;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            i = 0;
            bundle2.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC17044.m38684("options").m38660(bArrMarshall);
        }
        AbstractC17043 abstractC17043M38682 = ((AbstractC17043) arrayList.get(i)).m38682("resources.arsc");
        if (abstractC17043M38682.mo25094()) {
            AbstractC17043 abstractC17043M38687 = abstractC17043.m38684("data/resources.arsc");
            abstractC17043M38687.mo37342();
            abstractC17043M38682.m38658(abstractC17043M38687, (C19056) null, (InterfaceC7717) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30593(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '/' && (i = i + 1) >= 12) {
                return true;
            }
        }
        return false;
    }
}
