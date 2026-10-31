.class public final Ll/۟᩷ܽ;
.super Ljava/lang/Object;
.source "86A1"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 6

    .line 222
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 223
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 224
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ܽ;

    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    mul-int/lit8 v2, v0, 0x4

    .line 225
    :goto_0
    array-length v3, p1

    if-ge v0, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 226
    aget-byte v4, v1, v2

    not-int v4, v4

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v5, v2, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v4

    add-int/lit8 v4, v2, 0x3

    aget-byte v5, v1, v5

    not-int v5, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x4

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    aput v3, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
