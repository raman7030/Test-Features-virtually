.class public final enum Ll/᩸۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CommentStartDash"

    const/16 v1, 0x2d

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩸۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 968
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    .line 970
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    if-eqz p2, :cond_3

    const/16 v0, 0x2d

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    .line 991
    iget-object v0, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {v0, p2}, Ll/ܳ֨ۚ;->֫(C)V

    .line 992
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 986
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 987
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 988
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 981
    :cond_1
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 982
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 983
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 973
    :cond_2
    sget-object p2, Ll/᩵ܶۚ;->ܺ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 976
    :cond_3
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 977
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    .line 978
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
