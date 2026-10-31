.class public final Ll/ۢ֫ܿ;
.super Ljava/lang/Object;
.source "S708"


# static fields
.field public static final ᩳ:[I


# instance fields
.field public final ֫:[I

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 11
    sput-object v0, Ll/ۢ֫ܿ;->ᩳ:[I

    return-void
.end method

.method public constructor <init>(II[I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p3, p0, Ll/ۢ֫ܿ;->֫:[I

    .line 20
    iput p1, p0, Ll/ۢ֫ܿ;->ۧ:I

    .line 21
    iput p2, p0, Ll/ۢ֫ܿ;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ܽ()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۢ֫ܿ;->ᩳ:[I

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 25
    iget v0, p0, Ll/ۢ֫ܿ;->ۧ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 38
    iget v0, p0, Ll/ۢ֫ܿ;->ۧ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    .line 39
    iget-object v0, p0, Ll/ۢ֫ܿ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)I
    .locals 2

    .line 79
    iget v0, p0, Ll/ۢ֫ܿ;->ܽ:I

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 80
    invoke-virtual {p0, p1}, Ll/ۢ֫ܿ;->ܽ(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 84
    invoke-virtual {p0, p2}, Ll/ۢ֫ܿ;->ܽ(I)I

    move-result p1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final ֫(III)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    if-ltz v2, :cond_a

    if-ltz v3, :cond_a

    if-ltz v1, :cond_9

    .line 95
    iget v4, v0, Ll/ۢ֫ܿ;->ܽ:I

    if-gt v1, v4, :cond_9

    sub-int v5, v4, v1

    if-gt v2, v5, :cond_9

    sub-int/2addr v4, v2

    int-to-long v4, v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    long-to-int v8, v4

    int-to-long v9, v8

    cmp-long v11, v4, v9

    if-nez v11, :cond_8

    if-nez v2, :cond_0

    if-nez v3, :cond_0

    return-void

    :cond_0
    add-int v3, v1, v2

    int-to-long v4, v2

    sub-long/2addr v6, v4

    long-to-int v4, v6

    int-to-long v4, v4

    cmp-long v9, v6, v4

    if-nez v9, :cond_7

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 106
    :goto_0
    iget v9, v0, Ll/ۢ֫ܿ;->ۧ:I

    if-ge v6, v9, :cond_6

    shl-int/lit8 v9, v6, 0x1

    .line 107
    iget-object v10, v0, Ll/ۢ֫ܿ;->֫:[I

    aget v11, v10, v9

    add-int/lit8 v9, v9, 0x1

    .line 108
    aget v9, v10, v9

    if-nez v2, :cond_1

    if-ge v11, v1, :cond_2

    if-ge v1, v9, :cond_2

    goto :goto_2

    :cond_1
    if-ge v11, v3, :cond_2

    if-ge v1, v9, :cond_2

    goto :goto_2

    :cond_2
    if-lt v11, v3, :cond_5

    int-to-long v11, v11

    add-long/2addr v11, v4

    long-to-int v13, v11

    int-to-long v14, v13

    cmp-long v16, v11, v14

    if-nez v16, :cond_4

    int-to-long v11, v9

    add-long/2addr v11, v4

    long-to-int v9, v11

    int-to-long v14, v9

    cmp-long v16, v11, v14

    if-nez v16, :cond_3

    move v11, v13

    goto :goto_1

    .line 0
    :cond_3
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_4
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_5
    :goto_1
    shl-int/lit8 v12, v7, 0x1

    .line 119
    aput v11, v10, v12

    add-int/lit8 v12, v12, 0x1

    .line 120
    aput v9, v10, v12

    add-int/lit8 v7, v7, 0x1

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 123
    :cond_6
    iput v7, v0, Ll/ۢ֫ܿ;->ۧ:I

    .line 124
    iput v8, v0, Ll/ۢ֫ܿ;->ܽ:I

    return-void

    .line 0
    :cond_7
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 96
    :cond_9
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Search edit is outside the text"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 93
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Negative search edit length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۧ()I
    .locals 1

    .line 29
    iget v0, p0, Ll/ۢ֫ܿ;->ܽ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 5

    if-ltz p1, :cond_2

    .line 129
    iget v0, p0, Ll/ۢ֫ܿ;->ܽ:I

    if-gt p1, v0, :cond_2

    .line 49
    iget v0, p0, Ll/ۢ֫ܿ;->ۧ:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    shl-int/lit8 v3, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    .line 52
    iget-object v4, p0, Ll/ۢ֫ܿ;->֫:[I

    aget v3, v4, v3

    if-gt v3, p1, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    return v1

    .line 130
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Search position is outside the text"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(I)I
    .locals 4

    .line 66
    invoke-virtual {p0, p1}, Ll/ۢ֫ܿ;->ۧ(I)I

    move-result v0

    .line 67
    iget v1, p0, Ll/ۢ֫ܿ;->ۧ:I

    const/4 v2, -0x1

    iget-object v3, p0, Ll/ۢ֫ܿ;->֫:[I

    if-ge v0, v1, :cond_1

    shl-int/lit8 v1, v0, 0x1

    .line 68
    aget v1, v3, v1

    if-gt v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    return v2

    .line 70
    :cond_1
    iget v0, p0, Ll/ۢ֫ܿ;->ܽ:I

    if-ne p1, v0, :cond_2

    if-eqz v1, :cond_2

    add-int/lit8 p1, v1, -0x1

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget p1, v3, p1

    if-ne p1, v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 33
    iget v0, p0, Ll/ۢ֫ܿ;->ۧ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    shl-int/lit8 p1, p1, 0x1

    .line 34
    iget-object v0, p0, Ll/ۢ֫ܿ;->֫:[I

    aget p1, v0, p1

    return p1
.end method
