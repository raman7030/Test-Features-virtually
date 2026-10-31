package l;

import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܺۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15644 implements AdapterView.OnItemLongClickListener {
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C5062.f15913;
        TextView textView = ((ViewOnClickListenerC19174) view.getTag()).f60424;
        Layout layout = textView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getEllipsisCount(i3) > 0) {
                    C21374.m48459(textView.getText());
                    return true;
                }
            }
        }
        return false;
    }
}
