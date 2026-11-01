package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۖ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1UM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5050 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f11830;

    public /* synthetic */ AbstractC5050(int i) {
        this.f11830 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract double mo10768(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract double mo10769(int i, double d);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10770();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10771(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10772(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10773(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10774(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo10776(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public int mo10777() {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo10780();

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo10781();

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo10782();

    public String toString() {
        switch (this.f11830) {
            case 5:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void m10778(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        mo10773(bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10779(C5187 c5187) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3627(C5187 c5187) {
        mo10779(c5187);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10775(AbstractC13904 abstractC13904) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5456(C5187 c5187, C11893 c11893) {
        mo10775((AbstractC13904) c11893);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5457(C5187 c5187, C14574 c14574) {
        mo10775((AbstractC13904) c14574);
    }
}
