.class public final synthetic Ll/ۜܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ܳۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܳۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܳۢ;->᩸:Ll/۟ܳۢ;

    iput-object p2, p0, Ll/ۜܳۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 765
    iget-object v3, p0, Ll/ۜܳۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".zip"

    .line 766
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/ۜܳۢ;->᩸:Ll/۟ܳۢ;

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    .line 939
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ۗܺ᩷;

    .line 940
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 941
    new-instance v7, Ll/ۛܳۢ;

    move-object v0, v7

    move-object v1, v2

    move-object v2, v4

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Ll/ۛܳۢ;-><init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 1003
    invoke-virtual {v7}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_0
    const-string v1, ".dex"

    .line 768
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 907
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    new-array v1, v5, [Ljava/lang/String;

    .line 908
    invoke-static {v3, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 909
    sget-object v3, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 910
    new-instance v4, Ll/۫ܳۢ;

    invoke-direct {v4, v2, v1, v3, v0}, Ll/۫ܳۢ;-><init>(Ll/۟ܳۢ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۗܺ᩷;)V

    invoke-static {v4}, Ll/ܽۛܽ;->֫(Ll/ۧۛܽ;)V

    return-void

    .line 1142
    :cond_1
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    .line 1143
    new-instance v1, Ll/ܰܳۢ;

    invoke-direct {v1, v2, v0, v3}, Ll/ܰܳۢ;-><init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 1184
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
