package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֨ܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C0899 {

    /* JADX INFO: renamed from: ۧ */
    public static final C1914 f6932 = new C2019().m54780().m51164().m51176().m51179();

    /* JADX INFO: renamed from: ֫ */
    public final C1914 f6933;

    /* JADX INFO: renamed from: ֫ */
    public void mo6175(View view) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4374(C1388 c1388) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6176(C1914 c1914) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6177(C1388[] c1388Arr) {
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean mo6179() {
        return false;
    }

    /* JADX INFO: renamed from: ۢ */
    public boolean mo6180() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo6185(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public C1098 mo6186() {
        return null;
    }

    public C0899(C1914 c1914) {
        this.f6933 = c1914;
    }

    /* JADX INFO: renamed from: ܽ */
    public C1914 mo6184() {
        return this.f6933;
    }

    /* JADX INFO: renamed from: ۧ */
    public C1914 mo6182() {
        return this.f6933;
    }

    /* JADX INFO: renamed from: ֫ */
    public C1914 mo6174() {
        return this.f6933;
    }

    /* JADX INFO: renamed from: ۜ */
    public C1388 mo6178() {
        return C1388.f36101;
    }

    /* JADX INFO: renamed from: ܳ */
    public C1388 mo6183() {
        return C1388.f36101;
    }

    /* JADX INFO: renamed from: ᩻ */
    public C1388 mo4377() {
        return mo6178();
    }

    /* JADX INFO: renamed from: ܿ */
    public C1388 mo4375() {
        return mo6178();
    }

    /* JADX INFO: renamed from: ᩷ */
    public C1388 mo4376() {
        return mo6178();
    }

    /* JADX INFO: renamed from: ֫ */
    public C1914 mo4373(int i, int i2, int i3, int i4) {
        return f6932;
    }

    /* JADX INFO: renamed from: ֫ */
    public C1388 mo6173(int i) {
        return C1388.f36101;
    }

    /* JADX INFO: renamed from: ۧ */
    public C1388 mo6181(int i) {
        if ((i & 8) != 0) {
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        return C1388.f36101;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0899)) {
            return false;
        }
        C0899 c0899 = (C0899) obj;
        return mo6179() == c0899.mo6179() && mo6180() == c0899.mo6180() && C12826.equals(mo6178(), c0899.mo6178()) && C12826.equals(mo6183(), c0899.mo6183()) && C12826.equals(mo6186(), c0899.mo6186());
    }

    public int hashCode() {
        return C12826.hash(Boolean.valueOf(mo6179()), Boolean.valueOf(mo6180()), mo6178(), mo6183(), mo6186());
    }
}
