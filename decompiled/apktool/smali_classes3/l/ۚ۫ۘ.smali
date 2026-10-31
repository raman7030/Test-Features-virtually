.class public abstract Ll/ۚ۫ۘ;
.super Ll/۠۫ۘ;
.source "U4HR"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ۢ:Ljava/lang/String;

.field public ۧ:Ll/ܳ۫ۘ;

.field public ܳ:Ljava/lang/String;

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Z

.field public ᩷:Z

.field public ᩻:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ll/֨۫ۘ;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Ll/۠۫ۘ;-><init>(Ll/֨۫ۘ;)V

    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    .line 86
    iput-boolean p1, p0, Ll/ۚ۫ۘ;->ܽ:Z

    .line 87
    iput-boolean p1, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 88
    iput-boolean p1, p0, Ll/ۚ۫ۘ;->᩷:Z

    return-void
.end method


# virtual methods
.method public ֫()Ll/ۚ۫ۘ;
    .locals 2

    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    .line 98
    iput-object v0, p0, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 99
    iput-object v0, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    .line 100
    iget-object v1, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/۠۫ۘ;->֫(Ljava/lang/StringBuilder;)V

    .line 101
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 102
    iput-boolean v1, p0, Ll/ۚ۫ۘ;->ܽ:Z

    .line 103
    iput-boolean v1, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 104
    iput-boolean v1, p0, Ll/ۚ۫ۘ;->᩷:Z

    .line 105
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    return-object p0
.end method

.method public bridge synthetic ֫()Ll/۠۫ۘ;
    .locals 1

    .line 79
    invoke-virtual {p0}, Ll/ۚ۫ۘ;->֫()Ll/ۚ۫ۘ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(C)V
    .locals 0

    .line 181
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۚ۫ۘ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫([I)V
    .locals 4

    const/4 v0, 0x1

    .line 215
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 217
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 219
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    .line 205
    :cond_0
    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    .line 206
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {p0}, Ll/ۚ۫ۘ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final ۧ(C)V
    .locals 2

    const/4 v0, 0x1

    .line 215
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 217
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 219
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    .line 195
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 215
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 217
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 219
    iput-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    .line 186
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 187
    iput-object p1, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    return-void

    .line 189
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must be false"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 11
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, ""

    .line 169
    :goto_1
    iput-object p1, p0, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 211
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ܽ:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 5

    .line 110
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Ll/ܳ۫ۘ;

    invoke-direct {v0}, Ll/ܳ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    .line 113
    :cond_0
    iget-object v0, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۚ۫ۘ;->᩻:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_4

    .line 115
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 118
    iget-boolean v0, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    if-eqz v0, :cond_2

    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    goto :goto_0

    .line 120
    :cond_2
    iget-boolean v0, p0, Ll/ۚ۫ۘ;->ܽ:Z

    if-eqz v0, :cond_3

    const-string v0, ""

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 124
    :goto_0
    iget-object v3, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    iget-object v4, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v4, v0}, Ll/ܳ۫ۘ;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :cond_4
    iput-object v1, p0, Ll/ۚ۫ۘ;->ܳ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 128
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ܽ:Z

    .line 129
    iput-boolean v0, p0, Ll/ۚ۫ۘ;->ᩳ:Z

    .line 130
    invoke-static {v2}, Ll/۠۫ۘ;->֫(Ljava/lang/StringBuilder;)V

    .line 131
    iput-object v1, p0, Ll/ۚ۫ۘ;->ۜ:Ljava/lang/String;

    return-void
.end method
