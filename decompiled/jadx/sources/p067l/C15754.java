package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15754 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C4376 f45623;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15754(AbstractActivityC5549 abstractActivityC5549, C4376 c4376) {
        super(abstractActivityC5549, -1);
        this.f45623 = c4376;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C22682.m50793(R.string.MT_Protector);
            } else {
                C23092.m51504(i);
                m33348();
            }
        } catch (NumberFormatException unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C4376 c4376 = this.f45623;
        if (c4376.f9831 == this) {
            c4376.f9831 = null;
        }
    }
}
