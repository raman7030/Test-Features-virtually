.class public final Ll/᩹ܿ۠;
.super Ll/ܺ۠ᩴ;
.source "X44P"


# instance fields
.field public final synthetic ᩶:Ll/ᩴܶ۠;

.field public final synthetic ᩸:Ll/᩶ܿ۠;

.field public final synthetic ᩹:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/᩶ܿ۠;Ljava/util/Set;Ll/ᩴܶ۠;)V
    .locals 0

    .line 604
    iput-object p1, p0, Ll/᩹ܿ۠;->᩸:Ll/᩶ܿ۠;

    iput-object p2, p0, Ll/᩹ܿ۠;->᩹:Ljava/util/Set;

    iput-object p3, p0, Ll/᩹ܿ۠;->᩶:Ll/ᩴܶ۠;

    invoke-direct {p0}, Ll/ܺ۠ᩴ;-><init>()V

    return-void
.end method


# virtual methods
.method public final preVisitDirectory(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 604
    check-cast p1, Ll/᩷۠ᩴ;

    .line 607
    iget-object p2, p0, Ll/᩹ܿ۠;->᩸:Ll/᩶ܿ۠;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2, p1}, Ll/᩶ܿ۠;->֫(Ll/᩶ܿ۠;Ll/᩷۠ᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 608
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1

    .line 610
    :cond_0
    sget-object p1, Ll/ܽ۠ᩴ;->SKIP_SUBTREE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final visitFile(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 3

    .line 604
    check-cast p1, Ll/᩷۠ᩴ;

    .line 616
    invoke-interface {p2}, Ll/ܶ۠ᩴ;->isRegularFile()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object p2

    iget-object v0, p0, Ll/᩹ܿ۠;->᩹:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 617
    iget-object p2, p0, Ll/᩹ܿ۠;->᩸:Ll/᩶ܿ۠;

    iget-object v0, p2, Ll/᩶ܿ۠;->ᩳ:Ll/ۨܿ۠;

    invoke-static {p2}, Ll/᩶ܿ۠;->֫(Ll/᩶ܿ۠;)Ll/᩷۠ᩴ;

    move-result-object p2

    sget v1, Ll/۫ܳ۠;->ᩳ:I

    .line 157
    new-instance v1, Ll/ۗܳ۠;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, p2, v2}, Ll/ۗܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V

    .line 619
    iget-object p1, p0, Ll/᩹ܿ۠;->᩶:Ll/ᩴܶ۠;

    invoke-virtual {p1, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 621
    :cond_0
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method
