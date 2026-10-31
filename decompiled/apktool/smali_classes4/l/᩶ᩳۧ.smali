.class public final synthetic Ll/᩶ᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ljava/util/List;

    .line 4
    check-cast p2, Ljava/util/List;

    .line 4063
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ᩳۧ;

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫ᩳۧ;

    invoke-virtual {p1, p2}, Ll/۫ᩳۧ;->֫(Ll/۫ᩳۧ;)I

    move-result p1

    return p1
.end method
