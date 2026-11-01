package com.umeng.analytics.vshelper;

/* JADX INFO: loaded from: classes.dex */
public class PageNameMonitor implements InterfaceC0741a {
    public static String currentActivity;
    public static String currentCustomPage;
    public static Object lock = new Object();

    public PageNameMonitor() {
    }

    /* JADX INFO: renamed from: com.umeng.analytics.vshelper.PageNameMonitor$a */
    public class C0740a {

        /* JADX INFO: renamed from: a */
        public static final PageNameMonitor f3017a = new PageNameMonitor();
    }

    public static PageNameMonitor getInstance() {
        return C0740a.f3017a;
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC0741a
    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC0741a
    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC0741a
    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC0741a
    public void customPageEnd(String str) {
        synchronized (lock) {
            currentCustomPage = null;
        }
    }

    public String getCurrenPageName() {
        synchronized (lock) {
            String str = currentCustomPage;
            if (str != null) {
                return str;
            }
            String str2 = currentActivity;
            if (str2 != null) {
                return str2;
            }
            return null;
        }
    }
}
