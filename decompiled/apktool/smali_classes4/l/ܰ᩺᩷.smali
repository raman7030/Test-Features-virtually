.class public final Ll/ܰ᩺᩷;
.super Ljava/lang/Object;
.source "F1E5"

# interfaces
.implements Ll/ۙۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/۟᩺᩷;

.field public final synthetic ۧ:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/۟᩺᩷;Ll/᩺ۤܿ;)V
    .locals 0

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩺᩷;->֫:Ll/۟᩺᩷;

    iput-object p2, p0, Ll/ܰ᩺᩷;->ۧ:Ll/᩺ۤܿ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 286
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f120202

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܰ᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 2

    .line 291
    iget-object v0, p0, Ll/ܰ᩺᩷;->֫:Ll/۟᩺᩷;

    invoke-static {v0}, Ll/۟᩺᩷;->ᩳ(Ll/۟᩺᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-static {v0}, Ll/۟᩺᩷;->ܽ(Ll/۟᩺᩷;)Z

    move-result v0

    invoke-virtual {v1, p1, v0}, Ll/ۘۛ᩷;->֫(Ll/֨ۛ᩷;Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ܰ᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 296
    iget-object v0, p0, Ll/ܰ᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ܰ᩺᩷;->ۧ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܽ()Ll/ܿۛ᩷;
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ܰ᩺᩷;->֫:Ll/۟᩺᩷;

    invoke-static {v0}, Ll/۟᩺᩷;->ۧ(Ll/۟᩺᩷;)Ll/ܿۛ᩷;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 301
    new-instance v0, Ll/ۤۛ᩷;

    iget-object v1, p0, Ll/ܰ᩺᩷;->֫:Ll/۟᩺᩷;

    invoke-static {v1}, Ll/۟᩺᩷;->ۧ(Ll/۟᩺᩷;)Ll/ܿۛ᩷;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤۛ᩷;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Ll/ۤۛ᩷;->֫()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const v0, 0x7f120903

    .line 306
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method
