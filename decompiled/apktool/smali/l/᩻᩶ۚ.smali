.class public abstract Ll/᩻᩶ۚ;
.super Ljava/lang/Object;
.source "468J"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/᩻᩶ۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, v0}, Ll/᩻᩶ۚ;-><init>(Ll/᩻᩶ۚ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶ۚ;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x90000

    .line 82
    iput v0, p0, Ll/᩻᩶ۚ;->֫:I

    .line 83
    iput-object p1, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    return-void
.end method


# virtual methods
.method public ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/ۘ᩶ۚ;
    .locals 6

    .line 355
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 356
    invoke-virtual/range {v0 .. v5}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/ۘ᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 234
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 237
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 238
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩻᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 235
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "TypeAnnotation requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {v0, p1, p2}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;
    .locals 6

    .line 383
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 384
    invoke-virtual/range {v0 .. v5}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(ILjava/lang/String;Ljava/lang/String;)Ll/᩹᩶ۚ;
    .locals 2

    .line 152
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x60000

    if-lt v0, v1, :cond_1

    .line 155
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/᩹᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 153
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Module requires ASM6"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫()V
    .locals 1

    .line 394
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 395
    invoke-virtual {v0}, Ll/᩻᩶ۚ;->֫()V

    :cond_0
    return-void
.end method

.method public ֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    .line 119
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x80000

    if-ge v0, v1, :cond_1

    const/high16 v0, 0x10000

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Records requires ASM8"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 122
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_2

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 123
    invoke-virtual/range {v0 .. v6}, Ll/᩻᩶ۚ;->֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 2

    .line 173
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x70000

    if-lt v0, v1, :cond_1

    .line 176
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 177
    invoke-virtual {v0, p1}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 174
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "NestHost requires ASM7"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 305
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 306
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0, p1, p2}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 197
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 198
    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0, p1}, Ll/᩻᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩶ۚ;
    .locals 2

    .line 322
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x80000

    if-lt v0, v1, :cond_1

    .line 325
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 326
    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩶ۚ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 323
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Record requires ASM8"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ(Ljava/lang/String;)V
    .locals 2

    .line 264
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x70000

    if-lt v0, v1, :cond_1

    .line 267
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {v0, p1}, Ll/᩻᩶ۚ;->ۧ(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 265
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "NestMember requires ASM7"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ܽ(Ljava/lang/String;)V
    .locals 2

    .line 280
    iget v0, p0, Ll/᩻᩶ۚ;->֫:I

    const/high16 v1, 0x90000

    if-lt v0, v1, :cond_1

    .line 283
    iget-object v0, p0, Ll/᩻᩶ۚ;->ۧ:Ll/᩻᩶ۚ;

    if-eqz v0, :cond_0

    .line 284
    invoke-virtual {v0, p1}, Ll/᩻᩶ۚ;->ܽ(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 281
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "PermittedSubclasses requires ASM9"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
