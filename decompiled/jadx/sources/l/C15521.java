package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15521 extends AbstractC3255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f47442;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10402 f47443;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f47444;

    public C15521(int i, View view) {
        super(view);
        this.f47443 = (C10402) view.findViewById(R.id.icon);
        this.f47444 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f47442 = imageView;
        imageView.setAlpha(0.5f);
        C19890.m45741(view);
    }
}
