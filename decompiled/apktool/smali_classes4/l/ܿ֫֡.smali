.class public final Ll/ܿ֫֡;
.super Ljava/lang/Object;
.source "A4DV"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ll/ܿ۟᩵;


# direct methods
.method public constructor <init>(Ll/ܿ۟᩵;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ܿ֫֡;->֫:Ll/ܿ۟᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 4

    .line 37
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Ll/۠֫֡;->ۜ()Ll/ܺ֫֡;

    move-result-object v1

    .line 41
    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GET"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 42
    iget-object v3, p0, Ll/ܿ֫֡;->֫:Ll/ܿ۟᩵;

    invoke-virtual {v1, v3, p1, v2}, Ll/ܺ֫֡;->֫(Ll/ܿ۟᩵;Ll/۠֫֡;Z)Ll/᩵֫֡;

    move-result-object v2

    .line 43
    invoke-virtual {v1}, Ll/ܺ֫֡;->ܽ()Ll/᩻֫֡;

    move-result-object v3

    .line 45
    invoke-virtual {p1, v0, v1, v2, v3}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method
