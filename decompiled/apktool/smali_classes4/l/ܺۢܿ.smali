.class public final Ll/ܺۢܿ;
.super Ljava/lang/Object;
.source "970E"

# interfaces
.implements Ll/ܰܺܿ;


# instance fields
.field public ֫:I

.field public ۖ:Z

.field public ۘ:I

.field public final ۜ:Ll/᩹ۘܿ;

.field public final ۡ:Ll/ܰܺܿ;

.field public ۢ:J

.field public final ۧ:Ll/ۢۢܿ;

.field public ܳ:Z

.field public ܺ:[Ll/ۡۢܿ;

.field public final ܽ:Ll/᩹ۘܿ;

.field public final ܿ:Ll/᩹ۘܿ;

.field public ᩳ:Z

.field public final ᩴ:I

.field public final ᩵:I

.field public ᩷:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIILl/ܰܺܿ;Ll/ۢۢܿ;)V
    .locals 5

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [Ll/ۡۢܿ;

    .line 24
    iput-object v0, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    const/4 v0, 0x1

    .line 25
    iput v0, p0, Ll/ܺۢܿ;->ۘ:I

    const/4 v0, -0x1

    .line 28
    iput v0, p0, Ll/ܺۢܿ;->֫:I

    if-ltz p1, :cond_4

    if-ltz p2, :cond_3

    if-gt p2, p1, :cond_3

    if-lez p3, :cond_2

    .line 65
    iput p1, p0, Ll/ܺۢܿ;->᩵:I

    .line 66
    iput p2, p0, Ll/ܺۢܿ;->᩻:I

    .line 67
    iput-object p4, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    .line 68
    iput-object p5, p0, Ll/ܺۢܿ;->ۧ:Ll/ۢۢܿ;

    .line 69
    invoke-virtual {p5}, Ll/ۢۢܿ;->ۧ()Z

    move-result p4

    if-eqz p4, :cond_1

    int-to-long p4, p1

    int-to-long v0, p2

    sub-long/2addr p4, v0

    const-wide/16 v2, 0x0

    cmp-long v4, p4, v2

    if-nez v4, :cond_0

    const-wide/16 p4, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x3fe

    add-long/2addr p4, v2

    const-wide/16 v2, 0x3ff

    .line 72
    div-long/2addr p4, v2

    :goto_0
    int-to-long v2, p3

    .line 73
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    long-to-int p4, p3

    iput p4, p0, Ll/ܺۢܿ;->ᩴ:I

    .line 74
    new-instance p3, Ll/᩹ۘܿ;

    invoke-direct {p3, p1}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object p3, p0, Ll/ܺۢܿ;->ܿ:Ll/᩹ۘܿ;

    .line 75
    new-instance p3, Ll/᩹ۘܿ;

    invoke-direct {p3, p1}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object p3, p0, Ll/ܺۢܿ;->ۜ:Ll/᩹ۘܿ;

    .line 76
    new-instance p3, Ll/᩹ۘܿ;

    invoke-direct {p3, p1}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object p3, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    .line 77
    iget-object p3, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    new-instance p5, Ll/ۡۢܿ;

    new-instance v2, Ll/᩹ۘܿ;

    invoke-direct {v2, p1}, Ll/᩹ۘܿ;-><init>(I)V

    .line 78
    invoke-virtual {v2}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object p1

    invoke-direct {p5, p2, p1}, Ll/ۡۢܿ;-><init>(ILl/᩶ۘܿ;)V

    const/4 p1, 0x0

    aput-object p5, p3, p1

    .line 79
    iput-wide v0, p0, Ll/ܺۢܿ;->᩷:J

    int-to-long p1, p4

    add-long/2addr v0, p1

    .line 80
    iput-wide v0, p0, Ll/ܺۢܿ;->ۢ:J

    return-void

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "End search proof budget exhausted"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Non-positive end search stride"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "End search starts outside the document"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IIILl/ܰܺܿ;Ll/ۢۢܿ;)Ll/ܺۢܿ;
    .locals 7

    const-string v0, "budget"

    .line 52
    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    invoke-virtual {p4}, Ll/ۢۢܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 54
    :cond_0
    new-instance v6, Ll/ܺۢܿ;

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ܺۢܿ;-><init>(IIILl/ܰܺܿ;Ll/ۢۢܿ;)V

    return-object v6
.end method

.method private ᩳ()V
    .locals 2

    .line 269
    iget-boolean v0, p0, Ll/ܺۢܿ;->ۖ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "End search trace has been released"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 263
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 264
    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 178
    iget-object v0, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    invoke-virtual {v0}, Ll/᩹ۘܿ;->֫()V

    .line 179
    iget-object v0, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    if-eqz v0, :cond_0

    check-cast v0, Ll/ܺۢܿ;

    invoke-virtual {v0}, Ll/ܺۢܿ;->֫()V

    :cond_0
    return-void

    .line 264
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No active end search candidate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 5

    .line 98
    iget-boolean v0, p0, Ll/ܺۢܿ;->ܳ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-nez v0, :cond_3

    int-to-long v0, p1

    .line 101
    iget-wide v2, p0, Ll/ܺۢܿ;->᩷:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget v0, p0, Ll/ܺۢܿ;->᩻:I

    if-lt p1, v0, :cond_2

    iget v0, p0, Ll/ܺۢܿ;->᩵:I

    if-gt p1, v0, :cond_2

    .line 104
    iget-object v1, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    invoke-virtual {v1, v0}, Ll/᩹ۘܿ;->ۧ(I)V

    invoke-virtual {v1, p1}, Ll/᩹ۘܿ;->֫(I)V

    .line 105
    iput p1, p0, Ll/ܺۢܿ;->֫:I

    const/4 v2, 0x1

    .line 106
    iput-boolean v2, p0, Ll/ܺۢܿ;->ᩳ:Z

    .line 107
    iget-object v2, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    if-eqz v2, :cond_0

    move-object v3, v2

    check-cast v3, Ll/ܺۢܿ;

    invoke-virtual {v3, p1}, Ll/ܺۢܿ;->ۧ(I)V

    :cond_0
    if-ne p1, v0, :cond_1

    .line 109
    invoke-virtual {v1}, Ll/᩹ۘܿ;->֫()V

    if-eqz v2, :cond_1

    .line 110
    check-cast v2, Ll/ܺۢܿ;

    invoke-virtual {v2}, Ll/ܺۢܿ;->֫()V

    :cond_1
    return-void

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "End search candidates are not contiguous"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "End search candidate is already active or finished"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)V
    .locals 1

    .line 263
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 264
    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    invoke-virtual {v0, p1, p2}, Ll/᩹ۘܿ;->֫(II)V

    .line 163
    iget-object v0, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    if-eqz v0, :cond_0

    check-cast v0, Ll/ܺۢܿ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۢܿ;->֫(II)V

    :cond_0
    return-void

    .line 264
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No active end search candidate"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 8

    .line 129
    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-eqz v0, :cond_8

    .line 130
    iget v0, p0, Ll/ܺۢܿ;->֫:I

    .line 131
    iget v1, p0, Ll/ܺۢܿ;->᩵:I

    iget-object v2, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    if-nez p1, :cond_0

    if-eq v0, v1, :cond_0

    add-int/lit8 v3, v0, 0x1

    .line 134
    invoke-virtual {v2, v3}, Ll/᩹ۘܿ;->֫(I)V

    .line 135
    iget-object v4, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    if-eqz v4, :cond_0

    check-cast v4, Ll/ܺۢܿ;

    invoke-virtual {v4, v3}, Ll/ܺۢܿ;->ۧ(I)V

    .line 139
    :cond_0
    iget-object v3, p0, Ll/ܺۢܿ;->ۜ:Ll/᩹ۘܿ;

    invoke-virtual {v3, v2}, Ll/᩹ۘܿ;->֫(Ll/᩹ۘܿ;)V

    .line 140
    iget-object v3, p0, Ll/ܺۢܿ;->ܿ:Ll/᩹ۘܿ;

    if-nez p1, :cond_1

    invoke-virtual {v3, v2}, Ll/᩹ۘܿ;->֫(Ll/᩹ۘܿ;)V

    :cond_1
    const/4 v2, 0x0

    .line 141
    iput-boolean v2, p0, Ll/ܺۢܿ;->ᩳ:Z

    const/4 v2, -0x1

    .line 142
    iput v2, p0, Ll/ܺۢܿ;->֫:I

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    .line 144
    iput-boolean v2, p0, Ll/ܺۢܿ;->ܳ:Z

    return-void

    :cond_2
    if-ne v0, v1, :cond_3

    int-to-long v0, v1

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    .line 246
    iput-wide v0, p0, Ll/ܺۢܿ;->᩷:J

    .line 247
    iput-boolean v2, p0, Ll/ܺۢܿ;->ܳ:Z

    return-void

    :cond_3
    add-int/2addr v0, v2

    int-to-long v4, v0

    .line 251
    iput-wide v4, p0, Ll/ܺۢܿ;->᩷:J

    .line 252
    iget-wide v6, p0, Ll/ܺۢܿ;->ۢ:J

    cmp-long p1, v4, v6

    if-ltz p1, :cond_7

    .line 254
    iget p1, p0, Ll/ܺۢܿ;->ۘ:I

    const/16 v1, 0x400

    if-ge p1, v1, :cond_6

    iget-object p1, p0, Ll/ܺۢܿ;->ۧ:Ll/ۢۢܿ;

    invoke-virtual {p1}, Ll/ۢۢܿ;->֫()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 255
    invoke-virtual {v3}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v3

    .line 274
    iget v6, p0, Ll/ܺۢܿ;->ۘ:I

    if-eq v6, v1, :cond_6

    invoke-virtual {p1}, Ll/ۢۢܿ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 275
    :cond_4
    iget p1, p0, Ll/ܺۢܿ;->ۘ:I

    iget-object v6, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    array-length v7, v6

    if-ne p1, v7, :cond_5

    .line 276
    array-length p1, v6

    shl-int/2addr p1, v2

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 277
    iget-object v1, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۡۢܿ;

    iput-object p1, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    .line 279
    :cond_5
    iget-object p1, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    iget v1, p0, Ll/ܺۢܿ;->ۘ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܺۢܿ;->ۘ:I

    new-instance v2, Ll/ۡۢܿ;

    invoke-direct {v2, v0, v3}, Ll/ۡۢܿ;-><init>(ILl/᩶ۘܿ;)V

    aput-object v2, p1, v1

    .line 257
    :cond_6
    :goto_0
    iget p1, p0, Ll/ܺۢܿ;->ᩴ:I

    int-to-long v0, p1

    add-long/2addr v4, v0

    iput-wide v4, p0, Ll/ܺۢܿ;->ۢ:J

    :cond_7
    return-void

    .line 129
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No active end search candidate"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/᩶ۘܿ;
    .locals 2

    .line 153
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 154
    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Ll/ܺۢܿ;->ۜ:Ll/᩹ۘܿ;

    invoke-virtual {v0}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v0

    return-object v0

    .line 154
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "End search candidate is still active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 263
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 264
    iget-boolean v0, p0, Ll/ܺۢܿ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Ll/ܺۢܿ;->ܽ:Ll/᩹ۘܿ;

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(I)V

    .line 171
    iget-object v0, p0, Ll/ܺۢܿ;->ۡ:Ll/ܰܺܿ;

    if-eqz v0, :cond_0

    check-cast v0, Ll/ܺۢܿ;

    invoke-virtual {v0, p1}, Ll/ܺۢܿ;->ۧ(I)V

    :cond_0
    return-void

    .line 264
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No active end search candidate"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()V
    .locals 4

    .line 222
    iget-boolean v0, p0, Ll/ܺۢܿ;->ۖ:Z

    if-eqz v0, :cond_0

    return-void

    .line 223
    :cond_0
    iget-object v0, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    iget v1, p0, Ll/ܺۢܿ;->ۘ:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 224
    iget-object v0, p0, Ll/ܺۢܿ;->ۧ:Ll/ۢۢܿ;

    iget v1, p0, Ll/ܺۢܿ;->ۘ:I

    invoke-virtual {v0, v1}, Ll/ۢۢܿ;->֫(I)V

    .line 225
    iput v3, p0, Ll/ܺۢܿ;->ۘ:I

    const/4 v0, 0x1

    .line 226
    iput-boolean v0, p0, Ll/ܺۢܿ;->ۖ:Z

    return-void
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 203
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 204
    iget v0, p0, Ll/ܺۢܿ;->᩻:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ܺۢܿ;->᩵:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I)Ll/ۡۢܿ;
    .locals 4

    .line 184
    invoke-direct {p0}, Ll/ܺۢܿ;->ᩳ()V

    .line 185
    iget v0, p0, Ll/ܺۢܿ;->᩻:I

    if-lt p1, v0, :cond_2

    iget v0, p0, Ll/ܺۢܿ;->᩵:I

    if-gt p1, v0, :cond_2

    .line 189
    iget v0, p0, Ll/ܺۢܿ;->ۘ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_1

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    .line 192
    iget-object v3, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    aget-object v3, v3, v2

    invoke-static {v3}, Ll/ۡۢܿ;->֫(Ll/ۡۢܿ;)I

    move-result v3

    if-gt v3, p1, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    .line 198
    :cond_1
    iget-object p1, p0, Ll/ܺۢܿ;->ܺ:[Ll/ۡۢܿ;

    aget-object p1, p1, v0

    return-object p1

    .line 186
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "End search proof offset is outside the trace"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
