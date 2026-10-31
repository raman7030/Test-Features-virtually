.class public final Ll/ۧۘܿ;
.super Ljava/lang/Object;
.source "36ZX"


# instance fields
.field public final ֫:Ll/ܽۘܿ;

.field public ۜ:[I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:Ll/᩺ܺܿ;

.field public ܽ:[I

.field public ܿ:[Ll/᩶ۘܿ;

.field public ᩳ:J

.field public final ᩷:I

.field public ᩻:[Ll/᩶ۘܿ;


# direct methods
.method public constructor <init>(Ll/᩺ܺܿ;IILl/ܽۘܿ;)V
    .locals 8

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "program"

    .line 187
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۧۘܿ;->ܳ:Ll/᩺ܺܿ;

    if-ltz p2, :cond_5

    if-ltz p3, :cond_5

    if-gt p3, p2, :cond_5

    .line 191
    iput p2, p0, Ll/ۧۘܿ;->ۢ:I

    int-to-long v0, p2

    const-wide/16 v2, 0x3ff

    add-long/2addr v2, v0

    const-wide/16 v4, 0x400

    .line 192
    div-long/2addr v2, v4

    const-wide/16 v4, 0x1000

    .line 193
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, p0, Ll/ۧۘܿ;->᩷:I

    const/4 v2, 0x1

    if-gt p2, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x1

    sub-long/2addr v0, v4

    int-to-long v6, v3

    add-long/2addr v0, v6

    sub-long/2addr v0, v4

    .line 195
    div-long/2addr v0, v6

    long-to-int v0, v0

    :goto_0
    iput v0, p0, Ll/ۧۘܿ;->ۧ:I

    if-eqz p4, :cond_2

    .line 197
    invoke-static {p4}, Ll/ܽۘܿ;->ܽ(Ll/ܽۘܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    if-ne v0, p1, :cond_1

    invoke-static {p4}, Ll/ܽۘܿ;->ܳ(Ll/ܽۘܿ;)I

    move-result p1

    if-ne p1, p2, :cond_1

    goto :goto_1

    .line 198
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Restart index and syntax window differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 201
    :cond_2
    :goto_1
    iput-object p4, p0, Ll/ۧۘܿ;->֫:Ll/ܽۘܿ;

    if-lez p3, :cond_4

    if-ge p3, p2, :cond_4

    const/4 p1, 0x0

    if-nez p4, :cond_3

    move-object p2, p1

    goto :goto_2

    .line 203
    :cond_3
    invoke-virtual {p4, p3}, Ll/ܽۘܿ;->֫(I)Ll/᩶ۘܿ;

    move-result-object p2

    :goto_2
    invoke-direct {p0, p3, p2, p3, p1}, Ll/ۧۘܿ;->֫(ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V

    :cond_4
    int-to-long p1, p3

    int-to-long p3, v3

    add-long/2addr p1, p3

    .line 205
    iput-wide p1, p0, Ll/ۧۘܿ;->ᩳ:J

    return-void

    .line 189
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax window restart recorder"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V
    .locals 8

    add-int/lit8 v0, p1, -0x1

    .line 227
    iget v1, p0, Ll/ۧۘܿ;->᩷:I

    div-int/2addr v0, v1

    .line 228
    iget-object v2, p0, Ll/ۧۘܿ;->ܽ:[I

    if-nez v2, :cond_5

    const/4 v2, 0x0

    .line 262
    iget-object v3, p0, Ll/ۧۘܿ;->֫:Ll/ܽۘܿ;

    if-nez v3, :cond_0

    goto :goto_1

    .line 264
    :cond_0
    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    :goto_0
    if-gt v5, v4, :cond_3

    add-int v6, v5, v4

    ushr-int/lit8 v6, v6, 0x1

    .line 267
    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v7

    aget v7, v7, v6

    add-int/lit8 v7, v7, -0x1

    div-int/2addr v7, v1

    if-ge v7, v0, :cond_1

    add-int/lit8 v5, v6, 0x1

    goto :goto_0

    :cond_1
    if-le v7, v0, :cond_2

    add-int/lit8 v4, v6, -0x1

    goto :goto_0

    .line 273
    :cond_2
    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v4

    aget v4, v4, v6

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v4, 0x0

    :goto_2
    if-lt v4, p1, :cond_4

    goto/16 :goto_4

    .line 231
    :cond_4
    iget v4, p0, Ll/ۧۘܿ;->ۧ:I

    new-array v5, v4, [I

    iput-object v5, p0, Ll/ۧۘܿ;->ܽ:[I

    .line 232
    new-array v5, v4, [Ll/᩶ۘܿ;

    iput-object v5, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    .line 233
    new-array v5, v4, [I

    iput-object v5, p0, Ll/ۧۘܿ;->ۜ:[I

    .line 234
    new-array v4, v4, [Ll/᩶ۘܿ;

    iput-object v4, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    if-eqz v3, :cond_5

    .line 236
    :goto_3
    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v4

    array-length v4, v4

    if-ge v2, v4, :cond_5

    .line 237
    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v4

    aget v4, v4, v2

    add-int/lit8 v4, v4, -0x1

    div-int/2addr v4, v1

    .line 238
    iget-object v5, p0, Ll/ۧۘܿ;->ܽ:[I

    invoke-static {v3}, Ll/ܽۘܿ;->֫(Ll/ܽۘܿ;)[I

    move-result-object v6

    aget v6, v6, v2

    aput v6, v5, v4

    .line 239
    iget-object v5, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    invoke-static {v3}, Ll/ܽۘܿ;->ۧ(Ll/ܽۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v6

    aget-object v6, v6, v2

    aput-object v6, v5, v4

    .line 240
    iget-object v5, p0, Ll/ۧۘܿ;->ۜ:[I

    invoke-static {v3}, Ll/ܽۘܿ;->ᩳ(Ll/ܽۘܿ;)[I

    move-result-object v6

    aget v6, v6, v2

    aput v6, v5, v4

    .line 241
    iget-object v5, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    invoke-static {v3}, Ll/ܽۘܿ;->ܿ(Ll/ܽۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v6

    aget-object v6, v6, v2

    aput-object v6, v5, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 245
    :cond_5
    iget-object v1, p0, Ll/ۧۘܿ;->ܽ:[I

    aget v1, v1, v0

    if-lt p1, v1, :cond_7

    if-eqz p4, :cond_6

    .line 247
    iget-object v2, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    aget-object v2, v2, v0

    if-eqz v2, :cond_6

    iget-object v2, p0, Ll/ۧۘܿ;->ۜ:[I

    aget v2, v2, v0

    if-ge v2, p3, :cond_6

    if-gt p3, v1, :cond_6

    .line 249
    new-instance p3, Ll/᩹ۘܿ;

    iget v1, p0, Ll/ۧۘܿ;->ۢ:I

    invoke-direct {p3, v1}, Ll/᩹ۘܿ;-><init>(I)V

    iget-object v1, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    aget-object v1, v1, v0

    .line 250
    invoke-virtual {p3, v1}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    invoke-virtual {p3, p4}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    invoke-virtual {p3}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object p4

    .line 251
    iget-object p3, p0, Ll/ۧۘܿ;->ۜ:[I

    aget p3, p3, v0

    .line 253
    :cond_6
    iget-object v1, p0, Ll/ۧۘܿ;->ܽ:[I

    aput p1, v1, v0

    .line 254
    iget-object p1, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    aput-object p2, p1, v0

    .line 255
    iget-object p1, p0, Ll/ۧۘܿ;->ۜ:[I

    aput p3, p1, v0

    .line 256
    iget-object p1, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    aput-object p4, p1, v0

    :cond_7
    :goto_4
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧۘܿ;ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۧۘܿ;->֫(ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 317
    iput-object v0, p0, Ll/ۧۘܿ;->ܽ:[I

    .line 318
    iput-object v0, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    .line 319
    iput-object v0, p0, Ll/ۧۘܿ;->ۜ:[I

    .line 320
    iput-object v0, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    return-void
.end method

.method public final ֫(ILl/֫ۖܿ;)V
    .locals 5

    if-lez p1, :cond_1

    .line 217
    iget v0, p0, Ll/ۧۘܿ;->ۢ:I

    if-ge p1, v0, :cond_1

    int-to-long v0, p1

    iget-wide v2, p0, Ll/ۧۘܿ;->ᩳ:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {p2}, Ll/֫ۖܿ;->᩻()I

    move-result v2

    .line 219
    invoke-virtual {p2, p1}, Ll/֫ۖܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object v3

    .line 220
    invoke-virtual {p2, p1}, Ll/֫ۖܿ;->ܿ(I)Ll/᩶ۘܿ;

    move-result-object p2

    invoke-direct {p0, p1, p2, v2, v3}, Ll/ۧۘܿ;->֫(ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V

    .line 221
    iget p1, p0, Ll/ۧۘܿ;->᩷:I

    int-to-long p1, p1

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۧۘܿ;->ᩳ:J

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()Ll/ܽۘܿ;
    .locals 14

    .line 281
    iget-object v0, p0, Ll/ۧۘܿ;->ܽ:[I

    iget v1, p0, Ll/ۧۘܿ;->ۢ:I

    iget-object v2, p0, Ll/ۧۘܿ;->ܳ:Ll/᩺ܺܿ;

    if-nez v0, :cond_1

    .line 282
    iget-object v0, p0, Ll/ۧۘܿ;->֫:Ll/ܽۘܿ;

    if-nez v0, :cond_0

    invoke-static {v2, v1}, Ll/ܽۘܿ;->ۧ(Ll/᩺ܺܿ;I)Ll/ܽۘܿ;

    move-result-object v0

    :cond_0
    return-object v0

    .line 285
    :cond_1
    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget v6, v0, v4

    if-eqz v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    if-nez v5, :cond_4

    .line 289
    iput-object v0, p0, Ll/ۧۘܿ;->ܽ:[I

    .line 290
    iput-object v0, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    .line 291
    iput-object v0, p0, Ll/ۧۘܿ;->ۜ:[I

    .line 292
    iput-object v0, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    .line 293
    invoke-static {v2, v1}, Ll/ܽۘܿ;->ۧ(Ll/᩺ܺܿ;I)Ll/ܽۘܿ;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v1, 0x0

    .line 295
    new-array v9, v5, [I

    .line 296
    new-array v10, v5, [Ll/᩶ۘܿ;

    .line 297
    new-array v11, v5, [I

    .line 298
    new-array v12, v5, [Ll/᩶ۘܿ;

    const/4 v2, 0x0

    .line 300
    :goto_1
    iget-object v3, p0, Ll/ۧۘܿ;->ܽ:[I

    array-length v4, v3

    if-ge v1, v4, :cond_6

    .line 301
    aget v3, v3, v1

    if-eqz v3, :cond_5

    .line 302
    aput v3, v9, v2

    .line 303
    iget-object v3, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    aget-object v3, v3, v1

    aput-object v3, v10, v2

    .line 304
    iget-object v3, p0, Ll/ۧۘܿ;->ۜ:[I

    aget v3, v3, v1

    aput v3, v11, v2

    add-int/lit8 v3, v2, 0x1

    .line 305
    iget-object v4, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    aget-object v4, v4, v1

    aput-object v4, v12, v2

    move v2, v3

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 308
    :cond_6
    iput-object v0, p0, Ll/ۧۘܿ;->ܽ:[I

    .line 309
    iput-object v0, p0, Ll/ۧۘܿ;->ܿ:[Ll/᩶ۘܿ;

    .line 310
    iput-object v0, p0, Ll/ۧۘܿ;->ۜ:[I

    .line 311
    iput-object v0, p0, Ll/ۧۘܿ;->᩻:[Ll/᩶ۘܿ;

    .line 312
    new-instance v0, Ll/ܽۘܿ;

    iget v8, p0, Ll/ۧۘܿ;->ۢ:I

    const/4 v13, 0x0

    iget-object v7, p0, Ll/ۧۘܿ;->ܳ:Ll/᩺ܺܿ;

    move-object v6, v0

    invoke-direct/range {v6 .. v13}, Ll/ܽۘܿ;-><init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;I)V

    return-object v0
.end method
