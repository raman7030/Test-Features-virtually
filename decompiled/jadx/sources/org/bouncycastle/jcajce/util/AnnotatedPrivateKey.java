package org.bouncycastle.jcajce.util;

import java.security.PrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class AnnotatedPrivateKey implements PrivateKey {
    public static final String LABEL = "label";
    public final Map annotations;
    public final PrivateKey key;

    public AnnotatedPrivateKey(PrivateKey privateKey, String str) {
        this.key = privateKey;
        this.annotations = Collections.singletonMap(LABEL, str);
    }

    public AnnotatedPrivateKey(PrivateKey privateKey, Map map) {
        this.key = privateKey;
        this.annotations = map;
    }

    public AnnotatedPrivateKey addAnnotation(String str, Object obj) {
        HashMap map = new HashMap(this.annotations);
        map.put(str, obj);
        return new AnnotatedPrivateKey(this.key, C21562.unmodifiableMap(map));
    }

    public boolean equals(Object obj) {
        PrivateKey privateKey;
        if (obj instanceof AnnotatedPrivateKey) {
            privateKey = this.key;
            obj = ((AnnotatedPrivateKey) obj).key;
        } else {
            privateKey = this.key;
        }
        return privateKey.equals(obj);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.key.getAlgorithm();
    }

    public Object getAnnotation(String str) {
        return this.annotations.get(str);
    }

    public Map getAnnotations() {
        return this.annotations;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.key.getEncoded();
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.key.getFormat();
    }

    public PrivateKey getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public AnnotatedPrivateKey removeAnnotation(String str) {
        HashMap map = new HashMap(this.annotations);
        map.remove(str);
        return new AnnotatedPrivateKey(this.key, C21562.unmodifiableMap(map));
    }

    public String toString() {
        return (this.annotations.containsKey(LABEL) ? this.annotations.get(LABEL) : this.key).toString();
    }
}
