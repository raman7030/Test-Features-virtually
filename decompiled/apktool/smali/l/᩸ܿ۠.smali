.class public final Ll/᩸ܿ۠;
.super Ll/ܺ۠ᩴ;
.source "X44P"


# instance fields
.field public final synthetic ᩸:Ll/᩶ܿ۠;

.field public final synthetic ᩹:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩶ܿ۠;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 573
    iput-object p1, p0, Ll/᩸ܿ۠;->᩸:Ll/᩶ܿ۠;

    iput-object p2, p0, Ll/᩸ܿ۠;->᩹:Ll/᩷۠ᩴ;

    invoke-direct {p0}, Ll/ܺ۠ᩴ;-><init>()V

    return-void
.end method


# virtual methods
.method public final preVisitDirectory(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 2

    .line 573
    check-cast p1, Ll/᩷۠ᩴ;

    .line 576
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p2

    iget-object v0, p0, Ll/᩸ܿ۠;->᩸:Ll/᩶ܿ۠;

    invoke-static {v0, p2}, Ll/᩶ܿ۠;->֫(Ll/᩶ܿ۠;Ll/᩷۠ᩴ;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 577
    invoke-static {v0}, Ll/᩶ܿ۠;->ۧ(Ll/᩶ܿ۠;)Ljava/util/HashMap;

    move-result-object p2

    new-instance v0, Ll/ۤܳ۠;

    iget-object v1, p0, Ll/᩸ܿ۠;->᩹:Ll/᩷۠ᩴ;

    invoke-interface {v1, p1}, Ll/᩷۠ᩴ;->relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤܳ۠;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1

    .line 580
    :cond_0
    sget-object p1, Ll/ܽ۠ᩴ;->SKIP_SUBTREE:Ll/ܽ۠ᩴ;

    return-object p1
.end method
