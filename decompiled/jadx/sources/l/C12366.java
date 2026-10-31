package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.c;
import com.umeng.analytics.pro.bo;
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
public final class C12366 extends C15256 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Bundle f37065;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f37066;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37067;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f37068;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f37069;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11005 f37070;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C5242 f37071;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37072;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37073;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37074;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f37075;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f37076;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5242 f37077;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f37079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f37080;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Set f37081;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C5242 f37082;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f37083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f37084;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0577 f37085;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f37064 = {0, 35, 37, 38, 39, 40, 41};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f37063 = C14460.m34532().getDigestLength();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30010(C12366 c12366, String str, C7980 c7980) {
        c12366.getClass();
        c12366.m30022(str, c7980.getType());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30028(String str, String str2, String str3) {
        if (this.f37080.containsKey(str2)) {
            throw new C19401("Class exists: " + str2.replace('/', '.'));
        }
        String strM7978 = AbstractC2489.m7978(str3);
        if (strM7978 == null) {
            throw new IOException("Parse class type failed.");
        }
        m30022(str2, strM7978);
        C18011 c18011 = new C18011(str2);
        c18011.f56170 = str;
        C11005 c11005 = new C11005(new C11005(this.f37070, "smali"), c18011.f56170);
        c18011.f56171 = C11005.m27329(c11005, C8751.m22641(c11005.m27340(), str2.concat(".smali")));
        c18011.f56171.m27332(str3.getBytes(Charset.defaultCharset()));
        this.f37080.put(str2, c18011);
        if (this.f37078) {
            this.f37081.add(str2);
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        this.f37067 = 0L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12366 m30021(C11005 c11005) {
        return new C12366(c11005);
    }

    public C12366(C11005 c11005) throws IOException {
        Set set;
        super(c11005);
        this.f37074 = new ArrayList();
        this.f37073 = new ArrayList();
        this.f37080 = new HashMap();
        this.f37076 = new HashMap();
        this.f37084 = new HashMap();
        this.f37075 = C20195.synchronizedMap(new C2727());
        this.f37079 = C20195.synchronizedMap(new C2727());
        this.f37069 = new HashMap();
        this.f37083 = new HashMap();
        this.f37086 = new ConcurrentMapC10942();
        this.f37072 = new ConcurrentMapC10942();
        this.f37066 = new ArrayList();
        this.f37081 = Collections.EMPTY_SET;
        this.f37078 = true;
        this.f37077 = new C5242();
        this.f37071 = new C5242();
        this.f37082 = new C5242();
        C11005 c11006 = new C11005(c11005, "dex");
        this.f37070 = c11006;
        C12171.m29642(c11006.m27336());
        this.f37085 = new C0577(this);
        C11005 c11005M30047 = m30047();
        C11005[] c11005ArrM27335 = c11005M30047.m27335();
        if (c11005ArrM27335 == null) {
            throw new IOException("List files fail in: " + c11005M30047.m27339());
        }
        HashSet hashSet = new HashSet();
        C11005 c11007 = new C11005(m30044(), "exclude_dex");
        if (c11007.m27336()) {
            for (String str : c11007.m27340().m36489().split("\n")) {
                if (!str.isEmpty()) {
                    hashSet.add(str);
                }
            }
        }
        AbstractC15440 abstractC15440M27330 = m30044().m27330("removed");
        if (abstractC15440M27330.mo23120()) {
            BufferedReader bufferedReaderM36521 = abstractC15440M27330.m36521();
            try {
                HashSet hashSet2 = new HashSet();
                while (true) {
                    String line = bufferedReaderM36521.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet2.add(line);
                    }
                }
                bufferedReaderM36521.close();
                set = hashSet2;
            } catch (Throwable th) {
                try {
                    bufferedReaderM36521.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        for (C11005 c11008 : c11005ArrM27335) {
            if (c11008.m27340().mo23119() && c11008.getName().endsWith("_list")) {
                String strM36561 = C15472.m36561(5, 0, c11008.getName());
                this.f37074.add(strM36561);
                if (!hashSet.contains(strM36561)) {
                    this.f37073.add(strM36561);
                    C11005 c11009 = new C11005(c11005M30047, strM36561);
                    C12951 c12951 = new C12951(c11008.m27337());
                    while (c12951.available() > 0) {
                        C18011 c18011 = new C18011(c12951.m31504());
                        c18011.f56170 = strM36561;
                        c18011.f56168 = c11009;
                        int i = c12951.readInt();
                        c18011.f56167 = i;
                        if ((Integer.MIN_VALUE & i) != 0) {
                            c18011.f56167 = i & Integer.MAX_VALUE;
                            c18011.f56172 = c12951.readInt();
                        } else {
                            c18011.f56172 = 0;
                        }
                        String str2 = c18011.f56169;
                        if (set.contains(str2)) {
                            this.f37076.put(str2, c18011);
                        } else {
                            this.f37080.put(str2, c18011);
                        }
                    }
                }
            }
        }
        C18717.m43345(this.f37073);
        C18717.m43345(this.f37074);
        m30071();
        ArrayList arrayList = this.f37066;
        AbstractC15440 abstractC15440M27331 = m30044().m27330("recent");
        if (abstractC15440M27331.mo23120()) {
            arrayList.clear();
            BufferedReader bufferedReaderM36522 = abstractC15440M27331.m36521();
            while (true) {
                try {
                    String line2 = bufferedReaderM36522.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM36522.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM36522.close();
            m30015();
        }
        C11005 c110010 = new C11005(m30044(), "map");
        if (c110010.m27336()) {
            C12951 c12952 = new C12951(c110010.m27337());
            while (c12952.available() > 0) {
                this.f37069.put(c12952.m31504(), c12952.m31504());
            }
        }
        C11005 c110011 = new C11005(m30044(), "rename_map");
        if (c110011.m27336()) {
            C12951 c12953 = new C12951(c110011.m27337());
            while (c12953.available() > 0) {
                this.f37084.put(c12953.m31504(), c12953.m31504());
            }
        }
        C11005 c110012 = new C11005(m30044(), "dex_name_map");
        if (c110012.m27336()) {
            C12951 c12954 = new C12951(c110012.m27337());
            while (c12954.available() > 0) {
                this.f37083.put(c12954.m31504(), c12954.m31504());
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11005 m30047() {
        return new C11005(this.f37070, e.m);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11005 m30044() {
        return new C11005(this.f37070, "config");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m30067() {
        return C20195.unmodifiableList(this.f37073);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m30073() {
        return C20195.unmodifiableList(this.f37074);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30030(ArrayList arrayList) throws C19401 {
        if (arrayList.containsAll(this.f37074)) {
            throw new C19401(R.string.MT_Protector);
        }
        C11005 c11005 = new C11005(m30044(), "exclude_dex");
        c11005.m27338();
        c11005.m27332(C9679.m24612((Collection) arrayList, '\n').getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30042(boolean z) {
        this.f37078 = z;
        if (z) {
            m30071();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30048() {
        return this.f37074.size() > 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30026(String str) {
        if (this.f37080.containsKey(str)) {
            ArrayList arrayList = this.f37066;
            if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
                arrayList.remove(str);
                arrayList.add(0, str);
                while (arrayList.size() > 30) {
                    C18473.m42953(arrayList, 1);
                }
                m30017();
                m30015();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30058(String str) {
        return this.f37080.containsKey(str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection m30063() {
        return this.f37080.values();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30050(String str) {
        Set<String> setKeySet = this.f37080.keySet();
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19562 m30045(String str) {
        C7897 c7897M21184;
        int i = m30023().getInt("opt_dex_version");
        if (i <= 0 || i >= 7) {
            try {
                c7897M21184 = m30059(str).f53012;
            } catch (IOException unused) {
                c7897M21184 = C7897.m21184(15);
            }
        } else {
            c7897M21184 = C7897.m21186(f37064[i]);
        }
        final int i2 = c7897M21184.f24463;
        return (C19562) C17997.compute(this.f37072, str, new BiFunction() { // from class: l.ܶۧۢ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C17167.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C19562 c19562 = (C19562) obj2;
                int i3 = i2;
                if (c19562 != null && c19562.f63232 == i3) {
                    return c19562;
                }
                C19562 c19563 = new C19562();
                c19563.f63232 = i3;
                return c19563;
            }
        });
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17305 m30059(String str) throws IOException {
        C12918 c12918;
        Map map = this.f37079;
        C17305 c17305 = (C17305) map.get(str);
        if (c17305 != null) {
            return c17305;
        }
        Reference reference = (Reference) this.f37075.get(str);
        if (reference != null && (c12918 = (C12918) reference.get()) != null) {
            c17305 = new C17305(c12918.mo27437(), c12918.m31408());
        }
        if (c17305 == null) {
            C23411 c23411M36513 = new C11005(m30047(), str).m27340().m36513("r");
            try {
                c23411M36513.seek(4L);
                C7897 c7897M21186 = C7897.m21186((c23411M36513.read() - 48) + ((c23411M36513.read() - 48) * 10) + ((c23411M36513.read() - 48) * 100));
                c23411M36513.seek(96L);
                C17305 c17306 = new C17305(c7897M21186, c23411M36513.mo21172());
                c23411M36513.close();
                c17305 = c17306;
            } catch (Throwable th) {
                try {
                    c23411M36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        map.put(str, c17305);
        return c17305;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12918 m30065(String str) {
        C12918 c12918;
        C12918 c12919;
        Reference reference = (Reference) this.f37075.get(str);
        if (reference != null && (c12919 = (C12918) reference.get()) != null) {
            return c12919;
        }
        synchronized (this.f37075) {
            Reference reference2 = (Reference) this.f37075.get(str);
            if (reference2 != null && (c12918 = (C12918) reference2.get()) != null) {
                return c12918;
            }
            System.out.println("Read DexFile from file: " + str);
            InputStream inputStreamM27334 = new C11005(m30047(), str).m27334();
            try {
                C12918 c12918M31380 = C12918.m31380(inputStreamM27334);
                this.f37075.put(str, new SoftReference(c12918M31380));
                inputStreamM27334.close();
                return c12918M31380;
            } catch (Throwable th) {
                if (inputStreamM27334 != null) {
                    try {
                        inputStreamM27334.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22357 m30064(final String str) {
        return (C22357) C17997.computeIfAbsent(this.f37086, str, new Function() { // from class: l.᩸ۧۢ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C7897 c7897M21184;
                try {
                    c7897M21184 = this.f69224.m30059(str).f53012;
                } catch (IOException unused) {
                    c7897M21184 = C7897.m21184(15);
                }
                C22357 c22357 = new C22357();
                c22357.f72435 = c7897M21184.f24463;
                return c22357;
            }
        });
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m30076(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        C11003.requireNonNull(c18011);
        return c18011.f56170;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17159 m30053() {
        C14336 c14336M34211 = C14336.m34211(this.f37080.keySet());
        c14336M34211.m34216(1);
        return c14336M34211.m34215();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m30071() {
        if (!this.f37078) {
            throw new IllegalStateException();
        }
        HashMap map = this.f37080;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C18011) it.next()).f56171 = null;
        }
        C11005 c11005 = new C11005(this.f37070, "smali");
        for (String str : this.f37073) {
            C11005 c11006 = new C11005(c11005, str);
            if (c11006.m27336()) {
                m30009(c11006, "", str);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C18011 c18011 = (C18011) ((Map.Entry) it2.next()).getValue();
            if (c18011.f56171 != null) {
                hashSet.add(c18011.f56169);
            } else if (c18011.f56168 == null) {
                it2.remove();
            }
        }
        C5242 c5242 = this.f37082;
        Set set = (Set) c5242.m1662();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f37081 = hashSet;
        c5242.mo1664(C20195.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30009(C11005 c11005, String str, String str2) {
        C11005[] c11005ArrM27335 = c11005.m27335();
        if (c11005ArrM27335 == null) {
            return;
        }
        for (C11005 c11006 : c11005ArrM27335) {
            if (c11006.m27340().mo23113()) {
                m30009(c11006, C22870.m50967(str, C8751.m22637(c11006.getName()), "/"), str2);
            } else {
                String strM22647 = C8751.m22647(c11006.getName());
                if (strM22647.endsWith(".smali")) {
                    StringBuilder sbM15339 = C5368.m15339(str);
                    sbM15339.append(strM22647.substring(0, strM22647.length() - 6));
                    String string = sbM15339.toString();
                    HashMap map = this.f37080;
                    C18011 c18011 = (C18011) map.get(string);
                    if (c18011 == null) {
                        c18011 = new C18011(string);
                        map.put(string, c18011);
                    }
                    c18011.f56170 = str2;
                    c18011.f56171 = c11006;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30049() {
        HashMap map = this.f37080;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new C13071(this, (C18011) it.next()));
        }
        Collections.sort(arrayList, new C4605());
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30033(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Predicate predicate) {
        m30034(new C9092(concurrentLinkedQueue), str, z, predicate);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30034(final InterfaceC7159 interfaceC7159, final String str, final boolean z, final Predicate predicate) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        boolean zIsEmpty = str.isEmpty();
        HashMap map = this.f37080;
        if (zIsEmpty && predicate == null && z) {
            C5378.stream(map.values()).sorted(C18011.f56166).map(new Function() { // from class: l.ۗۧۢ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C13071(this.f10062, (C18011) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC7159.mo19184((C13071) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        } else {
            C5378.stream(map.values()).filter(new Predicate() { // from class: l.ۚۧۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return C19285.$default$and(this, predicate2);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return C19285.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = ((C18011) obj).f56169;
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
            }).sorted(C18011.f56166).map(new Function() { // from class: l.֨ۧۢ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C13071(this.f3941, (C18011) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC7159.mo19184((C13071) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11005 m30018(C11005 c11005) {
        return new C11005(m36263(), C20094.m46315("dexBuild", c11005.m27339().substring(new C11005(this.f37070, "smali").m27339().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C11005 m30001(String str) {
        return new C11005(m36263(), C4860.m14172("dexBuild/", str, ".dex"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30005(String str, C11005 c11005, C11005 c11006) throws IOException {
        byte[] bArrM27337 = c11005.m27337();
        C19562 c19562M30045 = m30045(str);
        int i = c19562M30045.f63232;
        MessageDigest messageDigestM34532 = C14460.m34532();
        messageDigestM34532.update((byte) 1);
        messageDigestM34532.update((byte) (i >>> 8));
        messageDigestM34532.update((byte) i);
        byte[] bArrDigest = messageDigestM34532.digest(bArrM27337);
        if (m30014(bArrDigest, c11006)) {
            return;
        }
        C19357 c19357M44986 = c19562M30045.m44986();
        C9684.m24627(new String(bArrM27337, StandardCharsets.UTF_8), c19357M44986, c19562M30045);
        C21473 c21473 = new C21473();
        c19357M44986.m48534(c21473);
        c11006.m27338();
        OutputStream outputStreamMo23555 = c11006.m27340().mo23555(false);
        try {
            outputStreamMo23555.write(bArrDigest);
            outputStreamMo23555.write(c21473.m48622(), 0, c21473.m48625());
            outputStreamMo23555.close();
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30014(byte[] bArr, C11005 c11005) {
        if (c11005.m27336()) {
            try {
                InputStream inputStreamM27334 = c11005.m27334();
                try {
                    for (int i : bArr) {
                        if (inputStreamM27334.read() != (i & 255)) {
                            inputStreamM27334.close();
                            return false;
                        }
                    }
                    if (inputStreamM27334 != null) {
                        inputStreamM27334.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM27334 != null) {
                        try {
                            inputStreamM27334.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7980 m30003(C11005 c11005) {
        return (C7980) ((AbstractC18605) new C12918(c11005.m27337(), f37063, true).mo27438()).iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30016() throws IOException {
        boolean z;
        Object[] objArr;
        boolean zM30014;
        C12366 c12366 = this;
        C18011[] c18011Arr = (C18011[]) c12366.f37080.values().toArray(new C18011[0]);
        for (C18011 c18011 : c18011Arr) {
            C11005 c11005 = c18011.f56171;
            if (c11005 != null) {
                C11005 c11005M30018 = c12366.m30018(c11005);
                String str = c18011.f56170;
                if (c11005M30018.m27336()) {
                    byte[] bArrM27337 = c11005.m27337();
                    int i = c12366.m30045(str).f63232;
                    MessageDigest messageDigestM34532 = C14460.m34532();
                    messageDigestM34532.update((byte) 1);
                    messageDigestM34532.update((byte) (i >>> 8));
                    messageDigestM34532.update((byte) i);
                    zM30014 = m30014(messageDigestM34532.digest(bArrM27337), c11005M30018);
                } else {
                    zM30014 = false;
                }
                if (!zM30014) {
                    return true;
                }
            }
        }
        Bundle bundleM30023 = m30023();
        int i2 = bundleM30023.getInt("opt_dex_version");
        boolean z2 = bundleM30023.getBoolean("opt_rm_source");
        boolean z3 = bundleM30023.getBoolean("opt_rm_line");
        boolean z4 = bundleM30023.getBoolean("opt_rm_param");
        boolean z5 = bundleM30023.getBoolean("opt_rm_prologue");
        boolean z6 = bundleM30023.getBoolean("opt_rm_local");
        boolean z7 = bundleM30023.getBoolean("opt_rm_api_mod");
        boolean z8 = i2 == 0 && !(z2 || z3 || z4 || z5 || z6 || z7);
        ArrayList arrayList = new ArrayList();
        ArrayList<C18011> arrayList2 = new ArrayList();
        MessageDigest messageDigestM34534 = C14460.m34534();
        Iterator it = c12366.f37073.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList.clear();
            arrayList2.clear();
            int length = c18011Arr.length;
            Iterator it2 = it;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                C18011 c18012 = c18011Arr[i3];
                C18011[] c18011Arr2 = c18011Arr;
                if (c18012.f56170.equals(str2)) {
                    if (c18012.f56171 != null) {
                        arrayList2.add(c18012);
                    } else {
                        if (c18012.f56168 == null) {
                            throw new IOException("Bad class item: " + c18012.f56169.replace('/', '.'));
                        }
                        arrayList.add(c18012);
                    }
                }
                i3++;
                length = i4;
                c18011Arr = c18011Arr2;
            }
            C18011[] c18011Arr3 = c18011Arr;
            C11005 c11005M30001 = c12366.m30001(str2);
            boolean z9 = z7;
            boolean z10 = z6;
            C11005 c11006 = new C11005(m36263(), C4860.m14172("dexBuild/", str2, ".digest"));
            if (z8 && arrayList2.isEmpty() && c12366.m30059(str2).f53011 == arrayList.size()) {
                objArr = z9 ? 1 : 0;
                z = z10 ? 1 : 0;
            } else {
                if (!c11005M30001.m27336() || !c11006.m27336()) {
                    return true;
                }
                Comparator comparator = C18011.f56165;
                Collections.sort(arrayList, comparator);
                Collections.sort(arrayList2, comparator);
                messageDigestM34534.reset();
                messageDigestM34534.update((byte) i2);
                messageDigestM34534.update(z2 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update(z3 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update(z4 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update(z5 ? (byte) 1 : (byte) 0);
                z = z10 ? 1 : 0;
                messageDigestM34534.update(z ? (byte) 1 : (byte) 0);
                objArr = z9 ? 1 : 0;
                messageDigestM34534.update(objArr == true ? (byte) 1 : (byte) 0);
                messageDigestM34534.update((byte) -127);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C14460.m34528(messageDigestM34534, ((C18011) it3.next()).f56169);
                }
                messageDigestM34534.update(bo.h);
                for (C18011 c18013 : arrayList2) {
                    C14460.m34528(messageDigestM34534, c18013.f56169);
                    C14460.m34527(messageDigestM34534, c18013.f56171.m27334());
                }
                messageDigestM34534.update((byte) -125);
                if (!m30013(c11005M30001, c11006, messageDigestM34534.digest())) {
                    return true;
                }
            }
            c12366 = this;
            it = it2;
            c18011Arr = c18011Arr3;
            Object[] objArr2 = objArr;
            z6 = z;
            z7 = objArr2 == true ? 1 : 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30035(InterfaceC10956 interfaceC10956) throws C1783, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        C7897 c7897M21184;
        boolean z4;
        ArrayList arrayList;
        C21473 c21473;
        InterfaceC10956 interfaceC10957 = interfaceC10956;
        ArrayList<C18011> arrayList2 = new ArrayList();
        ArrayList<C18011> arrayList3 = new ArrayList();
        C21473 c21474 = new C21473();
        C18011[] c18011Arr = (C18011[]) this.f37080.values().toArray(new C18011[0]);
        for (C18011 c18011 : c18011Arr) {
            C11005 c11005 = c18011.f56171;
            String str = c18011.f56169;
            if (c11005 != null) {
                interfaceC10957.mo22798(str);
                try {
                    m30005(c18011.f56170, c11005, m30018(c11005));
                } catch (C14658 e) {
                    throw new C1783(str, e);
                }
            }
        }
        Bundle bundleM30023 = m30023();
        int i = bundleM30023.getInt("opt_dex_version");
        boolean z5 = bundleM30023.getBoolean("opt_rm_source");
        boolean z6 = bundleM30023.getBoolean("opt_rm_line");
        boolean z7 = bundleM30023.getBoolean("opt_rm_param");
        boolean z8 = bundleM30023.getBoolean("opt_rm_prologue");
        boolean z9 = bundleM30023.getBoolean("opt_rm_local");
        boolean z10 = bundleM30023.getBoolean("opt_rm_api_mod");
        boolean z11 = i == 0 && !(z5 || z6 || z7 || z8 || z9 || z10);
        MessageDigest messageDigestM34534 = C14460.m34534();
        ArrayList arrayList4 = this.f37073;
        boolean z12 = z10;
        int size = arrayList4.size();
        boolean z13 = z9;
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList5 = arrayList4;
            String str2 = (String) arrayList4.get(i2);
            boolean z14 = z8;
            int i3 = i2 + 1;
            interfaceC10957.mo22797(i3, size, m30072(str2));
            arrayList2.clear();
            arrayList3.clear();
            c21474.m48623();
            int length = c18011Arr.length;
            int i4 = size;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                C18011 c18012 = c18011Arr[i5];
                C18011[] c18011Arr2 = c18011Arr;
                if (c18012.f56170.equals(str2)) {
                    if (c18012.f56171 != null) {
                        arrayList3.add(c18012);
                    } else {
                        if (c18012.f56168 == null) {
                            throw new IOException("Bad class item: " + c18012.f56169.replace('/', '.'));
                        }
                        arrayList2.add(c18012);
                    }
                }
                i5++;
                length = i6;
                c18011Arr = c18011Arr2;
            }
            C18011[] c18011Arr3 = c18011Arr;
            C11005 c11005M30001 = m30001(str2);
            C21473 c21475 = c21474;
            C11005 c11006 = new C11005(m36263(), C4860.m14172("dexBuild/", str2, ".digest"));
            if (z11 && arrayList3.isEmpty() && m30059(str2).f53011 == arrayList2.size()) {
                c11005M30001.m27333();
                c11006.m27333();
                arrayList = arrayList2;
                z4 = z12;
                z = z14 ? 1 : 0;
                z2 = z13;
                c21473 = c21475;
                z3 = z11;
            } else {
                if (interfaceC10956.mo1526()) {
                    return;
                }
                Comparator comparator = C18011.f56165;
                Collections.sort(arrayList2, comparator);
                Collections.sort(arrayList3, comparator);
                messageDigestM34534.reset();
                messageDigestM34534.update((byte) i);
                messageDigestM34534.update(z5 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update(z6 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update(z7 ? (byte) 1 : (byte) 0);
                z = z14 ? 1 : 0;
                messageDigestM34534.update(z ? (byte) 1 : (byte) 0);
                z2 = z13;
                messageDigestM34534.update(z2 ? (byte) 1 : (byte) 0);
                boolean z15 = z12;
                z3 = z11;
                messageDigestM34534.update(z15 ? (byte) 1 : (byte) 0);
                messageDigestM34534.update((byte) -127);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    C14460.m34528(messageDigestM34534, ((C18011) it.next()).f56169);
                }
                messageDigestM34534.update(bo.h);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    C18011 c18013 = (C18011) it2.next();
                    C14460.m34528(messageDigestM34534, c18013.f56169);
                    C14460.m34527(messageDigestM34534, c18013.f56171.m27334());
                    z15 = z15 ? 1 : 0;
                    it2 = it3;
                }
                boolean z16 = z15;
                messageDigestM34534.update((byte) -125);
                byte[] bArrDigest = messageDigestM34534.digest();
                if (m30013(c11005M30001, c11006, bArrDigest)) {
                    arrayList = arrayList2;
                    z4 = z16 ? 1 : 0;
                    c21473 = c21475;
                } else {
                    if (interfaceC10956.mo1526()) {
                        return;
                    }
                    C19277 c19277 = new C19277(arrayList3.size() + arrayList2.size());
                    c19277.m44459(new C22244(0, interfaceC10957));
                    if (i <= 0 || i >= 7) {
                        try {
                            c7897M21184 = m30059(str2).f53012;
                        } catch (IOException unused) {
                            c7897M21184 = C7897.m21184(15);
                        }
                    } else {
                        c7897M21184 = C7897.m21186(f37064[i]);
                    }
                    C19357 c19357 = new C19357(c7897M21184);
                    c19357.f62665 = z6;
                    c19357.f62661 = z2;
                    c19357.f62662 = z7;
                    c19357.f62666 = z;
                    c19357.f62667 = z5;
                    z4 = z16 ? 1 : 0;
                    c19357.f62663 = z4;
                    for (C18011 c18014 : arrayList2) {
                        ArrayList arrayList6 = arrayList2;
                        c19277.m44460(1);
                        try {
                            c19357.m44606((InterfaceC8566) new C13071(this, c18014).mo31669());
                            if (interfaceC10956.mo1526()) {
                                return;
                            } else {
                                arrayList2 = arrayList6;
                            }
                        } catch (C14658 e2) {
                            throw new C1783(c18014.f56169, e2);
                        }
                    }
                    arrayList = arrayList2;
                    for (C18011 c18015 : arrayList3) {
                        c19277.m44460(1);
                        try {
                            c19357.m44606((InterfaceC8566) new C13071(this, c18015).mo31669());
                            if (interfaceC10956.mo1526()) {
                                return;
                            }
                        } catch (C14658 e3) {
                            throw new C1783(c18015.f56169, e3);
                        }
                    }
                    m30072(str2);
                    interfaceC10956.mo22799();
                    c11005M30001.m27333();
                    c11006.m27333();
                    c21473 = c21475;
                    c19357.m48534(c21473);
                    c11005M30001.m27340().m36503(c21473.m48622(), 0, c21473.m48625());
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1936945938);
                    c10130.m25434(bArrDigest);
                    c10130.m25434(Arrays.copyOfRange(c21473.m48622(), 8, 32));
                    c11006.m27340().m36503(c10130.m25438(), 0, c10130.size());
                }
            }
            z13 = z2;
            z11 = z3;
            arrayList4 = arrayList5;
            i2 = i3;
            c18011Arr = c18011Arr3;
            messageDigestM34534 = messageDigestM34534;
            arrayList2 = arrayList;
            z8 = z;
            z12 = z4;
            size = i4;
            c21474 = c21473;
            interfaceC10957 = interfaceC10956;
        }
        this.f37068 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30077() throws IOException {
        C11005 c11005M36265 = m36265();
        c11005M36265.m27340().m36508();
        for (String str : this.f37073) {
            C11005 c11005M30001 = m30001(str);
            if (!c11005M30001.m27336()) {
                c11005M30001 = new C11005(m30047(), str);
            }
            AbstractC15440 abstractC15440M27330 = c11005M36265.m27330(m30072(str));
            InputStream inputStreamM27334 = c11005M30001.m27334();
            try {
                OutputStream outputStreamMo23555 = abstractC15440M27330.mo23555(false);
                try {
                    C22194.m49852(inputStreamM27334, outputStreamMo23555);
                    if (outputStreamMo23555 != null) {
                        outputStreamMo23555.close();
                    }
                    if (inputStreamM27334 != null) {
                        inputStreamM27334.close();
                    }
                } catch (Throwable th) {
                    if (outputStreamMo23555 != null) {
                        try {
                            outputStreamMo23555.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamM27334 != null) {
                    try {
                        inputStreamM27334.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30036(AbstractC15440 abstractC15440, boolean z) throws IOException {
        abstractC15440.mo23546();
        for (String str : this.f37073) {
            C11005 c11005M30001 = m30001(str);
            if (c11005M30001.m27336()) {
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(m30072(str));
                if (z) {
                    abstractC15440M36526.m36529();
                }
                try {
                    InputStream inputStreamM27334 = c11005M30001.m27334();
                    try {
                        OutputStream outputStreamMo23555 = abstractC15440M36526.mo23555(false);
                        try {
                            C22194.m49852(inputStreamM27334, outputStreamMo23555);
                            if (outputStreamMo23555 != null) {
                                outputStreamMo23555.close();
                            }
                            if (inputStreamM27334 != null) {
                                inputStreamM27334.close();
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo23555 != null) {
                                try {
                                    outputStreamMo23555.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStreamM27334 != null) {
                            try {
                                inputStreamM27334.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    if (z) {
                        abstractC15440M36526.m36532();
                    }
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30013(C11005 c11005, C11005 c11006, byte[] bArr) {
        if (c11005.m27336() && c11006.m27336()) {
            try {
                C12951 c12951 = new C12951(c11006.m27337());
                C22124.m49722((InterfaceC20008) c12951, 1936945938);
                if (Arrays.equals(c12951.m31496(), bArr)) {
                    DataInputStream dataInputStream = new DataInputStream(c11005.m27334());
                    byte[] bArr2 = new byte[24];
                    dataInputStream.readFully(bArr2, 0, 8);
                    dataInputStream.readFully(bArr2, 0, 24);
                    return Arrays.equals(c12951.m31496(), bArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30007(InterfaceC8693 interfaceC8693, C19277 c19277, InterfaceC13508 interfaceC13508, Set set) {
        if (interfaceC8693.mo1526()) {
            return;
        }
        c19277.m44460(1);
        C7980 c7980Mo31674 = interfaceC13508.mo31674();
        try {
            for (InterfaceC20561 interfaceC20561 : c7980Mo31674.getAnnotations()) {
                String type = interfaceC20561.getType();
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
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                }
            }
            Iterator it2 = c7980Mo31674.getFields().iterator();
            while (it2.hasNext()) {
                m30006((InterfaceC3627) it2.next(), set);
            }
            Iterator it3 = c7980Mo31674.getMethods().iterator();
            while (it3.hasNext()) {
                m30012((InterfaceC18444) it3.next(), set);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30008(InterfaceC10410 interfaceC10410, Set set) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 23) {
            set.add(((InterfaceC17507) interfaceC10410).getValue());
            return;
        }
        if (iMo2302 == 28) {
            Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
            while (it.hasNext()) {
                m30008((InterfaceC10410) it.next(), set);
            }
        } else {
            if (iMo2302 != 29) {
                return;
            }
            Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
            while (it2.hasNext()) {
                m30008(((InterfaceC9272) it2.next()).getValue(), set);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30006(InterfaceC3627 interfaceC3627, Set set) {
        for (InterfaceC20561 interfaceC20561 : interfaceC3627.getAnnotations()) {
            String type = interfaceC20561.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC10410 interfaceC10410Mo11109 = interfaceC3627.mo11109();
        if (interfaceC10410Mo11109 != null) {
            m30008(interfaceC10410Mo11109, set);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30012(InterfaceC18444 interfaceC18444, Set set) {
        for (InterfaceC20561 interfaceC20561 : interfaceC18444.getAnnotations()) {
            String type = interfaceC20561.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
        if (interfaceC19150Mo3570 != null) {
            for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                EnumC3664 enumC3664 = interfaceC22677.mo3975().f3316;
                if (enumC3664 == EnumC3664.Format21c || enumC3664 == EnumC3664.Format31c) {
                    if (interfaceC22677.mo3975().f3318 == 0) {
                        set.add(((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m30019() {
        C11005 c11005 = new C11005(m30044(), "rename_map");
        C10130 c10130 = new C10130();
        for (Map.Entry entry : this.f37084.entrySet()) {
            c10130.m25423((CharSequence) entry.getKey());
            c10130.m25423((CharSequence) entry.getValue());
        }
        c11005.m27340().m36496(c10130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30032(HashMap map) throws IOException {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            HashMap map3 = this.f37080;
            if (map3.containsKey(str2)) {
                throw new IOException("Class exists: " + str2.replace('/', '.'));
            }
            C18011 c18011 = (C18011) map3.get(str);
            if (c18011 == null) {
                throw new IOException("Class not found: " + str.replace('/', '.'));
            }
            map2.put(c18011, str2);
        }
        if (map2.isEmpty()) {
            return;
        }
        int i = 0;
        this.f37078 = false;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : map2.entrySet()) {
            C18011 c18012 = (C18011) entry2.getKey();
            String strM30025 = m30025(c18012);
            String str3 = c18012.f56169;
            String str4 = (String) entry2.getValue();
            m30028(c18012.f56170, str4, strM30025);
            hashSet.add(str3);
            HashMap map4 = this.f37084;
            map4.put(str4, (String) C13843.getOrDefault(map4, str3, str3));
        }
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f37066;
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
        m30031(hashSet);
        m30019();
        m30042(true);
        if (z) {
            m30017();
            m30015();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m30072(String str) {
        String str2 = (String) this.f37083.get(str);
        return str2 == null ? C16014.m37867(str, ".dex") : str2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m30022(String str, String str2) {
        String strM36561 = C15472.m36561(1, 1, str2);
        boolean zEquals = strM36561.equals(str);
        HashMap map = this.f37069;
        if (zEquals) {
            if (map.remove(strM36561) != null) {
                m30020();
            }
        } else {
            if (str.equals(map.put(strM36561, str))) {
                return;
            }
            m30020();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m30020() {
        try {
            C10130 c10130 = new C10130();
            for (Map.Entry entry : this.f37069.entrySet()) {
                c10130.m25423((CharSequence) entry.getKey());
                c10130.m25423((CharSequence) entry.getValue());
            }
            m30044().m27330("map").m36496(c10130);
        } catch (IOException e) {
            this.f37077.mo1664(e);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m30046(String str) {
        String str2 = (String) this.f37069.get(str);
        return str2 == null ? str : str2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Map m30055() {
        Set set = this.f37081;
        HashMap map = this.f37069;
        if (map.isEmpty() && set.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap(C23868.m52580(set.size() + map.size(), 4, 3, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!str2.startsWith("# TOO_LONG_NAME/")) {
                map2.put(str2, "");
            } else {
                String str3 = (String) C13843.putIfAbsent(map2, str2, str);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30057(ActivityC17169 activityC17169) {
        this.f37085.m2369(activityC17169);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m30024() {
        this.f37085.m2368();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m30051() {
        C0577 c0577 = this.f37085;
        c0577.m2368();
        c0577.m2374();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30075() {
        C0577 c0577 = this.f37085;
        c0577.m2372();
        c0577.m2373();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m30061() {
        this.f37085.m2371();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13508 m30066(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            return null;
        }
        return new C13071(this, c18011);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m30062(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            return -268435456;
        }
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            return Long.valueOf(c11005.m27340().mo23117() ^ c11005.m27340().mo23127()).hashCode();
        }
        return c18011.f56168 != null ? -536870912 : -268435456;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m30054(String str) {
        C22706 c22706;
        HashMap map = this.f37080;
        C18011 c18011 = (C18011) map.get(str);
        C0577 c0577 = this.f37085;
        if (c18011 == null) {
            if (c18011 != null) {
                return "";
            }
            return "";
        }
        HashMap map2 = this.f37084;
        if (!map2.containsKey(str)) {
            if (c18011 != null) {
                return "";
            }
            return "";
        }
        String str2 = (String) map2.get(str);
        C18011 c18012 = (C18011) this.f37076.get(str2);
        if (c18012 == null) {
            c18012 = (C18011) map.get(str2);
        }
        if (c18012 != null && c18012.f56168 != null) {
            c0577.getClass();
            c22706 = new C22706();
            c0577.m2370(c18012, c22706);
        } else {
            if (c18011 != null || c18011.f56168 == null) {
                return "";
            }
            c0577.getClass();
            c22706 = new C22706();
            c0577.m2370(c18011, c22706);
        }
        return c22706.toString();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m30052(String str) throws C19401 {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        return m30025(c18011);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30025(C18011 c18011) throws C19401 {
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            return c11005.m27340().m36489();
        }
        if (c18011.f56168 != null) {
            C0577 c0577 = this.f37085;
            c0577.getClass();
            C22706 c22706 = new C22706();
            c0577.m2370(c18011, c22706);
            return c22706.toString();
        }
        throw new C19401("Bad class: " + c18011.f56169.replace('/', '.'));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30029(String str, C22706 c22706) throws IOException {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        m30039(c18011, c22706);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30039(C18011 c18011, C22706 c22706) throws IOException {
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            AbstractC15440 abstractC15440M27340 = c11005.m27340();
            abstractC15440M27340.getClass();
            try {
                InputStream inputStreamMo27926 = abstractC15440M27340.mo27926();
                try {
                    C22194.m49853(inputStreamMo27926, c22706, Charset.defaultCharset());
                    if (inputStreamMo27926 != null) {
                        inputStreamMo27926.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (inputStreamMo27926 != null) {
                        try {
                            inputStreamMo27926.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C12598.m30862(abstractC15440M27340, e);
                throw e;
            }
        }
        if (c18011.f56168 != null) {
            this.f37085.m2370(c18011, c22706);
        } else {
            throw new C19401("Bad class: " + c18011.f56169.replace('/', '.'));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30056(String str, String str2) throws C19401 {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        synchronized (this) {
            C19562 c19562M30045 = m30045(c18011.f56170);
            C0657 c0657M24627 = C9684.m24627(str2, c19562M30045.m44986(), c19562M30045);
            if (c0657M24627 == null) {
                throw new IOException("Unknown error");
            }
            m30022(c18011.f56169, c0657M24627.getType());
            m30038(c18011, str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30027(String str, String str2) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        m30038(c18011, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30038(C18011 c18011, String str) {
        boolean z;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (c18011.f56171 == null) {
            C11005 c11005 = new C11005(new C11005(this.f37070, "smali"), c18011.f56170);
            c18011.f56171 = C11005.m27329(c11005, C8751.m22641(c11005.m27340(), c18011.f56169 + ".smali"));
            z = true;
        } else {
            z = false;
        }
        c18011.f56171.m27332(bytes);
        if (this.f37078 && z) {
            this.f37081.add(c18011.f56169);
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        this.f37067 = 0L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30068(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C18011 c18011 : this.f37080.values()) {
            if (c18011.f56169.startsWith(str)) {
                arrayList.add(c18011.f56169);
            }
        }
        m30031((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30031(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C18011 c18011 = (C18011) this.f37080.remove(str);
            if (c18011 != null) {
                C11005 c11005 = c18011.f56171;
                if (c11005 != null) {
                    c11005.m27333();
                    if (this.f37078) {
                        this.f37081.remove(str);
                        z2 = true;
                    }
                    c18011.f56171 = null;
                }
                if (c18011.f56168 != null) {
                    this.f37076.put(str, c18011);
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f37066.contains(str)) {
                    z = true;
                }
                if (this.f37084.remove(str) != null) {
                    z3 = true;
                }
            }
        }
        int length = sb.length();
        C5242 c5242 = this.f37077;
        if (length > 0) {
            AbstractC15440 abstractC15440M27330 = m30044().m27330("removed");
            try {
                abstractC15440M27330.mo35195();
                abstractC15440M27330.m36516(sb.toString());
            } catch (Throwable th) {
                c5242.mo1664(th);
            }
        }
        if (z) {
            m30015();
        }
        if (z2) {
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        if (z3) {
            try {
                m30019();
            } catch (IOException e) {
                c5242.mo1664(e);
            }
        }
        this.f37067 = 0L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m30017() {
        AbstractC15440 abstractC15440M27330 = m30044().m27330("recent");
        try {
            abstractC15440M27330.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC15440M27330.mo23555(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f37066.iterator();
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
            this.f37077.mo1664(th3);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30070(String str) {
        if (this.f37066.remove(str)) {
            m30017();
            m30015();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30060() {
        this.f37066.clear();
        m30017();
        m30015();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Bundle m30023() {
        if (this.f37065 == null) {
            this.f37065 = new Bundle();
            AbstractC15440 abstractC15440M27330 = m30044().m27330("options");
            if (abstractC15440M27330.mo23119()) {
                try {
                    byte[] bArrM36506 = abstractC15440M27330.m36506();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrM36506, 0, bArrM36506.length);
                    parcelObtain.setDataPosition(0);
                    this.f37065.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                } catch (Exception e) {
                    this.f37077.mo1664(e);
                }
            }
        }
        return this.f37065;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m30074() {
        if (this.f37065 == null) {
            return;
        }
        AbstractC15440 abstractC15440M27330 = m30044().m27330("options");
        try {
            Parcel parcelObtain = Parcel.obtain();
            this.f37065.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC15440M27330.m36502(bArrMarshall);
        } catch (IOException e) {
            this.f37077.mo1664(e);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m30015() {
        ArrayList arrayList = this.f37066;
        this.f37071.mo1664(C20195.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30037(ActivityC17169 activityC17169, C4650 c4650) {
        this.f37077.m1668(activityC17169, c4650);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30040(C21912 c21912, C1700 c1700) {
        this.f37071.m1668(c21912, c1700);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30041(C21912 c21912, C4273 c4273) {
        this.f37082.m1668(c21912, c4273);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set m30069() {
        return C20195.unmodifiableSet(this.f37081);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30043(final ActivityC17169 activityC17169, C3764 c3764) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m36267()) {
            boolean zMo23120 = m30044().m27330("strings_changed").mo23120();
            if (activityC17169.m40366()) {
                z = true;
            } else {
                if (this.f37068) {
                    z2 = true;
                } else if (SystemClock.uptimeMillis() - this.f37067 < c.a) {
                    z2 = this.f37068;
                } else {
                    try {
                        this.f37068 = m30016();
                        this.f37067 = SystemClock.uptimeMillis();
                        z2 = this.f37068;
                    } catch (Exception unused) {
                        this.f37068 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo23120) {
                int i2 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(activityC17169);
                c19258.m44433(R.string.MT_Protector);
                c19258.m44416(R.string.MT_Protector);
                c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19423(i, c3764));
                if (z) {
                    c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21028(4, activityC17169));
                } else {
                    c19258.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۧۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            activityC17169.finish();
                        }
                    });
                }
                c19258.m44438();
                return true;
            }
            if (z) {
                activityC17169.m40351();
                return true;
            }
        }
        return false;
    }
}
