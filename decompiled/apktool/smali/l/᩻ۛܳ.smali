.class public final synthetic Ll/᩻ۛܳ;
.super Ljava/lang/Object;
.source "HAIH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ᩳۜܳ;

.field public final synthetic ᩶:Ll/᩺ܺܳ;

.field public final synthetic ᩸:Ll/ۜۛܳ;

.field public final synthetic ᩹:Ll/ۢᩳ֡;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۛܳ;Ll/ۢᩳ֡;Ll/᩺ܺܳ;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۛܳ;->᩸:Ll/ۜۛܳ;

    iput-object p2, p0, Ll/᩻ۛܳ;->᩹:Ll/ۢᩳ֡;

    iput-object p3, p0, Ll/᩻ۛܳ;->᩶:Ll/᩺ܺܳ;

    iput-object p4, p0, Ll/᩻ۛܳ;->ۙ:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/᩻ۛܳ;->᩶:Ll/᩺ܺܳ;

    .line 4
    iget-object v1, p0, Ll/᩻ۛܳ;->ۙ:Ll/ᩳۜܳ;

    .line 370
    iget-object v2, p0, Ll/᩻ۛܳ;->᩹:Ll/ۢᩳ֡;

    invoke-virtual {v2}, Ll/ۢᩳ֡;->ۧ()Ll/֨ᩳ֡;

    move-result-object v2

    invoke-static {v2}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v2

    invoke-interface {v2}, Ll/ۛܽ֡;->ۡܽ()Ljava/io/InputStream;

    move-result-object v2

    .line 372
    :try_start_0
    invoke-interface {v0, v1, v2}, Ll/᩺ܺܳ;->֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    .line 374
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 376
    instance-of v2, v1, Ljava/io/IOException;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/io/IOException;

    goto :goto_0

    .line 379
    :cond_0
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v2

    .line 381
    :goto_0
    invoke-interface {v0, v1}, Ll/᩺ܺܳ;->֫(Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 382
    iget-object v0, p0, Ll/᩻ۛܳ;->᩸:Ll/ۜۛܳ;

    iget-object v0, v0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩷ۛܳ;->᩹:Z

    :cond_1
    return-void
.end method
