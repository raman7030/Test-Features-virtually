.class public Ll/ᩴ᩷᩵;
.super Ll/ܰۜ᩵;
.source "7A22"


# static fields
.field public static ۜ:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Ll/ᩴ᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩷᩵;->ۜ:Ll/֫᩻֨;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)Ll/ᩴ᩷᩵;
    .locals 2

    .line 235
    sget-object v0, Ll/᩻᩷᩵;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 253
    new-instance v0, Ll/ᩴ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 251
    :pswitch_0
    new-instance v0, Ll/ۘ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 249
    :pswitch_1
    new-instance v0, Ll/ۖ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 247
    :pswitch_2
    new-instance v0, Ll/ܺ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 245
    :pswitch_3
    new-instance v0, Ll/ۡ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 243
    :pswitch_4
    new-instance v0, Ll/ۜ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 241
    :pswitch_5
    new-instance v0, Ll/ۢ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 239
    :pswitch_6
    new-instance v0, Ll/ۢ᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    .line 237
    :pswitch_7
    new-instance v0, Ll/᩷᩷᩵;

    .line 222
    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/ۡۢ᩵;Ljava/util/HashSet;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۡۢ᩵;Ljava/util/HashSet;Ll/᩶ۢ᩵;)V
    .locals 4

    if-eqz p3, :cond_2

    .line 275
    invoke-virtual {p3}, Ll/᩶ۢ᩵;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Ll/᩶ۢ᩵;->ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    :cond_0
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v2

    sget v3, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {v0, v2, v1, v3}, Ll/۟᩷᩵;->֫(Ll/ۛۢ᩵;ZI)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 278
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v2

    invoke-virtual {p3, v0, v3, v2}, Ll/᩶ۢ᩵;->֫(Ll/ۛۢ᩵;ILl/۟᩷᩵;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 280
    :cond_1
    invoke-virtual {p1}, Ll/ۡۢ᩵;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    aput-object v0, v2, v1

    const/4 p1, 0x2

    aput-object p3, v2, p1

    const/4 p1, 0x3

    aput-object p2, v2, p1

    sget-object p1, Ll/ᩴ᩷᩵;->ۜ:Ll/֫᩻֨;

    const-string p2, "{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}"

    invoke-interface {p1, p2, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final ֫(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ll/ۡۢ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
