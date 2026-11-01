package p067l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.۬֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C14540 implements Comparable {

    /* JADX INFO: renamed from: ۫ */
    public static final C14540 f41486;

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f41487 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final int f41488;

    /* JADX INFO: renamed from: ۙ */
    public final int f41489;

    /* JADX INFO: renamed from: ᩶ */
    public final int f41490;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18744 f41491;

    /* JADX INFO: renamed from: ᩹ */
    public final String f41492;

    public /* synthetic */ C14540(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, str);
    }

    public C14540(int i, int i2, int i3, String str) {
        this.f41490 = i;
        this.f41489 = i2;
        this.f41488 = i3;
        this.f41492 = str;
        this.f41491 = C16061.m36565(new C5153(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33203() {
        return this.f41490;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33205() {
        return this.f41489;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m33206() {
        return this.f41488;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14540 c14540) {
        C13045.m29867(c14540, "other");
        Object value = this.f41491.getValue();
        C13045.m29865(value, "<get-bigInteger>(...)");
        Object value2 = c14540.f41491.getValue();
        C13045.m29865(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final String toString() {
        String str = this.f41492;
        String strM29868 = !C5235.m11300((CharSequence) str) ? C13045.m29868(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41490);
        sb.append('.');
        sb.append(this.f41489);
        sb.append('.');
        return C5410.m11876(this.f41488, strM29868, sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14540)) {
            return false;
        }
        C14540 c14540 = (C14540) obj;
        return this.f41490 == c14540.f41490 && this.f41489 == c14540.f41489 && this.f41488 == c14540.f41488;
    }

    public final int hashCode() {
        return ((((this.f41490 + 527) * 31) + this.f41489) * 31) + this.f41488;
    }

    static {
        new C14540(0, 0, 0, "");
        f41486 = new C14540(0, 1, 0, "");
        new C14540(1, 0, 0, "");
    }
}
