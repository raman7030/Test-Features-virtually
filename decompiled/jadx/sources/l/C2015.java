package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2015 implements InterfaceC8365 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.Configuration f6723;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f6724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f6725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f6726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17911 f6727;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6728;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Set f6729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f6730;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16709 f6731;

    public C2015(C16709 c16709, TranslationEngine translationEngine) {
        String stringNullable;
        List list = Collections.EMPTY_LIST;
        this.f6724 = list;
        this.f6730 = list;
        this.f6731 = c16709;
        this.f6725 = translationEngine;
        this.f6727 = new C17911(translationEngine);
        PluginContext pluginContextM39304 = c16709.m39304();
        String strName = translationEngine.name();
        if (strName.length() >= 3 && strName.charAt(0) == '{' && C7416.m19937(1, strName) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
            strName = stringNullable;
        }
        this.f6726 = strName;
        TranslationEngine.Configuration configuration = translationEngine.getConfiguration();
        this.f6723 = configuration;
        this.f6729 = configuration.disableAutoHideLanguage ? Collections.EMPTY_SET : C1683.m5684();
        m6557();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6557() {
        TranslationEngine translationEngine = this.f6725;
        this.f6724 = new ArrayList();
        try {
            for (String str : translationEngine.loadSourceLanguages()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str);
                if (!this.f6729.contains(languageDisplayName)) {
                    this.f6724.add(new C5543(str, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C10632) this.f6731.m39304()).log(th);
            this.f6724.clear();
        }
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6554(int i) {
        TranslationEngine translationEngine = this.f6725;
        String str = ((C5543) this.f6724.get(i)).f17148;
        this.f6728 = str;
        this.f6730 = new ArrayList();
        try {
            for (String str2 : translationEngine.loadTargetLanguages(str)) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str2);
                if (!this.f6729.contains(languageDisplayName)) {
                    this.f6730.add(new C5543(str2, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C10632) this.f6731.m39304()).log(th);
            this.f6730.clear();
        }
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6551(int i, String str) {
        TranslationEngine translationEngine = this.f6725;
        try {
            Iterator it = translationEngine.loadTargetLanguages(((C5543) this.f6724.get(i)).f17148).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (!this.f6729.contains(languageDisplayName)) {
                    if (languageDisplayName.equals(str)) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        } catch (Throwable th) {
            ((C10632) this.f6731.m39304()).log(th);
            return -1;
        }
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13303 mo6552(C1309 c1309, C1309 c13010) {
        return new C7226(this, c1309, c13010);
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6553() {
        String stringNullable;
        TranslationEngine translationEngine = this.f6725;
        C16709 c16709 = this.f6731;
        int i = 0;
        try {
            PluginContext pluginContextM39304 = c16709.m39304();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f6726 = strName;
        } catch (Throwable th) {
            ((C10632) c16709.m39304()).log(th);
            this.f6726 = translationEngine.getClass().getSimpleName();
        }
        this.f6729 = this.f6723.disableAutoHideLanguage ? Collections.EMPTY_SET : C1683.m5684();
        m6557();
        if (this.f6724.isEmpty()) {
            return;
        }
        if (this.f6728 != null) {
            for (int i2 = 0; i2 < this.f6724.size(); i2++) {
                if (((C5543) this.f6724.get(i2)).f17148.equals(this.f6728)) {
                    i = i2;
                    break;
                }
            }
        }
        mo6554(i);
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List mo6558() {
        return this.f6724;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List mo6556() {
        return this.f6730;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6555() {
        return this.f6723.targetLanguageMutable;
    }

    @Override // l.InterfaceC8365
    public final String getId() {
        return this.f6731.m39295() + ":" + this.f6725.getClass();
    }

    public final String toString() {
        return this.f6726;
    }
}
