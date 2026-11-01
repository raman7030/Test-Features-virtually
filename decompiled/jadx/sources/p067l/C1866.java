package p067l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۙ */
/* JADX INFO: compiled from: I53K */
/* JADX INFO: loaded from: classes4.dex */
public final class C1866 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f69084 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final ActivityC0904 f69085;

    public C1866(ActivityC0904 activityC0904) {
        this.f69085 = activityC0904;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1866 m49550(ActivityC0904 activityC0904) {
        return new C1866(activityC0904);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49551(ActivityC0904 activityC0904) {
        Intent intentMo6356 = activityC0904.mo6356();
        if (intentMo6356 == null) {
            intentMo6356 = C1748.m44859(activityC0904);
        }
        if (intentMo6356 != null) {
            ComponentName component = intentMo6356.getComponent();
            ActivityC0904 activityC0905 = this.f69085;
            if (component == null) {
                component = intentMo6356.resolveActivity(activityC0905.getPackageManager());
            }
            ArrayList arrayList = this.f69084;
            int size = arrayList.size();
            try {
                for (Intent intentM44860 = C1748.m44860(activityC0905, component); intentM44860 != null; intentM44860 = C1748.m44860(activityC0905, intentM44860.getComponent())) {
                    arrayList.add(size, intentM44860);
                }
                arrayList.add(intentMo6356);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f69084.iterator();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49552() {
        ArrayList arrayList = this.f69084;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f69085.startActivities(intentArr, null);
    }
}
