.class public final Ll/ܳۢܿ;
.super Ljava/lang/Object;
.source "T6ZS"


# instance fields
.field public final ֫:I

.field public ۜ:Ll/ܿۢܿ;

.field public final ۡ:I

.field public ۢ:[I

.field public final ۧ:I

.field public ܳ:Z

.field public ܽ:[I

.field public ܿ:[Ll/ܶۜܿ;

.field public ᩳ:Z

.field public ᩷:I

.field public ᩻:[I


# direct methods
.method public constructor <init>(IIILl/ܶۜܿ;)V
    .locals 5

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [I

    .line 16
    iput-object v1, p0, Ll/ܳۢܿ;->ۢ:[I

    new-array v2, v0, [I

    .line 17
    iput-object v2, p0, Ll/ܳۢܿ;->ܽ:[I

    new-array v3, v0, [I

    .line 18
    iput-object v3, p0, Ll/ܳۢܿ;->᩻:[I

    new-array v0, v0, [Ll/ܶۜܿ;

    .line 19
    iput-object v0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    const/4 v4, 0x1

    .line 20
    iput v4, p0, Ll/ܳۢܿ;->᩷:I

    if-ltz p1, :cond_1

    if-ltz p2, :cond_0

    if-lt p3, p2, :cond_0

    if-gt p3, p1, :cond_0

    .line 42
    iput p1, p0, Ll/ܳۢܿ;->ۡ:I

    .line 43
    iput p2, p0, Ll/ܳۢܿ;->ۧ:I

    .line 44
    iput p3, p0, Ll/ܳۢܿ;->֫:I

    const/4 p2, 0x0

    aput p2, v1, p2

    aput p1, v2, p2

    const/4 p1, -0x1

    aput p1, v3, p2

    const-string p1, "rootLanguage"

    .line 48
    invoke-static {p4, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    aput-object p4, v0, p2

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Syntax context coverage is outside the document"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative syntax context text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܳۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳۢܿ;->֫:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܳۢܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۢܿ;->᩷:I

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܳۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳۢܿ;->᩷:I

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ܳۢܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܳۢܿ;->ۜ:Ll/ܿۢܿ;

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ܳۢܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܳۢܿ;->ܳ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܳۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳۢܿ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ܳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢܿ;->᩻:[I

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢܿ;->ܽ:[I

    return-object p0
.end method

.method private ܿ()V
    .locals 2

    .line 288
    iget-boolean v0, p0, Ll/ܳۢܿ;->ᩳ:Z

    if-nez v0, :cond_1

    .line 291
    iget-object v0, p0, Ll/ܳۢܿ;->ۜ:Ll/ܿۢܿ;

    if-nez v0, :cond_0

    return-void

    .line 292
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Syntax context range clip is active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 289
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Syntax context recorder is finished"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܿ(Ll/ܳۢܿ;)[Ll/ܶۜܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܳۢܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܳۢܿ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ܳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢܿ;->ۢ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܳۢܿ;)Ll/ܿۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۢܿ;->ۜ:Ll/ܿۢܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 71
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 72
    iget-object v0, p0, Ll/ܳۢܿ;->ܽ:[I

    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(IIILl/ܶۜܿ;)I
    .locals 4

    .line 86
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 87
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p3

    if-ltz p1, :cond_5

    if-lt p2, p1, :cond_5

    .line 88
    iget v0, p0, Ll/ܳۢܿ;->ۡ:I

    if-gt p2, v0, :cond_5

    .line 91
    iget-object v0, p0, Ll/ܳۢܿ;->ۢ:[I

    aget v1, v0, p3

    if-lt p1, v1, :cond_4

    iget-object v1, p0, Ll/ܳۢܿ;->ܽ:[I

    aget v1, v1, p3

    if-gt p2, v1, :cond_4

    if-eq p1, p2, :cond_3

    .line 95
    iget v1, p0, Ll/ܳۢܿ;->ۧ:I

    iget v2, p0, Ll/ܳۢܿ;->֫:I

    if-eq v1, v2, :cond_3

    if-le p2, v1, :cond_3

    if-lt p1, v2, :cond_0

    goto :goto_1

    .line 273
    :cond_0
    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    goto :goto_0

    :cond_1
    int-to-long v2, v1

    shr-int/lit8 v0, v1, 0x1

    int-to-long v0, v0

    add-long/2addr v2, v0

    const-wide/32 v0, 0x7fffffff

    .line 276
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 277
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    if-le v1, v0, :cond_2

    .line 280
    iget-object v0, p0, Ll/ܳۢܿ;->ۢ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳۢܿ;->ۢ:[I

    .line 281
    iget-object v0, p0, Ll/ܳۢܿ;->ܽ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳۢܿ;->ܽ:[I

    .line 282
    iget-object v0, p0, Ll/ܳۢܿ;->᩻:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳۢܿ;->᩻:[I

    .line 283
    iget-object v0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶۜܿ;

    iput-object v0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    .line 100
    :goto_0
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܳۢܿ;->᩷:I

    .line 101
    iget-object v1, p0, Ll/ܳۢܿ;->ۢ:[I

    aput p1, v1, v0

    .line 102
    iget-object p1, p0, Ll/ܳۢܿ;->ܽ:[I

    aput p2, p1, v0

    .line 103
    iget-object p1, p0, Ll/ܳۢܿ;->᩻:[I

    aput p3, p1, v0

    .line 104
    iget-object p1, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    aput-object p4, p1, v0

    return v0

    .line 278
    :cond_2
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p2, "Syntax context recorder capacity exceeded"

    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return p3

    .line 92
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Syntax context is outside its parent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_5
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string p4, "Invalid syntax context range: "

    const-string v0, ".."

    .line 0
    invoke-static {p4, p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 89
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final ֫(IIII)Ll/ܿۢܿ;
    .locals 7

    .line 140
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    if-gt p1, p2, :cond_1

    .line 141
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    if-gt p2, v0, :cond_1

    if-ltz p3, :cond_0

    if-lt p4, p3, :cond_0

    .line 144
    iget v0, p0, Ll/ܳۢܿ;->ۡ:I

    if-gt p4, v0, :cond_0

    .line 147
    new-instance v0, Ll/ܿۢܿ;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Ll/ܿۢܿ;-><init>(Ll/ܳۢܿ;IIII)V

    iput-object v0, p0, Ll/ܳۢܿ;->ۜ:Ll/ܿۢܿ;

    return-object v0

    .line 145
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax context clip range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 142
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax context clip nodes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/ᩳۢܿ;
    .locals 10

    .line 225
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 226
    iget-object v0, p0, Ll/ܳۢܿ;->ۢ:[I

    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    .line 227
    iget-object v0, p0, Ll/ܳۢܿ;->ܽ:[I

    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    .line 228
    iget-object v0, p0, Ll/ܳۢܿ;->᩻:[I

    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v7

    .line 229
    iget-object v0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Ll/ܶۜܿ;

    .line 262
    iget v0, p0, Ll/ܳۢܿ;->֫:I

    iget v1, p0, Ll/ܳۢܿ;->ۧ:I

    if-nez v1, :cond_0

    iget v2, p0, Ll/ܳۢܿ;->ۡ:I

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    .line 263
    aput v2, v5, v2

    sub-int v3, v0, v1

    .line 264
    aput v3, v6, v2

    const/4 v2, 0x1

    .line 265
    :goto_0
    iget v3, p0, Ll/ܳۢܿ;->᩷:I

    if-ge v2, v3, :cond_1

    .line 266
    aget v3, v5, v2

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int/2addr v3, v1

    aput v3, v5, v2

    .line 267
    aget v3, v6, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, v1

    aput v3, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 231
    :cond_1
    :goto_1
    new-instance v9, Ll/ᩳۢܿ;

    sub-int v3, v0, v1

    iget v4, p0, Ll/ܳۢܿ;->᩷:I

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ll/ᩳۢܿ;-><init>(II[I[I[I[Ll/ܶۜܿ;)V

    return-object v9
.end method

.method public final ֫(II)V
    .locals 2

    .line 121
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 122
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    if-eqz p1, :cond_1

    .line 126
    iget-object v0, p0, Ll/ܳۢܿ;->᩻:[I

    aget v0, v0, p1

    .line 127
    iget-object v1, p0, Ll/ܳۢܿ;->ۢ:[I

    aget v1, v1, p1

    if-le p2, v1, :cond_0

    iget-object v1, p0, Ll/ܳۢܿ;->ܽ:[I

    aget v0, v1, v0

    if-gt p2, v0, :cond_0

    .line 130
    aput p2, v1, p1

    const/4 p1, 0x1

    .line 132
    iput-boolean p1, p0, Ll/ܳۢܿ;->ܳ:Z

    return-void

    .line 128
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid syntax context end: "

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 128
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot update syntax context root"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IIIILl/ܶۜܿ;)Z
    .locals 2

    .line 111
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 112
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 113
    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Ll/ܳۢܿ;->֫(IIILl/ܶۜܿ;)I

    move-result p2

    if-ne p2, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 53
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 54
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 215
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 216
    iget v0, p0, Ll/ܳۢܿ;->᩷:I

    if-gt p1, v0, :cond_0

    .line 219
    iget-object v1, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 220
    iput p1, p0, Ll/ܳۢܿ;->᩷:I

    return-void

    .line 217
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid syntax context mark: "

    const-string v2, ", size="

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 217
    iget v1, p0, Ll/ܳۢܿ;->᩷:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Ll/۟᩷ܿ;
    .locals 11

    .line 249
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 250
    new-instance v10, Ll/۟᩷ܿ;

    iget v4, p0, Ll/ܳۢܿ;->᩷:I

    iget-object v5, p0, Ll/ܳۢܿ;->ۢ:[I

    iget-object v6, p0, Ll/ܳۢܿ;->ܽ:[I

    iget-object v7, p0, Ll/ܳۢܿ;->᩻:[I

    iget-object v8, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    iget-boolean v9, p0, Ll/ܳۢܿ;->ܳ:Z

    iget v1, p0, Ll/ܳۢܿ;->ۡ:I

    iget v2, p0, Ll/ܳۢܿ;->ۧ:I

    iget v3, p0, Ll/ܳۢܿ;->֫:I

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/۟᩷ܿ;-><init>(IIII[I[I[I[Ll/ܶۜܿ;Z)V

    const/4 v0, 0x1

    .line 253
    iput-boolean v0, p0, Ll/ܳۢܿ;->ᩳ:Z

    const/4 v0, 0x0

    .line 254
    iput-object v0, p0, Ll/ܳۢܿ;->᩻:[I

    iput-object v0, p0, Ll/ܳۢܿ;->ܽ:[I

    iput-object v0, p0, Ll/ܳۢܿ;->ۢ:[I

    .line 255
    iput-object v0, p0, Ll/ܳۢܿ;->ܿ:[Ll/ܶۜܿ;

    const/4 v0, 0x0

    .line 256
    iput v0, p0, Ll/ܳۢܿ;->᩷:I

    return-object v10
.end method

.method public final ᩳ()I
    .locals 1

    .line 59
    invoke-direct {p0}, Ll/ܳۢܿ;->ܿ()V

    .line 60
    iget v0, p0, Ll/ܳۢܿ;->ۡ:I

    return v0
.end method
