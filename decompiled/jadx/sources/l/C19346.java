package l;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19346 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62641;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f62642;

    public /* synthetic */ C19346(KeyEvent.Callback callback, int i) {
        this.f62641 = i;
        this.f62642 = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f62641) {
            case 0:
                ((Button) this.f62642).setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                break;
            default:
                ActivityC6372.m17668((ActivityC6372) this.f62642, compoundButton, z);
                break;
        }
    }
}
