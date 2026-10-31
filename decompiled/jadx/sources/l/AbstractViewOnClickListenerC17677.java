package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1J5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC17677 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7527 f54077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13876 f54078;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5953 f54079;

    public AbstractViewOnClickListenerC17677(C13876 c13876, View view) {
        super(view);
        this.f54078 = c13876;
        C19890.m45744(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C13876 c13876 = this.f54078;
        if (c13876.m33267()) {
            if (!c13876.m33272(this.f54077)) {
                return false;
            }
            c13876.m33261(this);
            return true;
        }
        return c13876.m33266(view, this.f54077, this);
    }
}
