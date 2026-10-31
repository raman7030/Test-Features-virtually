package bin.mt.plugin.api.translation;

import com.alipay.sdk.app.OpenAuthTask;
import l.C10360;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseBatchTranslationEngine extends BaseTranslationEngine implements BatchTranslationEngine {
    public BaseBatchTranslationEngine() {
    }

    public BaseBatchTranslationEngine(TranslationEngine.Configuration configuration) {
        super(configuration);
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine
    public BatchTranslationEngine.BatchingStrategy createBatchingStrategy() {
        return new C10360(this, 100, OpenAuthTask.Duplex);
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine, bin.mt.plugin.api.translation.BatchTranslationEngine
    @Deprecated
    public final String translate(String str, String str2, String str3) {
        throw new RuntimeException();
    }
}
