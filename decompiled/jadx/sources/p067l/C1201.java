package p067l;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ۙ */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1201 {

    /* JADX INFO: renamed from: ֫ */
    public ComponentName f25023;

    /* JADX INFO: renamed from: ۖ */
    public int f25024;

    /* JADX INFO: renamed from: ۜ */
    public Intent[] f25025;

    /* JADX INFO: renamed from: ۡ */
    public CharSequence f25026;

    /* JADX INFO: renamed from: ۢ */
    public C1061 f25027;

    /* JADX INFO: renamed from: ۧ */
    public Set f25028;

    /* JADX INFO: renamed from: ܳ */
    public C1073 f25029;

    /* JADX INFO: renamed from: ܺ */
    public C1538[] f25030;

    /* JADX INFO: renamed from: ܽ */
    public Context f25031;

    /* JADX INFO: renamed from: ܿ */
    public PersistableBundle f25032;

    /* JADX INFO: renamed from: ᩳ */
    public CharSequence f25033;

    /* JADX INFO: renamed from: ᩷ */
    public CharSequence f25034;

    /* JADX INFO: renamed from: ᩻ */
    public String f25035;

    /* JADX INFO: renamed from: ᩳ */
    public final ShortcutInfo m21284() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f25031, this.f25035).setShortLabel(this.f25034).setIntents(this.f25025);
        C1073 c1073 = this.f25029;
        if (c1073 != null) {
            intents.setIcon(c1073.m15508(this.f25031));
        }
        if (!TextUtils.isEmpty(this.f25026)) {
            intents.setLongLabel(this.f25026);
        }
        if (!TextUtils.isEmpty(this.f25033)) {
            intents.setDisabledMessage(this.f25033);
        }
        ComponentName componentName = this.f25023;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f25028;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f25024);
        PersistableBundle persistableBundle = this.f25032;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C1538[] c1538Arr = this.f25030;
            if (c1538Arr != null && c1538Arr.length > 0) {
                int length = c1538Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f25030[i].m35769();
                }
                intents.setPersons(personArr);
            }
            C1061 c1061 = this.f25027;
            if (c1061 != null) {
                intents.setLocusId(c1061.m15001());
            }
            intents.setLongLived(false);
        } else {
            if (this.f25032 == null) {
                this.f25032 = new PersistableBundle();
            }
            C1538[] c1538Arr2 = this.f25030;
            if (c1538Arr2 != null && c1538Arr2.length > 0) {
                this.f25032.putInt("extraPersonCount", c1538Arr2.length);
                int i2 = 0;
                while (i2 < this.f25030.length) {
                    PersistableBundle persistableBundle2 = this.f25032;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    persistableBundle2.putPersistableBundle(sb.toString(), this.f25030[i2].m35770());
                    i2 = i3;
                }
            }
            C1061 c1062 = this.f25027;
            if (c1062 != null) {
                this.f25032.putString("extraLocusId", c1062.m15000());
            }
            this.f25032.putBoolean("extraLongLived", false);
            intents.setExtras(this.f25032);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C1971.m53163(intents);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21281() {
        return this.f25035;
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m21283() {
        return this.f25034;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Intent m21282() {
        Intent[] intentArr = this.f25025;
        return intentArr[intentArr.length - 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m21280(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1516(context, (ShortcutInfo) it.next()).m34771());
        }
        return arrayList;
    }
}
