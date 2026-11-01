package p067l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12318 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C8294 f34382;

    /* JADX INFO: renamed from: ᩶ */
    public EnumC22423 f34384;

    /* JADX INFO: renamed from: ᩹ */
    public Set f34386 = null;

    /* JADX INFO: renamed from: ۙ */
    public Iterator f34383 = Arrays.asList(EnumC22423.MODULE_SOURCE_PATH, EnumC22423.UPGRADE_MODULE_PATH, EnumC22423.SYSTEM_MODULES, EnumC22423.MODULE_PATH).iterator();

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f34385 = null;

    public C12318(C8294 c8294) {
        this.f34382 = c8294;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f34386 == null) {
            while (true) {
                Iterator it = this.f34385;
                if (it == null || !it.hasNext()) {
                    Iterator it2 = this.f34383;
                    if (!it2.hasNext()) {
                        return false;
                    }
                    this.f34384 = (EnumC22423) it2.next();
                    try {
                        this.f34385 = this.f34382.f21962.mo4111(this.f34384).iterator();
                    } catch (IOException e) {
                        System.err.println("error listing module locations for " + this.f34384 + ": " + e);
                    }
                }
            }
            if (this.f34385.hasNext()) {
                this.f34386 = (Set) this.f34385.next();
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f34386;
        if (set != null) {
            this.f34386 = null;
            return set;
        }
        throw new NoSuchElementException();
    }
}
