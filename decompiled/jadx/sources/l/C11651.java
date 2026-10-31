package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11651 extends AbstractC19619 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f34747;

    public C11651(ActivityC23809 activityC23809) {
        this.f34747 = activityC23809;
    }

    @Override // l.AbstractC19619
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28542(int i, AbstractC21735 abstractC21735, Object obj) {
        Bundle bundle;
        ActivityC23809 activityC23809 = this.f34747;
        C15383 c15383Mo49059 = abstractC21735.mo49059(activityC23809, obj);
        if (c15383Mo49059 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC10240(this, i, c15383Mo49059));
            return;
        }
        Intent intentMo2798 = abstractC21735.mo2798(activityC23809, obj);
        if (intentMo2798.getExtras() != null && intentMo2798.getExtras().getClassLoader() == null) {
            intentMo2798.setExtrasClassLoader(activityC23809.getClassLoader());
        }
        if (intentMo2798.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo2798.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo2798.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo2798.getAction())) {
            String[] stringArrayExtra = intentMo2798.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C19039.m43890(activityC23809, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo2798.getAction())) {
            C8329 c8329 = (C8329) intentMo2798.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                activityC23809.startIntentSenderForResult(c8329.m21934(), i, c8329.m21931(), c8329.m21932(), c8329.m21933(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6006(this, i, e));
                return;
            }
        }
        activityC23809.startActivityForResult(intentMo2798, i, bundle);
    }
}
