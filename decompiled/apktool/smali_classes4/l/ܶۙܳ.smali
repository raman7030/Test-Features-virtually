.class public final Ll/ܶۙܳ;
.super Ljava/lang/Object;
.source "B73K"

# interfaces
.implements Ll/۠ۙܳ;


# instance fields
.field public final ֫:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ܶۙܳ;->֫:[I

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ܶۙܳ;
    .locals 11

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 27
    new-instance p0, Ll/ܶۙܳ;

    filled-new-array {v1}, [I

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶۙܳ;-><init>([I)V

    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    new-array v0, v0, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 33
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x5c

    if-ge v4, v8, :cond_7

    .line 34
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v8

    .line 35
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int/2addr v4, v10

    if-eqz v5, :cond_1

    add-int/lit8 v5, v6, 0x1

    .line 37
    aput v8, v0, v6

    const/4 v6, 0x0

    move v6, v5

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    if-ne v8, v9, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/16 v9, 0x2a

    if-ne v8, v9, :cond_4

    if-eqz v6, :cond_3

    add-int/lit8 v7, v6, -0x1

    .line 43
    aget v7, v0, v7

    if-eq v7, v1, :cond_5

    :cond_3
    add-int/lit8 v7, v6, 0x1

    .line 44
    aput v1, v0, v6

    goto :goto_1

    :cond_4
    const/16 v9, 0x3f

    if-ne v8, v9, :cond_6

    add-int/lit8 v7, v6, 0x1

    const/4 v8, -0x2

    .line 48
    aput v8, v0, v6

    :goto_1
    move v6, v7

    :cond_5
    const/4 v7, 0x1

    goto :goto_0

    :cond_6
    add-int/lit8 v9, v6, 0x1

    .line 50
    aput v8, v0, v6

    move v6, v9

    goto :goto_0

    :cond_7
    if-eqz v5, :cond_8

    add-int/lit8 p0, v6, 0x1

    .line 54
    aput v9, v0, v6

    move v6, p0

    :cond_8
    if-nez v7, :cond_9

    add-int/lit8 p0, v6, 0x2

    .line 58
    new-array p0, p0, [I

    .line 59
    aput v1, p0, v2

    .line 60
    invoke-static {v0, v2, p0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v6, v3

    .line 61
    aput v1, p0, v6

    .line 62
    new-instance v0, Ll/ܶۙܳ;

    invoke-direct {v0, p0}, Ll/ܶۙܳ;-><init>([I)V

    return-object v0

    .line 64
    :cond_9
    new-instance p0, Ll/ܶۙܳ;

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶۙܳ;-><init>([I)V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    .line 76
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    iget-object v7, p0, Ll/ܶۙܳ;->֫:[I

    if-ge v2, v6, :cond_5

    .line 77
    array-length v6, v7

    if-ge v3, v6, :cond_3

    .line 78
    aget v6, v7, v3

    if-ne v6, v1, :cond_0

    add-int/lit8 v4, v3, 0x1

    move v5, v2

    move v9, v4

    move v4, v3

    move v3, v9

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    const/4 v8, -0x2

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v6}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v6

    .line 113
    invoke-static {v7}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v8

    if-eq v6, v8, :cond_2

    .line 115
    invoke-static {v6}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v6

    invoke-static {v8}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v8

    if-ne v6, v8, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 87
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v2, v6

    goto :goto_0

    :cond_3
    if-eq v4, v1, :cond_7

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v5, v2, :cond_4

    goto :goto_3

    .line 94
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 95
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v5, v2

    add-int/lit8 v3, v4, 0x1

    move v2, v5

    goto :goto_0

    .line 99
    :cond_5
    :goto_2
    array-length p1, v7

    if-ge v3, p1, :cond_6

    aget p1, v7, v3

    if-ne p1, v1, :cond_6

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 102
    :cond_6
    array-length p1, v7

    if-ne v3, p1, :cond_7

    const/4 p1, 0x1

    return p1

    :cond_7
    :goto_3
    return v0
.end method
