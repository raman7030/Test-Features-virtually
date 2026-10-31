.class public final Ll/ܿ۫ܺ;
.super Ll/۫۬ܺ;
.source "95IB"


# instance fields
.field public final ܳ:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 449
    invoke-direct {p0}, Ll/۫۬ܺ;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    iput-object p1, p0, Ll/ܿ۫ܺ;->ܳ:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫()Ll/ۛ۬ܺ;
    .locals 1

    .line 435
    invoke-virtual {p0}, Ll/ܿ۫ܺ;->֫()Ll/᩻۫ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ۨۗܺ;
    .locals 0

    .line 470
    invoke-super {p0, p1}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    return-object p0
.end method

.method public final ֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/۫۬ܺ;
    .locals 0

    .line 470
    invoke-super {p0, p1}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    return-object p0
.end method

.method public final ֫(Ll/۫۬ܺ;)Ll/۫۬ܺ;
    .locals 0

    .line 522
    invoke-super {p0, p1}, Ll/۫۬ܺ;->֫(Ll/۫۬ܺ;)Ll/۫۬ܺ;

    return-object p0
.end method

.method public final ֫([Ljava/lang/Object;)Ll/۫۬ܺ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫()Ll/᩻۫ܺ;
    .locals 3

    .line 533
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    .line 534
    iget-object v1, p0, Ll/ܿ۫ܺ;->ܳ:Ljava/util/Comparator;

    iget v2, p0, Ll/ۛۗܺ;->ܽ:I

    invoke-static {v1, v2, v0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;I[Ljava/lang/Object;)Ll/᩻۫ܺ;

    move-result-object v0

    .line 535
    move-object v1, v0

    check-cast v1, Ll/ۢۛܺ;

    .line 81
    iget-object v1, v1, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 535
    iput v1, p0, Ll/ۛۗܺ;->ܽ:I

    const/4 v1, 0x1

    .line 536
    iput-boolean v1, p0, Ll/ۛۗܺ;->ۧ:Z

    return-object v0
.end method

.method public final varargs ۧ([Ljava/lang/Object;)V
    .locals 0

    .line 485
    invoke-super {p0, p1}, Ll/۫۬ܺ;->֫([Ljava/lang/Object;)Ll/۫۬ܺ;

    return-void
.end method
