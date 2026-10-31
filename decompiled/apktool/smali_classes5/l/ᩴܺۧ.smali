.class public final Ll/ᩴܺۧ;
.super Ljava/lang/Object;
.source "K8LL"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 7

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Ll/ᩴܺۧ;->֫:Ljava/util/ArrayList;

    .line 135
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 138
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘܺۧ;

    iget-wide v2, v0, Ll/ۘܺۧ;->֫:J

    const/4 v0, 0x1

    .line 139
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 140
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘܺۧ;

    iget-wide v4, v4, Ll/ۘܺۧ;->ܽ:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    .line 143
    :cond_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܺۧ;

    iget-wide v2, v2, Ll/ۘܺۧ;->֫:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    xor-int/lit8 p1, v1, 0x1

    .line 109
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 122
    const-class v0, Ll/ᩴܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    check-cast p1, Ll/ᩴܺۧ;

    .line 126
    iget-object v0, p0, Ll/ᩴܺۧ;->֫:Ljava/util/ArrayList;

    iget-object p1, p1, Ll/ᩴܺۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ᩴܺۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SlowMotion: segments="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩴܺۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ᩳ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
