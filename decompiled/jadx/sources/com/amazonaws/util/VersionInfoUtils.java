package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C13325;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f849 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f850 = LogFactory.m302(VersionInfoUtils.class);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile String f851;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m798() {
        if (f851 == null) {
            synchronized (VersionInfoUtils.class) {
                if (f851 == null) {
                    m799();
                }
            }
        }
        return f851;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m799() {
        StringBuilder sbM32307 = C13325.m32307(128, "aws-sdk-");
        sbM32307.append(StringUtils.m789("android"));
        sbM32307.append("/2.81.1 ");
        String property = System.getProperty("os.name");
        if (property != null) {
            property = property.replace(' ', '_');
        }
        sbM32307.append(property);
        sbM32307.append("/");
        String property2 = System.getProperty("os.version");
        if (property2 != null) {
            property2 = property2.replace(' ', '_');
        }
        sbM32307.append(property2);
        sbM32307.append(" ");
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            property3 = property3.replace(' ', '_');
        }
        sbM32307.append(property3);
        sbM32307.append("/");
        String property4 = System.getProperty("java.vm.version");
        if (property4 != null) {
            property4 = property4.replace(' ', '_');
        }
        sbM32307.append(property4);
        sbM32307.append("/");
        String property5 = System.getProperty("java.version");
        if (property5 != null) {
            property5 = property5.replace(' ', '_');
        }
        sbM32307.append(property5);
        String property6 = System.getProperty("user.language");
        String property7 = System.getProperty("user.region");
        if (property6 != null && property7 != null) {
            sbM32307.append(" ");
            sbM32307.append(property6.replace(' ', '_'));
            sbM32307.append("_");
            sbM32307.append(property7.replace(' ', '_'));
        }
        f851 = sbM32307.toString();
    }
}
