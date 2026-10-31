.class public abstract Ll/ۡ֨ۚ;
.super Ll/ۖ֨ۚ;
.source "U4HR"


# instance fields
.field public ۖ:Z

.field public ۘ:Ljava/lang/String;

.field public ۜ:Ll/ܺ֡ۚ;

.field public ۡ:Z

.field public ۢ:Z

.field public final ܳ:Ljava/lang/StringBuilder;

.field public ܺ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/StringBuilder;

.field public ᩷:Z

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 103
    invoke-direct {p0}, Ll/ۖ֨ۚ;-><init>()V

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۡ֨ۚ;->ᩳ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 109
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    .line 113
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 114
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۡ:Z

    .line 116
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۖ:Z

    return-void
.end method


# virtual methods
.method public final ֫(C)V
    .locals 2

    const/4 v0, 0x1

    .line 271
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    .line 273
    iget-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ֨ۚ;->ᩳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 274
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 275
    iput-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    .line 237
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0xfffd

    .line 225
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 271
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    .line 273
    iget-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ֨ۚ;->ᩳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 274
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 275
    iput-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    .line 228
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 229
    iput-object p1, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    return-void

    .line 231
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫([I)V
    .locals 4

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 282
    iget-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 283
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 284
    iput-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    .line 261
    :cond_0
    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    .line 262
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۡ:Z

    return-void
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 2

    .line 188
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    return-object v0

    .line 101
    :cond_0
    new-instance v0, Ll/ܳ֡ۚ;

    const-string v1, "Must be false"

    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    throw v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(C)V
    .locals 2

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 282
    iget-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 283
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 284
    iput-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    .line 251
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 282
    iget-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 283
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 284
    iput-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    .line 242
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 243
    iput-object p1, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    return-void

    .line 245
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܺ()V
    .locals 6

    .line 142
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    if-nez v0, :cond_0

    .line 143
    new-instance v0, Ll/ܺ֡ۚ;

    invoke-direct {v0}, Ll/ܺ֡ۚ;-><init>()V

    iput-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    .line 145
    :cond_0
    iget-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ۡ֨ۚ;->ᩳ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    invoke-virtual {v0}, Ll/ܺ֡ۚ;->size()I

    move-result v0

    const/16 v4, 0x200

    if-ge v0, v4, :cond_5

    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    .line 148
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_5

    .line 151
    iget-boolean v4, p0, Ll/ۡ֨ۚ;->ۢ:Z

    if-eqz v4, :cond_3

    .line 152
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    iget-object v4, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    goto :goto_1

    .line 153
    :cond_3
    iget-boolean v4, p0, Ll/ۡ֨ۚ;->ۡ:Z

    if-eqz v4, :cond_4

    const-string v4, ""

    goto :goto_1

    :cond_4
    move-object v4, v1

    .line 158
    :goto_1
    iget-object v5, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    invoke-virtual {v5, v0, v4}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :cond_5
    invoke-static {v3}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 162
    iput-object v1, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 163
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    .line 165
    invoke-static {v2}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 166
    iput-object v1, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    .line 167
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 168
    iput-boolean v0, p0, Ll/ۡ֨ۚ;->ۡ:Z

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0xfffd

    .line 214
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 215
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 216
    iput-object p1, p0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 202
    iput-object p1, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 203
    iput-object p1, p0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 181
    iget-boolean v0, p0, Ll/ۡ֨ۚ;->᩷:Z

    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {p0}, Ll/ۡ֨ۚ;->ܺ()V

    :cond_0
    return-void
.end method

.method public ᩻()Ll/ۡ֨ۚ;
    .locals 3

    .line 121
    invoke-super {p0}, Ll/ۖ֨ۚ;->᩻()V

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    .line 123
    iput-object v0, p0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 124
    iget-object v1, p0, Ll/ۡ֨ۚ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 125
    iput-object v0, p0, Ll/ۡ֨ۚ;->ܿ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 126
    iput-boolean v1, p0, Ll/ۡ֨ۚ;->᩷:Z

    .line 127
    iget-object v2, p0, Ll/ۡ֨ۚ;->ܳ:Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 128
    iput-object v0, p0, Ll/ۡ֨ۚ;->᩻:Ljava/lang/String;

    .line 129
    iput-boolean v1, p0, Ll/ۡ֨ۚ;->ۡ:Z

    .line 130
    iput-boolean v1, p0, Ll/ۡ֨ۚ;->ۢ:Z

    .line 131
    iput-boolean v1, p0, Ll/ۡ֨ۚ;->ۖ:Z

    .line 132
    iput-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    return-object p0
.end method

.method public bridge synthetic ᩻()V
    .locals 0

    .line 103
    invoke-virtual {p0}, Ll/ۡ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    return-void
.end method
