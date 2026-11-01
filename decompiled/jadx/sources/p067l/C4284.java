package p067l;

import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4284 implements InterfaceC10319 {

    /* JADX INFO: renamed from: ֫ */
    public final TranslationEngine.Configuration f9509;

    /* JADX INFO: renamed from: ۜ */
    public List f9510;

    /* JADX INFO: renamed from: ۧ */
    public final TranslationEngine f9511;

    /* JADX INFO: renamed from: ܳ */
    public String f9512;

    /* JADX INFO: renamed from: ܽ */
    public final C19391 f9513;

    /* JADX INFO: renamed from: ܿ */
    public String f9514;

    /* JADX INFO: renamed from: ᩳ */
    public Set f9515;

    /* JADX INFO: renamed from: ᩷ */
    public List f9516;

    /* JADX INFO: renamed from: ᩻ */
    public final C18249 f9517;

    public C4284(C18249 c18249, TranslationEngine translationEngine) {
        String stringNullable;
        List list = Collections.EMPTY_LIST;
        this.f9510 = list;
        this.f9516 = list;
        this.f9517 = c18249;
        this.f9511 = translationEngine;
        this.f9513 = new C19391(translationEngine);
        PluginContext pluginContextM41540 = c18249.m41540();
        String strName = translationEngine.name();
        if (strName.length() >= 3 && strName.charAt(0) == '{' && C9417.m21911(1, strName) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
            strName = stringNullable;
        }
        this.f9512 = strName;
        TranslationEngine.Configuration configuration = translationEngine.getConfiguration();
        this.f9509 = configuration;
        this.f9515 = configuration.disableAutoHideLanguage ? Collections.EMPTY_SET : C3968.m7914();
        m8699();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m8699() {
        TranslationEngine translationEngine = this.f9511;
        this.f9510 = new ArrayList();
        try {
            for (String str : translationEngine.loadSourceLanguages()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str);
                if (!this.f9515.contains(languageDisplayName)) {
                    this.f9510.add(new C7637(str, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C12474) this.f9517.m41540()).log(th);
            this.f9510.clear();
        }
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final void mo8696(int i) {
        TranslationEngine translationEngine = this.f9511;
        String str = ((C7637) this.f9510.get(i)).f19989;
        this.f9514 = str;
        this.f9516 = new ArrayList();
        try {
            for (String str2 : translationEngine.loadTargetLanguages(str)) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str2);
                if (!this.f9515.contains(languageDisplayName)) {
                    this.f9516.add(new C7637(str2, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C12474) this.f9517.m41540()).log(th);
            this.f9516.clear();
        }
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final int mo8693(int i, String str) {
        TranslationEngine translationEngine = this.f9511;
        try {
            Iterator it = translationEngine.loadTargetLanguages(((C7637) this.f9510.get(i)).f19989).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (!this.f9515.contains(languageDisplayName)) {
                    if (languageDisplayName.equals(str)) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        } catch (Throwable th) {
            ((C12474) this.f9517.m41540()).log(th);
            return -1;
        }
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15012 mo8694(C3613 c3613, C3613 c3614) {
        return new C9236(this, c3613, c3614);
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final void mo8695() {
        String stringNullable;
        TranslationEngine translationEngine = this.f9511;
        C18249 c18249 = this.f9517;
        int i = 0;
        try {
            PluginContext pluginContextM41540 = c18249.m41540();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f9512 = strName;
        } catch (Throwable th) {
            ((C12474) c18249.m41540()).log(th);
            this.f9512 = translationEngine.getClass().getSimpleName();
        }
        this.f9515 = this.f9509.disableAutoHideLanguage ? Collections.EMPTY_SET : C3968.m7914();
        m8699();
        if (this.f9510.isEmpty()) {
            return;
        }
        if (this.f9514 != null) {
            for (int i2 = 0; i2 < this.f9510.size(); i2++) {
                if (((C7637) this.f9510.get(i2)).f19989.equals(this.f9514)) {
                    i = i2;
                    break;
                }
            }
        }
        mo8696(i);
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ᩳ */
    public final List mo8700() {
        return this.f9510;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ܽ */
    public final List mo8698() {
        return this.f9516;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8697() {
        return this.f9509.targetLanguageMutable;
    }

    @Override // p067l.InterfaceC10319
    public final String getId() {
        return this.f9517.m41531() + ":" + this.f9511.getClass();
    }

    public final String toString() {
        return this.f9512;
    }
}
