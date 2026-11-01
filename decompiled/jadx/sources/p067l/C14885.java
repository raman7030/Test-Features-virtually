package p067l;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14885 extends AbstractC14215 {

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC22097 f42457;

    public C14885(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        super(abstractC22343, interfaceC22097);
        this.f42457 = interfaceC22098;
    }

    public C14885(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, int i) {
        super(abstractC22343, interfaceC22097);
        this.f42457 = interfaceC22098;
    }

    @Override // p067l.InterfaceC9741
    public final String getName() {
        return this.f42457.toString();
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ܳ */
    public final String mo32691() {
        return this.f42457.getFileName().toString();
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final String mo12127(Collection collection) {
        InterfaceC22097 absolutePath = this.f40497.toAbsolutePath();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC22097 absolutePath2 = ((InterfaceC22097) it.next()).toAbsolutePath();
            if (absolutePath.startsWith(absolutePath2)) {
                try {
                    InterfaceC22097 interfaceC22097Relativize = absolutePath2.relativize(absolutePath);
                    if (interfaceC22097Relativize != null) {
                        return AbstractC14215.m32688(interfaceC22097Relativize);
                    }
                    continue;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // p067l.AbstractC14215, p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18398 mo23287() {
        Set set = AbstractC22343.f70526;
        return AbstractC22343.m50160(this.f42457.getFileName().toString());
    }

    @Override // p067l.AbstractC14215, p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23288(String str, EnumC18398 enumC18398) {
        return AbstractC14215.m32689(this.f42457, str, enumC18398);
    }

    @Override // p067l.AbstractC14215, p067l.InterfaceC9741
    public final URI toUri() {
        return this.f42457.toUri().normalize();
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14215 mo12128(String str) {
        return new C14885(this.f40495, this.f40497.resolveSibling(str), this.f42457.resolveSibling(str));
    }
}
