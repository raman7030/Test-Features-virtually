.class public final Ll/ܳۗܺ;
.super Ll/ۜۗܺ;
.source "0644"


# direct methods
.method public static ֫(I)Ll/ۜۗܺ;
    .locals 0

    if-gez p0, :cond_0

    .line 142
    invoke-static {}, Ll/ۜۗܺ;->ۧ()Ll/ۜۗܺ;

    move-result-object p0

    return-object p0

    :cond_0
    if-lez p0, :cond_1

    invoke-static {}, Ll/ۜۗܺ;->ܽ()Ll/ۜۗܺ;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Ll/ۜۗܺ;->ᩳ()Ll/ۜۗܺ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(II)Ll/ۜۗܺ;
    .locals 0

    .line 113
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    invoke-static {p1}, Ll/ܳۗܺ;->֫(I)Ll/ۜۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ll/ۜۗܺ;
    .locals 0

    .line 102
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ll/ܳۗܺ;->֫(I)Ll/ۜۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;
    .locals 0

    .line 108
    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ll/ܳۗܺ;->֫(I)Ll/ۜۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ZZ)Ll/ۜۗܺ;
    .locals 0

    .line 138
    invoke-static {p1, p2}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Ll/ܳۗܺ;->֫(I)Ll/ۜۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ZZ)Ll/ۜۗܺ;
    .locals 0

    .line 133
    invoke-static {p2, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Ll/ܳۗܺ;->֫(I)Ll/ۜۗܺ;

    move-result-object p1

    return-object p1
.end method
