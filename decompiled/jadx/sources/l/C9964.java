package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: l.ۤ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABKA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9964 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m25119(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12080 m25117(Context context, String[] strArr, String str) {
        String[] strArrM25119 = m25119(context);
        int length = strArrM25119.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrM25119[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String string = sb.toString();
                            C7141.m19155("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                C12080 c12080 = new C12080();
                                c12080.f36121 = zipFile;
                                c12080.f36120 = entry;
                                return c12080;
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m25120(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m25119(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25121(Context context, String[] strArr, String str, File file, C7141 c7141) throws Throwable {
        String[] strArrM25120;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        C12080 c12080 = null;
        FileOutputStream fileOutputStream3 = null;
        InputStream inputStream2 = null;
        try {
            C12080 c12080M25117 = m25117(context, strArr, str);
            try {
                if (c12080M25117 == null) {
                    try {
                        strArrM25120 = m25120(context, str);
                    } catch (Exception e) {
                        strArrM25120 = new String[]{e.toString()};
                    }
                    StringBuilder sbM9834 = C3200.m9834("Could not find '", str, "'. Looked for: ");
                    sbM9834.append(Arrays.toString(strArr));
                    sbM9834.append(", but only found: ");
                    throw new C5730(C9045.m23341(sbM9834, Arrays.toString(strArrM25120), "."));
                }
                ZipFile zipFile = c12080M25117.f36121;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i >= 5) {
                        break;
                    }
                    C7141.m19155("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = zipFile.getInputStream(c12080M25117.f36120);
                                try {
                                    fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j = 0;
                                            while (true) {
                                                int i3 = inputStream.read(bArr);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                fileOutputStream2.write(bArr, 0, i3);
                                                j += (long) i3;
                                            }
                                            fileOutputStream2.flush();
                                            fileOutputStream2.getFD().sync();
                                            if (j == file.length()) {
                                                m25118(inputStream);
                                                m25118(fileOutputStream2);
                                                file.setReadable(true, false);
                                                file.setExecutable(true, false);
                                                file.setWritable(true);
                                                break;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream3 = fileOutputStream2;
                                            fileOutputStream = fileOutputStream3;
                                            inputStream2 = inputStream;
                                            m25118(inputStream2);
                                            m25118(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException | IOException unused) {
                                    }
                                } catch (FileNotFoundException | IOException unused2) {
                                    fileOutputStream2 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (FileNotFoundException | IOException unused3) {
                                inputStream = null;
                                fileOutputStream2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                            m25118(inputStream);
                            m25118(fileOutputStream2);
                        }
                    } catch (IOException unused4) {
                    }
                    i = i2;
                }
                try {
                    zipFile.close();
                } catch (IOException unused5) {
                }
            } catch (Throwable th4) {
                th = th4;
                c12080 = c12080M25117;
                if (c12080 != null) {
                    try {
                        c12080.f36121.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25118(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
