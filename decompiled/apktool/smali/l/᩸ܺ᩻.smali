.class public final Ll/᩸ܺ᩻;
.super Ljava/io/BufferedOutputStream;
.source "5AG2"


# instance fields
.field public final synthetic ᩶:Ljava/io/OutputStream;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/۬ܺ᩻;


# direct methods
.method public constructor <init>(Ll/ۙܺ᩻;Ljava/io/OutputStream;Ll/۬ܺ᩻;Ljava/io/OutputStream;)V
    .locals 0

    .line 341
    iput-object p3, p0, Ll/᩸ܺ᩻;->᩹:Ll/۬ܺ᩻;

    iput-object p4, p0, Ll/᩸ܺ᩻;->᩶:Ljava/io/OutputStream;

    invoke-direct {p0, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 346
    iget-object v0, p0, Ll/᩸ܺ᩻;->᩶:Ljava/io/OutputStream;

    iget-object v1, p0, Ll/᩸ܺ᩻;->᩹:Ll/۬ܺ᩻;

    iget-boolean v2, p0, Ll/᩸ܺ᩻;->᩸:Z

    if-eqz v2, :cond_0

    goto :goto_4

    :cond_0
    const/4 v2, 0x1

    .line 352
    :try_start_0
    invoke-super {p0}, Ljava/io/BufferedOutputStream;->close()V

    .line 353
    invoke-interface {v1}, Ll/۬ܺ᩻;->ᩳ()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 361
    instance-of v3, v0, Ll/ۧܺ᩻;

    if-eqz v3, :cond_1

    check-cast v0, Ll/ۧܺ᩻;

    .line 364
    :try_start_1
    invoke-virtual {v0}, Ll/ۧܺ᩻;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_5

    .line 375
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 656
    invoke-static {v1}, Ll/۬ۡ᩻;->ۧ(Ll/۬ܺ᩻;)V

    goto :goto_3

    .line 354
    :cond_2
    :try_start_2
    invoke-interface {v1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    throw v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v3

    .line 361
    instance-of v4, v0, Ll/ۧܺ᩻;

    if-eqz v4, :cond_3

    check-cast v0, Ll/ۧܺ᩻;

    .line 364
    :try_start_3
    invoke-virtual {v0}, Ll/ۧܺ᩻;->֫()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 377
    :catch_1
    :cond_3
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 660
    invoke-static {v1}, Ll/۬ۡ᩻;->֫(Ll/۬ܺ᩻;)V

    .line 379
    iput-boolean v2, p0, Ll/᩸ܺ᩻;->᩸:Z

    .line 380
    throw v3

    :catch_2
    move-exception v3

    .line 361
    instance-of v4, v0, Ll/ۧܺ᩻;

    if-eqz v4, :cond_4

    check-cast v0, Ll/ۧܺ᩻;

    .line 364
    :try_start_4
    invoke-virtual {v0}, Ll/ۧܺ᩻;->֫()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception v0

    .line 370
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    move-object v4, v3

    .line 377
    :cond_5
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 660
    invoke-static {v1}, Ll/۬ۡ᩻;->֫(Ll/۬ܺ᩻;)V

    .line 379
    :goto_3
    iput-boolean v2, p0, Ll/᩸ܺ᩻;->᩸:Z

    if-nez v4, :cond_6

    :goto_4
    return-void

    .line 382
    :cond_6
    throw v4
.end method

.method public final finalize()V
    .locals 0

    .line 388
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 389
    invoke-virtual {p0}, Ll/᩸ܺ᩻;->close()V

    return-void
.end method
