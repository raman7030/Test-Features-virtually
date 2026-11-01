package com.amazonaws.services.p061s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectRestoreHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f1648 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f1649 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* JADX INFO: renamed from: ܽ */
    public static final Log f1650 = LogFactory.m1468(ObjectRestoreHeaderHandler.class);

    @Override // com.amazonaws.services.p061s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo1629(Object obj, HttpResponse httpResponse) {
        m1636((ObjectRestoreResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1636(ObjectRestoreResult objectRestoreResult, HttpResponse httpResponse) {
        Date dateM1934;
        String str = (String) httpResponse.m1433().get("x-amz-restore");
        if (str != null) {
            Matcher matcher = f1648.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f1672;
                    dateM1934 = DateUtils.m1934("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f1650.mo1464("Error parsing expiry-date from x-amz-restore header.", e);
                    dateM1934 = null;
                }
            } else {
                dateM1934 = null;
            }
            objectRestoreResult.mo1637(dateM1934);
            Matcher matcher2 = f1649.matcher(str);
            Boolean boolValueOf = matcher2.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher2.group(1))) : null;
            if (boolValueOf != null) {
                objectRestoreResult.mo1638(boolValueOf.booleanValue());
            }
        }
    }
}
