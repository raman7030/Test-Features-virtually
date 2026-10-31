.class public final Ll/֫ۡۘ;
.super Ljava/lang/Object;
.source "87ZM"


# static fields
.field public static ᩷:Ll/ۛ᩶ᩴ;


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:[Ljava/lang/String;

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "EEE MMM dd HH:mm:ss zzz yyyy"

    .line 136
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 137
    invoke-static {v0, v1}, Ll/ۛ᩶ᩴ;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    sput-object v0, Ll/֫ۡۘ;->᩷:Ll/ۛ᩶ᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 160
    iput v0, p0, Ll/֫ۡۘ;->ܽ:I

    const/4 v0, 0x0

    .line 167
    iput-object v0, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;
    .locals 10

    .line 172
    new-instance v0, Ll/֫ۡۘ;

    invoke-direct {v0}, Ll/֫ۡۘ;-><init>()V

    .line 173
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 132
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const/16 v5, 0x20

    shl-long/2addr v1, v5

    .line 133
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v5

    int-to-long v5, v5

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 175
    iput-wide v1, v0, Ll/֫ۡۘ;->᩻:J

    .line 177
    :cond_0
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    .line 178
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->ۜ:I

    .line 179
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->ᩳ:I

    .line 181
    :cond_1
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_2

    .line 182
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->ܳ:I

    .line 184
    :cond_2
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    .line 185
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->֫:I

    .line 187
    :cond_3
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 188
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/֫ۡۘ;->ܿ:I

    .line 190
    :cond_4
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_5

    .line 191
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    if-lez v1, :cond_5

    mul-int/lit8 v2, v1, 0x2

    .line 193
    new-array v2, v2, [Ljava/lang/String;

    iput-object v2, v0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 195
    iget-object v4, v0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    mul-int/lit8 v5, v3, 0x2

    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    sget-object v7, Ll/᩵ۡۘ;->ܽ:[B

    .line 409
    array-length v7, v6

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v6, v2, v7, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 195
    aput-object v9, v4, v5

    .line 196
    iget-object v4, v0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 409
    array-length v7, v6

    .line 405
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v6, v2, v7, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 196
    aput-object v9, v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method private ۧ(I)Z
    .locals 2

    .line 290
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    iget v0, p0, Ll/֫ۡۘ;->ܳ:I

    const v1, 0xf000

    and-int/2addr v0, v1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 9

    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x4000

    .line 298
    invoke-direct {p0, v2}, Ll/֫ۡۘ;->ۧ(I)Z

    move-result v2

    const/16 v3, 0x2d

    if-eqz v2, :cond_0

    const/16 v2, 0x64

    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const v2, 0xa000

    .line 314
    invoke-direct {p0, v2}, Ll/֫ۡۘ;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x6c

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    :goto_0
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit16 v2, v2, 0x100

    const/16 v4, 0x72

    if-eqz v2, :cond_2

    .line 78
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 80
    :cond_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    :goto_1
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit16 v2, v2, 0x80

    const/16 v5, 0x77

    if-eqz v2, :cond_3

    .line 83
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 85
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    :goto_2
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit16 v6, v2, 0x800

    const/16 v7, 0x73

    const/16 v8, 0x78

    if-eqz v6, :cond_4

    .line 88
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    and-int/lit8 v2, v2, 0x40

    if-eqz v2, :cond_5

    .line 90
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 92
    :cond_5
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    :goto_3
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_6

    .line 95
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 97
    :cond_6
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    :goto_4
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_7

    .line 100
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 102
    :cond_7
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    :goto_5
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit16 v6, v2, 0x400

    if-eqz v6, :cond_8

    .line 105
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_8
    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_9

    .line 107
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    .line 109
    :cond_9
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    :goto_6
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_a

    .line 112
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_7

    .line 114
    :cond_a
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 116
    :goto_7
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_b

    .line 117
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 119
    :cond_b
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    :goto_8
    iget v2, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_c

    .line 122
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_9

    .line 124
    :cond_c
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    :goto_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget v2, p0, Ll/֫ۡۘ;->ۜ:I

    .line 355
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    iget v2, p0, Ll/֫ۡۘ;->ᩳ:I

    .line 355
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    iget-wide v2, p0, Ll/֫ۡۘ;->᩻:J

    .line 355
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    iget v1, p0, Ll/֫ۡۘ;->ܿ:I

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    .line 140
    invoke-static {v1, v2}, Ll/ۘ᩹ᩴ;->ofEpochSecond(J)Ll/ۘ᩹ᩴ;

    move-result-object v1

    .line 141
    invoke-static {}, Ll/ۚ᩹ᩴ;->systemDefault()Ll/ۚ᩹ᩴ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/֨᩹ᩴ;->ofInstant(Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;

    move-result-object v1

    .line 142
    sget-object v2, Ll/֫ۡۘ;->᩷:Ll/ۛ᩶ᩴ;

    invoke-virtual {v2, v1}, Ll/ۛ᩶ᩴ;->format(Ll/ۖۗᩴ;)Ljava/lang/String;

    move-result-object v1

    .line 356
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 322
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 284
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/֫ۡۘ;->ܽ:I

    .line 285
    iget v0, p0, Ll/֫ۡۘ;->ܳ:I

    and-int/lit16 v0, v0, -0x1000

    and-int/lit16 p1, p1, 0xfff

    or-int/2addr p1, v0

    .line 286
    iput p1, p0, Ll/֫ۡۘ;->ܳ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 278
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/֫ۡۘ;->ܽ:I

    .line 279
    iput p1, p0, Ll/֫ۡۘ;->֫:I

    .line 280
    iput p2, p0, Ll/֫ۡۘ;->ܿ:I

    return-void
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)V
    .locals 5

    .line 234
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 235
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 236
    iget-wide v0, p0, Ll/֫ۡۘ;->᩻:J

    invoke-virtual {p1, v0, v1}, Ll/ܺ᩻ۘ;->֫(J)V

    .line 238
    :cond_0
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 239
    iget v0, p0, Ll/֫ۡۘ;->ۜ:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 240
    iget v0, p0, Ll/֫ۡۘ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 242
    :cond_1
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 243
    iget v0, p0, Ll/֫ۡۘ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 245
    :cond_2
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 246
    iget v0, p0, Ll/֫ۡۘ;->֫:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 248
    :cond_3
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    .line 249
    iget v0, p0, Ll/֫ۡۘ;->ܿ:I

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 251
    :cond_4
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    .line 252
    iget-object v0, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    if-lez v0, :cond_5

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    .line 255
    iget-object v2, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    mul-int/lit8 v3, v1, 0x2

    aget-object v2, v2, v3

    sget-object v4, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v2, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 255
    invoke-virtual {p1, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 256
    iget-object v2, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    aget-object v2, v2, v3

    .line 397
    invoke-static {v2, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 256
    invoke-virtual {p1, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    .line 272
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/֫ۡۘ;->ܽ:I

    .line 273
    iput p1, p0, Ll/֫ۡۘ;->ۜ:I

    .line 274
    iput p2, p0, Ll/֫ۡۘ;->ᩳ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/16 v0, 0x4000

    .line 298
    invoke-direct {p0, v0}, Ll/֫ۡۘ;->ۧ(I)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    const v0, 0xa000

    .line 314
    invoke-direct {p0, v0}, Ll/֫ۡۘ;->ۧ(I)Z

    move-result v0

    return v0
.end method

.method public final ܿ()I
    .locals 5

    .line 206
    iget v0, p0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x8

    :cond_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    add-int/lit8 v1, v1, 0x8

    :cond_3
    const/high16 v2, -0x80000000

    and-int/2addr v0, v2

    if-eqz v0, :cond_4

    add-int/lit8 v1, v1, 0x4

    .line 220
    iget-object v0, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    if-lez v0, :cond_4

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_4

    add-int/lit8 v1, v1, 0x4

    .line 224
    iget-object v3, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    mul-int/lit8 v4, v2, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x4

    .line 226
    iget-object v1, p0, Ll/֫ۡۘ;->ۧ:[Ljava/lang/String;

    add-int/lit8 v4, v4, 0x1

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return v1
.end method

.method public final ᩳ()Z
    .locals 1

    const v0, 0x8000

    .line 294
    invoke-direct {p0, v0}, Ll/֫ۡۘ;->ۧ(I)Z

    move-result v0

    return v0
.end method
