.class public final synthetic Ll/ܳۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۜۡۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۡۢ;Ljava/lang/String;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۡۢ;->᩸:Ll/ۜۡۢ;

    iput-object p2, p0, Ll/ܳۡۢ;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ܳۡۢ;->᩶:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 496
    iget-object p1, p0, Ll/ܳۡۢ;->᩸:Ll/ۜۡۢ;

    iget-object p2, p1, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, p2, Ll/ܽܺۢ;->۬:Ljava/lang/String;

    iget-object p2, p2, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    .line 77
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "protector/config/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".json"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 79
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 82
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 83
    invoke-virtual {p2}, Ll/ۧܺۢ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 497
    :catch_0
    iget-object p2, p1, Ll/ۜۡۢ;->ۢ:Ll/۟ۡۢ;

    iget-object p1, p1, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    sget v0, Ll/۟ۡۢ;->ᩴۧ:I

    .line 666
    new-instance v0, Ll/ۡۡۢ;

    iget-object v1, p0, Ll/ܳۡۢ;->᩹:Ljava/lang/String;

    invoke-direct {v0, p2, p1, v1}, Ll/ۡۡۢ;-><init>(Ll/۟ۡۢ;Ll/ܽܺۢ;Ljava/lang/String;)V

    .line 716
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    .line 498
    iget-object p1, p0, Ll/ܳۡۢ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method
