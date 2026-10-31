.class public Ll/ܽۢᩴ;
.super Ljava/lang/Object;
.source "25I"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/ܳۢᩴ;

.field public ۙ:Ll/ۧۢᩴ;

.field public ᩶:Ll/ۧۢᩴ;

.field public ᩸:Ll/ۧۢᩴ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܳۢᩴ;)V
    .locals 1

    .line 939
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۢᩴ;->ۗ:Ll/ܳۢᩴ;

    const/4 v0, 0x0

    .line 937
    iput v0, p0, Ll/ܽۢᩴ;->᩹:I

    .line 940
    iget-object p1, p1, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object p1, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic add(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 954
    iget-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 959
    iget-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ܽۢᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 998
    iget v0, p0, Ll/ܽۢᩴ;->᩹:I

    return v0
.end method

.method public final nextInt()I
    .locals 1

    .line 967
    invoke-virtual {p0}, Ll/ܽۢᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 968
    iget-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    .line 969
    iget v0, p0, Ll/ܽۢᩴ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۢᩴ;->᩹:I

    .line 970
    invoke-virtual {p0}, Ll/ܽۢᩴ;->֫()V

    .line 971
    iget-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    .line 976
    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    return v0

    .line 967
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ܽۢᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1003
    iget v0, p0, Ll/ܽۢᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 1008
    iget-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    if-eqz v0, :cond_1

    .line 1011
    iget-object v1, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-ne v0, v1, :cond_0

    iget v1, p0, Ll/ܽۢᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܽۢᩴ;->᩹:I

    .line 1012
    :cond_0
    iput-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1013
    invoke-virtual {p0}, Ll/ܽۢᩴ;->ۧ()V

    .line 1014
    invoke-virtual {p0}, Ll/ܽۢᩴ;->֫()V

    .line 1015
    iget-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    iget-object v1, p0, Ll/ܽۢᩴ;->ۗ:Ll/ܳۢᩴ;

    invoke-virtual {v1, v0}, Ll/ܳۢᩴ;->remove(I)Z

    const/4 v0, 0x0

    .line 1016
    iput-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    return-void

    .line 1008
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public ֫()V
    .locals 1

    .line 963
    iget-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܽ()Ll/ۧۢᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-void
.end method

.method public final synthetic ֫(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->ۧ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 1

    .line 989
    invoke-virtual {p0}, Ll/ܽۢᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 990
    iget-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    .line 991
    iget v0, p0, Ll/ܽۢᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽۢᩴ;->᩹:I

    .line 992
    invoke-virtual {p0}, Ll/ܽۢᩴ;->ۧ()V

    .line 993
    iget-object v0, p0, Ll/ܽۢᩴ;->᩸:Ll/ۧۢᩴ;

    .line 981
    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    return v0

    .line 989
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public ۧ()V
    .locals 1

    .line 985
    iget-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    return-void
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
