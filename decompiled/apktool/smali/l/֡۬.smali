.class public final Ll/֡۬;
.super Ljava/lang/Object;
.source "H4PP"


# static fields
.field public static ۠֡᩶:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֡ۖ֨(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/֨۫֡;

    check-cast p1, Ll/۟۬֡;

    invoke-virtual {p0, p1}, Ll/֨۫֡;->ۧ(Ll/۟۬֡;)V

    return-void
.end method

.method public static ֨ۙ֨(Ljava/lang/Object;I)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ֨۠ܺ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 72
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ".font"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-ge v2, v3, :cond_2

    .line 74
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 76
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_1

    return-object v3

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 106
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "r"

    .line 108
    invoke-virtual {p0, p1, v1, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    if-nez p0, :cond_0

    if-eqz p0, :cond_1

    .line 118
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 113
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 114
    :try_start_2
    invoke-static {p1}, Ll/᩶ᩴᩳ;->֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v6

    .line 116
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 118
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v1

    :catchall_0
    move-exception v1

    .line 113
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 108
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p0

    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 190
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 175
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 176
    :try_start_1
    invoke-static {p0, p1}, Ll/֡۬;->֫(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    invoke-static {p1}, Ll/֡۬;->֫(Ljava/io/Closeable;)V

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/֡۬;->֫(Ljava/io/Closeable;)V

    .line 179
    throw p0
.end method

.method public static ֫(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 150
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 152
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p0, 0x400

    :try_start_1
    new-array p0, p0, [B

    .line 155
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    .line 156
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 163
    :cond_0
    invoke-static {v3}, Ll/֡۬;->֫(Ljava/io/Closeable;)V

    .line 164
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    goto :goto_3

    :catch_0
    move-exception p0

    move-object v2, v3

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    .line 160
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 163
    invoke-static {v2}, Ll/֡۬;->֫(Ljava/io/Closeable;)V

    .line 164
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return v1

    :goto_2
    move-object v3, v2

    .line 163
    :goto_3
    invoke-static {v3}, Ll/֡۬;->֫(Ljava/io/Closeable;)V

    .line 164
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 165
    throw p0
.end method

.method public static ֫᩺۫(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static ۛ֡᩹(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۬᩵;

    invoke-virtual {p0, p1, p2}, Ll/۬᩵;->ܽ(ILjava/lang/Object;)V

    return-void
.end method

.method public static ۠ۗۧ(Ljava/lang/Object;Z)Landroid/view/MenuItem;
    .locals 0

    check-cast p0, Landroid/view/MenuItem;

    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object p0

    return-object p0
.end method

.method public static ۡۧܳ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p0

    return p0
.end method

.method public static ۢܳ᩸([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۧ֫֫()V
    .locals 1

    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public static ۬ܶۧ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/ۡܰۡ;

    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->ۧ(I)V

    return-void
.end method

.method public static ܶ۟᩵(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܿᩳۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-static {p0}, Ll/ܺ۟᩻;->᩵(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴۗۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۡܰۡ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ᩶ᩳᩳ(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻ܶܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
