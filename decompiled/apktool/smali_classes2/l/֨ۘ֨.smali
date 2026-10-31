.class public final Ll/֨ۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/۠֡֨;

.field public final synthetic ۙ:Ljava/lang/Iterable;

.field public final synthetic ᩶:Ljava/util/Set;

.field public ᩸:Ll/ᩳ᩶۠;

.field public final ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ll/۠֡֨;Ljava/util/Set;)V
    .locals 0

    .line 736
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۘ֨;->ۙ:Ljava/lang/Iterable;

    iput-object p2, p0, Ll/֨ۘ֨;->ۗ:Ll/۠֡֨;

    iput-object p3, p0, Ll/֨ۘ֨;->᩶:Ljava/util/Set;

    .line 737
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۘ֨;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 6

    .line 741
    iget-object v0, p0, Ll/֨ۘ֨;->᩸:Ll/ᩳ᩶۠;

    if-nez v0, :cond_2

    .line 742
    :cond_0
    iget-object v0, p0, Ll/֨ۘ֨;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 743
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ᩶۠;

    .line 745
    invoke-interface {v0}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-eq v1, v2, :cond_1

    .line 746
    invoke-interface {v0}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    if-eq v1, v2, :cond_1

    .line 747
    iget-object v1, p0, Ll/֨ۘ֨;->ۗ:Ll/۠֡֨;

    iget-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v4, 0x10000000000000L

    or-long/2addr v2, v4

    iput-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    .line 750
    :cond_1
    iget-object v1, p0, Ll/֨ۘ֨;->᩶:Ljava/util/Set;

    invoke-interface {v0}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 751
    iput-object v0, p0, Ll/֨ۘ֨;->᩸:Ll/ᩳ᩶۠;

    .line 756
    :cond_2
    iget-object v0, p0, Ll/֨ۘ֨;->᩸:Ll/ᩳ᩶۠;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 761
    invoke-virtual {p0}, Ll/֨ۘ֨;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 763
    iget-object v0, p0, Ll/֨ۘ֨;->᩸:Ll/ᩳ᩶۠;

    const/4 v1, 0x0

    .line 764
    iput-object v1, p0, Ll/֨ۘ֨;->᩸:Ll/ᩳ᩶۠;

    return-object v0

    .line 762
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
