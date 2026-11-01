package p067l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13244 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23972 f37210;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f37211;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C13244(C23972 c23972, TextView textView) {
        this.f37210 = c23972;
        this.f37211 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f37211.setText(String.valueOf(i + 1));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 1;
        C23972 c23972 = this.f37210;
        c23972.m13265().edit().putInt(c23972.m9037(), progress).apply();
        c23972.mo9020((CharSequence) String.valueOf(progress));
    }
}
