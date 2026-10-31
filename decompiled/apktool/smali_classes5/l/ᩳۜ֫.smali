.class public final Ll/ᩳۜ֫;
.super Ll/᩶᩻֫;
.source "O5NM"


# instance fields
.field public final synthetic ۧ:Ll/ۚۜ֫;


# direct methods
.method public constructor <init>(Ll/ۚۜ֫;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object p1, p0, Ll/ᩳۜ֫;->ۧ:Ll/ۚۜ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 2

    .line 507
    iget-object v0, p0, Ll/ᩳۜ֫;->ۧ:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۠()Ll/ۙ᩻֫;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۚۜ֫;->۠()Ll/ۙ᩻֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 57
    invoke-static {v0, p1, v1}, Ll/ۡ᩻֫;->֫(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method
