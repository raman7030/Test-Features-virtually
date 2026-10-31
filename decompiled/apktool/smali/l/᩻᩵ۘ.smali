.class public abstract Ll/᩻᩵ۘ;
.super Ljava/lang/Object;
.source "A8DU"


# instance fields
.field public ֫:Ll/ۙᩴۘ;

.field public ۧ:Z

.field public ܽ:J

.field public ܿ:Ll/۟ۘۘ;

.field public final ᩳ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/᩻᩵ۘ;->ᩳ:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Ll/᩻᩵ۘ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ll/᩸ᩴۘ;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/᩻᩵ۘ;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸ᩴۘ;

    return-object p1
.end method

.method public ֫()V
    .locals 3

    .line 186
    iget-object v0, p0, Ll/᩻᩵ۘ;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۘ;

    .line 187
    instance-of v2, v1, Ll/ܶᩴۘ;

    if-eqz v2, :cond_0

    .line 188
    check-cast v1, Ll/ܶᩴۘ;

    invoke-virtual {v1}, Ll/ܶᩴۘ;->ܳ()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(J)V
    .locals 3

    .line 207
    iget-boolean v0, p0, Ll/᩻᩵ۘ;->ۧ:Z

    if-eqz v0, :cond_2

    iget-wide v0, p0, Ll/᩻᩵ۘ;->ܽ:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    .line 209
    iput-wide p1, p0, Ll/᩻᩵ۘ;->ܽ:J

    .line 211
    iget-object v0, p0, Ll/᩻᩵ۘ;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۘ;

    .line 212
    instance-of v2, v1, Ll/ᩳᩴۘ;

    if-eqz v2, :cond_0

    .line 213
    check-cast v1, Ll/ᩳᩴۘ;

    invoke-interface {v1, p1, p2}, Ll/ᩳᩴۘ;->֫(J)V

    goto :goto_0

    .line 217
    :cond_1
    invoke-virtual {p0}, Ll/᩻᩵ۘ;->ۧ()V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۙᩴۘ;)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/᩻᩵ۘ;->֫:Ll/ۙᩴۘ;

    if-nez v0, :cond_0

    .line 198
    iput-object p1, p0, Ll/᩻᩵ۘ;->֫:Ll/ۙᩴۘ;

    return-void

    .line 195
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unit is already in a circuit."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/۟ۘۘ;)V
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 135
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unit synthesisEngine already set."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 137
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    return-void
.end method

.method public final ֫(Ll/۠ᩴۘ;Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-virtual {p1, p2}, Ll/᩸ᩴۘ;->֫(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0, p1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩸ᩴۘ;)V
    .locals 2

    .line 78
    invoke-virtual {p1, p0}, Ll/᩸ᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 80
    invoke-virtual {p1}, Ll/᩸ᩴۘ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩵ۘ;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ֫(Z)V
    .locals 0

    .line 236
    iput-boolean p1, p0, Ll/᩻᩵ۘ;->ۧ:Z

    if-nez p1, :cond_0

    .line 238
    invoke-virtual {p0}, Ll/᩻᩵ۘ;->֫()V

    :cond_0
    return-void
.end method

.method public final ۜ()V
    .locals 3

    .line 120
    iget-object v0, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {v0, p0}, Ll/۟ۘۘ;->ۧ(Ll/᩻᩵ۘ;)V

    return-void

    .line 264
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was not add()ed to a Synthesizer."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ۧ()V
.end method

.method public final ܳ()Ll/۟ۘۘ;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    return-object v0
.end method

.method public final ܽ()Ll/ۙᩴۘ;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/᩻᩵ۘ;->֫:Ll/ۙᩴۘ;

    return-object v0
.end method

.method public final ܿ()Ll/۟ۘۘ;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 222
    iget-boolean v0, p0, Ll/᩻᩵ۘ;->ۧ:Z

    return v0
.end method
