.class public final Ll/۬ۘۖ;
.super Ljava/lang/Object;
.source "X93U"


# instance fields
.field public final ֫:Ljava/util/Iterator;

.field public ۧ:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>(Ll/۫ۘۖ;)V
    .locals 1

    .line 1039
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1035
    invoke-static {p1}, Ll/۫ۘۖ;->֫(Ll/۫ۘۖ;)Ll/᩵ۘۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵ۘۖ;->ۜ()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۘۖ;->֫:Ljava/util/Iterator;

    .line 1040
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1041
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iput-object p1, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(ILl/ܳ᩷ۖ;)V
    .locals 2

    .line 1047
    :goto_0
    iget-object v0, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    if-ge v0, p1, :cond_1

    .line 1048
    iget-object v0, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۖۖ;

    .line 1067
    iget-object v1, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, p2}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V

    .line 1069
    iget-object v0, p0, Ll/۬ۘۖ;->֫:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1070
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1072
    iput-object v0, p0, Ll/۬ۘۖ;->ۧ:Ljava/util/Map$Entry;

    goto :goto_0

    :cond_1
    return-void
.end method
