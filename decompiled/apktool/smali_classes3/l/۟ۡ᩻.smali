.class public final Ll/۟ۡ᩻;
.super Ljava/lang/Object;
.source "3AGE"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;)Ll/֫ܺ᩻;
    .locals 2

    .line 384
    new-instance v0, Ll/֫ܺ᩻;

    const-string v1, "id"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Ll/֫ܺ᩻;-><init>(I)V

    const-string v1, "host"

    .line 385
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    const-string v1, "port"

    .line 386
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/֫ܺ᩻;->ܿ֫:I

    const-string v1, "remark"

    .line 387
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string v1, "username"

    .line 388
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    const-string v1, "password"

    .line 389
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    const-string v1, "startPath"

    .line 390
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const-string v1, "charset"

    .line 391
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    const-string v1, "passive"

    .line 392
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    iput-boolean p0, v0, Ll/֫ܺ᩻;->ܽ֫:Z

    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/֫ܺ᩻;
    .locals 2

    .line 397
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    .line 398
    new-instance v0, Ll/֫ܺ᩻;

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    invoke-direct {v0, v1}, Ll/֫ܺ᩻;-><init>(I)V

    .line 399
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/֫ܺ᩻;->ܿ֫:I

    .line 400
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    .line 401
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    iput-boolean v1, v0, Ll/֫ܺ᩻;->ܽ֫:Z

    .line 402
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    .line 403
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 404
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 405
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 406
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 407
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 408
    iget-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, ""

    .line 409
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    return-object v0

    .line 411
    :cond_0
    iget-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ(Ll/۬ۜܽ;)Ll/֫ܺ᩻;
    .locals 2

    .line 417
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    .line 418
    new-instance v0, Ll/֫ܺ᩻;

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    invoke-direct {v0, v1}, Ll/֫ܺ᩻;-><init>(I)V

    .line 419
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/֫ܺ᩻;->ܿ֫:I

    .line 420
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    .line 421
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    .line 422
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 423
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 424
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 425
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 426
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 427
    iget-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, ""

    .line 428
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    return-object v0

    .line 430
    :cond_0
    iget-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    return-object v0
.end method
