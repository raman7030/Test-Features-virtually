.class public final Ll/֫ۢܽ;
.super Ljava/lang/Object;
.source "86A1"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 8

    .line 206
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 207
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    .line 208
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ܽ;

    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    mul-int/lit8 v2, v0, 0x4

    .line 209
    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 210
    aget v4, v1, v0

    not-int v5, v4

    and-int/lit16 v6, v5, 0xff

    int-to-byte v6, v6

    aput-byte v6, p1, v2

    add-int/lit8 v6, v2, 0x2

    ushr-int/lit8 v7, v4, 0x8

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 211
    aput-byte v7, p1, v3

    add-int/lit8 v3, v2, 0x3

    ushr-int/lit8 v5, v5, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 212
    aput-byte v5, p1, v6

    add-int/lit8 v2, v2, 0x4

    ushr-int/lit8 v4, v4, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    .line 213
    aput-byte v4, p1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
