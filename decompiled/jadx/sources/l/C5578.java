package l;

import java.io.InputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.ClosedFileSystemException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5578 extends AbstractC7145 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18090 f17277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1344 f17279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23734 f17281;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3545 f17278 = new C3545("/");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f17280 = false;

    @Override // l.AbstractC7145
    public final String getSeparator() {
        return "/";
    }

    @Override // l.AbstractC7145
    public final boolean isReadOnly() {
        return true;
    }

    public C5578(C1344 c1344, InterfaceC20758 interfaceC20758) {
        this.f17279 = c1344;
        C18090 c18090 = new C18090(interfaceC20758.toFile().getPath());
        this.f17277 = c18090;
        this.f17281 = new C23734(c18090.m42210());
    }

    @Override // l.AbstractC7145
    public final AbstractC13389 provider() {
        return this.f17279;
    }

    @Override // l.AbstractC7145, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17280) {
            return;
        }
        this.f17280 = true;
        this.f17277.close();
    }

    @Override // l.AbstractC7145
    public final boolean isOpen() {
        return !this.f17280;
    }

    @Override // l.AbstractC7145
    public final Iterable getRootDirectories() {
        return Collections.singleton(getPath("/", new String[0]));
    }

    @Override // l.AbstractC7145
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("getFileStores");
    }

    @Override // l.AbstractC7145
    public final Set supportedFileAttributeViews() {
        return Collections.singleton("basic");
    }

    @Override // l.AbstractC7145
    public final InterfaceC20758 getPath(String str, String... strArr) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : strArr) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '/' && !str2.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str2);
        }
        return new C8400(this, sb.toString());
    }

    @Override // l.AbstractC7145
    public final InterfaceC9469 getPathMatcher(String str) {
        return C1707.getDefault().getPathMatcher(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m15855(C8400 c8400) throws FileSystemException {
        if (!this.f17280) {
            C3545 c3545M15858 = m15858(c8400);
            if (c3545M15858.isDirectory()) {
                throw new FileSystemException(c8400.f49781, null, "Is a directory");
            }
            return this.f17277.m42189(c3545M15858);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DirectoryStream m15856(C8400 c8400, DirectoryStream.Filter filter) {
        if (!this.f17280) {
            return new C0638(this, filter, c8400);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15857(C8400 c8400, EnumC11379... enumC11379Arr) throws NoSuchFileException, AccessDeniedException {
        if (!this.f17280) {
            m15858(c8400);
            for (EnumC11379 enumC11379 : enumC11379Arr) {
                if (enumC11379 == EnumC11379.WRITE) {
                    throw new AccessDeniedException(c8400.f49781, null, "Read-only file system");
                }
            }
            return;
        }
        throw new ClosedFileSystemException();
    }

    @Override // l.AbstractC7145
    public final AbstractC12290 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7145
    public final InterfaceC5235 newWatchService() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3545 m15858(C8400 c8400) throws NoSuchFileException {
        C3545 c3545;
        String strSubstring = c8400.f49781;
        if (strSubstring.equals("/")) {
            c3545 = this.f17278;
        } else {
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            C18090 c18090 = this.f17277;
            C3545 entry = c18090.getEntry(strSubstring);
            if (entry == null) {
                String strM37867 = C16014.m37867(strSubstring, "/");
                C3545 entry2 = c18090.getEntry(strM37867);
                c3545 = entry2 == null ? (C3545) this.f17281.m4933(strM37867) : entry2;
            } else {
                c3545 = entry;
            }
        }
        if (c3545 != null) {
            return c3545;
        }
        throw new NoSuchFileException(c8400.f49781);
    }
}
