.class public final synthetic Ll/۠ᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ljava/util/List;

    .line 4
    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    .line 4255
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤᩳۧ;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤᩳۧ;

    invoke-virtual {p1, p2}, Ll/ۤᩳۧ;->֫(Ll/ۤᩳۧ;)I

    move-result p1

    return p1
.end method
