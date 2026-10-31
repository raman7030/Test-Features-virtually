.class public final Ll/ۤܿܿ;
.super Ll/۬ۗܿ;
.source "4AWI"


# instance fields
.field public final synthetic ۟:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;Ll/֡ܳܿ;)V
    .locals 0

    .line 577
    iput-object p1, p0, Ll/ۤܿܿ;->۟:Ll/֡ܳܿ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 6

    .line 580
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 581
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 582
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 583
    new-instance v2, Ll/ܶܳܿ;

    new-instance v3, Ll/ۧܿܿ;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Ll/ۧܿܿ;-><init>(I)V

    const/4 v4, 0x0

    const-string v5, "\u2026"

    invoke-direct {v2, v5, v3, v4}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll/ۚܳܿ;

    invoke-direct {v3, v0, v1}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    .line 586
    iget-object v0, p0, Ll/ۤܿܿ;->۟:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ۜ(Ll/֡ܳܿ;)V

    .line 587
    invoke-static {v0}, Ll/֡ܳܿ;->᩻(Ll/֡ܳܿ;)Ll/ۜۡۡ;

    move-result-object v1

    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 589
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
