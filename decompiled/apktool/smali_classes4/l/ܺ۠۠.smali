.class public final Ll/ܺ۠۠;
.super Ll/ᩴ۠۠;
.source "37P4"


# virtual methods
.method public final ֫(Ll/ۡ۠۠;Ll/ۢ۠۠;Ll/ۢ۠۠;Ljava/lang/Object;)V
    .locals 3

    .line 236
    check-cast p2, Ll/ۖ۠۠;

    check-cast p3, Ll/ۖ۠۠;

    check-cast p4, Ljava/lang/StringBuilder;

    .line 240
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    invoke-interface {p2, p3, p1}, Ll/ۖ۠۠;->֫(Ll/ۖ۠۠;Ll/ۡ۠۠;)Ljava/util/Properties;

    move-result-object p1

    .line 253
    invoke-virtual {p1}, Ljava/util/Properties;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, ","

    const-string p3, " "

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\{"

    const-string p3, "["

    .line 254
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\}"

    const-string p3, "]"

    .line 255
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 241
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    .line 242
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۢ۠۠;Ljava/lang/Object;)V
    .locals 2

    .line 236
    check-cast p1, Ll/ۖ۠۠;

    check-cast p2, Ljava/lang/StringBuilder;

    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    invoke-interface {p1}, Ll/ۖ۠۠;->֫()Ljava/util/Properties;

    move-result-object p1

    .line 253
    invoke-virtual {p1}, Ljava/util/Properties;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, ","

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\{"

    const-string v1, "["

    .line 254
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\}"

    const-string v1, "]"

    .line 255
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 248
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    .line 249
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
