package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes2.dex */
public final class C4491 {

    /* JADX INFO: renamed from: ܳ */
    public static C4491 f10079;

    /* JADX INFO: renamed from: ᩻ */
    public static final Object f10080 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public final Context f10082;

    /* JADX INFO: renamed from: ܽ */
    public final Handler f10083;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f10084 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f10081 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f10085 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static C4491 m9493(ContextWrapper contextWrapper) {
        C4491 c4491;
        synchronized (f10080) {
            if (f10079 == null) {
                f10079 = new C4491(contextWrapper.getApplicationContext());
            }
            c4491 = f10079;
        }
        return c4491;
    }

    public C4491(Context context) {
        this.f10082 = context;
        this.f10083 = new HandlerC11197(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9496(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f10084) {
            C17230 c17230 = new C17230(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f10084.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f10084.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c17230);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f10081.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f10081.put(action, arrayList2);
                }
                arrayList2.add(c17230);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9495(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f10084) {
            ArrayList arrayList = (ArrayList) this.f10084.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C17230 c17230 = (C17230) arrayList.get(size);
                c17230.f51275 = true;
                for (int i = 0; i < c17230.f51276.countActions(); i++) {
                    String action = c17230.f51276.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f10081.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C17230 c17231 = (C17230) arrayList2.get(size2);
                            if (c17231.f51277 == broadcastReceiver) {
                                c17231.f51275 = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f10081.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9497(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f10084) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f10082.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                intent.toString();
            }
            ArrayList arrayList3 = (ArrayList) this.f10081.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C17230 c17230 = (C17230) arrayList3.get(i2);
                    if (z) {
                        C12826.toString(c17230.f51276);
                    }
                    if (c17230.f51274) {
                        str = action;
                        i = i2;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                    } else {
                        String str2 = action;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        int iMatch = c17230.f51276.match(str2, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c17230);
                            c17230.f51274 = true;
                        }
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C17230) arrayList5.get(i3)).f51274 = false;
                    }
                    this.f10085.add(new C10526(intent, arrayList5));
                    if (!this.f10083.hasMessages(1)) {
                        this.f10083.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9498(Intent intent) {
        if (m9497(intent)) {
            m9494();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9494() {
        int size;
        C10526[] c10526Arr;
        while (true) {
            synchronized (this.f10084) {
                size = this.f10085.size();
                if (size <= 0) {
                    return;
                }
                c10526Arr = new C10526[size];
                this.f10085.toArray(c10526Arr);
                this.f10085.clear();
            }
            for (int i = 0; i < size; i++) {
                C10526 c10526 = c10526Arr[i];
                int size2 = c10526.f29133.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C17230 c17230 = (C17230) c10526.f29133.get(i2);
                    if (!c17230.f51275) {
                        c17230.f51277.onReceive(this.f10082, c10526.f29132);
                    }
                }
            }
        }
    }
}
