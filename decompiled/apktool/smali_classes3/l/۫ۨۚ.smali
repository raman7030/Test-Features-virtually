.class public abstract Ll/۫ۨۚ;
.super Ljava/lang/Object;
.source "37E8"


# instance fields
.field public ֫:I

.field public ۜ:Ll/᩵۫ۚ;

.field public ۡ:Ll/۟ۛۚ;

.field public ۢ:Ll/۟ۛۚ;

.field public ۧ:Ll/۟ۛۚ;

.field public final ܳ:Ll/᩶ۗۚ;

.field public ܽ:Ll/۟ۛۚ;

.field public ܿ:Ll/ۜ۫ۚ;

.field public ᩳ:Ll/ۗ۬ۚ;

.field public ᩷:Ll/ۜ۫ۚ;

.field public final ᩻:Ll/ۗۛۚ;


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ll/᩶ۗۚ;I)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    .line 46
    iput-object v0, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    .line 47
    iput-object v0, p0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    .line 48
    iput-object v0, p0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    .line 50
    sget-object v0, Ll/ۗ۬ۚ;->ۤ:Ll/ۗ۬ۚ;

    iput-object v0, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 57
    iput-object p1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 58
    iput-object p2, p0, Ll/۫ۨۚ;->ܳ:Ll/᩶ۗۚ;

    .line 59
    iput p3, p0, Ll/۫ۨۚ;->֫:I

    return-void
.end method


# virtual methods
.method public final varargs ֫([Ll/֫ۨۚ;)Ll/ۛۛۚ;
    .locals 4
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 150
    new-instance v0, Ll/ۛۛۚ;

    invoke-direct {v0}, Ll/ۛۛۚ;-><init>()V

    .line 151
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    if-eqz v3, :cond_0

    .line 153
    invoke-virtual {v0, v3}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 157
    :cond_1
    iget-object p1, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    if-eqz p1, :cond_2

    .line 158
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 160
    :cond_2
    iget-object p1, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    if-eqz p1, :cond_3

    .line 161
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 163
    :cond_3
    iget-object p1, p0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    if-eqz p1, :cond_4

    .line 164
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 166
    :cond_4
    iget-object p1, p0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    if-eqz p1, :cond_5

    .line 167
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_5
    return-object v0
.end method

.method public final ֫()V
    .locals 3

    .line 96
    iget v0, p0, Ll/۫ۨۚ;->֫:I

    invoke-static {v0}, Ll/ۛ۬ۚ;->ۗ(I)Z

    move-result v0

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    if-eqz v0, :cond_0

    .line 97
    new-instance v0, Ll/ۜ۫ۚ;

    sget-object v2, Ll/ۙ۬ۚ;->ۙ֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v0, p0, Ll/۫ۨۚ;->᩷:Ll/ۜ۫ۚ;

    .line 98
    iget v0, p0, Ll/۫ۨۚ;->֫:I

    sget-object v2, Ll/ۛ۬ۚ;->ۧۧ:Ll/ۛ۬ۚ;

    invoke-virtual {v2}, Ll/ۛ۬ۚ;->ܿ()I

    move-result v2

    not-int v2, v2

    and-int/2addr v0, v2

    iput v0, p0, Ll/۫ۨۚ;->֫:I

    .line 100
    :cond_0
    iget v0, p0, Ll/۫ۨۚ;->֫:I

    invoke-static {v0}, Ll/ۛ۬ۚ;->ܳ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    new-instance v0, Ll/ۜ۫ۚ;

    sget-object v2, Ll/ۙ۬ۚ;->ۨ:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v0, p0, Ll/۫ۨۚ;->ܿ:Ll/ۜ۫ۚ;

    .line 102
    iget v0, p0, Ll/۫ۨۚ;->֫:I

    sget-object v1, Ll/ۛ۬ۚ;->֨֫:Ll/ۛ۬ۚ;

    invoke-virtual {v1}, Ll/ۛ۬ۚ;->ܿ()I

    move-result v1

    not-int v1, v1

    and-int/2addr v0, v1

    iput v0, p0, Ll/۫ۨۚ;->֫:I

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 4

    if-eqz p1, :cond_7

    .line 174
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ۚ;

    .line 175
    iget-boolean v1, v0, Ll/ܽ۫ۚ;->᩹:Z

    .line 177
    instance-of v2, v0, Ll/۠۟ۚ;

    iget-object v3, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    if-eqz v2, :cond_3

    check-cast v0, Ll/۠۟ۚ;

    if-eqz v1, :cond_1

    .line 180
    iget-object v1, p0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    if-nez v1, :cond_0

    .line 181
    new-instance v1, Ll/۟ۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->᩵֫:Ll/ۙ۬ۚ;

    invoke-direct {v1, v3, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v1, p0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    .line 184
    :cond_0
    iget-object v1, p0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    invoke-virtual {v1, v0}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_0

    .line 186
    :cond_1
    iget-object v1, p0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    if-nez v1, :cond_2

    .line 187
    new-instance v1, Ll/۟ۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->֨֫:Ll/ۙ۬ۚ;

    invoke-direct {v1, v3, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v1, p0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    .line 190
    :cond_2
    iget-object v1, p0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    invoke-virtual {v1, v0}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_5

    .line 195
    iget-object v1, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    if-nez v1, :cond_4

    .line 196
    new-instance v1, Ll/۟ۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->ۘ֫:Ll/ۙ۬ۚ;

    invoke-direct {v1, v3, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v1, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    .line 199
    :cond_4
    iget-object v1, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    invoke-virtual {v1, v0}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_0

    .line 201
    :cond_5
    iget-object v1, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    if-nez v1, :cond_6

    .line 202
    new-instance v1, Ll/۟ۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->֡֫:Ll/ۙ۬ۚ;

    invoke-direct {v1, v3, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v1, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    .line 205
    :cond_6
    iget-object v1, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    invoke-virtual {v1, v0}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final ֫(Ll/ܺۤۚ;)V
    .locals 4

    .line 115
    iget-object v0, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    if-eqz v0, :cond_0

    .line 117
    iget v1, p1, Ll/ۜۨۚ;->᩸:I

    iget-object v0, v0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    if-eq v1, v0, :cond_0

    .line 118
    sget-object v0, Ll/ܶۨۚ;->ۤܿ:Ll/ܶۨۚ;

    invoke-virtual {v0}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 119
    invoke-virtual {v1}, Ll/ۗ۬ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 118
    iget-object v0, p0, Ll/۫ۨۚ;->ܳ:Ll/᩶ۗۚ;

    const-string v1, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure."

    invoke-virtual {v0, v1, v2}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :cond_0
    new-instance v0, Ll/᩵۫ۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->۠֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/᩵۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ll/ܺۤۚ;)V

    iput-object v0, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    return-void
.end method

.method public final ֫(Ll/ܺۤۚ;J)V
    .locals 4

    .line 126
    iget-object v0, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    if-eqz v0, :cond_0

    .line 128
    iget v1, p1, Ll/ۜۨۚ;->᩸:I

    iget-object v0, v0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    if-eq v1, v0, :cond_0

    .line 129
    sget-object v0, Ll/ܶۨۚ;->ۤܿ:Ll/ܶۨۚ;

    .line 130
    invoke-virtual {v0}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    invoke-virtual {v1}, Ll/ۗ۬ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 129
    iget-object v0, p0, Ll/۫ۨۚ;->ܳ:Ll/᩶ۗۚ;

    const-string v1, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure."

    invoke-virtual {v0, p2, p3, v1, v2}, Ll/᩶ۗۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :cond_0
    new-instance p2, Ll/᩵۫ۚ;

    iget-object p3, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v0, Ll/ۙ۬ۚ;->۠֫:Ll/ۙ۬ۚ;

    invoke-direct {p2, p3, v0, p1}, Ll/᩵۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ll/ܺۤۚ;)V

    iput-object p2, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    return-void
.end method

.method public final ۧ()Ll/᩶ۗۚ;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/۫ۨۚ;->ܳ:Ll/᩶ۗۚ;

    return-object v0
.end method
