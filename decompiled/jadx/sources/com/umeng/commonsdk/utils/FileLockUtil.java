package com.umeng.commonsdk.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import l.C12084;

/* JADX INFO: loaded from: classes.dex */
public class FileLockUtil {
    public final Object lockObject = new Object();

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, Object obj) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        fileLockCallback.onFileLock(file.getName(), obj);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, int i) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        fileLockCallback.onFileLock(file, i);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        fileLockCallback.onFileLock(file.getName());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    public void doFileOperateion(String str, FileLockCallback fileLockCallback) {
        File file = new File(str);
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(str);
                if (fileLock != null) {
                    try {
                        fileLockCallback.onFileLock(file.getName());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    public static FileLock getFileLock(String str) {
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        try {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(str, "rw").getChannel());
            try {
                return fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
            } catch (FileNotFoundException | IOException unused) {
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            }
        } catch (FileNotFoundException | IOException unused3) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        }
    }
}
