package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۗ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5729 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f14030;

    /* JADX INFO: renamed from: ۧ */
    public C13776 f14031;

    /* JADX INFO: renamed from: ܳ */
    public String f14032;

    /* JADX INFO: renamed from: ܽ */
    public Bundle f14033 = new Bundle();

    /* JADX INFO: renamed from: ܿ */
    public String[] f14034;

    /* JADX INFO: renamed from: ᩳ */
    public String f14035;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f14036;

    public C5729(AbstractActivityC5549 abstractActivityC5549) {
        this.f14030 = abstractActivityC5549;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12729(String str) {
        this.f14035 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12730(C13776 c13776) {
        this.f14031 = c13776;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12732(String[] strArr) {
        this.f14034 = strArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12734(String str) {
        this.f14034 = new String[]{str};
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12735(String str) {
        this.f14032 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12727() {
        this.f14036 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12731(boolean z) {
        this.f14033.putBoolean("nsIsDir", z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12728(int i) {
        this.f14033.putInt("nsId", i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12733() {
        new C15116(this.f14030, this.f14035, this.f14031, this.f14034, this.f14032, this.f14033, this.f14036);
    }
}
