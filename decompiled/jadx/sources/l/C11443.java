package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11443 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22731 f34214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f34215;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C11443(C22731 c22731, TextView textView) {
        this.f34214 = c22731;
        this.f34215 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f34215.setText(String.valueOf(i + 1));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 1;
        C22731 c22731 = this.f34214;
        c22731.m11313().edit().putInt(c22731.m6911(), progress).apply();
        c22731.mo6894((CharSequence) String.valueOf(progress));
    }
}
