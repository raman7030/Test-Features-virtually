package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.֫ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1601 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5653;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5654;

    public /* synthetic */ C1601(int i, Object obj) {
        this.f5653 = i;
        this.f5654 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f5653;
        Object obj = this.f5654;
        switch (i) {
            case 0:
                int i2 = ActivityC22062.f70692;
                ApplicationC20075.f65008.edit().putBoolean("apk_signature_info_add_colon", z).apply();
                ((RunnableC14049) obj).run();
                break;
            default:
                ((AbstractViewOnClickListenerC16235) obj).m38199();
                break;
        }
    }
}
