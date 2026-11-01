package p067l;

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
public final class C22127 implements InterfaceC18773 {

    /* JADX INFO: renamed from: ܳ */
    public static final C22127 f70002 = new C22127(new C24808());

    /* JADX INFO: renamed from: ֫ */
    public final C24808 f70003;

    /* JADX INFO: renamed from: ۧ */
    public C8715 f70004;

    /* JADX INFO: renamed from: ܽ */
    public long f70005;

    /* JADX INFO: renamed from: ܿ */
    public boolean f70006;

    /* JADX INFO: renamed from: ᩳ */
    public RandomAccessFile f70007;

    @Override // p067l.InterfaceC18773
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C18102 mo42805(String str, String str2) {
        if (!m49918()) {
            return C18102.f54041;
        }
        try {
            return this.f70004.m20166(this.f70007, str, str2);
        } catch (IOException | RuntimeException unused) {
            this.f70006 = true;
            this.f70005 = SystemClock.elapsedRealtime();
            this.f70004 = null;
            RandomAccessFile randomAccessFile = this.f70007;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                this.f70007 = null;
            }
            return C18102.f54041;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:8:0x000a, B:13:0x001f, B:14:0x0022), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49920() {
        if (this.f70004 == null) {
            if (this.f70006) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f70005;
                if (jElapsedRealtime < 0 || jElapsedRealtime >= 60000) {
                    this.f70006 = false;
                }
            } else {
                this.f70006 = false;
            }
        }
        m49918();
    }

    /* JADX INFO: renamed from: ܽ */
    public static C22127 m49919() {
        return f70002;
    }

    public C22127(C24808 c24808) {
        this.f70003 = c24808;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m49918() {
        C8715 c8715M49917;
        C24808 c24808 = this.f70003;
        if (this.f70004 == null) {
            if (this.f70006) {
                return false;
            }
            try {
                File file = new File(C7050.m16219(), "mcp/xref");
                if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                    throw new IOException("Unable to create boot hierarchy directory");
                }
                File file2 = new File(file, "android_api_36_public_boot_hierarchy.index");
                try {
                    c8715M49917 = C8715.m20164(file2);
                } catch (IOException | RuntimeException unused) {
                    c8715M49917 = m49917(c24808, file, file2);
                }
                this.f70007 = new RandomAccessFile(file2, "r");
                this.f70004 = c8715M49917;
            } catch (IOException | RuntimeException unused2) {
                this.f70006 = true;
                this.f70005 = SystemClock.elapsedRealtime();
                this.f70004 = null;
                RandomAccessFile randomAccessFile = this.f70007;
                if (randomAccessFile == null) {
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused3) {
                }
                this.f70007 = null;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8715 m49917(C24808 c24808, File file, File file2) throws IOException {
        File file3 = new File(file, "android_api_36_public_boot_hierarchy.index.tmp");
        if (file3.exists() && !file3.delete()) {
            throw new IOException("Unable to delete stale boot hierarchy temp file");
        }
        try {
            InputStream inputStreamM54505 = c24808.m54505();
            try {
                InputStream inputStreamM6038 = C3410.m6038(inputStreamM54505);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int i = inputStreamM6038.read(bArr);
                                if (i == -1) {
                                    bufferedOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    inputStreamM6038.close();
                                    inputStreamM54505.close();
                                    if (j != 3415240) {
                                        throw new IOException("Boot hierarchy download size mismatch");
                                    }
                                    C8715 c8715M20164 = C8715.m20164(file3);
                                    if (!file3.renameTo(file2)) {
                                        throw new IOException("Unable to publish boot hierarchy index");
                                    }
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    return c8715M20164;
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
                        inputStreamM6038.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    inputStreamM54505.close();
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
