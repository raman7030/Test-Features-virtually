package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4122 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9079;

    public /* synthetic */ C4122(int i) {
        this.f9079 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f9079) {
            case 0:
                C24104.m53360(ApplicationC21448.f67649, "dfrwn", z);
                break;
            default:
                if (z) {
                    if (!ApplicationC21448.f67649.getBoolean("forbid_tip_".concat("multi_threaded_transfer"), false)) {
                        DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, (AbstractActivityC5549) C7453.m17221(compoundButton.getContext()), "multi_threaded_transfer");
                    }
                }
                break;
        }
    }
}
