.class public final Ll/۫ۧ֡;
.super Ll/ۙܽ֡;
.source "T4F2"


# instance fields
.field public final synthetic ۡ:Ll/ۤۧ֡;


# direct methods
.method public constructor <init>(Ll/ۤۧ֡;)V
    .locals 0

    .line 665
    iput-object p1, p0, Ll/۫ۧ֡;->ۡ:Ll/ۤۧ֡;

    invoke-direct {p0}, Ll/ۙܽ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 672
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 674
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final ۡ()V
    .locals 1

    .line 680
    invoke-virtual {p0}, Ll/ۙܽ֡;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/۫ۧ֡;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 667
    sget-object v0, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    iget-object v1, p0, Ll/۫ۧ֡;->ۡ:Ll/ۤۧ֡;

    invoke-virtual {v1, v0}, Ll/ۤۧ֡;->ۧ(Ll/ܰ֫֡;)V

    .line 668
    iget-object v0, v1, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    invoke-virtual {v0}, Ll/᩹ۧ֡;->ܽ()V

    return-void
.end method
