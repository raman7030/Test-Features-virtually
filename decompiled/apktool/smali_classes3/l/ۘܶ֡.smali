.class public final Ll/ۘܶ֡;
.super Ll/ۧܶ֡;
.source "U6AJ"


# instance fields
.field public ۗ:Z

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/֨ܶ֡;ILl/ܺܽۚ;)V
    .locals 6

    .line 50
    invoke-direct {p0, p1, p2, p3}, Ll/ۧܶ֡;-><init>(Ll/֨ܶ֡;ILl/᩺֫ۚ;)V

    .line 52
    invoke-virtual {p1, p2}, Ll/֨ܶ֡;->ۧ(I)I

    move-result p2

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܶ֡;->۬:Ljava/util/ArrayList;

    if-ltz p2, :cond_0

    .line 56
    invoke-interface {p3}, Ll/ܿۧۚ;->ۙ()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۧۚ;

    .line 57
    invoke-virtual {p1}, Ll/֨ܶ֡;->֫()Ll/ۚܶ֡;

    move-result-object v1

    new-instance v2, Ll/᩵ܶ֡;

    iget-object v3, p1, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    .line 58
    invoke-interface {v0}, Ll/ᩳۧۚ;->֫()I

    move-result v4

    add-int/2addr v4, p2

    const-string v5, "sswitch_"

    invoke-direct {v2, v3, v4, v5}, Ll/᩵ܶ֡;-><init>(Ll/᩹ܶ֡;ILjava/lang/String;)V

    .line 57
    invoke-virtual {v1, v2}, Ll/ۚܶ֡;->֫(Ll/᩵ܶ֡;)Ll/᩵ܶ֡;

    move-result-object v1

    .line 60
    iget-object v2, p0, Ll/ۘܶ֡;->۬:Ljava/util/ArrayList;

    new-instance v3, Ll/ۡܶ֡;

    invoke-interface {v0}, Ll/ᩳۧۚ;->getKey()I

    move-result v0

    invoke-direct {v3, v0, v1}, Ll/ۡܶ֡;-><init>(ILl/᩵ܶ֡;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Ll/ۘܶ֡;->ۗ:Z

    .line 65
    invoke-interface {p3}, Ll/ܿۧۚ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۧۚ;

    .line 66
    iget-object p3, p0, Ll/ۘܶ֡;->۬:Ljava/util/ArrayList;

    new-instance v0, Ll/ܺܶ֡;

    invoke-interface {p2}, Ll/ᩳۧۚ;->getKey()I

    move-result v1

    invoke-interface {p2}, Ll/ᩳۧۚ;->֫()I

    move-result p2

    invoke-direct {v0, v1, p2}, Ll/ܺܶ֡;-><init>(II)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 6

    .line 73
    iget-boolean v0, p0, Ll/ۘܶ֡;->ۗ:Z

    if-eqz v0, :cond_0

    .line 74
    new-instance v0, Ll/۠۠֡;

    .line 41
    invoke-direct {v0, p1}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    move-object p1, v0

    .line 77
    :cond_0
    iget-object v0, p0, Ll/ۧܶ֡;->᩶:Ll/֨ܶ֡;

    iget-object v0, v0, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    iget-boolean v0, v0, Ll/᩹ܶ֡;->ܳ:Z

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0xf

    const-string v2, ".sparse-switch\n"

    const/4 v3, 0x0

    .line 116
    invoke-virtual {p1, v2, v3, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 79
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 80
    iget-object v1, p0, Ll/ۘܶ֡;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܶ֡;

    .line 81
    invoke-virtual {v2}, Ll/ۖܶ֡;->֫()I

    move-result v4

    invoke-static {p1, v4}, Ll/᩶ܶ֡;->֫(Ll/ۗ᩵ۚ;I)V

    const-string v4, " -> "

    const/4 v5, 0x4

    .line 116
    invoke-virtual {p1, v4, v3, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 83
    invoke-virtual {v2, p1}, Ll/ۖܶ֡;->֫(Ll/ۗ᩵ۚ;)V

    if-eqz v0, :cond_1

    .line 85
    invoke-virtual {v2}, Ll/ۖܶ֡;->֫()I

    move-result v2

    invoke-virtual {p0, p1, v2}, Ll/ۧܶ֡;->֫(Ll/ۗ᩵ۚ;I)Z

    :cond_1
    const/16 v2, 0xa

    .line 87
    invoke-virtual {p1, v2}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_0

    .line 89
    :cond_2
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->֫()V

    const-string v0, ".end sparse-switch"

    const/16 v1, 0x12

    .line 116
    invoke-virtual {p1, v0, v3, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ܿ()V
    .locals 0

    return-void
.end method
