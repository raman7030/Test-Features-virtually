package com.umeng.analytics.vshelper;

/* JADX INFO: loaded from: classes.dex */
public class PageNameMonitor implements com.umeng.analytics.vshelper.a {
    public static String currentActivity;
    public static String currentCustomPage;
    public static Object lock = new Object();

    public PageNameMonitor() {
    }

    public class a {
        public static final PageNameMonitor a = new PageNameMonitor();
    }

    public static PageNameMonitor getInstance() {
        return a.a;
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    @Override // com.umeng.analytics.vshelper.a
    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.a
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
