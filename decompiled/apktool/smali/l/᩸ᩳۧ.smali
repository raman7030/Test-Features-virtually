.class public final synthetic Ll/᩸ᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ljava/util/List;

    .line 4
    check-cast p2, Ljava/util/List;

    .line 3809
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    new-instance v1, Ll/ܿܿۧ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3812
    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܿۧ;

    new-instance v2, Ll/ܿܿۧ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 3813
    invoke-static {p2, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ܿۧ;

    new-instance v3, Ll/ܿܿۧ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 3811
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    .line 3816
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    new-instance v1, Ll/ܳܿۧ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3819
    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ܿۧ;

    new-instance v1, Ll/ܳܿۧ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3820
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻ܿۧ;

    new-instance v1, Ll/ܳܿۧ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3818
    invoke-virtual {v0, p1, p2, v1}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object p1

    .line 3822
    invoke-virtual {p1}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method
