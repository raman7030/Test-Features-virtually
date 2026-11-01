package p067l;

import java.time.Duration;

/* JADX INFO: renamed from: l.֡᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C3044 {
    public static C5057 convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return C5057.m10792s(duration.getSeconds(), duration.getNano());
    }

    public static Duration convert(C5057 c5057) {
        if (c5057 == null) {
            return null;
        }
        return Duration.ofSeconds(c5057.f11851a, c5057.f11852b);
    }
}
