.class public final Ll/᩵ܶۖ;
.super Ljava/lang/Object;
.source "44YS"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 982
    check-cast p1, Ll/᩵ۙۚ;

    check-cast p2, Ll/᩵ۙۚ;

    .line 985
    iget-object p1, p1, Ll/᩵ۙۚ;->ܽ:Ljava/lang/String;

    iget-object p2, p2, Ll/᩵ۙۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
