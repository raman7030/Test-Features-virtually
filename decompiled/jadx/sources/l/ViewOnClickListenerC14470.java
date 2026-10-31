package l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܳۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14470 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44342;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f44343;

    public /* synthetic */ ViewOnClickListenerC14470(boolean[] zArr, Object obj, int i) {
        this.f44342 = i;
        this.f44343 = zArr;
        this.f44341 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f44342;
        int i2 = 0;
        Object obj = this.f44341;
        boolean[] zArr = this.f44343;
        switch (i) {
            case 0:
                ListView listView = (ListView) obj;
                int i3 = ActivityC17169.f52595;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
                break;
            default:
                C20438 c20438 = (C20438) obj;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                c20438.notifyDataSetChanged();
                break;
        }
    }
}
