.class public final Ll/ۖۢܳ;
.super Ljava/lang/Object;
.source "Q1IX"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۜ:Ljava/lang/String;

.field public final ۡ:Ljava/util/List;

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Ll/ܽۢܳ;

.field public final ܳ:Z

.field public final ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/Exception;

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 6

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    .line 25
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۢܳ;->᩻:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۢܳ;->᩷:Ljava/lang/String;

    .line 29
    :try_start_0
    invoke-virtual {p1}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 31
    iput-object v0, p0, Ll/ۖۢܳ;->ܽ:Ljava/lang/Exception;

    const/4 v0, 0x0

    .line 34
    :goto_0
    iput-object v0, p0, Ll/ۖۢܳ;->ۢ:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۢܳ;->ۜ:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩶()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۢܳ;->ܺ:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩸()Ljava/util/List;

    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p1, Ll/ܽۢܳ;->ۤ:Ll/ۢۢܳ;

    invoke-virtual {v1}, Ll/ۢۢܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 39
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۘ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۢܳ;->ۡ:Ljava/util/List;

    .line 40
    iput-boolean v2, p0, Ll/ۖۢܳ;->ᩳ:Z

    goto :goto_1

    .line 42
    :cond_0
    iput-object v0, p0, Ll/ۖۢܳ;->ۡ:Ljava/util/List;

    .line 1236
    iget-object v1, p1, Ll/ܽۢܳ;->ۢ֫:Ll/ܺۢܳ;

    invoke-virtual {v1}, Ll/ܺۢܳ;->ᩳ()Z

    move-result v1

    .line 43
    iput-boolean v1, p0, Ll/ۖۢܳ;->ᩳ:Z

    .line 45
    :goto_1
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۢܳ;->֫:Ljava/util/List;

    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 50
    invoke-interface {v4}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v5

    if-eqz v5, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 52
    :cond_1
    invoke-interface {v4}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    if-lez v0, :cond_4

    if-nez v1, :cond_4

    if-nez v3, :cond_4

    const/4 p1, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    .line 58
    :goto_3
    iput-boolean p1, p0, Ll/ۖۢܳ;->ܳ:Z

    if-nez v0, :cond_5

    if-lez v1, :cond_5

    if-nez v3, :cond_5

    const/4 v2, 0x1

    .line 59
    :cond_5
    iput-boolean v2, p0, Ll/ۖۢܳ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֡()Z
    .locals 1

    .line 141
    iget-boolean v0, p0, Ll/ۖۢܳ;->ܿ:Z

    return v0
.end method

.method public final ֨()V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ֫()V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    return-void
.end method

.method public final ۖ()Ljava/util/List;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ۖۢܳ;->ۡ:Ljava/util/List;

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۖۢܳ;->ܺ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Ll/ۖۢܳ;->ܳ:Z

    return v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۖۢܳ;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()Ll/ᩳۜܳ;
    .locals 3

    .line 149
    iget-object v0, p0, Ll/ۖۢܳ;->ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 155
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    return-object v0

    .line 154
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Selected item size != 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 2

    .line 119
    iget-object v0, p0, Ll/ۖۢܳ;->ۢ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    iget-object v1, p0, Ll/ۖۢܳ;->ܽ:Ljava/lang/Exception;

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ۖۢܳ;->֫:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Lbin/mt/plus/Main;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()I
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۖۢܳ;->ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/ܽۢܳ;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ()Ll/ܽۢܳ;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    return-object v0
.end method

.method public final ᩳ()Ll/ܽ᩷ܳ;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۖۢܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Ll/ۖۢܳ;->ᩳ:Z

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۖۢܳ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۖۢܳ;->᩻:Ljava/lang/String;

    return-object v0
.end method
