.class public final Ll/۫ܿܿ;
.super Ll/۬ۗܿ;
.source "4AWI"


# instance fields
.field public final synthetic ֫֫:I

.field public final synthetic ۟:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;Ll/֡ܳܿ;I)V
    .locals 0

    .line 389
    iput-object p1, p0, Ll/۫ܿܿ;->۟:Ll/֡ܳܿ;

    iput p3, p0, Ll/۫ܿܿ;->֫֫:I

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 6

    .line 392
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 394
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 395
    new-instance v2, Ll/ܶܳܿ;

    new-instance v3, Ll/ۧܿܿ;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Ll/ۧܿܿ;-><init>(I)V

    const/4 v4, 0x0

    const-string v5, "\u2026"

    invoke-direct {v2, v5, v3, v4}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v2

    iget v3, p0, Ll/۫ܿܿ;->֫֫:I

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ll/ۚܳܿ;

    invoke-direct {v4, v0, v1}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 397
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    .line 398
    iget-object v0, p0, Ll/۫ܿܿ;->۟:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ۜ(Ll/֡ܳܿ;)V

    .line 399
    invoke-static {v0}, Ll/֡ܳܿ;->᩻(Ll/֡ܳܿ;)Ll/ۜۡۡ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 401
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
