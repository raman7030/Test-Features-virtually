.class public final Ll/ۚۘܳ;
.super Ljava/lang/Object;
.source "D14B"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:Ll/᩶ۖܳ;

.field public final ۙ:Ll/᩹ۘܳ;

.field public final ᩶:I

.field public final ᩸:Ll/ᩳۜܳ;

.field public final ᩹:Ll/ܽᩴܳ;


# direct methods
.method public constructor <init>(Ll/ܽᩴܳ;Ll/ᩳۜܳ;ILl/᩶ۖܳ;Ll/᩹ۘܳ;)V
    .locals 0

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p1, p0, Ll/ۚۘܳ;->᩹:Ll/ܽᩴܳ;

    .line 166
    iput-object p2, p0, Ll/ۚۘܳ;->᩸:Ll/ᩳۜܳ;

    .line 167
    iput p3, p0, Ll/ۚۘܳ;->᩶:I

    .line 168
    iput-object p4, p0, Ll/ۚۘܳ;->ۗ:Ll/᩶ۖܳ;

    .line 169
    iput-object p5, p0, Ll/ۚۘܳ;->ۙ:Ll/᩹ۘܳ;

    return-void
.end method

.method public static ֫(Ll/ۚۘܳ;Ll/ۨܺ᩷;)V
    .locals 2

    .line 184
    iget-object v0, p0, Ll/ۚۘܳ;->᩹:Ll/ܽᩴܳ;

    iget-object v1, p0, Ll/ۚۘܳ;->ۙ:Ll/᩹ۘܳ;

    iget-object p0, p0, Ll/ۚۘܳ;->ۗ:Ll/᩶ۖܳ;

    invoke-static {v0, v1, p0, p1}, Ll/᩶ۘܳ;->֫(Ll/ܽᩴܳ;Ll/᩹ۘܳ;Ll/᩶ۖܳ;Ll/ۨܺ᩷;)Ll/ۤܺ᩷;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 185
    invoke-virtual {v1}, Ll/᩹ۘܳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p0, p1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    const/4 p1, 0x0

    .line 187
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 175
    :try_start_0
    sget-object v0, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    iget-object v1, p0, Ll/ۚۘܳ;->᩸:Ll/ᩳۜܳ;

    iget v2, p0, Ll/ۚۘܳ;->᩶:I

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Ll/᩷ۧ᩻;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object v0

    .line 176
    new-instance v1, Ll/֡ۘܳ;

    invoke-direct {v1, p0, v0}, Ll/֡ۘܳ;-><init>(Ll/ۚۘܳ;Ll/ۨܺ᩷;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 179
    :catch_0
    iget-object v0, p0, Ll/ۚۘܳ;->᩹:Ll/ܽᩴܳ;

    iget-object v1, p0, Ll/ۚۘܳ;->ۙ:Ll/᩹ۘܳ;

    invoke-static {v0, v1}, Ll/᩶ۘܳ;->֫(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)V

    return-void
.end method
