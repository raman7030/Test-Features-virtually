.class public Ll/ۨ᩵ܿ;
.super Landroid/content/ContentProvider;
.source "X13G"


# static fields
.field public static ᩶:Ljava/util/Set;

.field public static final ᩸:Ljava/lang/String;

.field public static final ᩹:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 43
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    sput-object v0, Ll/ۨ᩵ܿ;->᩶:Ljava/util/Set;

    .line 44
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".fp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    const-string v0, "_display_name"

    const-string v1, "_size"

    .line 46
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۨ᩵ܿ;->᩹:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 64
    sget-object v0, Ll/ۨ᩵ܿ;->᩶:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 65
    invoke-static {v0}, Ll/ۨ᩵ܿ;->֫(Ljava/util/ArrayList;)V

    .line 67
    :cond_0
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "content"

    .line 68
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    .line 69
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 70
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    .line 71
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Landroid/net/Uri;
    .locals 7

    .line 88
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_prevents_deletion"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/16 v1, 0x20

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v1, v3

    int-to-long v3, v1

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "/NOT_DELETE/"

    aput-object v4, v3, v2

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const/4 v0, 0x3

    aput-object p0, v3, v0

    const-string p0, "%s%08X/%s/%s"

    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    .line 83
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;
    .locals 6

    .line 113
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/NOT_DELETE/"

    .line 114
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/16 v0, 0x15

    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    .line 117
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string v2, ""

    .line 125
    :goto_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/String;

    const/16 v4, 0xb

    invoke-static {p0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    new-array v0, v1, [Ljava/lang/String;

    .line 130
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 1

    if-eqz p0, :cond_1

    .line 54
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 56
    :goto_1
    sput-object v0, Ll/ۨ᩵ܿ;->᩶:Ljava/util/Set;

    return-void
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Landroid/os/ParcelFileDescriptor;
    .locals 4

    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const-string v0, "storage"

    .line 204
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 212
    instance-of v1, v0, Landroid/os/storage/StorageManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/os/storage/StorageManager;

    .line 213
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    const-string v3, "r"

    .line 214
    invoke-virtual {p0, v3}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p0

    .line 216
    :try_start_0
    new-instance v3, Ll/ۛ᩵ܿ;

    invoke-direct {v3, v1, v2, p0}, Ll/ۛ᩵ܿ;-><init>(JLl/᩻ۖܽ;)V

    .line 237
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    const/high16 v2, 0x10000000

    .line 216
    invoke-virtual {v0, v2, v3, v1}, Landroid/os/storage/StorageManager;->openProxyFileDescriptor(ILandroid/os/ProxyFileDescriptorCallback;Landroid/os/Handler;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 239
    :catch_0
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 0

    .line 98
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 101
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    if-nez p1, :cond_2

    .line 104
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-eqz p1, :cond_1

    .line 107
    iget-object p1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    sget-object p2, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 108
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 105
    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string p2, "Provider must grant uri permissions"

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/SecurityException;

    const-string p2, "Provider must not be exported"

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 203
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "/NOT_DELETE/"

    .line 204
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    .line 206
    invoke-static {p1, p2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    move-result p1

    return p1
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 175
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    invoke-static {p1}, Ll/ۨ᩵ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 178
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 180
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 181
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const-string p1, "application/octet-stream"

    return-object p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .line 193
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "No external inserts"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreate()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 4

    .line 247
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 249
    :try_start_0
    invoke-static {p1}, Ll/ۨ᩵ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 260
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    .line 265
    :cond_0
    invoke-static {p1}, Ll/ۨ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    if-eqz p2, :cond_1

    return-object p2

    .line 270
    :cond_1
    invoke-static {}, Landroid/os/ParcelFileDescriptor;->createPipe()[Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    .line 271
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    .line 272
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    const/4 v1, 0x1

    aget-object v1, p2, v1

    invoke-direct {v0, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 273
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ۤ֨ۡ;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p1, v0}, Ll/ۤ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 280
    aget-object p1, p2, p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 284
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 286
    throw p2

    :catch_1
    move-exception p1

    .line 282
    throw p1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10

    .line 135
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    invoke-static {p1}, Ll/ۨ᩵ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p3

    if-nez p2, :cond_0

    .line 139
    sget-object p2, Ll/ۨ᩵ܿ;->᩹:[Ljava/lang/String;

    .line 142
    :cond_0
    array-length p4, p2

    new-array p4, p4, [Ljava/lang/String;

    .line 143
    array-length p5, p2

    new-array p5, p5, [Ljava/lang/Object;

    .line 145
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v2, v0, :cond_5

    aget-object v5, p2, v2

    .line 146
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const-string v7, "_size"

    const-string v8, "_data"

    const-string v9, "_display_name"

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    goto :goto_2

    :sswitch_1
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :sswitch_2
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    goto :goto_2

    :goto_1
    const/4 v4, -0x1

    :cond_3
    :goto_2
    packed-switch v4, :pswitch_data_0

    goto :goto_4

    .line 152
    :pswitch_0
    aput-object v7, p4, v3

    add-int/lit8 v4, v3, 0x1

    .line 153
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, p5, v3

    goto :goto_3

    .line 156
    :pswitch_1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "/NOT_DELETE/"

    .line 157
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Ll/ۨ᩵ܿ;->᩶:Ljava/util/Set;

    invoke-interface {v4, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 158
    aput-object v8, p4, v3

    add-int/lit8 v4, v3, 0x1

    .line 159
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    aput-object v5, p5, v3

    goto :goto_3

    .line 148
    :pswitch_2
    aput-object v9, p4, v3

    add-int/lit8 v4, v3, 0x1

    .line 149
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, p5, v3

    :goto_3
    move v3, v4

    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 291
    :cond_5
    new-array p1, v3, [Ljava/lang/String;

    .line 292
    invoke-static {p4, v1, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 297
    new-array p2, v3, [Ljava/lang/Object;

    .line 298
    invoke-static {p5, v1, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    new-instance p3, Landroid/database/MatrixCursor;

    invoke-direct {p3, p1, v4}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 169
    invoke-virtual {p3, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    return-object p3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1d1c5239 -> :sswitch_2
        0x569a889 -> :sswitch_1
        0x57098e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 198
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "No external updates"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
