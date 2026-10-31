.class public final synthetic Ll/ܳۚܳ;
.super Ljava/lang/Object;
.source "C12B"

# interfaces
.implements Ll/۟ۜܳ;
.implements Ll/ۖۗܿ;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܳۚܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܳۚܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܳۚܳ;->᩶:Ljava/lang/Object;

    iput-object p4, p0, Ll/ܳۚܳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۤۢܳ;)V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/ܳۚܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܺۚܳ;

    iget-object v1, p0, Ll/ܳۚܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ۤۢܳ;

    iget-object v2, p0, Ll/ܳۚܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ۖۢܳ;

    iget-object v3, p0, Ll/ܳۚܳ;->ۙ:Ljava/lang/Object;

    check-cast v3, Ll/ܽۢܳ;

    invoke-static {v0, v1, v2, v3, p1}, Ll/ܺۚܳ;->֫(Ll/ܺۚܳ;Ll/ۤۢܳ;Ll/ۖۢܳ;Ll/ܽۢܳ;Ll/ۤۢܳ;)V

    return-void
.end method

.method public ۧ(I)V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ܳۚܳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۨ᩹᩷;

    .line 6
    iget-object v1, p0, Ll/ܳۚܳ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Landroid/widget/ImageView;

    .line 10
    iget-object v2, p0, Ll/ܳۚܳ;->᩶:Ljava/lang/Object;

    .line 12
    check-cast v2, Ll/ܳ᩶᩷;

    .line 14
    iget-object v3, p0, Ll/ܳۚܳ;->ۙ:Ljava/lang/Object;

    .line 16
    check-cast v3, Ll/᩸֡ᩴ;

    .line 118
    sget-object v4, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    .line 37
    iput p1, v0, Ll/ۨ᩹᩷;->֫:I

    .line 38
    iput-object v4, v0, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    .line 119
    invoke-interface {v2, v0}, Ll/ܳ᩶᩷;->ۧ(Ll/ۨ᩹᩷;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 120
    invoke-virtual {v3}, Ll/᩸֡ᩴ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {v3}, Ll/᩸֡ᩴ;->ܳ()V

    .line 122
    invoke-virtual {v3}, Ll/᩸֡ᩴ;->ܽ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۚۢ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Z)V

    :cond_0
    return-void
.end method
