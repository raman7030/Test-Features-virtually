package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18058 {
    public static final C18058 c = new C18058();
    public final boolean a;
    public final int b;

    public C18058() {
        this.a = false;
        this.b = 0;
    }

    public C18058(int i) {
        this.a = true;
        this.b = i;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public int orElse(int i) {
        return this.a ? this.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18058)) {
            return false;
        }
        C18058 c18058 = (C18058) obj;
        boolean z = c18058.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c18058.b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }
}
