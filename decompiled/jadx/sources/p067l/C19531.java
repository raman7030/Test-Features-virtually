package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19531 {

    /* JADX INFO: renamed from: c */
    public static final C19531 f59472c = new C19531();

    /* JADX INFO: renamed from: a */
    public final boolean f59473a;

    /* JADX INFO: renamed from: b */
    public final int f59474b;

    public C19531() {
        this.f59473a = false;
        this.f59474b = 0;
    }

    public C19531(int i) {
        this.f59473a = true;
        this.f59474b = i;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.f59473a) {
            intConsumer.accept(this.f59474b);
        }
    }

    public int orElse(int i) {
        return this.f59473a ? this.f59474b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19531)) {
            return false;
        }
        C19531 c19531 = (C19531) obj;
        boolean z = c19531.f59473a;
        boolean z2 = this.f59473a;
        if (z2 && z) {
            return this.f59474b == c19531.f59474b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (this.f59473a) {
            return this.f59474b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f59473a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f59474b + "]";
    }
}
