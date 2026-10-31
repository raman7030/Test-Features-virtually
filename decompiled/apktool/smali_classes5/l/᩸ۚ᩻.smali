.class public final Ll/᩸ۚ᩻;
.super Ljava/lang/Object;
.source "27J4"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/᩸ۚ᩻;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 3

    .line 21
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v0

    const-string v1, "User-Agent"

    iget-object v2, p0, Ll/᩸ۚ᩻;->֫:Ljava/lang/String;

    .line 22
    invoke-virtual {v0, v1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method
