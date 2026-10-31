.class public final Ll/ۧܿۜ;
.super Ljava/lang/Object;
.source "B7AT"


# instance fields
.field public final ֫:Ll/۫ۘܽ;

.field public final synthetic ۧ:Ll/ܽܿۜ;


# direct methods
.method public constructor <init>(Ll/ܽܿۜ;Ll/۫ۘܽ;)V
    .locals 0

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܿۜ;->ۧ:Ll/ܽܿۜ;

    .line 280
    iput-object p2, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    return-void
.end method


# virtual methods
.method public final ֫(IILjava/lang/CharSequence;)Ll/֫ܿۜ;
    .locals 2

    .line 323
    iget-object v0, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0, p3}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 324
    :cond_0
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 325
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    .line 326
    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v1

    if-ge v1, p2, :cond_0

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v1

    if-le v1, p1, :cond_0

    .line 327
    new-instance p1, Ll/֫ܿۜ;

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result p2

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v0

    const-string v1, "dexClassName"

    invoke-direct {p1, v1, p2, v0, p3}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    return-object p1

    .line 330
    :cond_1
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;
    .locals 3

    .line 288
    iget-object v0, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 289
    iget-object v1, p0, Ll/ۧܿۜ;->ۧ:Ll/ܽܿۜ;

    iget-object v1, v1, Ll/ܽܿۜ;->ܽ:Ljava/lang/String;

    const-string v2, "exact"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v1

    .line 290
    :goto_0
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 294
    :cond_1
    new-instance v1, Ll/֫ܿۜ;

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v0

    invoke-direct {v1, p2, v2, v0, p1}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    return-object v1
.end method

.method public final ֫(Ll/ۨۖܽ;)Ll/۫ۘܽ;
    .locals 1

    .line 348
    iget-object v0, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 336
    iget-object v0, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0}, Ll/۫ۘܽ;->ۜ()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "fatal"

    if-nez v1, :cond_1

    .line 339
    invoke-virtual {v0}, Ll/۫ۘܽ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "REGEX_RESOURCE_LIMIT"

    const-string v1, "Regex matching exceeded its execution memory limit."

    .line 254
    invoke-static {v2, v0, v1, v3}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 340
    throw v0

    :cond_1
    const-string v0, "REGEX_TIMEOUT"

    const-string v1, "Regex matching timed out."

    .line 248
    invoke-static {v2, v0, v1, v3}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 337
    throw v0
.end method

.method public final ֫(Ljava/lang/CharSequence;Ll/ۢܿۜ;)V
    .locals 5

    .line 301
    iget-object v0, p0, Ll/ۧܿۜ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 302
    iget-object v1, p0, Ll/ۧܿۜ;->ۧ:Ll/ܽܿۜ;

    iget-object v1, v1, Ll/ܽܿۜ;->ܽ:Ljava/lang/String;

    const-string v2, "exact"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "dexString"

    if-eqz v1, :cond_1

    .line 303
    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    .line 304
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    if-eqz v1, :cond_0

    .line 306
    new-instance v1, Ll/֫ܿۜ;

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v0

    invoke-direct {v1, v2, v3, v0, p1}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    invoke-virtual {p2, v1}, Ll/ۢܿۜ;->֫(Ll/֫ܿۜ;)V

    :cond_0
    return-void

    .line 310
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 311
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    .line 312
    new-instance v1, Ll/֫ܿۜ;

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v4

    invoke-direct {v1, v2, v3, v4, p1}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    invoke-virtual {p2, v1}, Ll/ۢܿۜ;->֫(Ll/֫ܿۜ;)V

    goto :goto_0

    .line 314
    :cond_2
    invoke-virtual {p0}, Ll/ۧܿۜ;->֫()V

    return-void
.end method
