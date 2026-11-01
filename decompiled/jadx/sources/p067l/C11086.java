package p067l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۡ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11086 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20474 f30715;

    public C11086(C20474 c20474) {
        this.f30715 = c20474;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C20474 c20474 = this.f30715;
        if (z && (c20474.f63238 || !c20474.f63239)) {
            c20474.m46180(seekBar);
        } else {
            c20474.m46181(i + c20474.f63230);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f30715.f63239 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C20474 c20474 = this.f30715;
        c20474.f63239 = false;
        if (seekBar.getProgress() + c20474.f63230 != c20474.f63229) {
            c20474.m46180(seekBar);
        }
    }
}
