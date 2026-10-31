.class public final Ll/ۢ۟᩵;
.super Ljava/lang/Object;
.source "54F8"


# instance fields
.field public ֫:Ll/ۖ۟᩵;

.field public ۧ:Ll/۫ܰ᩵;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ۨܰ᩵;

.field public ᩳ:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/ۢ۟᩵;->ᩳ:Ljava/util/Map;

    const-string v0, "GET"

    .line 129
    iput-object v0, p0, Ll/ۢ۟᩵;->ܽ:Ljava/lang/String;

    .line 130
    new-instance v0, Ll/۫ܰ᩵;

    invoke-direct {v0}, Ll/۫ܰ᩵;-><init>()V

    iput-object v0, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۡ۟᩵;
    .locals 2

    .line 292
    iget-object v0, p0, Ll/ۢ۟᩵;->ܿ:Ll/ۨܰ᩵;

    if-eqz v0, :cond_0

    .line 293
    new-instance v0, Ll/ۡ۟᩵;

    invoke-direct {v0, p0}, Ll/ۡ۟᩵;-><init>(Ll/ۢ۟᩵;)V

    return-object v0

    .line 292
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {v0, p1}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {v0, p1, p2}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ۖ۟᩵;)V
    .locals 2

    if-eqz p1, :cond_5

    .line 253
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "method "

    if-eqz p2, :cond_1

    .line 254
    invoke-static {p1}, Ll/ۗᩳۘ;->ܳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 255
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " must not have a request body."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 255
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-nez p2, :cond_3

    const-string v1, "POST"

    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "PUT"

    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "PATCH"

    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "PROPPATCH"

    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "REPORT"

    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 258
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " must have a request body."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 258
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 260
    :cond_3
    :goto_1
    iput-object p1, p0, Ll/ۢ۟᩵;->ܽ:Ljava/lang/String;

    .line 261
    iput-object p2, p0, Ll/ۢ۟᩵;->֫:Ll/ۖ۟᩵;

    return-void

    .line 253
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.length() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 252
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤܰ᩵;)V
    .locals 0

    .line 208
    invoke-virtual {p1}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    return-void
.end method

.method public final ֫(Ll/ۧܰ᩵;)V
    .locals 2

    .line 218
    invoke-virtual {p1}, Ll/ۧܰ᩵;->toString()Ljava/lang/String;

    move-result-object p1

    .line 219
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "Cache-Control"

    if-eqz v0, :cond_0

    .line 202
    iget-object p1, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {p1, v1}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    invoke-static {v1}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 384
    invoke-static {p1, v1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-virtual {v0, v1}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v0, v1, p1}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۨܰ᩵;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 145
    iput-object p1, p0, Ll/ۢ۟᩵;->ܿ:Ll/ۨܰ᩵;

    return-void

    .line 144
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()V
    .locals 2

    const-string v0, "GET"

    const/4 v1, 0x0

    .line 224
    invoke-virtual {p0, v0, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "ws:"

    move-object v0, p1

    .line 159
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 0
    :goto_0
    invoke-static {v1, p1, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "wss:"

    move-object v0, p1

    .line 161
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x4

    goto :goto_0

    .line 165
    :cond_1
    :goto_1
    invoke-static {p1}, Ll/ۨܰ᩵;->ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object p1

    .line 145
    iput-object p1, p0, Ll/ۢ۟᩵;->ܿ:Ll/ۨܰ᩵;

    return-void

    .line 156
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    invoke-static {p1}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 384
    invoke-static {p2, p1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-virtual {v0, p1}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v0, p1, p2}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
