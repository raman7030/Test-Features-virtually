package bin.p000mt.plugin.api.translation;

import com.alipay.sdk.app.OpenAuthTask;
import p067l.C12215;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseBatchTranslationEngine extends BaseTranslationEngine implements BatchTranslationEngine {
    public BaseBatchTranslationEngine() {
    }

    public BaseBatchTranslationEngine(TranslationEngine.Configuration configuration) {
        super(configuration);
    }

    @Override // bin.p000mt.plugin.api.translation.BatchTranslationEngine
    public BatchTranslationEngine.BatchingStrategy createBatchingStrategy() {
        return new C12215(this, 100, OpenAuthTask.Duplex);
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine, bin.p000mt.plugin.api.translation.BatchTranslationEngine
    @Deprecated
    public final String translate(String str, String str2, String str3) {
        throw new RuntimeException();
    }
}
