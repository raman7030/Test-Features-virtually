.class public final Ll/ܶ᩹ۘ;
.super Ljava/lang/Object;
.source "6A8E"

# interfaces
.implements Ll/۬᩺᩵;


# instance fields
.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/ܶ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Ll/ܶ᩹ۘ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴ۟᩵;)Ll/ۡ۟᩵;
    .locals 3

    .line 26
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v0

    const-string v1, "Authorization"

    invoke-virtual {v0, v1}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 32
    :cond_0
    sget v0, Ll/ܳ᩶ۘ;->֫:I

    .line 252
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 32
    iget-object v0, p0, Ll/ܶ᩹ۘ;->ܽ:Ljava/lang/String;

    iget-object v2, p0, Ll/ܶ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v2}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object p1

    .line 34
    invoke-virtual {p1, v1, v0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1
.end method
