.class public final Ll/᩷ۙ᩵;
.super Ll/ۘۙ᩵;


# direct methods
.method public static ֫(Ll/ܽۙ᩵;)Ljava/lang/Object;
    .locals 1

    .line 196
    new-instance v0, Ll/ۧۙ᩵;

    invoke-direct {v0, p0}, Ll/ۧۙ᩵;-><init>(Ll/ܽۙ᩵;)V

    .line 173
    invoke-virtual {v0}, Ll/ۧۙ᩵;->hasNext()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 175
    :cond_0
    invoke-virtual {v0}, Ll/ۧۙ᩵;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܳۙ᩵;)Ljava/util/List;
    .locals 2

    .line 827
    invoke-interface {p0}, Ll/ܳۙ᩵;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 828
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 829
    sget-object p0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    return-object p0

    .line 830
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 831
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 832
    invoke-static {v0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 833
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 834
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 835
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static ֫(Landroid/view/View;Ll/ܺ᩹᩵;)Ll/ܳۙ᩵;
    .locals 2

    if-nez p0, :cond_0

    .line 711
    sget-object p0, Ll/֫ۙ᩵;->֫:Ll/֫ۙ᩵;

    return-object p0

    .line 713
    :cond_0
    new-instance v0, Ll/ܿۙ᩵;

    new-instance v1, Ll/ܺۙ᩵;

    invoke-direct {v1, p0}, Ll/ܺۙ᩵;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, Ll/ܿۙ᩵;-><init>(Ll/ܺۙ᩵;Ll/ܺ᩹᩵;)V

    return-object v0
.end method
