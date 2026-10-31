.class public final Ll/ۖ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ᩸:Ll/۟ܰۜ;

.field public final ᩹:Ll/ۡ᩸ۜ;


# direct methods
.method public constructor <init>(Ll/۟ܰۜ;Ll/ۡ᩸ۜ;)V
    .locals 0

    .line 391
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 392
    iput-object p1, p0, Ll/ۖ᩸ۜ;->᩸:Ll/۟ܰۜ;

    .line 393
    iput-object p2, p0, Ll/ۖ᩸ۜ;->᩹:Ll/ۡ᩸ۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 419
    iget-object v0, p0, Ll/ۖ᩸ۜ;->᩸:Ll/۟ܰۜ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final length()J
    .locals 2

    .line 399
    :try_start_0
    iget-object v0, p0, Ll/ۖ᩸ۜ;->᩸:Ll/۟ܰۜ;

    invoke-interface {v0}, Ll/۟ܰۜ;->length()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 401
    iget-object v1, p0, Ll/ۖ᩸ۜ;->᩹:Ll/ۡ᩸ۜ;

    invoke-static {v1}, Ll/ۡ᩸ۜ;->ۧ(Ll/ۡ᩸ۜ;)V

    .line 402
    new-instance v1, Ll/ܺ᩸ۜ;

    invoke-direct {v1, v0}, Ll/ܺ᩸ۜ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final ۧ(J[BII)V
    .locals 6

    .line 410
    :try_start_0
    iget-object v0, p0, Ll/ۖ᩸ۜ;->᩸:Ll/۟ܰۜ;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Ll/۟ܰۜ;->ۧ(J[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 412
    iget-object p2, p0, Ll/ۖ᩸ۜ;->᩹:Ll/ۡ᩸ۜ;

    invoke-static {p2}, Ll/ۡ᩸ۜ;->ۧ(Ll/ۡ᩸ۜ;)V

    .line 413
    new-instance p2, Ll/ܺ᩸ۜ;

    invoke-direct {p2, p1}, Ll/ܺ᩸ۜ;-><init>(Ljava/io/IOException;)V

    throw p2
.end method
