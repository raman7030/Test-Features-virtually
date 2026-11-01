package p067l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۜۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes2.dex */
public final class C8549 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21961 f22968;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ DialogInterfaceC2564 f22969;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f22970;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C8549(C21961 c21961, DialogInterfaceC2564 dialogInterfaceC2564, String str) {
        this.f22968 = c21961;
        this.f22969 = dialogInterfaceC2564;
        this.f22970 = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f22969.m3857(this.f22970 + (seekBar.getProgress() + 6) + "dp)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C21961 c21961 = this.f22968;
        c21961.m13265().edit().putInt(c21961.m9037(), seekBar.getProgress() + 6).apply();
        c21961.mo9048();
    }
}
