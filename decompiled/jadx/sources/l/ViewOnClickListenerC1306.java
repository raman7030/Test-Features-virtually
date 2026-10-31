package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1306 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4709;

    public /* synthetic */ ViewOnClickListenerC1306(int i, Object obj, Object obj2) {
        this.f4708 = i;
        this.f4709 = obj;
        this.f4707 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4708) {
            case 0:
                C5561.m15770((C5561) this.f4709, (C14771) this.f4707, view);
                break;
            default:
                C6764.m18413((AbstractActivityC3346) this.f4709, (ArrayList) this.f4707, null);
                break;
        }
    }
}
