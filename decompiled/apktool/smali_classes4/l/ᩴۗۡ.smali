.class public final Ll/ᩴۗۡ;
.super Ljava/lang/Object;
.source "R1V9"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final ֫(Ljava/lang/String;Z)V
    .locals 2

    .line 191
    iget v0, p0, Ll/ᩴۗۡ;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 194
    iget-object v0, p0, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 196
    iget p2, p0, Ll/ᩴۗۡ;->ۧ:I

    .line 0
    invoke-static {p2, v0, p1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 196
    iput-object p1, p0, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    goto :goto_0

    .line 198
    :cond_0
    iput-object p1, p0, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    .line 199
    :goto_0
    iput v1, p0, Ll/ᩴۗۡ;->ۧ:I

    iput v1, p0, Ll/ᩴۗۡ;->֫:I

    return-void

    .line 192
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
