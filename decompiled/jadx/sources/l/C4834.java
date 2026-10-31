package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۙᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4834 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14771 f15276;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f15277;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f15278;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C4834(DialogInterfaceC0206 dialogInterfaceC0206, String str, C14771 c14771) {
        this.f15277 = dialogInterfaceC0206;
        this.f15278 = str;
        this.f15276 = c14771;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 20) {
            seekBar.setProgress(20);
            return;
        }
        this.f15277.m1444(this.f15278 + i + "%)");
        this.f15276.m35113(((float) i) / 100.0f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ApplicationC20075.f65008.edit().mo25853((int) (this.f15276.m35124() * 100.0f), "bottom_content_view_ratio_int").apply();
    }
}
