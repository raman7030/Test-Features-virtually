package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۙ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4672 {
    public static Date from(C4239 c4239) {
        try {
            return new Date(c4239.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
