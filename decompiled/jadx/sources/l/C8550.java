package l;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8550 extends AbstractC3255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f26140;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f26141;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f26142;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f26143;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8550(C7844 c7844, View view) {
        super(view);
        this.f26143 = c7844;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f26141 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f26142 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f26140 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8550 c8550 = this.f28052;
                C7844.m20958(c8550.f26143, c8550.getBindingAdapterPosition());
            }
        });
    }
}
