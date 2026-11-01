package bin.p000mt.plugin.api.translation;

import bin.p000mt.plugin.api.PluginContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTranslationEngine implements TranslationEngine {
    public final TranslationEngine.Configuration configuration;
    public PluginContext context;

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public void afterFinish() {
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public void beforeStart() {
    }

    public void init() {
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public void onFinish() {
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public void onStart() {
    }

    public BaseTranslationEngine(TranslationEngine.Configuration configuration) {
        this.configuration = configuration;
    }

    public BaseTranslationEngine() {
        TranslationEngine.ConfigurationBuilder configurationBuilder = new TranslationEngine.ConfigurationBuilder();
        onBuildConfiguration(configurationBuilder);
        this.configuration = configurationBuilder.build();
    }

    public void onBuildConfiguration(TranslationEngine.ConfigurationBuilder configurationBuilder) {
        configurationBuilder.setAutoRepairFormatSpecifiersError(true);
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public final void init(PluginContext pluginContext) {
        this.context = pluginContext;
        init();
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public PluginContext getContext() {
        return this.context;
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public TranslationEngine.Configuration getConfiguration() {
        return this.configuration;
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public String getLanguageDisplayName(String str) {
        String stringNullable = getContext().getStringNullable("lang:" + str);
        return stringNullable != null ? stringNullable : str;
    }

    @Override // bin.p000mt.plugin.api.translation.TranslationEngine
    public boolean onError(Exception exc) {
        PluginContext context = getContext();
        if (context == null) {
            return false;
        }
        context.log(exc);
        return false;
    }
}
