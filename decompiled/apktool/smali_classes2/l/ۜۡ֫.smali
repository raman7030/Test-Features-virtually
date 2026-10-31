.class public final Ll/ۜۡ֫;
.super Ljava/lang/Object;
.source "H4Y9"


# instance fields
.field public ֫:Ll/ܿۡ֫;

.field public ۧ:Ll/ܰۢ֫;


# direct methods
.method public constructor <init>(Ll/ܳۡ֫;Ll/ܰۢ֫;)V
    .locals 1

    const-string v0, "initialState"

    .line 5
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-static {p1}, Ll/ܺۡ֫;->֫(Ll/ܳۡ֫;)Ll/ܿۡ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۡ֫;->֫:Ll/ܿۡ֫;

    .line 308
    iput-object p2, p0, Ll/ۜۡ֫;->ۧ:Ll/ܰۢ֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܰۢ֫;
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ۜۡ֫;->ۧ:Ll/ܰۢ֫;

    return-object v0
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 3

    .line 312
    invoke-virtual {p2}, Ll/᩺ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    .line 313
    iget-object v1, p0, Ll/ۜۡ֫;->ۧ:Ll/ܰۢ֫;

    const-string v2, "state1"

    .line 0
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    move-object v1, v0

    .line 313
    :cond_0
    iput-object v1, p0, Ll/ۜۡ֫;->ۧ:Ll/ܰۢ֫;

    .line 314
    iget-object v1, p0, Ll/ۜۡ֫;->֫:Ll/ܿۡ֫;

    invoke-interface {v1, p1, p2}, Ll/ܿۡ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V

    .line 315
    iput-object v0, p0, Ll/ۜۡ֫;->ۧ:Ll/ܰۢ֫;

    return-void
.end method
