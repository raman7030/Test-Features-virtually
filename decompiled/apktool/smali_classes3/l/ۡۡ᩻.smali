.class public final Ll/ۡۡ᩻;
.super Ll/ۤۜܳ;
.source "TAIM"


# instance fields
.field public final synthetic ᩳ:Ll/ۚۡ᩻;


# direct methods
.method public constructor <init>(Ll/ۚۡ᩻;)V
    .locals 1

    .line 667
    iput-object p1, p0, Ll/ۡۡ᩻;->ᩳ:Ll/ۚۡ᩻;

    const p1, 0x7f120604

    const v0, 0x7f08023c

    invoke-direct {p0, p1, v0}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 1

    .line 670
    iget-object p1, p0, Ll/ۡۡ᩻;->ᩳ:Ll/ۚۡ᩻;

    invoke-static {p1}, Ll/ۚۡ᩻;->֫(Ll/ۚۡ᩻;)I

    move-result v0

    invoke-static {v0}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 672
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    .line 317
    iput-object p1, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 673
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    const p1, 0x7f1206be

    .line 674
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const p1, 0x7f1206c7

    .line 676
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 682
    iget-object v0, p0, Ll/ۡۡ᩻;->ᩳ:Ll/ۚۡ᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    return v0
.end method
