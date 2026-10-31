.class public abstract Ll/ܺۚܺ;
.super Ll/ᩴۚܺ;
.source "SB7W"

# interfaces
.implements Ll/ۘۚܺ;
.implements Ll/ۡۚܺ;


# instance fields
.field public ۖ:Ljava/util/HashSet;

.field public ۡ:Ljava/util/HashSet;

.field public ۢ:Ljava/lang/String;

.field public ܺ:Ljava/util/HashSet;

.field public ᩷:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1655
    invoke-direct {p0}, Ll/ᩴۚܺ;-><init>()V

    .line 1657
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    const/4 v0, 0x0

    .line 1659
    iput-object v0, p0, Ll/ܺۚܺ;->ۡ:Ljava/util/HashSet;

    .line 1660
    iput-object v0, p0, Ll/ܺۚܺ;->ۢ:Ljava/lang/String;

    .line 1662
    iput-object v0, p0, Ll/ܺۚܺ;->ۖ:Ljava/util/HashSet;

    .line 1663
    iput-object v0, p0, Ll/ܺۚܺ;->ܺ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final getChildren()Ljava/util/List;
    .locals 1

    .line 1666
    iget-object v0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    return-object v0
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1675
    iput-object p1, p0, Ll/ܺۚܺ;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/HashSet;)V
    .locals 0

    .line 1671
    iput-object p1, p0, Ll/ܺۚܺ;->ۡ:Ljava/util/HashSet;

    return-void
.end method

.method public ֫(Ll/ۚۚܺ;)V
    .locals 1

    .line 1668
    iget-object v0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 1677
    iget-object v0, p0, Ll/ܺۚܺ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/util/HashSet;)V
    .locals 0

    return-void
.end method

.method public final ܳ()Ljava/util/Set;
    .locals 1

    .line 1689
    iget-object v0, p0, Ll/ܺۚܺ;->ܺ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ܽ(Ljava/util/HashSet;)V
    .locals 0

    .line 1687
    iput-object p1, p0, Ll/ܺۚܺ;->ܺ:Ljava/util/HashSet;

    return-void
.end method

.method public final ܿ()Ljava/util/Set;
    .locals 1

    .line 1685
    iget-object v0, p0, Ll/ܺۚܺ;->ۖ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Set;
    .locals 1

    .line 1673
    iget-object v0, p0, Ll/ܺۚܺ;->ۡ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩳ(Ljava/util/HashSet;)V
    .locals 0

    .line 1683
    iput-object p1, p0, Ll/ܺۚܺ;->ۖ:Ljava/util/HashSet;

    return-void
.end method
