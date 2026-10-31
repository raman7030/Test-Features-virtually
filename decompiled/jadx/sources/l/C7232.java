package l;

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

/* JADX INFO: renamed from: l.۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7232 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ComponentName f22140;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f22141;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Intent[] f22142;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence f22143;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4410 f22144;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f22145;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4656 f22146;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14035[] f22147;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Context f22148;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PersistableBundle f22149;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f22150;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f22151;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f22152;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ShortcutInfo m19335() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f22148, this.f22152).setShortLabel(this.f22151).setIntents(this.f22142);
        C4656 c4656 = this.f22146;
        if (c4656 != null) {
            intents.setIcon(c4656.m13633(this.f22148));
        }
        if (!TextUtils.isEmpty(this.f22143)) {
            intents.setLongLabel(this.f22143);
        }
        if (!TextUtils.isEmpty(this.f22150)) {
            intents.setDisabledMessage(this.f22150);
        }
        ComponentName componentName = this.f22140;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f22145;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f22141);
        PersistableBundle persistableBundle = this.f22149;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C14035[] c14035Arr = this.f22147;
            if (c14035Arr != null && c14035Arr.length > 0) {
                int length = c14035Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f22147[i].m33649();
                }
                intents.setPersons(personArr);
            }
            C4410 c4410 = this.f22144;
            if (c4410 != null) {
                intents.setLocusId(c4410.m13137());
            }
            intents.setLongLived(false);
        } else {
            if (this.f22149 == null) {
                this.f22149 = new PersistableBundle();
            }
            C14035[] c14035Arr2 = this.f22147;
            if (c14035Arr2 != null && c14035Arr2.length > 0) {
                this.f22149.putInt("extraPersonCount", c14035Arr2.length);
                int i2 = 0;
                while (i2 < this.f22147.length) {
                    PersistableBundle persistableBundle2 = this.f22149;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    persistableBundle2.putPersistableBundle(sb.toString(), this.f22147[i2].m33650());
                    i2 = i3;
                }
            }
            C4410 c4411 = this.f22144;
            if (c4411 != null) {
                this.f22149.putString("extraLocusId", c4411.m13136());
            }
            this.f22149.putBoolean("extraLongLived", false);
            intents.setExtras(this.f22149);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C22754.m50830(intents);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19332() {
        return this.f22152;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m19334() {
        return this.f22151;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Intent m19333() {
        Intent[] intentArr = this.f22142;
        return intentArr[intentArr.length - 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m19331(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C13581(context, (ShortcutInfo) it.next()).m32659());
        }
        return arrayList;
    }
}
