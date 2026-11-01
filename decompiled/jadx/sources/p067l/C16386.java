package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

/* JADX INFO: renamed from: l.ܳ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZW */
/* JADX INFO: loaded from: classes5.dex */
public class C16386 implements InterfaceC19740 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC18398 f48145;

    /* JADX INFO: renamed from: ۧ */
    public final URI f48146;

    @Override // p067l.InterfaceC9741
    public final boolean delete() {
        return false;
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ᩳ */
    public final long mo22779() {
        return 0L;
    }

    public C16386(URI uri, EnumC18398 enumC18398) {
        C12826.requireNonNull(uri);
        C12826.requireNonNull(enumC18398);
        if (uri.getPath() == null) {
            throw new IllegalArgumentException("URI must have a path: " + uri);
        }
        this.f48146 = uri;
        this.f48145 = enumC18398;
    }

    @Override // p067l.InterfaceC9741
    public final String getName() {
        return this.f48146.getPath();
    }

    @Override // p067l.InterfaceC9741
    public final URI toUri() {
        return this.f48146;
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo22776() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ܿ */
    public final OutputStream mo22778() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo22777() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18398 mo23287() {
        return this.f48145;
    }

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23288(String str, EnumC18398 enumC18398) {
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(enumC18398.f54934);
        String string = sbM17248.toString();
        if (!enumC18398.equals(this.f48145)) {
            return false;
        }
        URI uri = this.f48146;
        return string.equals(uri.getPath()) || uri.getPath().endsWith("/".concat(string));
    }

    public final String toString() {
        return getClass().getName() + "[" + this.f48146 + "]";
    }
}
