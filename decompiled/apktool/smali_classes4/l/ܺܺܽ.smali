.class public final Ll/ܺܺܽ;
.super Ljava/lang/Object;
.source "G53U"


# instance fields
.field public ֫:[Ljava/lang/Object;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x28

    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    iput-object v0, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Ll/ܺܺܽ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 26
    iget-object v0, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ܺܺܽ;->ۧ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ֫(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 37
    iget v0, p0, Ll/ܺܺܽ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺܺܽ;->ۧ:I

    iget-object v1, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    .line 39
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    .line 40
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    :cond_0
    iget-object v0, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ܺܺܽ;->ۧ:I

    aput-object p1, v0, v1

    return-void
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 4

    .line 31
    iget-object v0, p0, Ll/ܺܺܽ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ܺܺܽ;->ۧ:I

    aget-object v2, v0, v1

    add-int/lit8 v3, v1, -0x1

    .line 32
    iput v3, p0, Ll/ܺܺܽ;->ۧ:I

    const/4 v3, 0x0

    aput-object v3, v0, v1

    return-object v2
.end method
