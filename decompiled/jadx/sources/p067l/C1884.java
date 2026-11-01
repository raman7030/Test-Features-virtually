package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩷ܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C0974 f70512;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1324 f70513;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1044 f70514;

    public C1884(C1324 c1324, C0974 c0974, C1044 c1044) {
        this.f70513 = c1324;
        this.f70512 = c0974;
        this.f70514 = c1044;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1324 c1324 = this.f70513;
        boolean[] zArr = c1324.f32408;
        C0974 c0974 = this.f70512;
        if (zArr != null) {
            zArr[i] = c0974.isItemChecked(i);
        }
        c1324.f32412.onClick(this.f70514.f15776, i, c0974.isItemChecked(i));
    }
}
