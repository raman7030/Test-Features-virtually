package p067l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12089 implements InterfaceC14770 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f33789 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C13430 f33790;

    public C12089(C13430 c13430) {
        this.f33790 = c13430;
    }

    @Override // p067l.InterfaceC14770
    public final InterfaceC14770 putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f33789.put(str, new C8065(16, str2.getBytes(Charset.defaultCharset())));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27875(int i, String str) {
        byte[] bArr = new byte[4];
        C17548.m39930(0, i, bArr);
        this.f33789.put(str, new C8065(21, bArr));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27876(long j, String str) {
        byte[] bArr = new byte[8];
        C17548.m39932(j, 0, bArr);
        this.f33789.put(str, new C8065(22, bArr));
        return this;
    }

    @Override // p067l.InterfaceC14770
    public final InterfaceC14770 putFloat(String str, float f) {
        byte[] bArr = new byte[4];
        C17548.m39930(0, Float.floatToRawIntBits(f), bArr);
        this.f33789.put(str, new C8065(23, bArr));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27877(String str, byte[] bArr) {
        if (bArr == null) {
            remove(str);
            return this;
        }
        this.f33789.put(str, new C8065(25, (byte[]) bArr.clone()));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27878(String str, int[] iArr) {
        if (iArr == null) {
            remove(str);
            return this;
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            C17548.m39930(i * 4, iArr[i], bArr);
        }
        this.f33789.put(str, new C8065(26, bArr));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27879(String str, String[] strArr) {
        if (strArr == null) {
            remove(str);
            return this;
        }
        C11996 c11996 = new C11996();
        c11996.mo15113(strArr.length);
        for (String str2 : strArr) {
            c11996.m27459(str2);
        }
        this.f33789.put(str, new C8065(27, c11996.m27464()));
        return this;
    }

    @Override // p067l.InterfaceC14770
    public final InterfaceC14770 remove(String str) {
        this.f33789.put(str, C13430.f37721);
        return this;
    }

    @Override // p067l.InterfaceC14770
    public final InterfaceC14770 putBoolean(String str, boolean z) {
        this.f33789.put(str, new C8065(17, new byte[]{(byte) (z ? 255 : 0)}));
        return this;
    }

    @Override // p067l.InterfaceC14770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14770 mo27874(byte b, String str) {
        this.f33789.put(str, new C8065(18, new byte[]{b}));
        return this;
    }

    @Override // p067l.InterfaceC14770
    public final void apply() {
        m27871();
        C4081.f8987.execute(new RunnableC11815(2, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27872(C12089 c12089) {
        try {
            synchronized (c12089.f33790) {
                c12089.m27873();
            }
        } catch (IOException unused) {
        }
    }

    @Override // p067l.InterfaceC14770
    public final boolean commit() {
        m27871();
        try {
            synchronized (this.f33790) {
                m27873();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27871() {
        for (Map.Entry entry : this.f33789.entrySet()) {
            this.f33790.f37723.put((String) entry.getKey(), (C8065) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m27873() throws Exception {
        C13430 c13430 = this.f33790;
        if (c13430.f37724.exists()) {
            if (!c13430.f37724.isDirectory() && !c13430.f37724.delete() && !c13430.f37724.mkdirs()) {
                throw new IOException("Unable to create directory " + c13430.f37724);
            }
        } else if (!c13430.f37724.mkdirs()) {
            throw new IOException("Unable to create directory " + c13430.f37724);
        }
        byte[] bArr = new byte[1024];
        CRC32 crc32 = new CRC32();
        IOException iOException = null;
        for (Map.Entry entry : this.f33789.entrySet()) {
            String str = (String) entry.getKey();
            C8065 c8065 = (C8065) entry.getValue();
            C12826.requireNonNull(c8065);
            try {
                if (c8065 == C13430.f37721) {
                    c13430.m30578(str).m51083();
                } else {
                    C13430.m30575(c13430, str, c8065, bArr, crc32);
                    if (c8065.f21280.length >= 10240) {
                        c13430.f37723.remove(str, c8065);
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
