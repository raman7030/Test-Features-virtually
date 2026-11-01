package p067l;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6WY */
/* JADX INFO: loaded from: classes.dex */
public final class C23750 extends IOException {

    /* JADX INFO: renamed from: ۙ */
    public final String f75546;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC23080 f75547;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC15032 f75548;

    /* JADX INFO: renamed from: ᩹ */
    public final String f75549;

    public C23750(EnumC15032 enumC15032, EnumC23080 enumC23080, String str, String str2, String str3) {
        super(str3);
        this.f75548 = enumC15032;
        this.f75547 = enumC23080;
        this.f75549 = str;
        this.f75546 = str2;
    }

    public C23750(EnumC15032 enumC15032, EnumC23080 enumC23080, String str, String str2, String str3, Throwable th) {
        super(str3, th);
        this.f75548 = enumC15032;
        this.f75547 = enumC23080;
        this.f75549 = str;
        this.f75546 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC15032 m52797() {
        return this.f75548;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC23080 m52799() {
        return this.f75547;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m52798() {
        return this.f75549;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m52800() {
        return this.f75546;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23750 m52793(EnumC15032 enumC15032, String str, String str2, ErrnoException errnoException) {
        EnumC23080 enumC23080;
        int i = errnoException.errno;
        if (i == OsConstants.ENOENT) {
            enumC23080 = EnumC23080.NOT_FOUND;
        } else if (i == OsConstants.EEXIST) {
            enumC23080 = EnumC23080.ALREADY_EXISTS;
        } else if (i == OsConstants.ENOTDIR) {
            enumC23080 = EnumC23080.NOT_DIRECTORY;
        } else if (i == OsConstants.EISDIR) {
            enumC23080 = EnumC23080.NOT_REGULAR_FILE;
        } else if (i == OsConstants.ENOTEMPTY) {
            enumC23080 = EnumC23080.DIRECTORY_NOT_EMPTY;
        } else if (i == OsConstants.EACCES || i == OsConstants.EPERM || i == OsConstants.EROFS) {
            enumC23080 = EnumC23080.PERMISSION_DENIED;
        } else if (i == OsConstants.EXDEV) {
            enumC23080 = EnumC23080.CROSS_BACKEND;
        } else if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP || i == OsConstants.EOPNOTSUPP) {
            enumC23080 = EnumC23080.UNSUPPORTED;
        } else {
            enumC23080 = EnumC23080.IO_ERROR;
        }
        return new C23750(enumC15032, enumC23080, str, str2, m52792(enumC15032, str, str2), errnoException);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23750 m52794(EnumC15032 enumC15032, String str, String str2, IOException iOException) {
        EnumC23080 enumC23080;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof ErrnoException) {
                return m52793(enumC15032, str, str2, (ErrnoException) cause);
            }
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("no such file") || lowerCase.contains("not found")) {
            enumC23080 = EnumC23080.NOT_FOUND;
        } else if (lowerCase.contains("file exists") || lowerCase.contains("already exists")) {
            enumC23080 = EnumC23080.ALREADY_EXISTS;
        } else if (lowerCase.contains("not a directory")) {
            enumC23080 = EnumC23080.NOT_DIRECTORY;
        } else if (lowerCase.contains("is a directory") || lowerCase.contains("not a regular file")) {
            enumC23080 = EnumC23080.NOT_REGULAR_FILE;
        } else if (lowerCase.contains("directory not empty")) {
            enumC23080 = EnumC23080.DIRECTORY_NOT_EMPTY;
        } else if (lowerCase.contains("permission denied") || lowerCase.contains("operation not permitted") || lowerCase.contains("read-only file system")) {
            enumC23080 = EnumC23080.PERMISSION_DENIED;
        } else if (lowerCase.contains("cross-device") || lowerCase.contains("cross device")) {
            enumC23080 = EnumC23080.CROSS_BACKEND;
        } else if (lowerCase.contains("unsupported") || lowerCase.contains("not supported")) {
            enumC23080 = EnumC23080.UNSUPPORTED;
        } else {
            enumC23080 = EnumC23080.IO_ERROR;
        }
        return new C23750(enumC15032, enumC23080, str, str2, m52792(enumC15032, str, str2), iOException);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23750 m52796(EnumC15032 enumC15032, String str, String str2) {
        return new C23750(enumC15032, EnumC23080.UNSUPPORTED, str, str2, C10965.m25286(new StringBuilder(), m52792(enumC15032, str, str2), " is unsupported"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23750 m52795(EnumC15032 enumC15032, EnumC23080 enumC23080, String str, String str2) {
        return new C23750(enumC15032, enumC23080, str, str2, m52792(enumC15032, str, str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52792(EnumC15032 enumC15032, String str, String str2) {
        if (str2 == null) {
            return "Checked file operation " + enumC15032 + " failed for " + str;
        }
        return "Checked file operation " + enumC15032 + " failed for " + str + " -> " + str2;
    }
}
