package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۙ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6809 {
    public static Date from(C6398 c6398) {
        try {
            return new Date(c6398.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
