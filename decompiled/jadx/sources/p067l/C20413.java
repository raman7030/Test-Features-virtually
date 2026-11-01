package p067l;

import android.content.ClipboardManager;
import android.os.Vibrator;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20413 extends C19742 {

    /* JADX INFO: renamed from: ֫ */
    public C10748 f63085 = C10748.m24756(250);

    /* JADX INFO: renamed from: ۧ */
    public WeakReference f63086;

    /* JADX INFO: renamed from: ֫ */
    public final void m46090(C2977 c2977) {
        if (m46087() != c2977) {
            this.f63086 = new WeakReference(c2977);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C2977 m46087() {
        WeakReference weakReference = this.f63086;
        if (weakReference == null) {
            return null;
        }
        return (C2977) weakReference.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46092() {
        C2977 c2977M46087 = m46087();
        if (c2977M46087 != null) {
            c2977M46087.m4993();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46089(String str) {
        ClipboardManager clipboardManager;
        C2977 c2977M46087 = m46087();
        if (c2977M46087 == null || (clipboardManager = (ClipboardManager) c2977M46087.getContext().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setText(str);
            C22682.m50793(R.string.MT_Protector);
        } catch (Throwable unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46088() {
        C2977 c2977M46087 = m46087();
        if (c2977M46087 == null || !this.f63085.m24761()) {
            return;
        }
        Vibrator vibrator = (Vibrator) c2977M46087.getContext().getSystemService("vibrator");
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 10}, -1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46091() {
        C2977 c2977M46087 = m46087();
        if (c2977M46087 != null) {
            c2977M46087.m4993();
        }
    }
}
