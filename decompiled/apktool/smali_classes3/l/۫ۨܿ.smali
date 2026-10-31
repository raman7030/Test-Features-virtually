.class public final synthetic Ll/۫ۨܿ;
.super Ljava/lang/Object;
.source "964V"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۜܰܿ;

.field public final synthetic ᩹:Ll/ᩳ᩺ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۨܿ;->᩸:Ll/ۜܰܿ;

    iput-object p2, p0, Ll/۫ۨܿ;->᩹:Ll/ᩳ᩺ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 9

    .line 49
    iget-object v1, p0, Ll/۫ۨܿ;->᩹:Ll/ᩳ᩺ܿ;

    iget-object v4, p0, Ll/۫ۨܿ;->᩸:Ll/ۜܰܿ;

    invoke-virtual {v1, v4}, Ll/ᩳ᩺ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 52
    :cond_0
    invoke-virtual {v4}, Ll/ۜܰܿ;->ۢ()Ll/ܳܰܿ;

    move-result-object v3

    if-nez v3, :cond_1

    const p1, 0x7f1207a7

    .line 54
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 57
    :cond_1
    invoke-virtual {v1, v4}, Ll/ᩳ᩺ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 58
    invoke-virtual {v3}, Ll/ܳܰܿ;->close()V

    return-void

    :cond_2
    const/4 p1, 0x5

    if-ge p2, p1, :cond_3

    .line 61
    iget p1, v1, Ll/ᩳ᩺ܿ;->ܿ:I

    iget v0, v1, Ll/ᩳ᩺ܿ;->֫:I

    invoke-static {p1, v0, p2}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide v5

    const-wide/32 v7, 0x80000

    cmp-long p1, v5, v7

    if-lez p1, :cond_3

    .line 63
    invoke-virtual {v3}, Ll/ܳܰܿ;->close()V

    const p1, 0x7f1201ff

    .line 64
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 68
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    .line 69
    instance-of p1, v6, Ll/ۗܺ᩷;

    if-eqz p1, :cond_4

    .line 70
    move-object p1, v6

    check-cast p1, Ll/ۗܺ᩷;

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    .line 71
    new-instance p1, Ll/ۨۨܿ;

    move-object v0, p1

    move v5, p2

    invoke-direct/range {v0 .. v6}, Ll/ۨۨܿ;-><init>(Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;Ll/ܳܰܿ;Ll/ۜܰܿ;ILandroid/content/Context;)V

    .line 155
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
