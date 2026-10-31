.class public final synthetic Ll/ᩴܳۧ;
.super Ljava/lang/Object;
.source "B8MR"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/᩵ܳۧ;

    .line 4
    check-cast p2, Ll/᩵ܳۧ;

    .line 46
    iget p1, p1, Ll/᩵ܳۧ;->ۧ:F

    iget p2, p2, Ll/᩵ܳۧ;->ۧ:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
