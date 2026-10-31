.class public final Ll/ۤ۟᩵;
.super Ljava/lang/Object;
.source "54FE"


# instance fields
.field public final ֫:Ll/ᩴ۟᩵;

.field public final ۧ:Ll/ۡ۟᩵;


# direct methods
.method public constructor <init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۤ۟᩵;->ۧ:Ll/ۡ۟᩵;

    .line 59
    iput-object p2, p0, Ll/ۤ۟᩵;->֫:Ll/ᩴ۟᩵;

    return-void
.end method

.method public static ֫(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)Z
    .locals 2

    .line 66
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_1

    const/16 v1, 0x19a

    if-eq v0, v1, :cond_1

    const/16 v1, 0x19e

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1f5

    if-eq v0, v1, :cond_1

    const/16 v1, 0xcb

    if-eq v0, v1, :cond_1

    const/16 v1, 0xcc

    if-eq v0, v1, :cond_1

    const/16 v1, 0x133

    if-eq v0, v1, :cond_0

    const/16 v1, 0x134

    if-eq v0, v1, :cond_1

    const/16 v1, 0x194

    if-eq v0, v1, :cond_1

    const/16 v1, 0x195

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v0, "Expires"

    .line 86
    invoke-virtual {p1, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 87
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧܰ᩵;->ܽ()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 88
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧܰ᩵;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧܰ᩵;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    :cond_1
    :pswitch_1
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧܰ᩵;->ۜ()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Ll/ۡ۟᩵;->ۧ()Ll/ۧܰ᩵;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۧܰ᩵;->ۜ()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
