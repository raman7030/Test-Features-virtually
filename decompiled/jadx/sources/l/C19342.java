package l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes5.dex */
public final class C19342 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f60832;

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.trim().isEmpty()) {
            m31262();
            return;
        }
        try {
            new SimpleDateFormat(strM31260, Locale.ENGLISH);
            ApplicationC20075.f65008.edit().putString("rdtp", strM31260).apply();
            m31262();
        } catch (Exception unused) {
        }
    }
}
