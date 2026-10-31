package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9135 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27663;

    public /* synthetic */ ViewOnClickListenerC9135(int i, Object obj) {
        this.f27662 = i;
        this.f27663 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27662;
        Object obj = this.f27663;
        switch (i) {
            case 0:
                ((ActivityC1748) obj).f6050.m37583();
                break;
            case 1:
                C10235 c10235 = (C10235) obj;
                String string = ((TextView) view).getText().toString();
                int iM30444 = c10235.m30444();
                int iM30448 = c10235.m30448();
                if (iM30444 > iM30448) {
                    iM30448 = iM30444;
                    iM30444 = iM30448;
                }
                c10235.m30436().replace(iM30444, iM30448, string);
                c10235.mo25919(string.length() + iM30444);
                break;
            case 2:
                C1793.m5966((C1793) obj);
                break;
            case 3:
                int i2 = AbstractC6138.f18912;
                ((C22933) obj).m51051();
                break;
            default:
                int i3 = ActivityC6242.f19308;
                ((ActivityC6242) obj).finish();
                break;
        }
    }
}
