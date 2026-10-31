.class public final synthetic Ll/ۚܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۤܽۢ;

.field public final synthetic ᩹:Ll/ܶۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۤܽۢ;Ll/ܶۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܽۢ;->᩸:Ll/ۤܽۢ;

    iput-object p2, p0, Ll/ۚܽۢ;->᩹:Ll/ܶۛ᩷;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 6

    .line 2
    iget-object v0, p0, Ll/ۚܽۢ;->᩸:Ll/ۤܽۢ;

    .line 4
    iget-object v1, p0, Ll/ۚܽۢ;->᩹:Ll/ܶۛ᩷;

    .line 6
    check-cast p1, Ll/ܰ֫ۢ;

    .line 635
    :try_start_0
    invoke-virtual {v0}, Ll/ۤܽۢ;->get()Ll/᩺ۖܽ;

    move-result-object v0

    .line 636
    invoke-interface {p1, v0}, Ll/ܰ֫ۢ;->֫(Ll/᩺ۖܽ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 637
    invoke-virtual {v0}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object p1

    .line 638
    invoke-virtual {v1}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 24
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/16 v3, 0x1f4

    .line 25
    invoke-static {v0, p1, v2, v3, v1}, Ll/ۛۜᩳ;->֫(Ll/۫ۘܽ;Ll/ۨۖܽ;IILjava/util/ArrayList;)V

    .line 641
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 642
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 643
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۜᩳ;

    .line 644
    new-instance v4, Ll/᩵ۛ᩷;

    invoke-direct {v4, v2}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 645
    iget v5, v3, Ll/ۤۜᩳ;->ۧ:I

    iput v5, v4, Ll/᩵ۛ᩷;->᩸:I

    .line 646
    iget v3, v3, Ll/ۤۜᩳ;->֫:I

    iput v3, v4, Ll/᩵ۛ᩷;->᩹:I

    .line 647
    invoke-virtual {v4, v5, v3, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 648
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    return-object v0

    :catchall_0
    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
