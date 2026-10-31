package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I53K */
/* JADX INFO: loaded from: classes4.dex */
public final class C20638 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f66404 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC1252 f66405;

    public C20638(ActivityC1252 activityC1252) {
        this.f66405 = activityC1252;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20638 m47223(ActivityC1252 activityC1252) {
        return new C20638(activityC1252);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47224(ActivityC1252 activityC1252) {
        Intent intentMo4112 = activityC1252.mo4112();
        if (intentMo4112 == null) {
            intentMo4112 = C18270.m42600(activityC1252);
        }
        if (intentMo4112 != null) {
            ComponentName component = intentMo4112.getComponent();
            ActivityC1252 activityC1253 = this.f66405;
            if (component == null) {
                component = intentMo4112.resolveActivity(activityC1253.getPackageManager());
            }
            ArrayList arrayList = this.f66404;
            int size = arrayList.size();
            try {
                for (Intent intentM42601 = C18270.m42601(activityC1253, component); intentM42601 != null; intentM42601 = C18270.m42601(activityC1253, intentM42601.getComponent())) {
                    arrayList.add(size, intentM42601);
                }
                arrayList.add(intentMo4112);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f66404.iterator();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47225() {
        ArrayList arrayList = this.f66404;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f66405.startActivities(intentArr, null);
    }
}
