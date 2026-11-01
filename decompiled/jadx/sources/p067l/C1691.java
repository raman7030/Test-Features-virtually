package p067l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۙ */
/* JADX INFO: compiled from: D2TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1691 {

    /* JADX INFO: renamed from: ֫ */
    public CharSequence f55620;

    /* JADX INFO: renamed from: ۧ */
    public final Context f55621;

    /* JADX INFO: renamed from: ܽ */
    public final Intent f55622;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f55623;

    public C1691(AbstractActivityC5549 abstractActivityC5549) {
        Activity activity;
        abstractActivityC5549.getClass();
        this.f55621 = abstractActivityC5549;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f55622 = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", abstractActivityC5549.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", abstractActivityC5549.getPackageName());
        action.addFlags(524288);
        Context baseContext = abstractActivityC5549;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f55622.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f55622.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42387() {
        ArrayList arrayList = this.f55623;
        Intent intent = this.f55622;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = this.f55623;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) this.f55623.get(0));
                C1551.m36200(intent, this.f55623);
            } else {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f55623);
            C1551.m36200(intent, this.f55623);
        }
        this.f55621.startActivity(Intent.createChooser(intent, this.f55620));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42384() {
        this.f55620 = this.f55621.getText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42388(String str) {
        this.f55622.setType(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42385(Uri uri) {
        if (this.f55623 == null) {
            this.f55623 = new ArrayList();
        }
        this.f55623.add(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42386(String str) {
        this.f55622.putExtra("android.intent.extra.SUBJECT", str);
    }
}
