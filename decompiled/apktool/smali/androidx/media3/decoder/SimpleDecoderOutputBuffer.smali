.class public final Landroidx/media3/decoder/SimpleDecoderOutputBuffer;
.super Ll/᩶᩸֫;
.source "SimpleDecoderOutputBuffer.java"


# instance fields
.field public ۗ:Ljava/nio/ByteBuffer;

.field public final ۬:Ll/᩹᩸֫;


# direct methods
.method public constructor <init>(Ll/᩹᩸֫;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/᩶᩸֫;-><init>()V

    .line 33
    iput-object p1, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->۬:Ll/᩹᩸֫;

    return-void
.end method


# virtual methods
.method public final ۧ(IJ)Ljava/nio/ByteBuffer;
    .locals 0

    .line 44
    iput-wide p2, p0, Ll/᩶᩸֫;->ۙ:J

    .line 45
    iget-object p2, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    if-ge p2, p1, :cond_1

    .line 46
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    .line 48
    :cond_1
    iget-object p2, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 49
    iget-object p2, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 50
    iget-object p1, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final ۧ()V
    .locals 1

    .line 76
    invoke-super {p0}, Ll/᩶᩸֫;->ۧ()V

    .line 77
    iget-object v0, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 84
    iget-object v0, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->۬:Ll/᩹᩸֫;

    invoke-interface {v0, p0}, Ll/᩹᩸֫;->֫(Ll/᩶᩸֫;)V

    return-void
.end method
