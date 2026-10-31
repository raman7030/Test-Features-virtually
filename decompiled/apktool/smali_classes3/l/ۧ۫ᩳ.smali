.class public final Ll/ۧ۫ᩳ;
.super Ljava/lang/Object;
.source "Z6UH"


# instance fields
.field public ֫:[B

.field public ۧ:[C

.field public ܳ:[I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(IIIZ)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput p2, p0, Ll/ۧ۫ᩳ;->ܿ:I

    .line 64
    iput p3, p0, Ll/ۧ۫ᩳ;->᩻:I

    .line 65
    iput p2, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    .line 66
    iput p1, p0, Ll/ۧ۫ᩳ;->ܽ:I

    if-eqz p4, :cond_0

    .line 67
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۧ۫ᩳ;->֫:[B

    goto :goto_0

    .line 68
    :cond_0
    new-array p1, p1, [C

    iput-object p1, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    .line 69
    :goto_0
    new-array p1, p3, [I

    iput-object p1, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    return-void
.end method

.method public constructor <init>(I[CIIIZ)V
    .locals 5

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-array v0, p5, [I

    iput-object v0, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    const/16 v0, 0xa

    const/4 v1, 0x0

    if-eqz p6, :cond_2

    .line 40
    new-array p6, p1, [B

    iput-object p6, p0, Ll/ۧ۫ᩳ;->֫:[B

    const/4 p6, 0x0

    :goto_0
    if-ge v1, p4, :cond_4

    add-int v2, p3, v1

    .line 42
    aget-char v2, p2, v2

    const/16 v3, 0xff

    if-gt v2, v3, :cond_1

    .line 44
    iget-object v3, p0, Ll/ۧ۫ᩳ;->֫:[B

    int-to-byte v4, v2

    aput-byte v4, v3, v1

    if-ne v2, v0, :cond_0

    .line 45
    iget-object v2, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    add-int/lit8 v3, p6, 0x1

    aput v1, v2, p6

    move p6, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid page character representation"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_2
    new-array p6, p1, [C

    iput-object p6, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    .line 49
    invoke-static {p2, p3, p6, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p6, 0x0

    :goto_1
    if-ge v1, p4, :cond_4

    add-int v2, p3, v1

    .line 51
    aget-char v2, p2, v2

    if-ne v2, v0, :cond_3

    iget-object v2, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    add-int/lit8 v3, p6, 0x1

    aput v1, v2, p6

    move p6, v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-ne p6, p5, :cond_5

    .line 55
    iput p4, p0, Ll/ۧ۫ᩳ;->ܿ:I

    .line 56
    iput p5, p0, Ll/ۧ۫ᩳ;->᩻:I

    .line 57
    iput p4, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    .line 58
    iput p1, p0, Ll/ۧ۫ᩳ;->ܽ:I

    return-void

    .line 54
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid page newline count"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IIZ)J
    .locals 8

    int-to-long v0, p0

    if-eqz p2, :cond_0

    const-wide/16 v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x2

    :goto_0
    mul-long v0, v0, v2

    const-wide/16 v2, 0x17

    add-long/2addr v0, v2

    const-wide/16 v4, -0x8

    and-long/2addr v0, v4

    const-wide/16 v6, 0x40

    add-long/2addr v0, v6

    int-to-long p0, p1

    const-wide/16 v6, 0x4

    mul-long p0, p0, v6

    add-long/2addr p0, v2

    and-long/2addr p0, v4

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private ۧ(ZI[BII)V
    .locals 2

    if-nez p4, :cond_0

    goto :goto_3

    :cond_0
    add-int v0, p2, p4

    if-eqz p1, :cond_2

    .line 111
    iget-object p1, p0, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz p1, :cond_1

    .line 112
    invoke-static {p1, p2, p3, p5, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1
    :goto_0
    if-ge p2, v0, :cond_4

    add-int/lit8 p1, p5, 0x1

    .line 114
    iget-object p4, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    aget-char p4, p4, p2

    int-to-byte p4, p4

    aput-byte p4, p3, p5

    add-int/lit8 p2, p2, 0x1

    move p5, p1

    goto :goto_0

    .line 116
    :cond_2
    iget-object p1, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    if-eqz p1, :cond_3

    :goto_1
    if-ge p2, v0, :cond_4

    .line 118
    iget-object p1, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    aget-char p1, p1, p2

    add-int/lit8 p4, p5, 0x1

    int-to-byte v1, p1

    .line 119
    aput-byte v1, p3, p5

    add-int/lit8 p5, p5, 0x2

    ushr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    .line 120
    aput-byte p1, p3, p4

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ge p2, v0, :cond_4

    add-int/lit8 p1, p5, 0x1

    .line 124
    iget-object p4, p0, Ll/ۧ۫ᩳ;->֫:[B

    aget-byte p4, p4, p2

    aput-byte p4, p3, p5

    add-int/lit8 p5, p5, 0x2

    const/4 p4, 0x0

    .line 125
    aput-byte p4, p3, p1

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method private ܽ(II[CI)V
    .locals 4

    .line 181
    iget-object v0, p0, Ll/ۧ۫ᩳ;->֫:[B

    if-nez v0, :cond_0

    .line 182
    iget-object v0, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    invoke-static {v0, p1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    add-int v1, p4, v0

    .line 184
    iget-object v2, p0, Ll/ۧ۫ᩳ;->֫:[B

    add-int v3, p1, v0

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    aput-char v2, p3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(I)C
    .locals 2

    .line 167
    iget v0, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/ۧ۫ᩳ;->ܽ:I

    add-int/2addr p1, v1

    sub-int/2addr p1, v0

    .line 168
    :goto_0
    iget-object v0, p0, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz v0, :cond_1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    return p1

    :cond_1
    iget-object v0, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final ֫([BIIII)I
    .locals 4

    add-int v0, p2, p3

    .line 75
    iget-object v1, p0, Ll/ۧ۫ᩳ;->֫:[B

    const-string v2, "Invalid page newline count"

    const/16 v3, 0xa

    if-eqz v1, :cond_3

    .line 76
    invoke-static {p1, p2, v1, p4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    if-ge p2, v0, :cond_2

    .line 78
    aget-byte p3, p1, p2

    if-ne p3, v3, :cond_1

    .line 79
    iget p3, p0, Ll/ۧ۫ᩳ;->᩻:I

    if-ge p5, p3, :cond_0

    .line 80
    iget-object p3, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    add-int/lit8 v1, p5, 0x1

    aput p4, p3, p5

    move p5, v1

    goto :goto_1

    .line 79
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    return p5

    :cond_3
    :goto_2
    if-ge p2, v0, :cond_6

    add-int/lit8 p3, p2, 0x1

    .line 85
    aget-byte v1, p1, p2

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 p2, p2, 0x2

    aget-byte p3, p1, p3

    and-int/lit16 p3, p3, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p3, v1

    int-to-char p3, p3

    .line 86
    iget-object v1, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    aput-char p3, v1, p4

    if-ne p3, v3, :cond_5

    .line 88
    iget p3, p0, Ll/ۧ۫ᩳ;->᩻:I

    if-ge p5, p3, :cond_4

    .line 89
    iget-object p3, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    add-int/lit8 v1, p5, 0x1

    aput p4, p3, p5

    move p5, v1

    goto :goto_3

    .line 88
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_6
    return p5
.end method

.method public final ֫()J
    .locals 3

    .line 140
    invoke-virtual {p0}, Ll/ۧ۫ᩳ;->ۧ()I

    move-result v0

    iget v1, p0, Ll/ۧ۫ᩳ;->᩻:I

    invoke-virtual {p0}, Ll/ۧ۫ᩳ;->ܽ()Z

    move-result v2

    invoke-static {v0, v1, v2}, Ll/ۧ۫ᩳ;->֫(IIZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(II[CI)V
    .locals 2

    .line 172
    iget v0, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 173
    invoke-direct {p0, p1, v0, p3, p4}, Ll/ۧ۫ᩳ;->ܽ(II[CI)V

    .line 174
    iget v1, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int/2addr p2, p1

    if-lez p2, :cond_0

    .line 176
    iget v1, p0, Ll/ۧ۫ᩳ;->ܽ:I

    add-int/2addr p1, v1

    iget v1, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    sub-int/2addr p1, v1

    add-int/2addr p4, v0

    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۧ۫ᩳ;->ܽ(II[CI)V

    :cond_0
    return-void
.end method

.method public final ֫(ZI[BII)V
    .locals 9

    .line 98
    iget v0, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, v0

    move v7, p5

    .line 99
    invoke-direct/range {v2 .. v7}, Ll/ۧ۫ᩳ;->ۧ(ZI[BII)V

    .line 100
    iget v1, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-le p4, p2, :cond_1

    .line 102
    iget v1, p0, Ll/ۧ۫ᩳ;->ܽ:I

    add-int/2addr v1, p2

    iget v2, p0, Ll/ۧ۫ᩳ;->ᩳ:I

    sub-int v5, v1, v2

    sub-int v7, p4, p2

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    mul-int v0, v0, p2

    add-int v8, v0, p5

    move-object v3, p0

    move v4, p1

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Ll/ۧ۫ᩳ;->ۧ(ZI[BII)V

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/ۧ۫ᩳ;->ۧ:[C

    array-length v0, v0

    return v0
.end method

.method public final ۧ(I)I
    .locals 4

    .line 242
    iget v0, p0, Ll/ۧ۫ᩳ;->᩻:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    .line 245
    iget-object v3, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    aget v3, v3, v2

    if-ge v3, p1, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final ۧ(II[CI)Ll/ۧ۫ᩳ;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    .line 191
    iget-object v5, v0, Ll/ۧ۫ᩳ;->֫:[B

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 193
    aget-char v7, v3, v5

    const/16 v8, 0xff

    if-le v7, v8, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 199
    :goto_1
    new-instance v7, Ll/ۧ۫ᩳ;

    .line 143
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 144
    iget v8, v0, Ll/ۧ۫ᩳ;->ܿ:I

    iput v8, v7, Ll/ۧ۫ᩳ;->ܿ:I

    .line 145
    iget v8, v0, Ll/ۧ۫ᩳ;->ᩳ:I

    iput v8, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    .line 146
    iget v8, v0, Ll/ۧ۫ᩳ;->ܽ:I

    iput v8, v7, Ll/ۧ۫ᩳ;->ܽ:I

    if-nez v5, :cond_3

    .line 147
    iget-object v5, v0, Ll/ۧ۫ᩳ;->ۧ:[C

    if-eqz v5, :cond_2

    goto :goto_2

    .line 152
    :cond_2
    iget-object v5, v0, Ll/ۧ۫ᩳ;->֫:[B

    invoke-virtual {v5}, [B->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    iput-object v5, v7, Ll/ۧ۫ᩳ;->֫:[B

    goto :goto_3

    .line 148
    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ll/ۧ۫ᩳ;->ۧ()I

    move-result v5

    new-array v5, v5, [C

    iput-object v5, v7, Ll/ۧ۫ᩳ;->ۧ:[C

    .line 149
    iget v8, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    invoke-virtual {v0, v6, v8, v5, v6}, Ll/ۧ۫ᩳ;->֫(II[CI)V

    .line 150
    iget v5, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    iget v8, v7, Ll/ۧ۫ᩳ;->ܿ:I

    iget-object v9, v7, Ll/ۧ۫ᩳ;->ۧ:[C

    iget v10, v7, Ll/ۧ۫ᩳ;->ܽ:I

    invoke-virtual {v0, v5, v8, v9, v10}, Ll/ۧ۫ᩳ;->֫(II[CI)V

    .line 154
    :goto_3
    iget v5, v0, Ll/ۧ۫ᩳ;->᩻:I

    iput v5, v7, Ll/ۧ۫ᩳ;->᩻:I

    .line 155
    iget-object v5, v0, Ll/ۧ۫ᩳ;->ܳ:[I

    iput-object v5, v7, Ll/ۧ۫ᩳ;->ܳ:[I

    .line 200
    invoke-virtual {v7, v1}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result v5

    .line 201
    invoke-virtual {v7, v2}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_4
    const/16 v11, 0xa

    if-ge v9, v4, :cond_5

    .line 203
    aget-char v12, v3, v9

    if-ne v12, v11, :cond_4

    add-int/lit8 v10, v10, 0x1

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 204
    :cond_5
    iget v9, v7, Ll/ۧ۫ᩳ;->᩻:I

    sub-int v12, v8, v5

    sub-int/2addr v9, v12

    add-int/2addr v9, v10

    new-array v12, v9, [I

    .line 205
    iget-object v13, v7, Ll/ۧ۫ᩳ;->ܳ:[I

    invoke-static {v13, v6, v12, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v13, 0x0

    move v14, v5

    :goto_5
    if-ge v13, v4, :cond_7

    .line 207
    aget-char v15, v3, v13

    if-ne v15, v11, :cond_6

    add-int/lit8 v15, v14, 0x1

    add-int v16, v1, v13

    aput v16, v12, v14

    move v14, v15

    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_7
    sub-int/2addr v2, v1

    sub-int v11, v4, v2

    add-int/2addr v5, v10

    .line 210
    :goto_6
    iget v10, v7, Ll/ۧ۫ᩳ;->᩻:I

    if-ge v8, v10, :cond_8

    add-int/lit8 v10, v5, 0x1

    .line 211
    iget-object v13, v7, Ll/ۧ۫ᩳ;->ܳ:[I

    aget v13, v13, v8

    add-int/2addr v13, v11

    aput v13, v12, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v10

    goto :goto_6

    .line 228
    :cond_8
    iget-object v5, v7, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz v5, :cond_9

    goto :goto_7

    :cond_9
    iget-object v5, v7, Ll/ۧ۫ᩳ;->ۧ:[C

    .line 229
    :goto_7
    iget v8, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    if-ge v1, v8, :cond_a

    sub-int/2addr v8, v1

    .line 231
    iget v10, v7, Ll/ۧ۫ᩳ;->ܽ:I

    sub-int/2addr v10, v8

    invoke-static {v5, v1, v5, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 232
    iget v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    sub-int/2addr v5, v8

    iput v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    goto :goto_8

    :cond_a
    if-le v1, v8, :cond_b

    sub-int v10, v1, v8

    .line 235
    iget v13, v7, Ll/ۧ۫ᩳ;->ܽ:I

    invoke-static {v5, v13, v5, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 236
    iget v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    add-int/2addr v5, v10

    iput v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    .line 238
    :cond_b
    :goto_8
    iput v1, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    .line 214
    iget v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    add-int/2addr v5, v2

    iput v5, v7, Ll/ۧ۫ᩳ;->ܽ:I

    .line 215
    iget-object v2, v7, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz v2, :cond_c

    :goto_9
    if-ge v6, v4, :cond_d

    .line 216
    iget-object v1, v7, Ll/ۧ۫ᩳ;->֫:[B

    iget v2, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    add-int/2addr v2, v6

    aget-char v5, v3, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v2

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    .line 218
    :cond_c
    iget-object v2, v7, Ll/ۧ۫ᩳ;->ۧ:[C

    invoke-static {v3, v6, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 220
    :cond_d
    iget v1, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, v7, Ll/ۧ۫ᩳ;->ᩳ:I

    .line 221
    iget v1, v7, Ll/ۧ۫ᩳ;->ܿ:I

    add-int/2addr v1, v11

    iput v1, v7, Ll/ۧ۫ᩳ;->ܿ:I

    .line 222
    iput-object v12, v7, Ll/ۧ۫ᩳ;->ܳ:[I

    .line 223
    iput v9, v7, Ll/ۧ۫ᩳ;->᩻:I

    return-object v7
.end method

.method public final ܽ(I)I
    .locals 1

    .line 252
    iget-object v0, p0, Ll/ۧ۫ᩳ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۧ۫ᩳ;->֫:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 12
    iget v0, p0, Ll/ۧ۫ᩳ;->᩻:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 11
    iget v0, p0, Ll/ۧ۫ᩳ;->ܿ:I

    return v0
.end method
