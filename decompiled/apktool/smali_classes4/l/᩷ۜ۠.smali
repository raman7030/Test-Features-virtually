.class public abstract Ll/᩷ۜ۠;
.super Ljava/lang/Object;
.source "Z5U8"


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۧ:Ll/ۤܶ۠;

.field public final synthetic ܽ:Ll/᩶ۜ۠;

.field public final ᩳ:Ll/ܽ᩻۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V
    .locals 0

    .line 746
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۜ۠;->ܽ:Ll/᩶ۜ۠;

    .line 747
    iput-object p2, p0, Ll/᩷ۜ۠;->ۧ:Ll/ۤܶ۠;

    .line 748
    iput-object p3, p0, Ll/᩷ۜ۠;->ᩳ:Ll/ܽ᩻۠;

    .line 749
    iput-object p4, p0, Ll/᩷ۜ۠;->֫:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public abstract ֫(ILl/ۛ֡֨;)V
.end method

.method public ֫(Ll/ۜۜ۠;)Z
    .locals 14

    .line 753
    iget-object v0, p0, Ll/᩷ۜ۠;->֫:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 754
    iget-object p1, p0, Ll/᩷ۜ۠;->ܽ:Ll/᩶ۜ۠;

    iget v1, p1, Ll/᩶ۜ۠;->۠:I

    iget-object v2, p1, Ll/᩶ۜ۠;->ۢ֫:Ljava/util/HashSet;

    iget-object v3, p1, Ll/᩶ۜ۠;->֨:Ll/᩹ܶ۠;

    iget-object v4, p0, Ll/᩷ۜ۠;->ᩳ:Ll/ܽ᩻۠;

    iget v5, v4, Ll/ܽ᩻۠;->᩸:I

    const/4 v6, 0x1

    if-gt v1, v5, :cond_1

    if-ne v1, v5, :cond_0

    iget v1, p1, Ll/᩶ۜ۠;->ܶ:I

    iget v5, v4, Ll/ܽ᩻۠;->᩹:I

    if-lt v1, v5, :cond_0

    goto :goto_0

    .line 757
    :cond_0
    iget-boolean v1, p1, Ll/᩶ۜ۠;->ۚ:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩷ۜ۠;->ۧ:Ll/ۤܶ۠;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 758
    iget-object v5, p1, Ll/᩶ۜ۠;->ۜ:Ll/ᩳ᩶۠;

    invoke-virtual {v3, v5}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    move-result-object v5

    .line 760
    :try_start_0
    sget-object v7, Ll/᩶ᩴ֨;->۬:Ll/᩶ᩴ֨;

    iget v8, v4, Ll/ܽ᩻۠;->᩸:I

    iget v4, v4, Ll/ܽ᩻۠;->᩹:I

    iget v9, p1, Ll/᩶ۜ۠;->۠:I

    iget p1, p1, Ll/᩶ۜ۠;->ܶ:I

    .line 761
    sget-object v10, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4309
    new-instance v10, Ll/ۧܶ۠;

    const-string v11, "compiler"

    const-string v12, "future.attr"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v13, 0x5

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v1, v13, v0

    aput-object v8, v13, v6

    const/4 v6, 0x2

    aput-object v4, v13, v6

    const/4 v4, 0x3

    aput-object v9, v13, v4

    const/4 v4, 0x4

    aput-object p1, v13, v4

    invoke-direct {v10, v11, v12, v13}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 760
    invoke-virtual {v3, v7, p1, v10}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 763
    invoke-virtual {v3, v5}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 765
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 763
    invoke-virtual {v3, v5}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 764
    throw p1

    :cond_1
    :goto_0
    return v6

    :cond_2
    :goto_1
    return v0
.end method
