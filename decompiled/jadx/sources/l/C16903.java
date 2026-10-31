package l;

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
public final class C16903 implements InterfaceC18315 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7110 f51953;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9849 f51954;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51955;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Cipher f51957 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecretKeySpec f51956 = null;

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final void mo27867(long j) {
    }

    public C16903(File file) {
        this.f51953 = new C7110(file);
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27872() {
        return this.f51953.m19126();
    }

    @Override // l.InterfaceC18315
    public final void delete() {
        this.f51953.m19124();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0095, IOException -> 0x0098, LOOP:0: B:28:0x0063->B:29:0x0065, LOOP_END, TryCatch #5 {IOException -> 0x0098, all -> 0x0095, blocks: (B:7:0x001f, B:12:0x0029, B:19:0x0037, B:20:0x0041, B:21:0x0048, B:25:0x0057, B:26:0x005c, B:27:0x005d, B:29:0x0065, B:30:0x007b), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final void mo27869(HashMap map, SparseArray sparseArray) throws Throwable {
        int i;
        int i2;
        int iM39762;
        int i3;
        C22632.m50634(!this.f51955);
        C7110 c7110 = this.f51953;
        if (c7110.m19126()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c7110.m19127());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i4 = dataInputStream2.readInt();
                    if (i4 >= 0 && i4 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f51957;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f51956;
                                    String str = C3603.f11424;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    i = dataInputStream2.readInt();
                                    iM39762 = 0;
                                    for (i2 = 0; i2 < i; i2++) {
                                        C2087 c2087M39763 = m39763(i4, dataInputStream2);
                                        String str2 = c2087M39763.f6961;
                                        map.put(str2, c2087M39763);
                                        sparseArray.put(c2087M39763.f6960, str2);
                                        iM39762 += m39762(c2087M39763, i4);
                                    }
                                    i3 = dataInputStream2.readInt();
                                    if (dataInputStream2.read() == -1) {
                                    }
                                    if (i3 == iM39762) {
                                        C3603.m11024(dataInputStream2);
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
                            iM39762 = 0;
                            while (i2 < i) {
                                C2087 c2087M39764 = m39763(i4, dataInputStream2);
                                String str3 = c2087M39764.f6961;
                                map.put(str3, c2087M39764);
                                sparseArray.put(c2087M39764.f6960, str3);
                                iM39762 += m39762(c2087M39764, i4);
                            }
                            i3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (i3 == iM39762 && z) {
                                C3603.m11024(dataInputStream2);
                                return;
                            }
                        }
                    }
                    C3603.m11024(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C3603.m11024(dataInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C3603.m11024(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            map.clear();
            sparseArray.clear();
            c7110.m19124();
        }
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final void mo27868(HashMap map) throws Throwable {
        if (this.f51955) {
            mo27873(map);
        }
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final void mo27870(C2087 c2087) {
        this.f51955 = true;
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ֫ */
    public final void mo27871(C2087 c2087, boolean z) {
        this.f51955 = true;
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ۧ */
    public final void mo27873(HashMap map) throws Throwable {
        C7110 c7110 = this.f51953;
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream outputStreamM19128 = c7110.m19128();
            C9849 c9849 = this.f51954;
            if (c9849 == null) {
                this.f51954 = new C9849(outputStreamM19128);
            } else {
                c9849.m24920(outputStreamM19128);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f51954);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM39762 = 0;
                for (C2087 c2087 : map.values()) {
                    dataOutputStream2.writeInt(c2087.f6960);
                    dataOutputStream2.writeUTF(c2087.f6961);
                    C17609.m41158(c2087.m6859(), dataOutputStream2);
                    iM39762 += m39762(c2087, 2);
                }
                dataOutputStream2.writeInt(iM39762);
                c7110.m19125(dataOutputStream2);
                String str = C3603.f11424;
                this.f51955 = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C3603.m11024(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39762(C2087 c2087, int i) {
        int iHashCode = c2087.f6961.hashCode() + (c2087.f6960 * 31);
        if (i < 2) {
            long jM32306 = C13325.m32306(c2087.m6859());
            return (iHashCode * 31) + ((int) (jM32306 ^ (jM32306 >>> 32)));
        }
        return c2087.m6859().hashCode() + (iHashCode * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2087 m39763(int i, DataInputStream dataInputStream) throws IOException {
        C7026 c7026M41157;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C23959 c23959 = new C23959();
            C23959.m52785(c23959, j);
            c7026M41157 = C7026.f21670.m18995(c23959);
        } else {
            c7026M41157 = C17609.m41157(dataInputStream);
        }
        return new C2087(i2, utf, c7026M41157);
    }
}
