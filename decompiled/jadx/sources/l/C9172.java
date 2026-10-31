package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۡ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9172 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19050 f27775;

    public C9172(C19050 c19050) {
        this.f27775 = c19050;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C19050 c19050 = this.f27775;
        if (z && (c19050.f60009 || !c19050.f60010)) {
            c19050.m43911(seekBar);
        } else {
            c19050.m43912(i + c19050.f60001);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f27775.f60010 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C19050 c19050 = this.f27775;
        c19050.f60010 = false;
        if (seekBar.getProgress() + c19050.f60001 != c19050.f60000) {
            c19050.m43911(seekBar);
        }
    }
}
