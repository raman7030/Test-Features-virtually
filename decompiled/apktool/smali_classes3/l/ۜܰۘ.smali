.class public abstract Ll/ۜܰۘ;
.super Ll/ܳܰۘ;
.source "CCCZ"

# interfaces
.implements Ll/֡֫ᩴ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x189cf424fb7d7759L


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 185
    invoke-interface {p0}, Ll/֡֫ᩴ;->ܳ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final entrySet()Ll/ᩴۚᩴ;
    .locals 1

    .line 185
    invoke-interface {p0}, Ll/֡֫ᩴ;->ܳ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-interface {p0}, Ll/֡֫ᩴ;->۬֫()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Character;

    .line 105
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-interface {p0, p1}, Ll/֡֫ᩴ;->ᩳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 140
    invoke-interface {p0}, Ll/֡֫ᩴ;->ܳ֫()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-interface {p0, p1, p2}, Ll/֡֫ᩴ;->ۧ(CC)Ll/֡֫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Character;

    .line 118
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-interface {p0, p1}, Ll/֡֫ᩴ;->ܳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ܳ()Ll/ᩴۚᩴ;
    .locals 1

    .line 1308
    invoke-interface {p0}, Ll/֡֫ᩴ;->ܳ()Ll/֨ۚᩴ;

    move-result-object v0

    return-object v0
.end method
