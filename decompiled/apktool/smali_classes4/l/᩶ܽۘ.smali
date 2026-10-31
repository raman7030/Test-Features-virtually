.class public final Ll/᩶ܽۘ;
.super Ljava/lang/Object;
.source "49EX"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/ۙܽۘ;

.field public ۙ:Ll/᩷ۤۖ;

.field public final ᩶:Ll/ᩴۤۖ;

.field public ᩸:[B

.field public ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/ۙܽۘ;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܽۘ;->ۗ:Ll/ۙܽۘ;

    .line 152
    invoke-static {}, Ll/ܳۛۖ;->֫()Ll/ᩴۤۖ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܽۘ;->᩶:Ll/ᩴۤۖ;

    const/4 p1, 0x1

    .line 154
    invoke-direct {p0, p1}, Ll/᩶ܽۘ;->֫(Z)V

    .line 175
    :goto_0
    iget-object p1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    if-eqz p1, :cond_1

    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 177
    iget-object p1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۤۖ;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 179
    invoke-direct {p0, p1}, Ll/᩶ܽۘ;->֫(Z)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 155
    :goto_1
    iput-object p1, p0, Ll/᩶ܽۘ;->ۙ:Ll/᩷ۤۖ;

    return-void
.end method

.method private ֫(Z)V
    .locals 6

    .line 186
    iget-object v0, p0, Ll/᩶ܽۘ;->ۗ:Ll/ۙܽۘ;

    iget-object v1, v0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    if-eqz p1, :cond_0

    .line 191
    sget-object p1, Ll/ܰۨۖ;->ۗ:Ll/ܰۨۖ;

    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    goto :goto_0

    .line 193
    :cond_0
    const-class p1, Ll/ܰۨۖ;

    invoke-static {p1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p1

    .line 196
    :goto_0
    iget-object v2, p0, Ll/᩶ܽۘ;->᩶:Ll/ᩴۤۖ;

    invoke-interface {v2}, Ll/ᩴۤۖ;->֫()Ll/ۧۤۖ;

    move-result-object v3

    .line 198
    iget-object v0, v0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v1, v0, p1, v3}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;Ljava/util/EnumSet;Ll/ۧۤۖ;)Ll/֫᩺ۖ;

    move-result-object p1

    .line 200
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    .line 201
    invoke-virtual {p1}, Ll/֫᩺ۖ;->ۜ()[B

    move-result-object p1

    .line 207
    sget-object v3, Ll/۟۫ۖ;->ܽۧ:Ll/۟۫ۖ;

    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    sget-object v3, Ll/۟۫ۖ;->ᩳۧ:Ll/۟۫ۖ;

    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    iget-object v0, p0, Ll/᩶ܽۘ;->᩸:[B

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 211
    :cond_1
    iput-object p1, p0, Ll/᩶ܽۘ;->᩸:[B

    .line 212
    invoke-static {p1, v2}, Ll/ܳۛۖ;->֫([BLl/ᩴۤۖ;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    return-void

    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 208
    iput-object p1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    .line 209
    iput-object p1, p0, Ll/᩶ܽۘ;->᩸:[B

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 160
    iget-object v0, p0, Ll/᩶ܽۘ;->ۙ:Ll/᩷ۤۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 165
    invoke-virtual {p0}, Ll/᩶ܽۘ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    iget-object v0, p0, Ll/᩶ܽۘ;->ۙ:Ll/᩷ۤۖ;

    .line 175
    :goto_0
    iget-object v1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    if-eqz v1, :cond_1

    .line 176
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 177
    iget-object v1, p0, Ll/᩶ܽۘ;->᩹:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۤۖ;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 179
    invoke-direct {p0, v1}, Ll/᩶ܽۘ;->֫(Z)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 170
    :goto_1
    iput-object v1, p0, Ll/᩶ܽۘ;->ۙ:Ll/᩷ۤۖ;

    return-object v0

    .line 166
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 218
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
