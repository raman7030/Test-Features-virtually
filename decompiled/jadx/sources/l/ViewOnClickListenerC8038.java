package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8038 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f24776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f24777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19287 f24778;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24779;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5175 f24780;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8038(C5921 c5921, View view) {
        super(view);
        this.f24776 = c5921;
        this.f24777 = (TextView) view.findViewById(R.id.textView);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5921 c5921 = this.f24776;
        if ((c5921.f18162 == null || c5921.f18162.m44838(this.f24780.f16180)) && !C13876.f41361.m22793()) {
            ((ActivityC17169) c5921.requireActivity()).m40354(this.f24780.f16180, this.f24778);
            c5921.f18162.m44818(this.f24780.f16180);
            if (((C0941) c5921.f18158.peek()).f3565.add(this.f24780.f16180 + " " + this.f24779)) {
                C4925.m14316(new Runnable() { // from class: l.֨۟᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC8038 viewOnClickListenerC8038 = this.f3679;
                        C5921 c5922 = viewOnClickListenerC8038.f24776;
                        c5922.f18161.notifyItemChanged(viewOnClickListenerC8038.getAdapterPosition());
                        c5922.m16600();
                    }
                }, 200L);
            }
        }
    }
}
