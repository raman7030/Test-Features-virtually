package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10228 implements InterfaceC13049 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f30828 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11639 f30829;

    public C10228(C11639 c11639) {
        this.f30829 = c11639;
    }

    @Override // l.InterfaceC13049
    public final InterfaceC13049 putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f30828.put(str, new C5994(16, str2.getBytes(Charset.defaultCharset())));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25853(int i, String str) {
        byte[] bArr = new byte[4];
        C15972.m37746(0, i, bArr);
        this.f30828.put(str, new C5994(21, bArr));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25854(long j, String str) {
        byte[] bArr = new byte[8];
        C15972.m37748(j, 0, bArr);
        this.f30828.put(str, new C5994(22, bArr));
        return this;
    }

    @Override // l.InterfaceC13049
    public final InterfaceC13049 putFloat(String str, float f) {
        byte[] bArr = new byte[4];
        C15972.m37746(0, Float.floatToRawIntBits(f), bArr);
        this.f30828.put(str, new C5994(23, bArr));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25855(String str, byte[] bArr) {
        if (bArr == null) {
            remove(str);
            return this;
        }
        this.f30828.put(str, new C5994(25, (byte[]) bArr.clone()));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25856(String str, int[] iArr) {
        if (iArr == null) {
            remove(str);
            return this;
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            C15972.m37746(i * 4, iArr[i], bArr);
        }
        this.f30828.put(str, new C5994(26, bArr));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25857(String str, String[] strArr) {
        if (strArr == null) {
            remove(str);
            return this;
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(strArr.length);
        for (String str2 : strArr) {
            c10130.m25439(str2);
        }
        this.f30828.put(str, new C5994(27, c10130.m25444()));
        return this;
    }

    @Override // l.InterfaceC13049
    public final InterfaceC13049 remove(String str) {
        this.f30828.put(str, C11639.f34724);
        return this;
    }

    @Override // l.InterfaceC13049
    public final InterfaceC13049 putBoolean(String str, boolean z) {
        this.f30828.put(str, new C5994(17, new byte[]{(byte) (z ? 255 : 0)}));
        return this;
    }

    @Override // l.InterfaceC13049
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 mo25852(byte b, String str) {
        this.f30828.put(str, new C5994(18, new byte[]{b}));
        return this;
    }

    @Override // l.InterfaceC13049
    public final void apply() {
        m25849();
        C1802.f6208.execute(new RunnableC9940(2, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25850(C10228 c10228) {
        try {
            synchronized (c10228.f30829) {
                c10228.m25851();
            }
        } catch (IOException unused) {
        }
    }

    @Override // l.InterfaceC13049
    public final boolean commit() {
        m25849();
        try {
            synchronized (this.f30829) {
                m25851();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25849() {
        for (Map.Entry entry : this.f30828.entrySet()) {
            this.f30829.f34726.put((String) entry.getKey(), (C5994) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m25851() throws Exception {
        C11639 c11639 = this.f30829;
        if (c11639.f34727.exists()) {
            if (!c11639.f34727.isDirectory() && !c11639.f34727.delete() && !c11639.f34727.mkdirs()) {
                throw new IOException("Unable to create directory " + c11639.f34727);
            }
        } else if (!c11639.f34727.mkdirs()) {
            throw new IOException("Unable to create directory " + c11639.f34727);
        }
        byte[] bArr = new byte[1024];
        CRC32 crc32 = new CRC32();
        IOException iOException = null;
        for (Map.Entry entry : this.f30828.entrySet()) {
            String str = (String) entry.getKey();
            C5994 c5994 = (C5994) entry.getValue();
            C11003.requireNonNull(c5994);
            try {
                if (c5994 == C11639.f34724) {
                    c11639.m28530(str).m48737();
                } else {
                    C11639.m28527(c11639, str, c5994, bArr, crc32);
                    if (c5994.f18429.length >= 10240) {
                        c11639.f34726.remove(str, c5994);
                    }
                }
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
