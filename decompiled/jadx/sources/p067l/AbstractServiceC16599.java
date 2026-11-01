package p067l;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC16599 extends Service {

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f48751 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final C2517 f48752 = new C2517(this);

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f48753;

    /* JADX INFO: renamed from: ᩶ */
    public C23937 f48754;

    /* JADX INFO: renamed from: ᩸ */
    public final C0977 f48755;

    /* JADX INFO: renamed from: ᩹ */
    public final HandlerC9894 f48756;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C14549 m37612();

    /* JADX INFO: renamed from: ۧ */
    public abstract void m37614();

    public AbstractServiceC16599() {
        new C11868(this, "android.media.session.MediaController", -1, -1, null);
        this.f48753 = new ArrayList();
        this.f48755 = new C0977();
        this.f48756 = new HandlerC9894(this);
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f48754 = new C18611(this);
        } else if (i >= 26) {
            this.f48754 = new C19282(this);
        } else if (i >= 23) {
            this.f48754 = new C3859(this);
        } else {
            this.f48754 = new C23937(this);
        }
        this.f48754.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f48756.m23168();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f48754.f76057.onBind(intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37613(Message message) {
        Bundle data = message.getData();
        int i = message.what;
        C2517 c2517 = this.f48752;
        switch (i) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                C2015.m54538(bundle);
                String string = data.getString("data_package_name");
                int i2 = data.getInt("data_calling_pid");
                int i3 = data.getInt("data_calling_uid");
                C3188 c3188 = new C3188(message.replyTo);
                AbstractServiceC16599 abstractServiceC16599 = c2517.f4113;
                if (string != null) {
                    for (String str : abstractServiceC16599.getPackageManager().getPackagesForUid(i3)) {
                        if (str.equals(string)) {
                            abstractServiceC16599.f48756.m23169(new RunnableC8553(i2, i3, bundle, c2517, c3188, string));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
            case 2:
                c2517.f4113.f48756.m23169(new RunnableC21965(c2517, new C3188(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                C2015.m54538(bundle2);
                c2517.f4113.f48756.m23169(new RunnableC11236(c2517, new C3188(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                return;
            case 4:
                c2517.f4113.f48756.m23169(new RunnableC10565(c2517, new C3188(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                String string2 = data.getString("data_media_item_id");
                C1910 c1910 = (C1910) data.getParcelable("data_result_receiver");
                C3188 c3189 = new C3188(message.replyTo);
                c2517.getClass();
                if (TextUtils.isEmpty(string2) || c1910 == null) {
                    return;
                }
                c2517.f4113.f48756.m23169(new RunnableC17269(c2517, c3189, string2, c1910));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                C2015.m54538(bundle3);
                c2517.f4113.f48756.m23169(new RunnableC4530(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, c2517, new C3188(message.replyTo), data.getString("data_package_name")));
                return;
            case 7:
                c2517.f4113.f48756.m23169(new RunnableC5871(c2517, new C3188(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                C2015.m54538(bundle4);
                String string3 = data.getString("data_search_query");
                C1910 c1911 = (C1910) data.getParcelable("data_result_receiver");
                C3188 c31810 = new C3188(message.replyTo);
                c2517.getClass();
                if (TextUtils.isEmpty(string3) || c1911 == null) {
                    return;
                }
                c2517.f4113.f48756.m23169(new RunnableC19953(c2517, c31810, string3, bundle4, c1911));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                C2015.m54538(bundle5);
                String string4 = data.getString("data_custom_action");
                C1910 c1912 = (C1910) data.getParcelable("data_result_receiver");
                C3188 c31811 = new C3188(message.replyTo);
                c2517.getClass();
                if (TextUtils.isEmpty(string4) || c1912 == null) {
                    return;
                }
                c2517.f4113.f48756.m23169(new RunnableC20624(c2517, c31811, string4, bundle5, c1912));
                return;
            default:
                message.toString();
                return;
        }
    }
}
