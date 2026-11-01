package p067l;

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
public final class C14438 {

    /* JADX INFO: renamed from: ֫ */
    public final String f41250;

    /* JADX INFO: renamed from: ۜ */
    public C12427[] f41251;

    /* JADX INFO: renamed from: ۧ */
    public final AssetManager f41252;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC13038 f41253;

    /* JADX INFO: renamed from: ܽ */
    public final File f41254;

    /* JADX INFO: renamed from: ܿ */
    public boolean f41255 = false;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f41256;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f41257;

    /* JADX INFO: renamed from: ᩻ */
    public final Executor f41258;

    /* JADX INFO: renamed from: ֫ */
    private void m33041(final int i, final Serializable serializable) {
        this.f41258.execute(new Runnable() { // from class: l.۬᩹ۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f43135.f41253.mo8864(i, serializable);
            }
        });
    }

    public C14438(AssetManager assetManager, Executor executor, InterfaceC13038 interfaceC13038, String str, File file) {
        this.f41252 = assetManager;
        this.f41258 = executor;
        this.f41253 = interfaceC13038;
        this.f41250 = str;
        this.f41254 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C20414.f63090;
                    break;
                case 26:
                    bArr = C20414.f63092;
                    break;
                case 27:
                    bArr = C20414.f63091;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C20414.f63089;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = C20414.f63093;
                    break;
            }
        }
        this.f41256 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33043() {
        if (this.f41256 == null) {
            m33041(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f41254;
        if (file.exists()) {
            if (!file.canWrite()) {
                m33041(4, (Serializable) null);
                return false;
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                m33041(4, (Serializable) null);
                return false;
            }
        }
        this.f41255 = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009b A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[Catch: IllegalStateException -> 0x00c0, IOException -> 0x00c7, FileNotFoundException -> 0x00cc, TRY_LEAVE, TryCatch #10 {FileNotFoundException -> 0x00cc, IOException -> 0x00c7, IllegalStateException -> 0x00c0, blocks: (B:55:0x0087, B:60:0x00a5, B:71:0x00bc, B:69:0x00b9, B:68:0x00b6), top: B:97:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final C14438 m33044() {
        FileInputStream fileInputStreamM33040;
        C12427[] c12427ArrM26903;
        int i;
        FileInputStream fileInputStreamM33041;
        AssetManager assetManager = this.f41252;
        InterfaceC13038 interfaceC13038 = this.f41253;
        if (!this.f41255) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f41256;
        if (bArr != null) {
            C14438 c14438 = null;
            try {
                fileInputStreamM33040 = m33040(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                interfaceC13038.mo8864(6, e);
                fileInputStreamM33040 = null;
            } catch (IOException e2) {
                interfaceC13038.mo8864(7, e2);
                fileInputStreamM33040 = null;
            }
            try {
                if (fileInputStreamM33040 != null) {
                    try {
                        if (!Arrays.equals(C11697.f32620, C8403.m19568(fileInputStreamM33040, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c12427ArrM26903 = C11697.m26903(fileInputStreamM33040, C8403.m19568(fileInputStreamM33040, 4), this.f41250);
                        try {
                            fileInputStreamM33040.close();
                        } catch (IOException e3) {
                            interfaceC13038.mo8864(7, e3);
                        }
                        this.f41251 = c12427ArrM26903;
                    } catch (IOException e4) {
                        interfaceC13038.mo8864(7, e4);
                        try {
                            fileInputStreamM33040.close();
                        } catch (IOException e5) {
                            interfaceC13038.mo8864(7, e5);
                        }
                        c12427ArrM26903 = null;
                    } catch (IllegalStateException e6) {
                        interfaceC13038.mo8864(8, e6);
                        fileInputStreamM33040.close();
                        c12427ArrM26903 = null;
                    }
                }
                C12427[] c12427Arr = this.f41251;
                if (c12427Arr != null && (i = Build.VERSION.SDK_INT) >= 24 && i <= 34) {
                    if (i == 24 || i == 25) {
                        try {
                            fileInputStreamM33041 = m33040(assetManager, "dexopt/baseline.profm");
                            if (fileInputStreamM33041 != null) {
                                try {
                                    if (Arrays.equals(C11697.f32621, C8403.m19568(fileInputStreamM33041, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f41251 = C11697.m26904(fileInputStreamM33041, C8403.m19568(fileInputStreamM33041, 4), bArr, c12427Arr);
                                    fileInputStreamM33041.close();
                                    c14438 = this;
                                } catch (Throwable th) {
                                    try {
                                        fileInputStreamM33041.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else if (fileInputStreamM33041 != null) {
                                fileInputStreamM33041.close();
                            }
                        } catch (FileNotFoundException e7) {
                            interfaceC13038.mo8864(9, e7);
                        } catch (IOException e8) {
                            interfaceC13038.mo8864(7, e8);
                        } catch (IllegalStateException e9) {
                            this.f41251 = null;
                            interfaceC13038.mo8864(8, e9);
                        }
                        if (c14438 != null) {
                            return c14438;
                        }
                    } else {
                        switch (i) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                fileInputStreamM33041 = m33040(assetManager, "dexopt/baseline.profm");
                                if (fileInputStreamM33041 != null) {
                                    if (Arrays.equals(C11697.f32621, C8403.m19568(fileInputStreamM33041, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f41251 = C11697.m26904(fileInputStreamM33041, C8403.m19568(fileInputStreamM33041, 4), bArr, c12427Arr);
                                    fileInputStreamM33041.close();
                                    c14438 = this;
                                } else if (fileInputStreamM33041 != null) {
                                    fileInputStreamM33041.close();
                                }
                                if (c14438 != null) {
                                    return c14438;
                                }
                            default:
                                return this;
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamM33040.close();
                } catch (IOException e10) {
                    interfaceC13038.mo8864(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private FileInputStream m33040(AssetManager assetManager, String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public final void m33045() {
        byte[] bArr;
        InterfaceC13038 interfaceC13038 = this.f41253;
        C12427[] c12427Arr = this.f41251;
        if (c12427Arr == null || (bArr = this.f41256) == null) {
            return;
        }
        if (!this.f41255) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(C11697.f32620);
                byteArrayOutputStream.write(bArr);
                if (!C11697.m26897(byteArrayOutputStream, bArr, c12427Arr)) {
                    interfaceC13038.mo8864(5, null);
                    this.f41251 = null;
                    byteArrayOutputStream.close();
                } else {
                    this.f41257 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f41251 = null;
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
            interfaceC13038.mo8864(7, e);
        } catch (IllegalStateException e2) {
            interfaceC13038.mo8864(8, e2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m33046() {
        byte[] bArr = this.f41257;
        if (bArr != null) {
            if (!this.f41255) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f41254);
                        try {
                            byte[] bArr2 = new byte[512];
                            while (true) {
                                int i = byteArrayInputStream.read(bArr2);
                                if (i > 0) {
                                    fileOutputStream.write(bArr2, 0, i);
                                } else {
                                    m33041(1, (Serializable) null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    this.f41257 = null;
                                    this.f41251 = null;
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
                    this.f41257 = null;
                    this.f41251 = null;
                    throw th5;
                }
            } catch (FileNotFoundException e) {
                m33041(6, e);
                this.f41257 = null;
                this.f41251 = null;
                return false;
            } catch (IOException e2) {
                m33041(7, e2);
                this.f41257 = null;
                this.f41251 = null;
                return false;
            }
        }
        return false;
    }
}
