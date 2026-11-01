package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1J5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC19169 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public C9522 f57270;

    /* JADX INFO: renamed from: ᩸ */
    public C15556 f57271;

    /* JADX INFO: renamed from: ᩹ */
    public C8026 f57272;

    public AbstractViewOnClickListenerC19169(C15556 c15556, View view) {
        super(view);
        this.f57271 = c15556;
        C21272.m48055(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C15556 c15556 = this.f57271;
        if (c15556.m35386()) {
            if (!c15556.m35391(this.f57270)) {
                return false;
            }
            c15556.m35380(this);
            return true;
        }
        return c15556.m35385(view, this.f57270, this);
    }
}
