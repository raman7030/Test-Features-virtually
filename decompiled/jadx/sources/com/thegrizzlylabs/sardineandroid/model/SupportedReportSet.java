package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class SupportedReportSet {
    public List supportedReport;

    public List getSupportedReport() {
        if (this.supportedReport == null) {
            this.supportedReport = new ArrayList();
        }
        return this.supportedReport;
    }
}
