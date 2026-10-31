.class public final Ll/ۖ֫ۧ;
.super Ljava/lang/Object;
.source "H8LH"

# interfaces
.implements Ll/ᩴܽۧ;


# instance fields
.field public final ֫:Ll/ᩴܽۧ;

.field public ۧ:Z

.field public final synthetic ܽ:Ll/ۘ֫ۧ;


# direct methods
.method public constructor <init>(Ll/ۘ֫ۧ;Ll/ᩴܽۧ;)V
    .locals 0

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ֫ۧ;->ܽ:Ll/ۘ֫ۧ;

    .line 320
    iput-object p2, p0, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    return-void
.end method


# virtual methods
.method public final ֫(J)I
    .locals 1

    .line 379
    iget-object v0, p0, Ll/ۖ֫ۧ;->ܽ:Ll/ۘ֫ۧ;

    invoke-virtual {v0}, Ll/ۘ֫ۧ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    .line 382
    :cond_0
    iget-object v0, p0, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܽۧ;->֫(J)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 11

    .line 340
    iget-object v0, p0, Ll/ۖ֫ۧ;->ܽ:Ll/ۘ֫ۧ;

    invoke-virtual {v0}, Ll/ۘ֫ۧ;->ᩳ()Z

    move-result v1

    const/4 v2, -0x3

    if-eqz v1, :cond_0

    return v2

    .line 343
    :cond_0
    iget-boolean v1, p0, Ll/ۖ֫ۧ;->ۧ:Z

    const/4 v3, 0x4

    const/4 v4, -0x4

    if-eqz v1, :cond_1

    .line 344
    invoke-virtual {p2, v3}, Ll/ۘ᩸֫;->ܿ(I)V

    return v4

    .line 347
    :cond_1
    invoke-virtual {v0}, Ll/ۘ֫ۧ;->ۜ()J

    move-result-wide v5

    .line 348
    iget-object v1, p0, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v1, p1, p2, p3}, Ll/ᩴܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p3

    const/4 v1, -0x5

    const-wide/high16 v7, -0x8000000000000000L

    if-ne p3, v1, :cond_6

    .line 350
    iget-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p3, p2, Ll/۠ᩴ֫;->᩵:I

    .line 351
    iget v2, p2, Ll/۠ᩴ֫;->ᩴ:I

    if-nez v2, :cond_3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    return v1

    .line 353
    :cond_3
    :goto_0
    iget-wide v3, v0, Ll/ۘ֫ۧ;->۫:J

    const-wide/16 v5, 0x0

    cmp-long v9, v3, v5

    if-eqz v9, :cond_4

    const/4 v2, 0x0

    .line 354
    :cond_4
    iget-wide v3, v0, Ll/ۘ֫ۧ;->᩶:J

    cmp-long v0, v3, v7

    if-eqz v0, :cond_5

    const/4 p3, 0x0

    .line 357
    :cond_5
    invoke-virtual {p2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p2

    .line 358
    invoke-virtual {p2, v2}, Ll/֨ᩴ֫;->᩷(I)V

    .line 359
    invoke-virtual {p2, p3}, Ll/֨ᩴ֫;->ۢ(I)V

    .line 360
    invoke-virtual {p2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p2

    iput-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    return v1

    .line 364
    :cond_6
    iget-wide v0, v0, Ll/ۘ֫ۧ;->᩶:J

    cmp-long p1, v0, v7

    if-eqz p1, :cond_9

    if-ne p3, v4, :cond_7

    iget-wide v9, p2, Ll/᩸᩸֫;->ۤ:J

    cmp-long p1, v9, v0

    if-gez p1, :cond_8

    :cond_7
    if-ne p3, v2, :cond_9

    cmp-long p1, v5, v7

    if-nez p1, :cond_9

    iget-boolean p1, p2, Ll/᩸᩸֫;->ۛ:Z

    if-nez p1, :cond_9

    .line 369
    :cond_8
    invoke-virtual {p2}, Ll/᩸᩸֫;->ۧ()V

    .line 370
    invoke-virtual {p2, v3}, Ll/ۘ᩸֫;->ܿ(I)V

    const/4 p1, 0x1

    .line 371
    iput-boolean p1, p0, Ll/ۖ֫ۧ;->ۧ:Z

    return v4

    :cond_9
    return p3
.end method

.method public final ֫()V
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0}, Ll/ᩴܽۧ;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 324
    iput-boolean v0, p0, Ll/ۖ֫ۧ;->ۧ:Z

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ۖ֫ۧ;->ܽ:Ll/ۘ֫ۧ;

    invoke-virtual {v0}, Ll/ۘ֫ۧ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0}, Ll/ᩴܽۧ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
