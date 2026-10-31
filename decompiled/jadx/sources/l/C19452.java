package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.᩵ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19452 extends C15256 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f62909 = C14460.m34532().getDigestLength();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62910;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5242 f62911;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f62912;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C4583 f62913;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5242 f62914;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11005 f62915;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5242 f62916;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8367 f62917;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f62918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f62919;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f62920;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f62921;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f62922;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f62923;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f62924;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44801(C19452 c19452, C0732 c0732, C10355 c10355, C2678 c2678, C12555 c12555, C18116 c18116, Map map) throws C5672 {
        String str = c0732.f2758;
        try {
            C19220 c19220M44809 = c19452.m44809(c0732);
            c10355.m26165();
            C11766.m28799(c19220M44809, c2678, c10355, c12555, c18116);
            List listM26159 = c10355.m26159();
            if (map != null) {
                map.put(str, listM26159);
            }
            c19220M44809.m44349();
        } catch (C1580 e) {
            throw new C5672(str, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44819(String str, String str2) {
        if (!this.f62921.containsKey(str)) {
            C0732 c0732 = new C0732(str, false);
            C11005 c11005 = new C11005(new C11005(this.f62915, DocumentReader.RESERVED), str + ".xml");
            c0732.f2760 = c11005;
            c11005.m27340().m36510(str2);
            this.f62921.put(str, c0732);
            if (this.f62918) {
                this.f62923.add(str);
                this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
            }
        } else {
            throw new C19401("Xml exists: " + str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19452 m44813(C11005 c11005) {
        return new C19452(c11005);
    }

    public C19452(C11005 c11005) throws IOException {
        super(c11005);
        this.f62921 = new HashMap();
        this.f62910 = new ArrayList();
        Set set = Collections.EMPTY_SET;
        this.f62923 = set;
        this.f62917 = new C8367();
        this.f62916 = new C5242();
        this.f62911 = new C5242();
        this.f62914 = new C5242();
        this.f62918 = true;
        this.f62919 = false;
        this.f62913 = new C4583();
        C11005 c11006 = new C11005(c11005, "arsc");
        this.f62915 = c11006;
        C12171.m29642(c11006.m27336());
        AbstractC15440 abstractC15440M27330 = m44854().m27330("removed");
        Set set2 = set;
        if (abstractC15440M27330.mo23120()) {
            BufferedReader bufferedReaderM36521 = abstractC15440M27330.m36521();
            try {
                HashSet hashSet = new HashSet();
                while (true) {
                    String line = bufferedReaderM36521.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet.add(line);
                    }
                }
                bufferedReaderM36521.close();
                set2 = hashSet;
            } catch (Throwable th) {
                try {
                    bufferedReaderM36521.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C11005 c11007 = new C11005(m44839(), "xmls");
        if (!c11007.m27336()) {
            throw new IOException("File not found: " + c11007.m27339());
        }
        ArrayList<C0732> arrayListM44814 = m44814(c11007);
        this.f62922 = arrayListM44814.size();
        for (C0732 c0732 : arrayListM44814) {
            if (!set2.contains(c0732.f2758)) {
                this.f62921.put(c0732.f2758, c0732);
            }
        }
        m44816();
        ArrayList arrayList = this.f62910;
        AbstractC15440 abstractC15440M27331 = m44854().m27330("recent");
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
            m44811();
        }
        this.f62920 = new C11005(m44854(), "name").m27340().m36489();
        C11005 c11008 = new C11005(m44854(), "pkgsort");
        if (c11008.m27336()) {
            C12951 c12951 = new C12951(c11008.m27337());
            C22124.m49722((InterfaceC20008) c12951, -1430501583);
            while (c12951.available() > 0) {
                this.f62917.mo21965(c12951.m31494(), (Object) c12951.m31506());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44814(C11005 c11005) {
        boolean z;
        C11541 c11541 = new C11541(c11005.m27340());
        try {
            if (c11541.m28418() == 1920094587) {
                c11541.skipBytes(4);
                z = true;
            } else {
                C22124.m49722(c11541, 1920094586);
                z = false;
            }
            int i = c11541.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String strM28421 = c11541.m28421();
                int i3 = c11541.readInt();
                int i4 = c11541.readInt();
                C0732 c0732 = new C0732(strM28421, z);
                c0732.f2765 = c11005;
                c0732.f2764 = i3;
                c0732.f2763 = i4;
                arrayList.add(c0732);
            }
            c11541.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c11541.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11005 m44839() {
        return new C11005(this.f62915, e.m);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11005 m44854() {
        return new C11005(this.f62915, "config");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m44837() {
        return this.f62920;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44830(boolean z) {
        this.f62918 = z;
        if (z) {
            m44816();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44802(C11005 c11005, C11005 c11006, byte[] bArr) {
        if (this.f62919 || !c11005.m27336() || !c11006.m27336()) {
            return false;
        }
        try {
            C12951 c12951 = new C12951(c11006.m27337());
            C22124.m49722((InterfaceC20008) c12951, 1936945938);
            if (!Arrays.equals(c12951.m31496(), bArr)) {
                return false;
            }
            MessageDigest messageDigestM34526 = C14460.m34526();
            C14460.m34527(messageDigestM34526, c11005.m27340().mo27926());
            return Arrays.equals(c12951.m31496(), messageDigestM34526.digest());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m44838(String str) {
        return this.f62921.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Collection m44852() {
        return this.f62921.values();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17159 m44834() {
        C14336 c14336M34211 = C14336.m34211(this.f62921.keySet());
        c14336M34211.m34217(new C3404(2));
        C17159 c17159M34215 = c14336M34211.m34215();
        Collections.sort(c17159M34215.m40255(), new C14511(this));
        return c17159M34215;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m44792(C19452 c19452, C17159 c17159, C17159 c171510) {
        C8367 c8367 = c19452.f62917;
        int iMo24837 = c8367.mo24837(EnumC3478.f11018, c17159.m40257());
        int iMo24838 = c8367.mo24837(EnumC3478.f11018, c171510.m40257());
        if (iMo24837 == iMo24838) {
            return c17159.m40257().compareToIgnoreCase(c171510.m40257());
        }
        return Integer.compare(iMo24837, iMo24838);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m44816() {
        C11005[] c11005Arr;
        int i;
        int i2;
        if (!this.f62918) {
            throw new IllegalStateException();
        }
        HashMap map = this.f62921;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0732) it.next()).f2760 = null;
        }
        C11005[] c11005ArrM27335 = new C11005(this.f62915, DocumentReader.RESERVED).m27335();
        int i3 = 0;
        if (c11005ArrM27335 == null) {
            c11005ArrM27335 = new C11005[0];
        }
        int length = c11005ArrM27335.length;
        int i4 = 0;
        while (i4 < length) {
            C11005 c11005 = c11005ArrM27335[i4];
            if (c11005.m27340().mo23113()) {
                String str = c11005.getName() + "/";
                C11005 c11006 = new C11005(c11005, "package-info.xml");
                if (c11006.m27336()) {
                    String strM37867 = C16014.m37867(str, "package-info");
                    C0732 c0732 = (C0732) map.get(strM37867);
                    if (c0732 == null) {
                        c0732 = new C0732(strM37867, i3);
                        map.put(strM37867, c0732);
                    }
                    c0732.f2760 = c11006;
                }
                C11005[] c11005ArrM27336 = c11005.m27335();
                if (c11005ArrM27336 == null) {
                    c11005ArrM27336 = new C11005[i3];
                }
                int length2 = c11005ArrM27336.length;
                int i5 = 0;
                int i6 = i3;
                while (i5 < length2) {
                    C11005 c11007 = c11005ArrM27336[i5];
                    if (c11007.m27340().mo23113()) {
                        String name = c11007.getName();
                        String strM50967 = C22870.m50967(str, name, "/");
                        C11005[] c11005ArrM27337 = c11007.m27335();
                        if (c11005ArrM27337 == null) {
                            c11005ArrM27337 = new C11005[i6];
                        }
                        int length3 = c11005ArrM27337.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            C11005 c11008 = c11005ArrM27337[i7];
                            if (c11008.m27340().mo23119()) {
                                c11005Arr = c11005ArrM27335;
                                i = length3;
                                if (c11008.getName().toLowerCase().endsWith(".xml")) {
                                    i2 = length;
                                    String strM36561 = C15472.m36561(4, 0, c11008.getName());
                                    if (strM36561.startsWith(name) || strM36561.equals("type-info")) {
                                        String strM37868 = C16014.m37867(strM50967, strM36561);
                                        C0732 c0733 = (C0732) map.get(strM37868);
                                        if (c0733 == null) {
                                            c0733 = new C0732(strM37868, false);
                                            map.put(strM37868, c0733);
                                        }
                                        c0733.f2760 = c11008;
                                    }
                                }
                                i7++;
                                length3 = i;
                                c11005ArrM27335 = c11005Arr;
                                length = i2;
                            } else {
                                c11005Arr = c11005ArrM27335;
                                i = length3;
                            }
                            i2 = length;
                            i7++;
                            length3 = i;
                            c11005ArrM27335 = c11005Arr;
                            length = i2;
                        }
                    }
                    i5++;
                    i6 = 0;
                    c11005ArrM27335 = c11005ArrM27335;
                    length = length;
                }
            }
            i4++;
            i3 = 0;
            c11005ArrM27335 = c11005ArrM27335;
            length = length;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C0732 c0734 = (C0732) ((Map.Entry) it2.next()).getValue();
            if (c0734.f2760 != null) {
                hashSet.add(c0734.f2758);
            } else if (c0734.f2765 == null) {
                it2.remove();
            }
        }
        C5242 c5242 = this.f62914;
        Set set = (Set) c5242.m1662();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f62923 = hashSet;
        c5242.mo1664(C20195.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44822(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Set set) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        for (C0732 c0732 : this.f62921.values()) {
            String str2 = c0732.f2758;
            if (set == null || set.contains(str2)) {
                if (str2.startsWith(str) && (z || str2.indexOf(47, str.length()) == -1)) {
                    concurrentLinkedQueue.add(new C18746(this, c0732));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11005 m44808(C11005 c11005) {
        return new C11005(m36263(), C20094.m46315("arscBuild", c11005.m27339().substring(new C11005(this.f62915, DocumentReader.RESERVED).m27339().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C11005 m44804() {
        return new C11005(m36263(), "arscBuild/resources.arsc");
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private boolean m44805() {
        Iterator it = this.f62921.values().iterator();
        while (true) {
            boolean zM44803 = false;
            if (!it.hasNext()) {
                return false;
            }
            C11005 c11005 = ((C0732) it.next()).f2760;
            if (c11005 != null) {
                C11005 c11005M44808 = m44808(c11005);
                if (c11005M44808.m27336()) {
                    zM44803 = m44803(C14460.m34532().digest(c11005.m27337()), c11005M44808);
                }
                if (!zM44803) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19220 m44810(C11005 c11005, C11005 c11006) throws IOException {
        byte[] bArrM27337 = c11005.m27337();
        byte[] bArrDigest = C14460.m34532().digest(bArrM27337);
        if (m44803(bArrDigest, c11006)) {
            return null;
        }
        C19220 c19220M44340 = C19220.m44340(new String(bArrM27337, StandardCharsets.UTF_8), false);
        c19220M44340.getClass();
        C10130 c10130 = new C10130();
        c19220M44340.m44344(c10130);
        c11006.m27338();
        OutputStream outputStreamMo23555 = c11006.m27340().mo23555(false);
        try {
            outputStreamMo23555.write(bArrDigest);
            outputStreamMo23555.write(c10130.m25438(), 0, c10130.size());
            outputStreamMo23555.close();
            return c19220M44340;
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
    public static boolean m44803(byte[] bArr, C11005 c11005) {
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
    public static C19220 m44798(C11005 c11005) {
        C12951 c12951 = new C12951(c11005.m27337());
        c12951.skipBytes(f62909);
        return C19220.m44341(c12951);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 m44833() {
        boolean zM44790;
        int i;
        int i2;
        int i3;
        String str;
        C21916[] c21916Arr;
        String strM28422;
        int i4 = 1;
        if (this.f62919 || this.f62912) {
            zM44790 = true;
        } else {
            try {
                zM44790 = m44790();
                this.f62912 = zM44790;
            } catch (Exception unused) {
                this.f62912 = true;
                zM44790 = true;
            }
        }
        if (zM44790) {
            try {
                this.f62919 = true;
                m44831(false, (InterfaceC5880) new C9574());
                this.f62919 = false;
            } catch (Throwable th) {
                this.f62919 = false;
                throw th;
            }
        }
        C11541 c11541 = new C11541(new C11005(m36263(), "arscBuild/records").m27340());
        C22124.m49722(c11541, -416934225);
        c11541.skipBytes(c11541.readInt());
        int i5 = c11541.readInt();
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(i5);
        int i6 = 0;
        while (i6 < i5) {
            String strM28421 = c11541.m28421();
            int i7 = c11541.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = c11541.readByte() & 255;
                int i10 = c11541.readInt();
                int i11 = c11541.readInt();
                C21916[] c21916Arr2 = null;
                if (i9 == 0) {
                    i = i5;
                    i2 = c11541.readInt();
                    i3 = i9;
                    str = null;
                    c21916Arr = null;
                } else {
                    if (i9 == i4) {
                        i = i5;
                        strM28422 = c11541.m28422();
                    } else if (i9 == 2 || i9 == 3) {
                        i = i5;
                        i2 = c11541.readInt();
                        i3 = i9;
                        str = null;
                        c21916Arr = null;
                    } else if (i9 == 101) {
                        strM28422 = c11541.m28422();
                        int iM28419 = c11541.m28419();
                        c21916Arr2 = new C21916[iM28419];
                        int i12 = 0;
                        while (i12 < iM28419) {
                            c21916Arr2[i12] = new C21916(c11541.m28421(), c11541.readInt(), c11541.readInt());
                            i12++;
                            i5 = i5;
                        }
                        i = i5;
                        i9 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                    str = strM28422;
                    i3 = i9;
                    c21916Arr = c21916Arr2;
                    i2 = 0;
                }
                arrayList.add(new C24032(i3, i2, str, c21916Arr, i10, i11));
                i8++;
                i4 = 1;
                i5 = i;
            }
            concurrentMapC10942.put(strM28421, arrayList);
            i6++;
            i4 = 1;
        }
        return concurrentMapC10942;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m44790() {
        if (!m44805()) {
            C11005 c11005 = new C11005(m36263(), "arscBuild/records");
            if (c11005.m27336()) {
                C8868 c8868 = new C8868(this);
                c8868.m22905();
                byte[] bArrM22906 = c8868.m22906();
                boolean zEquals = false;
                if (!this.f62919 && c11005.m27336()) {
                    byte[] bArr = new byte[bArrM22906.length + 8];
                    try {
                        new DataInputStream(c11005.m27334()).readFully(bArr);
                        C12951 c12951 = new C12951(bArr);
                        C22124.m49722((InterfaceC20008) c12951, -416934225);
                        C22124.m49722((InterfaceC20008) c12951, bArrM22906.length);
                        c12951.seek(4L);
                        zEquals = Arrays.equals(c12951.m31496(), bArrM22906);
                    } catch (Exception unused) {
                    }
                }
                return !zEquals;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44831(boolean z, InterfaceC5880 interfaceC5880) throws C5672, IOException {
        HashMap map = this.f62921;
        for (C0732 c0732 : map.values()) {
            C11005 c11005 = c0732.f2760;
            String str = c0732.f2758;
            if (c11005 != null) {
                interfaceC5880.mo16443(str);
                try {
                    m44810(c11005, m44808(c11005));
                } catch (C1580 e) {
                    throw new C5672(str, e);
                }
            }
        }
        interfaceC5880.mo16444();
        C8868 c8868 = new C8868(this);
        c8868.m22905();
        C11005 c11005M44804 = m44804();
        C11005 c11006 = new C11005(m36263(), "arscBuild/resources.digest");
        C11005 c11007 = new C11005(m36263(), "arscBuild/records");
        if (c8868.f27006.isEmpty() && this.f62922 == c8868.f27005.size() && !this.f62919) {
            c11005M44804.m27333();
            c11006.m27333();
            this.f62924 = false;
            return;
        }
        if (interfaceC5880.mo1526()) {
            return;
        }
        byte[] bArrM22906 = c8868.m22906();
        if (m44802(c11005M44804, c11006, bArrM22906)) {
            this.f62924 = false;
            return;
        }
        if (interfaceC5880.mo1526()) {
            return;
        }
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        try {
            C9028 c9028M44795 = m44795(map, interfaceC5880, concurrentMapC10942, false);
            C19220.m44342();
            if (interfaceC5880.mo1526()) {
                return;
            }
            interfaceC5880.mo16441();
            c11005M44804.m27333();
            c11006.m27333();
            if (z) {
                C19277 c19277M23287 = c9028M44795.m23287();
                c19277M23287.m44459(new C2742(3, interfaceC5880));
                c11005M44804.m27338();
                C13656 c13656 = new C13656(c11005M44804.m27340());
                try {
                    c9028M44795.m23283(c13656, c19277M23287);
                    c13656.close();
                    this.f62913.m13482(c9028M44795);
                    MessageDigest messageDigestM34526 = C14460.m34526();
                    C14460.m34527(messageDigestM34526, c11005M44804.m27334());
                    byte[] bArrDigest = messageDigestM34526.digest();
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1936945938);
                    c10130.m25434(bArrM22906);
                    c10130.m25434(bArrDigest);
                    c11006.m27340().m36503(c10130.m25438(), 0, c10130.size());
                } catch (Throwable th) {
                    try {
                        c13656.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c11007.m27338();
            try {
                C13656 c13657 = new C13656(c11007.m27340());
                try {
                    c13657.writeInt(-416934225);
                    c13657.m32816(bArrM22906);
                    c13657.writeInt(concurrentMapC10942.size());
                    for (Map.Entry entry : concurrentMapC10942.entrySet()) {
                        c13657.m32815((String) entry.getKey());
                        c13657.writeInt(((List) entry.getValue()).size());
                        for (C24032 c24032 : (List) entry.getValue()) {
                            int i = c24032.f77861;
                            int i2 = c24032.f77859;
                            int i3 = c24032.f77862;
                            C21916[] c21916Arr = c24032.f77863;
                            if (i != 0) {
                                if (i == 1) {
                                    if (c21916Arr != null) {
                                        c13657.writeByte(101);
                                    } else {
                                        c13657.writeByte(1);
                                    }
                                    c13657.writeInt(i3);
                                    c13657.writeInt(i2);
                                    c13657.m32814((CharSequence) c24032.f77864);
                                    if (c21916Arr != null) {
                                        c13657.mo13231(c21916Arr.length);
                                        for (C21916 c21916 : c21916Arr) {
                                            c13657.m32815(c21916.f70169);
                                            c13657.writeInt(c21916.f70168);
                                            c13657.writeInt(c21916.f70167);
                                        }
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new RuntimeException();
                                }
                            }
                            c13657.writeByte(i);
                            c13657.writeInt(i3);
                            c13657.writeInt(i2);
                            c13657.writeInt(c24032.f77860);
                        }
                    }
                    c13657.close();
                    this.f62924 = false;
                    this.f62912 = false;
                } catch (Throwable th3) {
                    try {
                        c13657.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException e2) {
                c11007.m27333();
                throw e2;
            }
        } catch (Throwable th5) {
            C19220.m44342();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44824(InterfaceC5880 interfaceC5880) {
        C11005 c11005;
        Iterator it = this.f62921.values().iterator();
        do {
            if (!it.hasNext()) {
                c11005 = null;
                break;
            }
            c11005 = ((C0732) it.next()).f2765;
        } while (c11005 == null);
        if (c11005 != null && c11005.m27340().mo23127() <= 31457280 && c11005.m27340().mo23127() <= 52428800) {
            ArrayList<C0732> arrayListM44814 = m44814(c11005);
            HashMap map = new HashMap();
            for (C0732 c0732 : arrayListM44814) {
                map.put(c0732.f2758, c0732);
            }
            try {
                m44795(map, interfaceC5880, (ConcurrentMapC10942) null, true);
            } finally {
                C19220.m44342();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v67, types: [l.ᩴۘܽ] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.Map, l.ۧۤᩴ] */
    /* JADX WARN: Type inference failed for: r35v1, types: [l.ۧۤᩴ] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.᩵ۨ᩷] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9028 m44795(HashMap map, InterfaceC5880 interfaceC5880, final ConcurrentMapC10942 concurrentMapC10942, boolean z) throws C5672, IOException {
        int i;
        C9028 c9028;
        String str;
        int iM24993;
        C19452 c19452 = this;
        String str2 = "realName";
        String str3 = "name";
        C9028 c9028M23277 = C9028.m23277(EnumC9734.CREATE);
        C10355 c10355 = new C10355(c9028M23277);
        C14336 c14336M34211 = C14336.m34211(map.keySet());
        c14336M34211.m34217(new C3404(2));
        C17159 c17159M34215 = c14336M34211.m34215();
        Collections.sort(c17159M34215.m40255(), new C14511(c19452));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c17159M34215.m40251().iterator();
        int size = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            size += ((C17159) it.next()).m40251().size() + 1;
        }
        C19277 c19277 = new C19277(size);
        c19277.m44459(new C23684(0, interfaceC5880));
        C19452 c19453 = c19452;
        for (C17159 c17159 : c17159M34215.m40251()) {
            c19277.m44460(i);
            C10810 c10810M40252 = c17159.m40252("package-info");
            if (c10810M40252 == null) {
                throw new IOException("File not found: " + c17159.m40257() + "/package-info.xml");
            }
            try {
                C19220 c19220M44797 = c19453.m44797(c10810M40252.m27028(), map);
                if (!c19220M44797.m44350().equals("package")) {
                    throw new C1580("Expected tag: <package>", c19220M44797);
                }
                C18514 c18514M44348 = c19220M44797.m44348("id");
                C18514 c18514M44349 = c19220M44797.m44348(str3);
                try {
                    C18514 c18514M44343 = c19220M44797.m44343("prefix");
                    try {
                        C8322 c8322M23281 = c9028M23277.m23281(m44791(c18514M44348) & 255, c18514M44349.m43026());
                        C18514 c18514M44344 = c19220M44797.m44343("configLayout");
                        if (c18514M44344 != null) {
                            c8322M23281.m21922(EnumC10418.m26259(c18514M44344.m43026()));
                        }
                        if (c18514M44343 != null) {
                            c10355.m26164(c8322M23281.mo12858(), m44806(c18514M44343));
                        }
                        Iterator itM44338 = C19220.m44338(c19220M44797, "library");
                        while (itM44338.hasNext()) {
                            C19220 c19220 = (C19220) itM44338.next();
                            C18514 c18514M443410 = c19220.m44348("id");
                            C18514 c18514M443411 = c19220.m44348(str3);
                            Iterator it2 = itM44338;
                            try {
                                int iM44791 = m44791(c18514M443410);
                                C9028 c9029 = c9028M23277;
                                c8322M23281.m21919(iM44791, m44806(c18514M443411));
                                c9028M23277 = c9029;
                                itM44338 = it2;
                            } catch (RuntimeException e) {
                                throw new C1580(e.getMessage(), c19220);
                            }
                        }
                        c9028 = c9028M23277;
                        Iterator itM44339 = C19220.m44338(c19220M44797, "overlay");
                        while (itM44339.hasNext()) {
                            C19220 c19221 = (C19220) itM44339.next();
                            C18514 c18514M443412 = c19221.m44348(str3);
                            Iterator it3 = itM44339;
                            C18514 c18514M44345 = c19221.m44343("actor");
                            try {
                                C0560 c0560M21917 = c8322M23281.m21917(m44806(c18514M443412), c18514M44345 == null ? "" : c18514M44345.m43026());
                                Iterator itM443310 = C19220.m44338(c19221, am.bp);
                                while (itM443310.hasNext()) {
                                    C19220 c19222 = (C19220) itM443310.next();
                                    Iterator it4 = itM443310;
                                    int iM44792 = m44791(c19222.m44348("flags"));
                                    C10355 c10356 = c10355;
                                    C15859 c15859 = new C15859();
                                    Iterator itM443311 = C19220.m44338(c19222, "id");
                                    while (itM443311.hasNext()) {
                                        Iterator it5 = itM443311;
                                        C0874 c0874M44347 = ((C19220) itM443311.next()).m44347();
                                        ArrayList arrayList3 = arrayList2;
                                        String strM3219 = c0874M44347.m3219();
                                        if (C9896.m24994(strM3219)) {
                                            iM24993 = C9896.m24993(strM3219.substring(2));
                                        } else {
                                            if (!C9896.m25000(strM3219)) {
                                                throw new C1580(C4860.m14172("Integer value required: \"", strM3219, "\""), c0874M44347);
                                            }
                                            iM24993 = Integer.parseInt(strM3219);
                                        }
                                        c15859.add(iM24993);
                                        arrayList2 = arrayList3;
                                        itM443311 = it5;
                                    }
                                    c0560M21917.m2308(iM44792, c15859);
                                    itM443310 = it4;
                                    c10355 = c10356;
                                    arrayList2 = arrayList2;
                                }
                                itM44339 = it3;
                            } catch (RuntimeException e2) {
                                throw new C1580(e2.getMessage(), c19221);
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        final C10355 c10357 = c10355;
                        Iterator itM443312 = C19220.m44338(c19220M44797, "stagedAlias");
                        while (true) {
                            boolean zHasNext = itM443312.hasNext();
                            str = Entry.DEFAULT_NAME;
                            if (!zHasNext) {
                                break;
                            }
                            C19220 c19223 = (C19220) itM443312.next();
                            C15376 c15376M21923 = c8322M23281.m21923();
                            c19223.getClass();
                            Iterator itM443313 = C19220.m44338(c19223, Entry.DEFAULT_NAME);
                            while (itM443313.hasNext()) {
                                C19220 c19224 = (C19220) itM443313.next();
                                c15376M21923.m36411(m44791(c19224.m44348("stagedResId")), m44791(c19224.m44348("finalizedResId")));
                                itM443312 = itM443312;
                            }
                        }
                        c19220M44797.m44349();
                        if (!interfaceC5880.mo1526()) {
                            C18683 c18683 = new C18683();
                            C18683 c18684 = new C18683();
                            C18683 c18685 = new C18683();
                            Iterator it6 = c17159.m40251().iterator();
                            ?? r9 = c19453;
                            ConcurrentMapC10942 concurrentMapC10943 = concurrentMapC10942;
                            while (it6.hasNext()) {
                                C17159 c171510 = (C17159) it6.next();
                                Iterator it7 = it6;
                                c19277.m44460(1);
                                StringBuilder sb = new StringBuilder();
                                C19277 c19278 = c19277;
                                sb.append(c171510.m40256());
                                sb.append("/type-info");
                                ?? string = sb.toString();
                                try {
                                    C19220 c19220M44798 = r9.m44797(string, map);
                                    if (!c19220M44798.m44350().equals("type")) {
                                        throw new C1580("Expected tag: <type>", c19220M44798);
                                    }
                                    C18514 c18514M44346 = c19220M44798.m44343(str2);
                                    String strM40257 = c171510.m40257();
                                    String strM43026 = c18514M44346 == null ? null : c18514M44346.m43026();
                                    int iM44793 = m44791(c19220M44798.m44348("id")) & 255;
                                    C17159 c171511 = c17159;
                                    C18514 c18514M44347 = c19220M44798.m44343("defaultPublic");
                                    try {
                                        string = c19220M44798.m44343("defaultWeak");
                                        C18514 c18514M443413 = c19220M44798.m44343("defaultCompact");
                                        try {
                                            final C20317 c20317M21925 = c8322M23281.m21925(iM44793, strM40257);
                                            if (strM43026 != null) {
                                                arrayList.add(new RunnableC9960(6, c20317M21925, strM43026));
                                            }
                                            if (c18514M44347 != null && c18514M44347.m43026().equals("true")) {
                                                c18683.add(iM44793);
                                            }
                                            if (string != 0 && string.m43026().equals("true")) {
                                                c18684.add(iM44793);
                                            }
                                            if (c18514M443413 != null && c18514M443413.m43026().equals("true")) {
                                                c18685.add(iM44793);
                                            }
                                            C18955 c18955 = new C18955(c19220M44798.m44345().size());
                                            C18683 c18686 = new C18683(c19220M44798.m44345().size());
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator itM443314 = C19220.m44338(c19220M44798, str);
                                            while (itM443314.hasNext()) {
                                                C19220 c19225 = (C19220) itM443314.next();
                                                C18514 c18514M443414 = c19225.m44348("id");
                                                C18514 c18514M443415 = c19225.m44348(str3);
                                                Iterator it8 = itM443314;
                                                String str4 = str2;
                                                C18514 c18514M443416 = c19225.m44343(str4);
                                                String str5 = str;
                                                int iM44794 = (m44791(c18514M443414) & 65535) | (c8322M23281.mo12858() << 24) | (c20317M21925.mo2870() << 16);
                                                String strM44806 = m44806(c18514M443415);
                                                final String strM43027 = c18514M443416 == null ? null : c18514M443416.m43026();
                                                if (!c18955.add(strM44806)) {
                                                    throw new C1580("Duplicate name: " + c18514M443415.m43026(), c18514M443415);
                                                }
                                                if (!c18686.add(iM44794)) {
                                                    throw new C1580("Duplicate id: " + c18514M443414.m43026(), c18514M443414);
                                                }
                                                if (strM43027 != null) {
                                                    final int i2 = iM44794 & 65535;
                                                    arrayList.add(new Runnable() { // from class: l.ۜۨ᩷
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            c20317M21925.m46610(i2, strM43027);
                                                        }
                                                    });
                                                }
                                                int i3 = iM44794 & 65535;
                                                c20317M21925.m46611(i3, strM44806, false);
                                                m44800(c19225, c20317M21925, i3);
                                                arrayList5.add(new C24032(iM44794, c19225.m22403(), c19225.m22402()));
                                                itM443314 = it8;
                                                str2 = str4;
                                                str3 = str3;
                                                str = str5;
                                            }
                                            String str6 = str;
                                            String str7 = str3;
                                            String str8 = str2;
                                            if (concurrentMapC10942 != 0) {
                                                concurrentMapC10942.put(string, arrayList5);
                                            }
                                            c19220M44798.m44349();
                                            r9 = this;
                                            concurrentMapC10943 = concurrentMapC10942;
                                            it6 = it7;
                                            c19277 = c19278;
                                            c17159 = c171511;
                                            c8322M23281 = c8322M23281;
                                            str2 = str8;
                                            str3 = str7;
                                            str = str6;
                                            map = map;
                                        } catch (Exception e3) {
                                            throw new C1580(e3.getMessage(), c19220M44798.m44348("id"));
                                        }
                                    } catch (C1580 e4) {
                                        e = e4;
                                        string = string;
                                    }
                                } catch (C1580 e5) {
                                    e = e5;
                                }
                                throw new C5672(string, e);
                            }
                            C17159 c171512 = c17159;
                            C19277 c19279 = c19277;
                            C8322 c8322 = c8322M23281;
                            String str9 = str2;
                            String str10 = str3;
                            if (!interfaceC5880.mo1526()) {
                                Iterator it9 = c8322.mo12850().iterator();
                                while (it9.hasNext()) {
                                    C20317 c20317 = (C20317) it9.next();
                                    String typeName = c20317.getTypeName();
                                    boolean z2 = typeName.equals("attr") || typeName.equals("id") || typeName.equals("^attr-private");
                                    final String str11 = c171512.m40257() + "/" + typeName + "/" + typeName;
                                    List<C0732> list = (List) C5378.stream(map.entrySet()).filter(new Predicate() { // from class: l.᩷ۨ᩷
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
                                            return ((String) ((Map.Entry) obj).getKey()).startsWith(str11);
                                        }
                                    }).map(new C17576(1)).sorted().collect(C22976.toList());
                                    final C18116 c18116 = new C18116();
                                    c18116.f56383 = c18683.contains(c20317.mo2870());
                                    c18116.f56384 = c18684.contains(c20317.mo2870());
                                    c18116.f56382 = c18685.contains(c20317.mo2870());
                                    final C12555 c12555M46615 = c20317.m46615();
                                    for (final C0732 c0732 : list) {
                                        try {
                                            final C2678 c2678M46608 = c20317.m46608(C21707.m48999(c0732.f2758.substring(str11.length()), c8322.mo12848()));
                                            C20317 c20318 = c20317;
                                            ArrayList arrayList6 = arrayList4;
                                            arrayList6.add(z2 ? 0 : arrayList4.size(), new InterfaceC15922() { // from class: l.ܰۛ᩷
                                                @Override // l.InterfaceC15922
                                                public final void run() throws C5672 {
                                                    C19452.m44801(this.f40665, c0732, c10357, c2678M46608, c12555M46615, c18116, concurrentMapC10942);
                                                }
                                            });
                                            arrayList = arrayList;
                                            it9 = it9;
                                            c18685 = c18685;
                                            c18684 = c18684;
                                            arrayList4 = arrayList6;
                                            c20317 = c20318;
                                        } catch (Exception unused) {
                                            throw new IOException("Name format error: " + C2439.m7876(c0732.f2758));
                                        }
                                    }
                                    C18683 c18687 = c18685;
                                    C18683 c18688 = c18684;
                                    Iterator it10 = it9;
                                    ArrayList arrayList7 = arrayList4;
                                    ArrayList arrayList8 = arrayList;
                                    if (!interfaceC5880.mo1526()) {
                                        arrayList = arrayList8;
                                        it9 = it10;
                                        c18685 = c18687;
                                        c18684 = c18688;
                                        arrayList4 = arrayList7;
                                    }
                                }
                                i = 1;
                                c19453 = this;
                                arrayList2 = arrayList4;
                                c9028M23277 = c9028;
                                c19277 = c19279;
                                c10355 = c10357;
                                str2 = str9;
                                str3 = str10;
                            }
                        }
                        return c9028;
                    } catch (RuntimeException e6) {
                        throw new C1580(e6.getMessage(), c19220M44797);
                    }
                } catch (C1580 e7) {
                    e = e7;
                }
            } catch (C1580 e8) {
                e = e8;
            }
            throw new C5672(c10810M40252.m27028(), e);
        }
        ArrayList<InterfaceC15922> arrayList9 = arrayList2;
        ArrayList arrayList10 = arrayList;
        c9028 = c9028M23277;
        C19277 c192710 = new C19277(arrayList9.size());
        c192710.m44459(new C15000(2, interfaceC5880));
        for (InterfaceC15922 interfaceC15922 : arrayList9) {
            c192710.m44460(1);
            interfaceC15922.run();
            if (interfaceC5880.mo1526()) {
                return c9028;
            }
        }
        Iterator it11 = arrayList10.iterator();
        while (it11.hasNext()) {
            ((Runnable) it11.next()).run();
        }
        if (z) {
            try {
                c9028.mo12336(C9028.m23276(new C23326(m44839().m27330("resources")), EnumC9734.CREATE));
                return c9028;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
        return c9028;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44800(C19220 c19220, C20317 c20317, int i) throws C1580 {
        C18514 c18514M44343 = c19220.m44343("stagedApi");
        if (c18514M44343 != null && !"true".equals(c18514M44343.m43026()) && !"false".equals(c18514M44343.m43026())) {
            throw new C1580("Boolean value required: stagedApi", c18514M44343);
        }
        int i2 = 0;
        c20317.m46619(i, c18514M44343 != null && "true".equals(c18514M44343.m43026()));
        C18514 c18514M44344 = c19220.m44343("extraTypeSpecFlags");
        if (c18514M44344 != null) {
            String strM43026 = c18514M44344.m43026();
            try {
                boolean zStartsWith = strM43026.startsWith("0x");
                String strSubstring = zStartsWith ? strM43026.substring(2) : strM43026;
                if (strSubstring.isEmpty() || strSubstring.charAt(0) == '-' || strSubstring.charAt(0) == '+') {
                    throw new NumberFormatException();
                }
                long j = Long.parseLong(strSubstring, zStartsWith ? 16 : 10);
                if (j < 0 || j > 4294967295L) {
                    throw new NumberFormatException();
                }
                i2 = (int) j;
                if (((c20317.m46616().mo12848().m26261() | 1610874879) & i2) != 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException unused) {
                throw new C1580(C20094.m46315("Invalid extraTypeSpecFlags: ", strM43026), c18514M44344);
            }
        }
        c20317.m46618(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44791(C18514 c18514) throws C1580 {
        String strM43026 = c18514.m43026();
        if (C9896.m24994(strM43026)) {
            return C9896.m24993(strM43026.substring(2));
        }
        if (C9896.m25000(strM43026)) {
            return Integer.parseInt(strM43026);
        }
        throw new C1580(C20087.m46306("Integer value required: ", c18514.m43025(), "=\"", c18514.m43026(), "\""), c18514);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m44806(C18514 c18514) throws C1580 {
        String strM43026 = c18514.m43026();
        if (strM43026.isEmpty()) {
            throw new C1580(C4860.m14172("Value required: ", c18514.m43025(), "=\"\""), c18514);
        }
        return strM43026;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19220 m44797(String str, Map map) throws C19401 {
        C0732 c0732 = (C0732) map.get(str);
        if (c0732 != null) {
            return m44809(c0732);
        }
        throw new C19401(C20094.m46315("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C19220 m44809(C0732 c0732) {
        return new C18746(this, c0732).m43396();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18683 m44842(String str) {
        final String strM37867 = C16014.m37867(str, "/");
        List list = (List) C5378.stream(this.f62921.entrySet()).filter(new Predicate() { // from class: l.֫ۨ᩷
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
                String str2 = (String) ((Map.Entry) obj).getKey();
                return str2.startsWith(strM37867) && str2.endsWith("/type-info");
            }
        }).map(new C17576(1)).collect(C22976.toList());
        C18683 c18683 = new C18683();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c18683.add(m44791(m44809((C0732) it.next()).m44348("id")) & 255);
            } catch (Exception unused) {
            }
        }
        return c18683;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC10418 m44847(String str) throws IOException {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        C0732 c0732 = (C0732) this.f62921.get(str + "/package-info");
        if (c0732 == null) {
            throw new IOException(C20094.m46315("Package metadata is missing: ", str));
        }
        C19220 c19220M44809 = m44809(c0732);
        try {
            C18514 c18514M44343 = c19220M44809.m44343("configLayout");
            return c18514M44343 == null ? EnumC10418.AOSP : EnumC10418.m26259(c18514M44343.m43026());
        } finally {
            c19220M44809.m44349();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44817(int i, String str) {
        C0732 c0732 = (C0732) this.f62921.get(C16014.m37867(str, "/package-info"));
        if (c0732 == null) {
            return i;
        }
        try {
            return m44791(m44809(c0732).m44348("id")) & 255;
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m44843(String str) {
        C0732 c0732 = (C0732) this.f62921.get(C16014.m37867(str, "/type-info"));
        if (c0732 != null) {
            C11005 c11005 = c0732.f2760;
            int iMo23117 = c11005 != null ? (int) (c11005.m27340().mo23117() / 1000) : 0;
            int i = c0732.f2762;
            if (i != -1 && c0732.f2761 == iMo23117) {
                return i;
            }
            try {
                int iM44791 = m44791(m44809(c0732).m44348("id")) & 255;
                c0732.f2762 = iM44791;
                c0732.f2761 = iMo23117;
                return iM44791;
            } catch (Exception unused) {
                c0732.f2762 = -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m44841(String str, String str2) {
        int iM44817;
        C0732 c0732;
        C18514 c18514M44343;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && (iM44817 = m44817(-1, str.substring(0, iIndexOf))) != -1 && (c0732 = (C0732) this.f62921.get(str)) != null) {
            try {
                C19220 c19220M44809 = m44809(c0732);
                int iM44791 = m44791(c19220M44809.m44348("id")) & 255;
                Iterator itM44337 = C19220.m44337(c19220M44809);
                while (itM44337.hasNext()) {
                    C19220 c19220 = (C19220) itM44337.next();
                    if (c19220.m44350().equals(Entry.DEFAULT_NAME) && (c18514M44343 = c19220.m44343("name")) != null && c18514M44343.m43026().equals(str2)) {
                        String strM43026 = c19220.m44348("id").m43026();
                        return (Integer.parseInt(strM43026.substring(strM43026.length() - 4), 16) & 65535) | (iM44817 << 24) | (iM44791 << 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m44848(String str) {
        C18514 c18514M44343;
        Iterator it = this.f62921.values().iterator();
        while (true) {
            C19220 c19220M43396 = null;
            if (!it.hasNext()) {
                return null;
            }
            C0732 c0732 = (C0732) it.next();
            if (c0732.f2758.endsWith("/package-info")) {
                String[] strArrSplit = c0732.f2758.split("/");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        c19220M43396 = new C18746(this, c0732).m43396();
                    } catch (IOException | C1580 unused) {
                    }
                    if (c19220M43396 != null && c19220M43396.m44350().equals("package") && (c18514M44343 = c19220M43396.m44343("prefix")) != null && c18514M44343.m43026().equals(str)) {
                        return strArrSplit[0];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44846(String str, String str2) {
        C19220 c19220M43396;
        C18514 c18514M44343;
        ArrayList arrayList = new ArrayList();
        for (C0732 c0732 : this.f62921.values()) {
            String str3 = c0732.f2758;
            if (str3.startsWith(str)) {
                String strSubstring = str3.substring(str.length());
                if (strSubstring.indexOf(47) == -1) {
                    try {
                        c19220M43396 = new C18746(this, c0732).m43396();
                    } catch (IOException | C1580 unused) {
                        c19220M43396 = null;
                    }
                    if (c19220M43396 != null) {
                        if (c19220M43396.m44350().equals("type")) {
                            Iterator itM44337 = C19220.m44337(c19220M43396);
                            while (itM44337.hasNext()) {
                                C19220 c19220 = (C19220) itM44337.next();
                                if (c19220.m44350().equals(Entry.DEFAULT_NAME) && (c18514M44343 = c19220.m44343("name")) != null && c18514M44343.m43026().equals(str2)) {
                                    C19287 c19287M44466 = C19287.m44466(c18514M44343.m43028(), c18514M44343.m43027() - 1);
                                    c19287M44466.f60678 = true;
                                    arrayList.add(new C2518(strSubstring, str3, c19287M44466));
                                    break;
                                }
                            }
                        } else if (c19220M43396.m44350().equals("resources")) {
                            Iterator itM44338 = C19220.m44337(c19220M43396);
                            while (itM44338.hasNext()) {
                                C18514 c18514M44344 = ((C19220) itM44338.next()).m44343("name");
                                if (c18514M44344 != null && c18514M44344.m43026().equals(str2)) {
                                    C19287 c19287M44467 = C19287.m44466(c18514M44344.m43028(), c18514M44344.m43027() - 1);
                                    c19287M44467.f60678 = true;
                                    arrayList.add(new C2518(strSubstring, str3, c19287M44467));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44829(ActivityC17169 activityC17169, C20296 c20296) {
        this.f62913.m13483(activityC17169, c20296);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m44845() {
        C11005 c11005M44804 = m44804();
        if (!c11005M44804.m27336()) {
            c11005M44804 = new C11005(m44839(), "resources");
        }
        return c11005M44804.m27340();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m44836() throws IOException {
        C11005 c11005M36265 = m36265();
        c11005M36265.m27340().m36508();
        C11005 c11005M44804 = m44804();
        if (!c11005M44804.m27336()) {
            c11005M44804 = new C11005(m44839(), "resources");
        }
        C11005 c11005 = new C11005(c11005M36265, this.f62920);
        InputStream inputStreamM27334 = c11005M44804.m27334();
        try {
            OutputStream outputStreamMo23555 = c11005.m27340().mo23555(false);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44827(AbstractC15440 abstractC15440, boolean z) throws IOException {
        abstractC15440.mo23546();
        C11005 c11005M44804 = m44804();
        if (c11005M44804.m27336()) {
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(this.f62920);
            if (z) {
                abstractC15440M36526.m36529();
            }
            try {
                InputStream inputStreamM27334 = c11005M44804.m27334();
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Collection m44857() {
        int i = 0;
        InterfaceC17664 interfaceC17664Filter = C5378.stream(m44833().values()).flatMap(new C10985(i)).filter(new C16628(i));
        int i2 = 3;
        return (Collection) interfaceC17664Filter.map(new C18554(i2)).distinct().sorted(new C23300(i2)).collect(C22976.toList());
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList m44853() throws Throwable {
        C19220 c19220M44797;
        C19220 c19220M44798;
        Iterator it;
        String str;
        C19220 c19220;
        C0732 c0732;
        Iterator it2;
        LinkedHashMap linkedHashMap;
        C19452 c19452 = this;
        String str2 = "id";
        HashMap map = c19452.f62921;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = m44834().m40251().iterator();
        while (it3.hasNext()) {
            C17159 c17159 = (C17159) it3.next();
            C10810 c10810M40252 = c17159.m40252("package-info");
            if (c10810M40252 != null) {
                try {
                    c19220M44797 = c19452.m44797(c10810M40252.m27028(), map);
                    try {
                        try {
                            if (!c19220M44797.m44350().equals("package")) {
                                throw new C1580("Expected tag: <package>", c19220M44797);
                            }
                            int iM44791 = m44791(c19220M44797.m44348(str2)) & 255;
                            c19220M44797.m44349();
                            for (C17159 c171510 : c17159.m40251()) {
                                C10810 c10810M40253 = c171510.m40252("type-info");
                                if (c10810M40253 != null) {
                                    String strM27028 = c10810M40253.m27028();
                                    C18955 c18955 = new C18955();
                                    try {
                                        c19220M44798 = c19452.m44797(strM27028, map);
                                        try {
                                            try {
                                                if (!c19220M44798.m44350().equals("type")) {
                                                    throw new C1580("Expected tag: <type>", c19220M44798);
                                                }
                                                int iM44792 = m44791(c19220M44798.m44348(str2)) & 255;
                                                Iterator itM44338 = C19220.m44338(c19220M44798, Entry.DEFAULT_NAME);
                                                int iMax = 0;
                                                while (true) {
                                                    it = it3;
                                                    str = "name";
                                                    if (!itM44338.hasNext()) {
                                                        break;
                                                    }
                                                    C19220 c19221 = (C19220) itM44338.next();
                                                    C18514 c18514M44348 = c19221.m44348(str2);
                                                    c18955.add(m44806(c19221.m44348("name")));
                                                    iMax = Math.max(iMax, (m44791(c18514M44348) & 65535) + 1);
                                                    it3 = it;
                                                }
                                                c19220M44798.m44349();
                                                List<C0732> list = (List) C5378.stream(map.entrySet()).filter(new C7291(0, c17159.m40257() + "/" + c171510.m40257() + "/" + c171510.m40257())).map(new C17576(1)).sorted().collect(C22976.toList());
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                for (C0732 c0733 : list) {
                                                    try {
                                                        C19220 c19220M44809 = c19452.m44809(c0733);
                                                        try {
                                                            try {
                                                                str2 = str2;
                                                                if (c19220M44809.m44350().equals("resources")) {
                                                                    Iterator itM44337 = C19220.m44337(c19220M44809);
                                                                    while (itM44337.hasNext()) {
                                                                        C18514 c18514M44343 = ((C19220) itM44337.next()).m44343(str);
                                                                        if (c18514M44343 == null) {
                                                                            it2 = itM44337;
                                                                        } else {
                                                                            it2 = itM44337;
                                                                            String strM43026 = c18514M44343.m43026();
                                                                            if (!strM43026.isEmpty() && !c18955.contains(strM43026) && ((C3929) linkedHashMap2.get(strM43026)) == null) {
                                                                                if (iMax > 65535) {
                                                                                    c0732 = c0733;
                                                                                    throw new IOException("No available entry id: " + strM27028);
                                                                                }
                                                                                int i = (iM44791 << 24) | (iM44792 << 16) | iMax;
                                                                                c0732 = c0733;
                                                                                int i2 = iMax;
                                                                                linkedHashMap = linkedHashMap2;
                                                                                try {
                                                                                    linkedHashMap.put(strM43026, new C3929(strM27028, strM43026, i2, i, c0733.f2758, c18514M44343.m43028(), Math.max(c18514M44343.m43027() - 1, 0)));
                                                                                    iMax = i2 + 1;
                                                                                } catch (C1580 e) {
                                                                                    e = e;
                                                                                }
                                                                                e = e;
                                                                                throw new C5672(c0732.f2758, e);
                                                                            }
                                                                            c18955 = c18955;
                                                                            c0733 = c0732;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            itM44337 = it2;
                                                                            map = map;
                                                                            str = str;
                                                                            c17159 = c17159;
                                                                            iM44791 = iM44791;
                                                                            iM44792 = iM44792;
                                                                        }
                                                                        c0732 = c0733;
                                                                        linkedHashMap = linkedHashMap2;
                                                                        iMax = iMax;
                                                                        c18955 = c18955;
                                                                        c0733 = c0732;
                                                                        linkedHashMap2 = linkedHashMap;
                                                                        itM44337 = it2;
                                                                        map = map;
                                                                        str = str;
                                                                        c17159 = c17159;
                                                                        iM44791 = iM44791;
                                                                        iM44792 = iM44792;
                                                                    }
                                                                    c19220M44809.m44349();
                                                                    iM44791 = iM44791;
                                                                    c19452 = this;
                                                                } else {
                                                                    c19220M44809.m44349();
                                                                }
                                                            } catch (C1580 e2) {
                                                                e = e2;
                                                                c0732 = c0733;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c19220 = c19220M44809;
                                                            if (c19220 != null) {
                                                                c19220.m44349();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (C1580 e3) {
                                                        e = e3;
                                                        c0732 = c0733;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c19220 = null;
                                                    }
                                                }
                                                arrayList.addAll(linkedHashMap2.values());
                                                c19452 = this;
                                                it3 = it;
                                                str2 = str2;
                                                iM44791 = iM44791;
                                            } catch (C1580 e4) {
                                                e = e4;
                                                throw new C5672(strM27028, e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (C1580 e5) {
                                        e = e5;
                                        c19220M44798 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c19220M44798 = null;
                                    }
                                    th = th3;
                                    if (c19220M44798 != null) {
                                        c19220M44798.m44349();
                                    }
                                    throw th;
                                }
                            }
                            c19452 = this;
                        } catch (C1580 e6) {
                            e = e6;
                            throw new C5672(c10810M40252.m27028(), e);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (C1580 e7) {
                    e = e7;
                    c19220M44797 = null;
                } catch (Throwable th6) {
                    th = th6;
                    c19220M44797 = null;
                }
                th = th5;
                if (c19220M44797 != null) {
                    c19220M44797.m44349();
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44821(List list) throws C5672, IOException {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3929 c3929 = (C3929) it.next();
            ((List) C13843.computeIfAbsent(linkedHashMap, c3929.f12542, new C12247(2))).add(c3929);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C0732 c0732 = (C0732) this.f62921.get(str);
            if (c0732 == null) {
                throw new IOException(C20094.m46315("Xml not found: ", str));
            }
            String strM44793 = m44793(c0732);
            int iLastIndexOf = strM44793.lastIndexOf("</type>");
            if (iLastIndexOf < 0) {
                throw new IOException(C20094.m46315("Expected tag: </type> in ", str));
            }
            List<C3929> list2 = (List) entry.getValue();
            Collections.sort(list2, C8200.comparingInt(new C17334()));
            StringBuilder sb = new StringBuilder((list2.size() * 64) + strM44793.length());
            sb.append((CharSequence) strM44793, 0, iLastIndexOf);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
                sb.append('\n');
            }
            for (C3929 c39210 : list2) {
                sb.append("    <entry id=\"");
                sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c39210.f12538)));
                sb.append("\" name=\"");
                sb.append(C10035.f30193.m28254(c39210.f12537));
                sb.append("\" />\n");
            }
            String strM46305 = C20087.m46305(iLastIndexOf, strM44793, sb);
            try {
                C19220 c19220M44340 = C19220.m44340(strM46305, false);
                if (c19220M44340 != null) {
                    c19220M44340.m44349();
                }
                linkedHashMap2.put(c0732, strM46305);
            } catch (C1580 e) {
                throw new C5672(str, e);
            }
        }
        boolean z = this.f62918;
        this.f62918 = false;
        try {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                m44823((C0732) entry2.getKey(), (String) entry2.getValue());
            }
            m44830(z);
        } catch (Throwable th) {
            m44830(z);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m44835(String str) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            return -268435456;
        }
        C11005 c11005 = c0732.f2760;
        if (c11005 != null) {
            return Long.valueOf(c11005.m27340().mo23117() ^ c11005.m27340().mo23127()).hashCode();
        }
        return c0732.f2765 != null ? -536870912 : -268435456;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m44850(String str) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        return (c0732 == null || c0732.f2765 == null) ? "" : c0732.m2837();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44856(String str) throws C19401 {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 != null) {
            return m44793(c0732);
        }
        throw new C19401(C20094.m46315("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44793(C0732 c0732) throws C19401 {
        C11005 c11005 = c0732.f2760;
        if (c11005 != null) {
            return c11005.m27340().m36489();
        }
        if (c0732.f2765 != null) {
            return c0732.m2837();
        }
        throw new C19401("Bad xml: " + c0732.f2758);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44849(String str, String str2) throws IOException {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            throw new C19401("Xml not found: ".concat(str));
        }
        C19220 c19220M44340 = C19220.m44340(str2, false);
        m44823(c0732, str2);
        C11005 c11005M44808 = m44808(c0732.f2760);
        c11005M44808.m27338();
        byte[] bArrDigest = C14460.m34532().digest(str2.getBytes(StandardCharsets.UTF_8));
        c19220M44340.getClass();
        C10130 c10130 = new C10130();
        c19220M44340.m44344(c10130);
        OutputStream outputStreamMo23555 = c11005M44808.m27340().mo23555(false);
        try {
            outputStreamMo23555.write(bArrDigest);
            outputStreamMo23555.write(c10130.m25438(), 0, c10130.size());
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44851(String str, String str2) throws C19401 {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            throw new C19401(C20094.m46315("Xml not found: ", str));
        }
        m44823(c0732, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44823(C0732 c0732, String str) {
        boolean z;
        C11005 c11005 = c0732.f2760;
        String str2 = c0732.f2758;
        if (c11005 == null) {
            c0732.f2760 = new C11005(new C11005(this.f62915, DocumentReader.RESERVED), C16014.m37867(str2, ".xml"));
            z = true;
        } else {
            z = false;
        }
        c0732.f2760.m27340().m36510(str);
        if (this.f62918 && z) {
            this.f62923.add(str2);
            this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44855(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C0732 c0732 : this.f62921.values()) {
            if (c0732.f2758.startsWith(str)) {
                arrayList.add(c0732.f2758);
            }
        }
        m44820((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44820(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C0732 c0732 = (C0732) this.f62921.remove(str);
            if (c0732 != null) {
                C11005 c11005 = c0732.f2760;
                if (c11005 != null) {
                    c11005.m27333();
                    if (this.f62918) {
                        this.f62923.remove(str);
                        z2 = true;
                    }
                }
                if (c0732.f2765 != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f62910.contains(str)) {
                    z = true;
                }
            }
        }
        if (sb.length() > 0) {
            AbstractC15440 abstractC15440M27330 = m44854().m27330("removed");
            try {
                abstractC15440M27330.mo35195();
                abstractC15440M27330.m36516(sb.toString());
            } catch (Throwable th) {
                this.f62916.mo1664(th);
            }
        }
        if (z) {
            m44811();
        }
        if (z2) {
            this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44815() {
        AbstractC15440 abstractC15440M27330 = m44854().m27330("recent");
        try {
            abstractC15440M27330.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC15440M27330.mo23555(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f62910.iterator();
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
            this.f62916.mo1664(th3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44818(String str) {
        ArrayList arrayList = this.f62910;
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
            while (arrayList.size() > 30) {
                C18473.m42953(arrayList, 1);
            }
            m44815();
            m44811();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m44840(String str) {
        if (this.f62910.remove(str)) {
            m44815();
            m44811();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44844() {
        this.f62910.clear();
        m44815();
        m44811();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m44811() {
        ArrayList arrayList = this.f62910;
        this.f62911.mo1664(C20195.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44828(ActivityC17169 activityC17169, C4650 c4650) {
        this.f62916.m1668(activityC17169, c4650);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44826(C13865 c13865, C22333 c22333) {
        this.f62911.m1668(c13865, c22333);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44825(C13865 c13865, C20217 c20217) {
        this.f62914.m1668(c13865, c20217);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44832(ActivityC17169 activityC17169, C3764 c3764) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m36267()) {
            boolean zMo23120 = m44854().m27330("strings_changed").mo23120();
            int i2 = 1;
            if (activityC17169.m40366()) {
                z = true;
            } else {
                if (this.f62919 || this.f62924) {
                    z2 = true;
                } else {
                    try {
                        if (!m44805()) {
                            C8868 c8868 = new C8868(this);
                            c8868.m22905();
                            if (c8868.f27006.isEmpty() && this.f62922 == c8868.f27005.size()) {
                                z2 = false;
                            } else {
                                C11005 c11005M44804 = m44804();
                                C11005 c11005 = new C11005(m36263(), "arscBuild/resources.digest");
                                if (c11005M44804.m27336() && c11005.m27336()) {
                                    z2 = !m44802(c11005M44804, c11005, c8868.m22906());
                                }
                            }
                            this.f62924 = z2;
                        }
                        z2 = true;
                        this.f62924 = z2;
                    } catch (Exception unused) {
                        this.f62924 = true;
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
                int i3 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(activityC17169);
                c19258.m44433(R.string.MT_Protector);
                c19258.m44416(R.string.MT_Protector);
                c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22813(i, c3764));
                if (z) {
                    c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18040(i, activityC17169));
                } else {
                    c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9630(activityC17169, i2));
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
