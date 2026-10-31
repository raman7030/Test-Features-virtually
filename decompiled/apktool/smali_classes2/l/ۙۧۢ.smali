.class public final synthetic Ll/ۙۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ll/۬ۧۢ;

    .line 4
    check-cast p2, Ll/۬ۧۢ;

    .line 512
    sget-object v0, Ll/ᩳۧۢ;->᩻:Ljava/util/Comparator;

    invoke-static {p1}, Ll/۬ۧۢ;->֫(Ll/۬ۧۢ;)Ll/ᩳۧۢ;

    move-result-object p1

    invoke-static {p2}, Ll/۬ۧۢ;->֫(Ll/۬ۧۢ;)Ll/ᩳۧۢ;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
