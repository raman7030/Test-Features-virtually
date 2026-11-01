package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import p067l.C15033;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f2009 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Log f2010 = LogFactory.m1468(VersionInfoUtils.class);

    /* JADX INFO: renamed from: ܽ */
    public static volatile String f2011;

    /* JADX INFO: renamed from: ֫ */
    public static String m1963() {
        if (f2011 == null) {
            synchronized (VersionInfoUtils.class) {
                if (f2011 == null) {
                    m1964();
                }
            }
        }
        return f2011;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1964() {
        StringBuilder sbM34407 = C15033.m34407(128, "aws-sdk-");
        sbM34407.append(StringUtils.m1954("android"));
        sbM34407.append("/2.81.1 ");
        String property = System.getProperty("os.name");
        if (property != null) {
            property = property.replace(' ', '_');
        }
        sbM34407.append(property);
        sbM34407.append("/");
        String property2 = System.getProperty("os.version");
        if (property2 != null) {
            property2 = property2.replace(' ', '_');
        }
        sbM34407.append(property2);
        sbM34407.append(" ");
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            property3 = property3.replace(' ', '_');
        }
        sbM34407.append(property3);
        sbM34407.append("/");
        String property4 = System.getProperty("java.vm.version");
        if (property4 != null) {
            property4 = property4.replace(' ', '_');
        }
        sbM34407.append(property4);
        sbM34407.append("/");
        String property5 = System.getProperty("java.version");
        if (property5 != null) {
            property5 = property5.replace(' ', '_');
        }
        sbM34407.append(property5);
        String property6 = System.getProperty("user.language");
        String property7 = System.getProperty("user.region");
        if (property6 != null && property7 != null) {
            sbM34407.append(" ");
            sbM34407.append(property6.replace(' ', '_'));
            sbM34407.append("_");
            sbM34407.append(property7.replace(' ', '_'));
        }
        f2011 = sbM34407.toString();
    }
}
