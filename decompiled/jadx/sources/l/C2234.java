package l;

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
public final class C2234 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2234 f7291;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Object f7292 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f7294;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Handler f7295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f7296 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f7293 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7297 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2234 m7411(ContextWrapper contextWrapper) {
        C2234 c2234;
        synchronized (f7292) {
            if (f7291 == null) {
                f7291 = new C2234(contextWrapper.getApplicationContext());
            }
            c2234 = f7291;
        }
        return c2234;
    }

    public C2234(Context context) {
        this.f7294 = context;
        this.f7295 = new HandlerC9290(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7414(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f7296) {
            C15638 c15638 = new C15638(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f7296.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f7296.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c15638);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f7293.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f7293.put(action, arrayList2);
                }
                arrayList2.add(c15638);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7413(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f7296) {
            ArrayList arrayList = (ArrayList) this.f7296.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15638 c15638 = (C15638) arrayList.get(size);
                c15638.f48135 = true;
                for (int i = 0; i < c15638.f48136.countActions(); i++) {
                    String action = c15638.f48136.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f7293.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C15638 c15639 = (C15638) arrayList2.get(size2);
                            if (c15639.f48137 == broadcastReceiver) {
                                c15639.f48135 = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f7293.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7415(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f7296) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7294.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                intent.toString();
            }
            ArrayList arrayList3 = (ArrayList) this.f7293.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C15638 c15638 = (C15638) arrayList3.get(i2);
                    if (z) {
                        C11003.toString(c15638.f48136);
                    }
                    if (c15638.f48134) {
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
                        int iMatch = c15638.f48136.match(str2, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c15638);
                            c15638.f48134 = true;
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
                        ((C15638) arrayList5.get(i3)).f48134 = false;
                    }
                    this.f7297.add(new C8584(intent, arrayList5));
                    if (!this.f7295.hasMessages(1)) {
                        this.f7295.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7416(Intent intent) {
        if (m7415(intent)) {
            m7412();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7412() {
        int size;
        C8584[] c8584Arr;
        while (true) {
            synchronized (this.f7296) {
                size = this.f7297.size();
                if (size <= 0) {
                    return;
                }
                c8584Arr = new C8584[size];
                this.f7297.toArray(c8584Arr);
                this.f7297.clear();
            }
            for (int i = 0; i < size; i++) {
                C8584 c8584 = c8584Arr[i];
                int size2 = c8584.f26216.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C15638 c15638 = (C15638) c8584.f26216.get(i2);
                    if (!c15638.f48135) {
                        c15638.f48137.onReceive(this.f7294, c8584.f26215);
                    }
                }
            }
        }
    }
}
