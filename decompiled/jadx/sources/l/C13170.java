package l;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13170 extends AbstractC12465 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f39395;

    public C13170(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        super(abstractC21017, interfaceC20758);
        this.f39395 = interfaceC20759;
    }

    public C13170(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, int i) {
        super(abstractC21017, interfaceC20758);
        this.f39395 = interfaceC20759;
    }

    @Override // l.InterfaceC7757
    public final String getName() {
        return this.f39395.toString();
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ܳ */
    public final String mo30626() {
        return this.f39395.getFileName().toString();
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫ */
    public final String mo10092(Collection collection) {
        InterfaceC20758 absolutePath = this.f37477.toAbsolutePath();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC20758 absolutePath2 = ((InterfaceC20758) it.next()).toAbsolutePath();
            if (absolutePath.startsWith(absolutePath2)) {
                try {
                    InterfaceC20758 interfaceC20758Relativize = absolutePath2.relativize(absolutePath);
                    if (interfaceC20758Relativize != null) {
                        return AbstractC12465.m30623(interfaceC20758Relativize);
                    }
                    continue;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // l.AbstractC12465, l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public final EnumC16866 mo21321() {
        Set set = AbstractC21017.f67841;
        return AbstractC21017.m47830(this.f39395.getFileName().toString());
    }

    @Override // l.AbstractC12465, l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21322(String str, EnumC16866 enumC16866) {
        return AbstractC12465.m30624(this.f39395, str, enumC16866);
    }

    @Override // l.AbstractC12465, l.InterfaceC7757
    public final URI toUri() {
        return this.f39395.toUri().normalize();
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12465 mo10093(String str) {
        return new C13170(this.f37475, this.f37477.resolveSibling(str), this.f39395.resolveSibling(str));
    }
}
