.class public final Ll/ۙ᩹ۘ;
.super Ljava/lang/Object;
.source "QABT"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    iput-object p1, p0, Ll/ۙ᩹ۘ;->ۧ:Ljava/lang/String;

    .line 199
    iput-object p2, p0, Ll/ۙ᩹ۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 3

    .line 205
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v0

    .line 206
    sget v1, Ll/ܳ᩶ۘ;->֫:I

    .line 252
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 206
    iget-object v1, p0, Ll/ۙ᩹ۘ;->ۧ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۙ᩹ۘ;->֫:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    invoke-virtual {v0, v2, v1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 208
    invoke-virtual {p1, v0}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method
