package p067l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.֫ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3890 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8432;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f8433;

    public /* synthetic */ C3890(int i, Object obj) {
        this.f8432 = i;
        this.f8433 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f8432;
        Object obj = this.f8433;
        switch (i) {
            case 0:
                int i2 = ActivityC23336.f73409;
                ApplicationC21448.f67649.edit().putBoolean("apk_signature_info_add_colon", z).apply();
                ((RunnableC15721) obj).run();
                break;
            default:
                ((AbstractViewOnClickListenerC17799) obj).m40411();
                break;
        }
    }
}
