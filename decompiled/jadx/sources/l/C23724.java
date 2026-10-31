package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.᩻۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes.dex */
public final class C23724 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f76826;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5982 f76827;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76828;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C23724(DialogInterfaceC0206 dialogInterfaceC0206, String str, InterfaceC5982 interfaceC5982) {
        this.f76826 = dialogInterfaceC0206;
        this.f76828 = str;
        this.f76827 = interfaceC5982;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f76826.m1444(this.f76828 + (seekBar.getProgress() + 5) + "s)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f76827.accept(seekBar.getProgress() + 5);
    }
}
