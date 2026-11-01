package p067l;

import android.widget.SeekBar;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C15924 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC14580 f46045;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f46045.m33336((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(((i * 5) + 80) / 100.0f)));
        }
    }

    public C15924(AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580) {
        this.f46045 = abstractDialogInterfaceOnClickListenerC14580;
    }
}
