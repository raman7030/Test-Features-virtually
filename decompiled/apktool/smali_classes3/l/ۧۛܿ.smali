.class public final Ll/ۧۛܿ;
.super Ljava/lang/Object;
.source "Q4I7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p2, p0, Ll/ۧۛܿ;->᩸:Ljava/lang/String;

    const/4 v0, 0x1

    if-nez p4, :cond_0

    .line 47
    sget-object p4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_count"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {p4, v3, v1}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result p4

    if-gt p4, v0, :cond_0

    .line 50
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    .line 0
    invoke-static {p2, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    add-int/2addr p4, v0

    int-to-byte p4, p4

    .line 50
    invoke-interface {v1, p4, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p2

    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    const/4 v0, 0x0

    .line 53
    :cond_0
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p1, 0x7f120a76

    .line 54
    invoke-virtual {p2, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 55
    invoke-virtual {p2, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120189

    const/4 p3, 0x0

    .line 56
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz v0, :cond_1

    const p1, 0x7f120a78

    .line 58
    invoke-virtual {p2, p1, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 59
    :cond_1
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(ILl/ۗܺ᩷;Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p1, p2, p0, v0}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "forbid_tip_"

    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ll/ۧۛܿ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۧۛܿ;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public static ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2, p0, v0}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 67
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-object p2, p0, Ll/ۧۛܿ;->᩸:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
