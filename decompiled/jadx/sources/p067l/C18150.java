package p067l;

import android.os.SystemClock;
import bin.p000mt.plugin.api.translation.BaseTranslationEngine;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.p010m.p039o.C0180b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18150 extends BaseTranslationEngine {

    /* JADX INFO: renamed from: ֫ */
    public final List f54180;

    /* JADX INFO: renamed from: ۧ */
    public final List f54181;

    /* JADX INFO: renamed from: ܽ */
    public final List f54182;

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public final String name() {
        return "Youdao Translator";
    }

    public C18150() {
        List listAsList = Arrays.asList("zh", "en", "ja", "fr", "de", "ru", "es", "pt", "it", "vi", "id", "ar", "nl", "th");
        this.f54180 = listAsList;
        this.f54181 = listAsList.subList(1, listAsList.size());
        this.f54182 = Collections.singletonList("zh");
        init(new C7109());
    }

    @Override // bin.p000mt.plugin.api.translation.BaseTranslationEngine
    public final void onBuildConfiguration(TranslationEngine.ConfigurationBuilder configurationBuilder) {
        super.onBuildConfiguration(configurationBuilder);
        configurationBuilder.setAllowBatchTranslationBySeparator(true);
        configurationBuilder.setMaxTranslationTextLength(C0180b.f790j0);
        configurationBuilder.setTargetLanguageMutable(true);
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public final List loadSourceLanguages() {
        return this.f54180;
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public final List loadTargetLanguages(String str) {
        if (str.equals("zh")) {
            return this.f54181;
        }
        return this.f54182;
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine, bin.p000mt.plugin.api.translation.BatchTranslationEngine
    public final String translate(String str, String str2, String str3) {
        SystemClock.sleep(300L);
        return C19781.m44957(str, C19492.m44321(str, str2, str3));
    }
}
