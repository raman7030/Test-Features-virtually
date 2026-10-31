package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۗ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3535 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f11223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12002 f11224;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f11225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Bundle f11226 = new Bundle();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String[] f11227;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f11228;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f11229;

    public C3535(AbstractActivityC3346 abstractActivityC3346) {
        this.f11223 = abstractActivityC3346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10732(String str) {
        this.f11228 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10733(C12002 c12002) {
        this.f11224 = c12002;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10735(String[] strArr) {
        this.f11227 = strArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10737(String str) {
        this.f11227 = new String[]{str};
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10738(String str) {
        this.f11225 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10730() {
        this.f11229 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10734(boolean z) {
        this.f11226.putBoolean("nsIsDir", z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10731(int i) {
        this.f11226.putInt("nsId", i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10736() {
        new C13412(this.f11223, this.f11228, this.f11224, this.f11227, this.f11225, this.f11226, this.f11229);
    }
}
