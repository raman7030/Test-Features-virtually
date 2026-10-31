package l;

import android.content.ClipboardManager;
import android.os.Vibrator;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18986 extends C18280 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8817 f59857 = C8817.m22786(250);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f59858;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43822(C0640 c0640) {
        if (m43819() != c0640) {
            this.f59858 = new WeakReference(c0640);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C0640 m43819() {
        WeakReference weakReference = this.f59858;
        if (weakReference == null) {
            return null;
        }
        return (C0640) weakReference.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43824() {
        C0640 c0640M43819 = m43819();
        if (c0640M43819 != null) {
            c0640M43819.m2653();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43821(String str) {
        ClipboardManager clipboardManager;
        C0640 c0640M43819 = m43819();
        if (c0640M43819 == null || (clipboardManager = (ClipboardManager) c0640M43819.getContext().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setText(str);
            C21374.m48457(R.string.MT_Protector);
        } catch (Throwable unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43820() {
        C0640 c0640M43819 = m43819();
        if (c0640M43819 == null || !this.f59857.m22791()) {
            return;
        }
        Vibrator vibrator = (Vibrator) c0640M43819.getContext().getSystemService("vibrator");
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 10}, -1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43823() {
        C0640 c0640M43819 = m43819();
        if (c0640M43819 != null) {
            c0640M43819.m2653();
        }
    }
}
