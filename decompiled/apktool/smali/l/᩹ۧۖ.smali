.class public final Ll/᩹ۧۖ;
.super Ljava/lang/Object;
.source "C7P7"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/֫᩹۠;

.field public final ᩹:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;Ll/֫᩹۠;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    .line 74
    iput-object p2, p0, Ll/᩹ۧۖ;->᩸:Ll/֫᩹۠;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 60
    check-cast p1, Ll/᩹ۧۖ;

    .line 115
    invoke-virtual {p0}, Ll/᩹ۧۖ;->᩻()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 116
    iget-object v0, p0, Ll/᩹ۧۖ;->᩸:Ll/֫᩹۠;

    iget-object p1, p1, Ll/᩹ۧۖ;->᩸:Ll/֫᩹۠;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 2

    .line 94
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۟ܺ;

    .line 102
    invoke-interface {v1}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v1

    check-cast v1, Ll/᩸֫ۖ;

    invoke-virtual {v1}, Ll/᩸֫ۖ;->getPosition()I

    move-result v1

    .line 94
    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 102
    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    check-cast v0, Ll/᩸֫ۖ;

    invoke-virtual {v0}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final ۡ()Ll/ܳ۬ܺ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ۢ()I
    .locals 2

    .line 90
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 98
    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    check-cast v0, Ll/᩸֫ۖ;

    invoke-virtual {v0}, Ll/᩸֫ۖ;->getPosition()I

    move-result v0

    return v0
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 110
    invoke-interface {v0}, Ll/᩸۟ܺ;->ܽ()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/ܳ۬ܺ;
    .locals 2

    .line 90
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 106
    invoke-interface {v0}, Ll/᩸۟ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/֫᩹۠;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩹ۧۖ;->᩸:Ll/֫᩹۠;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩹ۧۖ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩹ۧۖ;->᩸:Ll/֫᩹۠;

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
