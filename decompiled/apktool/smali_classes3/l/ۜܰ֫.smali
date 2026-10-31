.class public final Ll/ۜܰ֫;
.super Ll/ۗ᩸֫;
.source "18S9"

# interfaces
.implements Ll/᩷ܰ֫;


# instance fields
.field public final ᩴ:Landroid/content/ContextWrapper;

.field public final ᩵:I


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 2

    const/4 v0, 0x1

    new-array v1, v0, [Ll/᩸᩸֫;

    new-array v0, v0, [Ll/ۖܰ֫;

    .line 149
    invoke-direct {p0, v1, v0}, Ll/ۗ᩸֫;-><init>([Ll/᩸᩸֫;[Ll/᩶᩸֫;)V

    .line 150
    iput-object p1, p0, Ll/ۜܰ֫;->ᩴ:Landroid/content/ContextWrapper;

    const/4 p1, -0x1

    .line 152
    iput p1, p0, Ll/ۜܰ֫;->᩵:I

    return-void
.end method

.method public static synthetic ֫(Ll/ۜܰ֫;Ll/᩶᩸֫;)V
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(Ll/᩶᩸֫;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "BitmapFactoryImageDecoder"

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)Ll/۠᩸֫;
    .locals 2

    .line 177
    new-instance v0, Ll/ۢܰ֫;

    const-string v1, "Unexpected decode error"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final ֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;
    .locals 5

    .line 52
    check-cast p2, Ll/ۖܰ֫;

    .line 184
    iget-object p3, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 186
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 196
    :try_start_0
    iget v0, p0, Ll/ۜܰ֫;->᩵:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 198
    :cond_1
    iget-object v0, p0, Ll/ۜܰ֫;->ᩴ:Landroid/content/ContextWrapper;

    if-eqz v0, :cond_4

    .line 199
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v0

    .line 200
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 201
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 202
    iget-object v3, p1, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    if-eqz v3, :cond_3

    .line 203
    iget v4, v3, Ll/۠ᩴ֫;->᩻֫:I

    if-eq v4, v1, :cond_2

    mul-int v2, v2, v4

    .line 206
    :cond_2
    iget v3, v3, Ll/۠ᩴ֫;->ۜ֫:I

    if-eq v3, v1, :cond_3

    mul-int v0, v0, v3

    .line 212
    :cond_3
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_4
    const/16 v0, 0x1000

    .line 220
    :goto_1
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 221
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result p3

    .line 219
    invoke-static {p3, v0, v1}, Ll/ۘ۠֫;->֫(II[B)Landroid/graphics/Bitmap;

    move-result-object p3

    iput-object p3, p2, Ll/ۖܰ֫;->ۗ:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v0, p2, Ll/᩶᩸֫;->ۙ:J

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 227
    new-instance p2, Ll/ۢܰ֫;

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    move-exception p1

    .line 225
    new-instance p2, Ll/ۢܰ֫;

    const-string p3, "Could not decode image data with BitmapFactory."

    .line 50
    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-object p2
.end method

.method public final ܿ()Ll/᩶᩸֫;
    .locals 1

    .line 167
    new-instance v0, Ll/ܳܰ֫;

    invoke-direct {v0, p0}, Ll/ܳܰ֫;-><init>(Ll/ۜܰ֫;)V

    return-object v0
.end method

.method public final ᩳ()Ll/᩸᩸֫;
    .locals 3

    .line 162
    new-instance v0, Ll/᩸᩸֫;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 132
    invoke-direct {v0, v1, v2}, Ll/᩸᩸֫;-><init>(II)V

    return-object v0
.end method
