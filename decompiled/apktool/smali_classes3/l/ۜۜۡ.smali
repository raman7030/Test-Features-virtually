.class public final Ll/ۜۜۡ;
.super Ll/ܺۜۡ;
.source "98W2"


# instance fields
.field public final ۧ:[B

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 1

    const/4 v0, 0x4

    .line 151
    invoke-direct {p0, v0}, Ll/ܺۜۡ;-><init>(I)V

    .line 152
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۜۡ;->ܽ:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۘۤۡ;->֫(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۜۜۡ;->ۧ:[B

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 3

    .line 158
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩸ۜۡ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "title"

    .line 159
    iget-object v2, p0, Ll/ۜۜۡ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "markdown"

    .line 160
    iget-object v2, p0, Ll/ۜۜۡ;->ۧ:[B

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 161
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
