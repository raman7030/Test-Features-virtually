package p067l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.᩻۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes.dex */
public final class C24916 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogInterfaceC2564 f79577;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC8054 f79578;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f79579;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C24916(DialogInterfaceC2564 dialogInterfaceC2564, String str, InterfaceC8054 interfaceC8054) {
        this.f79577 = dialogInterfaceC2564;
        this.f79579 = str;
        this.f79578 = interfaceC8054;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f79577.m3857(this.f79579 + (seekBar.getProgress() + 5) + "s)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f79578.accept(seekBar.getProgress() + 5);
    }
}
