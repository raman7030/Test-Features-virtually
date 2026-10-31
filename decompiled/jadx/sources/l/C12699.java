package l;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.۫᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9OF */
/* JADX INFO: loaded from: classes3.dex */
public final class C12699 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38222;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10583[] f38223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AssetManager f38224;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11226 f38225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f38226;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38227 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f38228;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f38229;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Executor f38230;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30963(final int i, final Serializable serializable) {
        this.f38230.execute(new Runnable() { // from class: l.۬᩹ۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f40065.f38225.mo6738(i, serializable);
            }
        });
    }

    public C12699(AssetManager assetManager, Executor executor, InterfaceC11226 interfaceC11226, String str, File file) {
        this.f38224 = assetManager;
        this.f38230 = executor;
        this.f38225 = interfaceC11226;
        this.f38222 = str;
        this.f38226 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C18987.f59862;
                    break;
                case 26:
                    bArr = C18987.f59864;
                    break;
                case 27:
                    bArr = C18987.f59863;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C18987.f59861;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = C18987.f59865;
                    break;
            }
        }
        this.f38228 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30965() {
        if (this.f38228 == null) {
            m30963(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f38226;
        if (file.exists()) {
            if (!file.canWrite()) {
                m30963(4, (Serializable) null);
                return false;
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                m30963(4, (Serializable) null);
                return false;
            }
        }
        this.f38227 = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009b A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[Catch: IllegalStateException -> 0x00c0, IOException -> 0x00c7, FileNotFoundException -> 0x00cc, TRY_LEAVE, TryCatch #10 {FileNotFoundException -> 0x00cc, IOException -> 0x00c7, IllegalStateException -> 0x00c0, blocks: (B:55:0x0087, B:60:0x00a5, B:71:0x00bc, B:69:0x00b9, B:68:0x00b6), top: B:97:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12699 m30966() {
        FileInputStream fileInputStreamM30962;
        C10583[] c10583ArrM24888;
        int i;
        FileInputStream fileInputStreamM30963;
        AssetManager assetManager = this.f38224;
        InterfaceC11226 interfaceC11226 = this.f38225;
        if (!this.f38227) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f38228;
        if (bArr != null) {
            C12699 c12699 = null;
            try {
                fileInputStreamM30962 = m30962(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                interfaceC11226.mo6738(6, e);
                fileInputStreamM30962 = null;
            } catch (IOException e2) {
                interfaceC11226.mo6738(7, e2);
                fileInputStreamM30962 = null;
            }
            try {
                if (fileInputStreamM30962 != null) {
                    try {
                        if (!Arrays.equals(C9815.f29669, C6349.m17628(fileInputStreamM30962, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c10583ArrM24888 = C9815.m24888(fileInputStreamM30962, C6349.m17628(fileInputStreamM30962, 4), this.f38222);
                        try {
                            fileInputStreamM30962.close();
                        } catch (IOException e3) {
                            interfaceC11226.mo6738(7, e3);
                        }
                        this.f38223 = c10583ArrM24888;
                    } catch (IOException e4) {
                        interfaceC11226.mo6738(7, e4);
                        try {
                            fileInputStreamM30962.close();
                        } catch (IOException e5) {
                            interfaceC11226.mo6738(7, e5);
                        }
                        c10583ArrM24888 = null;
                    } catch (IllegalStateException e6) {
                        interfaceC11226.mo6738(8, e6);
                        fileInputStreamM30962.close();
                        c10583ArrM24888 = null;
                    }
                }
                C10583[] c10583Arr = this.f38223;
                if (c10583Arr != null && (i = Build.VERSION.SDK_INT) >= 24 && i <= 34) {
                    if (i == 24 || i == 25) {
                        try {
                            fileInputStreamM30963 = m30962(assetManager, "dexopt/baseline.profm");
                            if (fileInputStreamM30963 != null) {
                                try {
                                    if (Arrays.equals(C9815.f29670, C6349.m17628(fileInputStreamM30963, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f38223 = C9815.m24889(fileInputStreamM30963, C6349.m17628(fileInputStreamM30963, 4), bArr, c10583Arr);
                                    fileInputStreamM30963.close();
                                    c12699 = this;
                                } catch (Throwable th) {
                                    try {
                                        fileInputStreamM30963.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else if (fileInputStreamM30963 != null) {
                                fileInputStreamM30963.close();
                            }
                        } catch (FileNotFoundException e7) {
                            interfaceC11226.mo6738(9, e7);
                        } catch (IOException e8) {
                            interfaceC11226.mo6738(7, e8);
                        } catch (IllegalStateException e9) {
                            this.f38223 = null;
                            interfaceC11226.mo6738(8, e9);
                        }
                        if (c12699 != null) {
                            return c12699;
                        }
                    } else {
                        switch (i) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                fileInputStreamM30963 = m30962(assetManager, "dexopt/baseline.profm");
                                if (fileInputStreamM30963 != null) {
                                    if (Arrays.equals(C9815.f29670, C6349.m17628(fileInputStreamM30963, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f38223 = C9815.m24889(fileInputStreamM30963, C6349.m17628(fileInputStreamM30963, 4), bArr, c10583Arr);
                                    fileInputStreamM30963.close();
                                    c12699 = this;
                                } else if (fileInputStreamM30963 != null) {
                                    fileInputStreamM30963.close();
                                }
                                if (c12699 != null) {
                                    return c12699;
                                }
                            default:
                                return this;
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamM30962.close();
                } catch (IOException e10) {
                    interfaceC11226.mo6738(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FileInputStream m30962(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30967() {
        byte[] bArr;
        InterfaceC11226 interfaceC11226 = this.f38225;
        C10583[] c10583Arr = this.f38223;
        if (c10583Arr == null || (bArr = this.f38228) == null) {
            return;
        }
        if (!this.f38227) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(C9815.f29669);
                byteArrayOutputStream.write(bArr);
                if (!C9815.m24882(byteArrayOutputStream, bArr, c10583Arr)) {
                    interfaceC11226.mo6738(5, null);
                    this.f38223 = null;
                    byteArrayOutputStream.close();
                } else {
                    this.f38229 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f38223 = null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            interfaceC11226.mo6738(7, e);
        } catch (IllegalStateException e2) {
            interfaceC11226.mo6738(8, e2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m30968() {
        byte[] bArr = this.f38229;
        if (bArr != null) {
            if (!this.f38227) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f38226);
                        try {
                            byte[] bArr2 = new byte[512];
                            while (true) {
                                int i = byteArrayInputStream.read(bArr2);
                                if (i > 0) {
                                    fileOutputStream.write(bArr2, 0, i);
                                } else {
                                    m30963(1, (Serializable) null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    this.f38229 = null;
                                    this.f38223 = null;
                                    return true;
                                }
                                try {
                                    byteArrayInputStream.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        byteArrayInputStream.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    this.f38229 = null;
                    this.f38223 = null;
                    throw th5;
                }
            } catch (FileNotFoundException e) {
                m30963(6, e);
                this.f38229 = null;
                this.f38223 = null;
                return false;
            } catch (IOException e2) {
                m30963(7, e2);
                this.f38229 = null;
                this.f38223 = null;
                return false;
            }
        }
        return false;
    }
}
