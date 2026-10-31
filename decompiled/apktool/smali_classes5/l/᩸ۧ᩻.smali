.class public final Ll/᩸ۧ᩻;
.super Ll/ۤۜܳ;
.source "22BV"


# instance fields
.field public final synthetic ᩳ:Ll/ܽܽ᩻;


# direct methods
.method public constructor <init>(Ll/ܽܽ᩻;)V
    .locals 1

    .line 1019
    iput-object p1, p0, Ll/᩸ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    const p1, 0x7f12011b

    const v0, 0x7f080239

    invoke-direct {p0, p1, v0}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 2

    .line 1024
    iget-object v0, p0, Ll/᩸ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    invoke-virtual {p0}, Ll/ۤۜܳ;->ܽ()I

    move-result v1

    invoke-static {v0, p1, v1}, Ll/ܽܽ᩻;->ۧ(Ll/ܽܽ᩻;Ll/ܽۢܳ;I)V

    return-void
.end method

.method public final ܳ()Z
    .locals 3

    .line 1029
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    invoke-static {}, Ll/ۧܶܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ll/ܿ֡ܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1032
    :cond_0
    iget-object v0, p0, Ll/᩸ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 0
    instance-of v1, v0, Ll/۬۠ܿ;

    if-eqz v1, :cond_3

    .line 1034
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬۠ܿ;->ۗۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android/data"

    .line 1035
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Android/obb"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_1
    return v2
.end method
