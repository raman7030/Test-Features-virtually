.class public final Ll/ۘ᩷ۚ;
.super Ll/ۡ۬֡;
.source "K5G1"

# interfaces
.implements Ll/ۨۢۚ;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/۫᩷ۚ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/۫᩷ۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ll/ۘ᩷ۚ;->᩶:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "call_site_"

    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/16 p2, 0xa

    .line 132
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    const/4 p1, -0x1

    .line 61
    :goto_1
    iput p1, p0, Ll/ۘ᩷ۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 99
    iget v0, p0, Ll/ۘ᩷ۚ;->᩹:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۘ᩷ۚ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ljava/util/List;
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    iget-object v1, v0, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x3

    if-gt v1, v2, :cond_0

    .line 92
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0

    .line 94
    :cond_0
    iget-object v0, v0, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/֡ܽۚ;
    .locals 2

    .line 85
    iget-object v0, p0, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    iget-object v0, v0, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۢۚ;

    .line 299
    iget-object v0, v0, Ll/᩻ۢۚ;->᩸:Ll/۬ۢۚ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    iget-object v0, v0, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿᩳۚ;

    invoke-interface {v0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/᩵ܽۚ;
    .locals 2

    .line 73
    iget-object v0, p0, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    iget-object v0, v0, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۢۚ;

    .line 315
    iget-object v0, v0, Ll/ܳۢۚ;->᩸:Ll/᩸ۢۚ;

    return-object v0
.end method
