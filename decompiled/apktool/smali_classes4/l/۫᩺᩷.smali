.class public final Ll/۫᩺᩷;
.super Ljava/lang/Object;
.source "W1F3"

# interfaces
.implements Ll/᩸ۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/ۛ᩺᩷;

.field public final synthetic ۧ:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/ۛ᩺᩷;Ll/᩺ۤܿ;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩺᩷;->֫:Ll/ۛ᩺᩷;

    iput-object p2, p0, Ll/۫᩺᩷;->ۧ:Ll/᩺ۤܿ;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 6

    .line 176
    iget-object v0, p0, Ll/۫᩺᩷;->֫:Ll/ۛ᩺᩷;

    invoke-static {v0}, Ll/ۛ᩺᩷;->֫(Ll/ۛ᩺᩷;)Ll/ܿۛ᩷;

    move-result-object v1

    invoke-static {v0}, Ll/ۛ᩺᩷;->֫(Ll/ۛ᩺᩷;)Ll/ܿۛ᩷;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object p1, v4, v3

    const p1, 0x7f1200f8

    invoke-virtual {v2, p1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f120491

    .line 425
    invoke-virtual {v1, v2, p1, v5}, Ll/ۗܺ᩷;->֫(ILjava/lang/String;Z)V

    if-lez p2, :cond_0

    .line 178
    new-instance p1, Ll/ۙܺ֫;

    invoke-static {v0}, Ll/ۛ᩺᩷;->֫(Ll/ۛ᩺᩷;)Ll/ܿۛ᩷;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class p2, Ll/ۘۛ᩷;

    invoke-virtual {p1, p2}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/ۘۛ᩷;

    invoke-virtual {p1}, Ll/ۘۛ᩷;->ۖ()V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 161
    iget-object v0, p0, Ll/۫᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/۫᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 171
    iget-object v0, p0, Ll/۫᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܽ()Ll/ܿۛ᩷;
    .locals 1

    .line 166
    iget-object v0, p0, Ll/۫᩺᩷;->֫:Ll/ۛ᩺᩷;

    invoke-static {v0}, Ll/ۛ᩺᩷;->֫(Ll/ۛ᩺᩷;)Ll/ܿۛ᩷;

    move-result-object v0

    return-object v0
.end method
