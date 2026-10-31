package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
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
public final class C8198 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21696(String str, String str2, HashMap map, final HashMap map2, final InterfaceC8693 interfaceC8693) throws Exception {
        boolean z;
        Iterator it;
        C5376 c5376;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        final ArrayList<C5376> arrayList7 = new ArrayList();
        final InterfaceC1142 interfaceC1142 = new InterfaceC1142() { // from class: l.ܳ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                String str3 = (String) obj;
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                if (!abstractC0436.f1922.endsWith("/")) {
                    return false;
                }
                if (map2.remove(str3) != null) {
                    return true;
                }
                arrayList3.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC1142.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC1142 interfaceC1143 = new InterfaceC1142() { // from class: l.᩻۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                if (!abstractC0436.f1922.endsWith("/")) {
                    return false;
                }
                arrayList4.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(map2.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC1143.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC1142 interfaceC1144 = new InterfaceC1142() { // from class: l.ۜ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                AbstractC0436 abstractC0437 = (AbstractC0436) map2.remove((String) obj);
                if (abstractC0437 == null) {
                    return false;
                }
                if (abstractC0436.f1923.equals(abstractC0437.f1923)) {
                    arrayList7.add(new C5376(abstractC0436, abstractC0437));
                    return true;
                }
                arrayList2.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC1144.test(entry.getKey(), entry.getValue());
            }
        });
        HashMap map3 = new HashMap();
        for (AbstractC0436 abstractC0436 : map.values()) {
            ((C19488) C13843.computeIfAbsent(map3, abstractC0436.f1923, new C20899())).f62984.add(abstractC0436);
        }
        for (AbstractC0436 abstractC0437 : map2.values()) {
            ((C19488) C13843.computeIfAbsent(map3, abstractC0437.f1923, new C9610())).f62985.add(abstractC0437);
        }
        for (C19488 c19488 : map3.values()) {
            Collections.sort(c19488.f62984);
            Collections.sort(c19488.f62985);
        }
        final InterfaceC1142 interfaceC1145 = new InterfaceC1142() { // from class: l.ۡ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                C19488 c19489 = (C19488) obj2;
                ArrayList arrayList8 = c19489.f62984;
                ArrayList arrayList9 = c19489.f62985;
                if (arrayList8.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((AbstractC0436) it2.next()).f1922);
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
                    arrayList3.add(((AbstractC0436) it3.next()).f1922);
                }
                return true;
            }
        };
        C5378.removeIf(map3.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC1145.test(entry.getKey(), entry.getValue());
            }
        });
        ArrayList<AbstractC0436> arrayList8 = new ArrayList();
        for (C5376 c5377 : arrayList7) {
            arrayList8.add(c5377.f16727);
            arrayList8.add(c5377.f16728);
        }
        for (C19488 c19489 : map3.values()) {
            arrayList8.addAll(c19489.f62984);
            arrayList8.addAll(c19489.f62985);
        }
        Iterator it2 = arrayList8.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((AbstractC0436) it2.next()).f1921;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        final C19277 c19277 = new C19277(j);
        c19277.m44459(interfaceC8693);
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService executorService = C1802.f6211;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        for (final AbstractC0436 abstractC0438 : arrayList8) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܺ۬ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0436 abstractC0439 = abstractC0438;
                    C19277 c19278 = c19277;
                    if (interfaceC8693.mo1526()) {
                        return;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() != null) {
                        return;
                    }
                    try {
                        MessageDigest messageDigestM34532 = C14460.m34532();
                        InputStream inputStreamMo1993 = abstractC0439.mo1993();
                        try {
                            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                            while (true) {
                                int i = inputStreamMo1993.read(bArr);
                                if (i == -1) {
                                    inputStreamMo1993.close();
                                    abstractC0439.f1924 = C14460.m34531(messageDigestM34532.digest());
                                    return;
                                } else {
                                    messageDigestM34532.update(bArr, 0, i);
                                    c19278.m44460(i);
                                }
                                abstractC0439.f1925 = e;
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo1993 != null) {
                                try {
                                    inputStreamMo1993.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        abstractC0439.f1925 = e;
                    } catch (Exception e2) {
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                }
            });
        }
        C1802.m5992(executorServiceNewFixedThreadPool);
        if (interfaceC8693.mo1526()) {
            return "";
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        for (C5376 c5378 : arrayList7) {
            AbstractC0436 abstractC0439 = c5378.f16727;
            AbstractC0436 abstractC04310 = c5378.f16728;
            IOException iOException = abstractC0439.f1925;
            if (iOException != null || abstractC04310.f1925 != null) {
                if (iOException != null) {
                    arrayList6.add(m21697(str, abstractC0439));
                }
                if (abstractC04310.f1925 != null) {
                    arrayList6.add(m21697(str2, abstractC04310));
                }
            } else if (abstractC0439.f1924.equals(abstractC04310.f1924)) {
                arrayList.add(abstractC0439.f1922);
            } else {
                arrayList2.add(abstractC0439.f1922);
            }
        }
        Iterator it3 = map3.values().iterator();
        while (it3.hasNext()) {
            C19488 c194810 = (C19488) it3.next();
            ArrayList<AbstractC0436> arrayList11 = c194810.f62984;
            ArrayList<AbstractC0436> arrayList12 = c194810.f62985;
            boolean zAnyMatch = C5378.stream(arrayList11).anyMatch(new C2554());
            boolean zAnyMatch2 = C5378.stream(arrayList12).anyMatch(new C3965());
            while (true) {
                int size = arrayList11.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        it = it3;
                        c5376 = null;
                        break;
                    }
                    int size2 = arrayList12.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        AbstractC0436 abstractC04311 = (AbstractC0436) arrayList11.get(i);
                        it = it3;
                        AbstractC0436 abstractC04312 = (AbstractC0436) arrayList12.get(i2);
                        int i3 = size;
                        String str3 = abstractC04311.f1924;
                        int i4 = size2;
                        if (str3 != null && str3.equals(abstractC04312.f1924)) {
                            arrayList11.remove(i);
                            arrayList12.remove(i2);
                            c5376 = new C5376(abstractC04311, abstractC04312);
                            break;
                        }
                        i2++;
                        it3 = it;
                        size = i3;
                        size2 = i4;
                    }
                    i++;
                }
                if (c5376 == null) {
                    break;
                }
                arrayList5.add(c5376.f16727.f1922 + " > " + c5376.f16728.f1922);
                it3 = it;
            }
            for (AbstractC0436 abstractC04313 : arrayList11) {
                if (abstractC04313.f1925 != null) {
                    arrayList6.add(m21697(str, abstractC04313));
                } else if (!zAnyMatch2) {
                    arrayList9.add(abstractC04313.f1922);
                }
            }
            ArrayList arrayList13 = arrayList9;
            for (AbstractC0436 abstractC04314 : arrayList12) {
                if (abstractC04314.f1925 != null) {
                    arrayList6.add(m21697(str2, abstractC04314));
                } else if (!zAnyMatch) {
                    arrayList10.add(abstractC04314.f1922);
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
            sb.append(C4925.m14327(R.string.MT_Protector));
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
            sb.append(C4925.m14327(R.string.MT_Protector));
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
            sb.append(C4925.m14327(R.string.MT_Protector));
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
            sb.append(C4925.m14327(R.string.MT_Protector));
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
            sb.append(C4925.m14327(R.string.MT_Protector));
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
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                sb.append((String) it9.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21697(String str, AbstractC0436 abstractC0436) {
        String message = abstractC0436.f1925.getMessage();
        if (message == null || message.isEmpty()) {
            message = abstractC0436.f1925.getClass().getSimpleName();
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
                message = abstractC0436.f1925.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        String str2 = abstractC0436.f1922;
        return C23202.m51498(sb, (str.endsWith("/") || str2.startsWith("/")) ? C16014.m37867(str, str2) : C22870.m50967(str, "/", str2), ": ", message);
    }
}
