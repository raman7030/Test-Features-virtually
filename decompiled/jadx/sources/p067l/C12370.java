package p067l;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۤ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12370 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f34511;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f34512;

    public /* synthetic */ C12370(int i, Object obj) {
        this.f34511 = i;
        this.f34512 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f34511) {
            case 0:
                AbstractC24439.m53927((AbstractC24439) this.f34512, z);
                break;
            default:
                ((Chip) this.f34512).lambda$new$0(compoundButton, z);
                break;
        }
    }
}
