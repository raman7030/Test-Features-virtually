.class public final enum Lcom/github/luben/zstd/util/Native;
.super Ljava/lang/Enum;
.source "Native.java"


# static fields
.field public static final synthetic $VALUES:[Lcom/github/luben/zstd/util/Native;

.field public static final errorMsg:Ljava/lang/String;

.field public static final libname:Ljava/lang/String; = "libzstd-jni-1.5.7-7"

.field public static final libnameShort:Ljava/lang/String; = "zstd-jni-1.5.7-7"

.field public static loaded:Ljava/util/concurrent/atomic/AtomicBoolean; = null

.field public static final nativePathOverride:Ljava/lang/String; = "ZstdNativePath"

.field public static final tempFolderOverride:Ljava/lang/String; = "ZstdTempFolder"


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/github/luben/zstd/util/Native;

    .line 12
    sput-object v1, Lcom/github/luben/zstd/util/Native;->$VALUES:[Lcom/github/luben/zstd/util/Native;

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported OS/arch, cannot find "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->resourceName()Ljava/lang/String;

    move-result-object v2

    const-string v3, " or load zstd-jni-1.5.7-7 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-7 in your system."

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    sput-object v1, Lcom/github/luben/zstd/util/Native;->errorMsg:Ljava/lang/String;

    .line 53
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v1, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static declared-synchronized assumeLoaded()V
    .locals 3

    .line 2
    const-class v0, Lcom/github/luben/zstd/util/Native;

    .line 3
    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized isLoaded()Z
    .locals 2

    .line 2
    const-class v0, Lcom/github/luben/zstd/util/Native;

    .line 3
    monitor-enter v0

    .line 66
    :try_start_0
    sget-object v1, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static libExtension()Ljava/lang/String;
    .locals 2

    .line 35
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->osName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "os_x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->osName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "darwin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->osName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "win"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "dll"

    return-object v0

    :cond_1
    const-string v0, "so"

    return-object v0

    :cond_2
    :goto_0
    const-string v0, "dylib"

    return-object v0
.end method

.method public static declared-synchronized load()V
    .locals 3

    const-class v0, Lcom/github/luben/zstd/util/Native;

    monitor-enter v0

    :try_start_0
    const-string v1, "ZstdTempFolder"

    .line 88
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 90
    invoke-static {v1}, Lcom/github/luben/zstd/util/Native;->load(Ljava/io/File;)V

    goto :goto_0

    .line 92
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/github/luben/zstd/util/Native;->load(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized load(Ljava/io/File;)V
    .locals 9

    const-string v1, "."

    const-class v0, Lcom/github/luben/zstd/util/Native;

    monitor-enter v0

    .line 97
    :try_start_0
    sget-object v2, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v2, :cond_0

    .line 98
    monitor-exit v0

    return-void

    .line 100
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->resourceName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ZstdNativePath"

    .line 102
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 105
    invoke-static {v3}, Lcom/github/luben/zstd/util/Native;->loadLibraryFile(Ljava/lang/String;)V

    .line 106
    sget-object p0, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 107
    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    const-string v3, "org.osgi.framework.BundleEvent"

    .line 112
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const-string v3, "libzstd-jni-1.5.7-7"

    .line 113
    invoke-static {v3}, Lcom/github/luben/zstd/util/Native;->loadLibrary(Ljava/lang/String;)V

    .line 114
    sget-object v3, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    monitor-exit v0

    return-void

    .line 120
    :catchall_0
    :try_start_3
    const-class v3, Lcom/github/luben/zstd/util/Native;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez v2, :cond_2

    :try_start_4
    const-string p0, "zstd-jni-1.5.7-7"

    .line 125
    invoke-static {p0}, Lcom/github/luben/zstd/util/Native;->loadLibrary(Ljava/lang/String;)V

    .line 126
    sget-object p0, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 127
    monitor-exit v0

    return-void

    :catch_0
    move-exception p0

    .line 129
    :try_start_5
    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/github/luben/zstd/util/Native;->errorMsg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 131
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :cond_2
    const/4 v3, 0x0

    :try_start_6
    const-string v5, "libzstd-jni-1.5.7-7"

    .line 137
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->libExtension()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, p0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 139
    :try_start_7
    invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V

    .line 141
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const/16 v5, 0x1000

    :try_start_8
    new-array v5, v5, [B

    .line 144
    :goto_0
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const/4 v7, -0x1

    if-ne v6, v7, :cond_5

    .line 151
    :try_start_9
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 152
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_1

    :catch_1
    move-object v3, v1

    .line 158
    :goto_1
    :try_start_a
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/github/luben/zstd/util/Native;->loadLibraryFile(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_2

    :catch_2
    move-exception v1

    :try_start_b
    const-string v5, "zstd-jni-1.5.7-7"

    .line 162
    invoke-static {v5}, Lcom/github/luben/zstd/util/Native;->loadLibrary(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 174
    :goto_2
    :try_start_c
    sget-object v1, Lcom/github/luben/zstd/util/Native;->loaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 183
    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    if-eqz v3, :cond_3

    .line 185
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 187
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 188
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 194
    :catch_3
    :cond_4
    monitor-exit v0

    return-void

    :catch_4
    move-exception v4

    .line 166
    :try_start_e
    new-instance v5, Ljava/lang/UnsatisfiedLinkError;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/github/luben/zstd/util/Native;->errorMsg:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v4}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 171
    throw v5
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :cond_5
    const/4 v7, 0x0

    .line 148
    :try_start_f
    invoke-virtual {v1, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_0

    :catch_5
    move-exception v3

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v1

    move-object v8, v3

    move-object v3, v1

    move-object v1, v8

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v1, p0

    move-object p0, v3

    goto :goto_4

    :catch_7
    move-exception p0

    move-object v1, v3

    move-object v3, p0

    move-object p0, v1

    .line 177
    :goto_3
    :try_start_10
    new-instance v4, Ljava/lang/ExceptionInInitializerError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cannot unpack libzstd-jni-1.5.7-7: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 180
    throw v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :catchall_3
    move-exception v3

    move-object v8, v3

    move-object v3, v1

    move-object v1, v8

    .line 183
    :goto_4
    :try_start_11
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    if-eqz v3, :cond_6

    .line 185
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    :cond_6
    if-eqz p0, :cond_7

    .line 187
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 188
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 193
    :catch_8
    :cond_7
    :try_start_12
    throw v1

    :catchall_4
    move-exception p0

    monitor-exit v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    throw p0
.end method

.method public static loadLibrary(Ljava/lang/String;)V
    .locals 1

    .line 70
    new-instance v0, Lcom/github/luben/zstd/util/Native$1;

    invoke-direct {v0, p0}, Lcom/github/luben/zstd/util/Native$1;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    return-void
.end method

.method public static loadLibraryFile(Ljava/lang/String;)V
    .locals 1

    .line 79
    new-instance v0, Lcom/github/luben/zstd/util/Native$2;

    invoke-direct {v0, p0}, Lcom/github/luben/zstd/util/Native$2;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    return-void
.end method

.method public static osName()Ljava/lang/String;
    .locals 3

    const-string v0, "os.name"

    .line 24
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    const/16 v2, 0x5f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "win"

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const-string v1, "mac"

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "darwin"

    :cond_1
    return-object v0
.end method

.method public static resourceName()Ljava/lang/String;
    .locals 4

    .line 45
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->osName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "os.arch"

    .line 46
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "darwin"

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "amd64"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "x86_64"

    :cond_0
    const-string v2, "/libzstd-jni-1.5.7-7."

    const-string v3, "/"

    .line 0
    invoke-static {v3, v0, v3, v1, v2}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 50
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->libExtension()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/luben/zstd/util/Native;
    .locals 1

    .line 12
    const-class v0, Lcom/github/luben/zstd/util/Native;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/github/luben/zstd/util/Native;

    return-object p0
.end method

.method public static values()[Lcom/github/luben/zstd/util/Native;
    .locals 1

    .line 12
    sget-object v0, Lcom/github/luben/zstd/util/Native;->$VALUES:[Lcom/github/luben/zstd/util/Native;

    invoke-virtual {v0}, [Lcom/github/luben/zstd/util/Native;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/luben/zstd/util/Native;

    return-object v0
.end method
