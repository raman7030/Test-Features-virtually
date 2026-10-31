.class public final Ll/᩵ܺܽ;
.super Ljava/io/InputStream;
.source "W144"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 141
    iput-object p1, p0, Ll/᩵ܺܽ;->᩸:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 146
    iget-object v0, p0, Ll/᩵ܺܽ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 149
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 2

    .line 154
    iget-object v0, p0, Ll/᩵ܺܽ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 157
    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 158
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return p3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
