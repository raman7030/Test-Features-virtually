package l;

import com.google.android.material.motion.MotionUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3293 extends AbstractC12465 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f10333;

    public C3293(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        super(abstractC21017, interfaceC20758);
        this.f10333 = interfaceC20759;
    }

    public C3293(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, int i) {
        super(abstractC21017, interfaceC20758);
        this.f10333 = interfaceC20759;
    }

    @Override // l.InterfaceC7757
    public final String getName() {
        return this.f10333 + MotionUtils.EASING_TYPE_FORMAT_START + this.f37477 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo10092(Collection collection) {
        InterfaceC20758 interfaceC20758 = this.f37477;
        return AbstractC12465.m30623(((InterfaceC20758) interfaceC20758.getFileSystem().getRootDirectories().iterator().next()).relativize(interfaceC20758));
    }

    @Override // l.AbstractC12465, l.InterfaceC7757
    public final URI toUri() {
        String string = this.f37477.toString();
        URI uriNormalize = this.f10333.toUri().normalize();
        String str = string.startsWith("/") ? "!" : "!/";
        try {
            return new URI("jar:" + uriNormalize + str + string);
        } catch (URISyntaxException e) {
            throw new C20227(uriNormalize + str + string, e);
        }
    }

    @Override // l.AbstractC12465
    public final String toString() {
        return "JarFileObject[" + this.f10333 + ":" + this.f37477 + "]";
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12465 mo10093(String str) {
        return new C3293(this.f37475, this.f37477.resolveSibling(str), this.f10333);
    }
}
