.class public final Ll/᩻ۨۖ;
.super Ljava/lang/Object;
.source "Y9CS"

# interfaces
.implements Ll/ۚ֫ۘ;


# static fields
.field public static final ֡:[B

.field public static final ᩵:[B


# instance fields
.field public ֫:J

.field public ۖ:[B

.field public ۘ:J

.field public ۜ:Ll/᩺ۛۖ;

.field public ۡ:I

.field public ۢ:J

.field public ۧ:I

.field public ܳ:J

.field public ܺ:J

.field public ܽ:I

.field public ܿ:Ll/᩹ۛۖ;

.field public ᩳ:I

.field public ᩴ:J

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 29
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻ۨۖ;->᩵:[B

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 33
    fill-array-data v0, :array_1

    sput-object v0, Ll/᩻ۨۖ;->֡:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        -0x2t
        0x53t
        0x4dt
        0x42t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 36
    iput v0, p0, Ll/᩻ۨۖ;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/ۤܰۖ;[B)V
    .locals 4

    .line 298
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-byte v2, p1, v1

    .line 299
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܿ()B

    move-result v3

    if-ne v3, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 300
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Could not find SMB2 Packet header"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static ֫([B)Z
    .locals 1

    .line 281
    sget-object v0, Ll/᩻ۨۖ;->֡:[B

    invoke-static {p0, v0}, Ll/᩻ۨۖ;->֫([B[B)Z

    move-result p0

    return p0
.end method

.method public static ֫([B[B)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 309
    array-length v1, p0

    array-length v2, p1

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 312
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    .line 313
    aget-byte v2, p0, v1

    aget-byte v3, p1, v1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 14

    .line 236
    iget-object v0, p0, Ll/᩻ۨۖ;->ܿ:Ll/᩹ۛۖ;

    iget v1, p0, Ll/᩻ۨۖ;->ۧ:I

    .line 239
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/᩻ۨۖ;->ܽ:I

    .line 240
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/᩻ۨۖ;->ᩳ:I

    .line 241
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ll/᩻ۨۖ;->ۜ:Ll/᩺ۛۖ;

    iget-wide v5, p0, Ll/᩻ۨۖ;->ۢ:J

    .line 243
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide v6, p0, Ll/᩻ۨۖ;->֫:J

    .line 244
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v7, p0, Ll/᩻ۨۖ;->ܺ:J

    .line 245
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-wide v8, p0, Ll/᩻ۨۖ;->ᩴ:J

    .line 246
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iget-wide v9, p0, Ll/᩻ۨۖ;->ۘ:J

    .line 247
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-wide v10, p0, Ll/᩻ۨۖ;->ܳ:J

    .line 248
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iget v11, p0, Ll/᩻ۨۖ;->ۡ:I

    .line 249
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v12, 0xc

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v0, v12, v13

    const/4 v0, 0x1

    aput-object v1, v12, v0

    const/4 v0, 0x2

    aput-object v2, v12, v0

    const/4 v0, 0x3

    aput-object v3, v12, v0

    const/4 v0, 0x4

    aput-object v4, v12, v0

    const/4 v0, 0x5

    aput-object v5, v12, v0

    const/4 v0, 0x6

    aput-object v6, v12, v0

    const/4 v0, 0x7

    aput-object v7, v12, v0

    const/16 v0, 0x8

    aput-object v8, v12, v0

    const/16 v0, 0x9

    aput-object v9, v12, v0

    const/16 v0, 0xa

    aput-object v10, v12, v0

    const/16 v0, 0xb

    aput-object v11, v12, v0

    const-string v0, "dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s"

    .line 236
    invoke-static {v0, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 262
    iget v0, p0, Ll/᩻ۨۖ;->᩻:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 232
    iput p1, p0, Ll/᩻ۨۖ;->ۧ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 168
    iput-wide p1, p0, Ll/᩻ۨۖ;->֫:J

    return-void
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 6

    .line 177
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۡ()I

    move-result v0

    iput v0, p0, Ll/᩻ۨۖ;->᩻:I

    .line 179
    sget-object v0, Ll/᩻ۨۖ;->֡:[B

    invoke-static {p1, v0}, Ll/᩻ۨۖ;->֫(Ll/ۤܰۖ;[B)V

    const/4 v0, 0x2

    .line 180
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 181
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    .line 182
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->ۘ:J

    .line 183
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    invoke-static {v0}, Ll/᩺ۛۖ;->֫(I)Ll/᩺ۛۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۨۖ;->ۜ:Ll/᩺ۛۖ;

    .line 184
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    iput v0, p0, Ll/᩻ۨۖ;->ᩳ:I

    .line 185
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    .line 186
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v0

    iput v0, p0, Ll/᩻ۨۖ;->ۡ:I

    .line 187
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->ۢ:J

    .line 188
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    sget-object v2, Ll/֫ۨۖ;->᩶:Ll/֫ۨۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->֫:J

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    .line 191
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 192
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->ᩴ:J

    .line 194
    :goto_0
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۨۖ;->ܺ:J

    .line 288
    iget-object v0, p0, Ll/᩻ۨۖ;->ۖ:[B

    const/16 v1, 0x10

    if-eqz v0, :cond_1

    array-length v0, v0

    if-eq v0, v1, :cond_2

    :cond_1
    new-array v0, v1, [B

    .line 289
    iput-object v0, p0, Ll/᩻ۨۖ;->ۖ:[B

    .line 291
    :cond_2
    iget-object v0, p0, Ll/᩻ۨۖ;->ۖ:[B

    .line 293
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 198
    iget v0, p0, Ll/᩻ۨۖ;->ۡ:I

    int-to-long v1, v0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    .line 200
    iget p1, p0, Ll/᩻ۨۖ;->᩻:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩻ۨۖ;->᩷:I

    return-void

    .line 203
    :cond_3
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result p1

    iput p1, p0, Ll/᩻ۨۖ;->᩷:I

    return-void
.end method

.method public final ֫(Ll/᩹ۛۖ;)V
    .locals 0

    .line 136
    iput-object p1, p0, Ll/᩻ۨۖ;->ܿ:Ll/᩹ۛۖ;

    return-void
.end method

.method public final ֫(Ll/᩺ۛۖ;)V
    .locals 0

    .line 112
    iput-object p1, p0, Ll/᩻ۨۖ;->ۜ:Ll/᩺ۛۖ;

    return-void
.end method

.method public final ֫(Ll/֫ۨۖ;)Z
    .locals 2

    .line 140
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    invoke-static {v0, v1, p1}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 148
    iget-wide v0, p0, Ll/᩻ۨۖ;->ۢ:J

    return-wide v0
.end method

.method public final ۡ()J
    .locals 2

    .line 212
    iget-wide v0, p0, Ll/᩻ۨۖ;->ۘ:J

    return-wide v0
.end method

.method public final ۢ()J
    .locals 2

    .line 128
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܺ:J

    return-wide v0
.end method

.method public final ۧ()I
    .locals 1

    .line 266
    iget v0, p0, Ll/᩻ۨۖ;->᩷:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 152
    iput p1, p0, Ll/᩻ۨۖ;->ܽ:I

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 108
    iput-wide p1, p0, Ll/᩻ۨۖ;->ۢ:J

    return-void
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result v0

    iput v0, p0, Ll/᩻ۨۖ;->᩻:I

    .line 55
    sget-object v0, Ll/᩻ۨۖ;->֡:[B

    const/4 v1, 0x4

    .line 318
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    const/16 v0, 0x40

    .line 56
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 96
    sget-object v0, Ll/ܳۨۖ;->֫:[I

    iget-object v1, p0, Ll/᩻ۨۖ;->ܿ:Ll/᩹ۛۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_0

    if-eq v0, v2, :cond_0

    .line 102
    iget v0, p0, Ll/᩻ۨۖ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p1, v2}, Ll/֡֫ۘ;->᩻(I)V

    .line 78
    :goto_0
    iget-object v0, p0, Ll/᩻ۨۖ;->ܿ:Ll/᩹ۛۖ;

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    .line 80
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۘ()V

    .line 59
    :goto_1
    iget-object v0, p0, Ll/᩻ۨۖ;->ۜ:Ll/᩺ۛۖ;

    invoke-virtual {v0}, Ll/᩺ۛۖ;->getValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 92
    iget v0, p0, Ll/᩻ۨۖ;->ܽ:I

    iget v1, p0, Ll/᩻ۨۖ;->ۧ:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 61
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 62
    iget v0, p0, Ll/᩻ۨۖ;->ۡ:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 63
    iget-wide v0, p0, Ll/᩻ۨۖ;->ۢ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(J)V

    .line 64
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    sget-object v2, Ll/֫ۨۖ;->᩶:Ll/֫ۨۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    iget-wide v0, p0, Ll/᩻ۨۖ;->֫:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(J)V

    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۘ()V

    .line 68
    iget-wide v0, p0, Ll/᩻ۨۖ;->ᩴ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 70
    :goto_2
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܺ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(J)V

    .line 71
    sget-object v0, Ll/᩻ۨۖ;->᩵:[B

    const/16 v1, 0x10

    .line 318
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method

.method public final ۧ(Ll/֫ۨۖ;)V
    .locals 4

    .line 144
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    invoke-virtual {p1}, Ll/֫ۨۖ;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    return-void
.end method

.method public final ܳ()J
    .locals 2

    .line 216
    iget-wide v0, p0, Ll/᩻ۨۖ;->ܳ:J

    return-wide v0
.end method

.method public final ܺ()J
    .locals 2

    .line 120
    iget-wide v0, p0, Ll/᩻ۨۖ;->ᩴ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 172
    iget-wide v0, p0, Ll/᩻ۨۖ;->֫:J

    return-wide v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 270
    iput p1, p0, Ll/᩻ۨۖ;->᩷:I

    return-void
.end method

.method public final ܽ(J)V
    .locals 0

    .line 132
    iput-wide p1, p0, Ll/᩻ۨۖ;->ܺ:J

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 160
    iget v0, p0, Ll/᩻ۨۖ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 254
    iget v0, p0, Ll/᩻ۨۖ;->ۧ:I

    return v0
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 124
    iput-wide p1, p0, Ll/᩻ۨۖ;->ᩴ:J

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 224
    iget v0, p0, Ll/᩻ۨۖ;->ۡ:I

    return v0
.end method

.method public final ᩻()Ll/᩺ۛۖ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/᩻ۨۖ;->ۜ:Ll/᩺ۛۖ;

    return-object v0
.end method
