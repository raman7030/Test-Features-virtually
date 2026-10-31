.class public final Ll/۠᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۜ᩵ܿ;


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/ܶ᩵ܿ;

.field public final synthetic ܳ:Z

.field public final synthetic ܽ:Ljava/io/InputStream;

.field public final synthetic ܿ:Ll/ۚ᩸ܿ;

.field public final synthetic ᩳ:J


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/io/InputStream;JLl/ۚ᩸ܿ;Z)V
    .locals 0

    .line 826
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    iput-object p2, p0, Ll/۠᩵ܿ;->ܽ:Ljava/io/InputStream;

    iput-wide p3, p0, Ll/۠᩵ܿ;->ᩳ:J

    iput-object p5, p0, Ll/۠᩵ܿ;->ܿ:Ll/ۚ᩸ܿ;

    iput-boolean p6, p0, Ll/۠᩵ܿ;->ܳ:Z

    const/4 p1, 0x1

    .line 827
    iput-boolean p1, p0, Ll/۠᩵ܿ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;I)V
    .locals 4

    const/4 v0, 0x0

    .line 446
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1

    .line 832
    :try_start_0
    iput-boolean v0, p0, Ll/۠᩵ܿ;->֫:Z

    .line 833
    iget-object v0, p0, Ll/۠᩵ܿ;->ܽ:Ljava/io/InputStream;

    iget-wide v1, p0, Ll/۠᩵ܿ;->ᩳ:J

    iget-object v3, p0, Ll/۠᩵ܿ;->ܿ:Ll/ۚ᩸ܿ;

    invoke-static {v0, p1, v1, v2, v3}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 834
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    :cond_0
    if-nez p2, :cond_1

    .line 835
    iget-boolean p1, p0, Ll/۠᩵ܿ;->ܳ:Z

    if-eqz p1, :cond_1

    .line 836
    iget-object p1, p0, Ll/۠᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-static {p1}, Ll/ܿ֡ܿ;->ܽ(Ll/ܶ᩵ܿ;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_2

    .line 831
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p2
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 0

    .line 843
    iget-boolean p1, p0, Ll/۠᩵ܿ;->֫:Z

    return p1
.end method
