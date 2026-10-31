package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class HostRegexToRegionMapping {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f212;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f213;

    public HostRegexToRegionMapping(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
        }
        try {
            Pattern.compile(str);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
            }
            this.f212 = str;
            this.f213 = str2;
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m283() {
        return this.f212;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m284() {
        return this.f213;
    }
}
