.class public final Ll/ۗᩳۚ;
.super Ll/ۘ۬֡;
.source "C6AK"

# interfaces
.implements Ll/۫ᩳۚ;


# instance fields
.field public final ᩸:Ll/ܳ۬ܺ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-static {p2}, Ll/᩺ᩳۚ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p2

    iput-object p2, p0, Ll/ۗᩳۚ;->᩸:Ll/ܳ۬ܺ;

    .line 61
    iput-object p1, p0, Ll/ۗᩳۚ;->᩹:Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Ll/֡ܽۚ;)Ll/ۗᩳۚ;
    .locals 2

    .line 66
    instance-of v0, p0, Ll/ۗᩳۚ;

    if-eqz v0, :cond_0

    .line 67
    check-cast p0, Ll/ۗᩳۚ;

    return-object p0

    .line 69
    :cond_0
    new-instance v0, Ll/ۗᩳۚ;

    .line 70
    invoke-interface {p0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    .line 71
    invoke-interface {p0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Ll/ۗᩳۚ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final ۘ()Ljava/util/List;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۗᩳۚ;->᩸:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۗᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
