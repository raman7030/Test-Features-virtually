.class public final synthetic Ll/ۨۢ᩻;
.super Ljava/lang/Object;
.source "TAIM"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨۢ᩻;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 4

    .line 2
    iget v0, p0, Ll/ۨۢ᩻;->֫:I

    const/16 v1, 0x193

    const-string v2, ""

    packed-switch v0, :pswitch_data_0

    .line 11
    sget v0, Ll/۠ۚ᩻;->᩺:I

    .line 112
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 984
    :pswitch_0
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v0

    .line 985
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 988
    :cond_0
    new-instance v0, Ll/ۘ۟᩵;

    invoke-direct {v0}, Ll/ۘ۟᩵;-><init>()V

    .line 989
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    sget-object p1, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    .line 990
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ܳ۟᩵;)V

    .line 991
    invoke-virtual {v0, v1}, Ll/ۘ۟᩵;->֫(I)V

    .line 992
    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 993
    invoke-static {}, Ll/֡۟᩵;->ۖ()Ll/֡۟᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    .line 994
    invoke-virtual {v0}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v0

    :goto_0
    return-object v0

    .line 116
    :cond_1
    new-instance v0, Ll/ۘ۟᩵;

    invoke-direct {v0}, Ll/ۘ۟᩵;-><init>()V

    .line 117
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    sget-object p1, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    .line 118
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ܳ۟᩵;)V

    .line 119
    invoke-virtual {v0, v1}, Ll/ۘ۟᩵;->֫(I)V

    .line 120
    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 121
    invoke-static {}, Ll/֡۟᩵;->ۖ()Ll/֡۟᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    .line 122
    invoke-virtual {v0}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v0

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
