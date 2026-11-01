package p067l;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.internal.C0771a;
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
public final class C15271 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] f43573;

    /* JADX INFO: renamed from: ۜ */
    public String f43574;

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC22097 f43575;

    /* JADX INFO: renamed from: ۢ */
    public int f43576;

    /* JADX INFO: renamed from: ۧ */
    public int f43577;

    /* JADX INFO: renamed from: ܳ */
    public final String f43578;

    /* JADX INFO: renamed from: ܽ */
    public Bundle f43580;

    /* JADX INFO: renamed from: ᩳ */
    public int f43582;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f43583;

    /* JADX INFO: renamed from: ᩻ */
    public final List f43584;

    /* JADX INFO: renamed from: ܺ */
    public final Object f43579 = new Object();

    /* JADX INFO: renamed from: ܿ */
    public FutureC5767 f43581 = FutureC5767.m12882(null);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C23989 m34761(int i, CharSequence charSequence, C8467 c8467) {
        int i2 = this.f43576;
        this.f43576 = i2 + 1;
        if (i2 == 0) {
            this.f43581 = new FutureC5767();
        }
        return new C23989(this, i, charSequence, c8467);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m34763() {
        return this.f43576 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m34764(int i) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f43573;
            if (i2 >= zArr.length) {
                return false;
            }
            if (i2 != i && zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized Bundle m34765() {
        return new Bundle(this.f43580);
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized FutureC5767 m34767() {
        return this.f43581.m12898((InterfaceC22729) new C7470());
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized C24301 m34769() {
        return new C24301(0, this.f43577, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized String m34770() {
        return this.f43574;
    }

    public C15271(InterfaceC22097 interfaceC22097, String str, List list, boolean[] zArr, Bundle bundle, int i, int i2, String str2) {
        this.f43575 = interfaceC22097;
        this.f43578 = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f43584 = C21562.unmodifiableList(arrayList);
        this.f43573 = zArr;
        this.f43580 = new Bundle(bundle);
        this.f43582 = i;
        this.f43577 = i2;
        this.f43574 = str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22097 m34766(int i) {
        if (i < 0 || i >= this.f43584.size()) {
            throw new IndexOutOfBoundsException("Invalid text page index");
        }
        return this.f43575.resolve(this.f43578).resolve(Integer.toString(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34768() {
        return this.f43584.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13693 m34760(C8467 c8467, int i, InterfaceC18588 interfaceC18588) {
        int i2;
        synchronized (this) {
            i2 = this.f43582;
        }
        return m34759(i2, c8467, i, interfaceC18588, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15271 m34752(InterfaceC22097 interfaceC22097) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("app-pages");
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.isRegularFile(interfaceC22097Resolve, enumC16060)) {
            throw new IOException("Invalid text page directory");
        }
        long size = C18743.size(interfaceC22097Resolve);
        if (size < 40 || size > 2097152) {
            throw new IOException("Invalid text page directory length");
        }
        int i = (int) size;
        byte[] bArr = new byte[i];
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097Resolve, enumC16060);
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
            C14677 c14677 = new C14677(bArr);
            CRC32 crc32 = new CRC32();
            int i4 = i - 4;
            crc32.update(bArr, 0, i4);
            c14677.seek(i4);
            if (c14677.readInt() != ((int) crc32.getValue())) {
                throw new IOException("Invalid text page directory checksum");
            }
            c14677.seek(0L);
            if (c14677.readInt() != 827344709 || c14677.readInt() != 1) {
                throw new IOException("Unsupported text page directory");
            }
            String str = "pages-" + new UUID(c14677.readLong(), c14677.readLong());
            int i5 = c14677.readInt();
            int i6 = c14677.readInt();
            int i7 = c14677.readInt();
            int i8 = c14677.readInt();
            if (i5 < 1 || i5 > (i - 40) / 17 || i6 < 0 || i6 >= i5 || i8 < 0 || i8 > 2) {
                throw new IOException("Invalid text page directory fields");
            }
            C16412.m37298(i7);
            ArrayList arrayList = new ArrayList(i5);
            boolean[] zArr = new boolean[i5];
            for (int i9 = 0; i9 < i5; i9++) {
                arrayList = arrayList;
                arrayList.add(new UUID(c14677.readLong(), c14677.readLong()));
                zArr[i9] = c14677.m33585();
            }
            int i10 = c14677.readInt();
            if (i10 >= 0) {
                long j = i10;
                if (j == c14677.available() - 4) {
                    byte[] bArr2 = new byte[i10];
                    c14677.m33576(i10, bArr2);
                    return new C15271(interfaceC22097, str, arrayList, zArr, C20637.m46646(2097152, j, new ByteArrayInputStream(bArr2)).m46652(), i6, i7, i8 == 1 ? "\r" : i8 == 2 ? "\r\n" : "\n");
                }
            }
            throw new IOException("Invalid text page configuration length");
        } catch (RuntimeException e) {
            throw new IOException("Invalid text page directory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m34757() {
        Bundle bundle;
        boolean[] zArr;
        int i;
        int i2;
        String str;
        synchronized (this.f43579) {
            synchronized (this) {
                bundle = new Bundle(this.f43580);
                zArr = (boolean[]) this.f43573.clone();
                i = this.f43582;
                i2 = this.f43577;
                str = this.f43574;
            }
            C11996 c11996 = new C11996();
            UUID uuidFromString = UUID.fromString(this.f43578.substring(6));
            c11996.writeInt(827344709);
            c11996.writeInt(1);
            c11996.m27451(uuidFromString.getMostSignificantBits());
            c11996.m27451(uuidFromString.getLeastSignificantBits());
            c11996.writeInt(this.f43584.size());
            c11996.writeInt(i);
            c11996.writeInt(i2);
            c11996.writeInt("\r".equals(str) ? 1 : "\r\n".equals(str) ? 2 : 0);
            for (int i3 = 0; i3 < this.f43584.size(); i3++) {
                UUID uuid = (UUID) this.f43584.get(i3);
                c11996.m27451(uuid.getMostSignificantBits());
                c11996.m27451(uuid.getLeastSignificantBits());
                c11996.m27445(zArr[i3]);
            }
            c11996.m27454(C20637.m46647(2097152, bundle).m46650(2097152));
            if (c11996.size() > 2097148) {
                throw new IOException("Text page directory exceeds limit");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(c11996.m27458(), 0, c11996.size());
            c11996.writeInt((int) crc32.getValue());
            InterfaceC22097 interfaceC22097Resolve = this.f43575.resolve("app-pages.tmp");
            if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
                C11920.m27248(interfaceC22097Resolve);
                C18743.delete(interfaceC22097Resolve);
            }
            C5214.m11184(interfaceC22097Resolve, c11996.m27464());
            C18743.move(interfaceC22097Resolve, this.f43575.resolve("app-pages"), EnumC4662.ATOMIC_MOVE, EnumC4662.REPLACE_EXISTING);
            this.f43583 = true;
            InterfaceC24242.f76829.mo30678(this.f43575);
            C11150.m25681(this.f43575, bundle);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34762(int i, Bundle bundle, boolean z, int i2, String str) {
        synchronized (this.f43579) {
            synchronized (this) {
                this.f43577 = i2;
                this.f43574 = str;
                this.f43573[i] = z;
                this.f43580 = new Bundle(bundle);
                boolean z2 = false;
                for (boolean z3 : this.f43573) {
                    z2 |= z3;
                }
                this.f43580.putBoolean("changed", z2);
            }
            m34757();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13693 m34759(int i, C8467 c8467, int i2, InterfaceC18588 interfaceC18588, boolean z) throws Throwable {
        C13693 c13693M31105 = C13693.m31105(m34766(i), c8467.f22723, c8467.f22725, c8467.f22724, i2, interfaceC18588, (String) null);
        try {
            if (!((UUID) this.f43584.get(i)).equals(c13693M31105.f38639.mo3999().m54755())) {
                throw new IOException("Text page identity changed");
            }
            c13693M31105.m31129(this, i, i2);
            if (!z) {
                return c13693M31105;
            }
            synchronized (this.f43579) {
                synchronized (this) {
                    if (this.f43576 != 0) {
                        throw new IOException("Text document is being read");
                    }
                    this.f43582 = i;
                }
                m34757();
            }
            return c13693M31105;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c13693M31105.m31120().m12907();
            } catch (Throwable th) {
                e.addSuppressed(th);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9729 m34758(int i, C8467 c8467) {
        C18878 c18878M54719 = C24913.m54719(m34766(i), c8467.f22723, c8467.f22725);
        try {
            if (!((UUID) this.f43584.get(i)).equals(c18878M54719.m42962())) {
                throw new IOException("Text page identity changed");
            }
            C9729 c9729M22733 = C9729.m22733(c18878M54719.m42965());
            c18878M54719.close();
            return c9729M22733;
        } catch (Throwable th) {
            try {
                c18878M54719.close();
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13693 m34746(C13693 c13693, InterfaceC22097 interfaceC22097, AbstractC5526 abstractC5526, int i, C8467 c8467, InterfaceC18588 interfaceC18588, long j) throws Throwable {
        C15271 c15271;
        ?? r13;
        Throwable th;
        Object obj;
        ?? r14;
        C7479 c7479;
        Object obj2;
        C15271 c15272;
        Object obj3;
        InterfaceC22097 interfaceC22098;
        Object obj4;
        Throwable th2;
        C15271 c15273;
        C14913 c14913;
        C14913 c14914;
        C14913 c14915;
        C13693 c13694;
        C13693 c13695;
        C14913 c14916;
        C15271 c15274;
        Object obj5;
        C14913 c14917;
        int i2;
        C9927 c9927;
        C6495 c6495;
        C13693 c13696;
        StringBuilder sb;
        boolean z;
        long j2;
        char[] cArr;
        int i3;
        C14913 c14918;
        C13693 c13697;
        int i4;
        InterfaceC18588 interfaceC18589;
        C9927 c9928;
        char[] cArr2;
        C6495 c6496;
        int length;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        int iMin;
        int i9;
        long length2;
        C13693 c13698;
        ArrayList arrayList;
        long j3;
        int iM16550 = c13693.f38639.mo3999().m54762().m16550();
        C15271 c15275 = c13693.f38637;
        boolean z2 = c15275 != null && c15275.f43584.size() > 1;
        C15271 c15276 = c13693.f38637;
        InterfaceC22097 interfaceC22099 = c15276 == null ? interfaceC22097 : c15276.f43575;
        Bundle bundleM46652 = c13693.f38632.f34416.f22201.m46652();
        int i10 = bundleM46652.getInt("textPageSize", 50000000);
        int iMax = Math.max(4, i10 > 0 ? Math.min(i10, 2147352575) : 2147352575);
        int iMin2 = Math.min(65536, Math.max(1, iMax / 100));
        int i11 = iMax - iMin2;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC22097 interfaceC22097Resolve = interfaceC22099.resolve(str);
        C18743.createDirectory(interfaceC22097Resolve, new InterfaceC23437[0]);
        ArrayList arrayList2 = new ArrayList();
        try {
            C14913 c14913M30894 = C13573.m30894(new C6967(abstractC5526), c8467.f22723, i, interfaceC18588);
            try {
                C9927 c9929 = c14913M30894.f42532;
                int i12 = iMin2 * 2;
                int i13 = iM16550;
                C7479 c7479M6162 = c8467.f22723.m6162((((long) (i12 + C0771a.f3222g)) * 2) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
                try {
                    char[] cArr3 = new char[32768];
                    int i14 = i12 + 2;
                    StringBuilder sb2 = new StringBuilder(i14);
                    C24301 c24301 = new C24301(0, c14913M30894.f42531, false, 0, null, null, null);
                    c7479 = c7479M6162;
                    try {
                        bundleM46652.putBoolean("e2SourcePending", false);
                        bundleM46652.putBoolean("changed", false);
                        bundleM46652.putBoolean(C0708d.f2599O, false);
                        try {
                            bundleM46652.putLong("fileTime", ((C6867) abstractC5526).f17850.mo25091());
                            bundleM46652.putBoolean("checkFileExists", true);
                            InterfaceC18588 interfaceC185810 = interfaceC18588;
                            long j4 = j;
                            C14913 c14919 = c14913M30894;
                            int i15 = i14;
                            int i16 = i12;
                            boolean z3 = false;
                            int i17 = -1;
                            InterfaceC22097 interfaceC220910 = interfaceC22099;
                            int i18 = iMax;
                            String str2 = str;
                            StringBuilder sb3 = sb2;
                            int i19 = iMin2;
                            InterfaceC22097 interfaceC220911 = interfaceC22097Resolve;
                            char[] cArr4 = cArr3;
                            ArrayList arrayList3 = arrayList2;
                            c15273 = null;
                            long j5 = 0;
                            int i20 = i11;
                            C8467 c8468 = c8467;
                            boolean z4 = z2;
                            C9927 c99210 = c9929;
                            Bundle bundle = bundleM46652;
                            int i21 = 0;
                            while (true) {
                                try {
                                    m34748(interfaceC185810);
                                    long j6 = j5;
                                    C13693 c13693M31106 = C13693.m31106(interfaceC220911.resolve(Integer.toString(arrayList3.size())), c8468);
                                    C6495 c6497 = c13693M31106.f38639;
                                    C8467 c8469 = c8468;
                                    try {
                                        while (true) {
                                            try {
                                                interfaceC22098 = interfaceC220911;
                                                if (c6497.length() >= i20) {
                                                    i2 = i15;
                                                    c9927 = c99210;
                                                    c6495 = c6497;
                                                    c13696 = c13693M31106;
                                                    sb = sb3;
                                                    z = z3;
                                                    j2 = j6;
                                                    cArr = cArr4;
                                                    i3 = i20;
                                                    break;
                                                }
                                                try {
                                                    m34748(interfaceC185810);
                                                    int i22 = i20;
                                                    int iMin3 = Math.min(i20 - c6497.length(), 32768);
                                                    if (sb3.length() != 0) {
                                                        int iMin4 = Math.min(iMin3, sb3.length());
                                                        c13693M31106.m31125(0, iMin4, sb3);
                                                        sb3.delete(0, iMin4);
                                                    } else {
                                                        int i23 = c99210.read(cArr4, 0, iMin3);
                                                        if (i23 < 0) {
                                                            i3 = i22;
                                                            sb = sb3;
                                                            z = true;
                                                            c9927 = c99210;
                                                            cArr = cArr4;
                                                            c13696 = c13693M31106;
                                                            j2 = j6;
                                                            c6495 = c6497;
                                                            i2 = i15;
                                                            break;
                                                        }
                                                        if (i23 == 0) {
                                                            throw new IOException("Text input made invalid progress");
                                                        }
                                                        c13693M31106.m31125(0, i23, CharBuffer.wrap(cArr4, 0, i23));
                                                        interfaceC22098 = interfaceC22098;
                                                        c15271 = c15273;
                                                        obj4 = c13697;
                                                        c7479 = c7479;
                                                        obj3 = c14918;
                                                        th2 = th;
                                                        c7479.close();
                                                        throw th2;
                                                    }
                                                    i20 = i22;
                                                    interfaceC220911 = interfaceC22098;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c13697 = c13693M31106;
                                                    c14918 = c14919;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                interfaceC22098 = interfaceC220911;
                                                c13694 = c13693M31106;
                                                c14915 = c14919;
                                            }
                                        }
                                        while (true) {
                                            if (z) {
                                                c13693 = c13693;
                                                break;
                                            }
                                            c13693 = c13693;
                                            try {
                                                if (sb.length() >= i2) {
                                                    break;
                                                }
                                                m34748(interfaceC185810);
                                                i2 = i2;
                                                int i24 = c9927.read(cArr, 0, Math.min(32768, i2 - sb.length()));
                                                if (i24 < 0) {
                                                    z = true;
                                                    i21 = i21;
                                                    c9927 = c9927;
                                                    cArr = cArr;
                                                    c13696 = c13696;
                                                    j2 = j2;
                                                    c6495 = c6495;
                                                } else {
                                                    if (i24 == 0) {
                                                        throw new IOException("Text input made invalid progress");
                                                    }
                                                    sb.append(cArr, 0, i24);
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                c13697 = c13696;
                                                c7479 = c7479;
                                                c14918 = c14919;
                                                interfaceC22098 = interfaceC22098;
                                                c15271 = c15273;
                                                obj4 = c13697;
                                                c7479 = c7479;
                                                obj3 = c14918;
                                            }
                                            th2 = th;
                                            c7479.close();
                                            throw th2;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (z) {
                                                            c9928 = c9927;
                                                            cArr2 = cArr;
                                                            c6496 = c6495;
                                                            interfaceC18589 = interfaceC185810;
                                                            if (((long) c6495.length()) + ((long) sb.length()) <= ((long) i18) + ((long) i19)) {
                                                                length = sb.length();
                                                                i5 = i18;
                                                                i6 = i16;
                                                            }
                                                            c13696.m31125(0, length, sb);
                                                            sb.delete(0, length);
                                                            if (j4 >= j2) {
                                                                try {
                                                                    if (j4 >= ((long) c6496.length()) + j2 || (z && sb.length() == 0)) {
                                                                        int size = arrayList3.size();
                                                                        iMin = (int) Math.min(j4 - j2, c6496.length());
                                                                        i21 = size;
                                                                        i9 = iMin;
                                                                    } else {
                                                                        i9 = 0;
                                                                        i21 = i21;
                                                                        iMin = i17;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    c15271 = c15273;
                                                                    obj4 = c13696;
                                                                    obj3 = c14919;
                                                                    th2 = th;
                                                                    c7479.close();
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                i9 = 0;
                                                                i21 = i21;
                                                                iMin = i17;
                                                            }
                                                            length2 = j2 + ((long) c6496.length());
                                                            c13698 = c13693;
                                                            bundle = bundle;
                                                            c13696.m31128(c13698.f38632.f34416, new Bundle(bundle), c24301, c9928.m23229(), c8469, interfaceC18589, i9);
                                                            arrayList = arrayList3;
                                                            arrayList.add(c6496.mo3999().m54755());
                                                            j3 = j4;
                                                            c13696.m31121(c6496.mo3999().m54774()).m12907();
                                                            if (arrayList.size() <= 65536) {
                                                                throw new IOException("Too many text pages");
                                                            }
                                                            if (!z && sb.length() == 0) {
                                                                String strM23229 = c9928.m23229();
                                                                c14919.close();
                                                                m34748(interfaceC18589);
                                                                C14913 c149110 = c14919;
                                                                c15274 = new C15271(interfaceC220910, str2, arrayList, new boolean[arrayList.size()], bundle, i21, c149110.f42531, strM23229);
                                                                try {
                                                                    c15274.m34757();
                                                                    c13698.m31120().m12907();
                                                                    C15271 c15277 = c13698.f38637;
                                                                    if (c15277 != null) {
                                                                        try {
                                                                            m34749(c15277.f43575.resolve(c15277.f43578));
                                                                        } catch (IOException unused) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        c7479.close();
                                                                        try {
                                                                            c149110.close();
                                                                            if (!c15274.f43583) {
                                                                                m34749(interfaceC22098);
                                                                            }
                                                                            C13693 c13693M34760 = c15274.m34760(c8469, 8388608, interfaceC18589);
                                                                            if (!z4 && c15274.f43584.size() <= 1) {
                                                                                return c13693M34760;
                                                                            }
                                                                            c13693M34760.f38628 = iMin;
                                                                            c13693M34760.f38635 = i21 == c13698.f38640 && iMin == i13;
                                                                            return c13693M34760;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            c15271 = c15274;
                                                                            r13 = c15273;
                                                                            interfaceC22097Resolve = interfaceC22098;
                                                                            if (r13 != 0) {
                                                                                r13.m31120().m12907();
                                                                            }
                                                                            if (c15271 == null || !c15271.f43583) {
                                                                                m34749(interfaceC22097Resolve);
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        c15271 = c15274;
                                                                        Object obj6 = c149110;
                                                                        Object obj7 = c15273;
                                                                        interfaceC22097Resolve = interfaceC22098;
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
                                                                    c14917 = c149110;
                                                                    obj5 = c15273;
                                                                    obj4 = obj5;
                                                                    c15271 = c15274;
                                                                    obj3 = c14917;
                                                                    th2 = th;
                                                                    c7479.close();
                                                                    throw th2;
                                                                }
                                                            }
                                                            j4 = j3;
                                                            c13693 = c13698;
                                                            i17 = iMin;
                                                            z4 = z4;
                                                            c15273 = c15273;
                                                            i20 = i3;
                                                            c7479 = c7479;
                                                            z3 = z;
                                                            c24301 = c24301;
                                                            interfaceC220910 = interfaceC220910;
                                                            str2 = str2;
                                                            i15 = i4;
                                                            cArr4 = cArr2;
                                                            i16 = i6;
                                                            i13 = i13;
                                                            c14919 = c14919;
                                                            interfaceC185810 = interfaceC18589;
                                                            c8468 = c8469;
                                                            sb3 = sb;
                                                            c99210 = c9928;
                                                            i18 = i5;
                                                            i19 = i19;
                                                            arrayList3 = arrayList;
                                                            j5 = length2;
                                                            interfaceC220911 = interfaceC22098;
                                                            obj3 = obj2;
                                                            c7479 = c7479;
                                                            interfaceC22098 = interfaceC22097Resolve;
                                                            c15271 = c15272;
                                                            obj4 = c15271;
                                                            th2 = th;
                                                            c7479.close();
                                                            throw th2;
                                                        }
                                                        interfaceC18589 = interfaceC185810;
                                                        c9928 = c9927;
                                                        cArr2 = cArr;
                                                        c6496 = c6495;
                                                        if (arrayList.size() <= 65536) {
                                                            throw new IOException("Too many text pages");
                                                        }
                                                        if (!z) {
                                                        }
                                                        j4 = j3;
                                                        c13693 = c13698;
                                                        i17 = iMin;
                                                        z4 = z4;
                                                        c15273 = c15273;
                                                        i20 = i3;
                                                        c7479 = c7479;
                                                        z3 = z;
                                                        c24301 = c24301;
                                                        interfaceC220910 = interfaceC220910;
                                                        str2 = str2;
                                                        i15 = i4;
                                                        cArr4 = cArr2;
                                                        i16 = i6;
                                                        i13 = i13;
                                                        c14919 = c14919;
                                                        interfaceC185810 = interfaceC18589;
                                                        c8468 = c8469;
                                                        sb3 = sb;
                                                        c99210 = c9928;
                                                        i18 = i5;
                                                        i19 = i19;
                                                        arrayList3 = arrayList;
                                                        j5 = length2;
                                                        interfaceC220911 = interfaceC22098;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        obj2 = interfaceC185810;
                                                        c15272 = c15273;
                                                        c7479 = c7479;
                                                        interfaceC22097Resolve = interfaceC22098;
                                                        obj3 = obj2;
                                                        c7479 = c7479;
                                                        interfaceC22098 = interfaceC22097Resolve;
                                                        c15271 = c15272;
                                                        obj4 = c15271;
                                                        th2 = th;
                                                        c7479.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    c14914 = c14919;
                                                    interfaceC22097Resolve = interfaceC22098;
                                                    c14913 = c14914;
                                                    C14913 c149111 = c14913;
                                                    c15272 = c15273;
                                                    obj2 = c149111;
                                                }
                                                c13696.m31128(c13698.f38632.f34416, new Bundle(bundle), c24301, c9928.m23229(), c8469, interfaceC18589, i9);
                                                arrayList = arrayList3;
                                                arrayList.add(c6496.mo3999().m54755());
                                                j3 = j4;
                                                c13696.m31121(c6496.mo3999().m54774()).m12907();
                                            } catch (Throwable th13) {
                                                th = th13;
                                                c14916 = c14919;
                                                c13695 = c13696;
                                                c15274 = c15273;
                                                obj5 = c13695;
                                                c14917 = c14916;
                                                obj4 = obj5;
                                                c15271 = c15274;
                                                obj3 = c14917;
                                                th2 = th;
                                                c7479.close();
                                                throw th2;
                                            }
                                            c13696.m31125(0, length, sb);
                                            sb.delete(0, length);
                                            if (j4 >= j2) {
                                                if (j4 >= ((long) c6496.length()) + j2) {
                                                }
                                                int size2 = arrayList3.size();
                                                iMin = (int) Math.min(j4 - j2, c6496.length());
                                                i21 = size2;
                                                i9 = iMin;
                                            } else {
                                                i9 = 0;
                                                i21 = i21;
                                                iMin = i17;
                                            }
                                            length2 = j2 + ((long) c6496.length());
                                            c13698 = c13693;
                                            bundle = bundle;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            c14915 = c14919;
                                            c13694 = c13696;
                                            c7479 = c7479;
                                            interfaceC22098 = interfaceC22098;
                                            c13695 = c13694;
                                            c7479 = c7479;
                                            c14916 = c14915;
                                            c15274 = c15273;
                                            obj5 = c13695;
                                            c14917 = c14916;
                                            obj4 = obj5;
                                            c15271 = c15274;
                                            obj3 = c14917;
                                            th2 = th;
                                            c7479.close();
                                            throw th2;
                                        }
                                        c7479.close();
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
                                            c14916 = c14919;
                                            c13695 = c13696;
                                            c15274 = c15273;
                                            obj5 = c13695;
                                            c14917 = c14916;
                                            obj4 = obj5;
                                            c15271 = c15274;
                                            obj3 = c14917;
                                            th2 = th;
                                            c7479.close();
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
                                    interfaceC22098 = interfaceC220911;
                                    c14914 = c14919;
                                }
                                obj3 = obj2;
                                c7479 = c7479;
                                interfaceC22098 = interfaceC22097Resolve;
                                c15271 = c15272;
                                obj4 = c15271;
                                th2 = th;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            c7479 = c7479;
                            c15273 = null;
                            c14913 = c14913M30894;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        obj2 = c14913M30894;
                        c7479 = c7479;
                        c15272 = null;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c7479 = c7479M6162;
                }
            } catch (Throwable th21) {
                th = th21;
                c15271 = null;
                obj = null;
                r14 = c14913M30894;
            }
        } catch (Throwable th22) {
            th = th22;
            c15271 = null;
            r13 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13693 m34745(C13693 c13693, C6867 c6867, boolean z, C13083 c13083, C8467 c8467, InterfaceC18588 interfaceC18588, long j) throws Throwable {
        InterfaceC22097 interfaceC22097;
        C15271 c15271;
        C13693 c13694;
        InterfaceC22097 interfaceC22098 = c13693.f38637.f43575;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC22097 interfaceC22097Resolve = interfaceC22098.resolve(str);
        C18743.createDirectory(interfaceC22097Resolve, new InterfaceC23437[0]);
        C13693 c13695 = null;
        try {
            C13693 c13693M31106 = C13693.m31106(interfaceC22097Resolve.resolve("0"), c8467);
            C6495 c6495 = c13693M31106.f38639;
            int i = 0;
            while (true) {
                try {
                    CharSequence charSequence = c13083.f36779;
                    if (i >= charSequence.length()) {
                        break;
                    }
                    m34748(interfaceC18588);
                    int iMin = (int) Math.min(((long) i) + X931RNG.BLOCK64_RESEED_MAX, charSequence.length());
                    c13693M31106.m31125(i, iMin, charSequence);
                    i = iMin;
                } catch (Throwable th) {
                    th = th;
                    c13694 = c13693M31106;
                }
                interfaceC22097 = interfaceC22097Resolve;
                c15271 = null;
                c13695 = c13694;
                if (c13695 != null) {
                    c13695.m31120().m12907();
                }
                if (c15271 == null || !c15271.f43583) {
                    m34749(interfaceC22097);
                }
                throw th;
            }
            Bundle bundleM46652 = c13693.f38632.f34416.f22201.m46652();
            bundleM46652.putBoolean("e2SourcePending", false);
            bundleM46652.putBoolean("changed", false);
            bundleM46652.putBoolean(C0708d.f2599O, false);
            if (!z) {
                bundleM46652.putLong("fileTime", c6867.f17850.mo25091());
                bundleM46652.putBoolean("checkFileExists", true);
            }
            int iMin2 = (int) Math.min(Math.max(0L, j), c6495.length());
            c13694 = c13693M31106;
            try {
                c13693M31106.m31128(c13693.f38632.f34416, bundleM46652, c13083.f36778, c13083.f36776, c8467, interfaceC18588, iMin2);
                UUID uuidM54755 = c6495.mo3999().m54755();
                c13694.m31121(c6495.mo3999().m54774()).m12907();
                m34748(interfaceC18588);
                Object[] objArr = {uuidM54755};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C12826.requireNonNull(obj);
                arrayList.add(obj);
                interfaceC22097 = interfaceC22097Resolve;
                try {
                    c15271 = new C15271(interfaceC22098, str, C21562.unmodifiableList(arrayList), new boolean[1], bundleM46652, 0, c13083.f36778.f76968, c13083.f36776);
                    try {
                        c15271.m34757();
                        c13693.m31120().m12907();
                        C15271 c15272 = c13693.f38637;
                        c15272.getClass();
                        try {
                            m34749(c15272.f43575.resolve(c15272.f43578));
                        } catch (IOException unused) {
                        }
                        C13693 c13693M34760 = c15271.m34760(c8467, 8388608, interfaceC18588);
                        c13693M34760.f38628 = (j < 0 || c13693.f38637.f43584.size() == 1) ? -1 : iMin2;
                        if (!c15271.f43583) {
                            m34749(interfaceC22097);
                        }
                        return c13693M34760;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c15271 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                interfaceC22097 = interfaceC22097Resolve;
                c15271 = null;
                c13695 = c13694;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC22097 = interfaceC22097Resolve;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34749(InterfaceC22097 interfaceC22097) {
        InterfaceC19157 interfaceC19157Walk = C18743.walk(interfaceC22097, new EnumC12709[0]);
        try {
            Iterator it = interfaceC19157Walk.sorted(C10162.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C18743.delete((InterfaceC22097) it.next());
            }
            interfaceC19157Walk.close();
        } catch (Throwable th) {
            if (interfaceC19157Walk != null) {
                try {
                    interfaceC19157Walk.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34748(InterfaceC18588 interfaceC18588) {
        if (interfaceC18588.mo3924()) {
            throw new CancellationException("Text pagination is canceled");
        }
    }
}
