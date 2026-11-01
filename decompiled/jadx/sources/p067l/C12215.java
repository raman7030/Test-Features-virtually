package p067l;

import bin.p000mt.plugin.api.translation.BaseBatchTranslationEngine;
import bin.p000mt.plugin.api.translation.BatchTranslationEngine;
import bin.p000mt.plugin.api.translation.TranslationEngine;

/* JADX INFO: renamed from: l.ۤܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W7H2 */
/* JADX INFO: loaded from: classes3.dex */
public class C12215 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ֫ */
    public final TranslationEngine.TextLengthCalculator f34136;

    /* JADX INFO: renamed from: ۧ */
    public int f34137;

    /* JADX INFO: renamed from: ܳ */
    public int f34138;

    /* JADX INFO: renamed from: ܽ */
    public final int f34139;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ BaseBatchTranslationEngine f34140;

    /* JADX INFO: renamed from: ᩳ */
    public final int f34141;

    public C12215(BaseBatchTranslationEngine baseBatchTranslationEngine, int i, int i2) {
        this.f34140 = baseBatchTranslationEngine;
        this.f34139 = i;
        this.f34141 = i2;
        this.f34136 = baseBatchTranslationEngine.getConfiguration().textLengthCalculator;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public void reset() {
        this.f34137 = 0;
        this.f34138 = 0;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public boolean tryAdd(String str) {
        int i = this.f34139;
        if (i > 0 && this.f34137 >= i) {
            return false;
        }
        TranslationEngine.TextLengthCalculator textLengthCalculator = this.f34136;
        int length = textLengthCalculator == null ? str.length() : textLengthCalculator.calculate(str);
        int i2 = this.f34141;
        if (i2 > 0 && this.f34138 + length > i2) {
            return false;
        }
        this.f34137++;
        this.f34138 += length;
        return true;
    }
}
