package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.۟۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7321 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10696 f22476;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C7321(C10696 c10696) {
        this.f22476 = c10696;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f22476.m26820(i / 100.0f);
        }
    }
}
