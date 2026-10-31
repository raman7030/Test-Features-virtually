package org.bouncycastle.jcajce.util;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class PrivateKeyAnnotator {
    public static AnnotatedPrivateKey annotate(PrivateKey privateKey, String str) {
        return new AnnotatedPrivateKey(privateKey, str);
    }

    public static AnnotatedPrivateKey annotate(PrivateKey privateKey, Map map) {
        return new AnnotatedPrivateKey(privateKey, C20195.unmodifiableMap(new HashMap(map)));
    }
}
