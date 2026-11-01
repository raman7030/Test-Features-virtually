package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0655am;
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
public final class C20856 extends C16868 {

    /* JADX INFO: renamed from: ֡ */
    public static final int f65526 = C16111.m36666().getDigestLength();

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList f65527;

    /* JADX INFO: renamed from: ۘ */
    public final C7350 f65528;

    /* JADX INFO: renamed from: ۜ */
    public boolean f65529;

    /* JADX INFO: renamed from: ۡ */
    public C6724 f65530;

    /* JADX INFO: renamed from: ۢ */
    public final C7350 f65531;

    /* JADX INFO: renamed from: ۧ */
    public final C12828 f65532;

    /* JADX INFO: renamed from: ܳ */
    public final C7350 f65533;

    /* JADX INFO: renamed from: ܺ */
    public C10321 f65534;

    /* JADX INFO: renamed from: ܽ */
    public boolean f65535;

    /* JADX INFO: renamed from: ܿ */
    public boolean f65536;

    /* JADX INFO: renamed from: ᩳ */
    public String f65537;

    /* JADX INFO: renamed from: ᩴ */
    public final HashMap f65538;

    /* JADX INFO: renamed from: ᩵ */
    public int f65539;

    /* JADX INFO: renamed from: ᩷ */
    public Set f65540;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f65541;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47097(C20856 c20856, C3065 c3065, C12210 c12210, C4914 c4914, C14301 c14301, C19586 c19586, Map map) throws C7760 {
        String str = c3065.f5532;
        try {
            C20635 c20635M47105 = c20856.m47105(c3065);
            c12210.m28192();
            C13551.m30846(c20635M47105, c4914, c12210, c14301, c19586);
            List listM28186 = c12210.m28186();
            if (map != null) {
                map.put(str, listM28186);
            }
            c20635M47105.m46643();
        } catch (C3870 e) {
            throw new C7760(str, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m47115(String str, String str2) {
        if (!this.f65538.containsKey(str)) {
            C3065 c3065 = new C3065(str, false);
            C12828 c12828 = new C12828(new C12828(this.f65532, DocumentReader.RESERVED), str + ".xml");
            c3065.f5534 = c12828;
            c12828.m29402().m38668(str2);
            this.f65538.put(str, c3065);
            if (this.f65535) {
                this.f65540.add(str);
                this.f65531.mo4062(C21562.unmodifiableSet(this.f65540));
            }
        } else {
            throw new C20807("Xml exists: " + str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C20856 m47109(C12828 c12828) {
        return new C20856(c12828);
    }

    public C20856(C12828 c12828) throws IOException {
        super(c12828);
        this.f65538 = new HashMap();
        this.f65527 = new ArrayList();
        Set set = Collections.EMPTY_SET;
        this.f65540 = set;
        this.f65534 = new C10321();
        this.f65533 = new C7350();
        this.f65528 = new C7350();
        this.f65531 = new C7350();
        this.f65535 = true;
        this.f65536 = false;
        this.f65530 = new C6724();
        C12828 c12829 = new C12828(c12828, "arsc");
        this.f65532 = c12829;
        C1446.m31704(c12829.m29398());
        AbstractC17043 abstractC17043M29392 = m47150().m29392("removed");
        Set set2 = set;
        if (abstractC17043M29392.mo25094()) {
            BufferedReader bufferedReaderM38679 = abstractC17043M29392.m38679();
            try {
                HashSet hashSet = new HashSet();
                while (true) {
                    String line = bufferedReaderM38679.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet.add(line);
                    }
                }
                bufferedReaderM38679.close();
                set2 = hashSet;
            } catch (Throwable th) {
                try {
                    bufferedReaderM38679.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C12828 c128210 = new C12828(m47135(), "xmls");
        if (!c128210.m29398()) {
            throw new IOException("File not found: " + c128210.m29401());
        }
        ArrayList<C3065> arrayListM47110 = m47110(c128210);
        this.f65539 = arrayListM47110.size();
        for (C3065 c3065 : arrayListM47110) {
            if (!set2.contains(c3065.f5532)) {
                this.f65538.put(c3065.f5532, c3065);
            }
        }
        m47112();
        ArrayList arrayList = this.f65527;
        AbstractC17043 abstractC17043M29393 = m47150().m29392("recent");
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
            m47107();
        }
        this.f65537 = new C12828(m47150(), "name").m29402().m38647();
        C12828 c128211 = new C12828(m47150(), "pkgsort");
        if (c128211.m29398()) {
            C14677 c14677 = new C14677(c128211.m29399());
            C23395.m52060((InterfaceC21384) c14677, -1430501583);
            while (c14677.available() > 0) {
                this.f65534.mo23936(c14677.m33581(), (Object) c14677.m33593());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m47110(C12828 c12828) {
        boolean z;
        C13337 c13337 = new C13337(c12828.m29402());
        try {
            if (c13337.m30464() == 1920094587) {
                c13337.skipBytes(4);
                z = true;
            } else {
                C23395.m52060(c13337, 1920094586);
                z = false;
            }
            int i = c13337.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String strM30467 = c13337.m30467();
                int i3 = c13337.readInt();
                int i4 = c13337.readInt();
                C3065 c3065 = new C3065(strM30467, z);
                c3065.f5539 = c12828;
                c3065.f5538 = i3;
                c3065.f5537 = i4;
                arrayList.add(c3065);
            }
            c13337.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c13337.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final C12828 m47135() {
        return new C12828(this.f65532, AbstractC0213e.f989m);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C12828 m47150() {
        return new C12828(this.f65532, "config");
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m47133() {
        return this.f65537;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47126(boolean z) {
        this.f65535 = z;
        if (z) {
            m47112();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m47098(C12828 c12828, C12828 c12829, byte[] bArr) {
        if (this.f65536 || !c12828.m29398() || !c12829.m29398()) {
            return false;
        }
        try {
            C14677 c14677 = new C14677(c12829.m29399());
            C23395.m52060((InterfaceC21384) c14677, 1936945938);
            if (!Arrays.equals(c14677.m33583(), bArr)) {
                return false;
            }
            MessageDigest messageDigestM36660 = C16111.m36660();
            C16111.m36661(messageDigestM36660, c12828.m29402().mo29987());
            return Arrays.equals(c14677.m33583(), messageDigestM36660.digest());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m47134(String str) {
        return this.f65538.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final Collection m47148() {
        return this.f65538.values();
    }

    /* JADX INFO: renamed from: ۘ */
    public final C18676 m47130() {
        C15993 c15993M36344 = C15993.m36344(this.f65538.keySet());
        c15993M36344.m36350(new C5604(2));
        C18676 c18676M36348 = c15993M36344.m36348();
        Collections.sort(c18676M36348.m42500(), new C16160(this));
        return c18676M36348;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ int m47088(C20856 c20856, C18676 c18676, C18676 c18677) {
        C10321 c10321 = c20856.f65534;
        int iMo26852 = c10321.mo26852(EnumC5674.f13823, c18676.m42502());
        int iMo26853 = c10321.mo26852(EnumC5674.f13823, c18677.m42502());
        if (iMo26852 == iMo26853) {
            return c18676.m42502().compareToIgnoreCase(c18677.m42502());
        }
        return Integer.compare(iMo26852, iMo26853);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX INFO: renamed from: ֡ */
    public final void m47112() {
        C12828[] c12828Arr;
        int i;
        int i2;
        if (!this.f65535) {
            throw new IllegalStateException();
        }
        HashMap map = this.f65538;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3065) it.next()).f5534 = null;
        }
        C12828[] c12828ArrM29397 = new C12828(this.f65532, DocumentReader.RESERVED).m29397();
        int i3 = 0;
        if (c12828ArrM29397 == null) {
            c12828ArrM29397 = new C12828[0];
        }
        int length = c12828ArrM29397.length;
        int i4 = 0;
        while (i4 < length) {
            C12828 c12828 = c12828ArrM29397[i4];
            if (c12828.m29402().mo25087()) {
                String str = c12828.getName() + "/";
                C12828 c12829 = new C12828(c12828, "package-info.xml");
                if (c12829.m29398()) {
                    String strM40053 = C17588.m40053(str, "package-info");
                    C3065 c3065 = (C3065) map.get(strM40053);
                    if (c3065 == null) {
                        c3065 = new C3065(strM40053, i3);
                        map.put(strM40053, c3065);
                    }
                    c3065.f5534 = c12829;
                }
                C12828[] c12828ArrM29398 = c12828.m29397();
                if (c12828ArrM29398 == null) {
                    c12828ArrM29398 = new C12828[i3];
                }
                int length2 = c12828ArrM29398.length;
                int i5 = 0;
                int i6 = i3;
                while (i5 < length2) {
                    C12828 c128210 = c12828ArrM29398[i5];
                    if (c128210.m29402().mo25087()) {
                        String name = c128210.getName();
                        String strM53357 = C24104.m53357(str, name, "/");
                        C12828[] c12828ArrM29399 = c128210.m29397();
                        if (c12828ArrM29399 == null) {
                            c12828ArrM29399 = new C12828[i6];
                        }
                        int length3 = c12828ArrM29399.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            C12828 c128211 = c12828ArrM29399[i7];
                            if (c128211.m29402().mo25093()) {
                                c12828Arr = c12828ArrM29397;
                                i = length3;
                                if (c128211.getName().toLowerCase().endsWith(".xml")) {
                                    i2 = length;
                                    String strM38720 = C17073.m38720(4, 0, c128211.getName());
                                    if (strM38720.startsWith(name) || strM38720.equals("type-info")) {
                                        String strM40054 = C17588.m40053(strM53357, strM38720);
                                        C3065 c3066 = (C3065) map.get(strM40054);
                                        if (c3066 == null) {
                                            c3066 = new C3065(strM40054, false);
                                            map.put(strM40054, c3066);
                                        }
                                        c3066.f5534 = c128211;
                                    }
                                }
                                i7++;
                                length3 = i;
                                c12828ArrM29397 = c12828Arr;
                                length = i2;
                            } else {
                                c12828Arr = c12828ArrM29397;
                                i = length3;
                            }
                            i2 = length;
                            i7++;
                            length3 = i;
                            c12828ArrM29397 = c12828Arr;
                            length = i2;
                        }
                    }
                    i5++;
                    i6 = 0;
                    c12828ArrM29397 = c12828ArrM29397;
                    length = length;
                }
            }
            i4++;
            i3 = 0;
            c12828ArrM29397 = c12828ArrM29397;
            length = length;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C3065 c3067 = (C3065) ((Map.Entry) it2.next()).getValue();
            if (c3067.f5534 != null) {
                hashSet.add(c3067.f5532);
            } else if (c3067.f5539 == null) {
                it2.remove();
            }
        }
        C7350 c7350 = this.f65531;
        Set set = (Set) c7350.m4060();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f65540 = hashSet;
        c7350.mo4062(C21562.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47118(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Set set) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        for (C3065 c3065 : this.f65538.values()) {
            String str2 = c3065.f5532;
            if (set == null || set.contains(str2)) {
                if (str2.startsWith(str) && (z || str2.indexOf(47, str.length()) == -1)) {
                    concurrentLinkedQueue.add(new C20185(this, c3065));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C12828 m47104(C12828 c12828) {
        return new C12828(m38424(), C21466.m48631("arscBuild", c12828.m29401().substring(new C12828(this.f65532, DocumentReader.RESERVED).m29401().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ۚ */
    private C12828 m47100() {
        return new C12828(m38424(), "arscBuild/resources.arsc");
    }

    /* JADX INFO: renamed from: ۠ */
    private boolean m47101() {
        Iterator it = this.f65538.values().iterator();
        while (true) {
            boolean zM47099 = false;
            if (!it.hasNext()) {
                return false;
            }
            C12828 c12828 = ((C3065) it.next()).f5534;
            if (c12828 != null) {
                C12828 c12828M47104 = m47104(c12828);
                if (c12828M47104.m29398()) {
                    zM47099 = m47099(C16111.m36666().digest(c12828.m29399()), c12828M47104);
                }
                if (!zM47099) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20635 m47106(C12828 c12828, C12828 c12829) throws IOException {
        byte[] bArrM29399 = c12828.m29399();
        byte[] bArrDigest = C16111.m36666().digest(bArrM29399);
        if (m47099(bArrDigest, c12829)) {
            return null;
        }
        C20635 c20635M46634 = C20635.m46634(new String(bArrM29399, StandardCharsets.UTF_8), false);
        c20635M46634.getClass();
        C11996 c11996 = new C11996();
        c20635M46634.m46638(c11996);
        c12829.m29400();
        OutputStream outputStreamMo25506 = c12829.m29402().mo25506(false);
        try {
            outputStreamMo25506.write(bArrDigest);
            outputStreamMo25506.write(c11996.m27458(), 0, c11996.size());
            outputStreamMo25506.close();
            return c20635M46634;
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
    public static boolean m47099(byte[] bArr, C12828 c12828) {
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
    public static C20635 m47094(C12828 c12828) {
        C14677 c14677 = new C14677(c12828.m29399());
        c14677.skipBytes(f65526);
        return C20635.m46635(c14677);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX INFO: renamed from: ۖ */
    public final ConcurrentMapC12768 m47129() {
        boolean zM47086;
        int i;
        int i2;
        int i3;
        String str;
        C23198[] c23198Arr;
        String strM30468;
        int i4 = 1;
        if (this.f65536 || this.f65529) {
            zM47086 = true;
        } else {
            try {
                zM47086 = m47086();
                this.f65529 = zM47086;
            } catch (Exception unused) {
                this.f65529 = true;
                zM47086 = true;
            }
        }
        if (zM47086) {
            try {
                this.f65536 = true;
                m47127(false, (InterfaceC7957) new C11468());
                this.f65536 = false;
            } catch (Throwable th) {
                this.f65536 = false;
                throw th;
            }
        }
        C13337 c13337 = new C13337(new C12828(m38424(), "arscBuild/records").m29402());
        C23395.m52060(c13337, -416934225);
        c13337.skipBytes(c13337.readInt());
        int i5 = c13337.readInt();
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768(i5);
        int i6 = 0;
        while (i6 < i5) {
            String strM30467 = c13337.m30467();
            int i7 = c13337.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = c13337.readByte() & 255;
                int i10 = c13337.readInt();
                int i11 = c13337.readInt();
                C23198[] c23198Arr2 = null;
                if (i9 == 0) {
                    i = i5;
                    i2 = c13337.readInt();
                    i3 = i9;
                    str = null;
                    c23198Arr = null;
                } else {
                    if (i9 == i4) {
                        i = i5;
                        strM30468 = c13337.m30468();
                    } else if (i9 == 2 || i9 == 3) {
                        i = i5;
                        i2 = c13337.readInt();
                        i3 = i9;
                        str = null;
                        c23198Arr = null;
                    } else if (i9 == 101) {
                        strM30468 = c13337.m30468();
                        int iM30465 = c13337.m30465();
                        c23198Arr2 = new C23198[iM30465];
                        int i12 = 0;
                        while (i12 < iM30465) {
                            c23198Arr2[i12] = new C23198(c13337.m30467(), c13337.readInt(), c13337.readInt());
                            i12++;
                            i5 = i5;
                        }
                        i = i5;
                        i9 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                    str = strM30468;
                    i3 = i9;
                    c23198Arr = c23198Arr2;
                    i2 = 0;
                }
                arrayList.add(new C25209(i3, i2, str, c23198Arr, i10, i11));
                i8++;
                i4 = 1;
                i5 = i;
            }
            concurrentMapC12768.put(strM30467, arrayList);
            i6++;
            i4 = 1;
        }
        return concurrentMapC12768;
    }

    /* JADX INFO: renamed from: ֨ */
    private boolean m47086() {
        if (!m47101()) {
            C12828 c12828 = new C12828(m38424(), "arscBuild/records");
            if (c12828.m29398()) {
                C10797 c10797 = new C10797(this);
                c10797.m24876();
                byte[] bArrM24877 = c10797.m24877();
                boolean zEquals = false;
                if (!this.f65536 && c12828.m29398()) {
                    byte[] bArr = new byte[bArrM24877.length + 8];
                    try {
                        new DataInputStream(c12828.m29396()).readFully(bArr);
                        C14677 c14677 = new C14677(bArr);
                        C23395.m52060((InterfaceC21384) c14677, -416934225);
                        C23395.m52060((InterfaceC21384) c14677, bArrM24877.length);
                        c14677.seek(4L);
                        zEquals = Arrays.equals(c14677.m33583(), bArrM24877);
                    } catch (Exception unused) {
                    }
                }
                return !zEquals;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47127(boolean z, InterfaceC7957 interfaceC7957) throws C7760, IOException {
        HashMap map = this.f65538;
        for (C3065 c3065 : map.values()) {
            C12828 c12828 = c3065.f5534;
            String str = c3065.f5532;
            if (c12828 != null) {
                interfaceC7957.mo18369(str);
                try {
                    m47106(c12828, m47104(c12828));
                } catch (C3870 e) {
                    throw new C7760(str, e);
                }
            }
        }
        interfaceC7957.mo18370();
        C10797 c10797 = new C10797(this);
        c10797.m24876();
        C12828 c12828M47100 = m47100();
        C12828 c12829 = new C12828(m38424(), "arscBuild/resources.digest");
        C12828 c128210 = new C12828(m38424(), "arscBuild/records");
        if (c10797.f29930.isEmpty() && this.f65539 == c10797.f29929.size() && !this.f65536) {
            c12828M47100.m29395();
            c12829.m29395();
            this.f65541 = false;
            return;
        }
        if (interfaceC7957.mo3924()) {
            return;
        }
        byte[] bArrM24877 = c10797.m24877();
        if (m47098(c12828M47100, c12829, bArrM24877)) {
            this.f65541 = false;
            return;
        }
        if (interfaceC7957.mo3924()) {
            return;
        }
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        try {
            C10949 c10949M47091 = m47091(map, interfaceC7957, concurrentMapC12768, false);
            C20635.m46636();
            if (interfaceC7957.mo3924()) {
                return;
            }
            interfaceC7957.mo18367();
            c12828M47100.m29395();
            c12829.m29395();
            if (z) {
                C20689 c20689M25231 = c10949M47091.m25231();
                c20689M25231.m46753(new C4975(3, interfaceC7957));
                c12828M47100.m29400();
                C15347 c15347 = new C15347(c12828M47100.m29402());
                try {
                    c10949M47091.m25227(c15347, c20689M25231);
                    c15347.close();
                    this.f65530.m15371(c10949M47091);
                    MessageDigest messageDigestM36660 = C16111.m36660();
                    C16111.m36661(messageDigestM36660, c12828M47100.m29396());
                    byte[] bArrDigest = messageDigestM36660.digest();
                    C11996 c11996 = new C11996();
                    c11996.writeInt(1936945938);
                    c11996.m27454(bArrM24877);
                    c11996.m27454(bArrDigest);
                    c12829.m29402().m38661(c11996.m27458(), 0, c11996.size());
                } catch (Throwable th) {
                    try {
                        c15347.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c128210.m29400();
            try {
                C15347 c15348 = new C15347(c128210.m29402());
                try {
                    c15348.writeInt(-416934225);
                    c15348.m34931(bArrM24877);
                    c15348.writeInt(concurrentMapC12768.size());
                    for (Map.Entry entry : concurrentMapC12768.entrySet()) {
                        c15348.m34930((String) entry.getKey());
                        c15348.writeInt(((List) entry.getValue()).size());
                        for (C25209 c25209 : (List) entry.getValue()) {
                            int i = c25209.f80613;
                            int i2 = c25209.f80611;
                            int i3 = c25209.f80614;
                            C23198[] c23198Arr = c25209.f80615;
                            if (i != 0) {
                                if (i == 1) {
                                    if (c23198Arr != null) {
                                        c15348.writeByte(101);
                                    } else {
                                        c15348.writeByte(1);
                                    }
                                    c15348.writeInt(i3);
                                    c15348.writeInt(i2);
                                    c15348.m34929((CharSequence) c25209.f80616);
                                    if (c23198Arr != null) {
                                        c15348.mo15113(c23198Arr.length);
                                        for (C23198 c23198 : c23198Arr) {
                                            c15348.m34930(c23198.f72883);
                                            c15348.writeInt(c23198.f72882);
                                            c15348.writeInt(c23198.f72881);
                                        }
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new RuntimeException();
                                }
                            }
                            c15348.writeByte(i);
                            c15348.writeInt(i3);
                            c15348.writeInt(i2);
                            c15348.writeInt(c25209.f80612);
                        }
                    }
                    c15348.close();
                    this.f65541 = false;
                    this.f65529 = false;
                } catch (Throwable th3) {
                    try {
                        c15348.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException e2) {
                c128210.m29395();
                throw e2;
            }
        } catch (Throwable th5) {
            C20635.m46636();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47120(InterfaceC7957 interfaceC7957) {
        C12828 c12828;
        Iterator it = this.f65538.values().iterator();
        do {
            if (!it.hasNext()) {
                c12828 = null;
                break;
            }
            c12828 = ((C3065) it.next()).f5539;
        } while (c12828 == null);
        if (c12828 != null && c12828.m29402().mo25101() <= 31457280 && c12828.m29402().mo25101() <= 52428800) {
            ArrayList<C3065> arrayListM47110 = m47110(c12828);
            HashMap map = new HashMap();
            for (C3065 c3065 : arrayListM47110) {
                map.put(c3065.f5532, c3065);
            }
            try {
                m47091(map, interfaceC7957, (ConcurrentMapC12768) null, true);
            } finally {
                C20635.m46636();
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
    /* JADX INFO: renamed from: ֫ */
    private C10949 m47091(HashMap map, InterfaceC7957 interfaceC7957, final ConcurrentMapC12768 concurrentMapC12768, boolean z) throws C7760, IOException {
        int i;
        C10949 c10949;
        String str;
        int iM27008;
        C20856 c20856 = this;
        String str2 = "realName";
        String str3 = "name";
        C10949 c10949M25221 = C10949.m25221(EnumC11620.CREATE);
        C12210 c12210 = new C12210(c10949M25221);
        C15993 c15993M36344 = C15993.m36344(map.keySet());
        c15993M36344.m36350(new C5604(2));
        C18676 c18676M36348 = c15993M36344.m36348();
        Collections.sort(c18676M36348.m42500(), new C16160(c20856));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c18676M36348.m42496().iterator();
        int size = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            size += ((C18676) it.next()).m42496().size() + 1;
        }
        C20689 c20689 = new C20689(size);
        c20689.m46753(new C24878(0, interfaceC7957));
        C20856 c20857 = c20856;
        for (C18676 c18676 : c18676M36348.m42496()) {
            c20689.m46754(i);
            C12642 c12642M42497 = c18676.m42497("package-info");
            if (c12642M42497 == null) {
                throw new IOException("File not found: " + c18676.m42502() + "/package-info.xml");
            }
            try {
                C20635 c20635M47093 = c20857.m47093(c12642M42497.m29073(), map);
                if (!c20635M47093.m46644().equals("package")) {
                    throw new C3870("Expected tag: <package>", c20635M47093);
                }
                C19964 c19964M46642 = c20635M47093.m46642("id");
                C19964 c19964M46643 = c20635M47093.m46642(str3);
                try {
                    C19964 c19964M46637 = c20635M47093.m46637("prefix");
                    try {
                        C10278 c10278M25225 = c10949M25221.m25225(m47087(c19964M46642) & 255, c19964M46643.m45304());
                        C19964 c19964M46638 = c20635M47093.m46637("configLayout");
                        if (c19964M46638 != null) {
                            c10278M25225.m23892(EnumC12270.m28288(c19964M46638.m45304()));
                        }
                        if (c19964M46637 != null) {
                            c12210.m28191(c10278M25225.mo14722(), m47102(c19964M46637));
                        }
                        Iterator itM46632 = C20635.m46632(c20635M47093, "library");
                        while (itM46632.hasNext()) {
                            C20635 c20635 = (C20635) itM46632.next();
                            C19964 c19964M46644 = c20635.m46642("id");
                            C19964 c19964M46645 = c20635.m46642(str3);
                            Iterator it2 = itM46632;
                            try {
                                int iM47087 = m47087(c19964M46644);
                                C10949 c109410 = c10949M25221;
                                c10278M25225.m23889(iM47087, m47102(c19964M46645));
                                c10949M25221 = c109410;
                                itM46632 = it2;
                            } catch (RuntimeException e) {
                                throw new C3870(e.getMessage(), c20635);
                            }
                        }
                        c10949 = c10949M25221;
                        Iterator itM46633 = C20635.m46632(c20635M47093, "overlay");
                        while (itM46633.hasNext()) {
                            C20635 c20636 = (C20635) itM46633.next();
                            C19964 c19964M46646 = c20636.m46642(str3);
                            Iterator it3 = itM46633;
                            C19964 c19964M46639 = c20636.m46637("actor");
                            try {
                                C2901 c2901M23887 = c10278M25225.m23887(m47102(c19964M46646), c19964M46639 == null ? "" : c19964M46639.m45304());
                                Iterator itM46634 = C20635.m46632(c20636, C0655am.f2341bp);
                                while (itM46634.hasNext()) {
                                    C20635 c20637 = (C20635) itM46634.next();
                                    Iterator it4 = itM46634;
                                    int iM47088 = m47087(c20637.m46642("flags"));
                                    C12210 c12211 = c12210;
                                    C17441 c17441 = new C17441();
                                    Iterator itM46635 = C20635.m46632(c20637, "id");
                                    while (itM46635.hasNext()) {
                                        Iterator it5 = itM46635;
                                        C3199 c3199M46641 = ((C20635) itM46635.next()).m46641();
                                        ArrayList arrayList3 = arrayList2;
                                        String strM5533 = c3199M46641.m5533();
                                        if (C11774.m27009(strM5533)) {
                                            iM27008 = C11774.m27008(strM5533.substring(2));
                                        } else {
                                            if (!C11774.m27015(strM5533)) {
                                                throw new C3870(C6988.m16053("Integer value required: \"", strM5533, "\""), c3199M46641);
                                            }
                                            iM27008 = Integer.parseInt(strM5533);
                                        }
                                        c17441.add(iM27008);
                                        arrayList2 = arrayList3;
                                        itM46635 = it5;
                                    }
                                    c2901M23887.m4676(iM47088, c17441);
                                    itM46634 = it4;
                                    c12210 = c12211;
                                    arrayList2 = arrayList2;
                                }
                                itM46633 = it3;
                            } catch (RuntimeException e2) {
                                throw new C3870(e2.getMessage(), c20636);
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        final C12210 c12212 = c12210;
                        Iterator itM46636 = C20635.m46632(c20635M47093, "stagedAlias");
                        while (true) {
                            boolean zHasNext = itM46636.hasNext();
                            str = Entry.DEFAULT_NAME;
                            if (!zHasNext) {
                                break;
                            }
                            C20635 c20638 = (C20635) itM46636.next();
                            C16982 c16982M23893 = c10278M25225.m23893();
                            c20638.getClass();
                            Iterator itM46637 = C20635.m46632(c20638, Entry.DEFAULT_NAME);
                            while (itM46637.hasNext()) {
                                C20635 c20639 = (C20635) itM46637.next();
                                c16982M23893.m38569(m47087(c20639.m46642("stagedResId")), m47087(c20639.m46642("finalizedResId")));
                                itM46636 = itM46636;
                            }
                        }
                        c20635M47093.m46643();
                        if (!interfaceC7957.mo3924()) {
                            C20125 c20125 = new C20125();
                            C20125 c20126 = new C20125();
                            C20125 c20127 = new C20125();
                            Iterator it6 = c18676.m42496().iterator();
                            ?? r9 = c20857;
                            ConcurrentMapC12768 concurrentMapC12769 = concurrentMapC12768;
                            while (it6.hasNext()) {
                                C18676 c18677 = (C18676) it6.next();
                                Iterator it7 = it6;
                                c20689.m46754(1);
                                StringBuilder sb = new StringBuilder();
                                C20689 c206810 = c20689;
                                sb.append(c18677.m42501());
                                sb.append("/type-info");
                                ?? string = sb.toString();
                                try {
                                    C20635 c20635M47094 = r9.m47093(string, map);
                                    if (!c20635M47094.m46644().equals("type")) {
                                        throw new C3870("Expected tag: <type>", c20635M47094);
                                    }
                                    C19964 c19964M466310 = c20635M47094.m46637(str2);
                                    String strM42502 = c18677.m42502();
                                    String strM45304 = c19964M466310 == null ? null : c19964M466310.m45304();
                                    int iM47089 = m47087(c20635M47094.m46642("id")) & 255;
                                    C18676 c18678 = c18676;
                                    C19964 c19964M466311 = c20635M47094.m46637("defaultPublic");
                                    try {
                                        string = c20635M47094.m46637("defaultWeak");
                                        C19964 c19964M466312 = c20635M47094.m46637("defaultCompact");
                                        try {
                                            final C21678 c21678M23895 = c10278M25225.m23895(iM47089, strM42502);
                                            if (strM45304 != null) {
                                                arrayList.add(new RunnableC11834(6, c21678M23895, strM45304));
                                            }
                                            if (c19964M466311 != null && c19964M466311.m45304().equals("true")) {
                                                c20125.add(iM47089);
                                            }
                                            if (string != 0 && string.m45304().equals("true")) {
                                                c20126.add(iM47089);
                                            }
                                            if (c19964M466312 != null && c19964M466312.m45304().equals("true")) {
                                                c20127.add(iM47089);
                                            }
                                            C1782 c1782 = new C1782(c20635M47094.m46639().size());
                                            C20125 c20128 = new C20125(c20635M47094.m46639().size());
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator itM46638 = C20635.m46632(c20635M47094, str);
                                            while (itM46638.hasNext()) {
                                                C20635 c206310 = (C20635) itM46638.next();
                                                C19964 c19964M46647 = c206310.m46642("id");
                                                C19964 c19964M46648 = c206310.m46642(str3);
                                                Iterator it8 = itM46638;
                                                String str4 = str2;
                                                C19964 c19964M466313 = c206310.m46637(str4);
                                                String str5 = str;
                                                int iM470810 = (m47087(c19964M46647) & 65535) | (c10278M25225.mo14722() << 24) | (c21678M23895.mo5199() << 16);
                                                String strM47102 = m47102(c19964M46648);
                                                final String strM45305 = c19964M466313 == null ? null : c19964M466313.m45304();
                                                if (!c1782.add(strM47102)) {
                                                    throw new C3870("Duplicate name: " + c19964M46648.m45304(), c19964M46648);
                                                }
                                                if (!c20128.add(iM470810)) {
                                                    throw new C3870("Duplicate id: " + c19964M46647.m45304(), c19964M46647);
                                                }
                                                if (strM45305 != null) {
                                                    final int i2 = iM470810 & 65535;
                                                    arrayList.add(new Runnable() { // from class: l.ۜۨ᩷
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            c21678M23895.m48933(i2, strM45305);
                                                        }
                                                    });
                                                }
                                                int i3 = iM470810 & 65535;
                                                c21678M23895.m48934(i3, strM47102, false);
                                                m47096(c206310, c21678M23895, i3);
                                                arrayList5.add(new C25209(iM470810, c206310.m24372(), c206310.m24371()));
                                                itM46638 = it8;
                                                str2 = str4;
                                                str3 = str3;
                                                str = str5;
                                            }
                                            String str6 = str;
                                            String str7 = str3;
                                            String str8 = str2;
                                            if (concurrentMapC12768 != 0) {
                                                concurrentMapC12768.put(string, arrayList5);
                                            }
                                            c20635M47094.m46643();
                                            r9 = this;
                                            concurrentMapC12769 = concurrentMapC12768;
                                            it6 = it7;
                                            c20689 = c206810;
                                            c18676 = c18678;
                                            c10278M25225 = c10278M25225;
                                            str2 = str8;
                                            str3 = str7;
                                            str = str6;
                                            map = map;
                                        } catch (Exception e3) {
                                            throw new C3870(e3.getMessage(), c20635M47094.m46642("id"));
                                        }
                                    } catch (C3870 e4) {
                                        e = e4;
                                        string = string;
                                    }
                                } catch (C3870 e5) {
                                    e = e5;
                                }
                                throw new C7760(string, e);
                            }
                            C18676 c18679 = c18676;
                            C20689 c206811 = c20689;
                            C10278 c10278 = c10278M25225;
                            String str9 = str2;
                            String str10 = str3;
                            if (!interfaceC7957.mo3924()) {
                                Iterator it9 = c10278.mo14714().iterator();
                                while (it9.hasNext()) {
                                    C21678 c21678 = (C21678) it9.next();
                                    String typeName = c21678.getTypeName();
                                    boolean z2 = typeName.equals("attr") || typeName.equals("id") || typeName.equals("^attr-private");
                                    final String str11 = c18679.m42502() + "/" + typeName + "/" + typeName;
                                    List<C3065> list = (List) C7480.stream(map.entrySet()).filter(new Predicate() { // from class: l.᩷ۨ᩷
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
                                        public /* synthetic */ Predicate m50005or(Predicate predicate) {
                                            return C20697.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            return ((String) ((Map.Entry) obj).getKey()).startsWith(str11);
                                        }
                                    }).map(new C19073(1)).sorted().collect(C24205.toList());
                                    final C19586 c19586 = new C19586();
                                    c19586.f59596 = c20125.contains(c21678.mo5199());
                                    c19586.f59597 = c20126.contains(c21678.mo5199());
                                    c19586.f59595 = c20127.contains(c21678.mo5199());
                                    final C14301 c14301M48938 = c21678.m48938();
                                    for (final C3065 c3065 : list) {
                                        try {
                                            final C4914 c4914M48931 = c21678.m48931(C22999.m51348(c3065.f5532.substring(str11.length()), c10278.mo14712()));
                                            C21678 c21679 = c21678;
                                            ArrayList arrayList6 = arrayList4;
                                            arrayList6.add(z2 ? 0 : arrayList4.size(), new InterfaceC17501() { // from class: l.ܰۛ᩷
                                                @Override // p067l.InterfaceC17501
                                                public final void run() throws C7760 {
                                                    C20856.m47097(this.f43746, c3065, c12212, c4914M48931, c14301M48938, c19586, concurrentMapC12768);
                                                }
                                            });
                                            arrayList = arrayList;
                                            it9 = it9;
                                            c20127 = c20127;
                                            c20126 = c20126;
                                            arrayList4 = arrayList6;
                                            c21678 = c21679;
                                        } catch (Exception unused) {
                                            throw new IOException("Name format error: " + C4686.m9924(c3065.f5532));
                                        }
                                    }
                                    C20125 c20129 = c20127;
                                    C20125 c201210 = c20126;
                                    Iterator it10 = it9;
                                    ArrayList arrayList7 = arrayList4;
                                    ArrayList arrayList8 = arrayList;
                                    if (!interfaceC7957.mo3924()) {
                                        arrayList = arrayList8;
                                        it9 = it10;
                                        c20127 = c20129;
                                        c20126 = c201210;
                                        arrayList4 = arrayList7;
                                    }
                                }
                                i = 1;
                                c20857 = this;
                                arrayList2 = arrayList4;
                                c10949M25221 = c10949;
                                c20689 = c206811;
                                c12210 = c12212;
                                str2 = str9;
                                str3 = str10;
                            }
                        }
                        return c10949;
                    } catch (RuntimeException e6) {
                        throw new C3870(e6.getMessage(), c20635M47093);
                    }
                } catch (C3870 e7) {
                    e = e7;
                }
            } catch (C3870 e8) {
                e = e8;
            }
            throw new C7760(c12642M42497.m29073(), e);
        }
        ArrayList<InterfaceC17501> arrayList9 = arrayList2;
        ArrayList arrayList10 = arrayList;
        c10949 = c10949M25221;
        C20689 c206812 = new C20689(arrayList9.size());
        c206812.m46753(new C16624(2, interfaceC7957));
        for (InterfaceC17501 interfaceC17501 : arrayList9) {
            c206812.m46754(1);
            interfaceC17501.run();
            if (interfaceC7957.mo3924()) {
                return c10949;
            }
        }
        Iterator it11 = arrayList10.iterator();
        while (it11.hasNext()) {
            ((Runnable) it11.next()).run();
        }
        if (z) {
            try {
                c10949.mo14241(C10949.m25220(new C24538(m47135().m29392("resources")), EnumC11620.CREATE));
                return c10949;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
        return c10949;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47096(C20635 c20635, C21678 c21678, int i) throws C3870 {
        C19964 c19964M46637 = c20635.m46637("stagedApi");
        if (c19964M46637 != null && !"true".equals(c19964M46637.m45304()) && !"false".equals(c19964M46637.m45304())) {
            throw new C3870("Boolean value required: stagedApi", c19964M46637);
        }
        int i2 = 0;
        c21678.m48942(i, c19964M46637 != null && "true".equals(c19964M46637.m45304()));
        C19964 c19964M46638 = c20635.m46637("extraTypeSpecFlags");
        if (c19964M46638 != null) {
            String strM45304 = c19964M46638.m45304();
            try {
                boolean zStartsWith = strM45304.startsWith("0x");
                String strSubstring = zStartsWith ? strM45304.substring(2) : strM45304;
                if (strSubstring.isEmpty() || strSubstring.charAt(0) == '-' || strSubstring.charAt(0) == '+') {
                    throw new NumberFormatException();
                }
                long j = Long.parseLong(strSubstring, zStartsWith ? 16 : 10);
                if (j < 0 || j > 4294967295L) {
                    throw new NumberFormatException();
                }
                i2 = (int) j;
                if (((c21678.m48939().mo14712().m28290() | 1610874879) & i2) != 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException unused) {
                throw new C3870(C21466.m48631("Invalid extraTypeSpecFlags: ", strM45304), c19964M46638);
            }
        }
        c21678.m48941(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47087(C19964 c19964) throws C3870 {
        String strM45304 = c19964.m45304();
        if (C11774.m27009(strM45304)) {
            return C11774.m27008(strM45304.substring(2));
        }
        if (C11774.m27015(strM45304)) {
            return Integer.parseInt(strM45304);
        }
        throw new C3870(C21459.m48622("Integer value required: ", c19964.m45303(), "=\"", c19964.m45304(), "\""), c19964);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m47102(C19964 c19964) throws C3870 {
        String strM45304 = c19964.m45304();
        if (strM45304.isEmpty()) {
            throw new C3870(C6988.m16053("Value required: ", c19964.m45303(), "=\"\""), c19964);
        }
        return strM45304;
    }

    /* JADX INFO: renamed from: ֫ */
    private C20635 m47093(String str, Map map) throws C20807 {
        C3065 c3065 = (C3065) map.get(str);
        if (c3065 != null) {
            return m47105(c3065);
        }
        throw new C20807(C21466.m48631("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ۧ */
    private C20635 m47105(C3065 c3065) {
        return new C20185(this, c3065).m45663();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20125 m47138(String str) {
        final String strM40053 = C17588.m40053(str, "/");
        List list = (List) C7480.stream(this.f65538.entrySet()).filter(new Predicate() { // from class: l.֫ۨ᩷
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
            public /* synthetic */ Predicate m8228or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) ((Map.Entry) obj).getKey();
                return str2.startsWith(strM40053) && str2.endsWith("/type-info");
            }
        }).map(new C19073(1)).collect(C24205.toList());
        C20125 c20125 = new C20125();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c20125.add(m47087(m47105((C3065) it.next()).m46642("id")) & 255);
            } catch (Exception unused) {
            }
        }
        return c20125;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC12270 m47143(String str) throws IOException {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        C3065 c3065 = (C3065) this.f65538.get(str + "/package-info");
        if (c3065 == null) {
            throw new IOException(C21466.m48631("Package metadata is missing: ", str));
        }
        C20635 c20635M47105 = m47105(c3065);
        try {
            C19964 c19964M46637 = c20635M47105.m46637("configLayout");
            return c19964M46637 == null ? EnumC12270.AOSP : EnumC12270.m28288(c19964M46637.m45304());
        } finally {
            c20635M47105.m46643();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47113(int i, String str) {
        C3065 c3065 = (C3065) this.f65538.get(C17588.m40053(str, "/package-info"));
        if (c3065 == null) {
            return i;
        }
        try {
            return m47087(m47105(c3065).m46642("id")) & 255;
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m47139(String str) {
        C3065 c3065 = (C3065) this.f65538.get(C17588.m40053(str, "/type-info"));
        if (c3065 != null) {
            C12828 c12828 = c3065.f5534;
            int iMo25091 = c12828 != null ? (int) (c12828.m29402().mo25091() / 1000) : 0;
            int i = c3065.f5536;
            if (i != -1 && c3065.f5535 == iMo25091) {
                return i;
            }
            try {
                int iM47087 = m47087(m47105(c3065).m46642("id")) & 255;
                c3065.f5536 = iM47087;
                c3065.f5535 = iMo25091;
                return iM47087;
            } catch (Exception unused) {
                c3065.f5536 = -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m47137(String str, String str2) {
        int iM47113;
        C3065 c3065;
        C19964 c19964M46637;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && (iM47113 = m47113(-1, str.substring(0, iIndexOf))) != -1 && (c3065 = (C3065) this.f65538.get(str)) != null) {
            try {
                C20635 c20635M47105 = m47105(c3065);
                int iM47087 = m47087(c20635M47105.m46642("id")) & 255;
                Iterator itM46631 = C20635.m46631(c20635M47105);
                while (itM46631.hasNext()) {
                    C20635 c20635 = (C20635) itM46631.next();
                    if (c20635.m46644().equals(Entry.DEFAULT_NAME) && (c19964M46637 = c20635.m46637("name")) != null && c19964M46637.m45304().equals(str2)) {
                        String strM45304 = c20635.m46642("id").m45304();
                        return (Integer.parseInt(strM45304.substring(strM45304.length() - 4), 16) & 65535) | (iM47113 << 24) | (iM47087 << 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m47144(String str) {
        C19964 c19964M46637;
        Iterator it = this.f65538.values().iterator();
        while (true) {
            C20635 c20635M45663 = null;
            if (!it.hasNext()) {
                return null;
            }
            C3065 c3065 = (C3065) it.next();
            if (c3065.f5532.endsWith("/package-info")) {
                String[] strArrSplit = c3065.f5532.split("/");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        c20635M45663 = new C20185(this, c3065).m45663();
                    } catch (IOException | C3870 unused) {
                    }
                    if (c20635M45663 != null && c20635M45663.m46644().equals("package") && (c19964M46637 = c20635M45663.m46637("prefix")) != null && c19964M46637.m45304().equals(str)) {
                        return strArrSplit[0];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m47142(String str, String str2) {
        C20635 c20635M45663;
        C19964 c19964M46637;
        ArrayList arrayList = new ArrayList();
        for (C3065 c3065 : this.f65538.values()) {
            String str3 = c3065.f5532;
            if (str3.startsWith(str)) {
                String strSubstring = str3.substring(str.length());
                if (strSubstring.indexOf(47) == -1) {
                    try {
                        c20635M45663 = new C20185(this, c3065).m45663();
                    } catch (IOException | C3870 unused) {
                        c20635M45663 = null;
                    }
                    if (c20635M45663 != null) {
                        if (c20635M45663.m46644().equals("type")) {
                            Iterator itM46631 = C20635.m46631(c20635M45663);
                            while (itM46631.hasNext()) {
                                C20635 c20635 = (C20635) itM46631.next();
                                if (c20635.m46644().equals(Entry.DEFAULT_NAME) && (c19964M46637 = c20635.m46637("name")) != null && c19964M46637.m45304().equals(str2)) {
                                    C20699 c20699M46760 = C20699.m46760(c19964M46637.m45306(), c19964M46637.m45305() - 1);
                                    c20699M46760.f63908 = true;
                                    arrayList.add(new C4762(strSubstring, str3, c20699M46760));
                                    break;
                                }
                            }
                        } else if (c20635M45663.m46644().equals("resources")) {
                            Iterator itM46632 = C20635.m46631(c20635M45663);
                            while (itM46632.hasNext()) {
                                C19964 c19964M46638 = ((C20635) itM46632.next()).m46637("name");
                                if (c19964M46638 != null && c19964M46638.m45304().equals(str2)) {
                                    C20699 c20699M46761 = C20699.m46760(c19964M46638.m45306(), c19964M46638.m45305() - 1);
                                    c20699M46761.f63908 = true;
                                    arrayList.add(new C4762(strSubstring, str3, c20699M46761));
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

    /* JADX INFO: renamed from: ֫ */
    public final void m47125(ActivityC18686 activityC18686, C21658 c21658) {
        this.f65530.m15372(activityC18686, c21658);
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC17043 m47141() {
        C12828 c12828M47100 = m47100();
        if (!c12828M47100.m29398()) {
            c12828M47100 = new C12828(m47135(), "resources");
        }
        return c12828M47100.m29402();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m47132() throws IOException {
        C12828 c12828M38426 = m38426();
        c12828M38426.m29402().m38666();
        C12828 c12828M47100 = m47100();
        if (!c12828M47100.m29398()) {
            c12828M47100 = new C12828(m47135(), "resources");
        }
        C12828 c12828 = new C12828(c12828M38426, this.f65537);
        InputStream inputStreamM29396 = c12828M47100.m29396();
        try {
            OutputStream outputStreamMo25506 = c12828.m29402().mo25506(false);
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

    /* JADX INFO: renamed from: ֫ */
    public final void m47123(AbstractC17043 abstractC17043, boolean z) throws IOException {
        abstractC17043.mo25497();
        C12828 c12828M47100 = m47100();
        if (c12828M47100.m29398()) {
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(this.f65537);
            if (z) {
                abstractC17043M38684.m38687();
            }
            try {
                InputStream inputStreamM29396 = c12828M47100.m29396();
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

    /* JADX INFO: renamed from: ᩻ */
    public final Collection m47153() {
        int i = 0;
        InterfaceC19157 interfaceC19157Filter = C7480.stream(m47129().values()).flatMap(new C12809(i)).filter(new C18172(i));
        int i2 = 3;
        return (Collection) interfaceC19157Filter.map(new C20002(i2)).distinct().sorted(new C24513(i2)).collect(C24205.toList());
    }

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList m47149() throws Throwable {
        C20635 c20635M47093;
        C20635 c20635M47094;
        Iterator it;
        String str;
        C20635 c20635;
        C3065 c3065;
        Iterator it2;
        LinkedHashMap linkedHashMap;
        C20856 c20856 = this;
        String str2 = "id";
        HashMap map = c20856.f65538;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = m47130().m42496().iterator();
        while (it3.hasNext()) {
            C18676 c18676 = (C18676) it3.next();
            C12642 c12642M42497 = c18676.m42497("package-info");
            if (c12642M42497 != null) {
                try {
                    c20635M47093 = c20856.m47093(c12642M42497.m29073(), map);
                    try {
                        try {
                            if (!c20635M47093.m46644().equals("package")) {
                                throw new C3870("Expected tag: <package>", c20635M47093);
                            }
                            int iM47087 = m47087(c20635M47093.m46642(str2)) & 255;
                            c20635M47093.m46643();
                            for (C18676 c18677 : c18676.m42496()) {
                                C12642 c12642M42498 = c18677.m42497("type-info");
                                if (c12642M42498 != null) {
                                    String strM29073 = c12642M42498.m29073();
                                    C1782 c1782 = new C1782();
                                    try {
                                        c20635M47094 = c20856.m47093(strM29073, map);
                                        try {
                                            try {
                                                if (!c20635M47094.m46644().equals("type")) {
                                                    throw new C3870("Expected tag: <type>", c20635M47094);
                                                }
                                                int iM47088 = m47087(c20635M47094.m46642(str2)) & 255;
                                                Iterator itM46632 = C20635.m46632(c20635M47094, Entry.DEFAULT_NAME);
                                                int iMax = 0;
                                                while (true) {
                                                    it = it3;
                                                    str = "name";
                                                    if (!itM46632.hasNext()) {
                                                        break;
                                                    }
                                                    C20635 c20636 = (C20635) itM46632.next();
                                                    C19964 c19964M46642 = c20636.m46642(str2);
                                                    c1782.add(m47102(c20636.m46642("name")));
                                                    iMax = Math.max(iMax, (m47087(c19964M46642) & 65535) + 1);
                                                    it3 = it;
                                                }
                                                c20635M47094.m46643();
                                                List<C3065> list = (List) C7480.stream(map.entrySet()).filter(new C9298(0, c18676.m42502() + "/" + c18677.m42502() + "/" + c18677.m42502())).map(new C19073(1)).sorted().collect(C24205.toList());
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                for (C3065 c3066 : list) {
                                                    try {
                                                        C20635 c20635M47105 = c20856.m47105(c3066);
                                                        try {
                                                            try {
                                                                str2 = str2;
                                                                if (c20635M47105.m46644().equals("resources")) {
                                                                    Iterator itM46631 = C20635.m46631(c20635M47105);
                                                                    while (itM46631.hasNext()) {
                                                                        C19964 c19964M46637 = ((C20635) itM46631.next()).m46637(str);
                                                                        if (c19964M46637 == null) {
                                                                            it2 = itM46631;
                                                                        } else {
                                                                            it2 = itM46631;
                                                                            String strM45304 = c19964M46637.m45304();
                                                                            if (!strM45304.isEmpty() && !c1782.contains(strM45304) && ((C6103) linkedHashMap2.get(strM45304)) == null) {
                                                                                if (iMax > 65535) {
                                                                                    c3065 = c3066;
                                                                                    throw new IOException("No available entry id: " + strM29073);
                                                                                }
                                                                                int i = (iM47087 << 24) | (iM47088 << 16) | iMax;
                                                                                c3065 = c3066;
                                                                                int i2 = iMax;
                                                                                linkedHashMap = linkedHashMap2;
                                                                                try {
                                                                                    linkedHashMap.put(strM45304, new C6103(strM29073, strM45304, i2, i, c3066.f5532, c19964M46637.m45306(), Math.max(c19964M46637.m45305() - 1, 0)));
                                                                                    iMax = i2 + 1;
                                                                                } catch (C3870 e) {
                                                                                    e = e;
                                                                                }
                                                                                e = e;
                                                                                throw new C7760(c3065.f5532, e);
                                                                            }
                                                                            c1782 = c1782;
                                                                            c3066 = c3065;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            itM46631 = it2;
                                                                            map = map;
                                                                            str = str;
                                                                            c18676 = c18676;
                                                                            iM47087 = iM47087;
                                                                            iM47088 = iM47088;
                                                                        }
                                                                        c3065 = c3066;
                                                                        linkedHashMap = linkedHashMap2;
                                                                        iMax = iMax;
                                                                        c1782 = c1782;
                                                                        c3066 = c3065;
                                                                        linkedHashMap2 = linkedHashMap;
                                                                        itM46631 = it2;
                                                                        map = map;
                                                                        str = str;
                                                                        c18676 = c18676;
                                                                        iM47087 = iM47087;
                                                                        iM47088 = iM47088;
                                                                    }
                                                                    c20635M47105.m46643();
                                                                    iM47087 = iM47087;
                                                                    c20856 = this;
                                                                } else {
                                                                    c20635M47105.m46643();
                                                                }
                                                            } catch (C3870 e2) {
                                                                e = e2;
                                                                c3065 = c3066;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c20635 = c20635M47105;
                                                            if (c20635 != null) {
                                                                c20635.m46643();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (C3870 e3) {
                                                        e = e3;
                                                        c3065 = c3066;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c20635 = null;
                                                    }
                                                }
                                                arrayList.addAll(linkedHashMap2.values());
                                                c20856 = this;
                                                it3 = it;
                                                str2 = str2;
                                                iM47087 = iM47087;
                                            } catch (C3870 e4) {
                                                e = e4;
                                                throw new C7760(strM29073, e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (C3870 e5) {
                                        e = e5;
                                        c20635M47094 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c20635M47094 = null;
                                    }
                                    th = th3;
                                    if (c20635M47094 != null) {
                                        c20635M47094.m46643();
                                    }
                                    throw th;
                                }
                            }
                            c20856 = this;
                        } catch (C3870 e6) {
                            e = e6;
                            throw new C7760(c12642M42497.m29073(), e);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (C3870 e7) {
                    e = e7;
                    c20635M47093 = null;
                } catch (Throwable th6) {
                    th = th6;
                    c20635M47093 = null;
                }
                th = th5;
                if (c20635M47093 != null) {
                    c20635M47093.m46643();
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47117(List list) throws C7760, IOException {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6103 c6103 = (C6103) it.next();
            ((List) C15525.computeIfAbsent(linkedHashMap, c6103.f15350, new C14008(2))).add(c6103);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C3065 c3065 = (C3065) this.f65538.get(str);
            if (c3065 == null) {
                throw new IOException(C21466.m48631("Xml not found: ", str));
            }
            String strM47089 = m47089(c3065);
            int iLastIndexOf = strM47089.lastIndexOf("</type>");
            if (iLastIndexOf < 0) {
                throw new IOException(C21466.m48631("Expected tag: </type> in ", str));
            }
            List<C6103> list2 = (List) entry.getValue();
            Collections.sort(list2, C10162.comparingInt(new C18843()));
            StringBuilder sb = new StringBuilder((list2.size() * 64) + strM47089.length());
            sb.append((CharSequence) strM47089, 0, iLastIndexOf);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
                sb.append('\n');
            }
            for (C6103 c6104 : list2) {
                sb.append("    <entry id=\"");
                sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c6104.f15346)));
                sb.append("\" name=\"");
                sb.append(C11905.f33151.m30298(c6104.f15345));
                sb.append("\" />\n");
            }
            String strM48621 = C21459.m48621(iLastIndexOf, strM47089, sb);
            try {
                C20635 c20635M46634 = C20635.m46634(strM48621, false);
                if (c20635M46634 != null) {
                    c20635M46634.m46643();
                }
                linkedHashMap2.put(c3065, strM48621);
            } catch (C3870 e) {
                throw new C7760(str, e);
            }
        }
        boolean z = this.f65535;
        this.f65535 = false;
        try {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                m47119((C3065) entry2.getKey(), (String) entry2.getValue());
            }
            m47126(z);
        } catch (Throwable th) {
            m47126(z);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m47131(String str) {
        C3065 c3065 = (C3065) this.f65538.get(str);
        if (c3065 == null) {
            return -268435456;
        }
        C12828 c12828 = c3065.f5534;
        if (c12828 != null) {
            return Long.valueOf(c12828.m29402().mo25091() ^ c12828.m29402().mo25101()).hashCode();
        }
        return c3065.f5539 != null ? -536870912 : -268435456;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m47146(String str) {
        C3065 c3065 = (C3065) this.f65538.get(str);
        return (c3065 == null || c3065.f5539 == null) ? "" : c3065.m5166();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m47152(String str) throws C20807 {
        C3065 c3065 = (C3065) this.f65538.get(str);
        if (c3065 != null) {
            return m47089(c3065);
        }
        throw new C20807(C21466.m48631("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47089(C3065 c3065) throws C20807 {
        C12828 c12828 = c3065.f5534;
        if (c12828 != null) {
            return c12828.m29402().m38647();
        }
        if (c3065.f5539 != null) {
            return c3065.m5166();
        }
        throw new C20807("Bad xml: " + c3065.f5532);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m47145(String str, String str2) throws IOException {
        C3065 c3065 = (C3065) this.f65538.get(str);
        if (c3065 == null) {
            throw new C20807("Xml not found: ".concat(str));
        }
        C20635 c20635M46634 = C20635.m46634(str2, false);
        m47119(c3065, str2);
        C12828 c12828M47104 = m47104(c3065.f5534);
        c12828M47104.m29400();
        byte[] bArrDigest = C16111.m36666().digest(str2.getBytes(StandardCharsets.UTF_8));
        c20635M46634.getClass();
        C11996 c11996 = new C11996();
        c20635M46634.m46638(c11996);
        OutputStream outputStreamMo25506 = c12828M47104.m29402().mo25506(false);
        try {
            outputStreamMo25506.write(bArrDigest);
            outputStreamMo25506.write(c11996.m27458(), 0, c11996.size());
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

    /* JADX INFO: renamed from: ᩳ */
    public final void m47147(String str, String str2) throws C20807 {
        C3065 c3065 = (C3065) this.f65538.get(str);
        if (c3065 == null) {
            throw new C20807(C21466.m48631("Xml not found: ", str));
        }
        m47119(c3065, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47119(C3065 c3065, String str) {
        boolean z;
        C12828 c12828 = c3065.f5534;
        String str2 = c3065.f5532;
        if (c12828 == null) {
            c3065.f5534 = new C12828(new C12828(this.f65532, DocumentReader.RESERVED), C17588.m40053(str2, ".xml"));
            z = true;
        } else {
            z = false;
        }
        c3065.f5534.m29402().m38668(str);
        if (this.f65535 && z) {
            this.f65540.add(str2);
            this.f65531.mo4062(C21562.unmodifiableSet(this.f65540));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m47151(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C3065 c3065 : this.f65538.values()) {
            if (c3065.f5532.startsWith(str)) {
                arrayList.add(c3065.f5532);
            }
        }
        m47116((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47116(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C3065 c3065 = (C3065) this.f65538.remove(str);
            if (c3065 != null) {
                C12828 c12828 = c3065.f5534;
                if (c12828 != null) {
                    c12828.m29395();
                    if (this.f65535) {
                        this.f65540.remove(str);
                        z2 = true;
                    }
                }
                if (c3065.f5539 != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f65527.contains(str)) {
                    z = true;
                }
            }
        }
        if (sb.length() > 0) {
            AbstractC17043 abstractC17043M29392 = m47150().m29392("removed");
            try {
                abstractC17043M29392.mo37342();
                abstractC17043M29392.m38674(sb.toString());
            } catch (Throwable th) {
                this.f65533.mo4062(th);
            }
        }
        if (z) {
            m47107();
        }
        if (z2) {
            this.f65531.mo4062(C21562.unmodifiableSet(this.f65540));
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m47111() {
        AbstractC17043 abstractC17043M29392 = m47150().m29392("recent");
        try {
            abstractC17043M29392.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC17043M29392.mo25506(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f65527.iterator();
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
            this.f65533.mo4062(th3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47114(String str) {
        ArrayList arrayList = this.f65527;
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
            while (arrayList.size() > 30) {
                C19925.m45229(arrayList, 1);
            }
            m47111();
            m47107();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m47136(String str) {
        if (this.f65527.remove(str)) {
            m47111();
            m47107();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m47140() {
        this.f65527.clear();
        m47111();
        m47107();
    }

    /* JADX INFO: renamed from: ܶ */
    private void m47107() {
        ArrayList arrayList = this.f65527;
        this.f65528.mo4062(C21562.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47124(ActivityC18686 activityC18686, C6788 c6788) {
        this.f65533.m4066(activityC18686, c6788);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47122(C15546 c15546, C23594 c23594) {
        this.f65528.m4066(c15546, c23594);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47121(C15546 c15546, C21583 c21583) {
        this.f65531.m4066(c15546, c21583);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m47128(ActivityC18686 activityC18686, C5946 c5946) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m38428()) {
            boolean zMo25094 = m47150().m29392("strings_changed").mo25094();
            int i2 = 1;
            if (activityC18686.m42611()) {
                z = true;
            } else {
                if (this.f65536 || this.f65541) {
                    z2 = true;
                } else {
                    try {
                        if (!m47101()) {
                            C10797 c10797 = new C10797(this);
                            c10797.m24876();
                            if (c10797.f29930.isEmpty() && this.f65539 == c10797.f29929.size()) {
                                z2 = false;
                            } else {
                                C12828 c12828M47100 = m47100();
                                C12828 c12828 = new C12828(m38424(), "arscBuild/resources.digest");
                                if (c12828M47100.m29398() && c12828.m29398()) {
                                    z2 = !m47098(c12828M47100, c12828, c10797.m24877());
                                }
                            }
                            this.f65541 = z2;
                        }
                        z2 = true;
                        this.f65541 = z2;
                    } catch (Exception unused) {
                        this.f65541 = true;
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
                int i3 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671(activityC18686);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46710(R.string.MT_Protector);
                c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24050(i, c5946));
                if (z) {
                    c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19514(i, activityC18686));
                } else {
                    c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11521(activityC18686, i2));
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
