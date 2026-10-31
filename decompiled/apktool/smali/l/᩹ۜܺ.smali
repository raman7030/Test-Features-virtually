.class public final Ll/᩹ۜܺ;
.super Ljava/lang/Object;
.source "6BDM"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 65
    check-cast p1, Ll/ۗۜܺ;

    check-cast p2, Ll/ۗۜܺ;

    .line 68
    invoke-virtual {p1}, Ll/ۖۜܺ;->֫()Ll/ۘۜܺ;

    move-result-object p1

    .line 69
    invoke-virtual {p2}, Ll/ۖۜܺ;->֫()Ll/ۘۜܺ;

    move-result-object p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method
