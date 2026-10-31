package org.simpleframework.xml.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.filter.Filter;
import org.simpleframework.xml.filter.PlatformFilter;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.strategy.TreeStrategy;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.NodeBuilder;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.transform.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public class Persister implements Serializer {
    public final Format format;
    public final SessionManager manager;
    public final Strategy strategy;
    public final Support support;

    public Persister() {
        this(new HashMap());
    }

    public Persister(Format format) {
        this(new TreeStrategy(), format);
    }

    public Persister(Map map) {
        this(new PlatformFilter(map));
    }

    public Persister(Map map, Format format) {
        this(new PlatformFilter(map));
    }

    public Persister(Filter filter) {
        this(new TreeStrategy(), filter);
    }

    public Persister(Filter filter, Format format) {
        this(new TreeStrategy(), filter, format);
    }

    public Persister(Matcher matcher) {
        this(new TreeStrategy(), matcher);
    }

    public Persister(Matcher matcher, Format format) {
        this(new TreeStrategy(), matcher, format);
    }

    public Persister(Strategy strategy) {
        this(strategy, new HashMap());
    }

    public Persister(Strategy strategy, Format format) {
        this(strategy, new HashMap(), format);
    }

    public Persister(Filter filter, Matcher matcher) {
        this(new TreeStrategy(), filter, matcher);
    }

    public Persister(Filter filter, Matcher matcher, Format format) {
        this(new TreeStrategy(), filter, matcher, format);
    }

    public Persister(Strategy strategy, Map map) {
        this(strategy, new PlatformFilter(map));
    }

    public Persister(Strategy strategy, Map map, Format format) {
        this(strategy, new PlatformFilter(map), format);
    }

    public Persister(Strategy strategy, Filter filter) {
        this(strategy, filter, new Format());
    }

    public Persister(Strategy strategy, Filter filter, Format format) {
        this(strategy, filter, new EmptyMatcher(), format);
    }

    public Persister(Strategy strategy, Matcher matcher) {
        this(strategy, new PlatformFilter(), matcher);
    }

    public Persister(Strategy strategy, Matcher matcher, Format format) {
        this(strategy, new PlatformFilter(), matcher, format);
    }

    public Persister(Strategy strategy, Filter filter, Matcher matcher) {
        this(strategy, filter, matcher, new Format());
    }

    public Persister(Strategy strategy, Filter filter, Matcher matcher, Format format) {
        this.support = new Support(filter, matcher, format);
        this.manager = new SessionManager();
        this.strategy = strategy;
        this.format = format;
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, String str) {
        return read(cls, str, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, File file) {
        return read(cls, file, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, InputStream inputStream) {
        return read(cls, inputStream, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, Reader reader) {
        return read(cls, reader, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, InputNode inputNode) {
        return read(cls, inputNode, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, String str, boolean z) {
        return read(cls, (Reader) new StringReader(str), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, File file, boolean z) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return read(cls, (InputStream) fileInputStream, z);
        } finally {
            fileInputStream.close();
        }
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, InputStream inputStream, boolean z) {
        return read(cls, NodeBuilder.read(inputStream), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, Reader reader, boolean z) {
        return read(cls, NodeBuilder.read(reader), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Class cls, InputNode inputNode, boolean z) throws PersistenceException {
        try {
            return read(cls, inputNode, this.manager.open(z));
        } finally {
            this.manager.close();
        }
    }

    private Object read(Class cls, InputNode inputNode, Session session) {
        return read(cls, inputNode, (Context) new Source(this.strategy, this.support, session));
    }

    private Object read(Class cls, InputNode inputNode, Context context) {
        return new Traverser(context).read(inputNode, cls);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, String str) {
        return read(obj, str, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, File file) {
        return read(obj, file, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, InputStream inputStream) {
        return read(obj, inputStream, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, Reader reader) {
        return read(obj, reader, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, InputNode inputNode) {
        return read(obj, inputNode, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, String str, boolean z) {
        return read(obj, new StringReader(str), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, File file, boolean z) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return read(obj, fileInputStream, z);
        } finally {
            fileInputStream.close();
        }
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, InputStream inputStream, boolean z) {
        return read(obj, NodeBuilder.read(inputStream), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, Reader reader, boolean z) {
        return read(obj, NodeBuilder.read(reader), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public Object read(Object obj, InputNode inputNode, boolean z) throws PersistenceException {
        try {
            return read(obj, inputNode, this.manager.open(z));
        } finally {
            this.manager.close();
        }
    }

    private Object read(Object obj, InputNode inputNode, Session session) {
        return read(obj, inputNode, new Source(this.strategy, this.support, session));
    }

    private Object read(Object obj, InputNode inputNode, Context context) {
        return new Traverser(context).read(inputNode, obj);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, String str) {
        return validate(cls, str, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, File file) {
        return validate(cls, file, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, InputStream inputStream) {
        return validate(cls, inputStream, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, Reader reader) {
        return validate(cls, reader, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, InputNode inputNode) {
        return validate(cls, inputNode, true);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, String str, boolean z) {
        return validate(cls, new StringReader(str), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, File file, boolean z) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return validate(cls, fileInputStream, z);
        } finally {
            fileInputStream.close();
        }
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, InputStream inputStream, boolean z) {
        return validate(cls, NodeBuilder.read(inputStream), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, Reader reader, boolean z) {
        return validate(cls, NodeBuilder.read(reader), z);
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(Class cls, InputNode inputNode, boolean z) throws PersistenceException {
        try {
            return validate(cls, inputNode, this.manager.open(z));
        } finally {
            this.manager.close();
        }
    }

    private boolean validate(Class cls, InputNode inputNode, Session session) {
        return validate(cls, inputNode, new Source(this.strategy, this.support, session));
    }

    private boolean validate(Class cls, InputNode inputNode, Context context) {
        return new Traverser(context).validate(inputNode, cls);
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(Object obj, OutputNode outputNode) throws PersistenceException {
        try {
            write(obj, outputNode, this.manager.open());
        } finally {
            this.manager.close();
        }
    }

    private void write(Object obj, OutputNode outputNode, Session session) {
        write(obj, outputNode, new Source(this.strategy, this.support, session));
    }

    private void write(Object obj, OutputNode outputNode, Context context) {
        new Traverser(context).write(outputNode, obj);
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(Object obj, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            write(obj, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(Object obj, OutputStream outputStream) throws PersistenceException {
        write(obj, outputStream, "utf-8");
    }

    public void write(Object obj, OutputStream outputStream, String str) throws PersistenceException {
        write(obj, new OutputStreamWriter(outputStream, str));
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(Object obj, Writer writer) throws PersistenceException {
        write(obj, NodeBuilder.write(writer, this.format));
    }
}
