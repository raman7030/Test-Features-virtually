.class public final Ll/ܽۘܿ;
.super Ljava/lang/Object;
.source "36ZX"


# static fields
.field public static final ۜ:[Ll/᩶ۘܿ;

.field public static final ᩻:[I


# instance fields
.field public final ֫:[I

.field public final ۧ:[Ll/᩶ۘܿ;

.field public final ܳ:I

.field public final ܽ:Ll/᩺ܺܿ;

.field public final ܿ:[Ll/᩶ۘܿ;

.field public final ᩳ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 15
    sput-object v1, Ll/ܽۘܿ;->᩻:[I

    new-array v0, v0, [Ll/᩶ۘܿ;

    .line 16
    sput-object v0, Ll/ܽۘܿ;->ۜ:[Ll/᩶ۘܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "program"

    .line 28
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    const-string p1, "offsets"

    .line 29
    invoke-static {p3, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object p1, p3

    check-cast p1, [I

    iput-object p1, p0, Ll/ܽۘܿ;->֫:[I

    const-string p1, "prefixes"

    .line 30
    invoke-static {p4, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object p1, p4

    check-cast p1, [Ll/᩶ۘܿ;

    iput-object p1, p0, Ll/ܽۘܿ;->ۧ:[Ll/᩶ۘܿ;

    .line 31
    iput-object p5, p0, Ll/ܽۘܿ;->ᩳ:[I

    .line 32
    iput-object p6, p0, Ll/ܽۘܿ;->ܿ:[Ll/᩶ۘܿ;

    if-ltz p2, :cond_2

    .line 33
    array-length p1, p3

    const/16 v0, 0x400

    if-gt p1, v0, :cond_2

    array-length p1, p4

    array-length p4, p3

    if-ne p1, p4, :cond_2

    array-length p1, p5

    array-length p4, p3

    if-ne p1, p4, :cond_2

    array-length p1, p6

    array-length p4, p3

    if-ne p1, p4, :cond_2

    .line 38
    array-length p1, p3

    const/4 p4, 0x0

    const/4 p5, 0x0

    :goto_0
    if-ge p4, p1, :cond_1

    aget p6, p3, p4

    if-le p6, p5, :cond_0

    if-ge p6, p2, :cond_0

    add-int/lit8 p4, p4, 0x1

    move p5, p6

    goto :goto_0

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax window restart offset"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_1
    iput p2, p0, Ll/ܽۘܿ;->ܳ:I

    return-void

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax window restart index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;I)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p6}, Ll/ܽۘܿ;-><init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۘܿ;->֫:[I

    return-object p0
.end method

.method public static ۧ(Ll/᩺ܺܿ;I)Ll/ܽۘܿ;
    .locals 8

    .line 49
    new-instance v7, Ll/ܽۘܿ;

    sget-object v5, Ll/ܽۘܿ;->᩻:[I

    sget-object v6, Ll/ܽۘܿ;->ۜ:[Ll/᩶ۘܿ;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move-object v3, v5

    move-object v4, v6

    invoke-direct/range {v0 .. v6}, Ll/ܽۘܿ;-><init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;)V

    return-object v7
.end method

.method public static bridge synthetic ۧ(Ll/ܽۘܿ;)[Ll/᩶ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۘܿ;->ۧ:[Ll/᩶ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܽۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽۘܿ;->ܳ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܽۘܿ;)Ll/᩺ܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܽۘܿ;)[Ll/᩶ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۘܿ;->ܿ:[Ll/᩶ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܽۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۘܿ;->ᩳ:[I

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܶۘܿ;I)I
    .locals 3

    .line 129
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ۧ(I)I

    move-result v0

    if-gt p2, v0, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    sget-object v0, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p1, p2, v0}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;)I

    move-result p2

    .line 131
    iget-object v0, p0, Ll/ܽۘܿ;->֫:[I

    invoke-static {v0, p2}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-ltz v0, :cond_1

    .line 132
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p1, v2}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result p1

    if-le p2, p1, :cond_1

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ֫(Ll/᩺ܺܿ;I)I
    .locals 5

    const-string v0, "expectedProgram"

    .line 65
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    iget-object v0, p0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    const/4 v1, -0x1

    if-eq v0, p1, :cond_0

    return v1

    .line 67
    :cond_0
    iget p1, p0, Ll/ܽۘܿ;->ܳ:I

    invoke-static {p2, p2, p1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 69
    iget-object p1, p0, Ll/ܽۘܿ;->֫:[I

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v0, :cond_2

    add-int v3, v2, v0

    ushr-int/lit8 v3, v3, 0x1

    .line 72
    aget v4, p1, v3

    if-gt v4, p2, :cond_1

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v3, -0x1

    goto :goto_0

    :cond_2
    if-gez v0, :cond_3

    return v1

    .line 78
    :cond_3
    aget p1, p1, v0

    return p1
.end method

.method public final ֫(Ll/ܶۘܿ;ILl/ܽۘܿ;Ll/᩶ۘܿ;ILl/᩶ۘܿ;)Ll/֫ۘܿ;
    .locals 6

    .line 138
    iget-object v0, p0, Ll/ܽۘܿ;->֫:[I

    aget v1, v0, p2

    .line 140
    new-instance v2, Ll/ۧۘܿ;

    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v3

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    invoke-direct {v2, v5, v3, v4, p3}, Ll/ۧۘܿ;-><init>(Ll/᩺ܺܿ;IILl/ܽۘܿ;)V

    .line 141
    new-instance p3, Ll/᩹ۘܿ;

    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v3

    invoke-direct {p3, v3}, Ll/᩹ۘܿ;-><init>(I)V

    .line 142
    invoke-virtual {p3, p4}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 143
    sget-object v3, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p1, v1, v3}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v3

    .line 144
    invoke-static {v2, v3, p4, p5, p6}, Ll/ۧۘܿ;->֫(Ll/ۧۘܿ;ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V

    add-int/lit8 p2, p2, 0x1

    move p4, v1

    .line 145
    :goto_0
    array-length p5, v0

    if-ge p2, p5, :cond_1

    .line 146
    iget-object p5, p0, Ll/ܽۘܿ;->ܿ:[Ll/᩶ۘܿ;

    aget-object p5, p5, p2

    if-eqz p5, :cond_1

    iget-object p6, p0, Ll/ܽۘܿ;->ᩳ:[I

    aget v3, p6, p2

    if-lt v3, v1, :cond_1

    if-le v3, p4, :cond_0

    goto :goto_1

    .line 148
    :cond_0
    :try_start_0
    invoke-virtual {p5, p1, v3}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;I)Ll/᩶ۘܿ;

    move-result-object p5

    .line 149
    aget p6, p6, p2

    sget-object v3, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p1, p6, v3}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result p6

    .line 150
    aget v4, v0, p2

    invoke-virtual {p1, v4, v3}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v3

    .line 151
    invoke-virtual {p3, p5}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    invoke-virtual {p3}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v4

    invoke-static {v2, v3, v4, p6, p5}, Ll/ۧۘܿ;->֫(Ll/ۧۘܿ;ILl/᩶ۘܿ;ILl/᩶ۘܿ;)V

    .line 152
    aget p4, v0, p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 157
    :catch_0
    :cond_1
    :goto_1
    new-instance p1, Ll/֫ۘܿ;

    invoke-virtual {v2}, Ll/ۧۘܿ;->ۧ()Ll/ܽۘܿ;

    move-result-object p2

    invoke-direct {p1, p2, v1, p4}, Ll/֫ۘܿ;-><init>(Ll/ܽۘܿ;II)V

    return-object p1
.end method

.method public final ֫(Ll/ܶۘܿ;)Ll/ܽۘܿ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 91
    invoke-virtual/range {p1 .. p1}, Ll/ܶۘܿ;->ܿ()I

    move-result v2

    iget v3, v0, Ll/ܽۘܿ;->ܳ:I

    if-ne v2, v3, :cond_5

    .line 94
    iget-object v2, v0, Ll/ܽۘܿ;->֫:[I

    array-length v4, v2

    new-array v4, v4, [I

    .line 95
    array-length v5, v2

    new-array v5, v5, [I

    .line 96
    array-length v6, v2

    new-array v6, v6, [Ll/᩶ۘܿ;

    .line 97
    array-length v7, v2

    new-array v7, v7, [Ll/᩶ۘܿ;

    .line 99
    invoke-virtual/range {p1 .. p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ܶۘܿ;->ۧ()I

    move-result v3

    :goto_0
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 100
    :goto_1
    array-length v10, v2

    if-ge v8, v10, :cond_4

    aget v10, v2, v8

    if-ge v10, v3, :cond_4

    .line 101
    iget-object v10, v0, Ll/ܽۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object v10, v10, v8

    if-eqz v10, :cond_3

    .line 102
    invoke-virtual {v10}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v11

    sget-object v12, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne v11, v12, :cond_3

    .line 103
    invoke-virtual {v10, v1}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_2

    .line 105
    :cond_1
    :try_start_0
    invoke-virtual {v10, v1}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object v10

    aput-object v10, v7, v9

    .line 106
    iget-object v10, v0, Ll/ܽۘܿ;->ᩳ:[I

    aget v10, v10, v8

    aput v10, v5, v9

    .line 107
    iget-object v10, v0, Ll/ܽۘܿ;->ܿ:[Ll/᩶ۘܿ;

    aget-object v10, v10, v8
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v10, :cond_2

    .line 108
    :try_start_1
    invoke-virtual {v10, v1}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object v10

    aput-object v10, v6, v9
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    add-int/lit8 v10, v9, 0x1

    .line 111
    :try_start_2
    aget v11, v2, v8

    aput v11, v4, v9
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move v9, v10

    :catch_2
    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 116
    :cond_4
    new-instance v2, Ll/ܽۘܿ;

    invoke-virtual/range {p1 .. p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v12

    .line 117
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v13

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, [Ll/᩶ۘܿ;

    .line 118
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v15

    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, [Ll/᩶ۘܿ;

    iget-object v11, v0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, Ll/ܽۘܿ;-><init>(Ll/᩺ܺܿ;I[I[Ll/᩶ۘܿ;[I[Ll/᩶ۘܿ;)V

    return-object v2

    .line 92
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Restart index and edit lengths differ"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(I)Ll/᩶ۘܿ;
    .locals 3

    const/4 v0, 0x0

    .line 83
    :goto_0
    iget-object v1, p0, Ll/ܽۘܿ;->֫:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 84
    aget v1, v1, v0

    if-lt v1, p1, :cond_0

    iget-object v1, p0, Ll/ܽۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/᩺ܺܿ;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ܽۘܿ;->ܽ:Ll/᩺ܺܿ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ܽۘܿ;->ܳ:I

    return v0
.end method

.method public final ۧ(Ll/ܶۘܿ;)Z
    .locals 3

    .line 123
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽۘܿ;->֫:[I

    array-length v1, v0

    if-eqz v1, :cond_0

    array-length v1, v0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    aget v0, v0, v1

    .line 124
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result p1

    if-le v0, p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
