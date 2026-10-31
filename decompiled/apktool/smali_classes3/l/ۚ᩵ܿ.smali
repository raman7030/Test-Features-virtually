.class public final Ll/ۚ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۜ᩵ܿ;


# instance fields
.field public final synthetic ֫:Ll/ۚ᩸ܿ;

.field public final synthetic ۧ:Ljava/io/InputStream;

.field public final synthetic ܽ:J

.field public final synthetic ᩳ:[Z


# direct methods
.method public constructor <init>([ZLjava/io/InputStream;JLl/ۚ᩸ܿ;)V
    .locals 0

    .line 638
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩵ܿ;->ᩳ:[Z

    iput-object p2, p0, Ll/ۚ᩵ܿ;->ۧ:Ljava/io/InputStream;

    iput-wide p3, p0, Ll/ۚ᩵ܿ;->ܽ:J

    iput-object p5, p0, Ll/ۚ᩵ܿ;->֫:Ll/ۚ᩸ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;I)V
    .locals 3

    const/4 p2, 0x0

    .line 446
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1

    .line 642
    :try_start_0
    iget-object v0, p0, Ll/ۚ᩵ܿ;->ᩳ:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p2

    .line 643
    iget-object p2, p0, Ll/ۚ᩵ܿ;->ۧ:Ljava/io/InputStream;

    iget-wide v0, p0, Ll/ۚ᩵ܿ;->ܽ:J

    iget-object v2, p0, Ll/ۚ᩵ܿ;->֫:Ll/ۚ᩸ܿ;

    invoke-static {p2, p1, v0, v1, v2}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 644
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_1

    .line 641
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p2
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 1

    .line 649
    iget-object p1, p0, Ll/ۚ᩵ܿ;->ᩳ:[Z

    const/4 v0, 0x0

    aget-boolean p1, p1, v0

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
