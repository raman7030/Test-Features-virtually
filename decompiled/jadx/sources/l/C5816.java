package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5816 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f17864;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f17865;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f17866;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f17867;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17868;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f17869;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f17870;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f17871;

    public C5816(boolean z, boolean z2, boolean z3, int i, int i2, int i3, String str, HashMap map) {
        this.f17867 = z;
        this.f17870 = z2;
        this.f17869 = z3;
        this.f17865 = i;
        this.f17868 = i2;
        this.f17871 = i3;
        this.f17864 = str;
        this.f17866 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5816 m16316(int i, long j, InputStream inputStream) throws IOException {
        C23930 c23930M52696 = C23930.m52696(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy parameters exceed app state limit");
            }
            if (!c23930M52696.m52703()) {
                c23930M52696.m52709();
                C5816 c5816 = new C5816(false, false, false, 0, 0, 0, null, null);
                c23930M52696.close();
                return c5816;
            }
            int i2 = c23930M52696.readByte();
            int iM52704 = c23930M52696.m52704();
            boolean zM52703 = c23930M52696.m52703();
            c23930M52696.readByte();
            int i3 = c23930M52696.readInt();
            String strM52705 = c23930M52696.m52703() ? c23930M52696.m52705(i) : null;
            boolean zM52704 = c23930M52696.m52703();
            int i4 = c23930M52696.readInt();
            if (i4 < 0 || i4 > c23930M52696.m52707() / ((long) 20)) {
                throw new IOException("Invalid legacy attribute count");
            }
            HashMap map = new HashMap();
            int i5 = 0;
            while (i5 < i4) {
                String strM52708 = c23930M52696.m52708(i);
                int i6 = c23930M52696.readInt();
                int i7 = c23930M52696.readInt();
                String strM52709 = c23930M52696.m52708(i);
                int i8 = c23930M52696.readInt();
                if (i8 >= 0) {
                    boolean z = zM52704;
                    if (i8 <= c23930M52696.m52707() / ((long) 12)) {
                        C14692[] c14692Arr = new C14692[i8];
                        int i9 = 0;
                        while (i9 < i8) {
                            c14692Arr[i9] = new C14692(c23930M52696.readInt(), c23930M52696.readInt(), c23930M52696.m52708(i));
                            i9++;
                            i4 = i4;
                            i8 = i8;
                        }
                        map.put(strM52708, new C16809(i6, strM52709, c14692Arr, i7));
                        i5++;
                        zM52704 = z;
                        i4 = i4;
                    }
                }
                throw new IOException("Invalid legacy attribute count");
            }
            c23930M52696.m52709();
            C5816 c5817 = new C5816(true, zM52704, zM52703, i2, iM52704, i3, strM52705, map);
            c23930M52696.close();
            return c5817;
        } catch (Throwable th) {
            try {
                c23930M52696.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23077 m16317() {
        C12534 c12534 = null;
        if (!this.f17867) {
            return null;
        }
        String str = this.f17864;
        AbstractC15440 abstractC15440M39866 = str == null ? null : C16999.m39866(str, new String[0]);
        if (this.f17870) {
            if (abstractC15440M39866 != null && abstractC15440M39866.mo23120()) {
                try {
                    C12534 c12535 = new C12534(abstractC15440M39866);
                    c12535.m30773();
                    c12534 = c12535;
                } catch (Throwable unused) {
                }
            }
            if (c12534 == null) {
                c12534 = new C12534();
            }
        }
        return new C23077(this.f17865, this.f17868, this.f17869, this.f17871, abstractC15440M39866, c12534, this.f17866);
    }
}
