.class public abstract Ll/ۘ᩶ۚ;
.super Ljava/lang/Object;
.source "A5TF"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ۘ᩶ۚ;


# direct methods
.method public constructor <init>(ILl/ۘ᩶ۚ;)V
    .locals 2

    .line 66
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

    .line 74
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported api "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 74
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 77
    invoke-static {p0}, Ll/ۢ᩶ۚ;->֫(Ljava/lang/Object;)V

    .line 79
    :cond_2
    iput p1, p0, Ll/ۘ᩶ۚ;->֫:I

    .line 80
    iput-object p2, p0, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    return-void
.end method


# virtual methods
.method public ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 122
    iget v0, p0, Ll/ۘ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 125
    iget-object v0, p0, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۘ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 123
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {v0, p1, p2}, Ll/ۘ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫()V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0}, Ll/ۘ᩶ۚ;->֫()V

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0, p1}, Ll/ۘ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    :cond_0
    return-void
.end method
