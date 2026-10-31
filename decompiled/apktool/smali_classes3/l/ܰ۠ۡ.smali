.class public final Ll/ܰ۠ۡ;
.super Ljava/lang/Object;
.source "U6WA"


# instance fields
.field public ֡:I

.field public ֨:Z

.field public final ֫:Ljava/util/ArrayList;

.field public final ۖ:[I

.field public ۗ:I

.field public final ۘ:[I

.field public ۙ:I

.field public final ۚ:[I

.field public ۛ:I

.field public ۜ:F

.field public final ۠:[F

.field public final ۡ:[F

.field public ۢ:I

.field public ۤ:I

.field public ۧ:I

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public final ܰ:[F

.field public final ܳ:[[F

.field public final ܶ:[I

.field public ܺ:I

.field public final ܽ:[I

.field public final ܿ:[[F

.field public final ᩳ:[I

.field public ᩴ:I

.field public final ᩵:[I

.field public ᩶:I

.field public final ᩷:[F

.field public final ᩸:[F

.field public ᩹:I

.field public ᩺:I

.field public ᩻:F


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۠ۡ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 108
    iput-object v1, p0, Ll/ܰ۠ۡ;->ܶ:[I

    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ۠ۡ;->ᩳ:[I

    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ۠ۡ;->ܽ:[I

    const/16 v1, 0x10

    new-array v2, v1, [F

    new-array v3, v1, [F

    new-array v4, v0, [[F

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    .line 109
    iput-object v4, p0, Ll/ܰ۠ۡ;->ܳ:[[F

    new-array v3, v1, [F

    new-array v4, v1, [F

    new-array v0, v0, [[F

    aput-object v3, v0, v5

    aput-object v4, v0, v2

    .line 110
    iput-object v0, p0, Ll/ܰ۠ۡ;->ܿ:[[F

    new-array v0, v1, [F

    .line 111
    iput-object v0, p0, Ll/ܰ۠ۡ;->۠:[F

    new-array v0, v1, [F

    iput-object v0, p0, Ll/ܰ۠ۡ;->ۡ:[F

    new-array v0, v1, [F

    iput-object v0, p0, Ll/ܰ۠ۡ;->ܰ:[F

    new-array v0, v1, [F

    iput-object v0, p0, Ll/ܰ۠ۡ;->᩷:[F

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 112
    iput-object v0, p0, Ll/ܰ۠ۡ;->᩸:[F

    new-array v0, v2, [I

    .line 114
    iput-object v0, p0, Ll/ܰ۠ۡ;->᩵:[I

    new-array v0, v2, [I

    iput-object v0, p0, Ll/ܰ۠ۡ;->ۘ:[I

    new-array v0, v2, [I

    iput-object v0, p0, Ll/ܰ۠ۡ;->ۖ:[I

    new-array v0, v2, [I

    iput-object v0, p0, Ll/ܰ۠ۡ;->ۚ:[I

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 118
    iput v0, p0, Ll/ܰ۠ۡ;->ۜ:F

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    iput v0, p0, Ll/ܰ۠ۡ;->᩻:F

    return-void
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 2

    .line 307
    invoke-static {p0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p0

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    const v0, 0x8b81

    const/4 v1, 0x0

    .line 308
    invoke-static {p0, v0, p1, v1}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 309
    aget p1, p1, v1

    if-eqz p1, :cond_0

    return p0

    :cond_0
    invoke-static {p0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    const v0, 0x8b31

    .line 313
    invoke-static {v0, p0}, Ll/ܰ۠ۡ;->֫(ILjava/lang/String;)I

    move-result p0

    const v0, 0x8b30

    invoke-static {v0, p1}, Ll/ܰ۠ۡ;->֫(ILjava/lang/String;)I

    move-result p1

    .line 314
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    invoke-static {v0, p0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    const-string v1, "aPosition"

    const/4 v2, 0x0

    .line 315
    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    const-string v1, "aNormal"

    const/4 v3, 0x1

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    const/4 v1, 0x2

    const-string v4, "aColor"

    invoke-static {v0, v1, v4}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    .line 316
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    invoke-static {p0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    new-array p0, v3, [I

    const p1, 0x8b82

    .line 317
    invoke-static {v0, p1, p0, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 318
    aget p0, p0, v2

    if-eqz p0, :cond_0

    return v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
    .locals 8

    const-string v0, ".bin"

    .line 175
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    .line 176
    :try_start_0
    new-instance p2, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    sget-object v0, Lcom/github/luben/zstd/RecyclingBufferPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p2, p1, v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 177
    :try_start_1
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p2}, Ll/۬ۜܽ;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0}, Ll/ۨ۠ۡ;->֫(Ll/۬ۜܽ;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :try_start_2
    invoke-virtual {p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 179
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۨ۠ۡ;

    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 181
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 182
    aget v0, v1, v2

    const/4 v3, 0x1

    aget v4, v1, v3

    iget v5, p2, Ll/ۨ۠ۡ;->֫:I

    iget-object v6, p2, Ll/ۨ۠ۡ;->ۧ:Ljava/nio/ByteBuffer;

    iget-object v7, p2, Ll/ۨ۠ۡ;->ܿ:Ljava/nio/ByteBuffer;

    filled-new-array {v0, v4, v5, p3}, [I

    move-result-object v0

    iget-object v4, p0, Ll/ܰ۠ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    aget v0, v1, v2

    const v2, 0x8892

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 184
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    const v4, 0x88e4

    invoke-static {v2, v0, v7, v4}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 185
    aget v0, v1, v3

    const v1, 0x8893

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 186
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-static {v1, v0, v6, v4}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 187
    iget v0, p0, Ll/ܰ۠ۡ;->ۜ:F

    iget v1, p2, Ll/ۨ۠ۡ;->ᩳ:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Ll/ܰ۠ۡ;->ۜ:F

    .line 188
    iget v0, p0, Ll/ܰ۠ۡ;->᩻:F

    iget p2, p2, Ll/ۨ۠ۡ;->ܽ:F

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Ll/ܰ۠ۡ;->᩻:F

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p3

    .line 175
    :try_start_3
    invoke-virtual {p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    if-eqz p1, :cond_2

    :try_start_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw p2
.end method

.method private ֫(Z)V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 272
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    .line 273
    invoke-static {v3}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 274
    :cond_0
    iget-object v4, v0, Ll/ܰ۠ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    const v6, 0x8892

    .line 275
    aget v7, v5, v1

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    const v6, 0x8893

    aget v7, v5, v3

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/16 v10, 0x1402

    const/4 v11, 0x0

    .line 276
    invoke-static/range {v8 .. v13}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    if-eqz p1, :cond_2

    const/16 v18, 0xc

    const/16 v19, 0x6

    const/4 v14, 0x1

    const/4 v15, 0x3

    const/16 v16, 0x1400

    const/16 v17, 0x1

    .line 278
    invoke-static/range {v14 .. v19}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    const/16 v10, 0xc

    const/16 v11, 0x9

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/16 v8, 0x1401

    const/4 v9, 0x1

    .line 279
    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 280
    iget v6, v0, Ll/ܰ۠ۡ;->᩺:I

    iget-object v7, v0, Ll/ܰ۠ۡ;->᩸:[F

    aget v8, v7, v1

    aget v9, v7, v3

    aget v10, v7, v2

    const/4 v11, 0x3

    aget v12, v5, v11

    if-ne v12, v3, :cond_1

    aget v7, v7, v11

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-static {v6, v8, v9, v10, v7}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    .line 282
    :cond_2
    aget v5, v5, v2

    const/16 v6, 0x1403

    const/4 v7, 0x4

    invoke-static {v7, v5, v6, v1}, Landroid/opengl/GLES20;->glDrawElements(IIII)V

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(IIF[F)V
    .locals 32

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-lez v1, :cond_8

    if-gtz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    mul-int/lit8 v12, v1, 0x2

    mul-int/lit8 v13, v2, 0x2

    .line 216
    iget v3, v0, Ll/ܰ۠ۡ;->֡:I

    iget-object v14, v0, Ll/ܰ۠ۡ;->ۘ:[I

    iget-object v15, v0, Ll/ܰ۠ۡ;->᩵:[I

    const v4, 0x84c0

    const/16 v11, 0xde1

    const/4 v5, 0x0

    if-ne v3, v12, :cond_1

    iget v3, v0, Ll/ܰ۠ۡ;->ᩴ:I

    if-ne v3, v13, :cond_1

    goto :goto_0

    .line 217
    :cond_1
    invoke-static {v4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 218
    aget v3, v15, v5

    invoke-static {v11, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v10, 0x1401

    const/16 v16, 0x0

    const/16 v3, 0xde1

    const/4 v4, 0x0

    const/16 v5, 0x1908

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/16 v9, 0x1908

    const v7, 0x8d40

    const v18, 0x84c0

    move v6, v12

    move v7, v13

    const/16 v1, 0xde1

    move-object/from16 v11, v16

    .line 219
    invoke-static/range {v3 .. v11}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const/16 v3, 0x2801

    const/16 v4, 0x2601

    .line 220
    invoke-static {v1, v3, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v3, 0x2800

    .line 221
    invoke-static {v1, v3, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v3, 0x2802

    const v4, 0x812f

    .line 222
    invoke-static {v1, v3, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v3, 0x2803

    .line 223
    invoke-static {v1, v3, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 224
    iget-object v3, v0, Ll/ܰ۠ۡ;->ۖ:[I

    aget v4, v3, v17

    const v5, 0x8d41

    invoke-static {v5, v4}, Landroid/opengl/GLES20;->glBindRenderbuffer(II)V

    const v4, 0x81a5

    .line 225
    invoke-static {v5, v4, v12, v13}, Landroid/opengl/GLES20;->glRenderbufferStorage(IIII)V

    .line 226
    aget v4, v14, v17

    const v6, 0x8d40

    invoke-static {v6, v4}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const v4, 0x8ce0

    .line 227
    aget v7, v15, v17

    invoke-static {v6, v4, v1, v7, v8}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    const v1, 0x8d00

    .line 228
    aget v3, v3, v8

    invoke-static {v6, v1, v5, v3}, Landroid/opengl/GLES20;->glFramebufferRenderbuffer(IIII)V

    .line 229
    invoke-static {v6}, Landroid/opengl/GLES20;->glCheckFramebufferStatus(I)I

    move-result v1

    const v3, 0x8cd5

    if-ne v1, v3, :cond_7

    .line 232
    iput v12, v0, Ll/ܰ۠ۡ;->֡:I

    .line 233
    iput v13, v0, Ll/ܰ۠ۡ;->ᩴ:I

    :goto_0
    const v3, 0x8d40

    const v4, 0x84c0

    const/4 v1, 0x0

    :goto_1
    const/4 v5, 0x2

    .line 237
    iget-object v6, v0, Ll/ܰ۠ۡ;->ܿ:[[F

    if-ge v1, v5, :cond_2

    aget-object v16, v6, v1

    iget-object v5, v0, Ll/ܰ۠ۡ;->ܳ:[[F

    aget-object v18, v5, v1

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v17, 0x0

    move-object/from16 v20, p4

    invoke-static/range {v16 .. v21}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 238
    :cond_2
    iget-boolean v1, v0, Ll/ܰ۠ۡ;->֨:Z

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    .line 239
    iget v1, v0, Ll/ܰ۠ۡ;->ۧ:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 240
    invoke-static {v7}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    invoke-static {v5}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    const/16 v1, 0x200

    const/4 v9, 0x0

    .line 241
    invoke-static {v9, v9, v1, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 242
    invoke-static {v1, v8, v8, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/4 v1, 0x0

    :goto_2
    const/16 v10, 0x4100

    if-ge v1, v5, :cond_4

    .line 244
    iget-object v11, v0, Ll/ܰ۠ۡ;->ᩳ:[I

    aget v11, v11, v1

    invoke-static {v3, v11}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 245
    invoke-static {v10}, Landroid/opengl/GLES20;->glClear(I)V

    .line 246
    iget v10, v0, Ll/ܰ۠ۡ;->᩹:I

    aget-object v11, v6, v1

    invoke-static {v10, v7, v9, v11, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 247
    invoke-direct {v0, v9}, Ll/ܰ۠ۡ;->֫(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    const/16 v10, 0x4100

    .line 250
    :cond_4
    aget v1, v14, v9

    invoke-static {v3, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 251
    invoke-static {v9, v9, v12, v13}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 253
    invoke-static {v8, v8, v8, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 254
    invoke-static {v10}, Landroid/opengl/GLES20;->glClear(I)V

    .line 255
    iget v1, v0, Ll/ܰ۠ۡ;->᩻:F

    iget v8, v0, Ll/ܰ۠ۡ;->ۜ:F

    sub-float v9, v1, v8

    const/high16 v10, 0x40000000    # 2.0f

    mul-float v11, p3, v10

    const v14, 0x3f739752

    mul-float v11, v11, v14

    div-float/2addr v9, v11

    int-to-float v11, v12

    mul-float v11, v11, v9

    int-to-float v12, v13

    div-float/2addr v11, v12

    add-float/2addr v1, v8

    div-float/2addr v1, v10

    neg-float v8, v11

    sub-float v20, v1, v9

    add-float v21, v1, v9

    const v22, 0x3dcccccd    # 0.1f

    const/high16 v23, 0x41f00000    # 30.0f

    .line 259
    iget-object v1, v0, Ll/ܰ۠ۡ;->ۡ:[F

    const/16 v25, 0x0

    move-object/from16 v16, v1

    move/from16 v17, v25

    move/from16 v18, v8

    move/from16 v19, v11

    invoke-static/range {v16 .. v23}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    const/16 v29, 0x0

    const/16 v31, 0x0

    .line 260
    iget-object v1, v0, Ll/ܰ۠ۡ;->۠:[F

    const/16 v27, 0x0

    iget-object v8, v0, Ll/ܰ۠ۡ;->ܰ:[F

    move-object/from16 v26, v1

    move-object/from16 v28, v8

    move-object/from16 v30, p4

    invoke-static/range {v26 .. v31}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 261
    iget-object v1, v0, Ll/ܰ۠ۡ;->۠:[F

    iget-object v8, v0, Ll/ܰ۠ۡ;->᩷:[F

    iget-object v9, v0, Ll/ܰ۠ۡ;->ۡ:[F

    move-object/from16 v24, v8

    move-object/from16 v26, v9

    move-object/from16 v28, v1

    invoke-static/range {v24 .. v29}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 262
    iget v1, v0, Ll/ܰ۠ۡ;->ۢ:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 263
    iget v1, v0, Ll/ܰ۠ۡ;->ۤ:I

    iget-object v8, v0, Ll/ܰ۠ۡ;->᩷:[F

    const/4 v9, 0x0

    invoke-static {v1, v7, v9, v8, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 264
    iget v1, v0, Ll/ܰ۠ۡ;->۫:I

    move-object/from16 v8, p4

    invoke-static {v1, v7, v9, v8, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 265
    iget v1, v0, Ll/ܰ۠ۡ;->ۗ:I

    aget-object v8, v6, v9

    invoke-static {v1, v7, v9, v8, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 266
    iget v1, v0, Ll/ܰ۠ۡ;->۬:I

    aget-object v6, v6, v7

    invoke-static {v1, v7, v9, v6, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v5, :cond_5

    add-int v6, v1, v4

    .line 267
    invoke-static {v6}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v6, v0, Ll/ܰ۠ۡ;->ܶ:[I

    aget v6, v6, v1

    const/16 v8, 0xde1

    invoke-static {v8, v6}, Landroid/opengl/GLES20;->glBindTexture(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 268
    :cond_5
    invoke-direct {v0, v7}, Ll/ܰ۠ۡ;->֫(Z)V

    const/4 v1, 0x0

    .line 197
    invoke-static {v3, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    move/from16 v3, p1

    .line 198
    invoke-static {v1, v1, v3, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/16 v2, 0xb71

    .line 199
    invoke-static {v2}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 200
    iget v3, v0, Ll/ܰ۠ۡ;->ܺ:I

    invoke-static {v3}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 201
    invoke-static {v4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 202
    aget v3, v15, v1

    const/16 v4, 0xde1

    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 203
    iget-object v3, v0, Ll/ܰ۠ۡ;->ۚ:[I

    aget v3, v3, v1

    const v4, 0x8892

    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 204
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 205
    invoke-static {v7}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 206
    invoke-static {v5}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/16 v10, 0x1406

    const/4 v11, 0x0

    .line 207
    invoke-static/range {v8 .. v13}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    const/4 v1, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x0

    .line 208
    invoke-static {v1, v4, v3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 209
    invoke-static {v2}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 210
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    .line 211
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Logo GL error: "

    .line 0
    invoke-static {v1, v3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 211
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 230
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Incomplete logo antialias framebuffer"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_4
    return-void
.end method

.method public final ֫(Landroid/content/res/AssetManager;IZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    shr-int/lit8 v3, v2, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    const/high16 v4, 0x437f0000    # 255.0f

    div-float/2addr v3, v4

    .line 121
    iget-object v5, v0, Ll/ܰ۠ۡ;->᩸:[F

    const/4 v6, 0x0

    aput v3, v5, v6

    shr-int/lit8 v3, v2, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    div-float/2addr v3, v4

    const/4 v7, 0x1

    .line 122
    aput v3, v5, v7

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    div-float/2addr v2, v4

    const/4 v3, 0x2

    .line 123
    aput v2, v5, v3

    if-eqz p3, :cond_0

    const v2, 0x3e19999a    # 0.15f

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v4, 0x3

    .line 124
    aput v2, v5, v4

    const-string v2, "attribute vec3 aPosition,aNormal,aColor; uniform mat4 uMvp,uModel,uLight0,uLight1;varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;void main(){vec4 p=vec4(aPosition/256.0,1.0);gl_Position=uMvp*p;vNormal=mat3(uModel)*aNormal;vColor=aColor;vLight0=uLight0*p;vLight1=uLight1*p;}"

    const-string v4, "precision mediump float; varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;uniform sampler2D uShadow0,uShadow1;uniform bool uHasShadows;uniform vec4 uTheme;float visibility(sampler2D tex,vec4 p){if(!uHasShadows)return 1.0;vec3 q=p.xyz/p.w*0.5+0.5;if(q.x<0.0||q.x>1.0||q.y<0.0||q.y>1.0||q.z>1.0)return 1.0;float s=0.0;for(int x=-1;x<=1;x++){for(int y=-1;y<=1;y++){vec2 d=texture2D(tex,q.xy+vec2(float(x),float(y))/512.0).rg;s+=step(q.z-0.0007,d.x+d.y/255.0);}}return 0.3+0.7*s/9.0;}void main(){vec3 n=normalize(vNormal);if(!gl_FrontFacing)n=-n;float a=max(0.0,dot(n,normalize(vec3(-4.0,7.0,9.0))));float b=max(0.0,dot(n,normalize(vec3(1.0,4.0,-7.0))));float light=0.70+0.60*a*visibility(uShadow0,vLight0)+0.50*b*visibility(uShadow1,vLight1);vec3 color=pow(pow(mix(vColor,uTheme.rgb,uTheme.a),vec3(2.2))*light,vec3(1.0/2.2));gl_FragColor=vec4(color,1.0);}"

    .line 125
    invoke-static {v2, v4}, Ll/ܰ۠ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v2, "attribute vec3 aPosition;uniform mat4 uMvp;void main(){gl_Position=uMvp*vec4(aPosition/256.0,1.0);}"

    const-string v4, "precision mediump float;void main(){vec2 d=fract(gl_FragCoord.z*vec2(1.0,255.0));d.x-=d.y/255.0;gl_FragColor=vec4(d,0.0,1.0);}"

    .line 126
    invoke-static {v2, v4}, Ll/ܰ۠ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۧ:I

    const-string v2, "attribute vec2 aPosition;varying vec2 vUv;void main(){vUv=aPosition*0.5+0.5;gl_Position=vec4(aPosition,0.0,1.0);}"

    const-string v4, "precision mediump float;varying vec2 vUv;uniform sampler2D uImage;void main(){gl_FragColor=texture2D(uImage,vUv);}"

    .line 127
    invoke-static {v2, v4}, Ll/ܰ۠ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ܺ:I

    const-string v4, "uImage"

    .line 128
    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۙ:I

    const/16 v2, 0x20

    .line 129
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v4

    const/16 v5, 0x8

    new-array v5, v5, [F

    .line 130
    fill-array-data v5, :array_0

    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 131
    iget-object v5, v0, Ll/ܰ۠ۡ;->ۚ:[I

    invoke-static {v7, v5, v6}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 132
    aget v5, v5, v6

    const v8, 0x8892

    invoke-static {v8, v5}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    const v5, 0x88e4

    .line 133
    invoke-static {v8, v2, v4, v5}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 134
    iget-object v2, v0, Ll/ܰ۠ۡ;->᩵:[I

    invoke-static {v7, v2, v6}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 135
    iget-object v2, v0, Ll/ܰ۠ۡ;->ۘ:[I

    invoke-static {v7, v2, v6}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 136
    iget-object v2, v0, Ll/ܰ۠ۡ;->ۖ:[I

    invoke-static {v7, v2, v6}, Landroid/opengl/GLES20;->glGenRenderbuffers(I[II)V

    .line 137
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v4, "uMvp"

    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۤ:I

    .line 138
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v5, "uModel"

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->۫:I

    .line 139
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v5, "uLight0"

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۗ:I

    .line 140
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v5, "uLight1"

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->۬:I

    .line 141
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v5, "uShadow0"

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۛ:I

    .line 142
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v5, "uShadow1"

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->ۨ:I

    .line 143
    iget v2, v0, Ll/ܰ۠ۡ;->ۧ:I

    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->᩹:I

    .line 144
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v4, "uHasShadows"

    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->᩶:I

    .line 145
    iget v2, v0, Ll/ܰ۠ۡ;->ۢ:I

    const-string v4, "uTheme"

    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, v0, Ll/ܰ۠ۡ;->᩺:I

    const-string v2, "folder"

    .line 146
    invoke-direct {v0, v1, v2, v7}, Ll/ܰ۠ۡ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V

    const-string v2, "details"

    .line 147
    invoke-direct {v0, v1, v2, v6}, Ll/ܰ۠ۡ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V

    const-string v2, "variant"

    .line 148
    invoke-direct {v0, v1, v2, v6}, Ll/ܰ۠ۡ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V

    .line 149
    iget v1, v0, Ll/ܰ۠ۡ;->᩻:F

    iget v2, v0, Ll/ܰ۠ۡ;->ۜ:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    const/high16 v17, 0x3f800000    # 1.0f

    const/16 v18, 0x0

    .line 150
    iget-object v8, v0, Ll/ܰ۠ۡ;->ܰ:[F

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/high16 v12, 0x41580000    # 13.5f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move v9, v1

    invoke-static/range {v8 .. v18}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    const/16 v2, 0x10

    new-array v4, v2, [F

    new-array v2, v2, [F

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x41c00000    # 24.0f

    const/4 v9, 0x0

    const/high16 v10, -0x3f800000    # -4.0f

    const/high16 v11, 0x40800000    # 4.0f

    const/high16 v12, -0x3f800000    # -4.0f

    const/high16 v13, 0x40800000    # 4.0f

    move-object v8, v2

    .line 152
    invoke-static/range {v8 .. v15}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/high16 v21, -0x3f800000    # -4.0f

    const/high16 v22, 0x40e00000    # 7.0f

    const/high16 v23, 0x41100000    # 9.0f

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v4

    move/from16 v20, v1

    move/from16 v25, v15

    move/from16 v26, v16

    move/from16 v27, v17

    move/from16 v28, v5

    move/from16 v29, v8

    .line 153
    invoke-static/range {v19 .. v29}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    .line 154
    iget-object v14, v0, Ll/ܰ۠ۡ;->ܳ:[[F

    aget-object v9, v14, v6

    const/4 v12, 0x0

    const/16 v18, 0x0

    move v10, v1

    move-object v11, v2

    move-object v13, v4

    move-object/from16 v30, v14

    move/from16 v14, v18

    invoke-static/range {v9 .. v14}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    const/high16 v21, 0x3f800000    # 1.0f

    const/high16 v22, 0x40800000    # 4.0f

    const/high16 v23, -0x3f200000    # -7.0f

    .line 155
    invoke-static/range {v19 .. v29}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    .line 156
    aget-object v9, v30, v7

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 287
    iget-object v1, v0, Ll/ܰ۠ۡ;->ܶ:[I

    invoke-static {v3, v1, v6}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    iget-object v2, v0, Ll/ܰ۠ۡ;->ᩳ:[I

    invoke-static {v3, v2, v6}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    iget-object v4, v0, Ll/ܰ۠ۡ;->ܽ:[I

    invoke-static {v3, v4, v6}, Landroid/opengl/GLES20;->glGenRenderbuffers(I[II)V

    const/4 v5, 0x0

    const/4 v8, 0x1

    :goto_1
    const v9, 0x8d40

    if-ge v5, v3, :cond_2

    .line 290
    aget v10, v1, v5

    const/16 v11, 0xde1

    invoke-static {v11, v10}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v19, 0x1401

    const/16 v20, 0x0

    const/16 v12, 0xde1

    const/4 v13, 0x0

    const/16 v14, 0x1908

    const/16 v15, 0x200

    const/16 v16, 0x200

    const/16 v17, 0x0

    const/16 v18, 0x1908

    .line 291
    invoke-static/range {v12 .. v20}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const/16 v10, 0x2801

    const/16 v12, 0x2600

    .line 292
    invoke-static {v11, v10, v12}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v10, 0x2800

    .line 293
    invoke-static {v11, v10, v12}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v10, 0x2802

    const v12, 0x812f

    .line 294
    invoke-static {v11, v10, v12}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v10, 0x2803

    .line 295
    invoke-static {v11, v10, v12}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 296
    aget v10, v4, v5

    const v12, 0x8d41

    invoke-static {v12, v10}, Landroid/opengl/GLES20;->glBindRenderbuffer(II)V

    const v10, 0x81a5

    const/16 v13, 0x200

    .line 297
    invoke-static {v12, v10, v13, v13}, Landroid/opengl/GLES20;->glRenderbufferStorage(IIII)V

    .line 298
    aget v10, v2, v5

    invoke-static {v9, v10}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const v10, 0x8ce0

    .line 299
    aget v13, v1, v5

    invoke-static {v9, v10, v11, v13, v6}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    const v10, 0x8d00

    .line 300
    aget v11, v4, v5

    invoke-static {v9, v10, v12, v11}, Landroid/opengl/GLES20;->glFramebufferRenderbuffer(IIII)V

    .line 301
    invoke-static {v9}, Landroid/opengl/GLES20;->glCheckFramebufferStatus(I)I

    move-result v9

    const v10, 0x8cd5

    if-ne v9, v10, :cond_1

    const/4 v9, 0x1

    goto :goto_2

    :cond_1
    const/4 v9, 0x0

    :goto_2
    and-int/2addr v8, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 303
    :cond_2
    invoke-static {v9, v6}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 157
    iput-boolean v8, v0, Ll/ܰ۠ۡ;->֨:Z

    .line 159
    iget v1, v0, Ll/ܰ۠ۡ;->ۢ:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 160
    iget v1, v0, Ll/ܰ۠ۡ;->᩶:I

    iget-boolean v2, v0, Ll/ܰ۠ۡ;->֨:Z

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 161
    iget v1, v0, Ll/ܰ۠ۡ;->ۛ:I

    invoke-static {v1, v6}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 162
    iget v1, v0, Ll/ܰ۠ۡ;->ۨ:I

    invoke-static {v1, v7}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 163
    iget v1, v0, Ll/ܰ۠ۡ;->ܺ:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 164
    iget v1, v0, Ll/ܰ۠ۡ;->ۙ:I

    invoke-static {v1, v6}, Landroid/opengl/GLES20;->glUniform1i(II)V

    const/16 v1, 0xb71

    .line 165
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnable(I)V

    const/16 v1, 0x203

    .line 166
    invoke-static {v1}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    const/16 v1, 0xb44

    .line 167
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisable(I)V

    const/16 v1, 0xbe2

    .line 168
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisable(I)V

    const/16 v1, 0xbd0

    .line 169
    invoke-static {v1}, Landroid/opengl/GLES20;->glDisable(I)V

    return-void

    .line 149
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Empty logo bounds"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method
