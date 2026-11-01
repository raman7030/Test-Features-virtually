package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3610 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f7478;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f7479;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f7480;

    public /* synthetic */ ViewOnClickListenerC3610(int i, Object obj, Object obj2) {
        this.f7479 = i;
        this.f7480 = obj;
        this.f7478 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7479) {
            case 0:
                C7654.m17685((C7654) this.f7480, (C16407) this.f7478, view);
                break;
            default:
                C8797.m20361((AbstractActivityC5549) this.f7480, (ArrayList) this.f7478, null);
                break;
        }
    }
}
