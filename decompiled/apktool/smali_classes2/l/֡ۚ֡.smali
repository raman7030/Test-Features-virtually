.class public abstract Ll/֡ۚ֡;
.super Ljava/lang/Object;
.source "E1HX"


# instance fields
.field public ֫:Ll/֡ۚ֡;

.field public ۧ:Ll/֡ۚ֡;

.field public ܳ:Ljava/util/ArrayList;

.field public ܽ:Ll/֡ۚ֡;

.field public ܿ:Ll/֡ۚ֡;

.field public ᩳ:Ll/֡ۚ֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    .line 15
    iput-object v0, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    .line 16
    iput-object v0, p0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    .line 17
    iput-object v0, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    .line 18
    iput-object v0, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 19
    iput-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/֡ۚ֡;->᩻()Ljava/lang/String;

    move-result-object v1

    const-string v2, "}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֡ۚ֡;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    return-object v0
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 1

    .line 133
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    return-void

    .line 136
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method public ֫(Ll/֡ۚ֡;)V
    .locals 1

    .line 48
    invoke-virtual {p1}, Ll/֡ۚ֡;->ۜ()V

    .line 49
    invoke-virtual {p1, p0}, Ll/֡ۚ֡;->ܽ(Ll/֡ۚ֡;)V

    .line 50
    iget-object v0, p0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    .line 51
    iput-object p1, v0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 52
    iput-object v0, p1, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    goto :goto_0

    .line 54
    :cond_0
    iput-object p1, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    .line 56
    :goto_0
    iput-object p1, p0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    return-void
.end method

.method public final ֫(Ll/ۘۚ֡;)V
    .locals 2

    .line 105
    invoke-virtual {p1}, Ll/֡ۚ֡;->ۜ()V

    .line 106
    iget-object v0, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    iput-object v0, p1, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    .line 108
    iput-object p1, v0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 110
    :cond_0
    iput-object p0, p1, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 111
    iput-object p1, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    .line 112
    iget-object v0, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    iput-object v0, p1, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    .line 113
    iget-object v1, p1, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    if-nez v1, :cond_1

    .line 114
    iput-object p1, v0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    :cond_1
    return-void
.end method

.method public abstract ֫(Ll/ۤۚ֡;)V
.end method

.method public final ֫(Ll/ܰᩴ֡;)V
    .locals 1

    .line 60
    invoke-virtual {p1}, Ll/֡ۚ֡;->ۜ()V

    .line 44
    iput-object p0, p1, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    .line 62
    iget-object v0, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    .line 63
    iput-object p1, v0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    .line 64
    iput-object v0, p1, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 65
    iput-object p1, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    return-void

    .line 67
    :cond_0
    iput-object p1, p0, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    .line 68
    iput-object p1, p0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    return-void
.end method

.method public final ֫(Ll/᩶ۚ֡;)V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 148
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    .line 150
    :cond_0
    iget-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۜ()V
    .locals 3

    .line 73
    iget-object v0, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    .line 74
    iget-object v1, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    iput-object v1, v0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    goto :goto_0

    .line 75
    :cond_0
    iget-object v1, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    if-eqz v1, :cond_1

    .line 76
    iget-object v2, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    iput-object v2, v1, Ll/֡ۚ֡;->֫:Ll/֡ۚ֡;

    .line 78
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    if-eqz v1, :cond_2

    .line 79
    iput-object v0, v1, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    goto :goto_1

    .line 80
    :cond_2
    iget-object v1, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    if-eqz v1, :cond_3

    .line 81
    iput-object v0, v1, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    .line 84
    iput-object v0, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 85
    iput-object v0, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    return-void
.end method

.method public final ۧ()Ll/֡ۚ֡;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    return-object v0
.end method

.method public final ۧ(Ll/֡ۚ֡;)V
    .locals 2

    .line 90
    invoke-virtual {p1}, Ll/֡ۚ֡;->ۜ()V

    .line 91
    iget-object v0, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    iput-object v0, p1, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    .line 93
    iput-object p1, v0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    .line 95
    :cond_0
    iput-object p0, p1, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    .line 96
    iput-object p1, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    .line 97
    iget-object v0, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    iput-object v0, p1, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    .line 98
    iget-object v1, p1, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    if-nez v1, :cond_1

    .line 99
    iput-object p1, v0, Ll/֡ۚ֡;->ۧ:Ll/֡ۚ֡;

    :cond_1
    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/֡ۚ֡;->ܳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 0
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ll/֡ۚ֡;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/֡ۚ֡;->ܽ:Ll/֡ۚ֡;

    return-object v0
.end method

.method public ܽ(Ll/֡ۚ֡;)V
    .locals 0

    .line 44
    iput-object p1, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    return-void
.end method

.method public final ܿ()Ll/֡ۚ֡;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/֡ۚ֡;->ܿ:Ll/֡ۚ֡;

    return-object v0
.end method

.method public ᩳ()Ll/֡ۚ֡;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/֡ۚ֡;->ᩳ:Ll/֡ۚ֡;

    return-object v0
.end method

.method public ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
