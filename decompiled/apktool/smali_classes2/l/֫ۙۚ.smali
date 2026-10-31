.class public final Ll/֫ۙۚ;
.super Ll/ۘ᩶ۚ;
.source "09BJ"


# instance fields
.field public final ܽ:Ll/ܳۙۚ;


# direct methods
.method public constructor <init>(ILl/ۘ᩶ۚ;Ll/ܳۙۚ;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Ll/ۘ᩶ۚ;-><init>(ILl/ۘ᩶ۚ;)V

    .line 67
    iput-object p3, p0, Ll/֫ۙۚ;->ܽ:Ll/ܳۙۚ;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 83
    iget-object v0, p0, Ll/֫ۙۚ;->ܽ:Ll/ܳۙۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-super {p0, p1, p2, v1, p4}, Ll/ۘ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 112
    :cond_0
    new-instance p4, Ll/ܰ᩶ۚ;

    iget v1, p0, Ll/ۘ᩶ۚ;->֫:I

    invoke-direct {p4, v1, p3, p1, v0}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 99
    new-instance p3, Ll/ܰ᩶ۚ;

    invoke-direct {p3, v1, p2, p1, v0}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 113
    invoke-virtual {p4, p3}, Ll/ܰ᩶ۚ;->֫(Ll/ܰ᩶ۚ;)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 4

    .line 73
    iget-object v0, p0, Ll/֫ۙۚ;->ܽ:Ll/ܳۙۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-super {p0, v1, p2}, Ll/ۘ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p2

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    .line 112
    :cond_0
    new-instance v2, Ll/ܰ᩶ۚ;

    iget v3, p0, Ll/ۘ᩶ۚ;->֫:I

    invoke-direct {v2, v3, p1, p2, v0}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 99
    new-instance p1, Ll/ܰ᩶ۚ;

    invoke-direct {p1, v3, v1, p2, v0}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 113
    invoke-virtual {v2, p1}, Ll/ܰ᩶ۚ;->֫(Ll/ܰ᩶ۚ;)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1
.end method
