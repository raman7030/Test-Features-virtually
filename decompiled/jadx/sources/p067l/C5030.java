package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۖ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5030 {

    /* JADX INFO: renamed from: ֫ */
    public String f11531;

    /* JADX INFO: renamed from: ۧ */
    public String f11532;

    /* JADX INFO: renamed from: ܽ */
    public long f11533;

    /* JADX INFO: renamed from: ܿ */
    public String f11534;

    /* JADX INFO: renamed from: ᩳ */
    public int f11535;

    public C5030() {
        String[] strArr = Build.SUPPORTED_ABIS;
        String str = strArr[0];
        str.getClass();
        String str2 = "x86";
        switch (str) {
            case "x86_64":
                str2 = "x86_64";
                break;
            case "x86":
                break;
            case "armeabi-v7a":
                str2 = "arm";
                break;
            case "arm64-v8a":
                str2 = "arm64";
                break;
            default:
                throw new RuntimeException("Unsupported architecture: " + strArr[0]);
        }
        this.f11531 = str2;
    }
}
