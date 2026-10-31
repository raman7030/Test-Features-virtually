package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11620 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f34632;

    public C11620(ActivityC7365 activityC7365) {
        this.f34632 = activityC7365;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b;
        String action = intent.getAction();
        C11003.requireNonNull(action);
        switch (action) {
            case "bin.mt.protect.ProtectUploadService.ACTION_SUCCESS":
                b = 0;
                break;
            case "bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED":
                b = 1;
                break;
            case "bin.mt.protect.ProtectUploadService.ACTION_FAIL":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        ActivityC7365 activityC7365 = this.f34632;
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("taskID");
                int intExtra = intent.getIntExtra("id", -1);
                C16742 c16742M19803 = ActivityC7365.m19803(activityC7365, stringExtra);
                if (c16742M19803 != null) {
                    c16742M19803.f51388 = intExtra;
                    c16742M19803.f51392 = 0;
                    ArrayList arrayList = new ArrayList(activityC7365.f22625);
                    ArrayList arrayList2 = new ArrayList(activityC7365.f22617);
                    arrayList.remove(c16742M19803);
                    arrayList2.add(0, c16742M19803);
                    activityC7365.f22625 = C20195.unmodifiableList(arrayList);
                    activityC7365.f22617 = C20195.unmodifiableList(arrayList2);
                    new RunnableC19361(activityC7365);
                }
                activityC7365.f22624.notifyDataSetChanged();
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("taskID");
                TextView textView = (TextView) activityC7365.f22622.findViewWithTag(stringExtra2);
                C16742 c16742M19804 = ActivityC7365.m19803(activityC7365, stringExtra2);
                if (textView != null && c16742M19804 != null) {
                    c16742M19804.f51392 = -1;
                    ActivityC7365.m19799(activityC7365, c16742M19804, textView);
                    break;
                }
                break;
            case 2:
                String stringExtra3 = intent.getStringExtra("taskID");
                if (!ServiceC8982.f27296.contains(stringExtra3)) {
                    Bundle extras = intent.getExtras();
                    C11003.requireNonNull(extras);
                    if (extras.containsKey("message")) {
                        C21374.m48464(intent.getStringExtra("message"));
                    }
                }
                TextView textView2 = (TextView) activityC7365.f22622.findViewWithTag(stringExtra3);
                C16742 c16742M19805 = ActivityC7365.m19803(activityC7365, stringExtra3);
                if (textView2 != null && c16742M19805 != null) {
                    c16742M19805.f51392 = -3;
                    activityC7365.f22624.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }
}
