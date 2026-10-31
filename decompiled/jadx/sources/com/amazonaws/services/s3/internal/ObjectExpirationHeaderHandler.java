package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectExpirationHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f485 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f486 = Pattern.compile("rule-id=\"(.*?)\"");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Log f487 = LogFactory.m302(ObjectExpirationHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo463(Object obj, HttpResponse httpResponse) {
        m467((ObjectExpirationResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m467(ObjectExpirationResult objectExpirationResult, HttpResponse httpResponse) {
        Date dateM769;
        String str = (String) httpResponse.m267().get("x-amz-expiration");
        if (str != null) {
            Matcher matcher = f485.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f512;
                    dateM769 = DateUtils.m769("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f487.mo298("Error parsing expiry-date from x-amz-expiration header.", e);
                    dateM769 = null;
                }
            } else {
                dateM769 = null;
            }
            objectExpirationResult.mo468(dateM769);
            Matcher matcher2 = f486.matcher(str);
            objectExpirationResult.mo469(matcher2.find() ? matcher2.group(1) : null);
        }
    }
}
