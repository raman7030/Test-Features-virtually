.class public final Ll/ۙ᩵ۧ;
.super Ljava/lang/Object;
.source "K8K0"


# instance fields
.field public ֡:I

.field public ֫:I

.field public ۖ:Ljava/util/Set;

.field public ۘ:Ljava/lang/String;

.field public ۜ:Z

.field public ۡ:I

.field public ۢ:I

.field public ۧ:I

.field public ܳ:F

.field public ܺ:I

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I

.field public ᩴ:Ljava/lang/String;

.field public ᩵:Ljava/lang/String;

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 111
    iput-object v0, p0, Ll/ۙ᩵ۧ;->ۘ:Ljava/lang/String;

    .line 112
    iput-object v0, p0, Ll/ۙ᩵ۧ;->ᩴ:Ljava/lang/String;

    .line 113
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v1, p0, Ll/ۙ᩵ۧ;->ۖ:Ljava/util/Set;

    .line 114
    iput-object v0, p0, Ll/ۙ᩵ۧ;->᩵:Ljava/lang/String;

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Ll/ۙ᩵ۧ;->ܿ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p0, Ll/ۙ᩵ۧ;->᩷:Z

    .line 117
    iput-boolean v0, p0, Ll/ۙ᩵ۧ;->ۜ:Z

    const/4 v1, -0x1

    .line 118
    iput v1, p0, Ll/ۙ᩵ۧ;->ۡ:I

    .line 119
    iput v1, p0, Ll/ۙ᩵ۧ;->֡:I

    .line 120
    iput v1, p0, Ll/ۙ᩵ۧ;->ۧ:I

    .line 121
    iput v1, p0, Ll/ۙ᩵ۧ;->ۢ:I

    .line 122
    iput v1, p0, Ll/ۙ᩵ۧ;->᩻:I

    .line 123
    iput v1, p0, Ll/ۙ᩵ۧ;->ܺ:I

    .line 124
    iput-boolean v0, p0, Ll/ۙ᩵ۧ;->ܽ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;)I
    .locals 1

    .line 319
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 322
    :cond_0
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    add-int/2addr p1, p2

    return p1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return p1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 260
    iget-boolean v0, p0, Ll/ۙ᩵ۧ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 263
    iget v0, p0, Ll/ۙ᩵ۧ;->֫:I

    return v0

    .line 261
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color not defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)I
    .locals 3

    .line 165
    iget-object v0, p0, Ll/ۙ᩵ۧ;->ۘ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩵ۧ;->ᩴ:Ljava/lang/String;

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩵ۧ;->ۖ:Ljava/util/Set;

    .line 167
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩵ۧ;->᩵:Ljava/lang/String;

    .line 168
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 174
    :cond_0
    iget-object v0, p0, Ll/ۙ᩵ۧ;->ۘ:Ljava/lang/String;

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Ll/ۙ᩵ۧ;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result p1

    .line 175
    iget-object v0, p0, Ll/ۙ᩵ۧ;->ᩴ:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, p1, v1, p2}, Ll/ۙ᩵ۧ;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result p1

    .line 176
    iget-object p2, p0, Ll/ۙ᩵ۧ;->᩵:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {p2, p1, v0, p4}, Ll/ۙ᩵ۧ;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    .line 177
    iget-object p2, p0, Ll/ۙ᩵ۧ;->ۖ:Ljava/util/Set;

    invoke-interface {p3, p2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 180
    :cond_1
    iget-object p2, p0, Ll/ۙ᩵ۧ;->ۖ:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p2, p1

    return p2

    :cond_2
    :goto_0
    return v2
.end method

.method public final ֫(F)V
    .locals 0

    .line 279
    iput p1, p0, Ll/ۙ᩵ۧ;->ܳ:F

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 268
    iput p1, p0, Ll/ۙ᩵ۧ;->֫:I

    const/4 p1, 0x1

    .line 269
    iput-boolean p1, p0, Ll/ۙ᩵ۧ;->ۜ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 237
    invoke-static {p1}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩵ۧ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 309
    iput-boolean p1, p0, Ll/ۙ᩵ۧ;->ܽ:Z

    return-void
.end method

.method public final ֫([Ljava/lang/String;)V
    .locals 1

    .line 136
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۙ᩵ۧ;->ۖ:Ljava/util/Set;

    return-void
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x1

    .line 220
    iput v0, p0, Ll/ۙ᩵ۧ;->ۧ:I

    return-void
.end method

.method public final ۘ()V
    .locals 1

    const/4 v0, 0x1

    .line 226
    iput v0, p0, Ll/ۙ᩵ۧ;->ۢ:I

    return-void
.end method

.method public final ۜ()I
    .locals 4

    .line 192
    iget v0, p0, Ll/ۙ᩵ۧ;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Ll/ۙ᩵ۧ;->ۢ:I

    if-ne v2, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 195
    :goto_0
    iget v3, p0, Ll/ۙ᩵ۧ;->ۢ:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 199
    iget v0, p0, Ll/ۙ᩵ۧ;->ۡ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 256
    iget-boolean v0, p0, Ll/ۙ᩵ۧ;->᩷:Z

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 250
    iput p1, p0, Ll/ۙ᩵ۧ;->ᩳ:I

    const/4 p1, 0x1

    .line 251
    iput-boolean p1, p0, Ll/ۙ᩵ۧ;->᩷:Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Ll/ۙ᩵ۧ;->ۘ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 314
    iget-boolean v0, p0, Ll/ۙ᩵ۧ;->ܽ:Z

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 290
    iget v0, p0, Ll/ۙ᩵ۧ;->᩻:I

    return v0
.end method

.method public final ܺ()Z
    .locals 2

    .line 209
    iget v0, p0, Ll/ۙ᩵ۧ;->֡:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 242
    iget-boolean v0, p0, Ll/ۙ᩵ۧ;->᩷:Z

    if-eqz v0, :cond_0

    .line 245
    iget v0, p0, Ll/ۙ᩵ۧ;->ᩳ:I

    return v0

    .line 243
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color not defined"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 285
    iput p1, p0, Ll/ۙ᩵ۧ;->᩻:I

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Ll/ۙ᩵ۧ;->ᩴ:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()F
    .locals 1

    .line 294
    iget v0, p0, Ll/ۙ᩵ۧ;->ܳ:F

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/ۙ᩵ۧ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 299
    iput p1, p0, Ll/ۙ᩵ۧ;->ܺ:I

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Ll/ۙ᩵ۧ;->᩵:Ljava/lang/String;

    return-void
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x1

    .line 214
    iput v0, p0, Ll/ۙ᩵ۧ;->֡:I

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 274
    iget-boolean v0, p0, Ll/ۙ᩵ۧ;->ۜ:Z

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 304
    iget v0, p0, Ll/ۙ᩵ۧ;->ܺ:I

    return v0
.end method
