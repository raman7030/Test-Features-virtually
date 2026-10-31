.class public final Ll/۟ۖܿ;
.super Ljava/lang/Object;
.source "I6ZU"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/ۢۖܿ;

.field public final ܿ:Ll/ۢۖܿ;

.field public final ᩳ:Ll/ᩳۢܿ;


# direct methods
.method public constructor <init>(Ll/ۢۖܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    const/4 v0, -0x1

    if-eq p4, v0, :cond_3

    if-ne p5, v0, :cond_0

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result p1

    invoke-static {p4, p5, p1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-eqz p2, :cond_2

    .line 36
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result p1

    sub-int v0, p5, p4

    if-ne p1, v0, :cond_2

    if-eqz p3, :cond_4

    .line 39
    invoke-virtual {p3}, Ll/ᩳۢܿ;->ۧ()I

    move-result p1

    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v0

    if-ne p1, v0, :cond_1

    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window context coverage differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window style coverage differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    if-ne p4, v0, :cond_6

    if-ne p5, v0, :cond_6

    if-nez p2, :cond_5

    if-nez p3, :cond_5

    .line 43
    :cond_4
    :goto_1
    iput-object p2, p0, Ll/۟ۖܿ;->ܿ:Ll/ۢۖܿ;

    .line 44
    iput-object p3, p0, Ll/۟ۖܿ;->ᩳ:Ll/ᩳۢܿ;

    .line 45
    iput p4, p0, Ll/۟ۖܿ;->ۧ:I

    .line 46
    iput p5, p0, Ll/۟ۖܿ;->֫:I

    return-void

    .line 32
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown syntax coverage cannot retain window state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Incomplete unknown syntax coverage sentinel"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IIIIII)J
    .locals 17

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    if-ltz v1, :cond_8

    if-ltz v2, :cond_8

    if-ltz v3, :cond_8

    int-to-long v6, v1

    int-to-long v8, v2

    add-long v10, v6, v8

    int-to-long v12, v0

    cmp-long v14, v10, v12

    if-gtz v14, :cond_8

    .line 237
    invoke-static {v4, v5, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    sub-int/2addr v0, v2

    int-to-long v12, v0

    int-to-long v2, v3

    add-long/2addr v12, v2

    long-to-int v0, v12

    int-to-long v14, v0

    cmp-long v16, v12, v14

    if-nez v16, :cond_7

    add-long v12, v6, v2

    sub-long/2addr v2, v8

    if-gt v4, v1, :cond_0

    int-to-long v6, v4

    goto :goto_0

    :cond_0
    int-to-long v8, v4

    cmp-long v16, v8, v10

    if-ltz v16, :cond_1

    add-long v6, v8, v2

    :cond_1
    :goto_0
    sub-int v2, v5, v4

    .line 251
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v2, v0

    sub-long/2addr v14, v2

    .line 253
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    if-gt v1, v5, :cond_4

    int-to-long v0, v4

    cmp-long v4, v10, v0

    if-ltz v4, :cond_4

    cmp-long v0, v12, v6

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    add-long v0, v6, v2

    cmp-long v4, v12, v0

    if-lez v4, :cond_3

    sub-long/2addr v12, v2

    goto :goto_1

    :cond_3
    move-wide v12, v6

    .line 261
    :goto_1
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    :cond_4
    long-to-int v0, v6

    int-to-long v0, v0

    cmp-long v4, v6, v0

    if-nez v4, :cond_6

    add-long/2addr v2, v0

    long-to-int v4, v2

    int-to-long v4, v4

    cmp-long v6, v2, v4

    if-nez v6, :cond_5

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 0
    :cond_5
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 235
    :cond_8
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid syntax target edit range"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(IILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩸᩷ܿ;)Ll/۟ۖܿ;
    .locals 9

    const-string v0, "windowStyles"

    .line 69
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "defaultStyle"

    .line 70
    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v0

    int-to-long v1, p1

    int-to-long v3, v0

    add-long/2addr v1, v3

    long-to-int v8, v1

    int-to-long v3, v8

    cmp-long v0, v1, v3

    if-nez v0, :cond_0

    .line 72
    invoke-static {p1, v8, p0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 73
    invoke-static {p1, p4}, Ll/۟ۖܿ;->֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;

    move-result-object v0

    .line 74
    invoke-virtual {v0, p2}, Ll/ۢۖܿ;->֫(Ll/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    sub-int/2addr p0, v8

    .line 75
    invoke-static {p0, p4}, Ll/۟ۖܿ;->֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۢۖܿ;->֫(Ll/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v4

    .line 76
    new-instance p0, Ll/۟ۖܿ;

    move-object v3, p0

    move-object v5, p2

    move-object v6, p3

    move v7, p1

    invoke-direct/range {v3 .. v8}, Ll/۟ۖܿ;-><init>(Ll/ۢۖܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method

.method public static ֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;
    .locals 1

    if-nez p0, :cond_0

    .line 223
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 224
    invoke-static {p0, p1, v0}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(ILl/᩸᩷ܿ;)Ll/۟ۖܿ;
    .locals 7

    if-ltz p0, :cond_0

    const-string v0, "defaultStyle"

    .line 126
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    new-instance v0, Ll/۟ۖܿ;

    invoke-static {p0, p1}, Ll/۟ۖܿ;->֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;

    move-result-object v2

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/۟ۖܿ;-><init>(Ll/ۢۖܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V

    return-object v0

    .line 124
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative provisional syntax length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 108
    iget v0, p0, Ll/۟ۖܿ;->֫:I

    return v0
.end method

.method public final ֫(IIIIILl/᩸᩷ܿ;)Ll/ܰۖܿ;
    .locals 8

    const-string v0, "defaultStyle"

    .line 158
    invoke-static {p6, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    iget-object v0, p0, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ltz p1, :cond_5

    if-ltz p2, :cond_5

    if-ltz p3, :cond_5

    int-to-long v2, p1

    int-to-long v4, p2

    add-long/2addr v2, v4

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-gtz v6, :cond_5

    .line 164
    invoke-static {p4, p5, v1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 166
    new-instance p1, Ll/ܰۖܿ;

    invoke-direct {p1, p0, p4, p5}, Ll/ܰۖܿ;-><init>(Ll/۟ۖܿ;II)V

    return-object p1

    :cond_0
    sub-int v2, v1, p2

    int-to-long v2, v2

    int-to-long v4, p3

    add-long/2addr v2, v4

    long-to-int v7, v2

    int-to-long v4, v7

    cmp-long v6, v2, v4

    if-nez v6, :cond_4

    if-lez p1, :cond_1

    if-lez p3, :cond_1

    add-int/lit8 v2, p1, -0x1

    .line 170
    invoke-virtual {v0, v2}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, p6

    .line 171
    :goto_0
    invoke-static {p3, v2}, Ll/۟ۖܿ;->֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;

    move-result-object v2

    add-int v3, p1, p2

    .line 172
    invoke-virtual {v0, p1, v3, v2}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v2

    if-ne v2, v7, :cond_3

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 177
    invoke-static/range {v1 .. v6}, Ll/۟ۖܿ;->֫(IIIIII)J

    move-result-wide p1

    const/16 p3, 0x20

    ushr-long p3, p1, p3

    long-to-int p4, p3

    long-to-int p2, p1

    .line 182
    invoke-virtual {v0}, Ll/ۢۖܿ;->ۧ()I

    move-result p1

    int-to-long v1, p1

    int-to-long v3, p2

    int-to-long v5, p4

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x2

    add-long/2addr v3, v5

    cmp-long p1, v1, v3

    if-lez p1, :cond_2

    .line 183
    invoke-static {v7, p6}, Ll/۟ۖܿ;->֫(ILl/᩸᩷ܿ;)Ll/ۢۖܿ;

    move-result-object v0

    :cond_2
    move-object v2, v0

    .line 185
    new-instance p1, Ll/۟ۖܿ;

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Ll/۟ۖܿ;-><init>(Ll/ۢۖܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V

    .line 187
    new-instance p3, Ll/ܰۖܿ;

    invoke-direct {p3, p1, p4, p2}, Ll/ܰۖܿ;-><init>(Ll/۟ۖܿ;II)V

    return-object p3

    .line 175
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Edited syntax projection length differs"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 0
    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid syntax projection edit range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۟ۖܿ;)Ll/᩺ۖܿ;
    .locals 9

    .line 194
    iget v0, p0, Ll/۟ۖܿ;->ۧ:I

    const/4 v1, -0x1

    iget v2, p0, Ll/۟ۖܿ;->֫:I

    if-nez p1, :cond_0

    .line 195
    invoke-static {v1, v1, v0, v2}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    .line 194
    :cond_0
    iget v3, p1, Ll/۟ۖܿ;->ۧ:I

    iget-object v4, p1, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    iget v5, p1, Ll/۟ۖܿ;->֫:I

    .line 198
    invoke-virtual {v4}, Ll/ۢۖܿ;->֫()I

    move-result v6

    iget-object v7, p0, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    invoke-virtual {v7}, Ll/ۢۖܿ;->֫()I

    move-result v8

    if-ne v6, v8, :cond_6

    .line 201
    invoke-virtual {p0}, Ll/۟ۖܿ;->᩻()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {p1}, Ll/۟ۖܿ;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    if-ne v3, v0, :cond_4

    if-ne v5, v2, :cond_4

    .line 207
    invoke-virtual {v4, v7}, Ll/ۢۖܿ;->ۧ(Ll/ۢۖܿ;)Ll/ܳۖܿ;

    move-result-object p1

    .line 208
    sget-object v3, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    if-nez p1, :cond_2

    return-object v3

    .line 211
    :cond_2
    invoke-virtual {p1}, Ll/ܳۖܿ;->ܽ()I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 212
    invoke-virtual {p1}, Ll/ܳۖܿ;->֫()I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge v0, p1, :cond_3

    .line 214
    invoke-static {v1, v1, v0, p1}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v3

    .line 217
    :cond_4
    invoke-static {v3, v5, v0, v2}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    .line 202
    :cond_5
    :goto_0
    invoke-static {v3, v5, v0, v2}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    .line 199
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Window projection text length differs"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)Z
    .locals 1

    .line 133
    iget-object v0, p0, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 134
    invoke-virtual {p0}, Ll/۟ۖܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۟ۖܿ;->ۧ:I

    if-gt v0, p1, :cond_0

    iget p1, p0, Ll/۟ۖܿ;->֫:I

    if-gt p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 103
    iget v0, p0, Ll/۟ۖܿ;->ۧ:I

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 139
    invoke-virtual {p0}, Ll/۟ۖܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۟ۖܿ;->ᩳ:Ll/ᩳۢܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ۢۖܿ;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۟ۖܿ;->ܽ:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ܿ()Ll/ۢۖܿ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/۟ۖܿ;->ܿ:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ᩳ()Ll/ᩳۢܿ;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/۟ۖܿ;->ᩳ:Ll/ᩳۢܿ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 98
    iget v0, p0, Ll/۟ۖܿ;->ۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
