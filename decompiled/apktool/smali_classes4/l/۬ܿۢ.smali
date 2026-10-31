.class public final Ll/۬ܿۢ;
.super Ljava/lang/Object;
.source "I5G5"

# interfaces
.implements Ll/᩸ۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/ۤܿۢ;

.field public final synthetic ۧ:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/ۤܿۢ;Ll/᩺ۤܿ;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܿۢ;->֫:Ll/ۤܿۢ;

    iput-object p2, p0, Ll/۬ܿۢ;->ۧ:Ll/᩺ۤܿ;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 4

    .line 173
    iget-object v0, p0, Ll/۬ܿۢ;->֫:Ll/ۤܿۢ;

    invoke-static {v0}, Ll/ۤܿۢ;->֫(Ll/ۤܿۢ;)Ll/ܿۛ᩷;

    move-result-object v1

    invoke-static {v0}, Ll/ۤܿۢ;->֫(Ll/ۤܿۢ;)Ll/ܿۛ᩷;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const p1, 0x7f120289

    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const p2, 0x7f120491

    .line 425
    invoke-virtual {v1, p2, p1, v3}, Ll/ۗܺ᩷;->֫(ILjava/lang/String;Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 158
    iget-object v0, p0, Ll/۬ܿۢ;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 178
    iget-object v0, p0, Ll/۬ܿۢ;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 168
    iget-object v0, p0, Ll/۬ܿۢ;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܽ()Ll/ܿۛ᩷;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/۬ܿۢ;->֫:Ll/ۤܿۢ;

    invoke-static {v0}, Ll/ۤܿۢ;->֫(Ll/ۤܿۢ;)Ll/ܿۛ᩷;

    move-result-object v0

    return-object v0
.end method
