package net.p069sf.sevenzipjbinding;

/* JADX INFO: loaded from: classes.dex */
public interface ISeekableStream {
    public static final int SEEK_CUR = 1;
    public static final int SEEK_END = 2;
    public static final int SEEK_SET = 0;

    long seek(long j, int i);
}
