package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1845 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6300;

    public /* synthetic */ C1845(int i) {
        this.f6300 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f6300) {
            case 0:
                C22870.m50970(ApplicationC20075.f65008, "dfrwn", z);
                break;
            default:
                if (z) {
                    if (!ApplicationC20075.f65008.getBoolean("forbid_tip_".concat("multi_threaded_transfer"), false)) {
                        DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector, (AbstractActivityC3346) C5350.m15313(compoundButton.getContext()), "multi_threaded_transfer");
                    }
                }
                break;
        }
    }
}
