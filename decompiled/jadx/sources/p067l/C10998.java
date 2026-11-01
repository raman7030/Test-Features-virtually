package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OK */
/* JADX INFO: loaded from: classes3.dex */
public class C10998 extends IOException {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f30454;

    /* JADX INFO: renamed from: ᩹ */
    public final int f30455;

    /* JADX INFO: renamed from: ֫ */
    public static C10998 m25386(String str, IllegalArgumentException illegalArgumentException) {
        return new C10998(str, illegalArgumentException, true, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10998 m25387(String str, Throwable th) {
        return new C10998(str, th, true, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10998 m25385(String str) {
        return new C10998(str, null, true, 4);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10998 m25388(String str) {
        return new C10998(str, null, false, 1);
    }

    public C10998(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f30454 = z;
        this.f30455 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f30454);
        sb.append(", dataType=");
        return C5410.m11876(this.f30455, C0249l.f1198d, sb);
    }
}
