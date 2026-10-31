.class public final Ll/᩻֫᩵;
.super Ll/ۚ֫᩵;
.source "N673"


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 1097
    iget-object v0, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 1100
    :cond_0
    iget-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    if-nez v0, :cond_3

    .line 1101
    iget-object v0, p0, Ll/ۚ֫᩵;->c:Ll/ܶ۫ᩴ;

    if-nez v0, :cond_2

    .line 1102
    invoke-virtual {p0}, Ll/ۚ֫᩵;->b()Ljava/util/Deque;

    move-result-object v0

    .line 1104
    :goto_0
    invoke-static {v0}, Ll/ۚ֫᩵;->a(Ljava/util/Deque;)Ll/ۚ۟ᩴ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1105
    invoke-interface {v1, p1}, Ll/ۚ۟ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 1107
    iput-object p1, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    return-void

    .line 1110
    :cond_2
    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void

    .line 1113
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Ll/᩻֫᩵;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 2

    .line 1075
    invoke-virtual {p0}, Ll/ۚ֫᩵;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1078
    :cond_0
    iget-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1080
    iget-object v1, p0, Ll/ۚ֫᩵;->c:Ll/ܶ۫ᩴ;

    if-nez v1, :cond_1

    .line 1082
    iget-object v1, p0, Ll/ۚ֫᩵;->e:Ljava/util/Deque;

    invoke-static {v1}, Ll/ۚ֫᩵;->a(Ljava/util/Deque;)Ll/ۚ۟ᩴ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1084
    invoke-interface {v1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    .line 1086
    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 1090
    iput-object p1, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    :cond_2
    return v0
.end method
