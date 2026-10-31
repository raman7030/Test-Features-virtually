.class public final synthetic Ll/᩶ᩳᩳ;
.super Ljava/lang/Object;
.source "8B7K"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۗᩳᩳ;

    .line 4
    check-cast p2, Ll/ۗᩳᩳ;

    .line 113
    invoke-virtual {p1}, Ll/ۗᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۨᩳᩳ;->index()I

    move-result p1

    invoke-virtual {p2}, Ll/ۗᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object p2

    invoke-interface {p2}, Ll/ۨᩳᩳ;->index()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method
