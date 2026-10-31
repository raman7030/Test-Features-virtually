package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class SupportedReport {
    public Report report;

    public Report getReport() {
        return this.report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
