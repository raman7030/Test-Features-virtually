.class public final Ll/ܺ۬ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final i:[J

.field public static final j:[Ll/ۡ۬ᩴ;

.field public static final k:[Ll/᩺ۙᩴ;

.field public static final l:[Ll/ۜ۬ᩴ;

.field public static final serialVersionUID:J = 0x2a3f985312278703L


# instance fields
.field public final a:[J

.field public final b:[Ll/ᩳ۬ᩴ;

.field public final c:[J

.field public final d:[Ll/᩺ۙᩴ;

.field public final e:[Ll/ᩳ۬ᩴ;

.field public final f:[Ll/ۡ۬ᩴ;

.field public final g:Ljava/util/TimeZone;

.field public final transient h:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [J

    .line 164
    sput-object v1, Ll/ܺ۬ᩴ;->i:[J

    new-array v1, v0, [Ll/ۡ۬ᩴ;

    .line 168
    sput-object v1, Ll/ܺ۬ᩴ;->j:[Ll/ۡ۬ᩴ;

    new-array v1, v0, [Ll/᩺ۙᩴ;

    .line 173
    sput-object v1, Ll/ܺ۬ᩴ;->k:[Ll/᩺ۙᩴ;

    new-array v0, v0, [Ll/ۜ۬ᩴ;

    .line 789
    sput-object v0, Ll/ܺ۬ᩴ;->l:[Ll/ۜ۬ᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;)V
    .locals 3

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ᩳ۬ᩴ;

    .line 332
    iput-object v0, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    .line 333
    invoke-virtual {p1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    invoke-static {v1}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 334
    sget-object v1, Ll/ܺ۬ᩴ;->i:[J

    iput-object v1, p0, Ll/ܺ۬ᩴ;->a:[J

    .line 335
    iput-object v1, p0, Ll/ܺ۬ᩴ;->c:[J

    .line 336
    sget-object v1, Ll/ܺ۬ᩴ;->k:[Ll/᩺ۙᩴ;

    iput-object v1, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    .line 337
    iput-object v0, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    .line 338
    sget-object v0, Ll/ܺ۬ᩴ;->j:[Ll/ۡ۬ᩴ;

    iput-object v0, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    .line 339
    iput-object p1, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    return-void
.end method

.method public constructor <init>(Ll/ᩳ۬ᩴ;)V
    .locals 2

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ᩳ۬ᩴ;

    .line 320
    iput-object v0, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 322
    sget-object p1, Ll/ܺ۬ᩴ;->i:[J

    iput-object p1, p0, Ll/ܺ۬ᩴ;->a:[J

    .line 323
    iput-object p1, p0, Ll/ܺ۬ᩴ;->c:[J

    .line 324
    sget-object p1, Ll/ܺ۬ᩴ;->k:[Ll/᩺ۙᩴ;

    iput-object p1, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    .line 325
    iput-object v0, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    .line 326
    sget-object p1, Ll/ܺ۬ᩴ;->j:[Ll/ۡ۬ᩴ;

    iput-object p1, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    const/4 p1, 0x0

    .line 327
    iput-object p1, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    return-void
.end method

.method public constructor <init>([J[Ll/ᩳ۬ᩴ;[J[Ll/ᩳ۬ᩴ;[Ll/ۡ۬ᩴ;)V
    .locals 5

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    .line 285
    iput-object p1, p0, Ll/ܺ۬ᩴ;->a:[J

    .line 286
    iput-object p2, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    .line 287
    iput-object p3, p0, Ll/ܺ۬ᩴ;->c:[J

    .line 288
    iput-object p4, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    .line 289
    iput-object p5, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    .line 291
    array-length p1, p3

    if-nez p1, :cond_0

    .line 292
    sget-object p1, Ll/ܺ۬ᩴ;->k:[Ll/᩺ۙᩴ;

    iput-object p1, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    goto :goto_2

    .line 295
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    .line 296
    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    .line 297
    aget-object p5, p4, p2

    add-int/lit8 v0, p2, 0x1

    .line 298
    aget-object v1, p4, v0

    .line 299
    new-instance v2, Ll/ۜ۬ᩴ;

    aget-wide v3, p3, p2

    invoke-direct {v2, v3, v4, p5, v1}, Ll/ۜ۬ᩴ;-><init>(JLl/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    .line 300
    invoke-virtual {v2}, Ll/ۜ۬ᩴ;->l()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 280
    iget-object p2, v2, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 301
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    iget-object p2, v2, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 316
    iget-object p5, v2, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget p5, p5, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v1, v2, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr p5, v1

    int-to-long v1, p5

    .line 294
    invoke-virtual {p2, v1, v2}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object p2

    .line 302
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 294
    :cond_1
    iget-object p2, v2, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 316
    iget-object p5, v2, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget p5, p5, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v1, v2, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr p5, v1

    int-to-long v3, p5

    .line 294
    invoke-virtual {p2, v3, v4}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object p2

    .line 304
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    iget-object p2, v2, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 305
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    move p2, v0

    goto :goto_0

    .line 308
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Ll/᩺ۙᩴ;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩺ۙᩴ;

    iput-object p1, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    :goto_2
    const/4 p1, 0x0

    .line 310
    iput-object p1, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    return-void
.end method

.method public static a(Ll/᩺ۙᩴ;Ll/ۜ۬ᩴ;)Ljava/lang/Object;
    .locals 3

    .line 280
    iget-object v0, p1, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 768
    invoke-virtual {p1}, Ll/ۜ۬ᩴ;->l()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 769
    invoke-virtual {p0, v0}, Ll/᩺ۙᩴ;->X(Ll/ܰ᩹ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    iget-object p0, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    return-object p0

    .line 294
    :cond_0
    iget-object v0, p1, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 316
    iget-object v1, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v2, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v2, v2, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    .line 294
    invoke-virtual {v0, v1, v2}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v0

    .line 772
    invoke-virtual {p0, v0}, Ll/᩺ۙᩴ;->X(Ll/ܰ᩹ᩴ;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    .line 316
    :cond_1
    iget-object p0, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    return-object p0

    .line 778
    :cond_2
    invoke-virtual {p0, v0}, Ll/᩺ۙᩴ;->X(Ll/ܰ᩹ᩴ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 316
    iget-object p0, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    return-object p0

    .line 294
    :cond_3
    iget-object v0, p1, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 316
    iget-object v1, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v2, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v2, v2, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    .line 294
    invoke-virtual {v0, v1, v2}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v0

    .line 781
    invoke-virtual {p0, v0}, Ll/᩺ۙᩴ;->X(Ll/ܰ᩹ᩴ;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 305
    iget-object p0, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    return-object p0

    :cond_4
    :goto_0
    return-object p1
.end method

.method public static c(JLl/ᩳ۬ᩴ;)I
    .locals 2

    .line 474
    iget p2, p2, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v0, p2

    add-long/2addr p0, v0

    const p2, 0x15180

    int-to-long v0, p2

    .line 0
    invoke-static {p0, p1, v0, v1}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide p0

    .line 1157
    invoke-static {p0, p1}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    .line 762
    iget p0, p0, Ll/ᩴ᩹ᩴ;->a:I

    return p0
.end method

.method public static h(I)Ll/ᩳ۬ᩴ;
    .locals 0

    .line 344
    div-int/lit16 p0, p0, 0x3e8

    invoke-static {p0}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 354
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 422
    new-instance v0, Ll/᩻۬ᩴ;

    iget-object v1, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    if-eqz v1, :cond_0

    const/16 v1, 0x64

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-direct {v0, v1, p0}, Ll/᩻۬ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final b(I)[Ll/ۜ۬ᩴ;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 798
    sget-object v2, Ll/ܺ۬ᩴ;->l:[Ll/ۜ۬ᩴ;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 799
    iget-object v4, v0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    invoke-interface {v4, v3}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll/ۜ۬ᩴ;

    if-eqz v4, :cond_0

    return-object v4

    .line 804
    :cond_0
    iget-object v4, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    const-wide/16 v6, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_9

    const/16 v4, 0x708

    if-ge v1, v4, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v4, v1, -0x1

    .line 808
    sget-object v10, Ll/᩺ۙᩴ;->c:Ll/᩺ۙᩴ;

    const/16 v10, 0xc

    const/16 v11, 0x1f

    .line 311
    invoke-static {v4, v10, v11}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v4

    .line 296
    sget-object v10, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    int-to-long v11, v8

    invoke-virtual {v10, v11, v12}, Ll/ᩴۗᩴ;->T(J)V

    .line 298
    sget-object v10, Ll/۟ۙᩴ;->h:[Ll/۟ۙᩴ;

    aget-object v10, v10, v8

    .line 313
    new-instance v11, Ll/᩺ۙᩴ;

    invoke-direct {v11, v4, v10}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V

    .line 810
    iget-object v4, v0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    aget-object v4, v4, v8

    .line 0
    invoke-static {v11, v4}, Ll/᩺ۚᩴ;->j(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)J

    move-result-wide v10

    .line 811
    iget-object v4, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    const-wide/16 v12, 0x3e8

    mul-long v14, v10, v12

    invoke-virtual {v4, v14, v15}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v4

    const-wide/32 v14, 0x1e7cb00

    add-long/2addr v14, v10

    :goto_0
    cmp-long v8, v10, v14

    if-gez v8, :cond_7

    const-wide/32 v16, 0x76a700

    add-long v16, v10, v16

    .line 816
    iget-object v8, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    move-wide/from16 v18, v6

    mul-long v5, v16, v12

    invoke-virtual {v8, v5, v6}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v5

    if-eq v4, v5, :cond_6

    move-wide/from16 v6, v18

    :goto_1
    sub-long v18, v16, v10

    cmp-long v5, v18, v6

    if-lez v5, :cond_3

    add-long v5, v16, v10

    const-wide/16 v7, 0x2

    .line 819
    invoke-static {v5, v6, v7, v8}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v5

    .line 820
    iget-object v7, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    move-wide/from16 v19, v10

    mul-long v9, v5, v12

    invoke-virtual {v7, v9, v10}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v7

    if-ne v7, v4, :cond_2

    move-wide v10, v5

    goto :goto_2

    :cond_2
    move-wide/from16 v16, v5

    move-wide/from16 v10, v19

    :goto_2
    const-wide/16 v6, 0x1

    goto :goto_1

    :cond_3
    move-wide/from16 v19, v10

    .line 826
    iget-object v5, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    mul-long v10, v19, v12

    invoke-virtual {v5, v10, v11}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v5

    if-eq v5, v4, :cond_4

    move-wide/from16 v10, v19

    goto :goto_3

    :cond_4
    move-wide/from16 v10, v16

    .line 829
    :goto_3
    invoke-static {v4}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object v4

    .line 830
    iget-object v5, v0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    mul-long v6, v10, v12

    invoke-virtual {v5, v6, v7}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v5

    .line 831
    invoke-static {v5}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object v6

    .line 832
    invoke-static {v10, v11, v6}, Ll/ܺ۬ᩴ;->c(JLl/ᩳ۬ᩴ;)I

    move-result v7

    if-ne v7, v1, :cond_5

    .line 833
    array-length v7, v2

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۜ۬ᩴ;

    .line 834
    array-length v7, v2

    sub-int/2addr v7, v8

    new-instance v8, Ll/ۜ۬ᩴ;

    invoke-direct {v8, v10, v11, v4, v6}, Ll/ۜ۬ᩴ;-><init>(JLl/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    aput-object v8, v2, v7

    :cond_5
    move v4, v5

    goto :goto_4

    :cond_6
    move-wide/from16 v10, v16

    :goto_4
    const-wide/16 v6, 0x1

    goto :goto_0

    :cond_7
    const/16 v4, 0x77c

    if-gt v4, v1, :cond_8

    const/16 v4, 0x834

    if-ge v1, v4, :cond_8

    .line 842
    iget-object v1, v0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    invoke-interface {v1, v3, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-object v2

    .line 846
    :cond_9
    iget-object v2, v0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    .line 847
    array-length v4, v2

    new-array v4, v4, [Ll/ۜ۬ᩴ;

    const/4 v5, 0x0

    .line 848
    :goto_5
    array-length v6, v2

    if-ge v5, v6, :cond_f

    .line 849
    aget-object v6, v2, v5

    .line 489
    iget-byte v7, v6, Ll/ۡ۬ᩴ;->b:B

    const-string v9, "month"

    if-gez v7, :cond_a

    .line 490
    iget-object v7, v6, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    sget-object v8, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    int-to-long v10, v1

    invoke-virtual {v8, v10, v11}, Ll/۠᩶ᩴ;->S(J)Z

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۧۗᩴ;->W(Z)I

    move-result v8

    const/4 v12, 0x1

    add-int/2addr v8, v12

    iget-byte v12, v6, Ll/ۡ۬ᩴ;->b:B

    add-int/2addr v8, v12

    sget-object v12, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 248
    sget-object v12, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v12, v10, v11}, Ll/ᩴۗᩴ;->T(J)V

    .line 249
    invoke-static {v7, v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 250
    sget-object v9, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    int-to-long v10, v8

    invoke-virtual {v9, v10, v11}, Ll/ᩴۗᩴ;->T(J)V

    .line 251
    invoke-virtual {v7}, Ll/ۧۗᩴ;->getValue()I

    move-result v7

    invoke-static {v1, v7, v8}, Ll/ᩴ᩹ᩴ;->W(III)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    .line 491
    iget-object v8, v6, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    if-eqz v8, :cond_b

    .line 467
    invoke-virtual {v8}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v8

    .line 468
    new-instance v9, Ll/۬ۗᩴ;

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10}, Ll/۬ۗᩴ;-><init>(II)V

    .line 492
    invoke-virtual {v7, v9}, Ll/ᩴ᩹ᩴ;->r0(Ll/ۗۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    goto :goto_6

    .line 495
    :cond_a
    iget-object v10, v6, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    sget-object v11, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 248
    sget-object v11, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v12, v1

    invoke-virtual {v11, v12, v13}, Ll/ᩴۗᩴ;->T(J)V

    .line 249
    invoke-static {v10, v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 250
    sget-object v9, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    int-to-long v11, v7

    invoke-virtual {v9, v11, v12}, Ll/ᩴۗᩴ;->T(J)V

    .line 251
    invoke-virtual {v10}, Ll/ۧۗᩴ;->getValue()I

    move-result v9

    invoke-static {v1, v9, v7}, Ll/ᩴ᩹ᩴ;->W(III)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    .line 496
    iget-object v9, v6, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    if-eqz v9, :cond_b

    .line 413
    invoke-virtual {v9}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v9

    .line 414
    new-instance v10, Ll/۬ۗᩴ;

    invoke-direct {v10, v9, v8}, Ll/۬ۗᩴ;-><init>(II)V

    .line 497
    invoke-virtual {v7, v10}, Ll/ᩴ᩹ᩴ;->r0(Ll/ۗۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    .line 500
    :cond_b
    :goto_6
    iget-boolean v8, v6, Ll/ۡ۬ᩴ;->e:Z

    if-eqz v8, :cond_c

    const-wide/16 v8, 0x1

    .line 501
    invoke-virtual {v7, v8, v9}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    .line 503
    :cond_c
    iget-object v8, v6, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    invoke-static {v7, v8}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v7

    .line 504
    iget-object v8, v6, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    iget-object v9, v6, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    iget-object v10, v6, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    sget-object v11, Ll/᩷۬ᩴ;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v11, v8

    const/4 v11, 0x1

    if-eq v8, v11, :cond_e

    const/4 v12, 0x2

    if-eq v8, v12, :cond_d

    goto :goto_7

    .line 474
    :cond_d
    iget v8, v10, Ll/ᩳ۬ᩴ;->b:I

    iget v9, v9, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v8, v9

    int-to-long v8, v8

    .line 624
    invoke-virtual {v7, v8, v9}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v7

    goto :goto_7

    .line 474
    :cond_e
    iget v8, v10, Ll/ᩳ۬ᩴ;->b:I

    .line 619
    sget-object v9, Ll/ᩳ۬ᩴ;->f:Ll/ᩳ۬ᩴ;

    .line 474
    iget v9, v9, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v8, v9

    int-to-long v8, v8

    .line 620
    invoke-virtual {v7, v8, v9}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v7

    .line 505
    :goto_7
    new-instance v8, Ll/ۜ۬ᩴ;

    iget-object v9, v6, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    iget-object v6, v6, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    invoke-direct {v8, v7, v9, v6}, Ll/ۜ۬ᩴ;-><init>(Ll/᩺ۙᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    .line 849
    aput-object v8, v4, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v8, 0x0

    goto/16 :goto_5

    :cond_f
    const/16 v5, 0x834

    if-ge v1, v5, :cond_10

    .line 852
    iget-object v1, v0, Ll/ܺ۬ᩴ;->h:Ll/ۧۤᩴ;

    invoke-interface {v1, v3, v4}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    return-object v4
.end method

.method public final d(Ll/ۘ᩹ᩴ;)Ll/ᩳ۬ᩴ;
    .locals 7

    .line 531
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    if-eqz v0, :cond_0

    .line 532
    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    invoke-static {p1}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    return-object p1

    .line 534
    :cond_0
    iget-object v0, p0, Ll/ܺ۬ᩴ;->c:[J

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 535
    iget-object p1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    aget-object p1, p1, v1

    return-object p1

    .line 537
    :cond_1
    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v2

    .line 539
    iget-object p1, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    array-length p1, p1

    if-lez p1, :cond_4

    iget-object p1, p0, Ll/ܺ۬ᩴ;->c:[J

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, p1, v0

    cmp-long p1, v2, v4

    if-lez p1, :cond_4

    .line 541
    iget-object p1, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-static {v2, v3, p1}, Ll/ܺ۬ᩴ;->c(JLl/ᩳ۬ᩴ;)I

    move-result p1

    .line 542
    invoke-virtual {p0, p1}, Ll/ܺ۬ᩴ;->b(I)[Ll/ۜ۬ᩴ;

    move-result-object p1

    const/4 v0, 0x0

    .line 544
    :goto_0
    array-length v4, p1

    if-ge v1, v4, :cond_3

    .line 545
    aget-object v0, p1, v1

    .line 263
    iget-wide v4, v0, Ll/ۜ۬ᩴ;->a:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    .line 305
    iget-object p1, v0, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    return-object p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 316
    :cond_3
    iget-object p1, v0, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    return-object p1

    .line 554
    :cond_4
    iget-object p1, p0, Ll/ܺ۬ᩴ;->c:[J

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result p1

    if-gez p1, :cond_5

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    .line 559
    :cond_5
    iget-object v0, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e(Ll/᩺ۙᩴ;)Ljava/lang/Object;
    .locals 8

    .line 690
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 750
    iget-object v0, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v0, v0, Ll/ᩴ᩹ᩴ;->a:I

    .line 691
    invoke-virtual {p0, v0}, Ll/ܺ۬ᩴ;->b(I)[Ll/ۜ۬ᩴ;

    move-result-object v0

    .line 692
    array-length v3, v0

    if-nez v3, :cond_0

    .line 696
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    iget-object v1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    aget-object v1, v1, v2

    .line 0
    invoke-static {p1, v1}, Ll/᩺ۚᩴ;->j(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    .line 697
    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    .line 696
    invoke-static {p1}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    return-object p1

    .line 701
    :cond_0
    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_3

    aget-object v1, v0, v2

    .line 702
    invoke-static {p1, v1}, Ll/ܺ۬ᩴ;->a(Ll/᩺ۙᩴ;Ll/ۜ۬ᩴ;)Ljava/lang/Object;

    move-result-object v4

    .line 703
    instance-of v5, v4, Ll/ۜ۬ᩴ;

    if-nez v5, :cond_2

    .line 305
    iget-object v1, v1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 703
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    return-object v1

    .line 709
    :cond_4
    iget-object v0, p0, Ll/ܺ۬ᩴ;->c:[J

    array-length v0, v0

    if-nez v0, :cond_5

    .line 710
    iget-object p1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    aget-object p1, p1, v2

    return-object p1

    .line 713
    :cond_5
    iget-object v0, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    array-length v0, v0

    if-lez v0, :cond_b

    iget-object v0, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    aget-object v0, v0, v3

    if-eqz v0, :cond_6

    .line 714
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1858
    invoke-virtual {p1, v0}, Ll/᩺ۙᩴ;->V(Ll/᩺ۙᩴ;)I

    move-result v0

    if-lez v0, :cond_b

    goto :goto_2

    .line 736
    :cond_6
    iget-object v3, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 532
    invoke-virtual {v3}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v3

    .line 736
    iget-object v5, v0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 533
    invoke-virtual {v5}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-gtz v7, :cond_7

    if-nez v7, :cond_b

    .line 832
    iget-object v3, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 535
    invoke-virtual {v3}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v3

    .line 832
    iget-object v0, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 535
    invoke-virtual {v0}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_b

    .line 750
    :cond_7
    :goto_2
    iget-object v0, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v0, v0, Ll/ᩴ᩹ᩴ;->a:I

    .line 715
    invoke-virtual {p0, v0}, Ll/ܺ۬ᩴ;->b(I)[Ll/ۜ۬ᩴ;

    move-result-object v0

    .line 717
    array-length v3, v0

    :goto_3
    if-ge v2, v3, :cond_a

    aget-object v1, v0, v2

    .line 718
    invoke-static {p1, v1}, Ll/ܺ۬ᩴ;->a(Ll/᩺ۙᩴ;Ll/ۜ۬ᩴ;)Ljava/lang/Object;

    move-result-object v4

    .line 719
    instance-of v5, v4, Ll/ۜ۬ᩴ;

    if-nez v5, :cond_9

    .line 305
    iget-object v1, v1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 719
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto :goto_3

    :cond_9
    :goto_4
    return-object v4

    :cond_a
    return-object v1

    .line 727
    :cond_b
    iget-object v0, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_c

    .line 730
    iget-object p1, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    aget-object p1, p1, v2

    return-object p1

    :cond_c
    if-gez p1, :cond_d

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    goto :goto_5

    .line 735
    :cond_d
    iget-object v0, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge p1, v1, :cond_e

    aget-object v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    aget-object v0, v0, v2

    .line 736
    invoke-virtual {v1, v0}, Ll/᩺ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    move p1, v2

    :cond_e
    :goto_5
    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_10

    .line 742
    iget-object v0, p0, Ll/ܺ۬ᩴ;->d:[Ll/᩺ۙᩴ;

    aget-object v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 743
    aget-object v0, v0, v2

    .line 744
    iget-object v2, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    div-int/lit8 p1, p1, 0x2

    aget-object v3, v2, p1

    add-int/lit8 p1, p1, 0x1

    .line 745
    aget-object p1, v2, p1

    .line 474
    iget v2, p1, Ll/ᩳ۬ᩴ;->b:I

    iget v4, v3, Ll/ᩳ۬ᩴ;->b:I

    if-le v2, v4, :cond_f

    .line 748
    new-instance v0, Ll/ۜ۬ᩴ;

    invoke-direct {v0, v1, v3, p1}, Ll/ۜ۬ᩴ;-><init>(Ll/᩺ۙᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v0

    .line 751
    :cond_f
    new-instance v1, Ll/ۜ۬ᩴ;

    invoke-direct {v1, v0, v3, p1}, Ll/ۜ۬ᩴ;-><init>(Ll/᩺ۙᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v1

    .line 755
    :cond_10
    iget-object v0, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1222
    :cond_0
    instance-of v1, p1, Ll/ܺ۬ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1223
    check-cast p1, Ll/ܺ۬ᩴ;

    .line 1226
    iget-object v1, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    iget-object v3, p1, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->a:[J

    iget-object v3, p1, Ll/ܺ۬ᩴ;->a:[J

    .line 1227
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    iget-object v3, p1, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    .line 1228
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->c:[J

    iget-object v3, p1, Ll/ܺ۬ᩴ;->c:[J

    .line 1229
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    iget-object v3, p1, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    .line 1230
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    iget-object p1, p1, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    .line 1231
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Ll/᩺ۙᩴ;)Ljava/util/List;
    .locals 3

    .line 642
    invoke-virtual {p0, p1}, Ll/ܺ۬ᩴ;->e(Ll/᩺ۙᩴ;)Ljava/lang/Object;

    move-result-object p1

    .line 643
    instance-of v0, p1, Ll/ۜ۬ᩴ;

    if-eqz v0, :cond_1

    .line 644
    check-cast p1, Ll/ۜ۬ᩴ;

    .line 389
    invoke-virtual {p1}, Ll/ۜ۬ᩴ;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 390
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 305
    :cond_0
    iget-object v0, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 316
    iget-object p1, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    .line 0
    invoke-static {v1}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 646
    :cond_1
    check-cast p1, Ll/ᩳ۬ᩴ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ll/ۘ᩹ᩴ;)Z
    .locals 3

    .line 872
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    if-eqz v0, :cond_0

    .line 873
    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    invoke-static {v0}, Ll/ܺ۬ᩴ;->h(I)Ll/ᩳ۬ᩴ;

    move-result-object v0

    goto :goto_0

    .line 875
    :cond_0
    iget-object v0, p0, Ll/ܺ۬ᩴ;->c:[J

    array-length v0, v0

    if-nez v0, :cond_1

    .line 876
    iget-object v0, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    .line 878
    :cond_1
    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v0

    .line 879
    iget-object v2, p0, Ll/ܺ۬ᩴ;->a:[J

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v0

    if-gez v0, :cond_2

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x2

    .line 884
    :cond_2
    iget-object v1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    .line 934
    :goto_0
    invoke-virtual {p0, p1}, Ll/ܺ۬ᩴ;->d(Ll/ۘ᩹ᩴ;)Ll/ᩳ۬ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1245
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Ll/ܺ۬ᩴ;->a:[J

    .line 1246
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    .line 1247
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->c:[J

    .line 1248
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->e:[Ll/ᩳ۬ᩴ;

    .line 1249
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ܺ۬ᩴ;->f:[Ll/ۡ۬ᩴ;

    .line 1250
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1261
    iget-object v0, p0, Ll/ܺ۬ᩴ;->g:Ljava/util/TimeZone;

    const-string v1, "]"

    if-eqz v0, :cond_0

    .line 1262
    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ZoneRules[timeZone="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1264
    :cond_0
    iget-object v0, p0, Ll/ܺ۬ᩴ;->b:[Ll/ᩳ۬ᩴ;

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ZoneRules[currentStandardOffset="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
