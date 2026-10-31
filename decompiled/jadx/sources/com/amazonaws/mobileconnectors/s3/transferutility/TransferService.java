package com.amazonaws.mobileconnectors.s3.transferutility;

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

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static TransferNetworkLossHandler f335;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Log f336 = LogFactory.m302(TransferService.class);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f338 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f339 = 3462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f337 = true;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log log = f336;
        log.mo297("Starting Transfer Service to listen for network connectivity changes.");
        f335 = TransferNetworkLossHandler.m379(getApplicationContext());
        synchronized (this) {
            if (this.f338) {
                try {
                    try {
                        log.mo297("Registering the network receiver");
                        registerReceiver(f335, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        this.f338 = false;
                    } catch (IllegalStateException unused) {
                        f336.mo300("Ignoring the leak in registering the receiver.");
                    }
                } catch (IllegalArgumentException unused2) {
                    f336.mo300("Ignoring the exception trying to register the receiver for connectivity change.");
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
                        this.f339 = intent.getIntExtra("ongoing-notification-id", this.f339);
                        this.f337 = intent.getBooleanExtra("remove-notification", this.f337);
                        f336.mo297("Putting the service in Foreground state.");
                        if (i3 >= 34) {
                            startForeground(this.f339, notification, 1);
                        } else {
                            startForeground(this.f339, notification);
                        }
                    } else {
                        f336.mo291("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f336.mo291("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f338) {
                try {
                    f336.mo297("Registering the network receiver");
                    registerReceiver(f335, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f338 = false;
                } catch (IllegalArgumentException unused) {
                    f336.mo300("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f336.mo300("Ignoring the leak in registering the receiver.");
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
                    f336.mo297("Moving the service out of the Foreground state.");
                    synchronized (this) {
                        stopForeground(this.f337);
                    }
                    super.onDestroy();
                }
                f336.mo297("De-registering the network receiver.");
                synchronized (this) {
                    if (!this.f338) {
                        unregisterReceiver(f335);
                        this.f338 = true;
                        f335 = null;
                    }
                    super.onDestroy();
                }
            } catch (IllegalArgumentException unused) {
                f336.mo300("Exception trying to de-register the network receiver");
            }
        } catch (Exception e) {
            f336.mo291("Error in moving the service out of the foreground state: " + e);
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f335.m382()));
        Map mapM393 = TransferStatusUpdater.m390(this).m393();
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(mapM393.size()));
        for (TransferRecord transferRecord : mapM393.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f308, transferRecord.f313, transferRecord.f312, Long.valueOf(transferRecord.f325), Long.valueOf(transferRecord.f319));
        }
        printWriter.flush();
    }
}
