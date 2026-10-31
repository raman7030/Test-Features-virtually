package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

/* JADX INFO: renamed from: l.ܳ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZW */
/* JADX INFO: loaded from: classes5.dex */
public class C14749 implements InterfaceC18278 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16866 f45032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final URI f45033;

    @Override // l.InterfaceC7757
    public final boolean delete() {
        return false;
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ᩳ */
    public final long mo20798() {
        return 0L;
    }

    public C14749(URI uri, EnumC16866 enumC16866) {
        C11003.requireNonNull(uri);
        C11003.requireNonNull(enumC16866);
        if (uri.getPath() == null) {
            throw new IllegalArgumentException("URI must have a path: " + uri);
        }
        this.f45033 = uri;
        this.f45032 = enumC16866;
    }

    @Override // l.InterfaceC7757
    public final String getName() {
        return this.f45033.getPath();
    }

    @Override // l.InterfaceC7757
    public final URI toUri() {
        return this.f45033;
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo20795() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ܿ */
    public final OutputStream mo20797() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo20796() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public final EnumC16866 mo21321() {
        return this.f45032;
    }

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21322(String str, EnumC16866 enumC16866) {
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(enumC16866.f51754);
        String string = sbM15339.toString();
        if (!enumC16866.equals(this.f45032)) {
            return false;
        }
        URI uri = this.f45033;
        return string.equals(uri.getPath()) || uri.getPath().endsWith("/".concat(string));
    }

    public final String toString() {
        return getClass().getName() + "[" + this.f45033 + "]";
    }
}
