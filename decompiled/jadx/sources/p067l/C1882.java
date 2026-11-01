package p067l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ܺ */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C1882 extends C1182 {
    @Override // p067l.C1322
    /* JADX INFO: renamed from: ֫ */
    public boolean mo26618(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // p067l.C1182, p067l.C1322
    /* JADX INFO: renamed from: ֫ */
    public void mo20490(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
