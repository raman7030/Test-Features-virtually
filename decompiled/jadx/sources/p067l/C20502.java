package p067l;

import android.util.SparseLongArray;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
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
public final class C20502 {

    /* JADX INFO: renamed from: ۘ */
    public boolean f63305;

    /* JADX INFO: renamed from: ۚ */
    public final AbstractC17043 f63306;

    /* JADX INFO: renamed from: ۠ */
    public C25195 f63308;

    /* JADX INFO: renamed from: ۡ */
    public boolean f63309;

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC17043 f63310;

    /* JADX INFO: renamed from: ۧ */
    public String f63311;

    /* JADX INFO: renamed from: ܳ */
    public boolean f63312;

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC17043 f63314;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f63315;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17043 f63316;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f63317;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f63318;

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC17043 f63319;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f63321;

    /* JADX INFO: renamed from: ֨ */
    public final Object f63302 = new Object();

    /* JADX INFO: renamed from: ܶ */
    public final Object f63313 = new Object();

    /* JADX INFO: renamed from: ۜ */
    public final Object f63307 = new Object();

    /* JADX INFO: renamed from: ᩷ */
    public final HashMap f63320 = new HashMap();

    /* JADX INFO: renamed from: ֡ */
    public HashMap f63301 = new HashMap();

    /* JADX INFO: renamed from: ۖ */
    public HashSet f63304 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public int f63303 = -1;

    public C20502(AbstractC17043 abstractC17043) {
        this.f63310 = abstractC17043;
        this.f63306 = abstractC17043.m38684("x");
        this.f63319 = abstractC17043.m38684("y");
        this.f63314 = abstractC17043.m38684("f");
        this.f63315 = abstractC17043.m38684("complete.json");
        this.f63316 = abstractC17043.m38684("complete.json.tmp");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17818 m46252(String str, C14679 c14679) throws Throwable {
        if (m46250()) {
            return C17818.m40439(m46259());
        }
        if (!m46241()) {
            return C17818.m40439(m46259());
        }
        synchronized (this.f63302) {
            if (!this.f63309 && !this.f63321) {
                C5079 c5079 = (C5079) this.f63301.get(str);
                if (c5079 == null) {
                    return C17818.m40439(false);
                }
                try {
                    C23948 c23948 = new C23948();
                    m46237(c5079, c23948, c14679, (C11785) null);
                    return new C17818(c23948.toString(), true, false);
                } catch (Exception unused) {
                    m46264();
                    return C17818.m40439(true);
                }
            }
            return C17818.m40439(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17818 m46253(String str, C23948 c23948, C14679 c14679, C11785 c11785) throws Throwable {
        if (m46250()) {
            return C17818.m40439(m46259());
        }
        if (!m46241()) {
            return C17818.m40439(m46259());
        }
        synchronized (this.f63302) {
            if (!this.f63309 && !this.f63321) {
                C5079 c5079 = (C5079) this.f63301.get(str);
                if (c5079 == null) {
                    return C17818.m40439(false);
                }
                try {
                    m46237(c5079, c23948, c14679, c11785);
                    return new C17818(null, true, false);
                } catch (Exception unused) {
                    c23948.m53044();
                    return C17818.m40439(true);
                }
            }
            return C17818.m40439(false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC9102 m46257(String str) {
        if (!m46241()) {
            return EnumC9102.UNAVAILABLE;
        }
        synchronized (this.f63302) {
            if (!this.f63309 && !this.f63321) {
                if (this.f63301.containsKey(str)) {
                    return EnumC9102.OFFSET;
                }
                if (this.f63304.contains(str)) {
                    return EnumC9102.FAILURE;
                }
                return EnumC9102.MISS;
            }
            return EnumC9102.UNAVAILABLE;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46260(String str, C14679 c14679) {
        if (m46241()) {
            synchronized (this.f63302) {
                if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str)) {
                    if (c14679.m33607()) {
                        return m46255(str);
                    }
                    try {
                        c14679.m33601();
                        synchronized (this.f63313) {
                            synchronized (this.f63302) {
                                if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str)) {
                                    try {
                                        if (this.f63308 == null) {
                                            this.f63310.m38666();
                                            this.f63308 = new C25195(this);
                                        }
                                        C5079 c5079M55264 = this.f63308.m55264(str, c14679);
                                        synchronized (this.f63302) {
                                            if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str)) {
                                                this.f63301.put(str, c5079M55264);
                                                this.f63304.remove(str);
                                                return true;
                                            }
                                            return false;
                                        }
                                    } catch (IOException unused) {
                                        m46242();
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46255(String str) {
        if (m46241()) {
            synchronized (this.f63302) {
                if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str) && !this.f63304.contains(str)) {
                    synchronized (this.f63313) {
                        synchronized (this.f63302) {
                            if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str) && !this.f63304.contains(str)) {
                                try {
                                    if (this.f63308 == null) {
                                        this.f63310.m38666();
                                        this.f63308 = new C25195(this);
                                    }
                                    this.f63308.m55266(str);
                                    synchronized (this.f63302) {
                                        if (!this.f63309 && !this.f63321 && !this.f63301.containsKey(str)) {
                                            this.f63304.add(str);
                                            return true;
                                        }
                                        return false;
                                    }
                                } catch (IOException unused) {
                                    m46242();
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

    /* JADX INFO: renamed from: ܿ */
    public final void m46263() {
        synchronized (this.f63302) {
            if (this.f63321 && !this.f63309) {
                m46242();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46256(ArrayList arrayList) {
        boolean z = false;
        if (!m46241()) {
            return false;
        }
        synchronized (this.f63302) {
            if (!this.f63309 && !this.f63321 && this.f63317 && this.f63303 == arrayList.size() && m46233((List) arrayList).equals(this.f63311) && m46245((List) arrayList)) {
                z = true;
            }
            this.f63312 = z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46258(ArrayList arrayList) {
        if (m46241()) {
            synchronized (this.f63313) {
                try {
                    C25195 c25195 = this.f63308;
                    if (c25195 != null) {
                        c25195.m55265();
                        this.f63308 = null;
                    }
                    this.f63310.m38666();
                    String strM46233 = m46233((List) arrayList);
                    synchronized (this.f63302) {
                        try {
                            if (!this.f63309 && !this.f63321 && m46245((List) arrayList)) {
                                if (this.f63316.mo25094() && !this.f63316.mo25503()) {
                                    throw new IOException("Unable to delete stale complete temp file");
                                }
                                this.f63316.m38660(JSON.object().add("schemaVersion", 1).add("outputVersion", 1).add("candidateCount", arrayList.size()).add("candidateDigest", strM46233).toString().getBytes(StandardCharsets.UTF_8));
                                if (this.f63315.mo25094() && !this.f63315.mo25503()) {
                                    throw new IOException("Unable to replace complete file");
                                }
                                if (!this.f63316.mo25502(this.f63315)) {
                                    throw new IOException("Unable to publish complete file");
                                }
                                this.f63317 = true;
                                this.f63303 = arrayList.size();
                                this.f63311 = strM46233;
                                this.f63312 = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    C25195 c25196 = this.f63308;
                    if (c25196 != null) {
                        c25196.m55265();
                        this.f63308 = null;
                    }
                    AbstractC17043 abstractC17043 = this.f63316;
                    if (abstractC17043.mo25094()) {
                        abstractC17043.mo25503();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46254() {
        synchronized (this.f63313) {
            C25195 c25195 = this.f63308;
            if (c25195 != null) {
                c25195.m55265();
                this.f63308 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46264() {
        synchronized (this.f63302) {
            if (!this.f63309 && !this.f63321) {
                this.f63321 = true;
                this.f63312 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46259() {
        boolean z;
        synchronized (this.f63302) {
            z = this.f63321;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m46262() {
        boolean z;
        synchronized (this.f63302) {
            z = this.f63309;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m46261() {
        boolean z;
        synchronized (this.f63302) {
            z = this.f63309 || (this.f63305 && !this.f63321 && this.f63312);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m46245(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C19160) it.next()).f57226;
            if (!this.f63301.containsKey(str) && !this.f63304.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m46250() {
        boolean z;
        synchronized (this.f63302) {
            z = this.f63309 || this.f63321;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m46241() {
        boolean z;
        C11114 c11114M46240;
        synchronized (this.f63302) {
            while (true) {
                z = false;
                if (!this.f63318) {
                    break;
                }
                try {
                    this.f63302.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            if (this.f63309) {
                return false;
            }
            if (this.f63305) {
                return !this.f63321;
            }
            this.f63318 = true;
            try {
                c11114M46240 = m46243();
            } catch (Exception unused2) {
                c11114M46240 = m46240();
            }
            C11114 c11114 = c11114M46240;
            synchronized (this.f63302) {
                this.f63318 = false;
                if (c11114.f30829) {
                    this.f63309 = true;
                    this.f63321 = false;
                    this.f63305 = true;
                    m46251();
                } else {
                    this.f63301 = c11114.f30826;
                    this.f63304 = c11114.f30828;
                    this.f63317 = c11114.f30827;
                    this.f63303 = c11114.f30824;
                    this.f63311 = c11114.f30825;
                    this.f63305 = true;
                    this.f63321 = false;
                    this.f63312 = false;
                }
                this.f63302.notifyAll();
                if (!this.f63309 && !this.f63321) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private C11114 m46243() {
        C22514 c22514M50473;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        SparseLongArray sparseLongArray = new SparseLongArray();
        try {
            if (!C14009.m31809(this.f63310)) {
                m46246();
                return new C11114(false, map, hashSet, C22514.m50473());
            }
            m46238(this.f63306, true, map, sparseLongArray);
            m46238(this.f63319, false, map, sparseLongArray);
            m46236(hashSet);
            AbstractC17043 abstractC17043 = this.f63316;
            boolean zMo25094 = abstractC17043.mo25094();
            AbstractC17043 abstractC17044 = this.f63315;
            if (zMo25094) {
                abstractC17043.mo25503();
                if (abstractC17044.mo25094()) {
                    abstractC17044.mo25503();
                }
                c22514M50473 = C22514.m50473();
            } else if (!abstractC17044.mo25094()) {
                c22514M50473 = C22514.m50473();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(new String(abstractC17044.m38664(), StandardCharsets.UTF_8));
                    if (jSONObject.getInt("schemaVersion", -1) != 1 || jSONObject.getInt("outputVersion", -1) != 1) {
                        abstractC17044.mo25503();
                        c22514M50473 = C22514.m50473();
                    } else {
                        int i = jSONObject.getInt("candidateCount", -1);
                        String string = jSONObject.getString("candidateDigest", null);
                        if (i < 0 || string == null || string.isEmpty()) {
                            abstractC17044.mo25503();
                            c22514M50473 = C22514.m50473();
                        } else {
                            c22514M50473 = new C22514(i, string, true);
                        }
                    }
                } catch (Exception unused) {
                    abstractC17044.mo25503();
                    c22514M50473 = C22514.m50473();
                }
            }
            return new C11114(false, map, hashSet, c22514M50473);
        } catch (IOException unused2) {
            return m46240();
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private C11114 m46240() {
        try {
            m46246();
            return new C11114(false, new HashMap(), new HashSet(), C22514.m50473());
        } catch (IOException unused) {
            return new C11114(true, new HashMap(), new HashSet(), C22514.m50473());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46238(AbstractC17043 abstractC17043, boolean z, HashMap map, SparseLongArray sparseLongArray) throws IOException {
        String str;
        if (abstractC17043.mo25094()) {
            byte[] bArrM38664 = abstractC17043.m38664();
            C6420 c6420 = new C6420(bArrM38664);
            try {
                DataInputStream dataInputStream = new DataInputStream(c6420);
                while (c6420.position() < bArrM38664.length) {
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
                        m46235(unsignedShort, i2, i3, sparseLongArray);
                        map.put(str, new C5079(unsignedShort, i2, i3));
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

    /* JADX INFO: renamed from: ֫ */
    private void m46236(HashSet hashSet) throws IOException {
        AbstractC17043 abstractC17043 = this.f63314;
        if (abstractC17043.mo25094()) {
            byte[] bArrM38664 = abstractC17043.m38664();
            C6420 c6420 = new C6420(bArrM38664);
            try {
                DataInputStream dataInputStream = new DataInputStream(c6420);
                while (c6420.position() < bArrM38664.length) {
                    try {
                        hashSet.add(C14009.m31807(dataInputStream));
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

    /* JADX INFO: renamed from: ֫ */
    private void m46235(int i, int i2, int i3, SparseLongArray sparseLongArray) throws IOException {
        long jMo25101;
        if (i2 < 0 || i3 <= 0) {
            throw new IOException("Invalid smali cache offset");
        }
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jMo25101 = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            AbstractC17043 abstractC17043M38684 = this.f63310.m38684(String.valueOf(i));
            if (!abstractC17043M38684.mo25093()) {
                throw new IOException("Missing smali cache data file");
            }
            jMo25101 = abstractC17043M38684.mo25101();
            sparseLongArray.put(i, jMo25101);
        }
        if (((long) i2) + ((long) i3) > jMo25101) {
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
    /* JADX INFO: renamed from: ֫ */
    private void m46237(C5079 c5079, C23948 c23948, C14679 c14679, C11785 c11785) throws Throwable {
        Reference reference;
        byte[] bArr;
        byte[] bArrM46239;
        int i = c5079.f11902;
        while (true) {
            if (c11785 != null) {
                bArrM46239 = c11785.m27031(i);
                if (bArrM46239 == null) {
                    synchronized (this.f63307) {
                        reference = (Reference) this.f63320.get(Integer.valueOf(i));
                        if (reference == null) {
                            bArrM46239 = null;
                        } else {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                c11785.m27030(i, bArr);
                            }
                            bArrM46239 = bArr;
                        }
                        if (bArrM46239 == null) {
                            break;
                            break;
                        }
                        if (c11785 == null) {
                            bArrM46239 = m46239(i, (C11785) null);
                            break;
                        } else {
                            if (C11785.m27028(c11785, i, false)) {
                                bArrM46239 = m46239(i, c11785);
                                C11785.m27026(i, c11785);
                                break;
                            }
                            C11785.m27029(i, c11785);
                        }
                    }
                } else {
                    break;
                }
            } else {
                synchronized (this.f63307) {
                    reference = (Reference) this.f63320.get(Integer.valueOf(i));
                    if (reference == null) {
                        bArrM46239 = null;
                    } else {
                        bArr = (byte[]) reference.get();
                        if (bArr != null && c11785 != null) {
                            c11785.m27030(i, bArr);
                        }
                        bArrM46239 = bArr;
                    }
                }
                if (bArrM46239 == null) {
                    break;
                }
                if (c11785 == null) {
                    bArrM46239 = m46239(i, (C11785) null);
                    break;
                }
                if (C11785.m27028(c11785, i, false)) {
                    try {
                        bArrM46239 = m46239(i, c11785);
                        C11785.m27026(i, c11785);
                        break;
                    } catch (Throwable th) {
                        C11785.m27026(i, c11785);
                        throw th;
                    }
                }
                C11785.m27029(i, c11785);
            }
        }
        if (c11785 != null && ((long) c5079.f11904) + ((long) c5079.f11903) > bArrM46239.length) {
            int i2 = c5079.f11902;
            do {
                if (C11785.m27028(c11785, i2, true)) {
                    try {
                        bArrM46239 = m46239(i2, c11785);
                        C11785.m27026(i2, c11785);
                        break;
                    } catch (Throwable th2) {
                        C11785.m27026(i2, c11785);
                        throw th2;
                    }
                }
                C11785.m27029(i2, c11785);
                bArrM46239 = c11785.m27031(i2);
            } while (bArrM46239 == null);
        }
        int i3 = c5079.f11904;
        int i4 = c5079.f11903;
        if (((long) i3) + ((long) i4) > bArrM46239.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        c14679.m33602(i3, i4, bArrM46239);
        C7855.m18158(c14679.m33604(), c14679.m33608(), c23948);
    }

    /* JADX INFO: renamed from: ۡ */
    private void m46242() {
        synchronized (this.f63313) {
            try {
                m46246();
                synchronized (this.f63302) {
                    m46251();
                    this.f63305 = true;
                    this.f63321 = false;
                    this.f63309 = false;
                }
            } catch (IOException unused) {
                synchronized (this.f63302) {
                    m46251();
                    this.f63305 = true;
                    this.f63321 = false;
                    this.f63309 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m46251() {
        this.f63301 = new HashMap();
        this.f63304 = new HashSet();
        this.f63317 = false;
        this.f63312 = false;
        this.f63303 = -1;
        this.f63311 = null;
        synchronized (this.f63307) {
            this.f63320.clear();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private void m46246() throws IOException {
        C25195 c25195 = this.f63308;
        if (c25195 != null) {
            c25195.m55265();
            this.f63308 = null;
        }
        synchronized (this.f63307) {
            this.f63320.clear();
        }
        if (this.f63310.mo25094()) {
            for (AbstractC17043 abstractC17043 : this.f63310.mo25500(true)) {
                if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C14009.m31812(this.f63310);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m46234(C20502 c20502, int i) {
        return c20502.f63310.m38684(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m46239(int i, C11785 c11785) throws IOException {
        byte[] bArrM38664 = this.f63310.m38684(String.valueOf(i)).m38664();
        synchronized (this.f63307) {
            this.f63320.put(Integer.valueOf(i), new SoftReference(bArrM38664));
        }
        if (c11785 != null) {
            C11785.m27027(c11785);
            c11785.m27030(i, bArrM38664);
        }
        return bArrM38664;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46233(List list) {
        try {
            MessageDigest messageDigestM36668 = C16111.m36668();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((C19160) it.next()).f57226.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                messageDigestM36668.update(new byte[]{(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)});
                messageDigestM36668.update(bytes);
            }
            return C16111.m36665(messageDigestM36668.digest());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
