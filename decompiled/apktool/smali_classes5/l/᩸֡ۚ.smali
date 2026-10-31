.class public final Ll/᩸֡ۚ;
.super Ljava/lang/Object;
.source "P44J"

# interfaces
.implements Ll/ۡ᩹ۚ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸֡ۚ;->᩸:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ֡ۚ;I)V
    .locals 0

    .line 1323
    instance-of p2, p1, Ll/᩶֡ۚ;

    if-eqz p2, :cond_0

    .line 1324
    move-object p2, p1

    check-cast p2, Ll/᩶֡ۚ;

    .line 1325
    invoke-virtual {p2}, Ll/᩶֡ۚ;->֫֫()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ll/ۨ֡ۚ;->ۡ()Ll/ۨ֡ۚ;

    move-result-object p1

    instance-of p1, p1, Ll/ۧۚۚ;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩸֡ۚ;->᩸:Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۧۚۚ;->֫(Ljava/lang/StringBuilder;)Z

    move-result p2

    if-nez p2, :cond_0

    const/16 p2, 0x20

    .line 1326
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۨ֡ۚ;I)V
    .locals 2

    .line 1309
    instance-of p2, p1, Ll/ۧۚۚ;

    iget-object v0, p0, Ll/᩸֡ۚ;->᩸:Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    .line 1310
    check-cast p1, Ll/ۧۚۚ;

    .line 51
    invoke-virtual {p1}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object p2

    .line 1409
    iget-object v1, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-static {v1}, Ll/᩶֡ۚ;->ܿ(Ll/ۨ֡ۚ;)Z

    move-result v1

    if-nez v1, :cond_1

    instance-of p1, p1, Ll/ۖ֡ۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 1412
    :cond_0
    invoke-static {v0}, Ll/ۧۚۚ;->֫(Ljava/lang/StringBuilder;)Z

    move-result p1

    invoke-static {p2, v0, p1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    return-void

    .line 1410
    :cond_1
    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1312
    :cond_2
    instance-of p2, p1, Ll/᩶֡ۚ;

    if-eqz p2, :cond_4

    .line 1313
    check-cast p1, Ll/᩶֡ۚ;

    .line 1314
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-lez p2, :cond_4

    .line 1315
    invoke-virtual {p1}, Ll/᩶֡ۚ;->֫֫()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {p1}, Ll/᩶֡ۚ;->֫(Ll/᩶֡ۚ;)Ll/ܽ֨ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֨ۚ;->ۢ()Ljava/lang/String;

    move-result-object p1

    const-string p2, "br"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1316
    :cond_3
    invoke-static {v0}, Ll/ۧۚۚ;->֫(Ljava/lang/StringBuilder;)Z

    move-result p1

    if-nez p1, :cond_4

    const/16 p1, 0x20

    .line 1317
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    return-void
.end method
