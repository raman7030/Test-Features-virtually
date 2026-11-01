package com.amazonaws.services.p061s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectExpirationHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f1645 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f1646 = Pattern.compile("rule-id=\"(.*?)\"");

    /* JADX INFO: renamed from: ܽ */
    public static final Log f1647 = LogFactory.m1468(ObjectExpirationHeaderHandler.class);

    @Override // com.amazonaws.services.p061s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo1629(Object obj, HttpResponse httpResponse) {
        m1633((ObjectExpirationResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1633(ObjectExpirationResult objectExpirationResult, HttpResponse httpResponse) {
        Date dateM1934;
        String str = (String) httpResponse.m1433().get("x-amz-expiration");
        if (str != null) {
            Matcher matcher = f1645.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f1672;
                    dateM1934 = DateUtils.m1934("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f1647.mo1464("Error parsing expiry-date from x-amz-expiration header.", e);
                    dateM1934 = null;
                }
            } else {
                dateM1934 = null;
            }
            objectExpirationResult.mo1634(dateM1934);
            Matcher matcher2 = f1646.matcher(str);
            objectExpirationResult.mo1635(matcher2.find() ? matcher2.group(1) : null);
        }
    }
}
