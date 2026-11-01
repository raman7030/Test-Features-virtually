package p067l;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۚۤ */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1104 {

    /* JADX INFO: renamed from: ֫ */
    public int f19345;

    /* JADX INFO: renamed from: ۧ */
    public int f19346;

    /* JADX INFO: renamed from: ܽ */
    public final TextPaint f19347;

    /* JADX INFO: renamed from: ᩳ */
    public TextDirectionHeuristic f19348;

    public C1104(TextPaint textPaint) {
        this.f19347 = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f19345 = 1;
            this.f19346 = 1;
        } else {
            this.f19346 = 0;
            this.f19345 = 0;
        }
        this.f19348 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17110(int i) {
        this.f19345 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17112(int i) {
        this.f19346 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17111(TextDirectionHeuristic textDirectionHeuristic) {
        this.f19348 = textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C0894 m17109() {
        return new C0894(this.f19347, this.f19348, this.f19345, this.f19346);
    }
}
