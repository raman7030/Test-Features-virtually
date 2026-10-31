.class public final Ll/ۗܶۖ;
.super Ljava/lang/Object;
.source "S50A"


# instance fields
.field public ֫:Ll/ۡۛۡ;

.field public final ۧ:Ll/ۢ᩹ۖ;

.field public ܽ:I


# direct methods
.method public constructor <init>(Ll/ۢ᩹ۖ;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Ll/ۗܶۖ;->ۧ:Ll/ۢ᩹ۖ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܶۖ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗܶۖ;->ܽ:I

    return p0
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/ۗܶۖ;
    .locals 5

    .line 68
    new-instance v0, Ll/ۢ᩹ۖ;

    .line 327
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 329
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x0

    .line 330
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 332
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 294
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۢ᩹ۖ;-><init>(Ljava/nio/ByteBuffer;)V

    .line 64
    new-instance p0, Ll/ۗܶۖ;

    invoke-direct {p0, v0}, Ll/ۗܶۖ;-><init>(Ll/ۢ᩹ۖ;)V

    return-object p0
.end method

.method public static ֫(Ljava/nio/ByteBuffer;)Ll/ۗܶۖ;
    .locals 1

    .line 60
    new-instance v0, Ll/ۢ᩹ۖ;

    invoke-direct {v0, p0}, Ll/ۢ᩹ۖ;-><init>(Ljava/nio/ByteBuffer;)V

    .line 64
    new-instance p0, Ll/ۗܶۖ;

    invoke-direct {p0, v0}, Ll/ۗܶۖ;-><init>(Ll/ۢ᩹ۖ;)V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)V
    .locals 8

    .line 337
    instance-of v0, p1, Ljava/io/BufferedOutputStream;

    if-nez v0, :cond_0

    .line 338
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v0

    .line 339
    :cond_0
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 113
    new-instance v3, Ll/ۘ᩸ۖ;

    invoke-direct {v3}, Ll/ۘ᩸ۖ;-><init>()V

    .line 185
    new-instance v4, Ll/ۙܶۖ;

    invoke-direct {v4, p0}, Ll/ۙܶۖ;-><init>(Ll/ۗܶۖ;)V

    .line 115
    new-instance v5, Ll/᩹ܶۖ;

    invoke-direct {v5, v0}, Ll/᩹ܶۖ;-><init>(Ljava/util/zip/ZipOutputStream;)V

    .line 144
    new-instance v6, Ll/᩵ۛۡ;

    iget-object p1, p0, Ll/ۗܶۖ;->ۧ:Ll/ۢ᩹ۖ;

    invoke-virtual {p1}, Ll/ۢ᩹ۖ;->֫()I

    move-result v1

    int-to-long v1, v1

    invoke-direct {v6, v1, v2}, Ll/᩵ۛۡ;-><init>(J)V

    iget-object v1, p0, Ll/ۗܶۖ;->֫:Ll/ۡۛۡ;

    invoke-virtual {v6, v1}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 145
    new-instance v7, Ll/᩶ܶۖ;

    move-object v1, v7

    move-object v2, v3

    invoke-direct/range {v1 .. v6}, Ll/᩶ܶۖ;-><init>(Ll/ۘ᩸ۖ;Ll/ۘ᩸ۖ;Ll/ۤܶۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V

    .line 181
    iget v1, p0, Ll/ۗܶۖ;->ܽ:I

    or-int/lit8 v1, v1, 0x20

    invoke-virtual {p1, v7, v1}, Ll/ۢ᩹ۖ;->֫(Ll/᩵᩹ۖ;I)V

    .line 341
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->close()V

    return-void
.end method

.method public final ֫(Ll/ۡۛۡ;)V
    .locals 0

    .line 345
    iput-object p1, p0, Ll/ۗܶۖ;->֫:Ll/ۡۛۡ;

    return-void
.end method

.method public final ֫()[B
    .locals 6

    .line 83
    new-instance v0, Ll/ۘ᩸ۖ;

    invoke-direct {v0}, Ll/ۘ᩸ۖ;-><init>()V

    .line 84
    iget-object v1, p0, Ll/ۗܶۖ;->ۧ:Ll/ۢ᩹ۖ;

    invoke-virtual {v1}, Ll/ۢ᩹ۖ;->ۧ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۘ᩸ۖ;->֫(I)V

    .line 85
    iget v2, p0, Ll/ۗܶۖ;->ܽ:I

    or-int/lit8 v2, v2, 0x20

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Ll/ۢ᩹ۖ;->֫(Ll/᩵᩹ۖ;II)V

    .line 185
    new-instance v1, Ll/ۙܶۖ;

    invoke-direct {v1, p0}, Ll/ۙܶۖ;-><init>(Ll/ۗܶۖ;)V

    .line 87
    new-instance v2, Ll/᩵ۛۡ;

    const-wide/16 v4, 0x1

    invoke-direct {v2, v4, v5}, Ll/᩵ۛۡ;-><init>(J)V

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v5, v4, v3

    .line 89
    new-instance v5, Ll/ܶܶۖ;

    invoke-direct {v5, v4}, Ll/ܶܶۖ;-><init>([Ljava/lang/Object;)V

    .line 108
    invoke-virtual {v1, v0, v5, v2}, Ll/֨ܶۖ;->֫(Ll/ۘ᩸ۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V

    .line 109
    aget-object v0, v4, v3

    check-cast v0, [B

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 328
    iget v0, p0, Ll/ۗܶۖ;->ܽ:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۗܶۖ;->ܽ:I

    return-void
.end method
