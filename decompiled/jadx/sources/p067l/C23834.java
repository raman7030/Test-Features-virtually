package p067l;

import android.widget.AdapterView;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩹᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23834 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75730;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f75731;

    public /* synthetic */ C23834(AdapterView.OnItemSelectedListener onItemSelectedListener, int i) {
        this.f75730 = i;
        this.f75731 = onItemSelectedListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f75730) {
            case 0:
                C15116.m34531((C15116) this.f75731, compoundButton, z);
                break;
            default:
                ViewOnClickListenerC12286.m28305((ViewOnClickListenerC12286) this.f75731, z);
                break;
        }
    }
}
