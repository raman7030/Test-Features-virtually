package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TransferService extends Service {

    /* JADX INFO: renamed from: ۗ */
    public static TransferNetworkLossHandler f1495;

    /* JADX INFO: renamed from: ۙ */
    public static final Log f1496 = LogFactory.m1468(TransferService.class);

    /* JADX INFO: renamed from: ᩸ */
    public boolean f1498 = true;

    /* JADX INFO: renamed from: ᩹ */
    public int f1499 = 3462;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f1497 = true;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log log = f1496;
        log.mo1463("Starting Transfer Service to listen for network connectivity changes.");
        f1495 = TransferNetworkLossHandler.m1545(getApplicationContext());
        synchronized (this) {
            if (this.f1498) {
                try {
                    try {
                        log.mo1463("Registering the network receiver");
                        registerReceiver(f1495, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        this.f1498 = false;
                    } catch (IllegalStateException unused) {
                        f1496.mo1466("Ignoring the leak in registering the receiver.");
                    }
                } catch (IllegalArgumentException unused2) {
                    f1496.mo1466("Ignoring the exception trying to register the receiver for connectivity change.");
                }
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            try {
                synchronized (this) {
                    Notification notification = (Notification) intent.getParcelableExtra("notification");
                    if (notification != null) {
                        this.f1499 = intent.getIntExtra("ongoing-notification-id", this.f1499);
                        this.f1497 = intent.getBooleanExtra("remove-notification", this.f1497);
                        f1496.mo1463("Putting the service in Foreground state.");
                        if (i3 >= 34) {
                            startForeground(this.f1499, notification, 1);
                        } else {
                            startForeground(this.f1499, notification);
                        }
                    } else {
                        f1496.mo1457("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f1496.mo1457("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f1498) {
                try {
                    f1496.mo1463("Registering the network receiver");
                    registerReceiver(f1495, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f1498 = false;
                } catch (IllegalArgumentException unused) {
                    f1496.mo1466("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f1496.mo1466("Ignoring the leak in registering the receiver.");
                }
            }
            return 1;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    f1496.mo1463("Moving the service out of the Foreground state.");
                    synchronized (this) {
                        stopForeground(this.f1497);
                    }
                    super.onDestroy();
                }
                f1496.mo1463("De-registering the network receiver.");
                synchronized (this) {
                    if (!this.f1498) {
                        unregisterReceiver(f1495);
                        this.f1498 = true;
                        f1495 = null;
                    }
                    super.onDestroy();
                }
            } catch (IllegalArgumentException unused) {
                f1496.mo1466("Exception trying to de-register the network receiver");
            }
        } catch (Exception e) {
            f1496.mo1457("Error in moving the service out of the foreground state: " + e);
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f1495.m1548()));
        Map mapM1559 = TransferStatusUpdater.m1556(this).m1559();
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(mapM1559.size()));
        for (TransferRecord transferRecord : mapM1559.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f1468, transferRecord.f1473, transferRecord.f1472, Long.valueOf(transferRecord.f1485), Long.valueOf(transferRecord.f1479));
        }
        printWriter.flush();
    }
}
