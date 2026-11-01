package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9364 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C12913 f25514;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19618 f25515;

    public C9364(C19618 c19618) {
        this.f25515 = c19618;
        this.f25514 = c19618.f59658;
        this.f25514 = m21760();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12913 m21760() {
        C12913 c12913 = this.f25514.f36306;
        C19618 c19618 = this.f25515;
        if (c12913 == c19618.f59657) {
            return null;
        }
        while (c12913.f36306 != c19618.f59657) {
            int i = c12913.f36304;
            C12913 c12914 = c12913.f36306;
            if (i != c12914.f36307 || !c12913.f36305.equals(c12914.f36305)) {
                break;
            }
            C12913 c12915 = c12913.f36306;
            c12913.f36304 = c12915.f36304;
            C12913 c12916 = c12915.f36306;
            c12916.f36308 = c12915.f36308;
            c12915.f36308.f36306 = c12916;
        }
        return c12913;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25514 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C12913 c12913 = this.f25514;
        this.f25514 = m21760();
        return c12913;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
