package org.simpleframework.xml.core;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class ScannerFactory {
    public final Cache cache = new ConcurrentCache();
    public final Support support;

    public ScannerFactory(Support support) {
        this.support = support;
    }

    public Scanner getInstance(Class cls) {
        Scanner objectScanner;
        Scanner scanner = (Scanner) this.cache.fetch(cls);
        if (scanner != null) {
            return scanner;
        }
        Detail detail = this.support.getDetail(cls);
        if (this.support.isPrimitive(cls)) {
            objectScanner = new PrimitiveScanner(detail);
        } else {
            objectScanner = new ObjectScanner(detail, this.support);
            if (objectScanner.isPrimitive() && !this.support.isContainer(cls)) {
                objectScanner = new DefaultScanner(detail, this.support);
            }
        }
        this.cache.cache(cls, objectScanner);
        return objectScanner;
    }
}
