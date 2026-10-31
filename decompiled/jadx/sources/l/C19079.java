package l;

import android.util.SparseLongArray;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19079 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f60071;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60072;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24017 f60074;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f60075;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60076;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f60077;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60078;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60080;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f60083;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f60084;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60085;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f60087;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f60068 = new Object();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Object f60079 = new Object();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f60073 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f60086 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f60067 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f60070 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60069 = -1;

    public C19079(AbstractC15440 abstractC15440) {
        this.f60076 = abstractC15440;
        this.f60072 = abstractC15440.m36526("x");
        this.f60085 = abstractC15440.m36526("y");
        this.f60080 = abstractC15440.m36526("f");
        this.f60081 = abstractC15440.m36526("complete.json");
        this.f60082 = abstractC15440.m36526("complete.json.tmp");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16255 m43958(String str, C12953 c12953) throws Throwable {
        if (m43956()) {
            return C16255.m38225(m43965());
        }
        if (!m43947()) {
            return C16255.m38225(m43965());
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                C2851 c2851 = (C2851) this.f60067.get(str);
                if (c2851 == null) {
                    return C16255.m38225(false);
                }
                try {
                    C22706 c22706 = new C22706();
                    m43943(c2851, c22706, c12953, (C9907) null);
                    return new C16255(c22706.toString(), true, false);
                } catch (Exception unused) {
                    m43970();
                    return C16255.m38225(true);
                }
            }
            return C16255.m38225(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16255 m43959(String str, C22706 c22706, C12953 c12953, C9907 c9907) throws Throwable {
        if (m43956()) {
            return C16255.m38225(m43965());
        }
        if (!m43947()) {
            return C16255.m38225(m43965());
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                C2851 c2851 = (C2851) this.f60067.get(str);
                if (c2851 == null) {
                    return C16255.m38225(false);
                }
                try {
                    m43943(c2851, c22706, c12953, c9907);
                    return new C16255(null, true, false);
                } catch (Exception unused) {
                    c22706.m50718();
                    return C16255.m38225(true);
                }
            }
            return C16255.m38225(false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC7084 m43963(String str) {
        if (!m43947()) {
            return EnumC7084.UNAVAILABLE;
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                if (this.f60067.containsKey(str)) {
                    return EnumC7084.OFFSET;
                }
                if (this.f60070.contains(str)) {
                    return EnumC7084.FAILURE;
                }
                return EnumC7084.MISS;
            }
            return EnumC7084.UNAVAILABLE;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43966(String str, C12953 c12953) {
        if (m43947()) {
            synchronized (this.f60068) {
                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                    if (c12953.m31520()) {
                        return m43961(str);
                    }
                    try {
                        c12953.m31514();
                        synchronized (this.f60079) {
                            synchronized (this.f60068) {
                                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                    try {
                                        if (this.f60074 == null) {
                                            this.f60076.m36508();
                                            this.f60074 = new C24017(this);
                                        }
                                        C2851 c2851M52858 = this.f60074.m52858(str, c12953);
                                        synchronized (this.f60068) {
                                            if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                                this.f60067.put(str, c2851M52858);
                                                this.f60070.remove(str);
                                                return true;
                                            }
                                            return false;
                                        }
                                    } catch (IOException unused) {
                                        m43948();
                                    }
                                }
                                return false;
                            }
                        }
                    } catch (IOException unused2) {
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43961(String str) {
        if (m43947()) {
            synchronized (this.f60068) {
                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                    synchronized (this.f60079) {
                        synchronized (this.f60068) {
                            if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                                try {
                                    if (this.f60074 == null) {
                                        this.f60076.m36508();
                                        this.f60074 = new C24017(this);
                                    }
                                    this.f60074.m52860(str);
                                    synchronized (this.f60068) {
                                        if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                            this.f60070.add(str);
                                            return true;
                                        }
                                        return false;
                                    }
                                } catch (IOException unused) {
                                    m43948();
                                }
                            }
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m43969() {
        synchronized (this.f60068) {
            if (this.f60087 && !this.f60075) {
                m43948();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43962(ArrayList arrayList) {
        boolean z = false;
        if (!m43947()) {
            return false;
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087 && this.f60083 && this.f60069 == arrayList.size() && m43939((List) arrayList).equals(this.f60077) && m43951((List) arrayList)) {
                z = true;
            }
            this.f60078 = z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43964(ArrayList arrayList) {
        if (m43947()) {
            synchronized (this.f60079) {
                try {
                    C24017 c24017 = this.f60074;
                    if (c24017 != null) {
                        c24017.m52859();
                        this.f60074 = null;
                    }
                    this.f60076.m36508();
                    String strM43939 = m43939((List) arrayList);
                    synchronized (this.f60068) {
                        try {
                            if (!this.f60075 && !this.f60087 && m43951((List) arrayList)) {
                                if (this.f60082.mo23120() && !this.f60082.mo23552()) {
                                    throw new IOException("Unable to delete stale complete temp file");
                                }
                                this.f60082.m36502(JSON.object().add("schemaVersion", 1).add("outputVersion", 1).add("candidateCount", arrayList.size()).add("candidateDigest", strM43939).toString().getBytes(StandardCharsets.UTF_8));
                                if (this.f60081.mo23120() && !this.f60081.mo23552()) {
                                    throw new IOException("Unable to replace complete file");
                                }
                                if (!this.f60082.mo23551(this.f60081)) {
                                    throw new IOException("Unable to publish complete file");
                                }
                                this.f60083 = true;
                                this.f60069 = arrayList.size();
                                this.f60077 = strM43939;
                                this.f60078 = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    C24017 c24018 = this.f60074;
                    if (c24018 != null) {
                        c24018.m52859();
                        this.f60074 = null;
                    }
                    AbstractC15440 abstractC15440 = this.f60082;
                    if (abstractC15440.mo23120()) {
                        abstractC15440.mo23552();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43960() {
        synchronized (this.f60079) {
            C24017 c24017 = this.f60074;
            if (c24017 != null) {
                c24017.m52859();
                this.f60074 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43970() {
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                this.f60087 = true;
                this.f60078 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43965() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60087;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m43968() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m43967() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075 || (this.f60071 && !this.f60087 && this.f60078);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m43951(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C17667) it.next()).f54033;
            if (!this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m43956() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075 || this.f60087;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m43947() {
        boolean z;
        C9201 c9201M43946;
        synchronized (this.f60068) {
            while (true) {
                z = false;
                if (!this.f60084) {
                    break;
                }
                try {
                    this.f60068.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            if (this.f60075) {
                return false;
            }
            if (this.f60071) {
                return !this.f60087;
            }
            this.f60084 = true;
            try {
                c9201M43946 = m43949();
            } catch (Exception unused2) {
                c9201M43946 = m43946();
            }
            C9201 c9201 = c9201M43946;
            synchronized (this.f60068) {
                this.f60084 = false;
                if (c9201.f27883) {
                    this.f60075 = true;
                    this.f60087 = false;
                    this.f60071 = true;
                    m43957();
                } else {
                    this.f60067 = c9201.f27880;
                    this.f60070 = c9201.f27882;
                    this.f60083 = c9201.f27881;
                    this.f60069 = c9201.f27878;
                    this.f60077 = c9201.f27879;
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60078 = false;
                }
                this.f60068.notifyAll();
                if (!this.f60075 && !this.f60087) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C9201 m43949() {
        C21196 c21196M48142;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        SparseLongArray sparseLongArray = new SparseLongArray();
        try {
            if (!C12248.m29747(this.f60076)) {
                m43952();
                return new C9201(false, map, hashSet, C21196.m48142());
            }
            m43944(this.f60072, true, map, sparseLongArray);
            m43944(this.f60085, false, map, sparseLongArray);
            m43942(hashSet);
            AbstractC15440 abstractC15440 = this.f60082;
            boolean zMo23120 = abstractC15440.mo23120();
            AbstractC15440 abstractC15441 = this.f60081;
            if (zMo23120) {
                abstractC15440.mo23552();
                if (abstractC15441.mo23120()) {
                    abstractC15441.mo23552();
                }
                c21196M48142 = C21196.m48142();
            } else if (!abstractC15441.mo23120()) {
                c21196M48142 = C21196.m48142();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(new String(abstractC15441.m36506(), StandardCharsets.UTF_8));
                    if (jSONObject.getInt("schemaVersion", -1) != 1 || jSONObject.getInt("outputVersion", -1) != 1) {
                        abstractC15441.mo23552();
                        c21196M48142 = C21196.m48142();
                    } else {
                        int i = jSONObject.getInt("candidateCount", -1);
                        String string = jSONObject.getString("candidateDigest", null);
                        if (i < 0 || string == null || string.isEmpty()) {
                            abstractC15441.mo23552();
                            c21196M48142 = C21196.m48142();
                        } else {
                            c21196M48142 = new C21196(i, string, true);
                        }
                    }
                } catch (Exception unused) {
                    abstractC15441.mo23552();
                    c21196M48142 = C21196.m48142();
                }
            }
            return new C9201(false, map, hashSet, c21196M48142);
        } catch (IOException unused2) {
            return m43946();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C9201 m43946() {
        try {
            m43952();
            return new C9201(false, new HashMap(), new HashSet(), C21196.m48142());
        } catch (IOException unused) {
            return new C9201(true, new HashMap(), new HashSet(), C21196.m48142());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43944(AbstractC15440 abstractC15440, boolean z, HashMap map, SparseLongArray sparseLongArray) throws IOException {
        String str;
        if (abstractC15440.mo23120()) {
            byte[] bArrM36506 = abstractC15440.m36506();
            C4262 c4262 = new C4262(bArrM36506);
            try {
                DataInputStream dataInputStream = new DataInputStream(c4262);
                while (c4262.position() < bArrM36506.length) {
                    try {
                        if (z) {
                            str = dataInputStream.readUTF();
                        } else {
                            int i = dataInputStream.readInt();
                            if (i < 0 || i > 1048576) {
                                throw new IOException("Invalid smali record name length");
                            }
                            byte[] bArr = new byte[i];
                            dataInputStream.readFully(bArr);
                            str = new String(bArr, StandardCharsets.UTF_8);
                        }
                        int unsignedShort = dataInputStream.readUnsignedShort();
                        int i2 = dataInputStream.readInt();
                        int i3 = dataInputStream.readInt();
                        m43941(unsignedShort, i2, i3, sparseLongArray);
                        map.put(str, new C2851(unsignedShort, i2, i3));
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali offset record", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43942(HashSet hashSet) throws IOException {
        AbstractC15440 abstractC15440 = this.f60080;
        if (abstractC15440.mo23120()) {
            byte[] bArrM36506 = abstractC15440.m36506();
            C4262 c4262 = new C4262(bArrM36506);
            try {
                DataInputStream dataInputStream = new DataInputStream(c4262);
                while (c4262.position() < bArrM36506.length) {
                    try {
                        hashSet.add(C12248.m29745(dataInputStream));
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali failure record", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43941(int i, int i2, int i3, SparseLongArray sparseLongArray) throws IOException {
        long jMo23127;
        if (i2 < 0 || i3 <= 0) {
            throw new IOException("Invalid smali cache offset");
        }
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jMo23127 = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            AbstractC15440 abstractC15440M36526 = this.f60076.m36526(String.valueOf(i));
            if (!abstractC15440M36526.mo23119()) {
                throw new IOException("Missing smali cache data file");
            }
            jMo23127 = abstractC15440M36526.mo23127();
            sparseLongArray.put(i, jMo23127);
        }
        if (((long) i2) + ((long) i3) > jMo23127) {
            throw new IOException("Smali cache offset exceeds data file");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[Catch: all -> 0x00a3, DONT_GENERATE, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x001d, B:13:0x0020, B:16:0x002a, B:17:0x002d), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x001d, B:13:0x0020, B:16:0x002a, B:17:0x002d), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:0: B:3:0x0002->B:49:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x000e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0047 A[EDGE_INSN: B:60:0x0047->B:27:0x0047 BREAK  A[LOOP:0: B:3:0x0002->B:49:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43943(C2851 c2851, C22706 c22706, C12953 c12953, C9907 c9907) throws Throwable {
        Reference reference;
        byte[] bArr;
        byte[] bArrM43945;
        int i = c2851.f9102;
        while (true) {
            if (c9907 != null) {
                bArrM43945 = c9907.m25014(i);
                if (bArrM43945 == null) {
                    synchronized (this.f60073) {
                        reference = (Reference) this.f60086.get(Integer.valueOf(i));
                        if (reference == null) {
                            bArrM43945 = null;
                        } else {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                c9907.m25013(i, bArr);
                            }
                            bArrM43945 = bArr;
                        }
                        if (bArrM43945 == null) {
                            break;
                            break;
                        }
                        if (c9907 == null) {
                            bArrM43945 = m43945(i, (C9907) null);
                            break;
                        } else {
                            if (C9907.m25011(c9907, i, false)) {
                                bArrM43945 = m43945(i, c9907);
                                C9907.m25009(i, c9907);
                                break;
                            }
                            C9907.m25012(i, c9907);
                        }
                    }
                } else {
                    break;
                }
            } else {
                synchronized (this.f60073) {
                    reference = (Reference) this.f60086.get(Integer.valueOf(i));
                    if (reference == null) {
                        bArrM43945 = null;
                    } else {
                        bArr = (byte[]) reference.get();
                        if (bArr != null && c9907 != null) {
                            c9907.m25013(i, bArr);
                        }
                        bArrM43945 = bArr;
                    }
                }
                if (bArrM43945 == null) {
                    break;
                }
                if (c9907 == null) {
                    bArrM43945 = m43945(i, (C9907) null);
                    break;
                }
                if (C9907.m25011(c9907, i, false)) {
                    try {
                        bArrM43945 = m43945(i, c9907);
                        C9907.m25009(i, c9907);
                        break;
                    } catch (Throwable th) {
                        C9907.m25009(i, c9907);
                        throw th;
                    }
                }
                C9907.m25012(i, c9907);
            }
        }
        if (c9907 != null && ((long) c2851.f9104) + ((long) c2851.f9103) > bArrM43945.length) {
            int i2 = c2851.f9102;
            do {
                if (C9907.m25011(c9907, i2, true)) {
                    try {
                        bArrM43945 = m43945(i2, c9907);
                        C9907.m25009(i2, c9907);
                        break;
                    } catch (Throwable th2) {
                        C9907.m25009(i2, c9907);
                        throw th2;
                    }
                }
                C9907.m25012(i2, c9907);
                bArrM43945 = c9907.m25014(i2);
            } while (bArrM43945 == null);
        }
        int i3 = c2851.f9104;
        int i4 = c2851.f9103;
        if (((long) i3) + ((long) i4) > bArrM43945.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        c12953.m31515(i3, i4, bArrM43945);
        C5773.m16239(c12953.m31517(), c12953.m31521(), c22706);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m43948() {
        synchronized (this.f60079) {
            try {
                m43952();
                synchronized (this.f60068) {
                    m43957();
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60075 = false;
                }
            } catch (IOException unused) {
                synchronized (this.f60068) {
                    m43957();
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60075 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m43957() {
        this.f60067 = new HashMap();
        this.f60070 = new HashSet();
        this.f60083 = false;
        this.f60078 = false;
        this.f60069 = -1;
        this.f60077 = null;
        synchronized (this.f60073) {
            this.f60086.clear();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m43952() throws IOException {
        C24017 c24017 = this.f60074;
        if (c24017 != null) {
            c24017.m52859();
            this.f60074 = null;
        }
        synchronized (this.f60073) {
            this.f60086.clear();
        }
        if (this.f60076.mo23120()) {
            for (AbstractC15440 abstractC15440 : this.f60076.mo23549(true)) {
                if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C12248.m29750(this.f60076);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m43940(C19079 c19079, int i) {
        return c19079.f60076.m36526(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m43945(int i, C9907 c9907) throws IOException {
        byte[] bArrM36506 = this.f60076.m36526(String.valueOf(i)).m36506();
        synchronized (this.f60073) {
            this.f60086.put(Integer.valueOf(i), new SoftReference(bArrM36506));
        }
        if (c9907 != null) {
            C9907.m25010(c9907);
            c9907.m25013(i, bArrM36506);
        }
        return bArrM36506;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43939(List list) {
        try {
            MessageDigest messageDigestM34534 = C14460.m34534();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((C17667) it.next()).f54033.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                messageDigestM34534.update(new byte[]{(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)});
                messageDigestM34534.update(bytes);
            }
            return C14460.m34531(messageDigestM34534.digest());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
