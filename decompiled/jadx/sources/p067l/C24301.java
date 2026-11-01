package p067l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB3E */
/* JADX INFO: loaded from: classes.dex */
public final class C24301 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 f76965;

    /* JADX INFO: renamed from: ۧ */
    public C14281 f76966;

    /* JADX INFO: renamed from: ܳ */
    public int f76967;

    /* JADX INFO: renamed from: ܽ */
    public int f76968;

    /* JADX INFO: renamed from: ܿ */
    public boolean f76969;

    /* JADX INFO: renamed from: ᩳ */
    public Map f76970;

    /* JADX INFO: renamed from: ᩻ */
    public int f76971;

    public C24301(int i, int i2, boolean z, int i3, AbstractC17043 abstractC17043, C14281 c14281, Map map) {
        this.f76971 = i;
        this.f76968 = i2;
        this.f76969 = z;
        this.f76967 = i3;
        this.f76966 = c14281;
        this.f76965 = abstractC17043;
        this.f76970 = map;
    }

    public C24301(C14677 c14677) {
        this.f76971 = c14677.readByte() & 255;
        this.f76968 = c14677.m33581();
        this.f76969 = c14677.m33585();
        c14677.skipBytes(1);
        this.f76967 = c14677.readInt();
        String strM33590 = c14677.m33590();
        boolean zM33585 = c14677.m33585();
        if (strM33590 != null) {
            this.f76965 = C18524.m42109(strM33590, new String[0]);
        }
        if (zM33585) {
            AbstractC17043 abstractC17043 = this.f76965;
            if (abstractC17043 != null && abstractC17043.mo25094()) {
                try {
                    C14281 c14281 = new C14281(this.f76965);
                    c14281.m32845();
                    this.f76966 = c14281;
                } catch (Throwable unused) {
                }
            }
            if (this.f76966 == null) {
                this.f76966 = new C14281();
            }
        }
        int i = c14677.readInt();
        this.f76970 = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM33591 = c14677.m33591();
            int i3 = c14677.readInt();
            int i4 = c14677.readInt();
            String strM33592 = c14677.m33591();
            int i5 = c14677.readInt();
            C16332[] c16332Arr = new C16332[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c16332Arr[i6] = new C16332(c14677.readInt(), c14677.readInt(), c14677.m33591());
            }
            this.f76970.put(strM33591, new C18344(i3, strM33592, c16332Arr, i4));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24301 m53631() {
        HashMap map;
        Map map2 = this.f76970;
        if (map2 != null) {
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                C18344 c18344 = (C18344) entry.getValue();
                map.put((String) entry.getKey(), new C18344(c18344.f54790, c18344.f54787, (C16332[]) c18344.f54789.clone(), c18344.f54786));
            }
        } else {
            map = null;
        }
        int i = this.f76968;
        AbstractC17043 abstractC17043 = this.f76965;
        C14281 c14281 = this.f76966;
        return new C24301(this.f76971, i, this.f76969, this.f76967, abstractC17043, c14281, map);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53634() {
        return this.f76971 == 255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53633() {
        return this.f76971 == 254;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m53635() {
        return this.f76971 == 253;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53630(int i) throws IOException {
        long jM18153;
        AbstractC17043 abstractC17043 = this.f76965;
        if (abstractC17043 != null) {
            String strMo25505 = abstractC17043.mo25505();
            jM18153 = (strMo25505 == null ? 0L : C7855.m18153(strMo25505, false)) + 16;
        } else {
            jM18153 = 15;
        }
        m53629(i, jM18153);
        Map map = this.f76970;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C18344 c18344 = (C18344) entry.getValue();
                String str = (String) entry.getKey();
                long jM18154 = C7855.m18153(c18344.f54787, false) + (str == null ? 0L : C7855.m18153(str, false)) + 20 + jM18153;
                m53629(i, jM18154);
                for (C16332 c16332 : c18344.f54789) {
                    String str2 = c16332.f47990;
                    jM18154 += (str2 == null ? 0L : C7855.m18153(str2, false)) + 12;
                    m53629(i, jM18154);
                }
                jM18153 = jM18154;
            }
        }
        return (int) jM18153;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53629(int i, long j) throws IOException {
        if (i < 0 || j > i) {
            throw new IOException("Text parameters exceed recovery state limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53632(C11996 c11996) {
        c11996.writeByte(this.f76971);
        c11996.mo15113(this.f76968);
        c11996.m27445(this.f76969);
        c11996.writeByte(0);
        c11996.writeInt(this.f76967);
        AbstractC17043 abstractC17043 = this.f76965;
        c11996.m27444(abstractC17043 == null ? null : abstractC17043.mo25505());
        c11996.m27445(this.f76966 != null);
        Map map = this.f76970;
        if (map == null) {
            c11996.writeInt(0);
            return;
        }
        c11996.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11996.m27443((CharSequence) entry.getKey());
            C18344 c18344 = (C18344) entry.getValue();
            c11996.writeInt(c18344.f54790);
            c11996.writeInt(c18344.f54786);
            c11996.m27443((CharSequence) c18344.f54787);
            C16332[] c16332Arr = c18344.f54789;
            c11996.writeInt(c16332Arr.length);
            for (C16332 c16332 : c16332Arr) {
                c11996.writeInt(c16332.f47991);
                c11996.writeInt(c16332.f47992);
                c11996.m27443((CharSequence) c16332.f47990);
            }
        }
    }
}
