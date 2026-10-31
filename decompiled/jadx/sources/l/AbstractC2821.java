package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۖ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1UM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2821 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9036;

    public /* synthetic */ AbstractC2821(int i) {
        this.f9036 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract double mo8707(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract double mo8708(int i, double d);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo8709();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo8710(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo8711(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8712(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8713(String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo8715(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo8716() {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo8719();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract void mo8720();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract void mo8721();

    public String toString() {
        switch (this.f9036) {
            case 5:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m8717(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        mo8712(bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo8718(C2966 c2966) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1225(C2966 c2966) {
        mo8718(c2966);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8714(AbstractC12138 abstractC12138) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3142(C2966 c2966, C10022 c10022) {
        mo8714((AbstractC12138) c10022);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3143(C2966 c2966, C12843 c12843) {
        mo8714((AbstractC12138) c12843);
    }
}
