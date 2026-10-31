package org.simpleframework.xml.convert;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class ScannerBuilder extends ConcurrentCache {
    public Scanner build(Class cls) {
        Scanner scanner = (Scanner) get(cls);
        if (scanner != null) {
            return scanner;
        }
        Entry entry = new Entry(cls);
        put(cls, entry);
        return entry;
    }

    public class Entry extends ConcurrentCache implements Scanner {
        public final Class root;

        public Entry(Class cls) {
            this.root = cls;
        }

        @Override // org.simpleframework.xml.convert.Scanner
        public Annotation scan(Class cls) {
            if (!contains(cls)) {
                Annotation annotationFind = find(cls);
                if (cls != null && annotationFind != null) {
                    put(cls, annotationFind);
                }
            }
            return (Annotation) get(cls);
        }

        private Annotation find(Class cls) {
            for (Class superclass = this.root; superclass != null; superclass = superclass.getSuperclass()) {
                Annotation annotation = superclass.getAnnotation(cls);
                if (annotation != null) {
                    return annotation;
                }
            }
            return null;
        }
    }
}
