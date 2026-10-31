.class public final synthetic Ll/۫ۚ᩻;
.super Ljava/lang/Object;
.source "S737"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۚ᩻;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 3

    .line 152
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v0

    const-string v1, "User-Agent"

    iget-object v2, p0, Ll/۫ۚ᩻;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 151
    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method
