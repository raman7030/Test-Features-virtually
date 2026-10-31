.class public final Ll/ۗۜۡ;
.super Ll/᩶᩻ۡ;
.source "08W3"


# instance fields
.field public final synthetic ܿ:Ll/ۨۜۡ;


# direct methods
.method public constructor <init>(Ll/ۨۜۡ;)V
    .locals 0

    .line 51
    iput-object p1, p0, Ll/ۗۜۡ;->ܿ:Ll/ۨۜۡ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/᩶᩻ۡ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "action://points-redemption/"

    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x1b

    const/4 v0, 0x1

    .line 56
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 57
    iget-object p2, p0, Ll/ۗۜۡ;->ܿ:Ll/ۨۜۡ;

    sget-object v1, Ll/ۨۜۡ;->᩷ۧ:Ll/ۙۤۡ;

    .line 79
    new-instance v1, Ll/۫ۜۡ;

    invoke-direct {v1, p2, p2, p1}, Ll/۫ۜۡ;-><init>(Ll/ۨۜۡ;Ll/ۗܺ᩷;I)V

    const p2, 0x7f120793

    .line 130
    invoke-virtual {v1, p2}, Ll/۬ۗܿ;->ۡ(I)V

    const p2, 0x7f120795

    .line 131
    invoke-virtual {v1, p2}, Ll/۬ۗܿ;->ۜ(I)V

    .line 132
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    .line 133
    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->ܿ(I)V

    const/4 p1, 0x4

    .line 134
    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->ܳ(I)V

    .line 135
    invoke-virtual {v1}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {v1, v0}, Ll/۬ۗܿ;->ۧ(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v0

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩶᩻ۡ;->֫(Landroid/view/View;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
