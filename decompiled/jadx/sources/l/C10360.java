package l;

import bin.mt.plugin.api.translation.BaseBatchTranslationEngine;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;

/* JADX INFO: renamed from: l.ۤܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W7H2 */
/* JADX INFO: loaded from: classes3.dex */
public class C10360 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f31174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31175;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31177;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseBatchTranslationEngine f31178;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31179;

    public C10360(BaseBatchTranslationEngine baseBatchTranslationEngine, int i, int i2) {
        this.f31178 = baseBatchTranslationEngine;
        this.f31177 = i;
        this.f31179 = i2;
        this.f31174 = baseBatchTranslationEngine.getConfiguration().textLengthCalculator;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public void reset() {
        this.f31175 = 0;
        this.f31176 = 0;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public boolean tryAdd(String str) {
        int i = this.f31177;
        if (i > 0 && this.f31175 >= i) {
            return false;
        }
        TranslationEngine.TextLengthCalculator textLengthCalculator = this.f31174;
        int length = textLengthCalculator == null ? str.length() : textLengthCalculator.calculate(str);
        int i2 = this.f31179;
        if (i2 > 0 && this.f31176 + length > i2) {
            return false;
        }
        this.f31175++;
        this.f31176 += length;
        return true;
    }
}
