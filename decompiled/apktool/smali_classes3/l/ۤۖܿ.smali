.class public final Ll/ۤۖܿ;
.super Ljava/lang/Object;
.source "D6VU"


# instance fields
.field public final ֫:Ll/᩸᩷ܿ;

.field public final ۧ:Ll/ᩳۖܿ;

.field public ܳ:I

.field public final ܽ:I

.field public ܿ:I

.field public ᩳ:Ll/ܽۖܿ;

.field public ᩻:Ll/ۢۖܿ;


# direct methods
.method public constructor <init>(Ll/ۢۖܿ;Ll/᩸᩷ܿ;I)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/ᩳۖܿ;

    invoke-direct {v0}, Ll/ᩳۖܿ;-><init>()V

    iput-object v0, p0, Ll/ۤۖܿ;->ۧ:Ll/ᩳۖܿ;

    .line 40
    iput-object p1, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    .line 41
    iput-object p2, p0, Ll/ۤۖܿ;->֫:Ll/᩸᩷ܿ;

    .line 42
    iput p3, p0, Ll/ۤۖܿ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢۖܿ;
    .locals 4

    .line 93
    iget-object v0, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    if-eqz v0, :cond_0

    .line 94
    iget-object v1, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    iget v2, p0, Ll/ۤۖܿ;->ܳ:I

    iget v3, p0, Ll/ۤۖܿ;->ܿ:I

    invoke-virtual {v0}, Ll/ܽۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    const/4 v0, 0x0

    .line 95
    iput-object v0, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    .line 97
    :cond_0
    iget-object v0, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ֫(Ll/ۛۖܿ;)Ll/۬ۖܿ;
    .locals 5

    .line 72
    invoke-static {p1}, Ll/ۛۖܿ;->ۧ(Ll/ۛۖܿ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۤۖܿ;->֫:Ll/᩸᩷ܿ;

    if-eqz v0, :cond_0

    .line 73
    invoke-static {p1}, Ll/ۛۖܿ;->ܽ(Ll/ۛۖܿ;)I

    move-result v0

    invoke-static {p1}, Ll/ۛۖܿ;->֫(Ll/ۛۖܿ;)I

    move-result p1

    invoke-virtual {p0, v0, p1, v2}, Ll/ۤۖܿ;->֫(IILl/᩸᩷ܿ;)V

    return-object v1

    .line 76
    :cond_0
    invoke-static {p1}, Ll/ۛۖܿ;->ۧ(Ll/ۛۖܿ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    .line 77
    invoke-static {p1}, Ll/ۛۖܿ;->ۧ(Ll/ۛۖܿ;)Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۖܿ;

    .line 78
    invoke-static {v0}, Ll/۫ۖܿ;->ۧ(Ll/۫ۖܿ;)I

    move-result v3

    invoke-static {p1}, Ll/ۛۖܿ;->ܽ(Ll/ۛۖܿ;)I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Ll/۫ۖܿ;->֫(Ll/۫ۖܿ;)I

    move-result v3

    invoke-static {p1}, Ll/ۛۖܿ;->֫(Ll/ۛۖܿ;)I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 79
    invoke-static {p1}, Ll/ۛۖܿ;->ܽ(Ll/ۛۖܿ;)I

    move-result v3

    invoke-static {p1}, Ll/ۛۖܿ;->֫(Ll/ۛۖܿ;)I

    move-result p1

    invoke-static {v0}, Ll/۫ۖܿ;->ܽ(Ll/۫ۖܿ;)Ll/᩸᩷ܿ;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v0

    invoke-virtual {p0, v3, p1, v0}, Ll/ۤۖܿ;->֫(IILl/᩸᩷ܿ;)V

    return-object v1

    .line 83
    :cond_1
    invoke-virtual {p0}, Ll/ۤۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v0

    .line 26
    new-instance v1, Ll/۬ۖܿ;

    iget v3, p0, Ll/ۤۖܿ;->ܽ:I

    invoke-direct {v1, p1, v0, v2, v3}, Ll/۬ۖܿ;-><init>(Ll/ۛۖܿ;Ll/ۢۖܿ;Ll/᩸᩷ܿ;I)V

    return-object v1
.end method

.method public final ֫(IILl/᩸᩷ܿ;)V
    .locals 9

    .line 47
    iget v0, p0, Ll/ۤۖܿ;->ܽ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v1, v0

    sub-int/2addr p2, v0

    .line 48
    iget-object v2, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    invoke-virtual {v2}, Ll/ۢۖܿ;->֫()I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-lt v1, p2, :cond_0

    return-void

    .line 50
    :cond_0
    iget-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    if-eqz v2, :cond_1

    iget v2, p0, Ll/ۤۖܿ;->ܿ:I

    if-ge v1, v2, :cond_1

    invoke-virtual {p0}, Ll/ۤۖܿ;->֫()Ll/ۢۖܿ;

    .line 51
    :cond_1
    iget-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    iget v2, p0, Ll/ۤۖܿ;->ܿ:I

    if-le v1, v2, :cond_4

    .line 52
    iget-object v4, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    .line 279
    iget-object v5, p0, Ll/ۤۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v5, v4}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 280
    invoke-virtual {v5, v2}, Ll/ᩳۖܿ;->֫(I)Z

    .line 53
    invoke-virtual {v5}, Ll/ᩳۖܿ;->֫()I

    move-result v2

    if-ge v2, v1, :cond_2

    .line 55
    invoke-virtual {p0}, Ll/ۤۖܿ;->֫()Ll/ۢۖܿ;

    goto :goto_1

    .line 57
    :cond_2
    iget-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    iget v4, p0, Ll/ۤۖܿ;->ܿ:I

    sub-int v4, v1, v4

    invoke-virtual {v5}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v6

    .line 58
    invoke-virtual {v5}, Ll/ᩳۖܿ;->ᩳ()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Ll/ᩳۖܿ;->ۧ()I

    move-result v7

    iget v8, p0, Ll/ۤۖܿ;->ܿ:I

    if-ne v7, v8, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    .line 57
    :goto_0
    invoke-virtual {v2, v4, v6, v7}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    .line 60
    :goto_1
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 62
    :cond_4
    iget-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    if-nez v2, :cond_5

    .line 63
    new-instance v2, Ll/ܽۖܿ;

    invoke-direct {v2}, Ll/ܽۖܿ;-><init>()V

    iput-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    .line 64
    iput v1, p0, Ll/ۤۖܿ;->ܳ:I

    .line 66
    :cond_5
    iget-object v2, p0, Ll/ۤۖܿ;->ᩳ:Ll/ܽۖܿ;

    sub-int v4, p2, v1

    add-int/2addr v1, v0

    if-ne v1, p1, :cond_6

    const/4 v3, 0x1

    :cond_6
    invoke-virtual {v2, v4, p3, v3}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    .line 67
    iput p2, p0, Ll/ۤۖܿ;->ܿ:I

    return-void
.end method

.method public final ֫(Ll/۬ۖܿ;)V
    .locals 0

    .line 88
    invoke-virtual {p1}, Ll/۬ۖܿ;->ۧ()Ll/ۢۖܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۖܿ;->᩻:Ll/ۢۖܿ;

    return-void
.end method
