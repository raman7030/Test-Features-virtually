.class public abstract Ll/ܶܿᩴ;
.super Ll/֨ܿᩴ;
.source "TPA"

# interfaces
.implements Ll/֫ۢᩴ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x189cf424fb7d7759L


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 185
    invoke-interface {p0}, Ll/֫ۢᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final entrySet()Ll/ᩴۚᩴ;
    .locals 1

    .line 185
    invoke-interface {p0}, Ll/֫ۢᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-interface {p0}, Ll/֫ۢᩴ;->ۡ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Integer;

    .line 105
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֫ۢᩴ;->᩻(I)Ll/֫ۢᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .line 1308
    invoke-interface {p0}, Ll/֫ۢᩴ;->keySet()Ll/֫ܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 140
    invoke-interface {p0}, Ll/֫ۢᩴ;->ۛ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p0, p1, p2}, Ll/֫ۢᩴ;->ۧ(II)Ll/֫ۢᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Integer;

    .line 118
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֫ۢᩴ;->ۡ(I)Ll/֫ۢᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۜ()Ll/ᩴۚᩴ;
    .locals 1

    .line 1308
    invoke-interface {p0}, Ll/֫ۢᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method
