.class public final Ll/ܽᩴ۠;
.super Ljava/lang/Object;
.source "83ZS"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/util/Map;

.field public final ۙ:Ljava/util/Set;

.field public final ۛ:Ljava/util/Set;

.field public final ۤ:Ljava/util/LinkedHashSet;

.field public ۨ:Ll/᩹ܶ۠;

.field public ۫:Ljava/util/Set;

.field public ۬:Ljava/util/Set;

.field public ᩶:Ll/ۧ᩶۠;

.field public final ᩸:Ljava/util/LinkedHashSet;

.field public final ᩹:Ljava/util/LinkedHashSet;

.field public final ᩺:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 2

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 403
    const-class v0, Ll/ۧ᩶۠;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩶۠;

    iput-object v0, p0, Ll/ܽᩴ۠;->᩶:Ll/ۧ᩶۠;

    .line 404
    invoke-static {p1}, Ll/᩸ۖ۠;->֫(Ll/ۗ֨۠;)Ll/᩸ۖ۠;

    .line 406
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->ۨ:Ll/᩹ܶ۠;

    .line 407
    invoke-static {p1}, Ll/ۗܰ֨;->֫(Ll/ۗ֨۠;)Ll/ۗܰ֨;

    .line 408
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    .line 409
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    .line 411
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->ۛ:Ljava/util/Set;

    .line 412
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->ۙ:Ljava/util/Set;

    .line 413
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->۫:Ljava/util/Set;

    .line 414
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->۬:Ljava/util/Set;

    .line 416
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->ۗ:Ljava/util/Map;

    .line 418
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴ۠;->᩺:Ljava/util/Set;

    .line 420
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ܽᩴ۠;->᩹:Ljava/util/LinkedHashSet;

    .line 421
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ܽᩴ۠;->᩸:Ljava/util/LinkedHashSet;

    .line 422
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ܽᩴ۠;->ۤ:Ljava/util/LinkedHashSet;

    .line 424
    invoke-static {p1}, Ll/ۙᩴ֨;->֫(Ll/ۗ֨۠;)Ll/ۙᩴ֨;

    move-result-object v0

    sget-object v1, Ll/᩶ᩴ֨;->᩷֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    .line 426
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object p1

    .line 428
    sget-object v0, Ll/֡ۖ۠;->ۢ֫:Ll/֡ۖ۠;

    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 857
    iget-object v0, p0, Ll/ܽᩴ۠;->۫:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 858
    iget-object v0, p0, Ll/ܽᩴ۠;->۬:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 859
    iget-object v0, p0, Ll/ܽᩴ۠;->ۗ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 848
    iget-object v0, p0, Ll/ܽᩴ۠;->ۤ:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 849
    iget-object v0, p0, Ll/ܽᩴ۠;->ۛ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 850
    iget-object v0, p0, Ll/ܽᩴ۠;->ۙ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 851
    iget-object v0, p0, Ll/ܽᩴ۠;->᩺:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 852
    iget-object v0, p0, Ll/ܽᩴ۠;->᩹:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 853
    iget-object v0, p0, Ll/ܽᩴ۠;->᩸:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "javac Filer"

    return-object v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 820
    iget-object v0, p0, Ll/ܽᩴ۠;->ۗ:Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1

    .line 841
    iget-object v0, p0, Ll/ܽᩴ۠;->ۛ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 842
    iget-object p1, p0, Ll/ܽᩴ۠;->ۤ:Ljava/util/LinkedHashSet;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 857
    iget-object v0, p0, Ll/ܽᩴ۠;->۫:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 858
    iget-object v0, p0, Ll/ܽᩴ۠;->۬:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 859
    iget-object v0, p0, Ll/ܽᩴ۠;->ۗ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final ܽ()Ljava/util/Set;
    .locals 1

    .line 816
    iget-object v0, p0, Ll/ܽᩴ۠;->۬:Ljava/util/Set;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 807
    iget-object v0, p0, Ll/ܽᩴ۠;->۫:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽᩴ۠;->ۗ:Ljava/util/Map;

    .line 808
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()V
    .locals 4

    .line 824
    iget-object v0, p0, Ll/ܽᩴ۠;->᩺:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 825
    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4908
    new-instance v1, Ll/ۧܶ۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "compiler"

    const-string v3, "proc.unclosed.type.files"

    invoke-direct {v1, v0, v3, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    iget-object v0, p0, Ll/ܽᩴ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-virtual {v0, v1}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method
