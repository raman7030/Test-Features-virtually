.class public final Ll/۬ᩳۚ;
.super Ll/ᩴ۬֡;
.source "76AL"

# interfaces
.implements Ll/۫ᩳۚ;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ll/ܳ۬ܺ;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/۬ᩳۚ;->᩸:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Ll/۬ᩳۚ;->᩹:Ljava/lang/String;

    .line 60
    invoke-static {p4}, Ll/᩺ᩳۚ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۬ᩳۚ;->᩶:Ll/ܳ۬ܺ;

    .line 61
    iput-object p3, p0, Ll/۬ᩳۚ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/۬ᩳۚ;->᩸:Ljava/lang/String;

    .line 69
    iput-object p2, p0, Ll/۬ᩳۚ;->᩹:Ljava/lang/String;

    if-nez p3, :cond_0

    .line 45
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p3

    .line 70
    :cond_0
    iput-object p3, p0, Ll/۬ᩳۚ;->᩶:Ll/ܳ۬ܺ;

    const-string p1, "V"

    .line 71
    iput-object p1, p0, Ll/۬ᩳۚ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Ll/ۚܽۚ;)Ll/۬ᩳۚ;
    .locals 4

    .line 76
    instance-of v0, p0, Ll/۬ᩳۚ;

    if-eqz v0, :cond_0

    .line 77
    check-cast p0, Ll/۬ᩳۚ;

    return-object p0

    .line 79
    :cond_0
    new-instance v0, Ll/۬ᩳۚ;

    .line 80
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 81
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v3

    .line 83
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0, v3}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۬ᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Ljava/util/List;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/۬ᩳۚ;->᩶:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/۬ᩳۚ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/۬ᩳۚ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
