package p067l;

import com.google.android.material.motion.MotionUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5498 extends AbstractC14215 {

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC22097 f13141;

    public C5498(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        super(abstractC22343, interfaceC22097);
        this.f13141 = interfaceC22098;
    }

    public C5498(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, int i) {
        super(abstractC22343, interfaceC22097);
        this.f13141 = interfaceC22098;
    }

    @Override // p067l.InterfaceC9741
    public final String getName() {
        return this.f13141 + MotionUtils.EASING_TYPE_FORMAT_START + this.f40497 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final String mo12127(Collection collection) {
        InterfaceC22097 interfaceC22097 = this.f40497;
        return AbstractC14215.m32688(((InterfaceC22097) interfaceC22097.getFileSystem().getRootDirectories().iterator().next()).relativize(interfaceC22097));
    }

    @Override // p067l.AbstractC14215, p067l.InterfaceC9741
    public final URI toUri() {
        String string = this.f40497.toString();
        URI uriNormalize = this.f13141.toUri().normalize();
        String str = string.startsWith("/") ? "!" : "!/";
        try {
            return new URI("jar:" + uriNormalize + str + string);
        } catch (URISyntaxException e) {
            throw new C21592(uriNormalize + str + string, e);
        }
    }

    @Override // p067l.AbstractC14215
    public final String toString() {
        return "JarFileObject[" + this.f13141 + ":" + this.f40497 + "]";
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14215 mo12128(String str) {
        return new C5498(this.f40495, this.f40497.resolveSibling(str), this.f13141);
    }
}
