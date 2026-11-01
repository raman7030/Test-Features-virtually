package p067l;

import bin.p000mt.plus.R;
import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10160 {
    /* JADX INFO: renamed from: ֫ */
    public static String m23665(String str, String str2, HashMap map, final HashMap map2, final InterfaceC10630 interfaceC10630) throws Exception {
        boolean z;
        Iterator it;
        C7478 c7478;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        final ArrayList<C7478> arrayList7 = new ArrayList();
        final InterfaceC3454 interfaceC3454 = new InterfaceC3454() { // from class: l.ܳ۬ܿ
            @Override // p067l.InterfaceC3454
            public final boolean test(Object obj, Object obj2) {
                String str3 = (String) obj;
                AbstractC2783 abstractC2783 = (AbstractC2783) obj2;
                if (!abstractC2783.f4698.endsWith("/")) {
                    return false;
                }
                if (map2.remove(str3) != null) {
                    return true;
                }
                arrayList3.add(abstractC2783.f4698);
                return true;
            }
        };
        C7480.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m45708or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC3454.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC3454 interfaceC3455 = new InterfaceC3454() { // from class: l.᩻۬ܿ
            @Override // p067l.InterfaceC3454
            public final boolean test(Object obj, Object obj2) {
                AbstractC2783 abstractC2783 = (AbstractC2783) obj2;
                if (!abstractC2783.f4698.endsWith("/")) {
                    return false;
                }
                arrayList4.add(abstractC2783.f4698);
                return true;
            }
        };
        C7480.removeIf(map2.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m45708or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC3455.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC3454 interfaceC3456 = new InterfaceC3454() { // from class: l.ۜ۬ܿ
            @Override // p067l.InterfaceC3454
            public final boolean test(Object obj, Object obj2) {
                AbstractC2783 abstractC2783 = (AbstractC2783) obj2;
                AbstractC2783 abstractC2784 = (AbstractC2783) map2.remove((String) obj);
                if (abstractC2784 == null) {
                    return false;
                }
                if (abstractC2783.f4699.equals(abstractC2784.f4699)) {
                    arrayList7.add(new C7478(abstractC2783, abstractC2784));
                    return true;
                }
                arrayList2.add(abstractC2783.f4698);
                return true;
            }
        };
        C7480.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m45708or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC3456.test(entry.getKey(), entry.getValue());
            }
        });
        HashMap map3 = new HashMap();
        for (AbstractC2783 abstractC2783 : map.values()) {
            ((C20890) C15525.computeIfAbsent(map3, abstractC2783.f4699, new C22231())).f65601.add(abstractC2783);
        }
        for (AbstractC2783 abstractC2784 : map2.values()) {
            ((C20890) C15525.computeIfAbsent(map3, abstractC2784.f4699, new C11502())).f65602.add(abstractC2784);
        }
        for (C20890 c20890 : map3.values()) {
            Collections.sort(c20890.f65601);
            Collections.sort(c20890.f65602);
        }
        final InterfaceC3454 interfaceC3457 = new InterfaceC3454() { // from class: l.ۡ۬ܿ
            @Override // p067l.InterfaceC3454
            public final boolean test(Object obj, Object obj2) {
                C20890 c20891 = (C20890) obj2;
                ArrayList arrayList8 = c20891.f65601;
                ArrayList arrayList9 = c20891.f65602;
                if (arrayList8.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((AbstractC2783) it2.next()).f4698);
                    }
                    return true;
                }
                if (!arrayList9.isEmpty()) {
                    Collections.sort(arrayList8);
                    Collections.sort(arrayList9);
                    return false;
                }
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AbstractC2783) it3.next()).f4698);
                }
                return true;
            }
        };
        C7480.removeIf(map3.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m45708or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC3457.test(entry.getKey(), entry.getValue());
            }
        });
        ArrayList<AbstractC2783> arrayList8 = new ArrayList();
        for (C7478 c7479 : arrayList7) {
            arrayList8.add(c7479.f19565);
            arrayList8.add(c7479.f19566);
        }
        for (C20890 c20891 : map3.values()) {
            arrayList8.addAll(c20891.f65601);
            arrayList8.addAll(c20891.f65602);
        }
        Iterator it2 = arrayList8.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((AbstractC2783) it2.next()).f4697;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        final C20689 c20689 = new C20689(j);
        c20689.m46753(interfaceC10630);
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService executorService = C4081.f8990;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        for (final AbstractC2783 abstractC2785 : arrayList8) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܺ۬ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2783 abstractC2786 = abstractC2785;
                    C20689 c206810 = c20689;
                    if (interfaceC10630.mo3924()) {
                        return;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() != null) {
                        return;
                    }
                    try {
                        MessageDigest messageDigestM36666 = C16111.m36666();
                        InputStream inputStreamMo4369 = abstractC2786.mo4369();
                        try {
                            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                            while (true) {
                                int i = inputStreamMo4369.read(bArr);
                                if (i == -1) {
                                    inputStreamMo4369.close();
                                    abstractC2786.f4700 = C16111.m36665(messageDigestM36666.digest());
                                    return;
                                } else {
                                    messageDigestM36666.update(bArr, 0, i);
                                    c206810.m46754(i);
                                }
                                abstractC2786.f4701 = e;
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo4369 != null) {
                                try {
                                    inputStreamMo4369.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        abstractC2786.f4701 = e;
                    } catch (Exception e2) {
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                }
            });
        }
        C4081.m8189(executorServiceNewFixedThreadPool);
        if (interfaceC10630.mo3924()) {
            return "";
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        for (C7478 c74710 : arrayList7) {
            AbstractC2783 abstractC2786 = c74710.f19565;
            AbstractC2783 abstractC2787 = c74710.f19566;
            IOException iOException = abstractC2786.f4701;
            if (iOException != null || abstractC2787.f4701 != null) {
                if (iOException != null) {
                    arrayList6.add(m23666(str, abstractC2786));
                }
                if (abstractC2787.f4701 != null) {
                    arrayList6.add(m23666(str2, abstractC2787));
                }
            } else if (abstractC2786.f4700.equals(abstractC2787.f4700)) {
                arrayList.add(abstractC2786.f4698);
            } else {
                arrayList2.add(abstractC2786.f4698);
            }
        }
        Iterator it3 = map3.values().iterator();
        while (it3.hasNext()) {
            C20890 c20892 = (C20890) it3.next();
            ArrayList<AbstractC2783> arrayList11 = c20892.f65601;
            ArrayList<AbstractC2783> arrayList12 = c20892.f65602;
            boolean zAnyMatch = C7480.stream(arrayList11).anyMatch(new C4796());
            boolean zAnyMatch2 = C7480.stream(arrayList12).anyMatch(new C6137());
            while (true) {
                int size = arrayList11.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        it = it3;
                        c7478 = null;
                        break;
                    }
                    int size2 = arrayList12.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        AbstractC2783 abstractC2788 = (AbstractC2783) arrayList11.get(i);
                        it = it3;
                        AbstractC2783 abstractC2789 = (AbstractC2783) arrayList12.get(i2);
                        int i3 = size;
                        String str3 = abstractC2788.f4700;
                        int i4 = size2;
                        if (str3 != null && str3.equals(abstractC2789.f4700)) {
                            arrayList11.remove(i);
                            arrayList12.remove(i2);
                            c7478 = new C7478(abstractC2788, abstractC2789);
                            break;
                        }
                        i2++;
                        it3 = it;
                        size = i3;
                        size2 = i4;
                    }
                    i++;
                }
                if (c7478 == null) {
                    break;
                }
                arrayList5.add(c7478.f19565.f4698 + " > " + c7478.f19566.f4698);
                it3 = it;
            }
            for (AbstractC2783 abstractC27810 : arrayList11) {
                if (abstractC27810.f4701 != null) {
                    arrayList6.add(m23666(str, abstractC27810));
                } else if (!zAnyMatch2) {
                    arrayList9.add(abstractC27810.f4698);
                }
            }
            ArrayList arrayList13 = arrayList9;
            for (AbstractC2783 abstractC27811 : arrayList12) {
                if (abstractC27811.f4701 != null) {
                    arrayList6.add(m23666(str2, abstractC27811));
                } else if (!zAnyMatch) {
                    arrayList10.add(abstractC27811.f4698);
                }
            }
            it3 = it;
            arrayList9 = arrayList13;
        }
        ArrayList arrayList14 = arrayList9;
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        Collections.sort(arrayList14);
        Collections.sort(arrayList10);
        Collections.sort(arrayList5);
        Collections.sort(arrayList6);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('\n');
        sb.append(str2);
        sb.append('\n');
        boolean z2 = true;
        if (arrayList6.isEmpty()) {
            z = false;
        } else {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList5.isEmpty()) {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                sb.append((String) it5.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList10.isEmpty()) {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                sb.append((String) it6.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList14.isEmpty()) {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it7 = arrayList14.iterator();
            while (it7.hasNext()) {
                sb.append((String) it7.next());
                sb.append('\n');
            }
            z = true;
        }
        if (arrayList2.isEmpty()) {
            z2 = z;
        } else {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                sb.append((String) it8.next());
                sb.append('\n');
            }
        }
        if (!z2) {
            return "";
        }
        if (!arrayList.isEmpty()) {
            sb.append('\n');
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                sb.append((String) it9.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23666(String str, AbstractC2783 abstractC2783) {
        String message = abstractC2783.f4701.getMessage();
        if (message == null || message.isEmpty()) {
            message = abstractC2783.f4701.getClass().getSimpleName();
        } else {
            int iIndexOf = message.indexOf(10);
            int iIndexOf2 = message.indexOf(13);
            if (iIndexOf2 >= 0 && (iIndexOf < 0 || iIndexOf2 < iIndexOf)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf >= 0) {
                message = message.substring(0, iIndexOf);
            }
            if (message.isEmpty()) {
                message = abstractC2783.f4701.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        String str2 = abstractC2783.f4698;
        return C24420.m53894(sb, (str.endsWith("/") || str2.startsWith("/")) ? C17588.m40053(str, str2) : C24104.m53357(str, "/", str2), ": ", message);
    }
}
