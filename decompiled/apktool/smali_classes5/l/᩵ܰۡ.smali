.class public final Ll/᩵ܰۡ;
.super Ljava/io/InputStream;
.source "K4GH"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final synthetic ۫:I


# instance fields
.field public ۗ:I

.field public final ۙ:Ljava/io/InputStream;

.field public ۬:J

.field public final ᩶:Ll/֡ܰۡ;

.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ۛܶܺ;)V
    .locals 11

    .line 49
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    .line 53
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 p1, 0x10

    new-array p1, p1, [B

    .line 21
    iput-object p1, p0, Ll/᩵ܰۡ;->᩸:[B

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Ll/᩵ܰۡ;->ۗ:I

    .line 23
    iput p1, p0, Ll/᩵ܰۡ;->᩹:I

    .line 54
    iput-object v0, p0, Ll/᩵ܰۡ;->ۙ:Ljava/io/InputStream;

    const/16 v3, 0x8

    :try_start_0
    new-array v7, v3, [B

    const/4 v4, 0x2

    new-array v8, v4, [B

    .line 59
    invoke-static {v0, v7, v3}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    .line 60
    invoke-static {p1, v7}, Ll/ܺܰۡ;->ۧ(I[B)J

    move-result-wide v5

    const-wide v9, 0x5952434e452d544dL    # 1.8863762007861363E122

    cmp-long p1, v5, v9

    if-nez p1, :cond_0

    .line 123
    invoke-static {v0, v7, v3}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    invoke-static {v0, v8, v4}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    const-wide/16 v5, 0x8

    sub-long/2addr v1, v5

    int-to-long v5, v3

    sub-long/2addr v1, v5

    int-to-long v3, v4

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xa

    sub-long/2addr v1, v3

    .line 65
    iput-wide v1, p0, Ll/᩵ܰۡ;->۬:J

    .line 66
    new-instance p1, Ll/֡ܰۡ;

    const/4 v5, 0x1

    move-object v4, p1

    move-object v6, p2

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Ll/֡ܰۡ;-><init>(ILjava/lang/String;[B[BLl/ۛܶܺ;)V

    iput-object p1, p0, Ll/᩵ܰۡ;->᩶:Ll/֡ܰۡ;

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Bad magic"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 68
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 69
    throw p1
.end method

.method public constructor <init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/۫ܰۡ;Ljava/lang/String;)V
    .locals 7

    .line 26
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 21
    iput-object v0, p0, Ll/᩵ܰۡ;->᩸:[B

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Ll/᩵ܰۡ;->ۗ:I

    .line 23
    iput v0, p0, Ll/᩵ܰۡ;->᩹:I

    .line 28
    iput-object p3, p0, Ll/᩵ܰۡ;->ۙ:Ljava/io/InputStream;

    .line 29
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->֫()I

    move-result v2

    .line 30
    invoke-static {v2}, Ll/ۖܰۡ;->֫(I)I

    move-result v0

    int-to-long v3, v0

    const-wide/16 v5, 0xc

    add-long/2addr v3, v5

    .line 32
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v5

    cmp-long v1, v5, v3

    if-ltz v1, :cond_0

    .line 36
    new-array v5, v0, [B

    const/4 v1, 0x2

    new-array v6, v1, [B

    .line 123
    invoke-static {p3, v5, v0}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    invoke-static {p3, v6, v1}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    .line 40
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v0

    sub-long/2addr v0, v3

    iput-wide v0, p0, Ll/᩵ܰۡ;->۬:J

    .line 41
    new-instance p3, Ll/֡ܰۡ;

    new-instance v0, Ll/ᩴܰۡ;

    invoke-direct {v0, p2, p1}, Ll/ᩴܰۡ;-><init>(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    move-object v1, p3

    move-object v3, p4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Ll/֡ܰۡ;-><init>(ILjava/lang/String;[B[BLl/ۛܶܺ;)V

    iput-object p3, p0, Ll/᩵ܰۡ;->᩶:Ll/֡ܰۡ;

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid AES compressed size: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " < "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " ("

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܽ()V
    .locals 10

    .line 119
    iget v0, p0, Ll/᩵ܰۡ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 122
    iget-wide v2, p0, Ll/᩵ܰۡ;->۬:J

    const-wide/16 v4, 0x0

    const-string v0, "Reached end of data for this entry, but aes verification failed"

    iget-object v6, p0, Ll/᩵ܰۡ;->ۙ:Ljava/io/InputStream;

    iget-object v7, p0, Ll/᩵ܰۡ;->᩶:Ll/֡ܰۡ;

    const/4 v8, 0x0

    cmp-long v9, v2, v4

    if-nez v9, :cond_2

    .line 123
    iput v1, p0, Ll/᩵ܰۡ;->᩹:I

    .line 124
    invoke-virtual {v7}, Ll/֡ܰۡ;->֫()[B

    move-result-object v1

    const/16 v2, 0xa

    new-array v3, v2, [B

    .line 123
    invoke-static {v6, v3, v2}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    :goto_0
    if-ge v8, v2, :cond_1

    .line 128
    aget-byte v4, v3, v8

    aget-byte v5, v1, v8

    if-ne v4, v5, :cond_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 129
    :cond_0
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void

    :cond_2
    const-wide/16 v4, 0x10

    .line 134
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    iget-object v2, p0, Ll/᩵ܰۡ;->᩸:[B

    invoke-static {v6, v2, v3}, Ll/ۖܰۡ;->֫(Ljava/io/InputStream;[BI)I

    move-result v3

    iput v3, p0, Ll/᩵ܰۡ;->᩹:I

    if-eqz v3, :cond_3

    .line 139
    invoke-virtual {v7, v3, v2}, Ll/֡ܰۡ;->֫(I[B)V

    .line 140
    iput v8, p0, Ll/᩵ܰۡ;->ۗ:I

    .line 141
    iget-wide v0, p0, Ll/᩵ܰۡ;->۬:J

    iget v2, p0, Ll/᩵ܰۡ;->᩹:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩵ܰۡ;->۬:J

    return-void

    .line 136
    :cond_3
    iput v1, p0, Ll/᩵ܰۡ;->᩹:I

    .line 137
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 120
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/᩵ܰۡ;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 3

    .line 108
    iget v0, p0, Ll/᩵ܰۡ;->᩹:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 110
    :cond_0
    iget v2, p0, Ll/᩵ܰۡ;->ۗ:I

    if-lt v2, v0, :cond_1

    .line 111
    invoke-direct {p0}, Ll/᩵ܰۡ;->ܽ()V

    .line 112
    iget v0, p0, Ll/᩵ܰۡ;->᩹:I

    if-ne v0, v1, :cond_1

    return v1

    .line 115
    :cond_1
    iget v0, p0, Ll/᩵ܰۡ;->ۗ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩵ܰۡ;->ۗ:I

    iget-object v1, p0, Ll/᩵ܰۡ;->᩸:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 83
    iget v0, p0, Ll/᩵ܰۡ;->᩹:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 85
    :cond_0
    iget v2, p0, Ll/᩵ܰۡ;->ۗ:I

    if-lt v2, v0, :cond_1

    .line 86
    invoke-direct {p0}, Ll/᩵ܰۡ;->ܽ()V

    .line 87
    iget v0, p0, Ll/᩵ܰۡ;->᩹:I

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    .line 93
    :cond_2
    iget v2, p0, Ll/᩵ܰۡ;->᩹:I

    iget v3, p0, Ll/᩵ܰۡ;->ۗ:I

    sub-int/2addr v2, v3

    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 94
    iget-object v3, p0, Ll/᩵ܰۡ;->᩸:[B

    iget v4, p0, Ll/᩵ܰۡ;->ۗ:I

    invoke-static {v3, v4, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v0, v2

    .line 96
    iget v3, p0, Ll/᩵ܰۡ;->ۗ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩵ܰۡ;->ۗ:I

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    if-nez p3, :cond_3

    goto :goto_0

    .line 101
    :cond_3
    invoke-direct {p0}, Ll/᩵ܰۡ;->ܽ()V

    .line 102
    iget v2, p0, Ll/᩵ܰۡ;->᩹:I

    if-ne v2, v1, :cond_2

    :goto_0
    return v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 150
    iget-wide v0, p0, Ll/᩵ܰۡ;->۬:J

    return-wide v0
.end method
