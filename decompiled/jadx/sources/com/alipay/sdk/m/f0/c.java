package com.alipay.sdk.m.f0;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c implements FileFilter {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
