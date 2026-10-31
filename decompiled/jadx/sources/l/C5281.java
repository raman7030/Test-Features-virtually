package l;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5281 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16509;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextPaint f16510;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextDirectionHeuristic f16511;

    public C5281(TextPaint textPaint) {
        this.f16510 = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f16508 = 1;
            this.f16509 = 1;
        } else {
            this.f16509 = 0;
            this.f16508 = 0;
        }
        this.f16511 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15207(int i) {
        this.f16508 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15209(int i) {
        this.f16509 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15208(TextDirectionHeuristic textDirectionHeuristic) {
        this.f16511 = textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1047 m15206() {
        return new C1047(this.f16510, this.f16511, this.f16508, this.f16509);
    }
}
