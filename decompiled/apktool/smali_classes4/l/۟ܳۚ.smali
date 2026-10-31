.class public Ll/۟ܳۚ;
.super Ll/ᩴ۬֡;
.source "X2SX"


# instance fields
.field public ᩸:Ll/ۚܽۚ;

.field public final synthetic ᩹:Ll/֫᩻ۚ;


# direct methods
.method public constructor <init>(Ll/֫᩻ۚ;Ll/ۚܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/۟ܳۚ;->᩹:Ll/֫᩻ۚ;

    .line 63
    iput-object p2, p0, Ll/۟ܳۚ;->᩸:Ll/ۚܽۚ;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/۟ܳۚ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 81
    iget-object v0, p0, Ll/۟ܳۚ;->᩹:Ll/֫᩻ۚ;

    iget-object v0, v0, Ll/֫᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/۟ܳۚ;->᩸:Ll/ۚܽۚ;

    .line 82
    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/ܰܳۚ;

    .line 83
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-static {v1, v2}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v1

    .line 110
    new-instance v2, Ll/ܺ᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v2
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 69
    iget-object v0, p0, Ll/۟ܳۚ;->᩹:Ll/֫᩻ۚ;

    iget-object v0, v0, Ll/֫᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/۟ܳۚ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 95
    iget-object v0, p0, Ll/۟ܳۚ;->᩹:Ll/֫᩻ۚ;

    iget-object v0, v0, Ll/֫᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/۟ܳۚ;->᩸:Ll/ۚܽۚ;

    invoke-interface {v1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
