package l;

import android.content.DialogInterface;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩹ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC22326 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f72363;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f72364;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f72365;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f72366;

    static {
        ApplicationC12518.m30701(157);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public native void onClick(DialogInterface dialogInterface, int i);

    public DialogInterfaceOnClickListenerC22326(Spinner spinner, C2450 c2450, C2978 c2978, C2978 c2979) {
        this.f72363 = spinner;
        this.f72364 = c2450;
        this.f72365 = c2978;
        this.f72366 = c2979;
    }
}
