package p067l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۨۧ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C1420 extends AbstractC1815 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC2023 f37746;

    public C1420(ActivityC2023 activityC2023) {
        this.f37746 = activityC2023;
    }

    @Override // p067l.AbstractC1815
    /* JADX INFO: renamed from: ֫ */
    public final void mo30590(int i, AbstractC1920 abstractC1920, Object obj) {
        Bundle bundle;
        ActivityC2023 activityC2023 = this.f37746;
        C1605 c1605Mo51408 = abstractC1920.mo51408(activityC2023, obj);
        if (c1605Mo51408 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1350(this, i, c1605Mo51408));
            return;
        }
        Intent intentMo5143 = abstractC1920.mo5143(activityC2023, obj);
        if (intentMo5143.getExtras() != null && intentMo5143.getExtras().getClassLoader() == null) {
            intentMo5143.setExtrasClassLoader(activityC2023.getClassLoader());
        }
        if (intentMo5143.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo5143.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo5143.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo5143.getAction())) {
            String[] stringArrayExtra = intentMo5143.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C1786.m46159(activityC2023, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo5143.getAction())) {
            C1255 c1255 = (C1255) intentMo5143.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                activityC2023.startIntentSenderForResult(c1255.m23904(), i, c1255.m23901(), c1255.m23902(), c1255.m23903(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1140(this, i, e));
                return;
            }
        }
        activityC2023.startActivityForResult(intentMo5143, i, bundle);
    }
}
