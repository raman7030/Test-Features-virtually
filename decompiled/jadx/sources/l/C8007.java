package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.۠ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8007 implements InterfaceC18278 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f24732;

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo21322(String str, EnumC16866 enumC16866) {
        return true;
    }

    public C8007(AbstractC10370 abstractC10370) {
        this.f24732 = abstractC10370;
    }

    @Override // l.InterfaceC7757
    public final URI toUri() {
        AbstractC10370 abstractC10370 = this.f24732;
        try {
            return new URI(null, abstractC10370.toString(), null);
        } catch (URISyntaxException e) {
            throw new C20227(abstractC10370.toString(), e);
        }
    }

    @Override // l.InterfaceC7757
    public final String getName() {
        return this.f24732.toString();
    }

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16866 mo21321() {
        return AbstractC21017.m47830(this.f24732.toString());
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
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo7388(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo20796() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ᩳ */
    public final long mo20798() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7757
    public final boolean delete() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8007) && this.f24732.equals(((C8007) obj).f24732);
    }

    public final int hashCode() {
        return this.f24732.hashCode();
    }
}
