.class public final Ll/᩶ۜ֨;
.super Ljava/lang/Object;
.source "41SC"


# instance fields
.field public final ֫:I

.field public final ۧ:[B


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0x100

    if-gt p1, v0, :cond_0

    .line 20
    iput p1, p0, Ll/᩶ۜ֨;->֫:I

    .line 21
    new-array p1, p1, [B

    iput-object p1, p0, Ll/᩶ۜ֨;->ۧ:[B

    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid distance: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 7

    .line 17
    iget v0, p0, Ll/᩶ۜ֨;->֫:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Ll/᩶ۜ֨;->ۧ:[B

    if-ge v3, v1, :cond_0

    add-int v5, p1, v3

    .line 18
    aget-byte v6, p3, v5

    aget-byte v4, v4, v3

    add-int/2addr v6, v4

    int-to-byte v4, v6

    aput-byte v4, p3, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, p2, :cond_1

    add-int v1, p1, v3

    .line 23
    aget-byte v5, p3, v1

    sub-int v6, v1, v0

    aget-byte v6, p3, v6

    add-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, p3, v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    if-lt p2, v0, :cond_2

    add-int/2addr p1, p2

    sub-int/2addr p1, v0

    .line 28
    invoke-static {p3, p1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_2
    sub-int v1, v0, v3

    .line 33
    invoke-static {v4, v3, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v3

    .line 36
    invoke-static {p3, p1, v4, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
