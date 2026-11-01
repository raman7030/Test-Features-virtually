package p067l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.translation.BatchTranslationEngine;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes3.dex */
public class C8763 extends AbstractC3398 {

    /* JADX INFO: renamed from: ۠ */
    public static String f23763 = ApplicationC21448.f67649.getString("src_lan", null);

    /* JADX INFO: renamed from: ܶ */
    public static String f23764 = ApplicationC21448.f67649.getString("tar_lan", null);

    /* JADX INFO: renamed from: ֡ */
    public Spinner f23765;

    /* JADX INFO: renamed from: ֨ */
    public View f23766;

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f23767;

    /* JADX INFO: renamed from: ۘ */
    public String f23769;

    /* JADX INFO: renamed from: ۚ */
    public View f23770;

    /* JADX INFO: renamed from: ۢ */
    public List f23773;

    /* JADX INFO: renamed from: ۧ */
    public TranslationEngine.Configuration f23774;

    /* JADX INFO: renamed from: ܺ */
    public Spinner f23776;

    /* JADX INFO: renamed from: ܽ */
    public final TranslationEngine f23777;

    /* JADX INFO: renamed from: ܿ */
    public String f23778;

    /* JADX INFO: renamed from: ᩳ */
    public final C19391 f23779;

    /* JADX INFO: renamed from: ᩴ */
    public List f23780;

    /* JADX INFO: renamed from: ᩷ */
    public String f23782;

    /* JADX INFO: renamed from: ᩻ */
    public C18249 f23783;

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f23772 = new ArrayList();

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList f23781 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public boolean f23771 = false;

    /* JADX INFO: renamed from: ۖ */
    public boolean f23768 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f23775 = true;

    public C8763(AbstractActivityC5549 abstractActivityC5549, C18249 c18249, TranslationEngine translationEngine) {
        String stringNullable;
        this.f23767 = abstractActivityC5549;
        this.f23783 = c18249;
        this.f23777 = translationEngine;
        this.f23779 = new C19391(translationEngine);
        if (c18249 != null) {
            PluginContext pluginContextM41540 = c18249.m41540();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && C9417.m21911(1, strName) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f23778 = strName;
        } else {
            this.f23778 = translationEngine.name();
        }
        this.f23774 = translationEngine.getConfiguration();
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f23770 = viewM12252;
        ((TextView) viewM12252.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f23776 = (Spinner) viewM12252.findViewById(R.id.spinner1);
        View viewM12253 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f23766 = viewM12253;
        ((TextView) viewM12253.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f23765 = (Spinner) viewM12253.findViewById(R.id.spinner1);
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m20273() {
        C18249 c18249 = this.f23783;
        return c18249 == null ? "bin.mt.plugin.system" : c18249.m41531();
    }

    /* JADX INFO: renamed from: ۡ */
    public final TranslationEngine m20272() {
        return this.f23777;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۘ */
    private void m20258() {
        int iMax;
        boolean z;
        Spinner spinner;
        Iterator it;
        String str;
        String languageDisplayName;
        int iMax2 = 0;
        this.f23768 = false;
        this.f23771 = false;
        ArrayList arrayList = this.f23772;
        arrayList.clear();
        ArrayList arrayList2 = this.f23781;
        arrayList2.clear();
        Set setM7914 = this.f23774.disableAutoHideLanguage ? Collections.EMPTY_SET : C3968.m7914();
        TranslationEngine translationEngine = this.f23777;
        ArrayList arrayList3 = new ArrayList(translationEngine.loadSourceLanguages());
        this.f23773 = arrayList3;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String languageDisplayName2 = translationEngine.getLanguageDisplayName((String) it2.next());
            if (setM7914.contains(languageDisplayName2)) {
                it2.remove();
            } else {
                arrayList.add(languageDisplayName2);
            }
        }
        if (this.f23773.isEmpty()) {
            this.f23771 = true;
            this.f23773 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = f23763;
            iMax = str2 != null ? Math.max(0, arrayList.indexOf(str2)) : 0;
            this.f23776.setSelection(iMax);
            z = this.f23771;
            spinner = this.f23765;
            if (z) {
                this.f23780 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
                spinner.setSelection(0);
                return;
            }
            ArrayList arrayList4 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f23773.get(iMax)));
            this.f23780 = arrayList4;
            it = arrayList4.iterator();
            while (it.hasNext()) {
                languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (setM7914.contains(languageDisplayName)) {
                    it.remove();
                } else {
                    arrayList2.add(languageDisplayName);
                }
            }
            if (this.f23780.isEmpty()) {
                this.f23768 = true;
                this.f23780 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
            } else {
                str = f23764;
                if (str != null) {
                    iMax2 = Math.max(0, arrayList2.indexOf(str));
                }
            }
            spinner.setSelection(iMax2);
        }
        this.f23776.setSelection(iMax);
        z = this.f23771;
        spinner = this.f23765;
        if (z) {
            this.f23780 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
            spinner.setSelection(0);
            return;
        }
        ArrayList arrayList5 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f23773.get(iMax)));
        this.f23780 = arrayList5;
        it = arrayList5.iterator();
        while (it.hasNext()) {
            languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM7914.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList2.add(languageDisplayName);
            }
        }
        if (this.f23780.isEmpty()) {
            this.f23768 = true;
            this.f23780 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
        } else {
            str = f23764;
            if (str != null) {
                iMax2 = Math.max(0, arrayList2.indexOf(str));
            }
        }
        spinner.setSelection(iMax2);
    }

    /* JADX INFO: renamed from: ۖ */
    private void m20257() {
        this.f23775 = false;
        m20258();
        ArrayList arrayList = this.f23772;
        AbstractActivityC5549 abstractActivityC5549 = this.f23767;
        C21438 c21438 = new C21438(abstractActivityC5549, arrayList);
        Spinner spinner = this.f23776;
        spinner.setAdapter((SpinnerAdapter) c21438);
        C21438 c21439 = new C21438(abstractActivityC5549, this.f23781);
        Spinner spinner2 = this.f23765;
        spinner2.setAdapter((SpinnerAdapter) c21439);
        C24856 c24856 = new C24856(this);
        spinner.setOnItemSelectedListener(c24856);
        spinner2.setOnItemSelectedListener(c24856);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ */
    public void m20268() {
        int iMax = 0;
        this.f23768 = false;
        String str = this.f23782;
        TranslationEngine translationEngine = this.f23777;
        this.f23780 = new ArrayList(translationEngine.loadTargetLanguages(str));
        Set setM7914 = this.f23774.disableAutoHideLanguage ? Collections.EMPTY_SET : C3968.m7914();
        ArrayList arrayList = this.f23781;
        arrayList.clear();
        Iterator it = this.f23780.iterator();
        while (it.hasNext()) {
            String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM7914.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList.add(languageDisplayName);
            }
        }
        if (this.f23780.isEmpty()) {
            this.f23768 = true;
            this.f23780 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = this.f23769;
            if (str2 != null) {
                iMax = Math.max(0, this.f23780.indexOf(str2));
            }
        }
        Spinner spinner = this.f23765;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(iMax);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ܿ */
    public final String mo6013() {
        return this.f23778;
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C12686 c12686) {
        int iIndexOf;
        int iIndexOf2;
        c12686.addView(this.f23770);
        c12686.addView(this.f23766);
        if (this.f23775) {
            try {
                m20257();
                return;
            } catch (RuntimeException e) {
                C18249 c18249 = this.f23783;
                if (c18249 != null) {
                    c18249.m41526(e);
                    return;
                } else {
                    C16907.m38472("bin.mt.plugin.system", null, e);
                    return;
                }
            }
        }
        if (this.f23771 || this.f23768) {
            return;
        }
        String str = f23763;
        String str2 = f23764;
        if (str == null || (iIndexOf = this.f23772.indexOf(str)) == -1) {
            return;
        }
        this.f23776.setSelection(iIndexOf);
        if (this.f23774.targetLanguageMutable) {
            this.f23782 = (String) this.f23773.get(iIndexOf);
            m20268();
        }
        if (str2 == null || (iIndexOf2 = this.f23781.indexOf(str2)) == -1) {
            return;
        }
        this.f23765.setSelection(iIndexOf2);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6012() {
        if (this.f23771 || this.f23768) {
            C22682.m50795((CharSequence) "Error!");
            return false;
        }
        int selectedItemPosition = this.f23776.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= this.f23773.size()) {
            StringBuilder sbM34408 = C15033.m34408(selectedItemPosition, "Error: srcLanguageCode index ", " size ");
            sbM34408.append(this.f23773.size());
            C22682.m50795((CharSequence) sbM34408.toString());
            return false;
        }
        this.f23782 = (String) this.f23773.get(selectedItemPosition);
        int selectedItemPosition2 = this.f23765.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.f23780.size()) {
            StringBuilder sbM34409 = C15033.m34408(selectedItemPosition2, "Error: tarLanguageCode index ", " size ");
            sbM34409.append(this.f23780.size());
            C22682.m50795((CharSequence) sbM34409.toString());
            return false;
        }
        String str = (String) this.f23780.get(selectedItemPosition2);
        this.f23769 = str;
        if (!this.f23782.equals(str)) {
            m20269();
            return true;
        }
        C22682.m50795((CharSequence) ("Error: " + f23763 + " >> " + f23764));
        return false;
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۧ */
    public final void mo6010() {
        this.f23777.beforeStart();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۜ */
    public final void mo6007() {
        this.f23777.onStart();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6015() {
        return !this.f23774.forceNotToSkipTranslated;
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۧ */
    public final String mo6009(String str, String str2) {
        if (this.f23774.acceptTranslated && str2 != null) {
            str = str2;
        }
        return this.f23779.m44138(str, this.f23782, this.f23769);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo6008() {
        return this.f23779.m44140();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ᩳ */
    public final BatchTranslationEngine.BatchingStrategy mo6014() {
        return this.f23779.m44137();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo6006(String[] strArr, String[] strArr2) {
        if (this.f23774.acceptTranslated) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return this.f23779.m44139(strArr, this.f23782, this.f23769);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final String mo6002(String str, String str2) {
        return (!this.f23774.acceptTranslated || str2 == null) ? str : str2;
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ܳ */
    public final void mo6011() {
        this.f23777.onFinish();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final void mo6003() {
        this.f23777.afterFinish();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6005(Exception exc) {
        try {
            return this.f23777.onError(exc);
        } catch (Throwable th) {
            C18249 c18249 = this.f23783;
            if (c18249 != null) {
                c18249.m41526(th);
                return false;
            }
            C16907.m38472("bin.mt.plugin.system", null, th);
            return false;
        }
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6016() {
        if (this.f23775) {
            return;
        }
        m20258();
        ((BaseAdapter) this.f23776.getAdapter()).notifyDataSetChanged();
        ((BaseAdapter) this.f23765.getAdapter()).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩵ */
    public static void m20269() {
        ApplicationC21448.f67649.edit().putString("src_lan", f23763).putString("tar_lan", f23764).apply();
    }
}
