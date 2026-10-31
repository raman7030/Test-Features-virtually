.class public final synthetic Ll/ۨ۫ۡ;
.super Ljava/lang/Object;
.source "B2S5"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/᩺۫ۡ;

    .line 4
    check-cast p2, Ll/᩺۫ۡ;

    .line 415
    invoke-virtual {p2}, Ll/᩺۫ۡ;->ᩳ()I

    move-result p2

    invoke-virtual {p1}, Ll/᩺۫ۡ;->ᩳ()I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method
