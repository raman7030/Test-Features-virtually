package com.alipay.sdk.p010m.p022f0;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alipay.sdk.m.f0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0115c implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0114b f462a;

    public C0115c(C0114b c0114b) {
        this.f462a = c0114b;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
