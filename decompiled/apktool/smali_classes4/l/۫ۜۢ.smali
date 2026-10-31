.class public final Ll/۫ۜۢ;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ll/ۙۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/ۤۜۢ;


# direct methods
.method public constructor <init>(Ll/ۤۜۢ;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 153
    iget-object v0, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v0, v0, Ll/ۤۜۢ;->ܳ:Ll/᩺ۤܿ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f120202

    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 1

    .line 158
    iget-object v0, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v0, v0, Ll/ۤۜۢ;->᩻:Ll/ܳ᩷ۢ;

    invoke-static {v0, p1}, Ll/ܳ᩷ۢ;->֫(Ll/ܳ᩷ۢ;Ll/֨ۛ᩷;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 138
    iget-object v0, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v0, v0, Ll/ۤۜۢ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 148
    iget-object v0, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v0, v0, Ll/ۤۜۢ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܽ()Ll/ܿۛ᩷;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v0, v0, Ll/ۤۜۢ;->ۜ:Ll/ܿۛ᩷;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 167
    new-instance v0, Ll/ۤۛ᩷;

    iget-object v1, p0, Ll/۫ۜۢ;->֫:Ll/ۤۜۢ;

    iget-object v1, v1, Ll/ۤۜۢ;->ۜ:Ll/ܿۛ᩷;

    invoke-direct {v0, v1}, Ll/ۤۛ᩷;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Ll/ۤۛ᩷;->֫()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const v0, 0x7f120903

    .line 172
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method
