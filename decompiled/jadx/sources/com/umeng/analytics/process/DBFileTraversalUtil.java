package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class DBFileTraversalUtil {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f2975a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static FileLockUtil f2976b = new FileLockUtil();

    /* JADX INFO: renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    public interface InterfaceC0732a {
        /* JADX INFO: renamed from: a */
        void mo2685a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final InterfaceC0732a interfaceC0732a) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f2975a.execute(new Runnable() { // from class: com.umeng.analytics.process.DBFileTraversalUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        for (File file2 : file.listFiles()) {
                            if (file2.getName().endsWith(InterfaceC0736a.f2998d)) {
                                DBFileTraversalUtil.f2976b.doFileOperateion(file2, fileLockCallback);
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> file: " + file2.getName());
                            }
                        }
                        InterfaceC0732a interfaceC0732a2 = interfaceC0732a;
                        if (interfaceC0732a2 != null) {
                            interfaceC0732a2.mo2685a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> end *** ");
                }
            });
        }
    }
}
