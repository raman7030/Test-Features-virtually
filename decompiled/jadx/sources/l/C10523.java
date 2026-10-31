package l;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۤ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10523 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31549;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31550;

    public /* synthetic */ C10523(int i, Object obj) {
        this.f31549 = i;
        this.f31550 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f31549) {
            case 0:
                AbstractC23222.m51530((AbstractC23222) this.f31550, z);
                break;
            default:
                ((Chip) this.f31550).lambda$new$0(compoundButton, z);
                break;
        }
    }
}
