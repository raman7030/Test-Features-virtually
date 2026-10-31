package l;

import android.widget.AdapterView;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩹᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22585 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73003;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f73004;

    public /* synthetic */ C22585(AdapterView.OnItemSelectedListener onItemSelectedListener, int i) {
        this.f73003 = i;
        this.f73004 = onItemSelectedListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f73003) {
            case 0:
                C13412.m32429((C13412) this.f73004, compoundButton, z);
                break;
            default:
                ViewOnClickListenerC10435.m26276((ViewOnClickListenerC10435) this.f73004, z);
                break;
        }
    }
}
