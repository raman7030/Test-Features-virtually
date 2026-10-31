package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩹᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22552 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72944;

    public /* synthetic */ C22552(int i) {
        this.f72944 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f72944) {
            case 0:
                C22870.m50970(ApplicationC20075.f65008, "mbp", z);
                break;
            case 1:
                int i = ServiceC3219.f10121;
                C13096.m31746(z);
                break;
            default:
                C22870.m50970(ApplicationC20075.f65008, "dfrwn", z);
                break;
        }
    }
}
