package p067l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C17120 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final ImageView f50574;

    /* JADX INFO: renamed from: ۧ */
    public final C12255 f50575;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f50576;

    public C17120(int i, View view) {
        super(view);
        this.f50575 = (C12255) view.findViewById(R.id.icon);
        this.f50576 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f50574 = imageView;
        imageView.setAlpha(0.5f);
        C21272.m48052(view);
    }
}
