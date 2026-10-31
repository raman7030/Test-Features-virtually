package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C21009 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2664 f67827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9720 f67828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f67829;

    public C21009(C9720 c9720, C2664 c2664, C4075 c4075) {
        this.f67828 = c9720;
        this.f67827 = c2664;
        this.f67829 = c4075;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C9720 c9720 = this.f67828;
        boolean[] zArr = c9720.f29458;
        C2664 c2664 = this.f67827;
        if (zArr != null) {
            zArr[i] = c2664.isItemChecked(i);
        }
        c9720.f29462.onClick(this.f67829.f12961, i, c2664.isItemChecked(i));
    }
}
