package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15019 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Predicate f42912;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ EnumC3620 f42913;

    /* JADX INFO: renamed from: ᩶ */
    public int f42914;

    /* JADX INFO: renamed from: ᩸ */
    public C16360 f42915;

    /* JADX INFO: renamed from: ᩹ */
    public C12338 f42916;

    public C15019(C12338 c12338, EnumC3620 enumC3620, Predicate predicate) {
        this.f42913 = enumC3620;
        this.f42912 = predicate;
        this.f42916 = c12338;
        this.f42915 = c12338.f34432;
        this.f42914 = c12338.f34436;
        m34392();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C16360 c16360;
        if (this.f42914 != this.f42916.f34436 && (c16360 = this.f42915) != null && !c16360.f48075.mo22462(c16360.f48076)) {
            C16360 c16361 = this.f42915;
            if (c16361 != null) {
                this.f42915 = c16361.f48073;
            }
            m34392();
            this.f42914 = this.f42916.f34436;
        }
        return this.f42915 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C16360 c16360 = this.f42915;
        AbstractC7783 abstractC7783 = c16360 == null ? null : c16360.f48076;
        if (c16360 != null) {
            this.f42915 = c16360.f48073;
        }
        m34392();
        return abstractC7783;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34392() {
        Predicate predicate;
        C12338 c12338;
        while (true) {
            C16360 c16360 = this.f42915;
            predicate = this.f42912;
            if (c16360 == null || predicate == null || predicate.test(c16360.f48076)) {
                break;
            } else {
                this.f42915 = this.f42915.f48073;
            }
        }
        if (this.f42913 == EnumC3620.RECURSIVE) {
            while (this.f42915 == null && (c12338 = this.f42916.f34431) != null) {
                this.f42916 = c12338;
                this.f42915 = c12338.f34432;
                this.f42914 = c12338.f34436;
                while (true) {
                    C16360 c16361 = this.f42915;
                    if (c16361 == null || predicate == null || predicate.test(c16361.f48076)) {
                        break;
                    } else {
                        this.f42915 = this.f42915.f48073;
                    }
                }
            }
        }
    }
}
