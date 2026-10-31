.class public final Ll/ۙۨ᩷;
.super Ljava/lang/Object;
.source "V1EH"


# instance fields
.field public ֫:Ll/ܶ᩵ܿ;

.field public ۜ:I

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ܶ᩵ܿ;

.field public ᩳ:I

.field public ᩻:Ll/᩵ۘܽ;


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 608
    iget-object v0, p0, Ll/ۙۨ᩷;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 2

    .line 620
    iget-object v0, p0, Ll/ۙۨ᩷;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 621
    invoke-static {p1, v0}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    return-void

    .line 623
    :cond_0
    iget-object v0, p0, Ll/ۙۨ᩷;->ܿ:Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    .line 683
    invoke-virtual {v0, p1, v1}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V

    return-void
.end method
