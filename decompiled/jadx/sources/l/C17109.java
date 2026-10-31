package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17109 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f52438;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f52439;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Intent f52440;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f52441;

    public C17109(AbstractActivityC3346 abstractActivityC3346) {
        Activity activity;
        abstractActivityC3346.getClass();
        this.f52439 = abstractActivityC3346;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f52440 = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", abstractActivityC3346.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", abstractActivityC3346.getPackageName());
        action.addFlags(524288);
        Context baseContext = abstractActivityC3346;
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
            this.f52440.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f52440.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40142() {
        ArrayList arrayList = this.f52441;
        Intent intent = this.f52440;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = this.f52441;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) this.f52441.get(0));
                C14286.m34067(intent, this.f52441);
            } else {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f52441);
            C14286.m34067(intent, this.f52441);
        }
        this.f52439.startActivity(Intent.createChooser(intent, this.f52438));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40139() {
        this.f52438 = this.f52439.getText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40143(String str) {
        this.f52440.setType(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40140(Uri uri) {
        if (this.f52441 == null) {
            this.f52441 = new ArrayList();
        }
        this.f52441.add(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40141(String str) {
        this.f52440.putExtra("android.intent.extra.SUBJECT", str);
    }
}
