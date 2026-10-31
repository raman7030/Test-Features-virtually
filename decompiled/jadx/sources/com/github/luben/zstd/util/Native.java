package com.github.luben.zstd.util;

import com.umeng.commonsdk.statistics.idtracking.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;
import l.C3435;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public enum Native {
    ;

    public static final String libname = "libzstd-jni-1.5.7-7";
    public static final String libnameShort = "zstd-jni-1.5.7-7";
    public static final String nativePathOverride = "ZstdNativePath";
    public static final String tempFolderOverride = "ZstdTempFolder";
    public static final String errorMsg = C9045.m23341(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.7-7 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-7 in your system.");
    public static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        loaded.set(true);
    }

    public static synchronized boolean isLoaded() {
        return loaded.get();
    }

    public static String osName() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        if (strReplace.startsWith("win")) {
            return "win";
        }
        return strReplace.startsWith(g.a) ? "darwin" : strReplace;
    }

    public static String libExtension() {
        if (osName().contains("os_x") || osName().contains("darwin")) {
            return "dylib";
        }
        return osName().contains("win") ? "dll" : "so";
    }

    public static String resourceName() {
        String strOsName = osName();
        String property = System.getProperty("os.arch");
        if (strOsName.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        StringBuilder sbM10501 = C3435.m10501("/", strOsName, "/", property, "/libzstd-jni-1.5.7-7.");
        sbM10501.append(libExtension());
        return sbM10501.toString();
    }

    public static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    public static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    public static synchronized void load() {
        String property = System.getProperty(tempFolderOverride);
        if (property == null) {
            load(null);
        } else {
            load(new File(property));
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[Catch: IOException -> 0x014e, all -> 0x014f, TryCatch #2 {IOException -> 0x014e, blocks: (B:68:0x013b, B:70:0x0140, B:72:0x0145, B:74:0x014b), top: B:81:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0145 A[Catch: IOException -> 0x014e, all -> 0x014f, TryCatch #2 {IOException -> 0x014e, blocks: (B:68:0x013b, B:70:0x0140, B:72:0x0145, B:74:0x014b), top: B:81:0x013b }] */
    public static synchronized void load(File file) {
        Throwable th;
        File fileCreateTempFile;
        FileOutputStream fileOutputStream;
        IOException e;
        if (loaded.get()) {
            return;
        }
        String strResourceName = resourceName();
        String property = System.getProperty(nativePathOverride);
        if (property != null) {
            loadLibraryFile(property);
            loaded.set(true);
            return;
        }
        try {
            Class.forName("org.osgi.framework.BundleEvent");
            loadLibrary(libname);
            loaded.set(true);
        } catch (Throwable unused) {
            InputStream resourceAsStream = Native.class.getResourceAsStream(strResourceName);
            if (resourceAsStream == null) {
                try {
                    loadLibrary(libnameShort);
                    loaded.set(true);
                    return;
                } catch (UnsatisfiedLinkError e2) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e2.getMessage() + "\n" + errorMsg);
                    unsatisfiedLinkError.setStackTrace(e2.getStackTrace());
                    throw unsatisfiedLinkError;
                }
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                fileCreateTempFile = File.createTempFile(libname, "." + libExtension(), file);
                try {
                    fileCreateTempFile.deleteOnExit();
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = resourceAsStream.read(bArr);
                                if (i == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream;
                                    }
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream2 = fileOutputStream;
                                th = th;
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    if (fileCreateTempFile != null) {
                                        fileCreateTempFile.delete();
                                    }
                                } catch (IOException unused3) {
                                }
                                throw th;
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            try {
                                loadLibraryFile(fileCreateTempFile.getAbsolutePath());
                            } catch (UnsatisfiedLinkError e3) {
                                try {
                                    loadLibrary(libnameShort);
                                } catch (UnsatisfiedLinkError e4) {
                                    UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(e3.getMessage() + "\n" + e4.getMessage() + "\n" + errorMsg);
                                    unsatisfiedLinkError2.setStackTrace(e4.getStackTrace());
                                    throw unsatisfiedLinkError2;
                                }
                            }
                            loaded.set(true);
                            try {
                                resourceAsStream.close();
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (fileCreateTempFile.exists()) {
                                    fileCreateTempFile.delete();
                                }
                            } catch (IOException unused4) {
                            }
                        } catch (Throwable th2) {
                            fileOutputStream2 = fileOutputStream;
                            th = th2;
                            resourceAsStream.close();
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-7: " + e.getMessage());
                        exceptionInInitializerError.setStackTrace(e.getStackTrace());
                        throw exceptionInInitializerError;
                    }
                } catch (IOException e6) {
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    e = e6;
                    fileOutputStream = fileOutputStream3;
                    ExceptionInInitializerError exceptionInInitializerError2 = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-7: " + e.getMessage());
                    exceptionInInitializerError2.setStackTrace(e.getStackTrace());
                    throw exceptionInInitializerError2;
                } catch (Throwable th3) {
                    th = th3;
                    resourceAsStream.close();
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    if (fileCreateTempFile != null) {
                        fileCreateTempFile.delete();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                fileOutputStream = null;
                e = e7;
                fileCreateTempFile = null;
            } catch (Throwable th4) {
                th = th4;
                fileCreateTempFile = null;
            }
        }
    }
}
