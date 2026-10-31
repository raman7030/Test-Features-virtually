.class public final Ll/ۧܰۜ;
.super Ljava/lang/Object;
.source "K6MS"

# interfaces
.implements Ll/ۗ᩻ܳ;


# instance fields
.field public final ۙ:Ljava/io/OutputStream;

.field public ᩶:Z

.field public final ᩸:[B

.field public final ᩹:Ll/۟᩺ۜ;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ll/۟᩺ۜ;)V
    .locals 1

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x8000

    new-array v0, v0, [B

    .line 235
    iput-object v0, p0, Ll/ۧܰۜ;->᩸:[B

    .line 239
    iput-object p1, p0, Ll/ۧܰۜ;->ۙ:Ljava/io/OutputStream;

    .line 240
    iput-object p2, p0, Ll/ۧܰۜ;->᩹:Ll/۟᩺ۜ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(I[B)V
    .locals 2

    .line 245
    iget-object v0, p0, Ll/ۧܰۜ;->᩹:Ll/۟᩺ۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 246
    iget-object v0, p0, Ll/ۧܰۜ;->ۙ:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 251
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Ll/ۧܰۜ;->᩹:Ll/۟᩺ۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 253
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget-object v1, p0, Ll/ۧܰۜ;->᩸:[B

    array-length v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    .line 254
    invoke-virtual {p1, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 255
    iget-object v3, p0, Ll/ۧܰۜ;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v3, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 260
    iput-boolean v0, p0, Ll/ۧܰۜ;->᩶:Z

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 261
    iget-object v0, p0, Ll/ۧܰۜ;->᩹:Ll/۟᩺ۜ;

    invoke-virtual {v0}, Ll/۟᩺ۜ;->᩻()Z

    move-result v0

    return v0
.end method
