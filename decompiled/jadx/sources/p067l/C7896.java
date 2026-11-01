package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7896 {

    /* JADX INFO: renamed from: ֫ */
    public final String f20716;

    /* JADX INFO: renamed from: ۜ */
    public final int f20717;

    /* JADX INFO: renamed from: ۧ */
    public final Map f20718;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f20719;

    /* JADX INFO: renamed from: ܽ */
    public final int f20720;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f20721;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f20722;

    /* JADX INFO: renamed from: ᩻ */
    public final int f20723;

    public C7896(boolean z, boolean z2, boolean z3, int i, int i2, int i3, String str, HashMap map) {
        this.f20719 = z;
        this.f20722 = z2;
        this.f20721 = z3;
        this.f20717 = i;
        this.f20720 = i2;
        this.f20723 = i3;
        this.f20716 = str;
        this.f20718 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7896 m18241(int i, long j, InputStream inputStream) throws IOException {
        C25112 c25112M55102 = C25112.m55102(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy parameters exceed app state limit");
            }
            if (!c25112M55102.m55109()) {
                c25112M55102.m55115();
                C7896 c7896 = new C7896(false, false, false, 0, 0, 0, null, null);
                c25112M55102.close();
                return c7896;
            }
            int i2 = c25112M55102.readByte();
            int iM55110 = c25112M55102.m55110();
            boolean zM55109 = c25112M55102.m55109();
            c25112M55102.readByte();
            int i3 = c25112M55102.readInt();
            String strM55111 = c25112M55102.m55109() ? c25112M55102.m55111(i) : null;
            boolean zM551010 = c25112M55102.m55109();
            int i4 = c25112M55102.readInt();
            if (i4 < 0 || i4 > c25112M55102.m55113() / ((long) 20)) {
                throw new IOException("Invalid legacy attribute count");
            }
            HashMap map = new HashMap();
            int i5 = 0;
            while (i5 < i4) {
                String strM55114 = c25112M55102.m55114(i);
                int i6 = c25112M55102.readInt();
                int i7 = c25112M55102.readInt();
                String strM55115 = c25112M55102.m55114(i);
                int i8 = c25112M55102.readInt();
                if (i8 >= 0) {
                    boolean z = zM551010;
                    if (i8 <= c25112M55102.m55113() / ((long) 12)) {
                        C16332[] c16332Arr = new C16332[i8];
                        int i9 = 0;
                        while (i9 < i8) {
                            c16332Arr[i9] = new C16332(c25112M55102.readInt(), c25112M55102.readInt(), c25112M55102.m55114(i));
                            i9++;
                            i4 = i4;
                            i8 = i8;
                        }
                        map.put(strM55114, new C18344(i6, strM55115, c16332Arr, i7));
                        i5++;
                        zM551010 = z;
                        i4 = i4;
                    }
                }
                throw new IOException("Invalid legacy attribute count");
            }
            c25112M55102.m55115();
            C7896 c7897 = new C7896(true, zM551010, zM55109, i2, iM55110, i3, strM55111, map);
            c25112M55102.close();
            return c7897;
        } catch (Throwable th) {
            try {
                c25112M55102.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24301 m18242() {
        C14281 c14281 = null;
        if (!this.f20719) {
            return null;
        }
        String str = this.f20716;
        AbstractC17043 abstractC17043M42109 = str == null ? null : C18524.m42109(str, new String[0]);
        if (this.f20722) {
            if (abstractC17043M42109 != null && abstractC17043M42109.mo25094()) {
                try {
                    C14281 c14282 = new C14281(abstractC17043M42109);
                    c14282.m32845();
                    c14281 = c14282;
                } catch (Throwable unused) {
                }
            }
            if (c14281 == null) {
                c14281 = new C14281();
            }
        }
        return new C24301(this.f20717, this.f20720, this.f20721, this.f20723, abstractC17043M42109, c14281, this.f20718);
    }
}
