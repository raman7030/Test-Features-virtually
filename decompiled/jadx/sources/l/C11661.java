package l;

import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
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
public final class C11661 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28544(ArrayList arrayList, AbstractC15440 abstractC15440, C6016 c6016, C8182 c8182) {
        boolean zMo23120 = abstractC15440.mo23120();
        try {
            m28546(arrayList, abstractC15440, c6016, c8182);
        } catch (Throwable th) {
            if (!zMo23120) {
                abstractC15440.mo23552();
            } else {
                abstractC15440.m36526("dex").mo23552();
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m28546(ArrayList arrayList, AbstractC15440 abstractC15440, C6016 c6016, C8182 c8182) throws IOException {
        AbstractC15440 abstractC15441;
        int i;
        HashMap map;
        boolean z;
        ?? M31381;
        IOException iOException;
        boolean[] zArr;
        ?? r13;
        ?? r14;
        ?? r8;
        String str;
        ?? r9;
        int i2;
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("dex");
        abstractC15440M36526.mo23552();
        abstractC15440M36526.m36508();
        AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526("config");
        abstractC15440M36527.m36508();
        Bundle bundle = new Bundle();
        AbstractC15440 abstractC15440M36528 = abstractC15440M36526.m36526(e.m);
        abstractC15440M36528.m36508();
        final HashMap map2 = new HashMap();
        Collator collator = Collator.getInstance(Locale.ENGLISH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15442 = (AbstractC15440) it.next();
            map2.put(abstractC15442, new C10312(collator, abstractC15442.getName(), false));
        }
        Collections.sort(arrayList, C8200.comparing(new Function() { // from class: l.ۤۧۢ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (C10312) map2.get((AbstractC15440) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
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
            ?? r15 = (AbstractC15440) it2.next();
            HashSet hashSet5 = new HashSet(hashSet4);
            HashSet hashSet6 = new HashSet(hashSet3);
            HashMap map7 = new HashMap(map6);
            HashSet hashSet7 = hashSet4;
            HashMap map8 = new HashMap(map5);
            HashSet hashSet8 = hashSet3;
            try {
                byte[] bArrM36506 = r15.m36506();
                String name = r15.getName();
                String strM7878 = C2439.m7878(C2439.m7876(name));
                map = map5;
                try {
                    if (!name.endsWith(".dex")) {
                        map8.put(strM7878, name);
                    }
                    abstractC15440M36528.m36526(strM7878).m36502(bArrM36506);
                    abstractC15440M36526.m36526("smali/" + strM7878).m36508();
                    C10130 c10130 = new C10130();
                    M31381 = C12918.m31381(bArrM36506);
                    if (M31381.m31398() != 0) {
                        abstractC15440M36526 = abstractC15440M36526;
                        try {
                            bundle.putBoolean("opt_has_api_mod", true);
                        } catch (Exception e) {
                            e = e;
                            abstractC15440M36527 = abstractC15440M36527;
                            bundle = bundle;
                            r13 = r15;
                            map6 = map6;
                            r14 = r13;
                            it2 = it2;
                            z = z2;
                            M31381 = r14;
                            iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                            if (!z) {
                            }
                            ActivityC17169 activityC17169 = (ActivityC17169) c8182.f25180;
                            int i3 = ActivityC17169.f52595;
                            zArr = new boolean[]{false};
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            C4925.m14315(new RunnableC18426(1, iOException, activityC17169, zArr, countDownLatch));
                            try {
                                countDownLatch.await();
                                if (!zArr[0]) {
                                    throw new C12935();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC15440M36526 = abstractC15440M36526;
                                bundle = bundle;
                                abstractC15440M36527 = abstractC15440M36527;
                                it2 = it2;
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else {
                        abstractC15440M36526 = abstractC15440M36526;
                    }
                    M31381.m31387(strM7878);
                    int iM31408 = M31381.m31408();
                    int i4 = 0;
                    while (i4 < iM31408) {
                        int i5 = iM31408;
                        int iM31383 = M31381.m31383(i4);
                        bundle = bundle;
                        try {
                            int iM31397 = M31381.m31397(i4);
                            abstractC15440M36527 = abstractC15440M36527;
                            try {
                                String strM31411 = M31381.m31411(iM31383);
                                ?? r25 = M31381;
                                map6 = map6;
                                try {
                                    String strSubstring = strM31411.substring(1, strM31411.length() - 1);
                                    if (hashSet5.add(strSubstring)) {
                                        try {
                                            int iLastIndexOf = strSubstring.lastIndexOf(47);
                                            int i6 = iLastIndexOf + 1;
                                            String strSubstring2 = strSubstring.substring(i6);
                                            it2 = it2;
                                            z = z2;
                                            if (iLastIndexOf <= 130) {
                                                try {
                                                    if (m28545(strSubstring)) {
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
                                                        M31381 = r15;
                                                        try {
                                                            sb.append(Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L));
                                                            str = strSubstring3 + sb.toString();
                                                            map7.put(strSubstring, str);
                                                            r9 = M31381;
                                                            strSubstring = str;
                                                            r8 = r9;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                                                            if (!z) {
                                                            }
                                                            ActivityC17169 activityC171610 = (ActivityC17169) c8182.f25180;
                                                            int i7 = ActivityC17169.f52595;
                                                            zArr = new boolean[]{false};
                                                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                                            C4925.m14315(new RunnableC18426(1, iOException, activityC171610, zArr, countDownLatch2));
                                                            countDownLatch2.await();
                                                            if (!zArr[0]) {
                                                                throw new C12935();
                                                            }
                                                            hashSet4 = hashSet7;
                                                            hashSet3 = hashSet8;
                                                            map5 = map;
                                                            map6 = map6;
                                                            z2 = z;
                                                            abstractC15440M36526 = abstractC15440M36526;
                                                            bundle = bundle;
                                                            abstractC15440M36527 = abstractC15440M36527;
                                                            it2 = it2;
                                                        }
                                                    } else {
                                                        r8 = r15;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    M31381 = r15;
                                                    iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                                                    if (!z) {
                                                    }
                                                    ActivityC17169 activityC171611 = (ActivityC17169) c8182.f25180;
                                                    int i8 = ActivityC17169.f52595;
                                                    zArr = new boolean[]{false};
                                                    CountDownLatch countDownLatch3 = new CountDownLatch(1);
                                                    C4925.m14315(new RunnableC18426(1, iOException, activityC171611, zArr, countDownLatch3));
                                                    countDownLatch3.await();
                                                    if (!zArr[0]) {
                                                        throw new C12935();
                                                    }
                                                    hashSet4 = hashSet7;
                                                    hashSet3 = hashSet8;
                                                    map5 = map;
                                                    map6 = map6;
                                                    z2 = z;
                                                    abstractC15440M36526 = abstractC15440M36526;
                                                    bundle = bundle;
                                                    abstractC15440M36527 = abstractC15440M36527;
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
                                            c10130.m25423((CharSequence) strSubstring);
                                            if (iM31397 != 0) {
                                                c10130.writeInt(Integer.MIN_VALUE | iM31383);
                                                c10130.writeInt(iM31397);
                                            } else {
                                                c10130.writeInt(iM31383);
                                            }
                                            M31381 = r8;
                                        } catch (Exception e5) {
                                            e = e5;
                                            it2 = it2;
                                            z = z2;
                                        }
                                    } else {
                                        it2 = it2;
                                        z = z2;
                                        M31381 = r15;
                                        c6016.m16827(name, strSubstring.replace('/', '.'));
                                    }
                                    try {
                                        i4++;
                                        r15 = M31381;
                                        iM31408 = i5;
                                        bundle = bundle;
                                        abstractC15440M36527 = abstractC15440M36527;
                                        hashSet5 = hashSet5;
                                        M31381 = r25;
                                        map6 = map6;
                                        it2 = it2;
                                        z2 = z;
                                    } catch (Exception e6) {
                                        e = e6;
                                        iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                                        if (!z) {
                                        }
                                        ActivityC17169 activityC171612 = (ActivityC17169) c8182.f25180;
                                        int i9 = ActivityC17169.f52595;
                                        zArr = new boolean[]{false};
                                        CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                        C4925.m14315(new RunnableC18426(1, iOException, activityC171612, zArr, countDownLatch4));
                                        countDownLatch4.await();
                                        if (!zArr[0]) {
                                            throw new C12935();
                                        }
                                        hashSet4 = hashSet7;
                                        hashSet3 = hashSet8;
                                        map5 = map;
                                        map6 = map6;
                                        z2 = z;
                                        abstractC15440M36526 = abstractC15440M36526;
                                        bundle = bundle;
                                        abstractC15440M36527 = abstractC15440M36527;
                                        it2 = it2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r14 = r15;
                                    it2 = it2;
                                    z = z2;
                                    M31381 = r14;
                                    iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                                    if (!z) {
                                    }
                                    ActivityC17169 activityC171613 = (ActivityC17169) c8182.f25180;
                                    int i10 = ActivityC17169.f52595;
                                    zArr = new boolean[]{false};
                                    CountDownLatch countDownLatch5 = new CountDownLatch(1);
                                    C4925.m14315(new RunnableC18426(1, iOException, activityC171613, zArr, countDownLatch5));
                                    countDownLatch5.await();
                                    if (!zArr[0]) {
                                        throw new C12935();
                                    }
                                    hashSet4 = hashSet7;
                                    hashSet3 = hashSet8;
                                    map5 = map;
                                    map6 = map6;
                                    z2 = z;
                                    abstractC15440M36526 = abstractC15440M36526;
                                    bundle = bundle;
                                    abstractC15440M36527 = abstractC15440M36527;
                                    it2 = it2;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                r13 = r15;
                                map6 = map6;
                                r14 = r13;
                                it2 = it2;
                                z = z2;
                                M31381 = r14;
                                iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                                if (!z) {
                                }
                                ActivityC17169 activityC171614 = (ActivityC17169) c8182.f25180;
                                int i11 = ActivityC17169.f52595;
                                zArr = new boolean[]{false};
                                CountDownLatch countDownLatch6 = new CountDownLatch(1);
                                C4925.m14315(new RunnableC18426(1, iOException, activityC171614, zArr, countDownLatch6));
                                countDownLatch6.await();
                                if (!zArr[0]) {
                                    throw new C12935();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC15440M36526 = abstractC15440M36526;
                                bundle = bundle;
                                abstractC15440M36527 = abstractC15440M36527;
                                it2 = it2;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            abstractC15440M36527 = abstractC15440M36527;
                            r13 = r15;
                        }
                    }
                    HashSet hashSet9 = hashSet5;
                    abstractC15440M36527 = abstractC15440M36527;
                    bundle = bundle;
                    it2 = it2;
                    abstractC15440M36528.m36526(strM7878 + "_list").m36496(c10130);
                    hashSet3 = hashSet6;
                    map6 = map7;
                    map5 = map8;
                    hashSet4 = hashSet9;
                    z2 = true;
                } catch (Exception e10) {
                    e = e10;
                    z = z2;
                    M31381 = r15;
                    iOException = new IOException(C4925.m14306(R.string.MT_Protector, M31381.getName(), e.getMessage()), e);
                    if (!z || it2.hasNext()) {
                        ActivityC17169 activityC171615 = (ActivityC17169) c8182.f25180;
                        int i12 = ActivityC17169.f52595;
                        zArr = new boolean[]{false};
                        CountDownLatch countDownLatch7 = new CountDownLatch(1);
                        C4925.m14315(new RunnableC18426(1, iOException, activityC171615, zArr, countDownLatch7));
                        countDownLatch7.await();
                        if (!zArr[0]) {
                            throw new C12935();
                        }
                        hashSet4 = hashSet7;
                        hashSet3 = hashSet8;
                        map5 = map;
                        map6 = map6;
                        z2 = z;
                        abstractC15440M36526 = abstractC15440M36526;
                        bundle = bundle;
                        abstractC15440M36527 = abstractC15440M36527;
                        it2 = it2;
                    } else {
                        throw iOException;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                map = map5;
            }
            abstractC15440M36526 = abstractC15440M36526;
            bundle = bundle;
            abstractC15440M36527 = abstractC15440M36527;
            it2 = it2;
        }
        AbstractC15440 abstractC15443 = abstractC15440M36527;
        Bundle bundle2 = bundle;
        HashMap map9 = map6;
        HashMap map10 = map5;
        if (map9.isEmpty()) {
            abstractC15441 = abstractC15443;
        } else {
            C10130 c10131 = new C10130();
            for (Map.Entry entry : map9.entrySet()) {
                c10131.m25423((CharSequence) entry.getKey());
                c10131.m25423((CharSequence) entry.getValue());
            }
            abstractC15441 = abstractC15443;
            abstractC15441.m36526("map").m36496(c10131);
        }
        if (!map10.isEmpty()) {
            C10130 c10132 = new C10130();
            for (Map.Entry entry2 : map10.entrySet()) {
                c10132.m25423((CharSequence) entry2.getKey());
                c10132.m25423((CharSequence) entry2.getValue());
            }
            abstractC15441.m36526("dex_name_map").m36496(c10132);
        }
        if (bundle2.isEmpty()) {
            i = 0;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            i = 0;
            bundle2.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC15441.m36526("options").m36502(bArrMarshall);
        }
        AbstractC15440 abstractC15440M36524 = ((AbstractC15440) arrayList.get(i)).m36524("resources.arsc");
        if (abstractC15440M36524.mo23120()) {
            AbstractC15440 abstractC15440M36529 = abstractC15440.m36526("data/resources.arsc");
            abstractC15440M36529.mo35195();
            abstractC15440M36524.m36500(abstractC15440M36529, (C17558) null, (InterfaceC5627) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28545(String str) {
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
