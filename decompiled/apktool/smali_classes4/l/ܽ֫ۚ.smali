.class public final Ll/ܽ֫ۚ;
.super Ljava/lang/Object;
.source "H16C"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:Ll/ᩴ᩵;

.field public ᩹:Ll/ᩴ᩵;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;Ll/ܿ֫ۚ;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    iput-object v0, p0, Ll/ܽ֫ۚ;->᩸:Ll/ᩴ᩵;

    .line 35
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    iput-object v0, p0, Ll/ܽ֫ۚ;->᩹:Ll/ᩴ᩵;

    .line 42
    invoke-virtual {p1}, Ll/۠ۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܽ֫ۚ;->֫(Ljava/util/Set;Ll/ܿ֫ۚ;)V

    .line 43
    invoke-virtual {p1}, Ll/۠ۛ֡;->getFields()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ֫ۚ;

    .line 44
    invoke-interface {v1}, Ll/ۘ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Ll/ܽ֫ۚ;->֫(Ljava/util/Set;Ll/ܿ֫ۚ;)V

    .line 45
    iget-object v2, p0, Ll/ܽ֫ۚ;->᩸:Ll/ᩴ᩵;

    invoke-virtual {p2, v1}, Ll/ܿ֫ۚ;->֫(Ll/ᩴܽۚ;)Ll/ܳ֫ۚ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ֫ۚ;

    .line 48
    iget-object v1, p0, Ll/ܽ֫ۚ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {p2, v0}, Ll/ܿ֫ۚ;->֫(Ll/ۚܽۚ;)Ll/᩻֫ۚ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-interface {v0}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Ll/ܽ֫ۚ;->֫(Ljava/util/Set;Ll/ܿ֫ۚ;)V

    .line 50
    invoke-interface {v0}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֫ۚ;

    .line 51
    invoke-interface {v2}, Ll/֡֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Ll/ܽ֫ۚ;->֫(Ljava/util/Set;Ll/ܿ֫ۚ;)V

    goto :goto_1

    .line 53
    :cond_2
    invoke-interface {v0}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 55
    invoke-interface {v0}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 56
    instance-of v2, v1, Ll/ۧۧۚ;

    if-eqz v2, :cond_3

    .line 57
    move-object v2, v1

    check-cast v2, Ll/ۧۧۚ;

    invoke-interface {v2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    .line 58
    instance-of v2, v1, Ll/۬֫ۚ;

    if-eqz v2, :cond_3

    .line 59
    check-cast v1, Ll/۬֫ۚ;

    invoke-interface {v1}, Ll/۬֫ۚ;->ۜ()Ll/۠ܽۚ;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method private ֫(Ljava/util/Set;Ll/ܿ֫ۚ;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_1

    .line 86
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷֫ۚ;

    .line 87
    invoke-interface {v0}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢ֫ۚ;

    .line 88
    invoke-interface {v1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Ll/ܽ֫ۚ;->֫(Ll/ۤܽۚ;Ll/ܿ֫ۚ;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private ֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V
    .locals 1

    .line 68
    instance-of v0, p1, Ll/ۚܽۚ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۚܽۚ;

    .line 69
    iget-object v0, p0, Ll/ܽ֫ۚ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {p2, p1}, Ll/ܿ֫ۚ;->֫(Ll/ۚܽۚ;)Ll/᩻֫ۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    return-void

    .line 70
    :cond_0
    instance-of v0, p1, Ll/ᩴܽۚ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ᩴܽۚ;

    .line 71
    iget-object v0, p0, Ll/ܽ֫ۚ;->᩸:Ll/ᩴ᩵;

    invoke-virtual {p2, p1}, Ll/ܿ֫ۚ;->֫(Ll/ᩴܽۚ;)Ll/ܳ֫ۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    return-void

    .line 72
    :cond_1
    instance-of v0, p1, Ll/᩵ܽۚ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩵ܽۚ;

    .line 73
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    return-void

    .line 74
    :cond_2
    instance-of v0, p1, Ll/ۘܽۚ;

    if-eqz v0, :cond_3

    check-cast p1, Ll/ۘܽۚ;

    .line 75
    invoke-interface {p1}, Ll/ۘܽۚ;->᩷()Ll/᩵ܽۚ;

    move-result-object v0

    .line 76
    invoke-interface {v0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    .line 77
    invoke-interface {p1}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤܽۚ;

    .line 78
    invoke-direct {p0, v0, p2}, Ll/ܽ֫ۚ;->֫(Ll/ۤܽۚ;Ll/ܿ֫ۚ;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ֫(Ll/ۤܽۚ;Ll/ܿ֫ۚ;)V
    .locals 2

    .line 94
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/16 v1, 0x16

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 114
    :pswitch_0
    check-cast p1, Ll/᩹ܽۚ;

    .line 115
    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֫ۚ;

    .line 116
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܽ֫ۚ;->֫(Ll/ۤܽۚ;Ll/ܿ֫ۚ;)V

    goto :goto_0

    .line 108
    :pswitch_1
    check-cast p1, Ll/᩶ܽۚ;

    .line 109
    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤܽۚ;

    .line 110
    invoke-direct {p0, v0, p2}, Ll/ܽ֫ۚ;->֫(Ll/ۤܽۚ;Ll/ܿ֫ۚ;)V

    goto :goto_1

    .line 102
    :pswitch_2
    check-cast p1, Ll/ۛܽۚ;

    invoke-interface {p1}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    return-void

    .line 96
    :pswitch_3
    check-cast p1, Ll/֫ᩳۚ;

    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    return-void

    .line 99
    :pswitch_4
    check-cast p1, Ll/ۨܽۚ;

    invoke-interface {p1}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    :cond_0
    :goto_2
    return-void

    .line 105
    :cond_1
    check-cast p1, Ll/ۧᩳۚ;

    invoke-interface {p1}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ܽ֫ۚ;->֫(Ll/۠ܽۚ;Ll/ܿ֫ۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 33
    check-cast p1, Ll/ܽ֫ۚ;

    .line 125
    iget-object p1, p1, Ll/ܽ֫ۚ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {p1}, Ll/ᩴ᩵;->size()I

    move-result p1

    iget-object v0, p0, Ll/ܽ֫ۚ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {v0}, Ll/ᩴ᩵;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
