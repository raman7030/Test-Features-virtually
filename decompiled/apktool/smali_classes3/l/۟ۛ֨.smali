.class public final enum Ll/۟ۛ֨;
.super Ll/ۧۨ֨;
.source "M43N"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILl/᩵֨֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 1494
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧۨ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩵֨֨;)V
    .locals 2

    const-string v0, "UPPER_LEGACY"

    const/4 v1, 0x4

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/۟ۛ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨֨֨;Ll/֡ۨ֨;)Z
    .locals 4

    .line 1497
    iget-object v0, p0, Ll/ۧۨ֨;->᩸:Ll/᩵֨֨;

    const/4 v1, 0x1

    new-array v2, v1, [Ll/᩵֨֨;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p1, v2}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/֡ۨ֨;->ܽ(Ll/ۖܶ۠;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ll/֨֨֨;->ۤ֫()Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    return v3
.end method

.method public ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1502
    sget-object v0, Ll/ۧۨ֨;->۫:Ll/ۧۨ֨;

    invoke-virtual {v0, p1, p2}, Ll/ۧۨ֨;->ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method
