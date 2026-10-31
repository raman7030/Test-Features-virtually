package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20967 extends C6855 {
    @Override // l.C9678
    /* JADX INFO: renamed from: ֫ */
    public boolean mo24604(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // l.C6855, l.C9678
    /* JADX INFO: renamed from: ֫ */
    public void mo18541(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
