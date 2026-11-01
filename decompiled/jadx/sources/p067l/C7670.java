package p067l;

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
public final class C7670 extends AbstractC9159 {

    /* JADX INFO: renamed from: ۗ */
    public final C19561 f20117;

    /* JADX INFO: renamed from: ᩶ */
    public final C3646 f20119;

    /* JADX INFO: renamed from: ᩹ */
    public final C24925 f20121;

    /* JADX INFO: renamed from: ۙ */
    public final C5738 f20118 = new C5738("/");

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f20120 = false;

    @Override // p067l.AbstractC9159
    public final String getSeparator() {
        return "/";
    }

    @Override // p067l.AbstractC9159
    public final boolean isReadOnly() {
        return true;
    }

    public C7670(C3646 c3646, InterfaceC22097 interfaceC22097) {
        this.f20119 = c3646;
        C19561 c19561 = new C19561(interfaceC22097.toFile().getPath());
        this.f20117 = c19561;
        this.f20121 = new C24925(c19561.m44469());
    }

    @Override // p067l.AbstractC9159
    public final AbstractC15094 provider() {
        return this.f20119;
    }

    @Override // p067l.AbstractC9159, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20120) {
            return;
        }
        this.f20120 = true;
        this.f20117.close();
    }

    @Override // p067l.AbstractC9159
    public final boolean isOpen() {
        return !this.f20120;
    }

    @Override // p067l.AbstractC9159
    public final Iterable getRootDirectories() {
        return Collections.singleton(getPath("/", new String[0]));
    }

    @Override // p067l.AbstractC9159
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("getFileStores");
    }

    @Override // p067l.AbstractC9159
    public final Set supportedFileAttributeViews() {
        return Collections.singleton("basic");
    }

    @Override // p067l.AbstractC9159
    public final InterfaceC22097 getPath(String str, String... strArr) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : strArr) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '/' && !str2.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str2);
        }
        return new C10352(this, sb.toString());
    }

    @Override // p067l.AbstractC9159
    public final InterfaceC11368 getPathMatcher(String str) {
        return C3991.getDefault().getPathMatcher(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m17770(C10352 c10352) throws FileSystemException {
        if (!this.f20120) {
            C5738 c5738M17773 = m17773(c10352);
            if (c5738M17773.isDirectory()) {
                throw new FileSystemException(c10352.f52947, null, "Is a directory");
            }
            return this.f20117.m44448(c5738M17773);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final DirectoryStream m17771(C10352 c10352, DirectoryStream.Filter filter) {
        if (!this.f20120) {
            return new C2975(this, filter, c10352);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17772(C10352 c10352, EnumC13183... enumC13183Arr) throws NoSuchFileException, AccessDeniedException {
        if (!this.f20120) {
            m17773(c10352);
            for (EnumC13183 enumC13183 : enumC13183Arr) {
                if (enumC13183 == EnumC13183.WRITE) {
                    throw new AccessDeniedException(c10352.f52947, null, "Read-only file system");
                }
            }
            return;
        }
        throw new ClosedFileSystemException();
    }

    @Override // p067l.AbstractC9159
    public final AbstractC14049 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC9159
    public final InterfaceC7344 newWatchService() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5738 m17773(C10352 c10352) throws NoSuchFileException {
        C5738 c5738;
        String strSubstring = c10352.f52947;
        if (strSubstring.equals("/")) {
            c5738 = this.f20118;
        } else {
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            C19561 c19561 = this.f20117;
            C5738 entry = c19561.getEntry(strSubstring);
            if (entry == null) {
                String strM40053 = C17588.m40053(strSubstring, "/");
                C5738 entry2 = c19561.getEntry(strM40053);
                c5738 = entry2 == null ? (C5738) this.f20121.m7176(strM40053) : entry2;
            } else {
                c5738 = entry;
            }
        }
        if (c5738 != null) {
            return c5738;
        }
        throw new NoSuchFileException(c10352.f52947);
    }
}
