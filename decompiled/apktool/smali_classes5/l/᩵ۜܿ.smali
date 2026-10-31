.class public final Ll/᩵ۜܿ;
.super Ll/ۢܺܿ;
.source "699M"


# instance fields
.field public ܳ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 3

    .line 27
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    const/16 p1, 0x4f07

    .line 28
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 29
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 30
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    .line 31
    invoke-virtual {p2}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    iput p1, p0, Ll/᩵ۜܿ;->ܳ:I

    .line 32
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/᩵ۜܿ;->ܿ:I

    .line 33
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 35
    iget-object v1, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-static {p0, p2}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 3

    .line 63
    new-instance v0, Ll/᩵ۜܿ;

    invoke-direct {v0, p1}, Ll/᩵ۜܿ;-><init>(Ll/ۢܺܿ;)V

    .line 64
    iget-object p1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object p1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 65
    iget-object p1, p0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    iput-object p1, v0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    .line 66
    iget p1, p0, Ll/᩵ۜܿ;->ܳ:I

    iput p1, v0, Ll/᩵ۜܿ;->ܳ:I

    .line 67
    iget p1, p0, Ll/᩵ۜܿ;->ܿ:I

    iput p1, v0, Ll/᩵ۜܿ;->ܿ:I

    .line 68
    iget-object p1, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 69
    iget-object v2, v0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 6

    const-string v0, "\t"

    .line 124
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p2, 0x1

    .line 125
    invoke-static {v1, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 126
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "group: "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    iget v3, p0, Ll/᩵ۜܿ;->ܳ:I

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    const-string v3, "select"

    goto :goto_0

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "group type="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    iget v0, p0, Ll/᩵ۜܿ;->ܳ:I

    .line 100
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v3, "linkAll"

    goto :goto_0

    :cond_2
    const-string v3, "link"

    .line 126
    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    iget v4, p0, Ll/᩵ۜܿ;->ܿ:I

    invoke-static {v4}, Ll/ۙ᩷ܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 129
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "style: "

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x22

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "contains: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    iget-object v2, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢܺܿ;

    .line 133
    invoke-virtual {v3, p1, v1}, Ll/ۢܺܿ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_1

    .line 135
    :cond_4
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 4

    .line 83
    iget v0, p0, Ll/᩵ۜܿ;->ܳ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 140
    iget-object v3, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    if-ne v0, v1, :cond_0

    .line 141
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 142
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢܺܿ;

    invoke-virtual {v0, p1}, Ll/ۢܺܿ;->֫(Ljava/util/ArrayList;)V

    return-void

    .line 144
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢܺܿ;

    invoke-virtual {v0, p1}, Ll/ۢܺܿ;->֫(Ljava/util/ArrayList;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    const/16 v0, 0x4f07

    .line 42
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 43
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 44
    iget-object v0, p0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 45
    iget v0, p0, Ll/᩵ۜܿ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 46
    iget v0, p0, Ll/᩵ۜܿ;->ܿ:I

    invoke-static {v0}, Ll/ۙ᩷ܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 49
    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 2

    .line 56
    iget-object v0, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 57
    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/᩷ܺܿ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 105
    invoke-static {p1}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/᩵ۜܿ;->ܿ:I

    return-void
.end method

.method public final ۧ(Ll/ۢܺܿ;)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/᩵ۜܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 119
    iget v0, p0, Ll/᩵ۜܿ;->ܿ:I

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 3

    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "linkAll"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "link"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "select"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 91
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown group type: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v1, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x0

    :goto_1
    :pswitch_2
    iput v1, p0, Ll/᩵ۜܿ;->ܳ:I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3600cb04 -> :sswitch_2
        0x32affa -> :sswitch_1
        0xa8d9747 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܿ()I
    .locals 1

    .line 83
    iget v0, p0, Ll/᩵ۜܿ;->ܳ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩵ۜܿ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
