.class public final Ll/ۨۤ᩵;
.super Ljava/lang/Object;
.source "HAWG"


# instance fields
.field public ֫:[Ljava/lang/Object;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Ll/ۨۤ᩵;->֫:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜ۬᩵;)V
    .locals 11

    .line 15
    iget-object v0, p0, Ll/ۨۤ᩵;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۨۤ᩵;->ܽ:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 16
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v1

    iput p1, p0, Ll/ۨۤ᩵;->ܽ:I

    .line 17
    iget v3, p0, Ll/ۨۤ᩵;->ۧ:I

    if-ne p1, v3, :cond_0

    .line 36
    array-length p1, v0

    shl-int/lit8 v1, p1, 0x1

    .line 38
    new-array v10, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v2, 0x0

    move-object v1, v10

    .line 39
    invoke-static/range {v0 .. v5}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    .line 43
    iget-object v4, p0, Ll/ۨۤ᩵;->֫:[Ljava/lang/Object;

    .line 45
    array-length v0, v4

    iget v8, p0, Ll/ۨۤ᩵;->ۧ:I

    sub-int v6, v0, v8

    const/4 v7, 0x0

    const/4 v9, 0x4

    move-object v5, v10

    .line 43
    invoke-static/range {v4 .. v9}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    .line 48
    iput-object v10, p0, Ll/ۨۤ᩵;->֫:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Ll/ۨۤ᩵;->ۧ:I

    .line 50
    iput p1, p0, Ll/ۨۤ᩵;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 12
    iget v0, p0, Ll/ۨۤ᩵;->ۧ:I

    iget v1, p0, Ll/ۨۤ᩵;->ܽ:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 4

    .line 22
    iget v0, p0, Ll/ۨۤ᩵;->ۧ:I

    iget v1, p0, Ll/ۨۤ᩵;->ܽ:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return-object v2

    .line 23
    :cond_0
    iget-object v1, p0, Ll/ۨۤ᩵;->֫:[Ljava/lang/Object;

    aget-object v3, v1, v0

    .line 24
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 25
    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۨۤ᩵;->ۧ:I

    if-eqz v3, :cond_1

    return-object v3

    .line 26
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
