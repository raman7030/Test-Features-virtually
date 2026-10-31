package l;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.᩷ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C20790 implements InterfaceC17261 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20790 f67319 = new C20790(new C23611());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23611 f67320;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6678 f67321;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f67322;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67323;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f67324;

    @Override // l.InterfaceC17261
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C16555 mo40556(String str, String str2) {
        if (!m47590()) {
            return C16555.f50863;
        }
        try {
            return this.f67321.m18218(this.f67324, str, str2);
        } catch (IOException | RuntimeException unused) {
            this.f67323 = true;
            this.f67322 = SystemClock.elapsedRealtime();
            this.f67321 = null;
            RandomAccessFile randomAccessFile = this.f67324;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                this.f67324 = null;
            }
            return C16555.f50863;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:8:0x000a, B:13:0x001f, B:14:0x0022), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47592() {
        if (this.f67321 == null) {
            if (this.f67323) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f67322;
                if (jElapsedRealtime < 0 || jElapsedRealtime >= 60000) {
                    this.f67323 = false;
                }
            } else {
                this.f67323 = false;
            }
        }
        m47590();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20790 m47591() {
        return f67319;
    }

    public C20790(C23611 c23611) {
        this.f67320 = c23611;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m47590() {
        C6678 c6678M47589;
        C23611 c23611 = this.f67320;
        if (this.f67321 == null) {
            if (this.f67323) {
                return false;
            }
            try {
                File file = new File(C4925.m14322(), "mcp/xref");
                if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                    throw new IOException("Unable to create boot hierarchy directory");
                }
                File file2 = new File(file, "android_api_36_public_boot_hierarchy.index");
                try {
                    c6678M47589 = C6678.m18216(file2);
                } catch (IOException | RuntimeException unused) {
                    c6678M47589 = m47589(c23611, file, file2);
                }
                this.f67324 = new RandomAccessFile(file2, "r");
                this.f67321 = c6678M47589;
            } catch (IOException | RuntimeException unused2) {
                this.f67323 = true;
                this.f67322 = SystemClock.elapsedRealtime();
                this.f67321 = null;
                RandomAccessFile randomAccessFile = this.f67324;
                if (randomAccessFile == null) {
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused3) {
                }
                this.f67324 = null;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6678 m47589(C23611 c23611, File file, File file2) throws IOException {
        File file3 = new File(file, "android_api_36_public_boot_hierarchy.index.tmp");
        if (file3.exists() && !file3.delete()) {
            throw new IOException("Unable to delete stale boot hierarchy temp file");
        }
        try {
            InputStream inputStreamM52102 = c23611.m52102();
            try {
                InputStream inputStreamM3765 = C1096.m3765(inputStreamM52102);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int i = inputStreamM3765.read(bArr);
                                if (i == -1) {
                                    bufferedOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    inputStreamM3765.close();
                                    inputStreamM52102.close();
                                    if (j != 3415240) {
                                        throw new IOException("Boot hierarchy download size mismatch");
                                    }
                                    C6678 c6678M18216 = C6678.m18216(file3);
                                    if (!file3.renameTo(file2)) {
                                        throw new IOException("Unable to publish boot hierarchy index");
                                    }
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    return c6678M18216;
                                }
                                j += (long) i;
                                if (j > 3415240) {
                                    throw new IOException("Boot hierarchy download exceeds expected size");
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        inputStreamM3765.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    inputStreamM52102.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (Throwable th9) {
            if (file3.exists()) {
                file3.delete();
            }
            throw th9;
        }
    }
}
