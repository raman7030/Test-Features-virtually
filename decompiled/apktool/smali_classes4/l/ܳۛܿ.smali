.class public final Ll/ܳۛܿ;
.super Ll/۟ܶۡ;
.source "Q7Z8"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public final synthetic ۢ:Ll/ܽۢܳ;

.field public ܳ:Ll/ܶ᩹ۡ;

.field public final synthetic ᩷:Ll/ܶ᩵ܿ;

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;Ll/ܽۢܳ;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/ܳۛܿ;->ۜ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ܳۛܿ;->᩷:Ll/ܶ᩵ܿ;

    iput-object p3, p0, Ll/ܳۛܿ;->ۢ:Ll/ܽۢܳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 113
    new-instance v0, Ll/ܿۛܿ;

    iget-object v1, p0, Ll/ܳۛܿ;->ܳ:Ll/ܶ᩹ۡ;

    invoke-virtual {v1}, Ll/ܶ᩹ۡ;->getIntrinsicWidth()I

    move-result v1

    iget-object v2, p0, Ll/ܳۛܿ;->ܳ:Ll/ܶ᩹ۡ;

    invoke-virtual {v2}, Ll/ܶ᩹ۡ;->getIntrinsicHeight()I

    move-result v2

    iget-object v3, p0, Ll/ܳۛܿ;->ۜ:Ll/ۗܺ᩷;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ܿۛܿ;-><init>(Ll/ܳۛܿ;Ll/ۗܺ᩷;II)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 159
    iget-object v0, p0, Ll/ܳۛܿ;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 89
    iget-object v0, p0, Ll/ܳۛܿ;->ۜ:Ll/ۗܺ᩷;

    const v1, 0x7f120528

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    const-string v0, "resources.arsc"

    .line 94
    iget-object v1, p0, Ll/ܳۛܿ;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 98
    :try_start_0
    new-instance v2, Ll/۫ܽܽ;

    invoke-direct {v2, v0}, Ll/۫ܽܽ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    .line 104
    new-instance v2, Ll/۫ܽܽ;

    invoke-direct {v2}, Ll/۫ܽܽ;-><init>()V

    .line 106
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v0

    const/4 v3, 0x0

    .line 107
    invoke-static {v0, v2, v3}, Ll/ܶ᩹ۡ;->֫(Ll/ۤۨۡ;Ll/۫ܽܽ;Z)Ll/ܶ᩹ۡ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۛܿ;->ܳ:Ll/ܶ᩹ۡ;

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2122
    iget-object v1, p0, Ll/ܳۛܿ;->ۢ:Ll/ܽۢܳ;

    invoke-virtual {v1, v0, v3}, Ll/ܽۢܳ;->֫(Ljava/lang/String;Z)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    .line 1147
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 108
    iput-object v0, p0, Ll/ܳۛܿ;->᩻:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 164
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
