package p067l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C24492 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ TextView f77496;

    public C24492(TextView textView) {
        this.f77496 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f77496.setText(C22422.m50361(C22422.m50341(i * 50)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (C22422.f70732 != null) {
            C22422.f70732.f24454 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() * 50;
        this.f77496.setText(C22422.m50361(C22422.m50341(progress)));
        if (C22422.f70732 != null) {
            C22422.f70732.m20865(progress);
        }
    }
}
