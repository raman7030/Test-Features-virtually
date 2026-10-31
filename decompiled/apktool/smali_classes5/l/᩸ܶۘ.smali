.class public final Ll/᩸ܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-object p1, p0, Ll/᩸ܶۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 3

    .line 193
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v0

    const-string v1, "User-Agent"

    iget-object v2, p0, Ll/᩸ܶۘ;->֫:Ljava/lang/String;

    .line 195
    invoke-virtual {v0, v1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 197
    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method
