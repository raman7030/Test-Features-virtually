package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public interface Transform {
    Object read(String str);

    String write(Object obj);
}
