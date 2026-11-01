package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.umeng.analytics.pro.C0684bo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14121 extends C16868 {

    /* JADX INFO: renamed from: ֡ */
    public Bundle f40081;

    /* JADX INFO: renamed from: ֨ */
    public final ArrayList f40082;

    /* JADX INFO: renamed from: ۖ */
    public long f40083;

    /* JADX INFO: renamed from: ۘ */
    public boolean f40084;

    /* JADX INFO: renamed from: ۚ */
    public final HashMap f40085;

    /* JADX INFO: renamed from: ۜ */
    public final C12828 f40086;

    /* JADX INFO: renamed from: ۠ */
    public final C7350 f40087;

    /* JADX INFO: renamed from: ۡ */
    public final ConcurrentMapC12768 f40088;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f40089;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f40090;

    /* JADX INFO: renamed from: ܳ */
    public final Map f40091;

    /* JADX INFO: renamed from: ܶ */
    public final HashMap f40092;

    /* JADX INFO: renamed from: ܺ */
    public final C7350 f40093;

    /* JADX INFO: renamed from: ܽ */
    public boolean f40094;

    /* JADX INFO: renamed from: ܿ */
    public final Map f40095;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f40096;

    /* JADX INFO: renamed from: ᩴ */
    public Set f40097;

    /* JADX INFO: renamed from: ᩵ */
    public final C7350 f40098;

    /* JADX INFO: renamed from: ᩷ */
    public final HashMap f40099;

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f40100;

    /* JADX INFO: renamed from: ᩹ */
    public final C2917 f40101;

    /* JADX INFO: renamed from: ᩻ */
    public final ConcurrentMapC12768 f40102;

    /* JADX INFO: renamed from: ᩶ */
    public static final int[] f40080 = {0, 35, 37, 38, 39, 40, 41};

    /* JADX INFO: renamed from: ۙ */
    public static final int f40079 = C16111.m36666().getDigestLength();

    /* JADX INFO: renamed from: ֫ */
    public static void m32071(C14121 c14121, String str, C9952 c9952) {
        c14121.getClass();
        c14121.m32083(str, c9952.getType());
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m32089(String str, String str2, String str3) {
        if (this.f40096.containsKey(str2)) {
            throw new C20807("Class exists: " + str2.replace('/', '.'));
        }
        String strM10026 = AbstractC4734.m10026(str3);
        if (strM10026 == null) {
            throw new IOException("Parse class type failed.");
        }
        m32083(str2, strM10026);
        C19486 c19486 = new C19486(str2);
        c19486.f59367 = str;
        C12828 c12828 = new C12828(new C12828(this.f40086, "smali"), c19486.f59367);
        c19486.f59368 = C12828.m29391(c12828, C10685.m24611(c12828.m29402(), str2.concat(".smali")));
        c19486.f59368.m29394(str3.getBytes(Charset.defaultCharset()));
        this.f40096.put(str2, c19486);
        if (this.f40094) {
            this.f40097.add(str2);
            this.f40098.mo4062(C21562.unmodifiableSet(this.f40097));
        }
        this.f40083 = 0L;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14121 m32082(C12828 c12828) {
        return new C14121(c12828);
    }

    public C14121(C12828 c12828) throws IOException {
        Set set;
        super(c12828);
        this.f40090 = new ArrayList();
        this.f40089 = new ArrayList();
        this.f40096 = new HashMap();
        this.f40092 = new HashMap();
        this.f40100 = new HashMap();
        this.f40091 = C21562.synchronizedMap(new C0977());
        this.f40095 = C21562.synchronizedMap(new C0977());
        this.f40085 = new HashMap();
        this.f40099 = new HashMap();
        this.f40102 = new ConcurrentMapC12768();
        this.f40088 = new ConcurrentMapC12768();
        this.f40082 = new ArrayList();
        this.f40097 = Collections.EMPTY_SET;
        this.f40094 = true;
        this.f40093 = new C7350();
        this.f40087 = new C7350();
        this.f40098 = new C7350();
        C12828 c12829 = new C12828(c12828, "dex");
        this.f40086 = c12829;
        C1446.m31704(c12829.m29398());
        this.f40101 = new C2917(this);
        C12828 c12828M32108 = m32108();
        C12828[] c12828ArrM29397 = c12828M32108.m29397();
        if (c12828ArrM29397 == null) {
            throw new IOException("List files fail in: " + c12828M32108.m29401());
        }
        HashSet hashSet = new HashSet();
        C12828 c128210 = new C12828(m32105(), "exclude_dex");
        if (c128210.m29398()) {
            for (String str : c128210.m29402().m38647().split("\n")) {
                if (!str.isEmpty()) {
                    hashSet.add(str);
                }
            }
        }
        AbstractC17043 abstractC17043M29392 = m32105().m29392("removed");
        if (abstractC17043M29392.mo25094()) {
            BufferedReader bufferedReaderM38679 = abstractC17043M29392.m38679();
            try {
                HashSet hashSet2 = new HashSet();
                while (true) {
                    String line = bufferedReaderM38679.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet2.add(line);
                    }
                }
                bufferedReaderM38679.close();
                set = hashSet2;
            } catch (Throwable th) {
                try {
                    bufferedReaderM38679.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        for (C12828 c128211 : c12828ArrM29397) {
            if (c128211.m29402().mo25093() && c128211.getName().endsWith("_list")) {
                String strM38720 = C17073.m38720(5, 0, c128211.getName());
                this.f40090.add(strM38720);
                if (!hashSet.contains(strM38720)) {
                    this.f40089.add(strM38720);
                    C12828 c128212 = new C12828(c12828M32108, strM38720);
                    C14677 c14677 = new C14677(c128211.m29399());
                    while (c14677.available() > 0) {
                        C19486 c19486 = new C19486(c14677.m33591());
                        c19486.f59367 = strM38720;
                        c19486.f59365 = c128212;
                        int i = c14677.readInt();
                        c19486.f59364 = i;
                        if ((Integer.MIN_VALUE & i) != 0) {
                            c19486.f59364 = i & Integer.MAX_VALUE;
                            c19486.f59369 = c14677.readInt();
                        } else {
                            c19486.f59369 = 0;
                        }
                        String str2 = c19486.f59366;
                        if (set.contains(str2)) {
                            this.f40092.put(str2, c19486);
                        } else {
                            this.f40096.put(str2, c19486);
                        }
                    }
                }
            }
        }
        C20157.m45612(this.f40089);
        C20157.m45612(this.f40090);
        m32132();
        ArrayList arrayList = this.f40082;
        AbstractC17043 abstractC17043M29393 = m32105().m29392("recent");
        if (abstractC17043M29393.mo25094()) {
            arrayList.clear();
            BufferedReader bufferedReaderM386710 = abstractC17043M29393.m38679();
            while (true) {
                try {
                    String line2 = bufferedReaderM386710.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM386710.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM386710.close();
            m32076();
        }
        C12828 c128213 = new C12828(m32105(), "map");
        if (c128213.m29398()) {
            C14677 c14678 = new C14677(c128213.m29399());
            while (c14678.available() > 0) {
                this.f40085.put(c14678.m33591(), c14678.m33591());
            }
        }
        C12828 c128214 = new C12828(m32105(), "rename_map");
        if (c128214.m29398()) {
            C14677 c14679 = new C14677(c128214.m29399());
            while (c14679.available() > 0) {
                this.f40100.put(c14679.m33591(), c14679.m33591());
            }
        }
        C12828 c128215 = new C12828(m32105(), "dex_name_map");
        if (c128215.m29398()) {
            C14677 c146710 = new C14677(c128215.m29399());
            while (c146710.available() > 0) {
                this.f40099.put(c146710.m33591(), c146710.m33591());
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final C12828 m32108() {
        return new C12828(this.f40086, AbstractC0213e.f989m);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C12828 m32105() {
        return new C12828(this.f40086, "config");
    }

    /* JADX INFO: renamed from: ᩴ */
    public final List m32128() {
        return C21562.unmodifiableList(this.f40089);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final List m32134() {
        return C21562.unmodifiableList(this.f40090);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32091(ArrayList arrayList) throws C20807 {
        if (arrayList.containsAll(this.f40090)) {
            throw new C20807(R.string.MT_Protector);
        }
        C12828 c12828 = new C12828(m32105(), "exclude_dex");
        c12828.m29400();
        c12828.m29394(C11567.m26626((Collection) arrayList, '\n').getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32103(boolean z) {
        this.f40094 = z;
        if (z) {
            m32132();
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m32109() {
        return this.f40090.size() > 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32087(String str) {
        if (this.f40096.containsKey(str)) {
            ArrayList arrayList = this.f40082;
            if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
                arrayList.remove(str);
                arrayList.add(0, str);
                while (arrayList.size() > 30) {
                    C19925.m45229(arrayList, 1);
                }
                m32078();
                m32076();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32119(String str) {
        return this.f40096.containsKey(str);
    }

    /* JADX INFO: renamed from: ܺ */
    public final Collection m32124() {
        return this.f40096.values();
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m32111(String str) {
        Set<String> setKeySet = this.f40096.keySet();
        ArrayList<String> arrayList = new ArrayList();
        String strConcat = str.concat("$");
        for (String str2 : setKeySet) {
            if (str2.startsWith(strConcat)) {
                arrayList.add(str2);
            }
        }
        Collections.sort(arrayList);
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Object obj = null;
        for (String str3 : arrayList) {
            if (!str3.equals(obj)) {
                arrayList2.add(str3);
                obj = str3;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C20960 m32106(String str) {
        C9873 c9873M23150;
        int i = m32084().getInt("opt_dex_version");
        if (i <= 0 || i >= 7) {
            try {
                c9873M23150 = m32120(str).f56193;
            } catch (IOException unused) {
                c9873M23150 = C9873.m23150(15);
            }
        } else {
            c9873M23150 = C9873.m23152(f40080[i]);
        }
        final int i2 = c9873M23150.f27379;
        return (C20960) C19473.compute(this.f40088, str, new BiFunction() { // from class: l.ܶۧۢ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C18684.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C20960 c20960 = (C20960) obj2;
                int i3 = i2;
                if (c20960 != null && c20960.f65851 == i3) {
                    return c20960;
                }
                C20960 c20961 = new C20960();
                c20961.f65851 = i3;
                return c20961;
            }
        });
    }

    /* JADX INFO: renamed from: ܳ */
    public final C18815 m32120(String str) throws IOException {
        C14645 c14645;
        Map map = this.f40095;
        C18815 c18815 = (C18815) map.get(str);
        if (c18815 != null) {
            return c18815;
        }
        Reference reference = (Reference) this.f40091.get(str);
        if (reference != null && (c14645 = (C14645) reference.get()) != null) {
            c18815 = new C18815(c14645.mo29499(), c14645.m33494());
        }
        if (c18815 == null) {
            C24618 c24618M38671 = new C12828(m32108(), str).m29402().m38671("r");
            try {
                c24618M38671.seek(4L);
                C9873 c9873M23152 = C9873.m23152((c24618M38671.read() - 48) + ((c24618M38671.read() - 48) * 10) + ((c24618M38671.read() - 48) * 100));
                c24618M38671.seek(96L);
                C18815 c18816 = new C18815(c9873M23152, c24618M38671.mo23137());
                c24618M38671.close();
                c18815 = c18816;
            } catch (Throwable th) {
                try {
                    c24618M38671.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        map.put(str, c18815);
        return c18815;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C14645 m32126(String str) {
        C14645 c14645;
        C14645 c14646;
        Reference reference = (Reference) this.f40091.get(str);
        if (reference != null && (c14646 = (C14645) reference.get()) != null) {
            return c14646;
        }
        synchronized (this.f40091) {
            Reference reference2 = (Reference) this.f40091.get(str);
            if (reference2 != null && (c14645 = (C14645) reference2.get()) != null) {
                return c14645;
            }
            System.out.println("Read DexFile from file: " + str);
            InputStream inputStreamM29396 = new C12828(m32108(), str).m29396();
            try {
                C14645 c14645M33466 = C14645.m33466(inputStreamM29396);
                this.f40091.put(str, new SoftReference(c14645M33466));
                inputStreamM29396.close();
                return c14645M33466;
            } catch (Throwable th) {
                if (inputStreamM29396 != null) {
                    try {
                        inputStreamM29396.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C23616 m32125(final String str) {
        return (C23616) C19473.computeIfAbsent(this.f40102, str, new Function() { // from class: l.᩸ۧۢ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C9873 c9873M23150;
                try {
                    c9873M23150 = this.f71924.m32120(str).f56193;
                } catch (IOException unused) {
                    c9873M23150 = C9873.m23150(15);
                }
                C23616 c23616 = new C23616();
                c23616.f75161 = c9873M23150.f27379;
                return c23616;
            }
        });
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m32137(String str) {
        C19486 c19486 = (C19486) this.f40096.get(str);
        C12826.requireNonNull(c19486);
        return c19486.f59367;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C18676 m32114() {
        C15993 c15993M36344 = C15993.m36344(this.f40096.keySet());
        c15993M36344.m36349(1);
        return c15993M36344.m36348();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m32132() {
        if (!this.f40094) {
            throw new IllegalStateException();
        }
        HashMap map = this.f40096;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C19486) it.next()).f59368 = null;
        }
        C12828 c12828 = new C12828(this.f40086, "smali");
        for (String str : this.f40089) {
            C12828 c12829 = new C12828(c12828, str);
            if (c12829.m29398()) {
                m32070(c12829, "", str);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C19486 c19486 = (C19486) ((Map.Entry) it2.next()).getValue();
            if (c19486.f59368 != null) {
                hashSet.add(c19486.f59366);
            } else if (c19486.f59365 == null) {
                it2.remove();
            }
        }
        C7350 c7350 = this.f40098;
        Set set = (Set) c7350.m4060();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f40097 = hashSet;
        c7350.mo4062(C21562.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32070(C12828 c12828, String str, String str2) {
        C12828[] c12828ArrM29397 = c12828.m29397();
        if (c12828ArrM29397 == null) {
            return;
        }
        for (C12828 c12829 : c12828ArrM29397) {
            if (c12829.m29402().mo25087()) {
                m32070(c12829, C24104.m53357(str, C10685.m24607(c12829.getName()), "/"), str2);
            } else {
                String strM24617 = C10685.m24617(c12829.getName());
                if (strM24617.endsWith(".smali")) {
                    StringBuilder sbM17248 = C7470.m17248(str);
                    sbM17248.append(strM24617.substring(0, strM24617.length() - 6));
                    String string = sbM17248.toString();
                    HashMap map = this.f40096;
                    C19486 c19486 = (C19486) map.get(string);
                    if (c19486 == null) {
                        c19486 = new C19486(string);
                        map.put(string, c19486);
                    }
                    c19486.f59367 = str2;
                    c19486.f59368 = c12829;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m32110() {
        HashMap map = this.f40096;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new C14791(this, (C19486) it.next()));
        }
        Collections.sort(arrayList, new C6745());
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32094(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Predicate predicate) {
        m32095(new C11010(concurrentLinkedQueue), str, z, predicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32095(final InterfaceC9172 interfaceC9172, final String str, final boolean z, final Predicate predicate) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        boolean zIsEmpty = str.isEmpty();
        HashMap map = this.f40096;
        if (zIsEmpty && predicate == null && z) {
            C7480.stream(map.values()).sorted(C19486.f59363).map(new Function() { // from class: l.ۗۧۢ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C14791(this.f12866, (C19486) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    interfaceC9172.mo21127((C14791) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        } else {
            C7480.stream(map.values()).filter(new Predicate() { // from class: l.ۚۧۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return C20697.$default$and(this, predicate2);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m17133or(Predicate predicate2) {
                    return C20697.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = ((C19486) obj).f59366;
                    Predicate predicate2 = predicate;
                    if (predicate2 != null && !predicate2.test(str2)) {
                        return false;
                    }
                    String str3 = str;
                    if (str2.startsWith(str3)) {
                        return z || str2.indexOf(47, str3.length()) == -1;
                    }
                    return false;
                }
            }).sorted(C19486.f59363).map(new Function() { // from class: l.֨ۧۢ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C14791(this.f6712, (C19486) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    interfaceC9172.mo21127((C14791) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C12828 m32079(C12828 c12828) {
        return new C12828(m38424(), C21466.m48631("dexBuild", c12828.m29401().substring(new C12828(this.f40086, "smali").m29401().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ֡ */
    private C12828 m32062(String str) {
        return new C12828(m38424(), C6988.m16053("dexBuild/", str, ".dex"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m32066(String str, C12828 c12828, C12828 c12829) throws IOException {
        byte[] bArrM29399 = c12828.m29399();
        C20960 c20960M32106 = m32106(str);
        int i = c20960M32106.f65851;
        MessageDigest messageDigestM36666 = C16111.m36666();
        messageDigestM36666.update((byte) 1);
        messageDigestM36666.update((byte) (i >>> 8));
        messageDigestM36666.update((byte) i);
        byte[] bArrDigest = messageDigestM36666.digest(bArrM29399);
        if (m32075(bArrDigest, c12829)) {
            return;
        }
        C20765 c20765M47281 = c20960M32106.m47281();
        C11572.m26641(new String(bArrM29399, StandardCharsets.UTF_8), c20765M47281, c20960M32106);
        C22776 c22776 = new C22776();
        c20765M47281.m50870(c22776);
        c12829.m29400();
        OutputStream outputStreamMo25506 = c12829.m29402().mo25506(false);
        try {
            outputStreamMo25506.write(bArrDigest);
            outputStreamMo25506.write(c22776.m50959(), 0, c22776.m50962());
            outputStreamMo25506.close();
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32075(byte[] bArr, C12828 c12828) {
        if (c12828.m29398()) {
            try {
                InputStream inputStreamM29396 = c12828.m29396();
                try {
                    for (int i : bArr) {
                        if (inputStreamM29396.read() != (i & 255)) {
                            inputStreamM29396.close();
                            return false;
                        }
                    }
                    if (inputStreamM29396 != null) {
                        inputStreamM29396.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM29396 != null) {
                        try {
                            inputStreamM29396.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9952 m32064(C12828 c12828) {
        return (C9952) ((AbstractC20050) new C14645(c12828.m29399(), f40079, true).mo29500()).iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    private boolean m32077() throws IOException {
        boolean z;
        Object[] objArr;
        boolean zM32075;
        C14121 c14121 = this;
        C19486[] c19486Arr = (C19486[]) c14121.f40096.values().toArray(new C19486[0]);
        for (C19486 c19486 : c19486Arr) {
            C12828 c12828 = c19486.f59368;
            if (c12828 != null) {
                C12828 c12828M32079 = c14121.m32079(c12828);
                String str = c19486.f59367;
                if (c12828M32079.m29398()) {
                    byte[] bArrM29399 = c12828.m29399();
                    int i = c14121.m32106(str).f65851;
                    MessageDigest messageDigestM36666 = C16111.m36666();
                    messageDigestM36666.update((byte) 1);
                    messageDigestM36666.update((byte) (i >>> 8));
                    messageDigestM36666.update((byte) i);
                    zM32075 = m32075(messageDigestM36666.digest(bArrM29399), c12828M32079);
                } else {
                    zM32075 = false;
                }
                if (!zM32075) {
                    return true;
                }
            }
        }
        Bundle bundleM32084 = m32084();
        int i2 = bundleM32084.getInt("opt_dex_version");
        boolean z2 = bundleM32084.getBoolean("opt_rm_source");
        boolean z3 = bundleM32084.getBoolean("opt_rm_line");
        boolean z4 = bundleM32084.getBoolean("opt_rm_param");
        boolean z5 = bundleM32084.getBoolean("opt_rm_prologue");
        boolean z6 = bundleM32084.getBoolean("opt_rm_local");
        boolean z7 = bundleM32084.getBoolean("opt_rm_api_mod");
        boolean z8 = i2 == 0 && !(z2 || z3 || z4 || z5 || z6 || z7);
        ArrayList arrayList = new ArrayList();
        ArrayList<C19486> arrayList2 = new ArrayList();
        MessageDigest messageDigestM36668 = C16111.m36668();
        Iterator it = c14121.f40089.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList.clear();
            arrayList2.clear();
            int length = c19486Arr.length;
            Iterator it2 = it;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                C19486 c19487 = c19486Arr[i3];
                C19486[] c19486Arr2 = c19486Arr;
                if (c19487.f59367.equals(str2)) {
                    if (c19487.f59368 != null) {
                        arrayList2.add(c19487);
                    } else {
                        if (c19487.f59365 == null) {
                            throw new IOException("Bad class item: " + c19487.f59366.replace('/', '.'));
                        }
                        arrayList.add(c19487);
                    }
                }
                i3++;
                length = i4;
                c19486Arr = c19486Arr2;
            }
            C19486[] c19486Arr3 = c19486Arr;
            C12828 c12828M32062 = c14121.m32062(str2);
            boolean z9 = z7;
            boolean z10 = z6;
            C12828 c12829 = new C12828(m38424(), C6988.m16053("dexBuild/", str2, ".digest"));
            if (z8 && arrayList2.isEmpty() && c14121.m32120(str2).f56192 == arrayList.size()) {
                objArr = z9 ? 1 : 0;
                z = z10 ? 1 : 0;
            } else {
                if (!c12828M32062.m29398() || !c12829.m29398()) {
                    return true;
                }
                Comparator comparator = C19486.f59362;
                Collections.sort(arrayList, comparator);
                Collections.sort(arrayList2, comparator);
                messageDigestM36668.reset();
                messageDigestM36668.update((byte) i2);
                messageDigestM36668.update(z2 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update(z3 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update(z4 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update(z5 ? (byte) 1 : (byte) 0);
                z = z10 ? 1 : 0;
                messageDigestM36668.update(z ? (byte) 1 : (byte) 0);
                objArr = z9 ? 1 : 0;
                messageDigestM36668.update(objArr == true ? (byte) 1 : (byte) 0);
                messageDigestM36668.update((byte) -127);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C16111.m36662(messageDigestM36668, ((C19486) it3.next()).f59366);
                }
                messageDigestM36668.update(C0684bo.f2503h);
                for (C19486 c19488 : arrayList2) {
                    C16111.m36662(messageDigestM36668, c19488.f59366);
                    C16111.m36661(messageDigestM36668, c19488.f59368.m29396());
                }
                messageDigestM36668.update((byte) -125);
                if (!m32074(c12828M32062, c12829, messageDigestM36668.digest())) {
                    return true;
                }
            }
            c14121 = this;
            it = it2;
            c19486Arr = c19486Arr3;
            Object[] objArr2 = objArr;
            z6 = z;
            z7 = objArr2 == true ? 1 : 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32096(InterfaceC12781 interfaceC12781) throws C4063, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        C9873 c9873M23150;
        boolean z4;
        ArrayList arrayList;
        C22776 c22776;
        InterfaceC12781 interfaceC12782 = interfaceC12781;
        ArrayList<C19486> arrayList2 = new ArrayList();
        ArrayList<C19486> arrayList3 = new ArrayList();
        C22776 c22777 = new C22776();
        C19486[] c19486Arr = (C19486[]) this.f40096.values().toArray(new C19486[0]);
        for (C19486 c19486 : c19486Arr) {
            C12828 c12828 = c19486.f59368;
            String str = c19486.f59366;
            if (c12828 != null) {
                interfaceC12782.mo24768(str);
                try {
                    m32066(c19486.f59367, c12828, m32079(c12828));
                } catch (C16299 e) {
                    throw new C4063(str, e);
                }
            }
        }
        Bundle bundleM32084 = m32084();
        int i = bundleM32084.getInt("opt_dex_version");
        boolean z5 = bundleM32084.getBoolean("opt_rm_source");
        boolean z6 = bundleM32084.getBoolean("opt_rm_line");
        boolean z7 = bundleM32084.getBoolean("opt_rm_param");
        boolean z8 = bundleM32084.getBoolean("opt_rm_prologue");
        boolean z9 = bundleM32084.getBoolean("opt_rm_local");
        boolean z10 = bundleM32084.getBoolean("opt_rm_api_mod");
        boolean z11 = i == 0 && !(z5 || z6 || z7 || z8 || z9 || z10);
        MessageDigest messageDigestM36668 = C16111.m36668();
        ArrayList arrayList4 = this.f40089;
        boolean z12 = z10;
        int size = arrayList4.size();
        boolean z13 = z9;
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList5 = arrayList4;
            String str2 = (String) arrayList4.get(i2);
            boolean z14 = z8;
            int i3 = i2 + 1;
            interfaceC12782.mo24767(i3, size, m32133(str2));
            arrayList2.clear();
            arrayList3.clear();
            c22777.m50960();
            int length = c19486Arr.length;
            int i4 = size;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                C19486 c19487 = c19486Arr[i5];
                C19486[] c19486Arr2 = c19486Arr;
                if (c19487.f59367.equals(str2)) {
                    if (c19487.f59368 != null) {
                        arrayList3.add(c19487);
                    } else {
                        if (c19487.f59365 == null) {
                            throw new IOException("Bad class item: " + c19487.f59366.replace('/', '.'));
                        }
                        arrayList2.add(c19487);
                    }
                }
                i5++;
                length = i6;
                c19486Arr = c19486Arr2;
            }
            C19486[] c19486Arr3 = c19486Arr;
            C12828 c12828M32062 = m32062(str2);
            C22776 c22778 = c22777;
            C12828 c12829 = new C12828(m38424(), C6988.m16053("dexBuild/", str2, ".digest"));
            if (z11 && arrayList3.isEmpty() && m32120(str2).f56192 == arrayList2.size()) {
                c12828M32062.m29395();
                c12829.m29395();
                arrayList = arrayList2;
                z4 = z12;
                z = z14 ? 1 : 0;
                z2 = z13;
                c22776 = c22778;
                z3 = z11;
            } else {
                if (interfaceC12781.mo3924()) {
                    return;
                }
                Comparator comparator = C19486.f59362;
                Collections.sort(arrayList2, comparator);
                Collections.sort(arrayList3, comparator);
                messageDigestM36668.reset();
                messageDigestM36668.update((byte) i);
                messageDigestM36668.update(z5 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update(z6 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update(z7 ? (byte) 1 : (byte) 0);
                z = z14 ? 1 : 0;
                messageDigestM36668.update(z ? (byte) 1 : (byte) 0);
                z2 = z13;
                messageDigestM36668.update(z2 ? (byte) 1 : (byte) 0);
                boolean z15 = z12;
                z3 = z11;
                messageDigestM36668.update(z15 ? (byte) 1 : (byte) 0);
                messageDigestM36668.update((byte) -127);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    C16111.m36662(messageDigestM36668, ((C19486) it.next()).f59366);
                }
                messageDigestM36668.update(C0684bo.f2503h);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    C19486 c19488 = (C19486) it2.next();
                    C16111.m36662(messageDigestM36668, c19488.f59366);
                    C16111.m36661(messageDigestM36668, c19488.f59368.m29396());
                    z15 = z15 ? 1 : 0;
                    it2 = it3;
                }
                boolean z16 = z15;
                messageDigestM36668.update((byte) -125);
                byte[] bArrDigest = messageDigestM36668.digest();
                if (m32074(c12828M32062, c12829, bArrDigest)) {
                    arrayList = arrayList2;
                    z4 = z16 ? 1 : 0;
                    c22776 = c22778;
                } else {
                    if (interfaceC12781.mo3924()) {
                        return;
                    }
                    C20689 c20689 = new C20689(arrayList3.size() + arrayList2.size());
                    c20689.m46753(new C23509(0, interfaceC12782));
                    if (i <= 0 || i >= 7) {
                        try {
                            c9873M23150 = m32120(str2).f56193;
                        } catch (IOException unused) {
                            c9873M23150 = C9873.m23150(15);
                        }
                    } else {
                        c9873M23150 = C9873.m23152(f40080[i]);
                    }
                    C20765 c20765 = new C20765(c9873M23150);
                    c20765.f65278 = z6;
                    c20765.f65274 = z2;
                    c20765.f65275 = z7;
                    c20765.f65279 = z;
                    c20765.f65280 = z5;
                    z4 = z16 ? 1 : 0;
                    c20765.f65276 = z4;
                    for (C19486 c19489 : arrayList2) {
                        ArrayList arrayList6 = arrayList2;
                        c20689.m46754(1);
                        try {
                            c20765.m46900((InterfaceC10509) new C14791(this, c19489).mo33757());
                            if (interfaceC12781.mo3924()) {
                                return;
                            } else {
                                arrayList2 = arrayList6;
                            }
                        } catch (C16299 e2) {
                            throw new C4063(c19489.f59366, e2);
                        }
                    }
                    arrayList = arrayList2;
                    for (C19486 c194810 : arrayList3) {
                        c20689.m46754(1);
                        try {
                            c20765.m46900((InterfaceC10509) new C14791(this, c194810).mo33757());
                            if (interfaceC12781.mo3924()) {
                                return;
                            }
                        } catch (C16299 e3) {
                            throw new C4063(c194810.f59366, e3);
                        }
                    }
                    m32133(str2);
                    interfaceC12781.mo24769();
                    c12828M32062.m29395();
                    c12829.m29395();
                    c22776 = c22778;
                    c20765.m50870(c22776);
                    c12828M32062.m29402().m38661(c22776.m50959(), 0, c22776.m50962());
                    C11996 c11996 = new C11996();
                    c11996.writeInt(1936945938);
                    c11996.m27454(bArrDigest);
                    c11996.m27454(Arrays.copyOfRange(c22776.m50959(), 8, 32));
                    c12829.m29402().m38661(c11996.m27458(), 0, c11996.size());
                }
            }
            z13 = z2;
            z11 = z3;
            arrayList4 = arrayList5;
            i2 = i3;
            c19486Arr = c19486Arr3;
            messageDigestM36668 = messageDigestM36668;
            arrayList2 = arrayList;
            z8 = z;
            z12 = z4;
            size = i4;
            c22777 = c22776;
            interfaceC12782 = interfaceC12781;
        }
        this.f40084 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m32138() throws IOException {
        C12828 c12828M38426 = m38426();
        c12828M38426.m29402().m38666();
        for (String str : this.f40089) {
            C12828 c12828M32062 = m32062(str);
            if (!c12828M32062.m29398()) {
                c12828M32062 = new C12828(m32108(), str);
            }
            AbstractC17043 abstractC17043M29392 = c12828M38426.m29392(m32133(str));
            InputStream inputStreamM29396 = c12828M32062.m29396();
            try {
                OutputStream outputStreamMo25506 = abstractC17043M29392.mo25506(false);
                try {
                    C23461.m52179(inputStreamM29396, outputStreamMo25506);
                    if (outputStreamMo25506 != null) {
                        outputStreamMo25506.close();
                    }
                    if (inputStreamM29396 != null) {
                        inputStreamM29396.close();
                    }
                } catch (Throwable th) {
                    if (outputStreamMo25506 != null) {
                        try {
                            outputStreamMo25506.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamM29396 != null) {
                    try {
                        inputStreamM29396.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32097(AbstractC17043 abstractC17043, boolean z) throws IOException {
        abstractC17043.mo25497();
        for (String str : this.f40089) {
            C12828 c12828M32062 = m32062(str);
            if (c12828M32062.m29398()) {
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(m32133(str));
                if (z) {
                    abstractC17043M38684.m38687();
                }
                try {
                    InputStream inputStreamM29396 = c12828M32062.m29396();
                    try {
                        OutputStream outputStreamMo25506 = abstractC17043M38684.mo25506(false);
                        try {
                            C23461.m52179(inputStreamM29396, outputStreamMo25506);
                            if (outputStreamMo25506 != null) {
                                outputStreamMo25506.close();
                            }
                            if (inputStreamM29396 != null) {
                                inputStreamM29396.close();
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo25506 != null) {
                                try {
                                    outputStreamMo25506.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStreamM29396 != null) {
                            try {
                                inputStreamM29396.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    if (z) {
                        abstractC17043M38684.m38690();
                    }
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32074(C12828 c12828, C12828 c12829, byte[] bArr) {
        if (c12828.m29398() && c12829.m29398()) {
            try {
                C14677 c14677 = new C14677(c12829.m29399());
                C23395.m52060((InterfaceC21384) c14677, 1936945938);
                if (Arrays.equals(c14677.m33583(), bArr)) {
                    DataInputStream dataInputStream = new DataInputStream(c12828.m29396());
                    byte[] bArr2 = new byte[24];
                    dataInputStream.readFully(bArr2, 0, 8);
                    dataInputStream.readFully(bArr2, 0, 24);
                    return Arrays.equals(c14677.m33583(), bArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32068(InterfaceC10630 interfaceC10630, C20689 c20689, InterfaceC15206 interfaceC15206, Set set) {
        if (interfaceC10630.mo3924()) {
            return;
        }
        c20689.m46754(1);
        C9952 c9952Mo33762 = interfaceC15206.mo33762();
        try {
            for (InterfaceC21909 interfaceC21909 : c9952Mo33762.getAnnotations()) {
                String type = interfaceC21909.getType();
                type.getClass();
                boolean z = false;
                switch (type) {
                    case "Ldalvik/annotation/InnerClass;":
                    case "Ldalvik/annotation/MemberClasses;":
                    case "Ldalvik/annotation/Signature;":
                        break;
                    default:
                        z = true;
                        break;
                }
                if (z) {
                    Iterator it = interfaceC21909.getElements().iterator();
                    while (it.hasNext()) {
                        m32069(((InterfaceC11180) it.next()).getValue(), set);
                    }
                }
            }
            Iterator it2 = c9952Mo33762.getFields().iterator();
            while (it2.hasNext()) {
                m32067((InterfaceC5815) it2.next(), set);
            }
            Iterator it3 = c9952Mo33762.getMethods().iterator();
            while (it3.hasNext()) {
                m32073((InterfaceC19897) it3.next(), set);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32069(InterfaceC12262 interfaceC12262, Set set) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 23) {
            set.add(((InterfaceC19007) interfaceC12262).getValue());
            return;
        }
        if (iMo4670 == 28) {
            Iterator it = ((InterfaceC21650) interfaceC12262).getValue().iterator();
            while (it.hasNext()) {
                m32069((InterfaceC12262) it.next(), set);
            }
        } else {
            if (iMo4670 != 29) {
                return;
            }
            Iterator it2 = ((InterfaceC23661) interfaceC12262).getElements().iterator();
            while (it2.hasNext()) {
                m32069(((InterfaceC11180) it2.next()).getValue(), set);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32067(InterfaceC5815 interfaceC5815, Set set) {
        for (InterfaceC21909 interfaceC21909 : interfaceC5815.getAnnotations()) {
            String type = interfaceC21909.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC21909.getElements().iterator();
                    while (it.hasNext()) {
                        m32069(((InterfaceC11180) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC12262 interfaceC12262Mo13085 = interfaceC5815.mo13085();
        if (interfaceC12262Mo13085 != null) {
            m32069(interfaceC12262Mo13085, set);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32073(InterfaceC19897 interfaceC19897, Set set) {
        for (InterfaceC21909 interfaceC21909 : interfaceC19897.getAnnotations()) {
            String type = interfaceC21909.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC21909.getElements().iterator();
                    while (it.hasNext()) {
                        m32069(((InterfaceC11180) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
        if (interfaceC20568Mo5857 != null) {
            for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                EnumC5850 enumC5850 = interfaceC23920.mo6217().f6090;
                if (enumC5850 == EnumC5850.Format21c || enumC5850 == EnumC5850.Format31c) {
                    if (interfaceC23920.mo6217().f6092 == 0) {
                        set.add(((InterfaceC16954) ((InterfaceC12777) interfaceC23920).getReference()).getString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫ */
    private void m32080() {
        C12828 c12828 = new C12828(m32105(), "rename_map");
        C11996 c11996 = new C11996();
        for (Map.Entry entry : this.f40100.entrySet()) {
            c11996.m27443((CharSequence) entry.getKey());
            c11996.m27443((CharSequence) entry.getValue());
        }
        c12828.m29402().m38654(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32093(HashMap map) throws IOException {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            HashMap map3 = this.f40096;
            if (map3.containsKey(str2)) {
                throw new IOException("Class exists: " + str2.replace('/', '.'));
            }
            C19486 c19486 = (C19486) map3.get(str);
            if (c19486 == null) {
                throw new IOException("Class not found: " + str.replace('/', '.'));
            }
            map2.put(c19486, str2);
        }
        if (map2.isEmpty()) {
            return;
        }
        int i = 0;
        this.f40094 = false;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : map2.entrySet()) {
            C19486 c19487 = (C19486) entry2.getKey();
            String strM32086 = m32086(c19487);
            String str3 = c19487.f59366;
            String str4 = (String) entry2.getValue();
            m32089(c19487.f59367, str4, strM32086);
            hashSet.add(str3);
            HashMap map4 = this.f40100;
            map4.put(str4, (String) C15525.getOrDefault(map4, str3, str3));
        }
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f40082;
            if (i >= arrayList.size()) {
                break;
            }
            String str5 = (String) map.get(arrayList.get(i));
            if (str5 != null) {
                arrayList.set(i, str5);
                z = true;
            }
            i++;
        }
        m32092(hashSet);
        m32080();
        m32103(true);
        if (z) {
            m32078();
            m32076();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m32133(String str) {
        String str2 = (String) this.f40099.get(str);
        return str2 == null ? C17588.m40053(str, ".dex") : str2;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m32083(String str, String str2) {
        String strM38720 = C17073.m38720(1, 1, str2);
        boolean zEquals = strM38720.equals(str);
        HashMap map = this.f40085;
        if (zEquals) {
            if (map.remove(strM38720) != null) {
                m32081();
            }
        } else {
            if (str.equals(map.put(strM38720, str))) {
                return;
            }
            m32081();
        }
    }

    /* JADX INFO: renamed from: ۬ */
    private void m32081() {
        try {
            C11996 c11996 = new C11996();
            for (Map.Entry entry : this.f40085.entrySet()) {
                c11996.m27443((CharSequence) entry.getKey());
                c11996.m27443((CharSequence) entry.getValue());
            }
            m32105().m29392("map").m38654(c11996);
        } catch (IOException e) {
            this.f40093.mo4062(e);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m32107(String str) {
        String str2 = (String) this.f40085.get(str);
        return str2 == null ? str : str2;
    }

    /* JADX INFO: renamed from: ۢ */
    public final Map m32116() {
        Set set = this.f40097;
        HashMap map = this.f40085;
        if (map.isEmpty() && set.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap(C25053.m54989(set.size() + map.size(), 4, 3, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!str2.startsWith("# TOO_LONG_NAME/")) {
                map2.put(str2, "");
            } else {
                String str3 = (String) C15525.putIfAbsent(map2, str2, str);
                if (str3 != null && !str3.equals(str)) {
                    map2.put(str2, "");
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            map2.put((String) it.next(), "");
        }
        return map2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32118(ActivityC18686 activityC18686) {
        this.f40101.m4740(activityC18686);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m32085() {
        this.f40101.m4739();
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m32112() {
        C2917 c2917 = this.f40101;
        c2917.m4739();
        c2917.m4745();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m32136() {
        C2917 c2917 = this.f40101;
        c2917.m4743();
        c2917.m4744();
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m32122() {
        this.f40101.m4742();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15206 m32127(String str) {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            return null;
        }
        return new C14791(this, c19486);
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m32123(String str) {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            return -268435456;
        }
        C12828 c12828 = c19486.f59368;
        if (c12828 != null) {
            return Long.valueOf(c12828.m29402().mo25091() ^ c12828.m29402().mo25101()).hashCode();
        }
        return c19486.f59365 != null ? -536870912 : -268435456;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ۢ */
    public final String m32115(String str) {
        C23948 c23948;
        HashMap map = this.f40096;
        C19486 c19486 = (C19486) map.get(str);
        C2917 c2917 = this.f40101;
        if (c19486 == null) {
            if (c19486 != null) {
                return "";
            }
            return "";
        }
        HashMap map2 = this.f40100;
        if (!map2.containsKey(str)) {
            if (c19486 != null) {
                return "";
            }
            return "";
        }
        String str2 = (String) map2.get(str);
        C19486 c19487 = (C19486) this.f40092.get(str2);
        if (c19487 == null) {
            c19487 = (C19486) map.get(str2);
        }
        if (c19487 != null && c19487.f59365 != null) {
            c2917.getClass();
            c23948 = new C23948();
            c2917.m4741(c19487, c23948);
        } else {
            if (c19486 != null || c19486.f59365 == null) {
                return "";
            }
            c2917.getClass();
            c23948 = new C23948();
            c2917.m4741(c19486, c23948);
        }
        return c23948.toString();
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m32113(String str) throws C20807 {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            throw new C20807("Class not found: " + str.replace('/', '.'));
        }
        return m32086(c19486);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m32086(C19486 c19486) throws C20807 {
        C12828 c12828 = c19486.f59368;
        if (c12828 != null) {
            return c12828.m29402().m38647();
        }
        if (c19486.f59365 != null) {
            C2917 c2917 = this.f40101;
            c2917.getClass();
            C23948 c23948 = new C23948();
            c2917.m4741(c19486, c23948);
            return c23948.toString();
        }
        throw new C20807("Bad class: " + c19486.f59366.replace('/', '.'));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32090(String str, C23948 c23948) throws IOException {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            throw new C20807("Class not found: " + str.replace('/', '.'));
        }
        m32100(c19486, c23948);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32100(C19486 c19486, C23948 c23948) throws IOException {
        C12828 c12828 = c19486.f59368;
        if (c12828 != null) {
            AbstractC17043 abstractC17043M29402 = c12828.m29402();
            abstractC17043M29402.getClass();
            try {
                InputStream inputStreamMo29987 = abstractC17043M29402.mo29987();
                try {
                    C23461.m52180(inputStreamMo29987, c23948, Charset.defaultCharset());
                    if (inputStreamMo29987 != null) {
                        inputStreamMo29987.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (inputStreamMo29987 != null) {
                        try {
                            inputStreamMo29987.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C14342.m32939(abstractC17043M29402, e);
                throw e;
            }
        }
        if (c19486.f59365 != null) {
            this.f40101.m4741(c19486, c23948);
        } else {
            throw new C20807("Bad class: " + c19486.f59366.replace('/', '.'));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32117(String str, String str2) throws C20807 {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            throw new C20807("Class not found: " + str.replace('/', '.'));
        }
        synchronized (this) {
            C20960 c20960M32106 = m32106(c19486.f59367);
            C2993 c2993M26641 = C11572.m26641(str2, c20960M32106.m47281(), c20960M32106);
            if (c2993M26641 == null) {
                throw new IOException("Unknown error");
            }
            m32083(c19486.f59366, c2993M26641.getType());
            m32099(c19486, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32088(String str, String str2) {
        C19486 c19486 = (C19486) this.f40096.get(str);
        if (c19486 == null) {
            throw new C20807("Class not found: " + str.replace('/', '.'));
        }
        m32099(c19486, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m32099(C19486 c19486, String str) {
        boolean z;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (c19486.f59368 == null) {
            C12828 c12828 = new C12828(new C12828(this.f40086, "smali"), c19486.f59367);
            c19486.f59368 = C12828.m29391(c12828, C10685.m24611(c12828.m29402(), c19486.f59366 + ".smali"));
            z = true;
        } else {
            z = false;
        }
        c19486.f59368.m29394(bytes);
        if (this.f40094 && z) {
            this.f40097.add(c19486.f59366);
            this.f40098.mo4062(C21562.unmodifiableSet(this.f40097));
        }
        this.f40083 = 0L;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m32129(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C19486 c19486 : this.f40096.values()) {
            if (c19486.f59366.startsWith(str)) {
                arrayList.add(c19486.f59366);
            }
        }
        m32092((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32092(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C19486 c19486 = (C19486) this.f40096.remove(str);
            if (c19486 != null) {
                C12828 c12828 = c19486.f59368;
                if (c12828 != null) {
                    c12828.m29395();
                    if (this.f40094) {
                        this.f40097.remove(str);
                        z2 = true;
                    }
                    c19486.f59368 = null;
                }
                if (c19486.f59365 != null) {
                    this.f40092.put(str, c19486);
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f40082.contains(str)) {
                    z = true;
                }
                if (this.f40100.remove(str) != null) {
                    z3 = true;
                }
            }
        }
        int length = sb.length();
        C7350 c7350 = this.f40093;
        if (length > 0) {
            AbstractC17043 abstractC17043M29392 = m32105().m29392("removed");
            try {
                abstractC17043M29392.mo37342();
                abstractC17043M29392.m38674(sb.toString());
            } catch (Throwable th) {
                c7350.mo4062(th);
            }
        }
        if (z) {
            m32076();
        }
        if (z2) {
            this.f40098.mo4062(C21562.unmodifiableSet(this.f40097));
        }
        if (z3) {
            try {
                m32080();
            } catch (IOException e) {
                c7350.mo4062(e);
            }
        }
        this.f40083 = 0L;
    }

    /* JADX INFO: renamed from: ۤ */
    private void m32078() {
        AbstractC17043 abstractC17043M29392 = m32105().m29392("recent");
        try {
            abstractC17043M29392.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC17043M29392.mo25506(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f40082.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f40093.mo4062(th3);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m32131(String str) {
        if (this.f40082.remove(str)) {
            m32078();
            m32076();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32121() {
        this.f40082.clear();
        m32078();
        m32076();
    }

    /* JADX INFO: renamed from: ֡ */
    public final Bundle m32084() {
        if (this.f40081 == null) {
            this.f40081 = new Bundle();
            AbstractC17043 abstractC17043M29392 = m32105().m29392("options");
            if (abstractC17043M29392.mo25093()) {
                try {
                    byte[] bArrM38664 = abstractC17043M29392.m38664();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrM38664, 0, bArrM38664.length);
                    parcelObtain.setDataPosition(0);
                    this.f40081.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                } catch (Exception e) {
                    this.f40093.mo4062(e);
                }
            }
        }
        return this.f40081;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m32135() {
        if (this.f40081 == null) {
            return;
        }
        AbstractC17043 abstractC17043M29392 = m32105().m29392("options");
        try {
            Parcel parcelObtain = Parcel.obtain();
            this.f40081.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC17043M29392.m38660(bArrMarshall);
        } catch (IOException e) {
            this.f40093.mo4062(e);
        }
    }

    /* JADX INFO: renamed from: ۗ */
    private void m32076() {
        ArrayList arrayList = this.f40082;
        this.f40087.mo4062(C21562.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32098(ActivityC18686 activityC18686, C6788 c6788) {
        this.f40093.m4066(activityC18686, c6788);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32101(C23194 c23194, C3984 c3984) {
        this.f40087.m4066(c23194, c3984);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32102(C23194 c23194, C6430 c6430) {
        this.f40098.m4066(c23194, c6430);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final Set m32130() {
        return C21562.unmodifiableSet(this.f40097);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m32104(final ActivityC18686 activityC18686, C5946 c5946) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m38428()) {
            boolean zMo25094 = m32105().m29392("strings_changed").mo25094();
            if (activityC18686.m42611()) {
                z = true;
            } else {
                if (this.f40084) {
                    z2 = true;
                } else if (SystemClock.uptimeMillis() - this.f40083 < C0240c.f1145a) {
                    z2 = this.f40084;
                } else {
                    try {
                        this.f40084 = m32077();
                        this.f40083 = SystemClock.uptimeMillis();
                        z2 = this.f40084;
                    } catch (Exception unused) {
                        this.f40084 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo25094) {
                int i2 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671(activityC18686);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46710(R.string.MT_Protector);
                c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20828(i, c5946));
                if (z) {
                    c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22354(4, activityC18686));
                } else {
                    c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۧۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            activityC18686.finish();
                        }
                    });
                }
                c20671.m46732();
                return true;
            }
            if (z) {
                activityC18686.m42596();
                return true;
            }
        }
        return false;
    }
}
