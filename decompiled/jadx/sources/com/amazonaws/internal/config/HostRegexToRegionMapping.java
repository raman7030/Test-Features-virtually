package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class HostRegexToRegionMapping {

    /* JADX INFO: renamed from: ֫ */
    public final String f1372;

    /* JADX INFO: renamed from: ۧ */
    public final String f1373;

    public HostRegexToRegionMapping(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
        }
        try {
            Pattern.compile(str);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
            }
            this.f1372 = str;
            this.f1373 = str2;
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1449() {
        return this.f1372;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m1450() {
        return this.f1373;
    }
}
