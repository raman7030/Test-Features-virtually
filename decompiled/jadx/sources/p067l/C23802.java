package p067l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩹᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23802 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75671;

    public /* synthetic */ C23802(int i) {
        this.f75671 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f75671) {
            case 0:
                C24104.m53360(ApplicationC21448.f67649, "mbp", z);
                break;
            case 1:
                int i = ServiceC5428.f12927;
                C14815.m33836(z);
                break;
            default:
                C24104.m53360(ApplicationC21448.f67649, "dfrwn", z);
                break;
        }
    }
}
