.class public abstract Ll/ۧᩳܳ;
.super Ljava/lang/Object;
.source "970R"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1049
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(I[I)Ll/ۧᩳܳ;
    .locals 13

    if-lez p0, :cond_9

    .line 1088
    array-length v0, p1

    if-gt p0, v0, :cond_9

    const/4 v0, 0x0

    .line 1091
    aget v0, p1, v0

    const-wide/16 v1, 0x1

    const/4 v3, 0x1

    if-ne p0, v3, :cond_0

    move-wide v3, v1

    goto :goto_0

    .line 1092
    :cond_0
    aget v3, p1, v3

    int-to-long v3, v3

    int-to-long v5, v0

    sub-long/2addr v3, v5

    :goto_0
    const-wide/16 v5, 0x0

    const-wide/32 v7, 0x7fffffff

    cmp-long v9, v3, v5

    if-lez v9, :cond_1

    cmp-long v5, v3, v7

    if-gtz v5, :cond_1

    long-to-int v4, v3

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    :goto_1
    if-lez v4, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    const/4 v5, 0x1

    :goto_3
    if-ge v5, p0, :cond_5

    .line 1097
    aget v6, p1, v5

    if-le v6, v0, :cond_4

    int-to-long v9, v6

    int-to-long v11, v0

    sub-long/2addr v9, v11

    int-to-long v11, v4

    cmp-long v0, v9, v11

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    :goto_4
    and-int/2addr v3, v0

    add-int/lit8 v5, v5, 0x1

    move v0, v6

    goto :goto_3

    .line 1099
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Start index must be strictly sorted"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    const/4 v0, 0x0

    if-eqz v3, :cond_6

    const/4 v3, 0x3

    if-lt p0, v3, :cond_6

    .line 1105
    aget p1, p1, v0

    invoke-static {p1, v4, p0}, Ll/ۧᩳܳ;->֫(III)Ll/ܽᩳܳ;

    move-result-object p0

    return-object p0

    :cond_6
    add-int/lit8 v3, p0, -0x1

    .line 1107
    aget v3, p1, v3

    int-to-long v3, v3

    aget v5, p1, v0

    int-to-long v5, v5

    sub-long/2addr v3, v5

    add-long v5, v3, v1

    const-wide/16 v9, 0x40

    add-long/2addr v3, v9

    const/4 v9, 0x6

    ushr-long/2addr v3, v9

    const-wide/16 v9, 0x8

    mul-long v9, v9, v3

    const/16 v11, 0x40

    if-le p0, v11, :cond_8

    cmp-long v11, v5, v7

    if-gtz v11, :cond_8

    int-to-long v5, p0

    const-wide/16 v7, 0x4

    mul-long v5, v5, v7

    cmp-long v7, v9, v5

    if-gez v7, :cond_8

    long-to-int v4, v3

    .line 1111
    new-array v3, v4, [J

    const/4 v4, 0x0

    :goto_5
    if-ge v4, p0, :cond_7

    .line 1113
    aget v5, p1, v4

    aget v6, p1, v0

    sub-int/2addr v5, v6

    ushr-int/lit8 v6, v5, 0x6

    .line 1114
    aget-wide v7, v3, v6

    and-int/lit8 v5, v5, 0x3f

    shl-long v9, v1, v5

    or-long/2addr v7, v9

    aput-wide v7, v3, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 1116
    :cond_7
    new-instance v1, Ll/۠ܽܳ;

    aget p1, p1, v0

    invoke-direct {v1, p1, p0, v3}, Ll/۠ܽܳ;-><init>(II[J)V

    return-object v1

    .line 1118
    :cond_8
    new-instance v0, Ll/ܰܽܳ;

    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܰܽܳ;-><init>([I)V

    return-object v0

    .line 1089
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Empty start index"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/DataInput;ILl/ܿۧܳ;)Ll/ۧᩳܳ;
    .locals 13

    const-string v0, "Unknown start index tag "

    .line 1204
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v1

    const-wide/16 v2, 0x30

    const/high16 v4, 0x10000

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v1, v6, :cond_5

    .line 1207
    :try_start_0
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    if-lez v0, :cond_4

    if-gt v0, v4, :cond_4

    int-to-long v6, v0

    const-wide/16 v8, 0x4

    mul-long v6, v6, v8

    add-long/2addr v6, v2

    .line 1211
    invoke-virtual {p2, v6, v7}, Ll/ܿۧܳ;->֫(J)V

    .line 1212
    new-array p2, v0, [I

    const/high16 v1, -0x80000000

    :goto_0
    if-ge v5, v0, :cond_3

    .line 1215
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v2

    int-to-long v3, p1

    int-to-long v6, v2

    add-long/2addr v3, v6

    long-to-int v2, v3

    int-to-long v6, v2

    cmp-long v8, v3, v6

    if-nez v8, :cond_2

    if-eqz v5, :cond_1

    if-le v2, v1, :cond_0

    goto :goto_1

    :cond_0
    const-string p0, "Sparse starts are not sorted"

    .line 1217
    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 1219
    :cond_1
    :goto_1
    aput v2, p2, v5

    add-int/lit8 v5, v5, 0x1

    move v1, v2

    goto :goto_0

    .line 0
    :cond_2
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    .line 1222
    :cond_3
    new-instance p0, Ll/ܰܽܳ;

    invoke-direct {p0, p2}, Ll/ܰܽܳ;-><init>([I)V

    return-object p0

    :cond_4
    const-string p0, "Invalid sparse start count"

    .line 1209
    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :cond_5
    const/4 v7, 0x2

    if-ne v1, v7, :cond_a

    .line 1225
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    int-to-long v1, p1

    int-to-long v7, v0

    add-long/2addr v1, v7

    long-to-int p1, v1

    int-to-long v7, p1

    cmp-long v0, v1, v7

    if-nez v0, :cond_9

    .line 1226
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    .line 1227
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-lez v0, :cond_8

    const/16 v2, 0x800

    if-gt v0, v2, :cond_8

    if-lez v1, :cond_8

    if-gt v1, v4, :cond_8

    int-to-long v2, v0

    const-wide/16 v9, 0x8

    mul-long v9, v9, v2

    const-wide/16 v11, 0x40

    add-long/2addr v9, v11

    .line 1232
    invoke-virtual {p2, v9, v10}, Ll/ܿۧܳ;->֫(J)V

    .line 1233
    new-array p2, v0, [J

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_2
    if-ge v4, v0, :cond_6

    .line 1236
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    move-result-wide v10

    aput-wide v10, p2, v4

    .line 1237
    invoke-static {v10, v11}, Ljava/lang/Long;->bitCount(J)I

    move-result v10

    add-int/2addr v9, v10

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    if-ne v9, v1, :cond_7

    .line 1239
    aget-wide v4, p2, v5

    const-wide/16 v9, 0x0

    cmp-long p0, v4, v9

    if-eqz p0, :cond_7

    sub-int/2addr v0, v6

    aget-wide v4, p2, v0

    cmp-long p0, v4, v9

    if-eqz p0, :cond_7

    const/4 p0, 0x6

    shl-long/2addr v2, p0

    add-long/2addr v7, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v7, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long p0, v7, v2

    if-gtz p0, :cond_7

    .line 1244
    new-instance p0, Ll/۠ܽܳ;

    invoke-direct {p0, p1, v1, p2}, Ll/۠ܽܳ;-><init>(II[J)V

    return-object p0

    :cond_7
    const-string p0, "Non-canonical bitmap start index"

    .line 1242
    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :cond_8
    const-string p0, "Invalid bitmap start index"

    .line 1230
    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 0
    :cond_9
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    :cond_a
    const/4 v4, 0x3

    if-ne v1, v4, :cond_c

    .line 1247
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    int-to-long v4, p1

    int-to-long v0, v0

    add-long/2addr v4, v0

    long-to-int p1, v4

    int-to-long v0, p1

    cmp-long v6, v4, v0

    if-nez v6, :cond_b

    .line 1248
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    .line 1249
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 1250
    invoke-virtual {p2, v2, v3}, Ll/ܿۧܳ;->֫(J)V

    .line 1251
    invoke-static {p1, v0, p0}, Ll/ۧᩳܳ;->֫(III)Ll/ܽᩳܳ;

    move-result-object p0

    return-object p0

    .line 0
    :cond_b
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    .line 1253
    :cond_c
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string p0, "Invalid start index payload"

    .line 1255
    invoke-static {p0}, Ll/ܿᩳܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(III)Ll/ܽᩳܳ;
    .locals 6

    if-lez p2, :cond_0

    if-lez p1, :cond_0

    int-to-long v0, p0

    int-to-long v2, p1

    add-int/lit8 v4, p2, -0x1

    int-to-long v4, v4

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    const-wide/32 v0, 0x7fffffff

    cmp-long v4, v2, v0

    if-gtz v4, :cond_0

    .line 1127
    new-instance v0, Ll/ܽᩳܳ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܽᩳܳ;-><init>(III)V

    return-object v0

    .line 1125
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid stride index"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract ֫(II)I
.end method

.method public abstract ֫()J
.end method

.method public final ֫(IIILl/᩸ܽܳ;)V
    .locals 4

    int-to-long v0, p1

    int-to-long v2, p3

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/32 v2, -0x80000000

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    const/high16 p1, -0x80000000

    goto :goto_0

    :cond_0
    long-to-int p1, v0

    .line 1140
    :goto_0
    invoke-virtual {p0, p1, p2, p4}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    return-void
.end method

.method public abstract ֫(IILl/᩸ܽܳ;)V
.end method

.method public abstract ֫(Ljava/io/DataOutputStream;I)V
.end method

.method public ֫([BIIBI)V
    .locals 1

    .line 1067
    new-instance v0, Ll/֫ᩳܳ;

    invoke-direct {v0, p1, p5, p2, p4}, Ll/֫ᩳܳ;-><init>([BIIB)V

    invoke-virtual {p0, p2, p3, v0}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    return-void
.end method

.method public abstract ֫(I)Z
.end method

.method public abstract ֫(Ll/ۧᩳܳ;)Z
.end method

.method public abstract ۧ(I)I
.end method

.method public abstract ۧ()J
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܽ(I)I
.end method
