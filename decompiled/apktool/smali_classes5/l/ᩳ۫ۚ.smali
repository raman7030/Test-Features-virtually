.class public Ll/ᩳ۫ۚ;
.super Ll/ۜ۫ۚ;
.source "37CY"


# instance fields
.field public ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ljava/util/List;)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    .line 60
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    .line 64
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܺۤۚ;

    .line 65
    iget-object v0, p0, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p0, p3, p1}, Ll/ۜ۫ۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)Ll/ܺۤۚ;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 80
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 81
    iget-object v0, p0, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۤۚ;

    .line 83
    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    return v0
.end method
