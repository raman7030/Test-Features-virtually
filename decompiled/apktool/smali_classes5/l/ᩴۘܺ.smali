.class public final Ll/ᩴۘܺ;
.super Ljava/lang/Object;
.source "9BH0"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final synthetic ֫:Ll/ܶۘܺ;


# direct methods
.method public constructor <init>(Ll/ܶۘܺ;)V
    .locals 0

    .line 726
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۘܺ;->֫:Ll/ܶۘܺ;

    return-void
.end method

.method private ֫(Ll/ܳۘܺ;)V
    .locals 6

    .line 760
    invoke-virtual {p1}, Ll/ܳۘܺ;->ܳ()Ll/᩸ۡܺ;

    move-result-object v0

    .line 762
    iget-object v1, p0, Ll/ᩴۘܺ;->֫:Ll/ܶۘܺ;

    if-eqz v0, :cond_1

    .line 763
    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v2

    .line 765
    invoke-static {v1}, Ll/ܶۘܺ;->ۧ(Ll/ܶۘܺ;)Ljava/util/TreeMap;

    move-result-object v3

    .line 766
    invoke-virtual {v3, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-nez v3, :cond_0

    .line 769
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 770
    invoke-static {v1}, Ll/ܶۘܺ;->ۧ(Ll/ܶۘܺ;)Ljava/util/TreeMap;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    :cond_0
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    :cond_1
    instance-of v0, p1, Ll/۫ۖܺ;

    if-eqz v0, :cond_4

    .line 777
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/16 v2, 0x38

    if-ne v0, v2, :cond_2

    .line 779
    invoke-static {v1}, Ll/ܶۘܺ;->ܽ(Ll/ܶۘܺ;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ll/۫ۖܺ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 780
    :cond_2
    invoke-static {}, Ll/ۛۖܺ;->֫()Ll/᩻ۡܺ;

    move-result-object v0

    .line 781
    invoke-virtual {p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    .line 782
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    .line 780
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    invoke-virtual {v2}, Ll/ۗۡܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 128
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 132
    invoke-virtual {v3, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x6

    if-lt v4, v0, :cond_5

    .line 783
    invoke-static {v1}, Ll/ܶۘܺ;->֫(Ll/ܶۘܺ;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ll/۫ۖܺ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 785
    :cond_4
    instance-of v0, p1, Ll/ܰۖܺ;

    if-eqz v0, :cond_5

    .line 786
    invoke-static {v1}, Ll/ܶۘܺ;->ᩳ(Ll/ܶۘܺ;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ll/ܰۖܺ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 0

    .line 730
    invoke-direct {p0, p1}, Ll/ᩴۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 0

    .line 736
    invoke-direct {p0, p1}, Ll/ᩴۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 0

    .line 742
    invoke-direct {p0, p1}, Ll/ᩴۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method
