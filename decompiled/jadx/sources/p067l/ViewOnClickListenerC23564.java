package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23564 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75042;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75043;

    public /* synthetic */ ViewOnClickListenerC23564(int i, Object obj) {
        this.f75042 = i;
        this.f75043 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f75042;
        Object obj = this.f75043;
        switch (i) {
            case 0:
                ActivityC12088.m27818((ActivityC12088) obj, view);
                break;
            case 1:
                ((C18107) obj).m41282().m12253(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
            default:
                C6724 c6724 = ActivityC13332.f37438;
                ((ActivityC13332) obj).finish();
                break;
        }
    }
}
