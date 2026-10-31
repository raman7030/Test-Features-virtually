package l;

import java.time.Duration;

/* JADX INFO: renamed from: l.֡᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C0710 {
    public static C2828 convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return C2828.s(duration.getSeconds(), duration.getNano());
    }

    public static Duration convert(C2828 c2828) {
        if (c2828 == null) {
            return null;
        }
        return Duration.ofSeconds(c2828.a, c2828.b);
    }
}
