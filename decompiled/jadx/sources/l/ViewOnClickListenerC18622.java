package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC18622 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f57748;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23560 f57749;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f57750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC18622(C19328 c19328, View view) {
        super(view);
        this.f57748 = c19328;
        this.f57750 = (TextView) view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        C2394 c2394 = new C2394(this, (AbstractActivityC3346) this.f57748.requireActivity());
        c2394.m31270();
        c2394.m31258(R.string.MT_Protector);
        c2394.m31250((CharSequence) this.f57749.m52025());
        c2394.m31242();
        c2394.m31266(true);
    }
}
