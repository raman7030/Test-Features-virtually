.class public final synthetic Ll/֡ᩴۧ;
.super Ljava/lang/Object;
.source "M8UR"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۚᩴۧ;

    .line 4
    check-cast p2, Ll/ۚᩴۧ;

    .line 1410
    iget p2, p2, Ll/ۚᩴۧ;->ۧ:I

    iget p1, p1, Ll/ۚᩴۧ;->ۧ:I

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
