package l;

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
public abstract class AbstractServiceC14974 extends Service {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45638 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C0157 f45639 = new C0157(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22695 f45641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2727 f45642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HandlerC7919 f45643;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C12817 m35456();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void m35458();

    public AbstractServiceC14974() {
        new C9996(this, "android.media.session.MediaController", -1, -1, null);
        this.f45640 = new ArrayList();
        this.f45642 = new C2727();
        this.f45643 = new HandlerC7919(this);
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f45641 = new C17091(this);
        } else if (i >= 26) {
            this.f45641 = new C17797(this);
        } else if (i >= 23) {
            this.f45641 = new C1569(this);
        } else {
            this.f45641 = new C22695(this);
        }
        this.f45641.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f45643.m21202();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f45641.f73331.onBind(intent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35457(Message message) {
        Bundle data = message.getData();
        int i = message.what;
        C0157 c0157 = this.f45639;
        switch (i) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                C23645.m52135(bundle);
                String string = data.getString("data_package_name");
                int i2 = data.getInt("data_calling_pid");
                int i3 = data.getInt("data_calling_uid");
                C0863 c0863 = new C0863(message.replyTo);
                AbstractServiceC14974 abstractServiceC14974 = c0157.f1338;
                if (string != null) {
                    for (String str : abstractServiceC14974.getPackageManager().getPackagesForUid(i3)) {
                        if (str.equals(string)) {
                            abstractServiceC14974.f45643.m21203(new RunnableC6508(i2, i3, bundle, c0157, c0863, string));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
            case 2:
                c0157.f1338.f45643.m21203(new RunnableC20620(c0157, new C0863(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                C23645.m52135(bundle2);
                c0157.f1338.f45643.m21203(new RunnableC9331(c0157, new C0863(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                return;
            case 4:
                c0157.f1338.f45643.m21203(new RunnableC8625(c0157, new C0863(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                String string2 = data.getString("data_media_item_id");
                C21529 c21529 = (C21529) data.getParcelable("data_result_receiver");
                C0863 c0864 = new C0863(message.replyTo);
                c0157.getClass();
                if (TextUtils.isEmpty(string2) || c21529 == null) {
                    return;
                }
                c0157.f1338.f45643.m21203(new RunnableC15679(c0157, c0864, string2, c21529));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                C23645.m52135(bundle3);
                c0157.f1338.f45643.m21203(new RunnableC2275(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, c0157, new C0863(message.replyTo), data.getString("data_package_name")));
                return;
            case 7:
                c0157.f1338.f45643.m21203(new RunnableC3686(c0157, new C0863(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                C23645.m52135(bundle4);
                String string3 = data.getString("data_search_query");
                C21529 c215210 = (C21529) data.getParcelable("data_result_receiver");
                C0863 c0865 = new C0863(message.replyTo);
                c0157.getClass();
                if (TextUtils.isEmpty(string3) || c215210 == null) {
                    return;
                }
                c0157.f1338.f45643.m21203(new RunnableC18503(c0157, c0865, string3, bundle4, c215210));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                C23645.m52135(bundle5);
                String string4 = data.getString("data_custom_action");
                C21529 c215211 = (C21529) data.getParcelable("data_result_receiver");
                C0863 c0866 = new C0863(message.replyTo);
                c0157.getClass();
                if (TextUtils.isEmpty(string4) || c215211 == null) {
                    return;
                }
                c0157.f1338.f45643.m21203(new RunnableC19209(c0157, c0866, string4, bundle5, c215211));
                return;
            default:
                message.toString();
                return;
        }
    }
}
