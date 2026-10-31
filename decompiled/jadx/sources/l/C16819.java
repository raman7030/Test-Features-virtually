package l;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: l.ܽᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16819 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AudioAttributes f51620;

    public C16819(C18231 c18231) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C2003.m6537(usage);
        }
        if (i >= 32) {
            C11176.m27715(usage);
            C11176.m27714(usage);
        }
        this.f51620 = usage.build();
    }
}
