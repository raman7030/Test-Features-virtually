package l;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15863 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC15157 f49034;

    public C15863() {
        this.f49033 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f49034 = C3870.f12382;
        this.f49032 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3870 m37603() {
        if (this.f49032 == 2 && this.f49034 == C3870.f12382) {
            return this.f49033 ? C3870.f12378 : C3870.f12379;
        }
        return new C3870(this.f49033, this.f49032, this.f49034);
    }
}
