.class public abstract Ll/ۛ۟ᩴ;
.super Ll/ۚ֫᩵;
.source "N673"

# interfaces
.implements Ll/֨۫ᩴ;


# virtual methods
.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 2

    .line 1151
    iget-object v0, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 1154
    :cond_0
    iget-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    if-nez v0, :cond_3

    .line 1155
    iget-object v0, p0, Ll/ۚ֫᩵;->c:Ll/ܶ۫ᩴ;

    if-nez v0, :cond_2

    .line 1156
    invoke-virtual {p0}, Ll/ۚ֫᩵;->b()Ljava/util/Deque;

    move-result-object v0

    .line 1158
    :goto_0
    invoke-static {v0}, Ll/ۚ֫᩵;->a(Ljava/util/Deque;)Ll/ۚ۟ᩴ;

    move-result-object v1

    check-cast v1, Ll/᩻۟ᩴ;

    if-eqz v1, :cond_1

    .line 1159
    invoke-interface {v1, p1}, Ll/᩻۟ᩴ;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 1161
    iput-object p1, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    return-void

    .line 1164
    :cond_2
    check-cast v0, Ll/֨۫ᩴ;

    invoke-interface {v0, p1}, Ll/֨۫ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void

    .line 1167
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 0

    .line 1189
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 1171
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 0

    .line 1180
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 2

    .line 1129
    invoke-virtual {p0}, Ll/ۚ֫᩵;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1132
    :cond_0
    iget-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    check-cast v0, Ll/֨۫ᩴ;

    invoke-interface {v0, p1}, Ll/֨۫ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1134
    iget-object v1, p0, Ll/ۚ֫᩵;->c:Ll/ܶ۫ᩴ;

    if-nez v1, :cond_1

    .line 1136
    iget-object v1, p0, Ll/ۚ֫᩵;->e:Ljava/util/Deque;

    invoke-static {v1}, Ll/ۚ֫᩵;->a(Ljava/util/Deque;)Ll/ۚ۟ᩴ;

    move-result-object v1

    check-cast v1, Ll/᩻۟ᩴ;

    if-eqz v1, :cond_1

    .line 1138
    invoke-interface {v1}, Ll/᩻۟ᩴ;->spliterator()Ll/֨۫ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ֫᩵;->d:Ll/ܶ۫ᩴ;

    .line 1140
    invoke-interface {v0, p1}, Ll/֨۫ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 1144
    iput-object p1, p0, Ll/ۚ֫᩵;->a:Ll/ۚ۟ᩴ;

    :cond_2
    return v0
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/DoubleConsumer;)Z
    .locals 0

    .line 1189
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 0

    .line 1171
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 0

    .line 1180
    invoke-virtual {p0, p1}, Ll/ۛ۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
