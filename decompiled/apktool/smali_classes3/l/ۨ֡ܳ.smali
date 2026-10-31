.class public final synthetic Ll/ۨ֡ܳ;
.super Ljava/lang/Object;
.source "698T"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ܽۢܳ;

.field public final synthetic ᩸:Ll/۟֡ܳ;

.field public final synthetic ᩹:Ll/۟ۜᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۟֡ܳ;Ll/۟ۜᩳ;Ll/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ֡ܳ;->᩸:Ll/۟֡ܳ;

    iput-object p2, p0, Ll/ۨ֡ܳ;->᩹:Ll/۟ۜᩳ;

    iput-object p3, p0, Ll/ۨ֡ܳ;->᩶:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 98
    iget-object p1, p0, Ll/ۨ֡ܳ;->᩹:Ll/۟ۜᩳ;

    invoke-virtual {p1}, Ll/۟ۜᩳ;->֫()V

    .line 99
    iget-object p2, p1, Ll/۟ۜᩳ;->֫:Ll/ܶ᩵ܿ;

    iget-object p1, p1, Ll/۟ۜᩳ;->ۧ:Ll/ܶ᩵ܿ;

    .line 112
    iget-object v0, p0, Ll/ۨ֡ܳ;->᩸:Ll/۟֡ܳ;

    invoke-virtual {v0}, Ll/֫ۜܳ;->ᩳ()I

    move-result v1

    const-string v2, "txt"

    iget-object v3, p0, Ll/ۨ֡ܳ;->᩶:Ll/ܽۢܳ;

    invoke-static {v3, v1, v2}, Ll/᩻֡ܳ;->֫(Ll/ܽۢܳ;ILjava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 113
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/ܰ֡ܳ;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    const-string v3, "saveAsPath"

    .line 114
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "inputPath1"

    .line 115
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, v1, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "inputPath2"

    .line 116
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v0}, Ll/֫ۜܳ;->ᩳ()I

    move-result p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "title"

    invoke-virtual {v2, p2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-virtual {v2}, Ll/֨۠ۢ;->֫()I

    return-void
.end method
