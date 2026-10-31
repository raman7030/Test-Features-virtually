.class public final Ll/ۧ᩹֫;
.super Ll/ۗ᩸֫;
.source "T8E3"


# static fields
.field public static final synthetic ᩹:I


# instance fields
.field public ֡:J

.field public ֨:Ll/֡᩵ۘ;

.field public ۚ:Ll/ܽᩴۘ;

.field public ۠:J

.field public ܶ:Ll/ܺ᩵ۘ;

.field public ᩴ:[D

.field public final ᩵:Landroid/content/Context;

.field public ᩸:Ll/۟ۘۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.decoder.midi"

    .line 44
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x10

    new-array v1, v0, [Ll/᩸᩸֫;

    new-array v0, v0, [Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 105
    invoke-direct {p0, v1, v0}, Ll/ۗ᩸֫;-><init>([Ll/᩸᩸֫;[Ll/᩶᩸֫;)V

    .line 107
    iput-object p1, p0, Ll/ۧ᩹֫;->᩵:Landroid/content/Context;

    const/16 p1, 0x2274

    new-array p1, p1, [D

    .line 108
    iput-object p1, p0, Ll/ۧ᩹֫;->ᩴ:[D

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 109
    iput-wide v0, p0, Ll/ۧ᩹֫;->֡:J

    .line 110
    invoke-direct {p0}, Ll/ۧ᩹֫;->ܳ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۧ᩹֫;Landroidx/media3/decoder/SimpleDecoderOutputBuffer;)V
    .locals 0

    .line 125
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(Ll/᩶᩸֫;)V

    return-void
.end method

.method private ܳ()V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "synth",
            "multiSynth",
            "reader",
            "midiSynthesizer"
        }
    .end annotation

    .line 69
    new-instance v0, Ll/۟ۘۘ;

    invoke-direct {v0}, Ll/۟ۘۘ;-><init>()V

    .line 228
    iput-object v0, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    .line 229
    invoke-virtual {v0}, Ll/۟ۘۘ;->᩻()V

    .line 230
    new-instance v0, Ll/֡᩵ۘ;

    invoke-direct {v0}, Ll/֡᩵ۘ;-><init>()V

    iput-object v0, p0, Ll/ۧ᩹֫;->֨:Ll/֡᩵ۘ;

    .line 231
    iget-object v1, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    .line 155
    iget-object v2, p0, Ll/ۧ᩹֫;->᩵:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    invoke-static {v2}, Ll/ۜ᩹֫;->֫(Landroid/content/Context;)Ll/ۜ᩹֫;

    move-result-object v2

    .line 231
    invoke-virtual {v0, v1, v2}, Ll/֡᩵ۘ;->֫(Ll/۟ۘۘ;Ll/᩹᩵ۘ;)V

    .line 237
    new-instance v0, Ll/ܽᩴۘ;

    iget-object v1, p0, Ll/ۧ᩹֫;->֨:Ll/֡᩵ۘ;

    invoke-direct {v0, v1}, Ll/ܽᩴۘ;-><init>(Ll/֡᩵ۘ;)V

    iput-object v0, p0, Ll/ۧ᩹֫;->ۚ:Ll/ܽᩴۘ;

    .line 238
    new-instance v0, Ll/ܺ᩵ۘ;

    iget-object v1, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    invoke-direct {v0, v1}, Ll/ܺ᩵ۘ;-><init>(Ll/۟ۘۘ;)V

    iput-object v0, p0, Ll/ۧ᩹֫;->ܶ:Ll/ܺ᩵ۘ;

    .line 239
    iget-object v0, p0, Ll/ۧ᩹֫;->֨:Ll/֡᩵ۘ;

    invoke-virtual {v0}, Ll/֡᩵ۘ;->֫()Ll/ܶᩴۘ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩹֫;->ܶ:Ll/ܺ᩵ۘ;

    invoke-virtual {v1}, Ll/ܺ᩵ۘ;->ۧ()Ll/۠ᩴۘ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 240
    iget-object v0, p0, Ll/ۧ᩹֫;->֨:Ll/֡᩵ۘ;

    invoke-virtual {v0}, Ll/֡᩵ۘ;->֫()Ll/ܶᩴۘ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩹֫;->ܶ:Ll/ܺ᩵ۘ;

    invoke-virtual {v1}, Ll/ܺ᩵ۘ;->ۧ()Ll/۠ᩴۘ;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 241
    iget-object v0, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    invoke-virtual {v0}, Ll/۟ۘۘ;->ۜ()V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MidiDecoder"

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)Ll/۠᩸֫;
    .locals 2

    .line 130
    new-instance v0, Ll/ܽ᩹֫;

    const-string v1, "Unexpected decode error"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final ֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;
    .locals 6

    .line 40
    check-cast p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 139
    iget-object v0, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p3, :cond_0

    .line 141
    iput-wide v1, p0, Ll/ۧ᩹֫;->֡:J

    .line 220
    :try_start_0
    iget-object p3, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    invoke-virtual {p3}, Ll/۟ۘۘ;->᩷()V

    .line 221
    iget-object p3, p0, Ll/ۧ᩹֫;->֨:Ll/֡᩵ۘ;

    invoke-virtual {p3}, Ll/֡᩵ۘ;->֫()Ll/ܶᩴۘ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܺᩴۘ;->ᩳ()V

    .line 222
    invoke-direct {p0}, Ll/ۧ᩹֫;->ܳ()V
    :try_end_0
    .catch Ll/ܽ᩹֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    return-object p1

    .line 148
    :cond_0
    :goto_0
    iget-wide v3, p0, Ll/ۧ᩹֫;->֡:J

    cmp-long p3, v3, v1

    if-nez p3, :cond_1

    .line 149
    iget-wide v3, p1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v3, p0, Ll/ۧ᩹֫;->۠:J

    .line 151
    :cond_1
    iget-wide v3, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0, v3, v4}, Ll/ۗ᩸֫;->ܽ(J)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 155
    :try_start_1
    iget-wide v3, p0, Ll/ۧ᩹֫;->֡:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    .line 156
    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    sub-long/2addr v1, v3

    long-to-double v1, v1

    const-wide v3, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    mul-double v1, v1, v3

    .line 157
    iget-object v3, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    invoke-virtual {v3, v1, v2}, Ll/۟ۘۘ;->ۧ(D)V

    .line 159
    :cond_2
    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v1, p0, Ll/ۧ᩹֫;->֡:J
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 162
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 163
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 167
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    if-lez p1, :cond_4

    .line 168
    iget-object p1, p0, Ll/ۧ᩹֫;->ۚ:Ll/ܽᩴۘ;

    .line 169
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 170
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    .line 171
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    .line 168
    invoke-virtual {p1, v2, v0, v1}, Ll/ܽᩴۘ;->֫(II[B)V

    .line 174
    :cond_4
    iget-object p1, p0, Ll/ۧ᩹֫;->ܶ:Ll/ܺ᩵ۘ;

    invoke-virtual {p1}, Ll/ܺ᩵ۘ;->֫()I

    move-result p1

    const/4 v0, 0x0

    if-nez p3, :cond_6

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 p3, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 p3, 0x1

    .line 176
    :goto_3
    invoke-static {p3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 178
    iget-object p3, p0, Ll/ۧ᩹֫;->ᩴ:[D

    array-length p3, p3

    if-le p1, p3, :cond_7

    mul-int/lit8 p3, p1, 0x7d

    .line 181
    div-int/lit8 p3, p3, 0x64

    .line 182
    new-array p3, p3, [D

    iput-object p3, p0, Ll/ۧ᩹֫;->ᩴ:[D

    :cond_7
    const/4 p3, 0x0

    :goto_4
    if-ge p3, p1, :cond_8

    .line 187
    iget-object v1, p0, Ll/ۧ᩹֫;->ܶ:Ll/ܺ᩵ۘ;

    iget-object v2, p0, Ll/ۧ᩹֫;->ᩴ:[D

    sub-int v3, p1, p3

    .line 188
    invoke-virtual {v1, v2, p3, v3}, Ll/ܺ᩵ۘ;->֫([DII)I

    move-result v1

    add-int/2addr p3, v1

    goto :goto_4

    .line 194
    :cond_8
    iget-wide v1, p0, Ll/ۧ᩹֫;->۠:J

    mul-int/lit8 p1, p3, 0x4

    invoke-virtual {p2, p1, v1, v2}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۧ(IJ)Ljava/nio/ByteBuffer;

    .line 197
    iget-object p1, p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_5
    if-ge v0, p3, :cond_9

    .line 200
    iget-object p2, p0, Ll/ۧ᩹֫;->ᩴ:[D

    aget-wide v1, p2, v0

    double-to-float p2, v1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 203
    :cond_9
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 207
    iget-wide p1, p0, Ll/ۧ᩹֫;->۠:J

    int-to-long v0, p3

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-wide/32 v2, 0xac44

    div-long/2addr v0, v2

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۧ᩹֫;->۠:J

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ۧ᩹֫;->᩸:Ll/۟ۘۘ;

    invoke-virtual {v0}, Ll/۟ۘۘ;->᩷()V

    .line 216
    invoke-super {p0}, Ll/ۗ᩸֫;->֫()V

    return-void
.end method

.method public final ܿ()Ll/᩶᩸֫;
    .locals 2

    .line 125
    new-instance v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    new-instance v1, Ll/֫᩹֫;

    invoke-direct {v1, p0}, Ll/֫᩹֫;-><init>(Ll/ۧ᩹֫;)V

    invoke-direct {v0, v1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;-><init>(Ll/᩹᩸֫;)V

    return-object v0
.end method

.method public final ᩳ()Ll/᩸᩸֫;
    .locals 3

    .line 120
    new-instance v0, Ll/᩸᩸֫;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 132
    invoke-direct {v0, v1, v2}, Ll/᩸᩸֫;-><init>(II)V

    return-object v0
.end method
