package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB3E */
/* JADX INFO: loaded from: classes.dex */
public final class C23077 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74220;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12534 f74221;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74222;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74223;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f74224;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f74225;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74226;

    public C23077(int i, int i2, boolean z, int i3, AbstractC15440 abstractC15440, C12534 c12534, Map map) {
        this.f74226 = i;
        this.f74223 = i2;
        this.f74224 = z;
        this.f74222 = i3;
        this.f74221 = c12534;
        this.f74220 = abstractC15440;
        this.f74225 = map;
    }

    public C23077(C12951 c12951) {
        this.f74226 = c12951.readByte() & 255;
        this.f74223 = c12951.m31494();
        this.f74224 = c12951.m31498();
        c12951.skipBytes(1);
        this.f74222 = c12951.readInt();
        String strM31503 = c12951.m31503();
        boolean zM31498 = c12951.m31498();
        if (strM31503 != null) {
            this.f74220 = C16999.m39866(strM31503, new String[0]);
        }
        if (zM31498) {
            AbstractC15440 abstractC15440 = this.f74220;
            if (abstractC15440 != null && abstractC15440.mo23120()) {
                try {
                    C12534 c12534 = new C12534(this.f74220);
                    c12534.m30773();
                    this.f74221 = c12534;
                } catch (Throwable unused) {
                }
            }
            if (this.f74221 == null) {
                this.f74221 = new C12534();
            }
        }
        int i = c12951.readInt();
        this.f74225 = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM31504 = c12951.m31504();
            int i3 = c12951.readInt();
            int i4 = c12951.readInt();
            String strM31505 = c12951.m31504();
            int i5 = c12951.readInt();
            C14692[] c14692Arr = new C14692[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c14692Arr[i6] = new C14692(c12951.readInt(), c12951.readInt(), c12951.m31504());
            }
            this.f74225.put(strM31504, new C16809(i3, strM31505, c14692Arr, i4));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23077 m51238() {
        HashMap map;
        Map map2 = this.f74225;
        if (map2 != null) {
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                C16809 c16809 = (C16809) entry.getValue();
                map.put((String) entry.getKey(), new C16809(c16809.f51608, c16809.f51605, (C14692[]) c16809.f51607.clone(), c16809.f51604));
            }
        } else {
            map = null;
        }
        int i = this.f74223;
        AbstractC15440 abstractC15440 = this.f74220;
        C12534 c12534 = this.f74221;
        return new C23077(this.f74226, i, this.f74224, this.f74222, abstractC15440, c12534, map);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51241() {
        return this.f74226 == 255;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51240() {
        return this.f74226 == 254;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51242() {
        return this.f74226 == 253;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51237(int i) throws IOException {
        long jM16234;
        AbstractC15440 abstractC15440 = this.f74220;
        if (abstractC15440 != null) {
            String strMo23554 = abstractC15440.mo23554();
            jM16234 = (strMo23554 == null ? 0L : C5773.m16234(strMo23554, false)) + 16;
        } else {
            jM16234 = 15;
        }
        m51236(i, jM16234);
        Map map = this.f74225;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C16809 c16809 = (C16809) entry.getValue();
                String str = (String) entry.getKey();
                long jM16235 = C5773.m16234(c16809.f51605, false) + (str == null ? 0L : C5773.m16234(str, false)) + 20 + jM16234;
                m51236(i, jM16235);
                for (C14692 c14692 : c16809.f51607) {
                    String str2 = c14692.f44875;
                    jM16235 += (str2 == null ? 0L : C5773.m16234(str2, false)) + 12;
                    m51236(i, jM16235);
                }
                jM16234 = jM16235;
            }
        }
        return (int) jM16234;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51236(int i, long j) throws IOException {
        if (i < 0 || j > i) {
            throw new IOException("Text parameters exceed recovery state limit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51239(C10130 c10130) {
        c10130.writeByte(this.f74226);
        c10130.mo13231(this.f74223);
        c10130.m25425(this.f74224);
        c10130.writeByte(0);
        c10130.writeInt(this.f74222);
        AbstractC15440 abstractC15440 = this.f74220;
        c10130.m25424(abstractC15440 == null ? null : abstractC15440.mo23554());
        c10130.m25425(this.f74221 != null);
        Map map = this.f74225;
        if (map == null) {
            c10130.writeInt(0);
            return;
        }
        c10130.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c10130.m25423((CharSequence) entry.getKey());
            C16809 c16809 = (C16809) entry.getValue();
            c10130.writeInt(c16809.f51608);
            c10130.writeInt(c16809.f51604);
            c10130.m25423((CharSequence) c16809.f51605);
            C14692[] c14692Arr = c16809.f51607;
            c10130.writeInt(c14692Arr.length);
            for (C14692 c14692 : c14692Arr) {
                c10130.writeInt(c14692.f44876);
                c10130.writeInt(c14692.f44877);
                c10130.m25423((CharSequence) c14692.f44875);
            }
        }
    }
}
