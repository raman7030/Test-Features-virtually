.class public Ll/۠ܳ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public final synthetic ܿ:Ll/᩹ܳ۠;

.field public ᩳ:Ljava/util/Collection;


# direct methods
.method public varargs constructor <init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V
    .locals 0

    .line 699
    iput-object p1, p0, Ll/۠ܳ۠;->ܿ:Ll/᩹ܳ۠;

    .line 700
    invoke-direct {p0, p2, p3}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/Iterable;)V
    .locals 2

    if-nez p1, :cond_0

    .line 725
    invoke-virtual {p0}, Ll/۠ܳ۠;->᩻()Ll/֨ܳ۠;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 727
    iput-boolean v0, p0, Ll/ܰܿ۠;->֫:Z

    .line 728
    invoke-virtual {p0}, Ll/۠ܳ۠;->ۜ()Ll/֨ܳ۠;

    move-result-object v0

    .line 356
    iget-object v1, v0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    invoke-static {v1}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/֨ܳ۠;->֫(Ljava/lang/Iterable;Z)V

    move-object p1, v0

    .line 730
    :goto_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    return-void
.end method

.method public ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 1

    .line 705
    iget-object v0, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    .line 709
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 712
    :cond_1
    invoke-virtual {p0}, Ll/۠ܳ۠;->ۜ()Ll/֨ܳ۠;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    return p1
.end method

.method public ֫(Ll/᩷۠ᩴ;)Z
    .locals 2

    .line 743
    iget-object v0, p0, Ll/۠ܳ۠;->ܿ:Ll/᩹ܳ۠;

    iget-object v1, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    invoke-static {v0, v1, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/util/Collection;Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public ۜ()Ll/֨ܳ۠;
    .locals 2

    .line 738
    new-instance v0, Ll/֨ܳ۠;

    iget-object v1, p0, Ll/۠ܳ۠;->ܿ:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/֨ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    return-object v0
.end method

.method public ܽ()Ljava/util/Collection;
    .locals 1

    .line 718
    iget-object v0, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    return-object v0
.end method

.method public ᩻()Ll/֨ܳ۠;
    .locals 2

    .line 734
    invoke-virtual {p0}, Ll/۠ܳ۠;->ۜ()Ll/֨ܳ۠;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    return-object v0
.end method
