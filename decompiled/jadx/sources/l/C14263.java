package l;

import android.widget.SeekBar;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14263 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f42952;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f42952.m31250((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(((i * 5) + 80) / 100.0f)));
        }
    }

    public C14263(AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849) {
        this.f42952 = abstractDialogInterfaceOnClickListenerC12849;
    }
}
