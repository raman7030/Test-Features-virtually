package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectRestoreHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f488 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f489 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Log f490 = LogFactory.m302(ObjectRestoreHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo463(Object obj, HttpResponse httpResponse) {
        m470((ObjectRestoreResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m470(ObjectRestoreResult objectRestoreResult, HttpResponse httpResponse) {
        Date dateM769;
        String str = (String) httpResponse.m267().get("x-amz-restore");
        if (str != null) {
            Matcher matcher = f488.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f512;
                    dateM769 = DateUtils.m769("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f490.mo298("Error parsing expiry-date from x-amz-restore header.", e);
                    dateM769 = null;
                }
            } else {
                dateM769 = null;
            }
            objectRestoreResult.mo471(dateM769);
            Matcher matcher2 = f489.matcher(str);
            Boolean boolValueOf = matcher2.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher2.group(1))) : null;
            if (boolValueOf != null) {
                objectRestoreResult.mo472(boolValueOf.booleanValue());
            }
        }
    }
}
