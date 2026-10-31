.class public Ll/ܳ᩸ܿ;
.super Ll/ܶ᩵ܿ;
.source "715Z"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۬:Ll/۫ܶܿ;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ll/ܶ᩵ܿ;-><init>()V

    .line 37
    new-instance v0, Ll/۫ܶܿ;

    invoke-direct {v0, p1}, Ll/۫ܶܿ;-><init>(Landroid/net/Uri;)V

    iput-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܳ᩸ܿ;Z)Ljava/io/OutputStream;
    .locals 2

    .line 223
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v1}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v1

    if-eqz p1, :cond_0

    const-string p1, "wa"

    goto :goto_0

    :cond_0
    const-string p1, "wt"

    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 225
    :goto_1
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ֫(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;
    .locals 0

    .line 188
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->ۧ(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 3

    .line 293
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 295
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-interface {p0, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    .line 311
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 312
    new-instance p0, Ljava/io/IOException;

    const-string v1, "Timeout"

    invoke-direct {p0, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :catch_1
    move-exception p0

    .line 309
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    .line 297
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 298
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 301
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_1

    .line 304
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Error;

    .line 305
    throw v0

    .line 307
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 301
    :cond_1
    check-cast v0, Ljava/lang/RuntimeException;

    .line 302
    throw v0

    .line 298
    :cond_2
    check-cast v0, Ljava/io/IOException;

    .line 299
    throw v0
.end method

.method public static ֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    .line 321
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    int-to-long v0, p2

    .line 323
    :try_start_0
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p2, 0x1

    .line 336
    invoke-interface {p0, p2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-object p1

    :catch_1
    move-exception p0

    .line 327
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 328
    instance-of p2, p0, Ljava/lang/RuntimeException;

    if-nez p2, :cond_1

    .line 331
    instance-of p2, p0, Ljava/lang/Error;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Error;

    .line 332
    throw p0

    .line 328
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 329
    throw p0

    :catch_2
    :goto_0
    return-object p1
.end method

.method public static synthetic ֫(Ll/ܳ᩸ܿ;Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 0

    .line 237
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0, p1}, Ll/֡ۖܽ;->֫(Landroid/net/Uri;Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ۖ(Ljava/lang/String;)I
    .locals 2

    const-string v0, "r"

    .line 264
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p0, 0x10000000

    return p0

    :cond_0
    const-string v0, "w"

    .line 266
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "wt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "wa"

    .line 270
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 p0, 0x2a000000

    return p0

    :cond_2
    const-string v0, "rw"

    .line 274
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 p0, 0x38000000

    return p0

    :cond_3
    const-string v0, "rwt"

    .line 277
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 p0, 0x3c000000    # 0.0078125f

    return p0

    .line 282
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid mode: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 282
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    const/high16 p0, 0x2c000000

    return p0
.end method

.method public static synthetic ۜ(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;
    .locals 0

    .line 143
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->᩻(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܳ᩸ܿ;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 2

    .line 245
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v1}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 247
    :goto_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ۧ(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;
    .locals 0

    .line 135
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->ᩳ(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܳ(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;
    .locals 0

    .line 151
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->ܳ(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܳ᩸ܿ;)Ljava/io/InputStream;
    .locals 2

    .line 212
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v1}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 214
    :goto_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic ܿ(Ll/ܳ᩸ܿ;)Ljava/lang/Long;
    .locals 2

    .line 164
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->᩷(Landroid/net/Uri;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ܳ᩸ܿ;)Ljava/lang/Long;
    .locals 2

    .line 172
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->ۜ(Landroid/net/Uri;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩻(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;
    .locals 0

    .line 180
    iget-object p0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {p0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܶܿ;->֫(Landroid/net/Uri;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 3

    .line 83
    iget-object v0, p0, Ll/ܳ᩸ܿ;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 84
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ܿ;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 86
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 90
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ܿ;->ۗ:Ljava/lang/String;

    goto :goto_0

    .line 88
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t get name from uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v2}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public getParent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֡֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ֨()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ֨֫()Z
    .locals 3

    .line 150
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    new-instance v0, Ll/ᩳ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ᩳ᩸ܿ;-><init>(Ll/ܳ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 153
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܳ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ֫(Landroid/net/Uri;Z)V
    .locals 0

    .line 41
    new-instance p2, Ll/۫ܶܿ;

    invoke-direct {p2, p1}, Ll/۫ܶܿ;-><init>(Landroid/net/Uri;)V

    iput-object p2, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    .line 42
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->᩶ۧ()V

    return-void
.end method

.method public ۗ()Z
    .locals 2

    const/4 v0, 0x0

    .line 53
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ܳ᩸ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method

.method public ۙ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۛ֫()J
    .locals 3

    .line 171
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    new-instance v0, Ll/ܽ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ܽ᩸ܿ;-><init>(Ll/ܳ᩸ܿ;)V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 172
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 174
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ۜ(Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 2

    .line 243
    new-instance v0, Ll/ܿ᩸ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ܿ᩸ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    return-object p1
.end method

.method public final ۜۧ()Ljava/nio/channels/FileChannel;
    .locals 2

    .line 232
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۠()Z
    .locals 3

    .line 187
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    new-instance v0, Ll/ۛܶܿ;

    invoke-direct {v0, p0}, Ll/ۛܶܿ;-><init>(Ll/ܳ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 190
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ۧ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۠֫()Z
    .locals 3

    .line 142
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    new-instance v0, Ll/ۤܶܿ;

    invoke-direct {v0, p0}, Ll/ۤܶܿ;-><init>(Ll/ܳ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 145
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->᩻(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۡ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۜܶܿ;

    return v0
.end method

.method public final ۢۧ()Ljava/io/InputStream;
    .locals 1

    .line 210
    new-instance v0, Ll/֫᩸ܿ;

    invoke-direct {v0, p0}, Ll/֫᩸ܿ;-><init>(Ll/ܳ᩸ܿ;)V

    invoke-static {v0}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public ۤ()Z
    .locals 3

    .line 134
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    new-instance v0, Ll/᩺ܶܿ;

    invoke-direct {v0, p0}, Ll/᩺ܶܿ;-><init>(Ll/ܳ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 137
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ᩳ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۧ(Z)Ljava/util/List;
    .locals 0

    .line 200
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۨ()V
    .locals 0

    return-void
.end method

.method public final ۫֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۬()Z
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public final ܰ֫()Ljava/util/List;
    .locals 3

    const/4 v0, 0x1

    .line 205
    invoke-virtual {p0, v0}, Ll/ܳ᩸ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۟᩵ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۟᩵ܿ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public ܶ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܺ֫()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܽ(Z)Ljava/io/OutputStream;
    .locals 1

    .line 221
    new-instance v0, Ll/ۨܶܿ;

    invoke-direct {v0, p0, p1}, Ll/ۨܶܿ;-><init>(Ll/ܳ᩸ܿ;Z)V

    invoke-static {v0}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/OutputStream;

    return-object p1
.end method

.method public final ܽ֫()Landroid/net/Uri;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 3

    .line 179
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    new-instance v0, Ll/ܰܶܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ܰܶܿ;-><init>(ILjava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 180
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 182
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->֫(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public final ᩵֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩶ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Ll/ܳ᩸ܿ;->ۗ:Ljava/lang/String;

    return-void
.end method

.method public ᩷(Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 1

    .line 237
    new-instance v0, Ll/ۧ᩸ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧ᩸ܿ;-><init>(Ll/ܳ᩸ܿ;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۖܽ;

    return-object p1
.end method

.method public ᩺֫()J
    .locals 3

    .line 163
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    new-instance v0, Ll/۟ܶܿ;

    invoke-direct {v0, p0}, Ll/۟ܶܿ;-><init>(Ll/ܳ᩸ܿ;)V

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 164
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 166
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ܿ;->۬:Ll/۫ܶܿ;

    invoke-virtual {v0}, Ll/۫ܶܿ;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->᩷(Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method
