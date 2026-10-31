.class public final Ll/ۖܺܿ;
.super Ljava/lang/Object;
.source "U6VC"


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ۖܺܿ;->֫:Ljava/util/IdentityHashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 4

    .line 32
    iget-object v0, p0, Ll/ۖܺܿ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 33
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Ll/ۖܺܿ;->ۧ:I

    return-object v1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ܺܺܿ;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/ۖܺܿ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺܺܿ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;[IJ)Ll/ܺܺܿ;
    .locals 3

    .line 21
    iget v0, p0, Ll/ۖܺܿ;->ۧ:I

    array-length v1, p2

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۖܺܿ;->ۧ:I

    .line 22
    iget-object v0, p0, Ll/ۖܺܿ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->size()I

    move-result v1

    const/16 v2, 0x1000

    if-ge v1, v2, :cond_0

    iget v1, p0, Ll/ۖܺܿ;->ۧ:I

    const/high16 v2, 0x10000

    if-gt v1, v2, :cond_0

    .line 25
    new-instance v1, Ll/ܺܺܿ;

    invoke-direct {v1, p2, p3, p4}, Ll/ܺܺܿ;-><init>([IJ)V

    .line 26
    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Speculative syntax history budget exceeded"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
