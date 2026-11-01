package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۜܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1184 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1324 f24178;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1044 f24179;

    public C1184(C1324 c1324, C1044 c1044) {
        this.f24178 = c1324;
        this.f24179 = c1044;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1324 c1324 = this.f24178;
        DialogInterface.OnClickListener onClickListener = c1324.f32386;
        C1044 c1044 = this.f24179;
        onClickListener.onClick(c1044.f15776, i);
        if (c1324.f32383) {
            return;
        }
        c1044.f15776.dismiss();
    }
}
