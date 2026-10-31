package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7JT */
/* JADX INFO: loaded from: classes.dex */
public final class C23478 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6545 f75333;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f75334;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C23478(C6545 c6545, TextView textView) {
        this.f75333 = c6545;
        this.f75334 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f75334.setText(String.valueOf(i + 2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 2;
        C6545 c6545 = this.f75333;
        c6545.m11313().edit().putInt(c6545.m6911(), progress).apply();
        c6545.mo6894((CharSequence) String.valueOf(progress));
    }
}
