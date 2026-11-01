package p067l;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: l.ܽᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18353 {

    /* JADX INFO: renamed from: ֫ */
    public final AudioAttributes f54801;

    public C18353(C19695 c19695) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C4272.m8679(usage);
        }
        if (i >= 32) {
            C12990.m29777(usage);
            C12990.m29776(usage);
        }
        this.f54801 = usage.build();
    }
}
