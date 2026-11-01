package p067l;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10494 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final ImageView f29055;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f29056;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f29057;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9823 f29058;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10494(C9823 c9823, View view) {
        super(view);
        this.f29058 = c9823;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f29056 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f29057 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f29055 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10494 c10494 = this.f30998;
                C9823.m22923(c10494.f29058, c10494.getBindingAdapterPosition());
            }
        });
    }
}
