package bin.mt.plugin.api.translation;

/* JADX INFO: loaded from: classes.dex */
public interface BatchTranslationEngine extends TranslationEngine {

    public interface BatchingStrategy {
        void reset();

        boolean tryAdd(String str);
    }

    String[] batchTranslate(String[] strArr, String str, String str2);

    BatchingStrategy createBatchingStrategy();

    @Deprecated
    String translate(String str, String str2, String str3);
}
