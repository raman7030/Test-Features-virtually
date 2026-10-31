.class public abstract Ll/ܺܿۘ;
.super Ljava/lang/Object;
.source "31MV"


# instance fields
.field public final ֫:Ll/ᩳܳۘ;

.field public final ۧ:Ll/ۜܳۘ;

.field public final ܽ:Ll/ۙܳۘ;

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IILl/ۜܳۘ;Ll/ۙܳۘ;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput p1, p0, Ll/ܺܿۘ;->ᩳ:I

    .line 53
    iput p2, p0, Ll/ܺܿۘ;->ܿ:I

    .line 54
    iput-object p3, p0, Ll/ܺܿۘ;->ۧ:Ll/ۜܳۘ;

    .line 55
    iput-object p4, p0, Ll/ܺܿۘ;->ܽ:Ll/ۙܳۘ;

    .line 57
    new-instance p3, Ll/ᩳܳۘ;

    .line 338
    invoke-direct {p3, p1, p2}, Ll/ܿܳۘ;-><init>(II)V

    .line 57
    iput-object p3, p0, Ll/ܺܿۘ;->֫:Ll/ᩳܳۘ;

    return-void
.end method


# virtual methods
.method public ֫()Ll/ۜܳۘ;
    .locals 12

    .line 70
    iget-object v0, p0, Ll/ܺܿۘ;->ۧ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/ܺܿۘ;->֫:Ll/ᩳܳۘ;

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܳۘ;

    .line 71
    iget v5, v3, Ll/᩹ܳۘ;->֫:I

    iget v6, v3, Ll/᩹ܳۘ;->ܽ:I

    sub-int/2addr v5, v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    add-int v8, v6, v7

    .line 73
    invoke-virtual {p0, v8}, Ll/ܺܿۘ;->֫(I)Ll/᩸ܳۘ;

    move-result-object v8

    .line 74
    iget v9, v3, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v9, v7

    invoke-virtual {p0, v9}, Ll/ܺܿۘ;->ۧ(I)Ll/᩸ܳۘ;

    move-result-object v9

    .line 76
    iget v10, v8, Ll/᩸ܳۘ;->֫:I

    .line 77
    iget v11, v9, Ll/᩸ܳۘ;->֫:I

    .line 78
    iget v8, v8, Ll/᩸ܳۘ;->ۧ:I

    .line 79
    iget v9, v9, Ll/᩸ܳۘ;->ۧ:I

    .line 81
    invoke-virtual {p0, v1, v10, v2, v11}, Ll/ܺܿۘ;->֫(IIII)V

    .line 82
    invoke-virtual {v4, v10, v11, v8, v9}, Ll/ܿܳۘ;->ۧ(IIII)V

    add-int/lit8 v7, v7, 0x1

    move v1, v8

    move v2, v9

    goto :goto_0

    .line 88
    :cond_1
    iget v0, p0, Ll/ܺܿۘ;->ᩳ:I

    iget v3, p0, Ll/ܺܿۘ;->ܿ:I

    invoke-virtual {p0, v1, v0, v2, v3}, Ll/ܺܿۘ;->֫(IIII)V

    .line 63
    invoke-virtual {v4}, Ll/ᩳܳۘ;->ܳ()Ll/֫ܳۘ;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(I)Ll/᩸ܳۘ;
.end method

.method public abstract ֫(IIII)V
.end method

.method public abstract ۧ(I)Ll/᩸ܳۘ;
.end method
