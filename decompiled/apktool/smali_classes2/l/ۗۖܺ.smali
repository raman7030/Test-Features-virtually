.class public final Ll/ۗۖܺ;
.super Ljava/lang/Object;
.source "JBI9"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final synthetic ֫:Ll/۬ۖܺ;

.field public final synthetic ۧ:Ljava/util/HashSet;

.field public final synthetic ܽ:[Ll/᩸ۡܺ;


# direct methods
.method public constructor <init>(Ll/۬ۖܺ;[Ll/᩸ۡܺ;Ljava/util/HashSet;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۖܺ;->֫:Ll/۬ۖܺ;

    iput-object p2, p0, Ll/ۗۖܺ;->ܽ:[Ll/᩸ۡܺ;

    iput-object p3, p0, Ll/ۗۖܺ;->ۧ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 6

    .line 74
    invoke-virtual {p1}, Ll/۫ۖܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_2

    .line 158
    :cond_0
    invoke-virtual {p1}, Ll/۫ۖܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    check-cast v0, Ll/ܳۡܺ;

    .line 160
    invoke-virtual {v0}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 80
    iget-object v1, p0, Ll/ۗۖܺ;->ܽ:[Ll/᩸ۡܺ;

    aget-object v2, v1, v0

    if-nez v2, :cond_1

    .line 81
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p1

    aput-object p1, v1, v0

    return-void

    .line 84
    :cond_1
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    .line 85
    invoke-virtual {v2}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v1

    .line 86
    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v3

    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_0

    :cond_2
    if-nez v3, :cond_3

    goto :goto_0

    .line 97
    :cond_3
    invoke-virtual {v1, v3}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 107
    :goto_0
    iget-object v3, p0, Ll/ۗۖܺ;->֫:Ll/۬ۖܺ;

    invoke-static {v3}, Ll/۬ۖܺ;->֫(Ll/۬ۖܺ;)Ll/᩷ۘܺ;

    move-result-object v4

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v4

    .line 108
    invoke-virtual {v4, v1}, Ll/ܳۘܺ;->֫(Ll/ᩴۡܺ;)V

    .line 114
    new-instance v1, Ll/ۙۖܺ;

    invoke-direct {v1, p0, v0, v2}, Ll/ۙۖܺ;-><init>(Ll/ۗۖܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    .line 132
    invoke-static {v3}, Ll/۬ۖܺ;->֫(Ll/۬ۖܺ;)Ll/᩷ۘܺ;

    move-result-object v2

    .line 133
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v0

    .line 136
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_4

    .line 137
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۘܺ;

    .line 138
    invoke-virtual {v3, v1}, Ll/ܳۘܺ;->ۧ(Ll/ۗۘۢ;)V

    goto :goto_1

    .line 141
    :cond_4
    iget-object v0, p0, Ll/ۗۖܺ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_2
    return-void
.end method
