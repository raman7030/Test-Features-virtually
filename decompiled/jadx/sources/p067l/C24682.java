package p067l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7JT */
/* JADX INFO: loaded from: classes.dex */
public final class C24682 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8589 f78081;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f78082;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C24682(C8589 c8589, TextView textView) {
        this.f78081 = c8589;
        this.f78082 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f78082.setText(String.valueOf(i + 2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 2;
        C8589 c8589 = this.f78081;
        c8589.m13265().edit().putInt(c8589.m9037(), progress).apply();
        c8589.mo9020((CharSequence) String.valueOf(progress));
    }
}
