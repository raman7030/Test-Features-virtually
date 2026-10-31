package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public interface EventNode extends Iterable {
    int getLine();

    String getName();

    String getPrefix();

    String getReference();

    Object getSource();

    String getValue();

    boolean isEnd();

    boolean isStart();

    boolean isText();
}
