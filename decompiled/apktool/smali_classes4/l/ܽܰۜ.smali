.class public final Ll/ܽܰۜ;
.super Ljava/lang/Object;
.source "K6MS"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/ܰܺܳ;


# direct methods
.method public constructor <init>(Ll/ܰܺܳ;)V
    .locals 1

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    invoke-virtual {p1}, Ll/ܰܺܳ;->֫()[B

    move-result-object p1

    const/4 v0, 0x0

    .line 63
    invoke-static {p1, v0}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object p1

    .line 195
    iput-object p1, p0, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    .line 198
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ܰܺܳ;->֫(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 200
    :goto_0
    invoke-virtual {p0}, Ll/ܽܰۜ;->close()V

    .line 201
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 207
    iget-object v0, p0, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method
