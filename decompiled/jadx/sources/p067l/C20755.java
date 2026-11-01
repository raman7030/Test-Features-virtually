package p067l;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20755 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65255;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ KeyEvent.Callback f65256;

    public /* synthetic */ C20755(KeyEvent.Callback callback, int i) {
        this.f65255 = i;
        this.f65256 = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f65255) {
            case 0:
                ((Button) this.f65256).setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                break;
            default:
                ActivityC8425.m19613((ActivityC8425) this.f65256, compoundButton, z);
                break;
        }
    }
}
