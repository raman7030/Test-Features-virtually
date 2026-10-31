package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OK */
/* JADX INFO: loaded from: classes3.dex */
public class C9080 extends IOException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f27517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f27518;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9080 m23439(String str, IllegalArgumentException illegalArgumentException) {
        return new C9080(str, illegalArgumentException, true, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9080 m23440(String str, Throwable th) {
        return new C9080(str, th, true, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9080 m23438(String str) {
        return new C9080(str, null, true, 4);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9080 m23441(String str) {
        return new C9080(str, null, false, 1);
    }

    public C9080(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f27517 = z;
        this.f27518 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f27517);
        sb.append(", dataType=");
        return C3200.m9831(this.f27518, l.d, sb);
    }
}
