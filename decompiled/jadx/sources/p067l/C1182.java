package p067l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜܺ */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes3.dex */
public class C1182 extends C1322 {
    @Override // p067l.C1322
    /* JADX INFO: renamed from: ֫ */
    public void mo20490(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1287.m25106("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
