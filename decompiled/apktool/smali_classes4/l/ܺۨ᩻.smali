.class public final Ll/ܺۨ᩻;
.super Ljava/lang/Object;
.source "2781"


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Ll/ۢ᩺᩻;

.field public ܽ:Ll/۬ۛ֡;

.field public ܿ:Ll/۬ۜᩳ;

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ܺۨ᩻;->֫:Ljava/util/HashMap;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡܳ;)Ll/۬ۛ֡;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ܺۨ᩻;->ܽ:Ll/۬ۛ֡;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺۨ᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺۨ᩻;->ۧ:Ljava/lang/String;

    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object p1, p0, Ll/ܺۨ᩻;->ܽ:Ll/۬ۛ֡;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Ll/ܺۨ᩻;->ܽ:Ll/۬ۛ֡;

    .line 76
    iput-object v0, p0, Ll/ܺۨ᩻;->ᩳ:Ljava/lang/String;

    .line 77
    iput-object v0, p0, Ll/ܺۨ᩻;->ۧ:Ljava/lang/String;

    .line 78
    iget-object v0, p3, Ll/ᩴۡܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۨۨ᩻;

    iget-object p3, p3, Ll/ᩴۡܳ;->᩹:Ljava/lang/Object;

    check-cast p3, Ll/ܳ᩻ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-virtual {p3, p2}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object p3

    .line 79
    iput-object p3, p0, Ll/ܺۨ᩻;->ܽ:Ll/۬ۛ֡;

    .line 80
    iput-object p1, p0, Ll/ܺۨ᩻;->ᩳ:Ljava/lang/String;

    .line 81
    iput-object p2, p0, Ll/ܺۨ᩻;->ۧ:Ljava/lang/String;

    return-object p3
.end method

.method public final ֫()Ll/۬ۜᩳ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ܺۨ᩻;->ܿ:Ll/۬ۜᩳ;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ll/۬ۜᩳ;

    invoke-direct {v0}, Ll/۬ۜᩳ;-><init>()V

    iput-object v0, p0, Ll/ܺۨ᩻;->ܿ:Ll/۬ۜᩳ;

    .line 32
    :cond_0
    iget-object v0, p0, Ll/ܺۨ᩻;->ܿ:Ll/۬ۜᩳ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ܺۨ᩻;->֫:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܺۨ᩻;->֫:Ljava/util/HashMap;

    .line 99
    :cond_0
    iget-object v0, p0, Ll/ܺۨ᩻;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()Ll/ۢ᩺᩻;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ܺۨ᩻;->ܳ:Ll/ۢ᩺᩻;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Ll/ۢ᩺᩻;

    invoke-direct {v0}, Ll/ۢ᩺᩻;-><init>()V

    iput-object v0, p0, Ll/ܺۨ᩻;->ܳ:Ll/ۢ᩺᩻;

    .line 42
    :cond_0
    iget-object v0, p0, Ll/ܺۨ᩻;->ܳ:Ll/ۢ᩺᩻;

    return-object v0
.end method
