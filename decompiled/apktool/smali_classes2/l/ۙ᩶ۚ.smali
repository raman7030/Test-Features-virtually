.class public abstract Ll/ۙ᩶ۚ;
.super Ljava/lang/Object;
.source "J7T3"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ۙ᩶ۚ;


# direct methods
.method public constructor <init>(ILl/ۙ᩶ۚ;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x90000

    const/high16 v1, 0x10a0000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x80000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x70000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x60000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x50000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x40000

    if-eq p1, v0, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported api "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 79
    invoke-static {p0}, Ll/ۢ᩶ۚ;->֫(Ljava/lang/Object;)V

    .line 81
    :cond_2
    iput p1, p0, Ll/ۙ᩶ۚ;->֫:I

    .line 82
    iput-object p2, p0, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    return-void
.end method


# virtual methods
.method public ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۙ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {v0, p1, p2}, Ll/ۙ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫()V
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {v0}, Ll/ۙ᩶ۚ;->֫()V

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v0, p1}, Ll/ۙ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    :cond_0
    return-void
.end method
