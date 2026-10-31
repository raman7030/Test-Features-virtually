.class public final synthetic Ll/ۗ᩷֡;
.super Ljava/lang/Object;
.source "Z8F1"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/֨᩷֡;

    .line 4
    check-cast p2, Ll/֨᩷֡;

    .line 470
    invoke-virtual {p1}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
