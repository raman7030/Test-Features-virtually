package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6897 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9720 f21299;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f21300;

    public C6897(C9720 c9720, C4075 c4075) {
        this.f21299 = c9720;
        this.f21300 = c4075;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C9720 c9720 = this.f21299;
        DialogInterface.OnClickListener onClickListener = c9720.f29436;
        C4075 c4075 = this.f21300;
        onClickListener.onClick(c4075.f12961, i);
        if (c9720.f29433) {
            return;
        }
        c4075.f12961.dismiss();
    }
}
