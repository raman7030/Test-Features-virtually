.class public final synthetic Ll/᩷ۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۤۤ;

    .line 4
    check-cast p2, Ll/ۤۤ;

    .line 575
    iget-object p1, p1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
