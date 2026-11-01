package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13412 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC9368 f37629;

    public C13412(ActivityC9368 activityC9368) {
        this.f37629 = activityC9368;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b;
        String action = intent.getAction();
        C12826.requireNonNull(action);
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
        ActivityC9368 activityC9368 = this.f37629;
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("taskID");
                int intExtra = intent.getIntExtra("id", -1);
                C18280 c18280M21776 = ActivityC9368.m21776(activityC9368, stringExtra);
                if (c18280M21776 != null) {
                    c18280M21776.f54571 = intExtra;
                    c18280M21776.f54575 = 0;
                    ArrayList arrayList = new ArrayList(activityC9368.f25538);
                    ArrayList arrayList2 = new ArrayList(activityC9368.f25530);
                    arrayList.remove(c18280M21776);
                    arrayList2.add(0, c18280M21776);
                    activityC9368.f25538 = C21562.unmodifiableList(arrayList);
                    activityC9368.f25530 = C21562.unmodifiableList(arrayList2);
                    new RunnableC20769(activityC9368);
                }
                activityC9368.f25537.notifyDataSetChanged();
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("taskID");
                TextView textView = (TextView) activityC9368.f25535.findViewWithTag(stringExtra2);
                C18280 c18280M21777 = ActivityC9368.m21776(activityC9368, stringExtra2);
                if (textView != null && c18280M21777 != null) {
                    c18280M21777.f54575 = -1;
                    ActivityC9368.m21772(activityC9368, c18280M21777, textView);
                    break;
                }
                break;
            case 2:
                String stringExtra3 = intent.getStringExtra("taskID");
                if (!ServiceC10905.f30231.contains(stringExtra3)) {
                    Bundle extras = intent.getExtras();
                    C12826.requireNonNull(extras);
                    if (extras.containsKey("message")) {
                        C22682.m50800(intent.getStringExtra("message"));
                    }
                }
                TextView textView2 = (TextView) activityC9368.f25535.findViewWithTag(stringExtra3);
                C18280 c18280M21778 = ActivityC9368.m21776(activityC9368, stringExtra3);
                if (textView2 != null && c18280M21778 != null) {
                    c18280M21778.f54575 = -3;
                    activityC9368.f25537.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }
}
