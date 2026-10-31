.class public final synthetic Ll/᩹ܿܽ;
.super Ljava/lang/Object;
.source "84S9"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۖܿܽ;

    .line 4
    check-cast p2, Ll/ۖܿܽ;

    .line 248
    invoke-virtual {p1}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩸ܽܽ;->֫(Ll/᩸ܽܽ;)I

    move-result p1

    return p1
.end method
