.class public Lcom/umeng/analytics/pro/bn;
.super Lcom/umeng/analytics/pro/bu;
.source "S60M"


# static fields
.field public static final a:I = -0x10000

.field public static final b:I = -0x7fff0000

.field public static final h:Lcom/umeng/analytics/pro/bz;


# instance fields
.field public c:Z

.field public d:Z

.field public e:I

.field public f:Z

.field public i:[B

.field public j:[B

.field public k:[B

.field public l:[B

.field public m:[B

.field public n:[B

.field public o:[B

.field public p:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/umeng/analytics/pro/bz;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bz;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->h:Lcom/umeng/analytics/pro/bz;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/ci;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 84
    invoke-direct {p0, p1, v0, v1}, Lcom/umeng/analytics/pro/bn;-><init>(Lcom/umeng/analytics/pro/ci;ZZ)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/ci;ZZ)V
    .locals 4

    .line 88
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bu;-><init>(Lcom/umeng/analytics/pro/ci;)V

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/bn;->f:Z

    const/4 p1, 0x1

    new-array v0, p1, [B

    .line 149
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:[B

    const/4 v0, 0x2

    new-array v1, v0, [B

    .line 155
    iput-object v1, p0, Lcom/umeng/analytics/pro/bn;->j:[B

    const/4 v1, 0x4

    new-array v2, v1, [B

    .line 162
    iput-object v2, p0, Lcom/umeng/analytics/pro/bn;->k:[B

    const/16 v2, 0x8

    new-array v3, v2, [B

    .line 171
    iput-object v3, p0, Lcom/umeng/analytics/pro/bn;->l:[B

    new-array p1, p1, [B

    .line 262
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->m:[B

    new-array p1, v0, [B

    .line 273
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->n:[B

    new-array p1, v1, [B

    .line 292
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->o:[B

    new-array p1, v2, [B

    .line 311
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->p:[B

    .line 89
    iput-boolean p2, p0, Lcom/umeng/analytics/pro/bn;->c:Z

    .line 90
    iput-boolean p3, p0, Lcom/umeng/analytics/pro/bn;->d:Z

    return-void
.end method

.method private a([BII)I
    .locals 1

    .line 382
    invoke-virtual {p0, p3}, Lcom/umeng/analytics/pro/bn;->d(I)V

    .line 383
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0, p1, p2, p3}, Lcom/umeng/analytics/pro/ci;->d([BII)I

    move-result p1

    return p1
.end method


# virtual methods
.method public A()Ljava/nio/ByteBuffer;
    .locals 4

    .line 367
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v0

    .line 368
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->d(I)V

    .line 370
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v1

    if-lt v1, v0, :cond_0

    .line 371
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v1

    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v2

    invoke-static {v1, v2, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 372
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2, v0}, Lcom/umeng/analytics/pro/ci;->a(I)V

    return-object v1

    .line 376
    :cond_0
    new-array v1, v0, [B

    .line 377
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Lcom/umeng/analytics/pro/ci;->d([BII)I

    .line 378
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(B)V
    .locals 3

    .line 151
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 152
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/umeng/analytics/pro/ci;->b([BII)V

    return-void
.end method

.method public a(D)V
    .locals 0

    .line 185
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bn;->a(J)V

    return-void
.end method

.method public a(I)V
    .locals 4

    .line 164
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->k:[B

    shr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v3, 0x1

    .line 165
    aput-byte v1, v0, v3

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v3, 0x2

    .line 166
    aput-byte v1, v0, v3

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x3

    .line 167
    aput-byte p1, v0, v1

    .line 168
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/ci;->b([BII)V

    return-void
.end method

.method public a(J)V
    .locals 7

    .line 173
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->l:[B

    const/16 v1, 0x38

    shr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    const/16 v1, 0x30

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x1

    .line 174
    aput-byte v1, v0, v5

    const/16 v1, 0x28

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x2

    .line 175
    aput-byte v1, v0, v5

    const/16 v1, 0x20

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x3

    .line 176
    aput-byte v1, v0, v5

    const/16 v1, 0x18

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x4

    .line 177
    aput-byte v1, v0, v5

    const/16 v1, 0x10

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v1, v5

    int-to-byte v1, v1

    const/4 v5, 0x5

    .line 178
    aput-byte v1, v0, v5

    const/16 v1, 0x8

    shr-long v5, p1, v1

    and-long/2addr v5, v3

    long-to-int v6, v5

    int-to-byte v5, v6

    const/4 v6, 0x6

    .line 179
    aput-byte v5, v0, v6

    and-long/2addr p1, v3

    long-to-int p2, p1

    int-to-byte p1, p2

    const/4 p2, 0x7

    .line 180
    aput-byte p1, v0, p2

    .line 181
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/ci;->b([BII)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bp;)V
    .locals 1

    .line 113
    iget-byte v0, p1, Lcom/umeng/analytics/pro/bp;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 114
    iget-short p1, p1, Lcom/umeng/analytics/pro/bp;->c:S

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(S)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bq;)V
    .locals 1

    .line 132
    iget-byte v0, p1, Lcom/umeng/analytics/pro/bq;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 133
    iget p1, p1, Lcom/umeng/analytics/pro/bq;->b:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/br;)V
    .locals 1

    .line 124
    iget-byte v0, p1, Lcom/umeng/analytics/pro/br;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 125
    iget-byte v0, p1, Lcom/umeng/analytics/pro/br;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 126
    iget p1, p1, Lcom/umeng/analytics/pro/br;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bs;)V
    .locals 2

    .line 94
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/bn;->d:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x7fff0000

    .line 95
    iget-byte v1, p1, Lcom/umeng/analytics/pro/bs;->b:B

    or-int/2addr v0, v1

    .line 96
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(I)V

    .line 97
    iget-object v0, p1, Lcom/umeng/analytics/pro/bs;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(Ljava/lang/String;)V

    .line 98
    iget p1, p1, Lcom/umeng/analytics/pro/bs;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(I)V

    return-void

    .line 100
    :cond_0
    iget-object v0, p1, Lcom/umeng/analytics/pro/bs;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(Ljava/lang/String;)V

    .line 101
    iget-byte v0, p1, Lcom/umeng/analytics/pro/bs;->b:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 102
    iget p1, p1, Lcom/umeng/analytics/pro/bs;->c:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/by;)V
    .locals 1

    .line 139
    iget-byte v0, p1, Lcom/umeng/analytics/pro/by;->a:B

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    .line 140
    iget p1, p1, Lcom/umeng/analytics/pro/by;->b:I

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(I)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bz;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    const-string v0, "UTF-8"

    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    .line 191
    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(I)V

    .line 192
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/umeng/analytics/pro/ci;->b([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 194
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bb;

    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 199
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    .line 200
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(I)V

    .line 201
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/2addr p1, v3

    invoke-virtual {v1, v2, p1, v0}, Lcom/umeng/analytics/pro/ci;->b([BII)V

    return-void
.end method

.method public a(S)V
    .locals 3

    .line 157
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->j:[B

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x1

    .line 158
    aput-byte p1, v0, v1

    .line 159
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v2, v1}, Lcom/umeng/analytics/pro/ci;->b([BII)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 146
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(B)V

    return-void
.end method

.method public b(I)Ljava/lang/String;
    .locals 3

    .line 357
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->d(I)V

    .line 358
    new-array v0, p1, [B

    .line 359
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, p1}, Lcom/umeng/analytics/pro/ci;->d([BII)I

    .line 360
    new-instance p1, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {p1, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 362
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bb;

    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 387
    iput p1, p0, Lcom/umeng/analytics/pro/bn;->e:I

    const/4 p1, 0x1

    .line 388
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/bn;->f:Z

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    .line 120
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(B)V

    return-void
.end method

.method public d(I)V
    .locals 2

    if-ltz p1, :cond_2

    .line 395
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/bn;->f:Z

    if-eqz v0, :cond_1

    .line 396
    iget v0, p0, Lcom/umeng/analytics/pro/bn;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/umeng/analytics/pro/bn;->e:I

    if-ltz v0, :cond_0

    goto :goto_0

    .line 398
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bv;

    const-string v1, "Message length exceeded: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 398
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    .line 393
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/bv;

    const-string v1, "Negative length: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 393
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()Lcom/umeng/analytics/pro/bs;
    .locals 4

    .line 209
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v0

    const/4 v1, 0x4

    if-gez v0, :cond_1

    const/high16 v2, -0x10000

    and-int/2addr v2, v0

    const/high16 v3, -0x7fff0000

    if-ne v2, v3, :cond_0

    .line 215
    new-instance v1, Lcom/umeng/analytics/pro/bs;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->z()Ljava/lang/String;

    move-result-object v2

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v3

    invoke-direct {v1, v2, v0, v3}, Lcom/umeng/analytics/pro/bs;-><init>(Ljava/lang/String;BI)V

    return-object v1

    .line 213
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bv;

    const-string v2, "Bad version in readMessageBegin"

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/bv;-><init>(ILjava/lang/String;)V

    throw v0

    .line 217
    :cond_1
    iget-boolean v2, p0, Lcom/umeng/analytics/pro/bn;->c:Z

    if-nez v2, :cond_2

    .line 220
    new-instance v1, Lcom/umeng/analytics/pro/bs;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v2

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Lcom/umeng/analytics/pro/bs;-><init>(Ljava/lang/String;BI)V

    return-object v1

    .line 218
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/bv;

    const-string v2, "Missing version in readMessageBegin, old client?"

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/bv;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public j()Lcom/umeng/analytics/pro/bz;
    .locals 1

    .line 227
    sget-object v0, Lcom/umeng/analytics/pro/bn;->h:Lcom/umeng/analytics/pro/bz;

    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()Lcom/umeng/analytics/pro/bp;
    .locals 4

    .line 233
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->v()S

    move-result v1

    .line 235
    :goto_0
    new-instance v2, Lcom/umeng/analytics/pro/bp;

    const-string v3, ""

    invoke-direct {v2, v3, v0, v1}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    return-object v2
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public n()Lcom/umeng/analytics/pro/br;
    .locals 4

    .line 241
    new-instance v0, Lcom/umeng/analytics/pro/br;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v2

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/br;-><init>(BBI)V

    return-object v0
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()Lcom/umeng/analytics/pro/bq;
    .locals 3

    .line 247
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/bq;-><init>(BI)V

    return-object v0
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public r()Lcom/umeng/analytics/pro/by;
    .locals 3

    .line 253
    new-instance v0, Lcom/umeng/analytics/pro/by;

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v1

    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/by;-><init>(BI)V

    return-object v0
.end method

.method public s()V
    .locals 0

    return-void
.end method

.method public t()Z
    .locals 2

    .line 259
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->u()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public u()B
    .locals 3

    .line 264
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v0

    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v2

    aget-byte v0, v0, v2

    .line 266
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2, v1}, Lcom/umeng/analytics/pro/ci;->a(I)V

    return v0

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->m:[B

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/umeng/analytics/pro/bn;->a([BII)I

    .line 270
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->m:[B

    aget-byte v0, v0, v2

    return v0
.end method

.method public v()S
    .locals 4

    .line 275
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->n:[B

    .line 278
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    .line 279
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v0

    .line 280
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v1

    .line 281
    iget-object v3, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/ci;->a(I)V

    goto :goto_0

    .line 283
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bn;->n:[B

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bn;->a([BII)I

    const/4 v1, 0x0

    .line 286
    :goto_0
    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/lit8 v1, v1, 0x1

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    int-to-short v0, v0

    return v0
.end method

.method public w()I
    .locals 4

    .line 294
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->o:[B

    .line 297
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    .line 298
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v0

    .line 299
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v1

    .line 300
    iget-object v3, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/ci;->a(I)V

    goto :goto_0

    .line 302
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bn;->o:[B

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bn;->a([BII)I

    const/4 v1, 0x0

    .line 304
    :goto_0
    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x2

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method

.method public x()J
    .locals 8

    .line 313
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->p:[B

    .line 316
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    .line 317
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v1

    .line 319
    iget-object v3, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v3, v2}, Lcom/umeng/analytics/pro/ci;->a(I)V

    goto :goto_0

    .line 321
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bn;->p:[B

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bn;->a([BII)I

    const/4 v1, 0x0

    .line 324
    :goto_0
    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    const/16 v5, 0x38

    shl-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    const/16 v7, 0x30

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x2

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    const/16 v7, 0x28

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x3

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x4

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    const/16 v7, 0x18

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x5

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    const/16 v7, 0x10

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    add-int/lit8 v5, v1, 0x6

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    shl-long/2addr v5, v2

    or-long v2, v3, v5

    add-int/lit8 v1, v1, 0x7

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public y()D
    .locals 2

    .line 336
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public z()Ljava/lang/String;
    .locals 5

    .line 340
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->w()I

    move-result v0

    .line 342
    iget-object v1, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v1}, Lcom/umeng/analytics/pro/ci;->h()I

    move-result v1

    if-lt v1, v0, :cond_0

    .line 344
    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2}, Lcom/umeng/analytics/pro/ci;->f()[B

    move-result-object v2

    iget-object v3, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v3}, Lcom/umeng/analytics/pro/ci;->g()I

    move-result v3

    const-string v4, "UTF-8"

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 345
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->g:Lcom/umeng/analytics/pro/ci;

    invoke-virtual {v2, v0}, Lcom/umeng/analytics/pro/ci;->a(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 348
    :catch_0
    new-instance v0, Lcom/umeng/analytics/pro/bb;

    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    throw v0

    .line 352
    :cond_0
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
