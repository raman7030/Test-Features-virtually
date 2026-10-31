.class public final Ll/ۤۨ֫;
.super Ljava/lang/Object;
.source "T7N0"

# interfaces
.implements Ll/ۡۧۧ;


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public ۡ:Ll/۟᩺֫;

.field public ۢ:Ll/ۡ᩺֫;

.field public ۧ:Ll/ᩳ᩸ۡ;

.field public final ܳ:Ll/᩸ۨ֫;

.field public ܺ:Ll/ۤۘۧ;

.field public ܽ:Ll/ۘۛ֫;

.field public ܿ:Ll/ۖۨ֫;

.field public ᩳ:J

.field public ᩷:Z

.field public ᩻:Ll/ۧܳۧ;


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;)V
    .locals 1

    .line 145
    new-instance v0, Ll/ܺۨ֫;

    invoke-direct {v0, p1}, Ll/ܺۨ֫;-><init>(Ll/ܶ۠֫;)V

    invoke-direct {p0, v0}, Ll/ۤۨ֫;-><init>(Ll/᩸ۨ֫;)V

    return-void
.end method

.method public constructor <init>(Ll/᩸ۨ֫;)V
    .locals 2

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p1, p0, Ll/ۤۨ֫;->ܳ:Ll/᩸ۨ֫;

    .line 167
    new-instance p1, Ll/ۘۛ֫;

    invoke-direct {p1}, Ll/ۘۛ֫;-><init>()V

    iput-object p1, p0, Ll/ۤۨ֫;->ܽ:Ll/ۘۛ֫;

    .line 168
    new-instance p1, Ll/ۡ᩺֫;

    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p1, p0, Ll/ۤۨ֫;->ۢ:Ll/ۡ᩺֫;

    .line 169
    sget-object p1, Ll/ᩴ᩺֫;->ۧ֫:Ll/ܽ᩷ᩳ;

    iput-object p1, p0, Ll/ۤۨ֫;->ۡ:Ll/۟᩺֫;

    .line 170
    new-instance p1, Ll/᩺ܿۧ;

    .line 76
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/ۤۨ֫;->᩻:Ll/ۧܳۧ;

    .line 171
    new-instance p1, Ll/ᩳ᩸ۡ;

    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p1, p0, Ll/ۤۨ֫;->ۧ:Ll/ᩳ᩸ۡ;

    const/4 p1, 0x1

    .line 172
    iput p1, p0, Ll/ۤۨ֫;->ۜ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 173
    iput-wide v0, p0, Ll/ۤۨ֫;->ᩳ:J

    .line 174
    iput-boolean p1, p0, Ll/ۤۨ֫;->֫:Z

    .line 220
    iput-boolean p1, p0, Ll/ۤۨ֫;->᩷:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۧ᩵֫;)Ll/ۘۧۧ;
    .locals 13

    .line 400
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    iget-object v0, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    if-nez v0, :cond_0

    .line 402
    new-instance v0, Ll/ۖۨ֫;

    invoke-direct {v0}, Ll/ۖۨ֫;-><init>()V

    iput-object v0, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    .line 404
    :cond_0
    iget-object v0, p0, Ll/ۤۨ֫;->ܺ:Ll/ۤۘۧ;

    if-eqz v0, :cond_1

    .line 405
    iget-object v1, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    invoke-virtual {v1, v0}, Ll/ۖۨ֫;->֫(Ll/ۤۘۧ;)Ll/ۖۨ֫;

    .line 407
    :cond_1
    iget-object v0, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    iget-boolean v1, p0, Ll/ۤۨ֫;->᩷:Z

    invoke-virtual {v0, v1}, Ll/ۖۨ֫;->֫(Z)Ll/ۖۨ֫;

    .line 408
    iget-object v0, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    iget-object v4, p0, Ll/ۤۨ֫;->ܿ:Ll/ۖۨ֫;

    .line 412
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object v0, v0, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    .line 413
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ۤۨ֫;->ۢ:Ll/ۡ᩺֫;

    if-nez v1, :cond_2

    .line 414
    new-instance v1, Ll/᩵᩺֫;

    invoke-direct {v1, v2, v0}, Ll/᩵᩺֫;-><init>(Ll/ۡ᩺֫;Ljava/util/List;)V

    move-object v2, v1

    .line 423
    :cond_2
    new-instance v0, Ll/ۛۨ֫;

    iget-object v1, p0, Ll/ۤۨ֫;->ܽ:Ll/ۘۛ֫;

    .line 429
    invoke-virtual {v1, p1}, Ll/ۘۛ֫;->֫(Ll/ۧ᩵֫;)Ll/ۙۛ֫;

    move-result-object v6

    iget-object v7, p0, Ll/ۤۨ֫;->᩻:Ll/ۧܳۧ;

    iget-object v1, p0, Ll/ۤۨ֫;->ۡ:Ll/۟᩺֫;

    iget-object v3, p0, Ll/ۤۨ֫;->ܳ:Ll/᩸ۨ֫;

    .line 431
    invoke-interface {v1, v3, v7, v2}, Ll/۟᩺֫;->֫(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)Ll/ܿܰ֫;

    move-result-object v8

    iget-boolean v11, p0, Ll/ۤۨ֫;->֫:Z

    iget v12, p0, Ll/ۤۨ֫;->ۜ:I

    iget-object v3, p0, Ll/ۤۨ֫;->ܳ:Ll/᩸ۨ֫;

    iget-object v5, p0, Ll/ۤۨ֫;->ۧ:Ll/ᩳ᩸ۡ;

    iget-wide v9, p0, Ll/ۤۨ֫;->ᩳ:J

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Ll/ۛۨ֫;-><init>(Ll/ۧ᩵֫;Ll/᩸ۨ֫;Ll/ۖۨ֫;Ll/ᩳ᩸ۡ;Ll/ۙۛ֫;Ll/ۧܳۧ;Ll/ܿܰ֫;JZI)V

    return-object v0
.end method

.method public final ֫()Ll/ۡۧۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ll/ۤۘۧ;)Ll/ۡۧۧ;
    .locals 0

    .line 211
    iput-object p1, p0, Ll/ۤۨ֫;->ܺ:Ll/ۤۘۧ;

    return-object p0
.end method

.method public final bridge synthetic ֫(Ll/ۧܳۧ;)Ll/ۡۧۧ;
    .locals 0

    .line 104
    invoke-virtual {p0, p1}, Ll/ۤۨ֫;->֫(Ll/ۧܳۧ;)V

    return-object p0
.end method

.method public final ֫(Z)Ll/ۡۧۧ;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 220
    iput-boolean p1, p0, Ll/ۤۨ֫;->᩷:Z

    return-object p0
.end method

.method public final ֫(Ll/۟᩺֫;)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ۤۨ֫;->ۡ:Ll/۟᩺֫;

    return-void
.end method

.method public final ֫(Ll/ۧܳۧ;)V
    .locals 1

    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 200
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۤۨ֫;->᩻:Ll/ۧܳۧ;

    return-void
.end method
