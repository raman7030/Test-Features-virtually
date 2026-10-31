package org.simpleframework.xml;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes2.dex */
public interface Serializer {
    Object read(Class cls, File file);

    Object read(Class cls, File file, boolean z);

    Object read(Class cls, InputStream inputStream);

    Object read(Class cls, InputStream inputStream, boolean z);

    Object read(Class cls, Reader reader);

    Object read(Class cls, Reader reader, boolean z);

    Object read(Class cls, String str);

    Object read(Class cls, String str, boolean z);

    Object read(Class cls, InputNode inputNode);

    Object read(Class cls, InputNode inputNode, boolean z);

    Object read(Object obj, File file);

    Object read(Object obj, File file, boolean z);

    Object read(Object obj, InputStream inputStream);

    Object read(Object obj, InputStream inputStream, boolean z);

    Object read(Object obj, Reader reader);

    Object read(Object obj, Reader reader, boolean z);

    Object read(Object obj, String str);

    Object read(Object obj, String str, boolean z);

    Object read(Object obj, InputNode inputNode);

    Object read(Object obj, InputNode inputNode, boolean z);

    boolean validate(Class cls, File file);

    boolean validate(Class cls, File file, boolean z);

    boolean validate(Class cls, InputStream inputStream);

    boolean validate(Class cls, InputStream inputStream, boolean z);

    boolean validate(Class cls, Reader reader);

    boolean validate(Class cls, Reader reader, boolean z);

    boolean validate(Class cls, String str);

    boolean validate(Class cls, String str, boolean z);

    boolean validate(Class cls, InputNode inputNode);

    boolean validate(Class cls, InputNode inputNode, boolean z);

    void write(Object obj, File file);

    void write(Object obj, OutputStream outputStream);

    void write(Object obj, Writer writer);

    void write(Object obj, OutputNode outputNode);
}
