package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13576 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f40496;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f40497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f40498;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40499;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f40500;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f40501;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Bundle f40503;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40506;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f40507;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f40502 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f40504 = FutureC3575.m10905(null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22749 m32649(int i, CharSequence charSequence, C6417 c6417) {
        int i2 = this.f40499;
        this.f40499 = i2 + 1;
        if (i2 == 0) {
            this.f40504 = new FutureC3575();
        }
        return new C22749(this, i, charSequence, c6417);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32651() {
        return this.f40499 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32652(int i) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f40496;
            if (i2 >= zArr.length) {
                return false;
            }
            if (i2 != i && zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized Bundle m32653() {
        return new Bundle(this.f40503);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m32655() {
        return this.f40504.m10921((InterfaceC21423) new C5368());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C23077 m32657() {
        return new C23077(0, this.f40500, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized String m32658() {
        return this.f40497;
    }

    public C13576(InterfaceC20758 interfaceC20758, String str, List list, boolean[] zArr, Bundle bundle, int i, int i2, String str2) {
        this.f40498 = interfaceC20758;
        this.f40501 = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f40507 = C20195.unmodifiableList(arrayList);
        this.f40496 = zArr;
        this.f40503 = new Bundle(bundle);
        this.f40505 = i;
        this.f40500 = i2;
        this.f40497 = str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m32654(int i) {
        if (i < 0 || i >= this.f40507.size()) {
            throw new IndexOutOfBoundsException("Invalid text page index");
        }
        return this.f40498.resolve(this.f40501).resolve(Integer.toString(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32656() {
        return this.f40507.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m32648(C6417 c6417, int i, InterfaceC17066 interfaceC17066) {
        int i2;
        synchronized (this) {
            i2 = this.f40505;
        }
        return m32647(i2, c6417, i, interfaceC17066, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13576 m32640(InterfaceC20758 interfaceC20758) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("app-pages");
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(interfaceC20758Resolve, enumC14406)) {
            throw new IOException("Invalid text page directory");
        }
        long size = C17229.size(interfaceC20758Resolve);
        if (size < 40 || size > 2097152) {
            throw new IOException("Invalid text page directory length");
        }
        int i = (int) size;
        byte[] bArr = new byte[i];
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758Resolve, enumC14406);
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = inputStreamNewInputStream.read(bArr, i2, i - i2);
                if (i3 <= 0) {
                    throw new IOException("Truncated text page directory");
                }
                i2 += i3;
            } catch (Throwable th) {
                if (inputStreamNewInputStream == null) {
                    throw th;
                }
                try {
                    inputStreamNewInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Trailing text page directory data");
        }
        inputStreamNewInputStream.close();
        try {
            C12951 c12951 = new C12951(bArr);
            CRC32 crc32 = new CRC32();
            int i4 = i - 4;
            crc32.update(bArr, 0, i4);
            c12951.seek(i4);
            if (c12951.readInt() != ((int) crc32.getValue())) {
                throw new IOException("Invalid text page directory checksum");
            }
            c12951.seek(0L);
            if (c12951.readInt() != 827344709 || c12951.readInt() != 1) {
                throw new IOException("Unsupported text page directory");
            }
            String str = "pages-" + new UUID(c12951.readLong(), c12951.readLong());
            int i5 = c12951.readInt();
            int i6 = c12951.readInt();
            int i7 = c12951.readInt();
            int i8 = c12951.readInt();
            if (i5 < 1 || i5 > (i - 40) / 17 || i6 < 0 || i6 >= i5 || i8 < 0 || i8 > 2) {
                throw new IOException("Invalid text page directory fields");
            }
            C14776.m35151(i7);
            ArrayList arrayList = new ArrayList(i5);
            boolean[] zArr = new boolean[i5];
            for (int i9 = 0; i9 < i5; i9++) {
                arrayList = arrayList;
                arrayList.add(new UUID(c12951.readLong(), c12951.readLong()));
                zArr[i9] = c12951.m31498();
            }
            int i10 = c12951.readInt();
            if (i10 >= 0) {
                long j = i10;
                if (j == c12951.available() - 4) {
                    byte[] bArr2 = new byte[i10];
                    c12951.m31489(i10, bArr2);
                    return new C13576(interfaceC20758, str, arrayList, zArr, C19222.m44352(2097152, j, new ByteArrayInputStream(bArr2)).m44358(), i6, i7, i8 == 1 ? "\r" : i8 == 2 ? "\r\n" : "\n");
                }
            }
            throw new IOException("Invalid text page configuration length");
        } catch (RuntimeException e) {
            throw new IOException("Invalid text page directory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m32645() {
        Bundle bundle;
        boolean[] zArr;
        int i;
        int i2;
        String str;
        synchronized (this.f40502) {
            synchronized (this) {
                bundle = new Bundle(this.f40503);
                zArr = (boolean[]) this.f40496.clone();
                i = this.f40505;
                i2 = this.f40500;
                str = this.f40497;
            }
            C10130 c10130 = new C10130();
            UUID uuidFromString = UUID.fromString(this.f40501.substring(6));
            c10130.writeInt(827344709);
            c10130.writeInt(1);
            c10130.m25431(uuidFromString.getMostSignificantBits());
            c10130.m25431(uuidFromString.getLeastSignificantBits());
            c10130.writeInt(this.f40507.size());
            c10130.writeInt(i);
            c10130.writeInt(i2);
            c10130.writeInt("\r".equals(str) ? 1 : "\r\n".equals(str) ? 2 : 0);
            for (int i3 = 0; i3 < this.f40507.size(); i3++) {
                UUID uuid = (UUID) this.f40507.get(i3);
                c10130.m25431(uuid.getMostSignificantBits());
                c10130.m25431(uuid.getLeastSignificantBits());
                c10130.m25425(zArr[i3]);
            }
            c10130.m25434(C19222.m44353(2097152, bundle).m44356(2097152));
            if (c10130.size() > 2097148) {
                throw new IOException("Text page directory exceeds limit");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(c10130.m25438(), 0, c10130.size());
            c10130.writeInt((int) crc32.getValue());
            InterfaceC20758 interfaceC20758Resolve = this.f40498.resolve("app-pages.tmp");
            if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
                C10050.m25231(interfaceC20758Resolve);
                C17229.delete(interfaceC20758Resolve);
            }
            C2994.m9133(interfaceC20758Resolve, c10130.m25444());
            C17229.move(interfaceC20758Resolve, this.f40498.resolve("app-pages"), EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
            this.f40506 = true;
            InterfaceC23015.f74090.mo28630(this.f40498);
            C9240.m23681(this.f40498, bundle);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32650(int i, Bundle bundle, boolean z, int i2, String str) {
        synchronized (this.f40502) {
            synchronized (this) {
                this.f40500 = i2;
                this.f40497 = str;
                this.f40496[i] = z;
                this.f40503 = new Bundle(bundle);
                boolean z2 = false;
                for (boolean z3 : this.f40496) {
                    z2 |= z3;
                }
                this.f40503.putBoolean("changed", z2);
            }
            m32645();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m32647(int i, C6417 c6417, int i2, InterfaceC17066 interfaceC17066, boolean z) throws Throwable {
        C11915 c11915M29053 = C11915.m29053(m32654(i), c6417.f19851, c6417.f19853, c6417.f19852, i2, interfaceC17066, (String) null);
        try {
            if (!((UUID) this.f40507.get(i)).equals(c11915M29053.f35630.mo1601().m52352())) {
                throw new IOException("Text page identity changed");
            }
            c11915M29053.m29077(this, i, i2);
            if (!z) {
                return c11915M29053;
            }
            synchronized (this.f40502) {
                synchronized (this) {
                    if (this.f40499 != 0) {
                        throw new IOException("Text document is being read");
                    }
                    this.f40505 = i;
                }
                m32645();
            }
            return c11915M29053;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c11915M29053.m29068().m10930();
            } catch (Throwable th) {
                e.addSuppressed(th);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7744 m32646(int i, C6417 c6417) {
        C17371 c17371M52316 = C23721.m52316(m32654(i), c6417.f19851, c6417.f19853);
        try {
            if (!((UUID) this.f40507.get(i)).equals(c17371M52316.m40711())) {
                throw new IOException("Text page identity changed");
            }
            C7744 c7744M20753 = C7744.m20753(c17371M52316.m40714());
            c17371M52316.close();
            return c7744M20753;
        } catch (Throwable th) {
            try {
                c17371M52316.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04f2 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0507 */
    /* JADX WARN: Code duplicated, block: B:131:0x0357  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:258:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ۨ᩵ᩳ] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4, types: [l.۬ܶᩳ] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11915 m32634(C11915 c11915, InterfaceC20758 interfaceC20758, AbstractC3322 abstractC3322, int i, C6417 c6417, InterfaceC17066 interfaceC17066, long j) throws Throwable {
        C13576 c13576;
        ?? r13;
        Throwable th;
        Object obj;
        ?? r14;
        C5377 c5377;
        Object obj2;
        C13576 c13577;
        Object obj3;
        InterfaceC20758 interfaceC20759;
        Object obj4;
        Throwable th2;
        C13576 c13578;
        C13199 c13199;
        C13199 c131910;
        C13199 c131911;
        C11915 c11916;
        C11915 c11917;
        C13199 c131912;
        C13576 c13579;
        Object obj5;
        C13199 c131913;
        int i2;
        C7953 c7953;
        C4342 c4342;
        C11915 c11918;
        StringBuilder sb;
        boolean z;
        long j2;
        char[] cArr;
        int i3;
        C13199 c131914;
        C11915 c11919;
        int i4;
        InterfaceC17066 interfaceC17067;
        C7953 c7954;
        char[] cArr2;
        C4342 c4343;
        int length;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        int iMin;
        int i9;
        long length2;
        C11915 c119110;
        ArrayList arrayList;
        long j3;
        int iM14642 = c11915.f35630.mo1601().m52359().m14642();
        C13576 c135710 = c11915.f35628;
        boolean z2 = c135710 != null && c135710.f40507.size() > 1;
        C13576 c135711 = c11915.f35628;
        InterfaceC20758 interfaceC207510 = c135711 == null ? interfaceC20758 : c135711.f40498;
        Bundle bundleM44358 = c11915.f35623.f31452.f19337.m44358();
        int i10 = bundleM44358.getInt("textPageSize", 50000000);
        int iMax = Math.max(4, i10 > 0 ? Math.min(i10, 2147352575) : 2147352575);
        int iMin2 = Math.min(65536, Math.max(1, iMax / 100));
        int i11 = iMax - iMin2;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC20758 interfaceC20758Resolve = interfaceC207510.resolve(str);
        C17229.createDirectory(interfaceC20758Resolve, new InterfaceC22168[0]);
        ArrayList arrayList2 = new ArrayList();
        try {
            C13199 c13199M28845 = C11789.m28845(new C4838(abstractC3322), c6417.f19851, i, interfaceC17066);
            try {
                C7953 c7955 = c13199M28845.f39468;
                int i12 = iMin2 * 2;
                int i13 = iM14642;
                C5377 c5377M3921 = c6417.f19851.m3921((((long) (i12 + a.g)) * 2) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
                try {
                    char[] cArr3 = new char[32768];
                    int i14 = i12 + 2;
                    StringBuilder sb2 = new StringBuilder(i14);
                    C23077 c23077 = new C23077(0, c13199M28845.f39467, false, 0, null, null, null);
                    c5377 = c5377M3921;
                    try {
                        bundleM44358.putBoolean("e2SourcePending", false);
                        bundleM44358.putBoolean("changed", false);
                        bundleM44358.putBoolean(d.O, false);
                        try {
                            bundleM44358.putLong("fileTime", ((C4733) abstractC3322).f15019.mo23117());
                            bundleM44358.putBoolean("checkFileExists", true);
                            InterfaceC17066 interfaceC17068 = interfaceC17066;
                            long j4 = j;
                            C13199 c131915 = c13199M28845;
                            int i15 = i14;
                            int i16 = i12;
                            boolean z3 = false;
                            int i17 = -1;
                            InterfaceC20758 interfaceC207511 = interfaceC207510;
                            int i18 = iMax;
                            String str2 = str;
                            StringBuilder sb3 = sb2;
                            int i19 = iMin2;
                            InterfaceC20758 interfaceC207512 = interfaceC20758Resolve;
                            char[] cArr4 = cArr3;
                            ArrayList arrayList3 = arrayList2;
                            c13578 = null;
                            long j5 = 0;
                            int i20 = i11;
                            C6417 c6418 = c6417;
                            boolean z4 = z2;
                            C7953 c7956 = c7955;
                            Bundle bundle = bundleM44358;
                            int i21 = 0;
                            while (true) {
                                try {
                                    m32636(interfaceC17068);
                                    long j6 = j5;
                                    C11915 c11915M29054 = C11915.m29054(interfaceC207512.resolve(Integer.toString(arrayList3.size())), c6418);
                                    C4342 c4344 = c11915M29054.f35630;
                                    C6417 c6419 = c6418;
                                    try {
                                        while (true) {
                                            try {
                                                interfaceC20759 = interfaceC207512;
                                                if (c4344.length() >= i20) {
                                                    i2 = i15;
                                                    c7953 = c7956;
                                                    c4342 = c4344;
                                                    c11918 = c11915M29054;
                                                    sb = sb3;
                                                    z = z3;
                                                    j2 = j6;
                                                    cArr = cArr4;
                                                    i3 = i20;
                                                    break;
                                                }
                                                try {
                                                    m32636(interfaceC17068);
                                                    int i22 = i20;
                                                    int iMin3 = Math.min(i20 - c4344.length(), 32768);
                                                    if (sb3.length() != 0) {
                                                        int iMin4 = Math.min(iMin3, sb3.length());
                                                        c11915M29054.m29073(0, iMin4, sb3);
                                                        sb3.delete(0, iMin4);
                                                    } else {
                                                        int i23 = c7956.read(cArr4, 0, iMin3);
                                                        if (i23 < 0) {
                                                            i3 = i22;
                                                            sb = sb3;
                                                            z = true;
                                                            c7953 = c7956;
                                                            cArr = cArr4;
                                                            c11918 = c11915M29054;
                                                            j2 = j6;
                                                            c4342 = c4344;
                                                            i2 = i15;
                                                            break;
                                                        }
                                                        if (i23 == 0) {
                                                            throw new IOException("Text input made invalid progress");
                                                        }
                                                        c11915M29054.m29073(0, i23, CharBuffer.wrap(cArr4, 0, i23));
                                                        interfaceC20759 = interfaceC20759;
                                                        c13576 = c13578;
                                                        obj4 = c11919;
                                                        c5377 = c5377;
                                                        obj3 = c131914;
                                                        th2 = th;
                                                        c5377.close();
                                                        throw th2;
                                                    }
                                                    i20 = i22;
                                                    interfaceC207512 = interfaceC20759;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c11919 = c11915M29054;
                                                    c131914 = c131915;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                interfaceC20759 = interfaceC207512;
                                                c11916 = c11915M29054;
                                                c131911 = c131915;
                                            }
                                        }
                                        while (true) {
                                            if (z) {
                                                c11915 = c11915;
                                                break;
                                            }
                                            c11915 = c11915;
                                            try {
                                                if (sb.length() >= i2) {
                                                    break;
                                                }
                                                m32636(interfaceC17068);
                                                i2 = i2;
                                                int i24 = c7953.read(cArr, 0, Math.min(32768, i2 - sb.length()));
                                                if (i24 < 0) {
                                                    z = true;
                                                    i21 = i21;
                                                    c7953 = c7953;
                                                    cArr = cArr;
                                                    c11918 = c11918;
                                                    j2 = j2;
                                                    c4342 = c4342;
                                                } else {
                                                    if (i24 == 0) {
                                                        throw new IOException("Text input made invalid progress");
                                                    }
                                                    sb.append(cArr, 0, i24);
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                c11919 = c11918;
                                                c5377 = c5377;
                                                c131914 = c131915;
                                                interfaceC20759 = interfaceC20759;
                                                c13576 = c13578;
                                                obj4 = c11919;
                                                c5377 = c5377;
                                                obj3 = c131914;
                                            }
                                            th2 = th;
                                            c5377.close();
                                            throw th2;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (z) {
                                                            c7954 = c7953;
                                                            cArr2 = cArr;
                                                            c4343 = c4342;
                                                            interfaceC17067 = interfaceC17068;
                                                            if (((long) c4342.length()) + ((long) sb.length()) <= ((long) i18) + ((long) i19)) {
                                                                length = sb.length();
                                                                i5 = i18;
                                                                i6 = i16;
                                                            }
                                                            c11918.m29073(0, length, sb);
                                                            sb.delete(0, length);
                                                            if (j4 >= j2) {
                                                                try {
                                                                    if (j4 >= ((long) c4343.length()) + j2 || (z && sb.length() == 0)) {
                                                                        int size = arrayList3.size();
                                                                        iMin = (int) Math.min(j4 - j2, c4343.length());
                                                                        i21 = size;
                                                                        i9 = iMin;
                                                                    } else {
                                                                        i9 = 0;
                                                                        i21 = i21;
                                                                        iMin = i17;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    c13576 = c13578;
                                                                    obj4 = c11918;
                                                                    obj3 = c131915;
                                                                    th2 = th;
                                                                    c5377.close();
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                i9 = 0;
                                                                i21 = i21;
                                                                iMin = i17;
                                                            }
                                                            length2 = j2 + ((long) c4343.length());
                                                            c119110 = c11915;
                                                            bundle = bundle;
                                                            c11918.m29076(c119110.f35623.f31452, new Bundle(bundle), c23077, c7954.m21263(), c6419, interfaceC17067, i9);
                                                            arrayList = arrayList3;
                                                            arrayList.add(c4343.mo1601().m52352());
                                                            j3 = j4;
                                                            c11918.m29069(c4343.mo1601().m52371()).m10930();
                                                            if (arrayList.size() <= 65536) {
                                                                throw new IOException("Too many text pages");
                                                            }
                                                            if (!z && sb.length() == 0) {
                                                                String strM21263 = c7954.m21263();
                                                                c131915.close();
                                                                m32636(interfaceC17067);
                                                                C13199 c131916 = c131915;
                                                                c13579 = new C13576(interfaceC207511, str2, arrayList, new boolean[arrayList.size()], bundle, i21, c131916.f39467, strM21263);
                                                                try {
                                                                    c13579.m32645();
                                                                    c119110.m29068().m10930();
                                                                    C13576 c135712 = c119110.f35628;
                                                                    if (c135712 != null) {
                                                                        try {
                                                                            m32637(c135712.f40498.resolve(c135712.f40501));
                                                                        } catch (IOException unused) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        c5377.close();
                                                                        try {
                                                                            c131916.close();
                                                                            if (!c13579.f40506) {
                                                                                m32637(interfaceC20759);
                                                                            }
                                                                            C11915 c11915M32648 = c13579.m32648(c6419, 8388608, interfaceC17067);
                                                                            if (!z4 && c13579.f40507.size() <= 1) {
                                                                                return c11915M32648;
                                                                            }
                                                                            c11915M32648.f35619 = iMin;
                                                                            c11915M32648.f35626 = i21 == c119110.f35631 && iMin == i13;
                                                                            return c11915M32648;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            c13576 = c13579;
                                                                            r13 = c13578;
                                                                            interfaceC20758Resolve = interfaceC20759;
                                                                            if (r13 != 0) {
                                                                                r13.m29068().m10930();
                                                                            }
                                                                            if (c13576 == null || !c13576.f40506) {
                                                                                m32637(interfaceC20758Resolve);
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        c13576 = c13579;
                                                                        Object obj6 = c131916;
                                                                        Object obj7 = c13578;
                                                                        interfaceC20758Resolve = interfaceC20759;
                                                                        th = th;
                                                                        obj = obj7;
                                                                        r14 = obj6;
                                                                        try {
                                                                            r14.close();
                                                                            throw th;
                                                                        } catch (Throwable th9) {
                                                                            th.addSuppressed(th9);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    c131913 = c131916;
                                                                    obj5 = c13578;
                                                                    obj4 = obj5;
                                                                    c13576 = c13579;
                                                                    obj3 = c131913;
                                                                    th2 = th;
                                                                    c5377.close();
                                                                    throw th2;
                                                                }
                                                            }
                                                            j4 = j3;
                                                            c11915 = c119110;
                                                            i17 = iMin;
                                                            z4 = z4;
                                                            c13578 = c13578;
                                                            i20 = i3;
                                                            c5377 = c5377;
                                                            z3 = z;
                                                            c23077 = c23077;
                                                            interfaceC207511 = interfaceC207511;
                                                            str2 = str2;
                                                            i15 = i4;
                                                            cArr4 = cArr2;
                                                            i16 = i6;
                                                            i13 = i13;
                                                            c131915 = c131915;
                                                            interfaceC17068 = interfaceC17067;
                                                            c6418 = c6419;
                                                            sb3 = sb;
                                                            c7956 = c7954;
                                                            i18 = i5;
                                                            i19 = i19;
                                                            arrayList3 = arrayList;
                                                            j5 = length2;
                                                            interfaceC207512 = interfaceC20759;
                                                            obj3 = obj2;
                                                            c5377 = c5377;
                                                            interfaceC20759 = interfaceC20758Resolve;
                                                            c13576 = c13577;
                                                            obj4 = c13576;
                                                            th2 = th;
                                                            c5377.close();
                                                            throw th2;
                                                        }
                                                        interfaceC17067 = interfaceC17068;
                                                        c7954 = c7953;
                                                        cArr2 = cArr;
                                                        c4343 = c4342;
                                                        if (arrayList.size() <= 65536) {
                                                            throw new IOException("Too many text pages");
                                                        }
                                                        if (!z) {
                                                        }
                                                        j4 = j3;
                                                        c11915 = c119110;
                                                        i17 = iMin;
                                                        z4 = z4;
                                                        c13578 = c13578;
                                                        i20 = i3;
                                                        c5377 = c5377;
                                                        z3 = z;
                                                        c23077 = c23077;
                                                        interfaceC207511 = interfaceC207511;
                                                        str2 = str2;
                                                        i15 = i4;
                                                        cArr4 = cArr2;
                                                        i16 = i6;
                                                        i13 = i13;
                                                        c131915 = c131915;
                                                        interfaceC17068 = interfaceC17067;
                                                        c6418 = c6419;
                                                        sb3 = sb;
                                                        c7956 = c7954;
                                                        i18 = i5;
                                                        i19 = i19;
                                                        arrayList3 = arrayList;
                                                        j5 = length2;
                                                        interfaceC207512 = interfaceC20759;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        obj2 = interfaceC17068;
                                                        c13577 = c13578;
                                                        c5377 = c5377;
                                                        interfaceC20758Resolve = interfaceC20759;
                                                        obj3 = obj2;
                                                        c5377 = c5377;
                                                        interfaceC20759 = interfaceC20758Resolve;
                                                        c13576 = c13577;
                                                        obj4 = c13576;
                                                        th2 = th;
                                                        c5377.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    c131910 = c131915;
                                                    interfaceC20758Resolve = interfaceC20759;
                                                    c13199 = c131910;
                                                    C13199 c131917 = c13199;
                                                    c13577 = c13578;
                                                    obj2 = c131917;
                                                }
                                                c11918.m29076(c119110.f35623.f31452, new Bundle(bundle), c23077, c7954.m21263(), c6419, interfaceC17067, i9);
                                                arrayList = arrayList3;
                                                arrayList.add(c4343.mo1601().m52352());
                                                j3 = j4;
                                                c11918.m29069(c4343.mo1601().m52371()).m10930();
                                            } catch (Throwable th13) {
                                                th = th13;
                                                c131912 = c131915;
                                                c11917 = c11918;
                                                c13579 = c13578;
                                                obj5 = c11917;
                                                c131913 = c131912;
                                                obj4 = obj5;
                                                c13576 = c13579;
                                                obj3 = c131913;
                                                th2 = th;
                                                c5377.close();
                                                throw th2;
                                            }
                                            c11918.m29073(0, length, sb);
                                            sb.delete(0, length);
                                            if (j4 >= j2) {
                                                if (j4 >= ((long) c4343.length()) + j2) {
                                                }
                                                int size2 = arrayList3.size();
                                                iMin = (int) Math.min(j4 - j2, c4343.length());
                                                i21 = size2;
                                                i9 = iMin;
                                            } else {
                                                i9 = 0;
                                                i21 = i21;
                                                iMin = i17;
                                            }
                                            length2 = j2 + ((long) c4343.length());
                                            c119110 = c11915;
                                            bundle = bundle;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            c131911 = c131915;
                                            c11916 = c11918;
                                            c5377 = c5377;
                                            interfaceC20759 = interfaceC20759;
                                            c11917 = c11916;
                                            c5377 = c5377;
                                            c131912 = c131911;
                                            c13579 = c13578;
                                            obj5 = c11917;
                                            c131913 = c131912;
                                            obj4 = obj5;
                                            c13576 = c13579;
                                            obj3 = c131913;
                                            th2 = th;
                                            c5377.close();
                                            throw th2;
                                        }
                                        c5377.close();
                                        throw th2;
                                    } catch (Throwable th15) {
                                        th2.addSuppressed(th15);
                                        throw th2;
                                    }
                                    i4 = i2;
                                    length = -1;
                                    char c2 = 65535;
                                    int i25 = Integer.MAX_VALUE;
                                    int i26 = 1;
                                    while (i26 < sb.length() && i26 <= i16) {
                                        try {
                                            char cCharAt = sb.charAt(i26 - 1);
                                            char cCharAt2 = sb.charAt(i26);
                                            if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                                                i7 = i18;
                                                i8 = i16;
                                            } else {
                                                i7 = i18;
                                                i8 = i16;
                                                if (cCharAt != '\r' || cCharAt2 != '\n') {
                                                    if (cCharAt == '\n' || cCharAt == '\r') {
                                                        c = 0;
                                                    } else if ("。！？!?；;".indexOf(cCharAt) >= 0 || (cCharAt == '.' && Character.isWhitespace(cCharAt2) && (i26 < 2 || !Character.isDigit(sb.charAt(i26 - 2))))) {
                                                        c = 1;
                                                    } else if ("，,、：:".indexOf(cCharAt) >= 0) {
                                                        c = 2;
                                                    } else {
                                                        c = (cCharAt == ' ' || cCharAt == '\t') ? (char) 3 : (char) 4;
                                                    }
                                                    int iAbs = Math.abs(i26 - i19);
                                                    if (c < c2 || (c == c2 && iAbs < i25)) {
                                                        c2 = c;
                                                        i25 = iAbs;
                                                        length = i26;
                                                    }
                                                }
                                            }
                                            i26++;
                                            i18 = i7;
                                            i16 = i8;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            c131912 = c131915;
                                            c11917 = c11918;
                                            c13579 = c13578;
                                            obj5 = c11917;
                                            c131913 = c131912;
                                            obj4 = obj5;
                                            c13576 = c13579;
                                            obj3 = c131913;
                                            th2 = th;
                                            c5377.close();
                                            throw th2;
                                        }
                                    }
                                    i5 = i18;
                                    i6 = i16;
                                    if (length < 0) {
                                        length = sb.length();
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    interfaceC20759 = interfaceC207512;
                                    c131910 = c131915;
                                }
                                obj3 = obj2;
                                c5377 = c5377;
                                interfaceC20759 = interfaceC20758Resolve;
                                c13576 = c13577;
                                obj4 = c13576;
                                th2 = th;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            c5377 = c5377;
                            c13578 = null;
                            c13199 = c13199M28845;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        obj2 = c13199M28845;
                        c5377 = c5377;
                        c13577 = null;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c5377 = c5377M3921;
                }
            } catch (Throwable th21) {
                th = th21;
                c13576 = null;
                obj = null;
                r14 = c13199M28845;
            }
        } catch (Throwable th22) {
            th = th22;
            c13576 = null;
            r13 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11915 m32633(C11915 c11915, C4733 c4733, boolean z, C11273 c11273, C6417 c6417, InterfaceC17066 interfaceC17066, long j) throws Throwable {
        InterfaceC20758 interfaceC20758;
        C13576 c13576;
        C11915 c11916;
        InterfaceC20758 interfaceC20759 = c11915.f35628.f40498;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC20758 interfaceC20758Resolve = interfaceC20759.resolve(str);
        C17229.createDirectory(interfaceC20758Resolve, new InterfaceC22168[0]);
        C11915 c11917 = null;
        try {
            C11915 c11915M29054 = C11915.m29054(interfaceC20758Resolve.resolve("0"), c6417);
            C4342 c4342 = c11915M29054.f35630;
            int i = 0;
            while (true) {
                try {
                    CharSequence charSequence = c11273.f33779;
                    if (i >= charSequence.length()) {
                        break;
                    }
                    m32636(interfaceC17066);
                    int iMin = (int) Math.min(((long) i) + X931RNG.BLOCK64_RESEED_MAX, charSequence.length());
                    c11915M29054.m29073(i, iMin, charSequence);
                    i = iMin;
                } catch (Throwable th) {
                    th = th;
                    c11916 = c11915M29054;
                }
                interfaceC20758 = interfaceC20758Resolve;
                c13576 = null;
                c11917 = c11916;
                if (c11917 != null) {
                    c11917.m29068().m10930();
                }
                if (c13576 == null || !c13576.f40506) {
                    m32637(interfaceC20758);
                }
                throw th;
            }
            Bundle bundleM44358 = c11915.f35623.f31452.f19337.m44358();
            bundleM44358.putBoolean("e2SourcePending", false);
            bundleM44358.putBoolean("changed", false);
            bundleM44358.putBoolean(d.O, false);
            if (!z) {
                bundleM44358.putLong("fileTime", c4733.f15019.mo23117());
                bundleM44358.putBoolean("checkFileExists", true);
            }
            int iMin2 = (int) Math.min(Math.max(0L, j), c4342.length());
            c11916 = c11915M29054;
            try {
                c11915M29054.m29076(c11915.f35623.f31452, bundleM44358, c11273.f33778, c11273.f33776, c6417, interfaceC17066, iMin2);
                UUID uuidM52352 = c4342.mo1601().m52352();
                c11916.m29069(c4342.mo1601().m52371()).m10930();
                m32636(interfaceC17066);
                Object[] objArr = {uuidM52352};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C11003.requireNonNull(obj);
                arrayList.add(obj);
                interfaceC20758 = interfaceC20758Resolve;
                try {
                    c13576 = new C13576(interfaceC20759, str, C20195.unmodifiableList(arrayList), new boolean[1], bundleM44358, 0, c11273.f33778.f74223, c11273.f33776);
                    try {
                        c13576.m32645();
                        c11915.m29068().m10930();
                        C13576 c13577 = c11915.f35628;
                        c13577.getClass();
                        try {
                            m32637(c13577.f40498.resolve(c13577.f40501));
                        } catch (IOException unused) {
                        }
                        C11915 c11915M32648 = c13576.m32648(c6417, 8388608, interfaceC17066);
                        c11915M32648.f35619 = (j < 0 || c11915.f35628.f40507.size() == 1) ? -1 : iMin2;
                        if (!c13576.f40506) {
                            m32637(interfaceC20758);
                        }
                        return c11915M32648;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c13576 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                interfaceC20758 = interfaceC20758Resolve;
                c13576 = null;
                c11917 = c11916;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC20758 = interfaceC20758Resolve;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32637(InterfaceC20758 interfaceC20758) {
        InterfaceC17664 interfaceC17664Walk = C17229.walk(interfaceC20758, new EnumC10880[0]);
        try {
            Iterator it = interfaceC17664Walk.sorted(C8200.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C17229.delete((InterfaceC20758) it.next());
            }
            interfaceC17664Walk.close();
        } catch (Throwable th) {
            if (interfaceC17664Walk != null) {
                try {
                    interfaceC17664Walk.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32636(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Text pagination is canceled");
        }
    }
}
