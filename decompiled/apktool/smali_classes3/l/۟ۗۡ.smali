.class public Ll/۟ۗۡ;
.super Ll/ᩴ۬֡;
.source "M1UL"


# instance fields
.field public ᩸:Ll/ۚܽۚ;

.field public final ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/ۚܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/۟ۗۡ;->᩹:Ll/ܽܳۚ;

    .line 22
    iput-object p2, p0, Ll/۟ۗۡ;->᩸:Ll/ۚܽۚ;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/۟ۗۡ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۟ۗۡ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 42
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_0
    iget-object v1, p0, Ll/۟ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v1}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 28
    iget-object v0, p0, Ll/۟ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۗۡ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 51
    iget-object v0, p0, Ll/۟ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۗۡ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
