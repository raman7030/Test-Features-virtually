package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5CT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17425 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f52085 = 0;

    /* JADX INFO: renamed from: ܳ */
    public static String m39674(File file) throws IOException {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C10721.f29698;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        byte[] bArr = C23461.f74712;
        InputStream inputStreamNewInputStream = C18743.newInputStream(C9829.toPath(file), new InterfaceC24778[0]);
        try {
            if (inputStreamNewInputStream == null) {
                throw new NullPointerException("input");
            }
            String strM52175 = C23461.m52175(inputStreamNewInputStream, charsetDefaultCharset);
            inputStreamNewInputStream.close();
            return strM52175;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static List m39678(File file) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        InterfaceC22097 path = C9829.toPath(file);
        int i = C10721.f29698;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return C18743.readAllLines(path, charsetDefaultCharset);
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39671(File file) {
        C12826.requireNonNull(file, "file");
        try {
            InterfaceC15413 interfaceC15413M36569 = C16064.m36569(C9829.toPath(file), C16064.f47267, EnumC11372.OVERRIDE_READ_ONLY);
            if (interfaceC15413M36569.mo27626().get() >= 1 || interfaceC15413M36569.mo27625().get() >= 1) {
                return;
            }
            throw new FileNotFoundException("File does not exist: " + file);
        } catch (NoSuchFileException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (IOException e2) {
            throw new IOException("Cannot delete file: " + file, e2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39673(File file) throws IOException {
        C17073 c17073 = new C17073();
        C12826.requireNonNull(file, "directory");
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles((FileFilter) null);
            if (fileArrListFiles != null) {
                C20760.m46868(c17073, fileArrListFiles);
                return;
            } else {
                throw new IOException("Unknown I/O error listing contents of directory: " + file);
            }
        }
        if (file.exists()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: '" + file + "'");
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m39675(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                m39673(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m39677(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    /* JADX INFO: renamed from: ܿ */
    public static OutputStream m39676(File file) {
        return C16064.m36568(C9829.toPath(file));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39672(File file, byte[] bArr) {
        int length = bArr.length;
        OutputStream outputStreamM36568 = C16064.m36568(C9829.toPath(file));
        try {
            outputStreamM36568.write(bArr, 0, length);
            outputStreamM36568.close();
        } catch (Throwable th) {
            if (outputStreamM36568 != null) {
                try {
                    outputStreamM36568.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
