.class public final Ll/֡᩷᩵;
.super Ll/᩹᩷᩵;
.source "C9Z9"


# instance fields
.field public ۘ:Ljava/lang/String;

.field public ᩴ:Ljava/lang/String;


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;
    .locals 4

    const/4 v0, 0x0

    .line 1003
    invoke-virtual {p0, v0}, Ll/֡᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v0

    .line 1004
    invoke-virtual {v0, p1}, Ll/᩶ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    .line 1005
    new-instance v1, Ll/ܶۢ᩵;

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v1
.end method

.method public final ֫(Z)Ll/᩶ۢ᩵;
    .locals 10

    .line 991
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "cpu"

    .line 992
    iget-object v2, p0, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "os"

    .line 993
    iget-object v2, p0, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 994
    new-instance v1, Ll/᩶ۢ᩵;

    .line 168
    iget-object v2, p0, Ll/ܰۜ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/4 v7, 0x0

    .line 172
    invoke-static {v0}, Ll/ܺۡ᩵;->֫(Ljava/util/HashMap;)[B

    move-result-object v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    move v8, p1

    invoke-direct/range {v3 .. v9}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v1
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1014
    invoke-super {p0, p1}, Ll/᩹᩷᩵;->֫(Ljava/lang/StringBuilder;)V

    const-string v0, " cpu: \'"

    .line 1015
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' os: \'"

    .line 1016
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    .line 1017
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ܿ᩷᩵;)V
    .locals 2

    .line 981
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 982
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1, v0}, Ll/ܿ᩷᩵;->ۧ(ILjava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ll/ۡۢ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ۡۢ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/᩹᩷᩵;)Z
    .locals 4

    .line 953
    iget-object v0, p0, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    instance-of v1, p1, Ll/֡᩷᩵;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 956
    :cond_0
    check-cast p1, Ll/֡᩷᩵;

    iget-object v1, p1, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    .line 957
    iget-object v3, p0, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    if-nez v3, :cond_1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    if-nez v0, :cond_2

    if-eqz v1, :cond_2

    return v2

    .line 963
    :cond_2
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v2
.end method

.method public final ᩴ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
