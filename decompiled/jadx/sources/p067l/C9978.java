package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.۠ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9978 implements InterfaceC19740 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 f27646;

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23288(String str, EnumC18398 enumC18398) {
        return true;
    }

    public C9978(AbstractC12224 abstractC12224) {
        this.f27646 = abstractC12224;
    }

    @Override // p067l.InterfaceC9741
    public final URI toUri() {
        AbstractC12224 abstractC12224 = this.f27646;
        try {
            return new URI(null, abstractC12224.toString(), null);
        } catch (URISyntaxException e) {
            throw new C21592(abstractC12224.toString(), e);
        }
    }

    @Override // p067l.InterfaceC9741
    public final String getName() {
        return this.f27646.toString();
    }

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18398 mo23287() {
        return AbstractC22343.m50160(this.f27646.toString());
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
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo9471(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo22777() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ᩳ */
    public final long mo22779() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC9741
    public final boolean delete() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9978) && this.f27646.equals(((C9978) obj).f27646);
    }

    public final int hashCode() {
        return this.f27646.hashCode();
    }
}
