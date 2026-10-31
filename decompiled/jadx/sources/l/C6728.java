package l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes3.dex */
public class C6728 extends AbstractC1083 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static String f20889 = ApplicationC20075.f65008.getString("src_lan", null);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String f20890 = ApplicationC20075.f65008.getString("tar_lan", null);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Spinner f20891;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public View f20892;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f20893;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f20895;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f20896;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f20899;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TranslationEngine.Configuration f20900;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Spinner f20902;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f20903;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f20904;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17911 f20905;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f20906;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f20908;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16709 f20909;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20898 = new ArrayList();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f20907 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f20897 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20894 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20901 = true;

    public C6728(AbstractActivityC3346 abstractActivityC3346, C16709 c16709, TranslationEngine translationEngine) {
        String stringNullable;
        this.f20893 = abstractActivityC3346;
        this.f20909 = c16709;
        this.f20903 = translationEngine;
        this.f20905 = new C17911(translationEngine);
        if (c16709 != null) {
            PluginContext pluginContextM39304 = c16709.m39304();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && C7416.m19937(1, strName) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f20904 = strName;
        } else {
            this.f20904 = translationEngine.name();
        }
        this.f20900 = translationEngine.getConfiguration();
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f20896 = viewM10216;
        ((TextView) viewM10216.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f20902 = (Spinner) viewM10216.findViewById(R.id.spinner1);
        View viewM10217 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f20892 = viewM10217;
        ((TextView) viewM10217.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f20891 = (Spinner) viewM10217.findViewById(R.id.spinner1);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m18325() {
        C16709 c16709 = this.f20909;
        return c16709 == null ? "bin.mt.plugin.system" : c16709.m39295();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine m18324() {
        return this.f20903;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m18310() {
        int iMax;
        boolean z;
        Spinner spinner;
        Iterator it;
        String str;
        String languageDisplayName;
        int iMax2 = 0;
        this.f20894 = false;
        this.f20897 = false;
        ArrayList arrayList = this.f20898;
        arrayList.clear();
        ArrayList arrayList2 = this.f20907;
        arrayList2.clear();
        Set setM5684 = this.f20900.disableAutoHideLanguage ? Collections.EMPTY_SET : C1683.m5684();
        TranslationEngine translationEngine = this.f20903;
        ArrayList arrayList3 = new ArrayList(translationEngine.loadSourceLanguages());
        this.f20899 = arrayList3;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String languageDisplayName2 = translationEngine.getLanguageDisplayName((String) it2.next());
            if (setM5684.contains(languageDisplayName2)) {
                it2.remove();
            } else {
                arrayList.add(languageDisplayName2);
            }
        }
        if (this.f20899.isEmpty()) {
            this.f20897 = true;
            this.f20899 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = f20889;
            iMax = str2 != null ? Math.max(0, arrayList.indexOf(str2)) : 0;
            this.f20902.setSelection(iMax);
            z = this.f20897;
            spinner = this.f20891;
            if (z) {
                this.f20906 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
                spinner.setSelection(0);
                return;
            }
            ArrayList arrayList4 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f20899.get(iMax)));
            this.f20906 = arrayList4;
            it = arrayList4.iterator();
            while (it.hasNext()) {
                languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (setM5684.contains(languageDisplayName)) {
                    it.remove();
                } else {
                    arrayList2.add(languageDisplayName);
                }
            }
            if (this.f20906.isEmpty()) {
                this.f20894 = true;
                this.f20906 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
            } else {
                str = f20890;
                if (str != null) {
                    iMax2 = Math.max(0, arrayList2.indexOf(str));
                }
            }
            spinner.setSelection(iMax2);
        }
        this.f20902.setSelection(iMax);
        z = this.f20897;
        spinner = this.f20891;
        if (z) {
            this.f20906 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
            spinner.setSelection(0);
            return;
        }
        ArrayList arrayList5 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f20899.get(iMax)));
        this.f20906 = arrayList5;
        it = arrayList5.iterator();
        while (it.hasNext()) {
            languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM5684.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList2.add(languageDisplayName);
            }
        }
        if (this.f20906.isEmpty()) {
            this.f20894 = true;
            this.f20906 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
        } else {
            str = f20890;
            if (str != null) {
                iMax2 = Math.max(0, arrayList2.indexOf(str));
            }
        }
        spinner.setSelection(iMax2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18309() {
        this.f20901 = false;
        m18310();
        ArrayList arrayList = this.f20898;
        AbstractActivityC3346 abstractActivityC3346 = this.f20893;
        C20065 c20065 = new C20065(abstractActivityC3346, arrayList);
        Spinner spinner = this.f20902;
        spinner.setAdapter((SpinnerAdapter) c20065);
        C20065 c20066 = new C20065(abstractActivityC3346, this.f20907);
        Spinner spinner2 = this.f20891;
        spinner2.setAdapter((SpinnerAdapter) c20066);
        C23661 c23661 = new C23661(this);
        spinner.setOnItemSelectedListener(c23661);
        spinner2.setOnItemSelectedListener(c23661);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m18320() {
        int iMax = 0;
        this.f20894 = false;
        String str = this.f20908;
        TranslationEngine translationEngine = this.f20903;
        this.f20906 = new ArrayList(translationEngine.loadTargetLanguages(str));
        Set setM5684 = this.f20900.disableAutoHideLanguage ? Collections.EMPTY_SET : C1683.m5684();
        ArrayList arrayList = this.f20907;
        arrayList.clear();
        Iterator it = this.f20906.iterator();
        while (it.hasNext()) {
            String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM5684.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList.add(languageDisplayName);
            }
        }
        if (this.f20906.isEmpty()) {
            this.f20894 = true;
            this.f20906 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = this.f20895;
            if (str2 != null) {
                iMax = Math.max(0, this.f20906.indexOf(str2));
            }
        }
        Spinner spinner = this.f20891;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(iMax);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ܿ */
    public final String mo3742() {
        return this.f20904;
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final void mo3733(C10856 c10856) {
        int iIndexOf;
        int iIndexOf2;
        c10856.addView(this.f20896);
        c10856.addView(this.f20892);
        if (this.f20901) {
            try {
                m18309();
                return;
            } catch (RuntimeException e) {
                C16709 c16709 = this.f20909;
                if (c16709 != null) {
                    c16709.m39290(e);
                    return;
                } else {
                    C15297.m36311("bin.mt.plugin.system", null, e);
                    return;
                }
            }
        }
        if (this.f20897 || this.f20894) {
            return;
        }
        String str = f20889;
        String str2 = f20890;
        if (str == null || (iIndexOf = this.f20898.indexOf(str)) == -1) {
            return;
        }
        this.f20902.setSelection(iIndexOf);
        if (this.f20900.targetLanguageMutable) {
            this.f20908 = (String) this.f20899.get(iIndexOf);
            m18320();
        }
        if (str2 == null || (iIndexOf2 = this.f20907.indexOf(str2)) == -1) {
            return;
        }
        this.f20891.setSelection(iIndexOf2);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3741() {
        if (this.f20897 || this.f20894) {
            C21374.m48459((CharSequence) "Error!");
            return false;
        }
        int selectedItemPosition = this.f20902.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= this.f20899.size()) {
            StringBuilder sbM32308 = C13325.m32308(selectedItemPosition, "Error: srcLanguageCode index ", " size ");
            sbM32308.append(this.f20899.size());
            C21374.m48459((CharSequence) sbM32308.toString());
            return false;
        }
        this.f20908 = (String) this.f20899.get(selectedItemPosition);
        int selectedItemPosition2 = this.f20891.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.f20906.size()) {
            StringBuilder sbM32309 = C13325.m32308(selectedItemPosition2, "Error: tarLanguageCode index ", " size ");
            sbM32309.append(this.f20906.size());
            C21374.m48459((CharSequence) sbM32309.toString());
            return false;
        }
        String str = (String) this.f20906.get(selectedItemPosition2);
        this.f20895 = str;
        if (!this.f20908.equals(str)) {
            m18321();
            return true;
        }
        C21374.m48459((CharSequence) ("Error: " + f20889 + " >> " + f20890));
        return false;
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۧ */
    public final void mo3739() {
        this.f20903.beforeStart();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۜ */
    public final void mo3736() {
        this.f20903.onStart();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3744() {
        return !this.f20900.forceNotToSkipTranslated;
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۧ */
    public final String mo3738(String str, String str2) {
        if (this.f20900.acceptTranslated && str2 != null) {
            str = str2;
        }
        return this.f20905.m41890(str, this.f20908, this.f20895);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo3737() {
        return this.f20905.m41892();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ᩳ */
    public final BatchTranslationEngine.BatchingStrategy mo3743() {
        return this.f20905.m41889();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo3735(String[] strArr, String[] strArr2) {
        if (this.f20900.acceptTranslated) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return this.f20905.m41891(strArr, this.f20908, this.f20895);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final String mo3731(String str, String str2) {
        return (!this.f20900.acceptTranslated || str2 == null) ? str : str2;
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ܳ */
    public final void mo3740() {
        this.f20903.onFinish();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final void mo3732() {
        this.f20903.afterFinish();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3734(Exception exc) {
        try {
            return this.f20903.onError(exc);
        } catch (Throwable th) {
            C16709 c16709 = this.f20909;
            if (c16709 != null) {
                c16709.m39290(th);
                return false;
            }
            C15297.m36311("bin.mt.plugin.system", null, th);
            return false;
        }
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ᩻ */
    public final void mo3745() {
        if (this.f20901) {
            return;
        }
        m18310();
        ((BaseAdapter) this.f20902.getAdapter()).notifyDataSetChanged();
        ((BaseAdapter) this.f20891.getAdapter()).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m18321() {
        ApplicationC20075.f65008.edit().putString("src_lan", f20889).putString("tar_lan", f20890).apply();
    }
}
