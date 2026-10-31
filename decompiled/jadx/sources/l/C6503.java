package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۜۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6503 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20615 f20090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f20091;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20092;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C6503(C20615 c20615, DialogInterfaceC0206 dialogInterfaceC0206, String str) {
        this.f20090 = c20615;
        this.f20091 = dialogInterfaceC0206;
        this.f20092 = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f20091.m1444(this.f20092 + (seekBar.getProgress() + 6) + "dp)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C20615 c20615 = this.f20090;
        c20615.m11313().edit().putInt(c20615.m6911(), seekBar.getProgress() + 6).apply();
        c20615.mo6922();
    }
}
