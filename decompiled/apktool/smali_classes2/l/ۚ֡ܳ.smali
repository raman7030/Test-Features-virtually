.class public final synthetic Ll/ۚ֡ܳ;
.super Ljava/lang/Object;
.source "XAJ9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/ܶ֡ܳ;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ֡ܳ;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ֡ܳ;->᩸:Ll/ܶ֡ܳ;

    iput-object p2, p0, Ll/ۚ֡ܳ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ۚ֡ܳ;->᩶:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 486
    iget-object p1, p0, Ll/ۚ֡ܳ;->᩸:Ll/ܶ֡ܳ;

    iget-object v0, p1, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    .line 487
    iget-object v1, p1, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    iput-object v1, p1, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    .line 488
    iput-object v0, p1, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    .line 490
    iget-object v0, p1, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    .line 491
    iget-object v1, p1, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    iput-object v1, p1, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    .line 492
    iput-object v0, p1, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    .line 135
    iget-object p1, p0, Ll/ۚ֡ܳ;->᩹:Landroid/widget/EditText;

    iget-object v2, p0, Ll/ۚ֡ܳ;->᩶:Landroid/widget/EditText;

    invoke-static {v1, v0, p1, v2}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/widget/EditText;Landroid/widget/EditText;)V

    return-void
.end method
