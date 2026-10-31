package l;

import android.os.SystemClock;
import bin.mt.plugin.api.translation.BaseTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.o.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes5.dex */
public final class C16605 extends BaseTranslationEngine {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f51003;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f51004;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f51005;

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final String name() {
        return "Youdao Translator";
    }

    public C16605() {
        List listAsList = Arrays.asList("zh", "en", "ja", "fr", "de", "ru", "es", "pt", "it", "vi", "id", "ar", "nl", "th");
        this.f51003 = listAsList;
        this.f51004 = listAsList.subList(1, listAsList.size());
        this.f51005 = Collections.singletonList("zh");
        init(new C4987());
    }

    @Override // bin.mt.plugin.api.translation.BaseTranslationEngine
    public final void onBuildConfiguration(TranslationEngine.ConfigurationBuilder configurationBuilder) {
        super.onBuildConfiguration(configurationBuilder);
        configurationBuilder.setAllowBatchTranslationBySeparator(true);
        configurationBuilder.setMaxTranslationTextLength(b.j0);
        configurationBuilder.setTargetLanguageMutable(true);
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final List loadSourceLanguages() {
        return this.f51003;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final List loadTargetLanguages(String str) {
        if (str.equals("zh")) {
            return this.f51004;
        }
        return this.f51005;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine, bin.mt.plugin.api.translation.BatchTranslationEngine
    public final String translate(String str, String str2, String str3) {
        SystemClock.sleep(300L);
        return C18321.m42695(str, C18017.m42071(str, str2, str3));
    }
}
