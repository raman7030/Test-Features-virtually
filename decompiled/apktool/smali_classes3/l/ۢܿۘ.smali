.class public final Ll/ۢܿۘ;
.super Ll/ܺܿۘ;
.source "31MV"


# instance fields
.field public final ۜ:Ljava/lang/CharSequence;

.field public final ܳ:Ll/۬ᩳۘ;

.field public final ᩷:Ljava/lang/CharSequence;

.field public final ᩻:Ll/۬ᩳۘ;


# direct methods
.method public constructor <init>(Ll/۬ᩳۘ;Ll/۬ᩳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۜܳۘ;Ll/ۙܳۘ;)V
    .locals 2

    .line 118
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {p0, v0, v1, p5, p6}, Ll/ܺܿۘ;-><init>(IILl/ۜܳۘ;Ll/ۙܳۘ;)V

    .line 119
    iput-object p1, p0, Ll/ۢܿۘ;->ܳ:Ll/۬ᩳۘ;

    .line 120
    iput-object p2, p0, Ll/ۢܿۘ;->᩻:Ll/۬ᩳۘ;

    .line 121
    iput-object p3, p0, Ll/ۢܿۘ;->ۜ:Ljava/lang/CharSequence;

    .line 122
    iput-object p4, p0, Ll/ۢܿۘ;->᩷:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/᩸ܳۘ;
    .locals 2

    .line 300
    iget-object v0, p0, Ll/ۢܿۘ;->ܳ:Ll/۬ᩳۘ;

    iget-object v1, v0, Ll/۬ᩳۘ;->ۧ:[I

    aget v1, v1, p1

    .line 139
    invoke-virtual {v0, p1}, Ll/۬ᩳۘ;->֫(I)I

    move-result p1

    .line 140
    new-instance v0, Ll/᩸ܳۘ;

    invoke-direct {v0, v1, p1}, Ll/᩸ܳۘ;-><init>(II)V

    return-object v0
.end method

.method public final ֫(IIII)V
    .locals 3

    .line 127
    iget-object v0, p0, Ll/ۢܿۘ;->ۜ:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    .line 128
    iget-object v0, p0, Ll/ۢܿۘ;->᩷:Ljava/lang/CharSequence;

    invoke-interface {v0, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p4

    .line 129
    iget-object v0, p0, Ll/ܺܿۘ;->ܽ:Ll/ۙܳۘ;

    invoke-static {p2, p4, v0}, Ll/۫ᩳۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 131
    invoke-interface {p2}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩹ܳۘ;

    .line 132
    iget v0, p4, Ll/᩹ܳۘ;->ܽ:I

    add-int v1, p1, v0

    iget v2, p4, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v2, p3

    iget p4, p4, Ll/᩹ܳۘ;->֫:I

    sub-int/2addr p4, v0

    iget-object v0, p0, Ll/ܺܿۘ;->֫:Ll/ᩳܳۘ;

    invoke-virtual {v0, v1, v2, p4}, Ll/ܿܳۘ;->֫(III)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(I)Ll/᩸ܳۘ;
    .locals 2

    .line 300
    iget-object v0, p0, Ll/ۢܿۘ;->᩻:Ll/۬ᩳۘ;

    iget-object v1, v0, Ll/۬ᩳۘ;->ۧ:[I

    aget v1, v1, p1

    .line 146
    invoke-virtual {v0, p1}, Ll/۬ᩳۘ;->֫(I)I

    move-result p1

    .line 147
    new-instance v0, Ll/᩸ܳۘ;

    invoke-direct {v0, v1, p1}, Ll/᩸ܳۘ;-><init>(II)V

    return-object v0
.end method
