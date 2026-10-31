.class public final Ll/᩻֡᩷;
.super Ll/֡ܽ;
.source "6AY4"


# instance fields
.field public final synthetic ܿ:Ll/᩵֡᩷;

.field public final ᩳ:Ll/ۡۤۡ;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/᩻֡᩷;->ܿ:Ll/᩵֡᩷;

    const/4 p1, 0x1

    .line 1075
    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    .line 1076
    invoke-static {}, Ll/ۡۤۡ;->ᩳ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֡᩷;->ᩳ:Ll/ۡۤۡ;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 4

    .line 1078
    iget-object v0, p0, Ll/᩻֡᩷;->ᩳ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1080
    :cond_0
    iget-object v0, p0, Ll/᩻֡᩷;->ܿ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ۜ(Ll/᩵֡᩷;)Ll/ܳ᩷ۡ;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "bottomSlideLayout"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ll/ܳ᩷ۡ;->᩻()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1082
    invoke-static {v0}, Ll/᩵֡᩷;->᩻(Ll/᩵֡᩷;)Ll/ۚ᩵ܳ;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ۚ᩵ܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    return-void

    .line 1085
    :cond_1
    invoke-static {v0}, Ll/᩵֡᩷;->ۜ(Ll/᩵֡᩷;)Ll/ܳ᩷ۡ;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->ܽ()V

    return-void

    :cond_2
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string v0, "bottomDrawer"

    .line 1082
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 1087
    :cond_4
    invoke-static {v0}, Ll/᩵֡᩷;->ᩳ(Ll/᩵֡᩷;)V

    return-void

    .line 1080
    :cond_5
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2
.end method
