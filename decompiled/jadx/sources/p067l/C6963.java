package p067l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۙᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C6963 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16407 f18109;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ DialogInterfaceC2564 f18110;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f18111;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C6963(DialogInterfaceC2564 dialogInterfaceC2564, String str, C16407 c16407) {
        this.f18110 = dialogInterfaceC2564;
        this.f18111 = str;
        this.f18109 = c16407;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 20) {
            seekBar.setProgress(20);
            return;
        }
        this.f18110.m3857(this.f18111 + i + "%)");
        this.f18109.m37260(((float) i) / 100.0f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ApplicationC21448.f67649.edit().mo27875((int) (this.f18109.m37271() * 100.0f), "bottom_content_view_ratio_int").apply();
    }
}
