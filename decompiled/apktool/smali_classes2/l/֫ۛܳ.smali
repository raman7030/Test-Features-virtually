.class public final synthetic Ll/֫ۛܳ;
.super Ljava/lang/Object;
.source "HAIH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ۤܽ֡;

.field public final synthetic ۙ:Ll/ᩳۛܳ;

.field public final synthetic ᩶:Ll/ۘܳᩳ;

.field public final synthetic ᩸:Ll/ۖۛܳ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۛܳ;Ll/ۗܺ᩷;Ll/ۘܳᩳ;Ll/ᩳۛܳ;Ll/ۤܽ֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۛܳ;->᩸:Ll/ۖۛܳ;

    iput-object p2, p0, Ll/֫ۛܳ;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/֫ۛܳ;->᩶:Ll/ۘܳᩳ;

    iput-object p4, p0, Ll/֫ۛܳ;->ۙ:Ll/ᩳۛܳ;

    iput-object p5, p0, Ll/֫ۛܳ;->ۗ:Ll/ۤܽ֡;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/֫ۛܳ;->᩸:Ll/ۖۛܳ;

    .line 4
    iget-object v1, p0, Ll/֫ۛܳ;->᩹:Ll/ۗܺ᩷;

    .line 6
    iget-object v2, p0, Ll/֫ۛܳ;->᩶:Ll/ۘܳᩳ;

    .line 8
    iget-object v3, p0, Ll/֫ۛܳ;->ۙ:Ll/ᩳۛܳ;

    .line 10
    iget-object v4, p0, Ll/֫ۛܳ;->ۗ:Ll/ۤܽ֡;

    const/4 v5, 0x1

    .line 255
    :try_start_0
    invoke-virtual {v2}, Ll/ۘܳᩳ;->ܽ()I

    move-result v2

    new-instance v6, Ll/ܳۛܳ;

    invoke-direct {v6, v0, v3, v4}, Ll/ܳۛܳ;-><init>(Ll/ۖۛܳ;Ll/ᩳۛܳ;Ll/ۤܽ֡;)V

    .line 40
    filled-new-array {v2}, [I

    move-result-object v0

    invoke-static {v1, v0, v6}, Ll/ᩳ᩻ᩳ;->֫(Ll/ۗܺ᩷;[ILl/ܰܳᩳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 298
    iput-boolean v5, v3, Ll/ᩳۛܳ;->ܽ:Z

    return-void

    :catchall_0
    move-exception v0

    .line 295
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object v1, v3, Ll/ᩳۛܳ;->ۧ:Ljava/io/IOException;

    goto :goto_0

    :catch_0
    move-exception v0

    .line 293
    iput-object v0, v3, Ll/ᩳۛܳ;->ۧ:Ljava/io/IOException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 297
    :goto_0
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 298
    iput-boolean v5, v3, Ll/ᩳۛܳ;->ܽ:Z

    return-void

    :catchall_1
    move-exception v0

    .line 297
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 298
    iput-boolean v5, v3, Ll/ᩳۛܳ;->ܽ:Z

    .line 299
    throw v0
.end method
