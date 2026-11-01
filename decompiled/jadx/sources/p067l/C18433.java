package p067l;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܽ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18433 implements InterfaceC19775 {

    /* JADX INFO: renamed from: ֫ */
    public final C9125 f55133;

    /* JADX INFO: renamed from: ۧ */
    public C11729 f55134;

    /* JADX INFO: renamed from: ܽ */
    public boolean f55135;

    /* JADX INFO: renamed from: ᩳ */
    public final Cipher f55137 = null;

    /* JADX INFO: renamed from: ܿ */
    public final SecretKeySpec f55136 = null;

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29928(long j) {
    }

    public C18433(File file) {
        this.f55133 = new C9125(file);
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29933() {
        return this.f55133.m21069();
    }

    @Override // p067l.InterfaceC19775
    public final void delete() {
        this.f55133.m21067();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0095, IOException -> 0x0098, LOOP:0: B:28:0x0063->B:29:0x0065, LOOP_END, TryCatch #5 {IOException -> 0x0098, all -> 0x0095, blocks: (B:7:0x001f, B:12:0x0029, B:19:0x0037, B:20:0x0041, B:21:0x0048, B:25:0x0057, B:26:0x005c, B:27:0x005d, B:29:0x0065, B:30:0x007b), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29930(HashMap map, SparseArray sparseArray) throws Throwable {
        int i;
        int i2;
        int iM42003;
        int i3;
        C23877.m52960(!this.f55135);
        C9125 c9125 = this.f55133;
        if (c9125.m21069()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c9125.m21070());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i4 = dataInputStream2.readInt();
                    if (i4 >= 0 && i4 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f55137;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f55136;
                                    String str = C5792.f14228;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    i = dataInputStream2.readInt();
                                    iM42003 = 0;
                                    for (i2 = 0; i2 < i; i2++) {
                                        C4352 c4352M42004 = m42004(i4, dataInputStream2);
                                        String str2 = c4352M42004.f9745;
                                        map.put(str2, c4352M42004);
                                        sparseArray.put(c4352M42004.f9744, str2);
                                        iM42003 += m42003(c4352M42004, i4);
                                    }
                                    i3 = dataInputStream2.readInt();
                                    if (dataInputStream2.read() == -1) {
                                    }
                                    if (i3 == iM42003) {
                                        C5792.m13000(dataInputStream2);
                                        return;
                                    }
                                } catch (InvalidAlgorithmParameterException e) {
                                    e = e;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e2) {
                                    e = e2;
                                    throw new IllegalStateException(e);
                                }
                            }
                        } else {
                            i = dataInputStream2.readInt();
                            iM42003 = 0;
                            while (i2 < i) {
                                C4352 c4352M42005 = m42004(i4, dataInputStream2);
                                String str3 = c4352M42005.f9745;
                                map.put(str3, c4352M42005);
                                sparseArray.put(c4352M42005.f9744, str3);
                                iM42003 += m42003(c4352M42005, i4);
                            }
                            i3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (i3 == iM42003 && z) {
                                C5792.m13000(dataInputStream2);
                                return;
                            }
                        }
                    }
                    C5792.m13000(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C5792.m13000(dataInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C5792.m13000(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            map.clear();
            sparseArray.clear();
            c9125.m21067();
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29929(HashMap map) throws Throwable {
        if (this.f55135) {
            mo29934(map);
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29931(C4352 c4352) {
        this.f55135 = true;
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29932(C4352 c4352, boolean z) {
        this.f55135 = true;
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ۧ */
    public final void mo29934(HashMap map) throws Throwable {
        C9125 c9125 = this.f55133;
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream outputStreamM21071 = c9125.m21071();
            C11729 c11729 = this.f55134;
            if (c11729 == null) {
                this.f55134 = new C11729(outputStreamM21071);
            } else {
                c11729.m26935(outputStreamM21071);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f55134);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM42003 = 0;
                for (C4352 c4352 : map.values()) {
                    dataOutputStream2.writeInt(c4352.f9744);
                    dataOutputStream2.writeUTF(c4352.f9745);
                    C19104.m43404(c4352.m8985(), dataOutputStream2);
                    iM42003 += m42003(c4352, 2);
                }
                dataOutputStream2.writeInt(iM42003);
                c9125.m21068(dataOutputStream2);
                String str = C5792.f14228;
                this.f55135 = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C5792.m13000(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42003(C4352 c4352, int i) {
        int iHashCode = c4352.f9745.hashCode() + (c4352.f9744 * 31);
        if (i < 2) {
            long jM34406 = C15033.m34406(c4352.m8985());
            return (iHashCode * 31) + ((int) (jM34406 ^ (jM34406 >>> 32)));
        }
        return c4352.m8985().hashCode() + (iHashCode * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4352 m42004(int i, DataInputStream dataInputStream) throws IOException {
        C9046 c9046M43403;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C25139 c25139 = new C25139();
            C25139.m55191(c25139, j);
            c9046M43403 = C9046.f24551.m20952(c25139);
        } else {
            c9046M43403 = C19104.m43403(dataInputStream);
        }
        return new C4352(i2, utf, c9046M43403);
    }
}
