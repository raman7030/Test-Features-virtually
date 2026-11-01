package bin.p000mt.plugin.api.translation;

import bin.p000mt.plugin.api.PluginContext;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface TranslationEngine {

    @FunctionalInterface
    public interface TextLengthCalculator {
        int calculate(String str);
    }

    void afterFinish();

    void beforeStart();

    Configuration getConfiguration();

    PluginContext getContext();

    String getLanguageDisplayName(String str);

    void init(PluginContext pluginContext);

    List loadSourceLanguages();

    List loadTargetLanguages(String str);

    String name();

    boolean onError(Exception exc);

    void onFinish();

    void onStart();

    String translate(String str, String str2, String str3);

    public class ConfigurationBuilder {
        public boolean acceptTranslated;
        public boolean allowBatchTranslationBySeparator;
        public boolean autoRepairFormatSpecifiersError;
        public boolean disableAutoHideLanguage;
        public boolean forceNotToSkipTranslated;
        public int maxTranslationTextLength;
        public boolean targetLanguageMutable;
        public TextLengthCalculator textLengthCalculator;

        public ConfigurationBuilder setMaxTranslationTextLength(int i) {
            this.maxTranslationTextLength = i;
            return this;
        }

        public ConfigurationBuilder setTextLengthCalculator(TextLengthCalculator textLengthCalculator) {
            this.textLengthCalculator = textLengthCalculator;
            return this;
        }

        public ConfigurationBuilder setAllowBatchTranslationBySeparator(boolean z) {
            this.allowBatchTranslationBySeparator = z;
            return this;
        }

        public ConfigurationBuilder setAcceptTranslated(boolean z) {
            this.acceptTranslated = z;
            return this;
        }

        public ConfigurationBuilder setForceNotToSkipTranslated(boolean z) {
            this.forceNotToSkipTranslated = z;
            return this;
        }

        public ConfigurationBuilder setTargetLanguageMutable(boolean z) {
            this.targetLanguageMutable = z;
            return this;
        }

        public ConfigurationBuilder setAutoRepairFormatSpecifiersError(boolean z) {
            this.autoRepairFormatSpecifiersError = z;
            return this;
        }

        @Deprecated
        public ConfigurationBuilder setAutoRepairFormatControlError(boolean z) {
            this.autoRepairFormatSpecifiersError = z;
            return this;
        }

        public ConfigurationBuilder setDisableAutoHideLanguage(boolean z) {
            this.disableAutoHideLanguage = z;
            return this;
        }

        public Configuration build() {
            return new Configuration(this.maxTranslationTextLength, this.textLengthCalculator, this.allowBatchTranslationBySeparator, this.acceptTranslated, this.forceNotToSkipTranslated, this.targetLanguageMutable, this.autoRepairFormatSpecifiersError, this.disableAutoHideLanguage);
        }
    }

    public class Configuration {
        public final boolean acceptTranslated;
        public final boolean allowBatchTranslationBySeparator;
        public final boolean autoRepairFormatSpecifiersError;
        public final boolean disableAutoHideLanguage;
        public final boolean forceNotToSkipTranslated;
        public final int maxTranslationTextLength;
        public final boolean targetLanguageMutable;
        public final TextLengthCalculator textLengthCalculator;

        public Configuration(int i, TextLengthCalculator textLengthCalculator, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.maxTranslationTextLength = i;
            this.textLengthCalculator = textLengthCalculator;
            this.allowBatchTranslationBySeparator = z;
            this.acceptTranslated = z2;
            this.forceNotToSkipTranslated = z3;
            this.targetLanguageMutable = z4;
            this.autoRepairFormatSpecifiersError = z5;
            this.disableAutoHideLanguage = z6;
        }
    }
}
