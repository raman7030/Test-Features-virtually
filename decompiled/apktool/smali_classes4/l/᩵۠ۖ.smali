.class public final Ll/᩵۠ۖ;
.super Ljava/lang/Object;
.source "026V"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ۘ۠ۖ;


# direct methods
.method public constructor <init>(Ll/ۘ۠ۖ;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/᩵۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵۠ۖ;->֫:Ljava/util/ArrayList;

    .line 36
    new-instance v1, Ll/ᩴ۠ۖ;

    const/4 v2, 0x1

    filled-new-array {v2}, [I

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final ֫(I[I)V
    .locals 9

    if-eqz p1, :cond_3

    .line 56
    array-length v0, p2

    sub-int/2addr v0, p1

    if-lez v0, :cond_2

    .line 40
    iget-object v1, p0, Ll/᩵۠ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, p0, Ll/᩵۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    const/4 v4, 0x1

    if-lt p1, v2, :cond_0

    .line 0
    invoke-static {v1, v4}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 41
    check-cast v2, Ll/ᩴ۠ۖ;

    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    :goto_0
    if-gt v5, p1, :cond_0

    .line 43
    new-instance v6, Ll/ᩴ۠ۖ;

    add-int/lit8 v7, v5, -0x1

    .line 44
    invoke-virtual {v3}, Ll/ۘ۠ۖ;->֫()I

    move-result v8

    add-int/2addr v8, v7

    invoke-virtual {v3, v8}, Ll/ۘ۠ۖ;->֫(I)I

    move-result v7

    filled-new-array {v4, v7}, [I

    move-result-object v7

    invoke-direct {v6, v3, v7}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    .line 43
    invoke-virtual {v2, v6}, Ll/ᩴ۠ۖ;->ܽ(Ll/ᩴ۠ۖ;)Ll/ᩴ۠ۖ;

    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۠ۖ;

    .line 61
    new-array v2, v0, [I

    const/4 v5, 0x0

    .line 62
    invoke-static {p2, v5, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    new-instance v6, Ll/ᩴ۠ۖ;

    invoke-direct {v6, v3, v2}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    .line 64
    invoke-virtual {v6, p1, v4}, Ll/ᩴ۠ۖ;->֫(II)Ll/ᩴ۠ۖ;

    move-result-object v2

    .line 65
    invoke-virtual {v2, v1}, Ll/ᩴ۠ۖ;->ۧ(Ll/ᩴ۠ۖ;)[Ll/ᩴ۠ۖ;

    move-result-object v1

    aget-object v1, v1, v4

    .line 66
    invoke-virtual {v1}, Ll/ᩴ۠ۖ;->֫()[I

    move-result-object v1

    .line 67
    array-length v2, v1

    sub-int/2addr p1, v2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    add-int v3, v0, v2

    .line 69
    aput v5, p2, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/2addr v0, p1

    .line 71
    array-length p1, v1

    invoke-static {v1, v5, p2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No data bytes provided"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No error correction bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
