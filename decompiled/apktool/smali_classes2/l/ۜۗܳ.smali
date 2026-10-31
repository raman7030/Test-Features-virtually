.class public final synthetic Ll/ۜۗܳ;
.super Ljava/lang/Object;
.source "8AJ9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/CheckBox;

.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:Ll/᩷ۗܳ;

.field public final synthetic ᩹:[Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ۗܳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۗܳ;->᩸:Ll/᩷ۗܳ;

    iput-object p2, p0, Ll/ۜۗܳ;->᩹:[Landroid/widget/RadioButton;

    iput-object p3, p0, Ll/ۜۗܳ;->᩶:Landroid/widget/CheckBox;

    iput-object p4, p0, Ll/ۜۗܳ;->ۙ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ۜۗܳ;->᩶:Landroid/widget/CheckBox;

    iget-object p2, p0, Ll/ۜۗܳ;->ۙ:Landroid/widget/CheckBox;

    iget-object v0, p0, Ll/ۜۗܳ;->᩸:Ll/᩷ۗܳ;

    iget-object v1, p0, Ll/ۜۗܳ;->᩹:[Landroid/widget/RadioButton;

    invoke-static {v0, v1, p1, p2}, Ll/᩷ۗܳ;->֫(Ll/᩷ۗܳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V

    return-void
.end method
