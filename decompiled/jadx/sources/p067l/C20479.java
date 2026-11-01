package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20479 {

    /* JADX INFO: renamed from: ֫ */
    public int f63252;

    /* JADX INFO: renamed from: ۧ */
    public int f63253;

    /* JADX INFO: renamed from: ܽ */
    public final C14677 f63254;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f63256 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public final Object f63255 = new Object();

    public C20479(C14677 c14677) {
        this.f63254 = c14677;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m46183() {
        int i;
        C14677 c14677 = this.f63254;
        int i2 = c14677.readInt();
        int i3 = c14677.readInt();
        if (i2 < 8 || i2 > 65536 || (i2 & 1) != 0 || i3 < 4 || i3 > 256 || (i3 & 1) != 0 || ((i = this.f63252) != 0 && (i != i2 || this.f63253 != i3))) {
            throw new IllegalArgumentException("Invalid text graph configuration");
        }
        this.f63252 = i2;
        this.f63253 = i3;
        return new C13773(m46182(0), i2, i3, null);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21820 m46182(int i) {
        AbstractC21820 c25172;
        if (i > 32) {
            throw new IllegalArgumentException("Text graph is too deep");
        }
        C14677 c14677 = this.f63254;
        int i2 = c14677.readInt();
        if (i2 == -1) {
            return null;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.f63256;
            if (i2 <= arrayList.size()) {
                if (i2 < arrayList.size()) {
                    AbstractC21820 abstractC21820 = (AbstractC21820) arrayList.get(i2);
                    if (abstractC21820 != null) {
                        return abstractC21820;
                    }
                    throw new IllegalArgumentException("Cyclic text graph");
                }
                arrayList.add(null);
                int i3 = c14677.readByte() & 255;
                int i4 = c14677.readInt();
                Object obj = this.f63255;
                if (i3 == 1) {
                    int i5 = c14677.readByte() & 255;
                    if (i4 >= 1 && i4 <= this.f63252 && i5 <= 1) {
                        if (((long) i4) * ((long) (i5 == 1 ? 1 : 2)) <= c14677.available()) {
                            char[] cArr = new char[i4];
                            for (int i6 = 0; i6 < i4; i6++) {
                                cArr[i6] = i5 == 1 ? (char) (c14677.readByte() & 255) : c14677.m33594();
                            }
                            c25172 = new C23161(obj, this.f63252, cArr, 0, i4, null);
                        }
                    }
                    throw new IllegalArgumentException("Invalid text page length");
                }
                if (i3 == 2) {
                    if (i4 < 2 || i4 > this.f63253 || i4 > c14677.available() / 4) {
                        throw new IllegalArgumentException("Invalid text branch size");
                    }
                    AbstractC21820[] abstractC21820Arr = new AbstractC21820[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        AbstractC21820 abstractC21820M46182 = m46182(i + 1);
                        abstractC21820Arr[i7] = abstractC21820M46182;
                        if (abstractC21820M46182 == null || (i7 > 0 && abstractC21820M46182.f68651 != abstractC21820Arr[0].f68651)) {
                            throw new IllegalArgumentException("Invalid text branch height");
                        }
                    }
                    c25172 = new C25172(obj, abstractC21820Arr);
                } else {
                    throw new IllegalArgumentException("Invalid text node type");
                }
                arrayList.set(i2, c25172);
                return c25172;
            }
        }
        throw new IllegalArgumentException("Invalid text node identity");
    }
}
