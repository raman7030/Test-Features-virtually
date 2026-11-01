package p067l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܳۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC16121 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f47442;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f47443;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean[] f47444;

    public /* synthetic */ ViewOnClickListenerC16121(boolean[] zArr, Object obj, int i) {
        this.f47443 = i;
        this.f47444 = zArr;
        this.f47442 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f47443;
        int i2 = 0;
        Object obj = this.f47442;
        boolean[] zArr = this.f47444;
        switch (i) {
            case 0:
                ListView listView = (ListView) obj;
                int i3 = ActivityC18686.f55776;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
                break;
            default:
                C21793 c21793 = (C21793) obj;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                c21793.notifyDataSetChanged();
                break;
        }
    }
}
