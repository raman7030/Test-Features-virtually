.class public final synthetic Ll/ۜۜܳ;
.super Ljava/lang/Object;
.source "C76R"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Landroid/widget/CheckBox;

.field public final synthetic ۙ:I

.field public final synthetic ᩶:[I

.field public final synthetic ᩸:Ll/ۚۜܳ;

.field public final synthetic ᩹:Ll/ۚۖۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۜܳ;Ll/ۚۖۡ;[IILandroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۜܳ;->᩸:Ll/ۚۜܳ;

    iput-object p2, p0, Ll/ۜۜܳ;->᩹:Ll/ۚۖۡ;

    iput-object p3, p0, Ll/ۜۜܳ;->᩶:[I

    iput p4, p0, Ll/ۜۜܳ;->ۙ:I

    iput-object p5, p0, Ll/ۜۜܳ;->ۗ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget p1, p0, Ll/ۜۜܳ;->ۙ:I

    iget-object p2, p0, Ll/ۜۜܳ;->ۗ:Landroid/widget/CheckBox;

    iget-object v0, p0, Ll/ۜۜܳ;->᩸:Ll/ۚۜܳ;

    iget-object v1, p0, Ll/ۜۜܳ;->᩹:Ll/ۚۖۡ;

    iget-object v2, p0, Ll/ۜۜܳ;->᩶:[I

    invoke-static {v0, v1, v2, p1, p2}, Ll/ۚۜܳ;->֫(Ll/ۚۜܳ;Ll/ۚۖۡ;[IILandroid/widget/CheckBox;)V

    return-void
.end method
