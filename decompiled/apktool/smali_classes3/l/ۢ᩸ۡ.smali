.class public final synthetic Ll/ۢ᩸ۡ;
.super Ljava/lang/Object;
.source "84GP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ۖ᩸ۡ;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ll/ۖ᩸ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۢ᩸ۡ;->᩸:I

    iput-object p2, p0, Ll/ۢ᩸ۡ;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ۢ᩸ۡ;->᩶:Ll/ۖ᩸ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۢ᩸ۡ;->᩹:Ljava/lang/String;

    .line 31
    iget v1, p0, Ll/ۢ᩸ۡ;->᩸:I

    iget-object v2, p0, Ll/ۢ᩸ۡ;->᩶:Ll/ۖ᩸ۡ;

    if-lez v1, :cond_0

    int-to-long v3, v1

    .line 32
    :try_start_0
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 33
    :cond_0
    invoke-static {v0}, Ll/ۘ᩸ۡ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    .line 34
    new-instance v1, Ll/ۧ۠᩷;

    const/4 v3, 0x4

    invoke-direct {v1, v3, v2, v0}, Ll/ۧ۠᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 44
    new-instance v1, Ll/ܺ᩸ۡ;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v0}, Ll/ܺ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_0

    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ll/ۡ᩸ۡ;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v0}, Ll/ۡ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
