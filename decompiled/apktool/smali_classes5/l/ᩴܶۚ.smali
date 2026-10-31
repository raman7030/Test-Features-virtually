.class public final enum Ll/ᩴܶۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "EndTagOpen"

    const/16 v1, 0x8

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ᩴܶۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    .line 126
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    const-string p2, "</"

    .line 128
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 129
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 130
    :cond_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    .line 131
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Z)Ll/ۡ֨ۚ;

    .line 132
    sget-object p2, Ll/᩵ܶۚ;->۠ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_1
    const/16 v0, 0x3e

    .line 133
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 134
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 135
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 137
    :cond_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    .line 276
    invoke-virtual {p2}, Ll/ܳ֨ۚ;->᩻()V

    const/4 v0, 0x1

    .line 277
    iput-boolean v0, p2, Ll/ܳ֨ۚ;->ᩳ:Z

    const/16 v0, 0x2f

    .line 139
    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    .line 140
    sget-object p2, Ll/᩵ܶۚ;->ܳ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
