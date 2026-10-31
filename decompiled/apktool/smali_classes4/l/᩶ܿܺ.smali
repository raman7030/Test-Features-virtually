.class public final Ll/᩶ܿܺ;
.super Ljava/lang/Object;
.source "1BES"


# instance fields
.field public ֫:Ll/۠ܿܺ;

.field public ۧ:Ll/ۗܿܺ;

.field public ܳ:Ll/᩻ܳܺ;

.field public ܽ:Ll/֫ܳܺ;

.field public ܿ:Ll/᩵ܳܺ;

.field public ᩳ:Ll/᩷ܳܺ;


# direct methods
.method public constructor <init>(Ll/᩻ܳܺ;Ll/᩵ܳܺ;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 92
    iput-object p1, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    .line 93
    iput-object p2, p0, Ll/᩶ܿܺ;->ܿ:Ll/᩵ܳܺ;

    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Ll/᩶ܿܺ;->֫:Ll/۠ܿܺ;

    .line 95
    iput-object p1, p0, Ll/᩶ܿܺ;->ᩳ:Ll/᩷ܳܺ;

    .line 96
    iput-object p1, p0, Ll/᩶ܿܺ;->ܽ:Ll/֫ܳܺ;

    .line 97
    iput-object p1, p0, Ll/᩶ܿܺ;->ۧ:Ll/ۗܿܺ;

    return-void

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "unprocessedInsns == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۢ()V
    .locals 6

    .line 104
    iget-object v0, p0, Ll/᩶ܿܺ;->ۧ:Ll/ۗܿܺ;

    if-eqz v0, :cond_0

    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    invoke-virtual {v0}, Ll/᩻ܳܺ;->֫()Ll/ۗܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܿܺ;->ۧ:Ll/ۗܿܺ;

    .line 109
    invoke-static {v0}, Ll/᩷ܳܺ;->֫(Ll/ۗܿܺ;)Ll/᩷ܳܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܿܺ;->ᩳ:Ll/᩷ܳܺ;

    .line 110
    iget-object v0, p0, Ll/᩶ܿܺ;->ۧ:Ll/ۗܿܺ;

    sget-object v1, Ll/֫ܳܺ;->᩶:Ll/֫ܳܺ;

    .line 354
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 372
    new-instance v2, Ll/۟ܿܺ;

    invoke-direct {v2, v1}, Ll/۟ܿܺ;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 375
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/ۙܿܺ;

    move-result-object v4

    .line 377
    instance-of v5, v4, Ll/ۧܳܺ;

    if-eqz v5, :cond_1

    .line 378
    move-object v5, v4

    check-cast v5, Ll/ۧܳܺ;

    .line 379
    invoke-virtual {v5}, Ll/ۧܳܺ;->ۖ()Ll/ۙۡܺ;

    move-result-object v5

    .line 380
    invoke-virtual {v4}, Ll/ۙܿܺ;->ܿ()I

    move-result v4

    invoke-virtual {v2, v4, v5}, Ll/۟ܿܺ;->֫(ILl/ۙۡܺ;)V

    goto :goto_1

    .line 381
    :cond_1
    instance-of v5, v4, Ll/ܽܳܺ;

    if-eqz v5, :cond_2

    .line 382
    move-object v5, v4

    check-cast v5, Ll/ܽܳܺ;

    invoke-virtual {v5}, Ll/ܽܳܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    .line 383
    invoke-virtual {v4}, Ll/ۙܿܺ;->ܿ()I

    move-result v4

    invoke-virtual {v2, v4, v5}, Ll/۟ܿܺ;->֫(ILl/᩸ۡܺ;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 387
    :cond_3
    invoke-virtual {v2}, Ll/۟ܿܺ;->֫()Ll/֫ܳܺ;

    move-result-object v0

    .line 110
    iput-object v0, p0, Ll/᩶ܿܺ;->ܽ:Ll/֫ܳܺ;

    .line 111
    iget-object v0, p0, Ll/᩶ܿܺ;->ܿ:Ll/᩵ܳܺ;

    invoke-virtual {v0}, Ll/᩵ܳܺ;->֫()Ll/۠ܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܿܺ;->֫:Ll/۠ܿܺ;

    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    .line 115
    iput-object v0, p0, Ll/᩶ܿܺ;->ܿ:Ll/᩵ܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/HashSet;
    .locals 1

    .line 166
    iget-object v0, p0, Ll/᩶ܿܺ;->ܿ:Ll/᩵ܳܺ;

    invoke-virtual {v0}, Ll/᩵ܳܺ;->ۧ()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩹ܿܺ;)V
    .locals 1

    .line 126
    iget-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    invoke-virtual {v0, p1}, Ll/᩻ܳܺ;->֫(Ll/᩹ܿܺ;)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    invoke-virtual {v0}, Ll/᩻ܳܺ;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Ll/۠ܿܺ;
    .locals 1

    .line 195
    invoke-direct {p0}, Ll/᩶ܿܺ;->ۢ()V

    .line 196
    iget-object v0, p0, Ll/᩶ܿܺ;->֫:Ll/۠ܿܺ;

    return-object v0
.end method

.method public final ܳ()Ll/᩷ܳܺ;
    .locals 1

    .line 205
    invoke-direct {p0}, Ll/᩶ܿܺ;->ۢ()V

    .line 206
    iget-object v0, p0, Ll/᩶ܿܺ;->ᩳ:Ll/᩷ܳܺ;

    return-object v0
.end method

.method public final ܽ()Ljava/util/HashSet;
    .locals 1

    .line 176
    iget-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    invoke-virtual {v0}, Ll/᩻ܳܺ;->ۧ()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/֫ܳܺ;
    .locals 1

    .line 215
    invoke-direct {p0}, Ll/᩶ܿܺ;->ۢ()V

    .line 216
    iget-object v0, p0, Ll/᩶ܿܺ;->ܽ:Ll/֫ܳܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۗܿܺ;
    .locals 1

    .line 185
    invoke-direct {p0}, Ll/᩶ܿܺ;->ۢ()V

    .line 186
    iget-object v0, p0, Ll/᩶ܿܺ;->ۧ:Ll/ۗܿܺ;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩶ܿܺ;->ܳ:Ll/᩻ܳܺ;

    .line 137
    invoke-virtual {v0}, Ll/᩻ܳܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 157
    iget-object v0, p0, Ll/᩶ܿܺ;->ܿ:Ll/᩵ܳܺ;

    invoke-virtual {v0}, Ll/᩵ܳܺ;->ܽ()Z

    move-result v0

    return v0
.end method
