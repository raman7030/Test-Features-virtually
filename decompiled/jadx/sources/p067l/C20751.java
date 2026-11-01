package p067l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20751 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public SimpleDateFormat f64064;

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.trim().isEmpty()) {
            m33348();
            return;
        }
        try {
            new SimpleDateFormat(strM33346, Locale.ENGLISH);
            ApplicationC21448.f67649.edit().putString("rdtp", strM33346).apply();
            m33348();
        } catch (Exception unused) {
        }
    }
}
