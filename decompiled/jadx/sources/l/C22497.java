package l;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6WY */
/* JADX INFO: loaded from: classes.dex */
public final class C22497 extends IOException {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f72820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC21792 f72821;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC13324 f72822;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f72823;

    public C22497(EnumC13324 enumC13324, EnumC21792 enumC21792, String str, String str2, String str3) {
        super(str3);
        this.f72822 = enumC13324;
        this.f72821 = enumC21792;
        this.f72823 = str;
        this.f72820 = str2;
    }

    public C22497(EnumC13324 enumC13324, EnumC21792 enumC21792, String str, String str2, String str3, Throwable th) {
        super(str3, th);
        this.f72822 = enumC13324;
        this.f72821 = enumC21792;
        this.f72823 = str;
        this.f72820 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC13324 m50456() {
        return this.f72822;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC21792 m50458() {
        return this.f72821;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m50457() {
        return this.f72823;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m50459() {
        return this.f72820;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22497 m50452(EnumC13324 enumC13324, String str, String str2, ErrnoException errnoException) {
        EnumC21792 enumC21792;
        int i = errnoException.errno;
        if (i == OsConstants.ENOENT) {
            enumC21792 = EnumC21792.NOT_FOUND;
        } else if (i == OsConstants.EEXIST) {
            enumC21792 = EnumC21792.ALREADY_EXISTS;
        } else if (i == OsConstants.ENOTDIR) {
            enumC21792 = EnumC21792.NOT_DIRECTORY;
        } else if (i == OsConstants.EISDIR) {
            enumC21792 = EnumC21792.NOT_REGULAR_FILE;
        } else if (i == OsConstants.ENOTEMPTY) {
            enumC21792 = EnumC21792.DIRECTORY_NOT_EMPTY;
        } else if (i == OsConstants.EACCES || i == OsConstants.EPERM || i == OsConstants.EROFS) {
            enumC21792 = EnumC21792.PERMISSION_DENIED;
        } else if (i == OsConstants.EXDEV) {
            enumC21792 = EnumC21792.CROSS_BACKEND;
        } else if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP || i == OsConstants.EOPNOTSUPP) {
            enumC21792 = EnumC21792.UNSUPPORTED;
        } else {
            enumC21792 = EnumC21792.IO_ERROR;
        }
        return new C22497(enumC13324, enumC21792, str, str2, m50451(enumC13324, str, str2), errnoException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22497 m50453(EnumC13324 enumC13324, String str, String str2, IOException iOException) {
        EnumC21792 enumC21792;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof ErrnoException) {
                return m50452(enumC13324, str, str2, (ErrnoException) cause);
            }
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("no such file") || lowerCase.contains("not found")) {
            enumC21792 = EnumC21792.NOT_FOUND;
        } else if (lowerCase.contains("file exists") || lowerCase.contains("already exists")) {
            enumC21792 = EnumC21792.ALREADY_EXISTS;
        } else if (lowerCase.contains("not a directory")) {
            enumC21792 = EnumC21792.NOT_DIRECTORY;
        } else if (lowerCase.contains("is a directory") || lowerCase.contains("not a regular file")) {
            enumC21792 = EnumC21792.NOT_REGULAR_FILE;
        } else if (lowerCase.contains("directory not empty")) {
            enumC21792 = EnumC21792.DIRECTORY_NOT_EMPTY;
        } else if (lowerCase.contains("permission denied") || lowerCase.contains("operation not permitted") || lowerCase.contains("read-only file system")) {
            enumC21792 = EnumC21792.PERMISSION_DENIED;
        } else if (lowerCase.contains("cross-device") || lowerCase.contains("cross device")) {
            enumC21792 = EnumC21792.CROSS_BACKEND;
        } else if (lowerCase.contains("unsupported") || lowerCase.contains("not supported")) {
            enumC21792 = EnumC21792.UNSUPPORTED;
        } else {
            enumC21792 = EnumC21792.IO_ERROR;
        }
        return new C22497(enumC13324, enumC21792, str, str2, m50451(enumC13324, str, str2), iOException);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22497 m50455(EnumC13324 enumC13324, String str, String str2) {
        return new C22497(enumC13324, EnumC21792.UNSUPPORTED, str, str2, C9045.m23341(new StringBuilder(), m50451(enumC13324, str, str2), " is unsupported"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22497 m50454(EnumC13324 enumC13324, EnumC21792 enumC21792, String str, String str2) {
        return new C22497(enumC13324, enumC21792, str, str2, m50451(enumC13324, str, str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50451(EnumC13324 enumC13324, String str, String str2) {
        if (str2 == null) {
            return "Checked file operation " + enumC13324 + " failed for " + str;
        }
        return "Checked file operation " + enumC13324 + " failed for " + str + " -> " + str2;
    }
}
