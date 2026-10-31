package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C23278 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f74752;

    public C23278(TextView textView) {
        this.f74752 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f74752.setText(C21100.m48031(C21100.m48011(i * 50)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (C21100.f68050 != null) {
            C21100.f68050.f21574 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() * 50;
        this.f74752.setText(C21100.m48031(C21100.m48011(progress)));
        if (C21100.f68050 != null) {
            C21100.f68050.m18911(progress);
        }
    }
}
